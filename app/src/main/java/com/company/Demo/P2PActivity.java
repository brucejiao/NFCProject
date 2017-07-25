package com.company.Demo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.mm.android.dhproxy.client.DHProxyClient;
import com.nfcproject.R;

public class P2PActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.p2p);

		res =  this.getResources();
		shardPreferences = this.getPreferences(Activity.MODE_WORLD_READABLE);

		m_etServerIp = (EditText)findViewById(R.id.et_p2p_ip);
		m_etServerPort = (EditText)findViewById(R.id.et_p2p_port);
		m_etPassword = (EditText)findViewById(R.id.et_p2p_psswd);
		m_etDevId = (EditText)findViewById(R.id.et_p2p_dev_ip);
		m_etDevPort = (EditText)findViewById(R.id.et_p2p_dev_port);
		m_btConfig = (Button)findViewById(R.id.bt_p2p_config);
		m_cbAutoLogin = (CheckBox)findViewById(R.id.cb_p2p_autologin);

		if (shardPreferences.getBoolean("p2p_isAutoLogin", false)) {
			m_cbAutoLogin.setChecked(true);
		} else {
			m_cbAutoLogin.setChecked(false);
		}
		m_etServerIp.setText(shardPreferences.getString("p2p_ip", "172.23.1.120"));
		m_etServerPort.setText(shardPreferences.getString("p2p_port", "8800"));
		m_etPassword.setText(shardPreferences.getString("p2p_pswd", "www.dahuatech.com"));
		m_etDevId.setText(shardPreferences.getString("p2p_devid", "p2p_deviceID"));
		m_etDevPort.setText(shardPreferences.getString("p2p_devport", "37777"));

		m_btConfig.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String strIp = m_etServerIp.getText().toString();
				String strPort = m_etServerPort.getText().toString();
				String strPassword = m_etPassword.getText().toString();

				// init
				if (!p2pClient.init(strIp, Integer.parseInt(strPort), strPassword)) {
					ToolKits.showMessage(v.getContext(), "init " + res.getString(R.string.info_failed)
							+ ", " + res.getString(R.string.info_check));
					return;
				}

				// check client status
				int nLoopCount = 3;
				while (true) {
					if (3 == p2pClient.status()) {
						break;
					}

					if (--nLoopCount == 0) {
						ToolKits.showMessage(v.getContext(), "status " + res.getString(R.string.info_failed)
								+ ", " + res.getString(R.string.info_check));
						return;
					}

					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				// check device status
				String strDevId = m_etDevId.getText().toString();
				nLoopCount = 5;
				while (true) {
					if (1 == p2pClient.query(strDevId)) {
						break;
					}

					if (--nLoopCount == 0) {
						ToolKits.showMessage(v.getContext(), "query " + res.getString(R.string.info_failed)
								+ ", " + res.getString(R.string.info_check));
						return;
					}

					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				// add port
				String strDevPort = m_etDevPort.getText().toString();
				boolean bAddPortSuccess = false;
				nLoopCount = 3;
				while (!bAddPortSuccess) {
					localPort = 0;
					localPort = p2pClient.addPort(strDevId, Integer.parseInt(strDevPort), localPort);
					if (localPort > 0) {
						int nLoopCountInner = 7;
						while(true) {
							try {
								Thread.sleep(3000);
							} catch (Exception e) {
								e.printStackTrace();
							}

							int nStatus = p2pClient.portStatus(localPort);
							if (1 == nStatus) {
								bAddPortSuccess = true;
								break;
							} else if (2 == nStatus) {
								break;
							}

							if (--nLoopCountInner == 0) {
								ToolKits.showMessage(v.getContext(), "portStatus " + res.getString(R.string.info_failed)
										+ ", " + res.getString(R.string.info_check));
								return;
							}
						}
					}

					if (bAddPortSuccess) {
						break;
					}

					if (--nLoopCount == 0) {
						ToolKits.showMessage(v.getContext(), "addPort " + res.getString(R.string.info_failed)
								+ ", " + res.getString(R.string.info_check));
						return;
					}

					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				SharedPreferences.Editor editor = shardPreferences.edit();
				if (m_cbAutoLogin.isChecked()) {
					editor.putBoolean("p2p_isAutoLogin", true);
					editor.putString("p2p_ip", m_etServerIp.getText().toString());
					editor.putString("p2p_port", m_etServerPort.getText().toString());
					editor.putString("p2p_pswd", m_etPassword.getText().toString());
					editor.putString("p2p_devid", m_etDevId.getText().toString());
					editor.putString("p2p_devport", m_etDevPort.getText().toString());
				} else {
					editor.putBoolean("p2p_isAutoLogin", false);
					editor.putString("p2p_ip", "");
					editor.putString("p2p_port", "");
					editor.putString("p2p_pswd", "");
					editor.putString("p2p_devid", "");
					editor.putString("p2p_devport", "");
				}
				editor.commit();

				jumpToIPActivity();
			}
		});
	}

	@Override
	protected void onDestroy() {
		if (localPort > 0) {
			if (0 != p2pClient.delPort(localPort)) {
				ToolKits.writeLog("delPort " + res.getString(R.string.info_failed));
			}
			localPort = 0;
		}

		if (0 != p2pClient.exit()) {
			ToolKits.writeLog("exit " + res.getString(R.string.info_failed));
		}

		super.onDestroy();
	}

	private void jumpToIPActivity() {
		Intent intent = new Intent();
		intent.setClass(this, TestNetSDKActivity.class);
		startActivityForResult(intent, 2);
	}

	private EditText m_etServerIp;
	private EditText m_etServerPort;
	private EditText m_etPassword;
	private EditText m_etDevId;
	private EditText m_etDevPort;
	private Button m_btConfig;
	private CheckBox m_cbAutoLogin;

	private DHProxyClient p2pClient = new DHProxyClient();
	public static int localPort = 0;

	Resources res;
	private SharedPreferences shardPreferences;
}
