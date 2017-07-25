package com.company.Demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_ALARM_CHANNEL_TYPE;
import com.company.NetSDK.NET_CLIENT_ALARM_CHANNELS_STATE;
import com.nfcproject.R;

import java.util.ArrayList;

public class IntelBrassStateActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intelbrassstate);

		spStateType = (Spinner)findViewById(R.id.sp_intelbrass_state_type);
		ArrayAdapter<String> apData = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , m_strStateType);
		spStateType.setAdapter(apData);

		etStateCount = (EditText)findViewById(R.id.et_intelbrass_state_count);
		tvStateRet = (TextView)findViewById(R.id.tv_intelbrass_state_retcount);
		spStateChn = (Spinner)findViewById(R.id.sp_intelbrass_state_chn);
		cbStateState = (CheckBox)findViewById(R.id.cb_intelbrass_state_state);

		Button btGet = (Button)findViewById(R.id.bt_intelbrass_state_get);
		btGet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				nStateType = spStateType.getSelectedItemPosition() + 1;
				String strCount = etStateCount.getText().toString();
				if (strCount.equals("")) {
					ToolKits.showMessage(v.getContext(), "Input count is null");
					return;
				}

				int nCount = Integer.parseInt(strCount);
				if (nCount <= 0) {
					ToolKits.showMessage(v.getContext(), "Input count should > 0");
					return;
				}

				stChnState = new NET_CLIENT_ALARM_CHANNELS_STATE();

				stChnState.emType = NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_ALL; // spStateType.getSelectedItemPosition()
				stChnState.nAlarmInCount = nCount;
				stChnState.pbAlarmInState = new boolean[nCount];
				stChnState.nAlarmOutCount = nCount;
				stChnState.pbAlarmOutState = new boolean[nCount];
				stChnState.nAlarmBellCount = nCount;
				stChnState.pbAlarmBellState = new boolean[nCount];
				stChnState.nExAlarmInCount = nCount;
				stChnState.pbExAlarmInState = new boolean[nCount];
				stChnState.pnExAlarmInDestionation = new int[nCount];
				stChnState.nExAlarmOutCount = nCount;
				stChnState.pbExAlarmOutState = new boolean[nCount];
				stChnState.pnExAlarmOutDestionation = new int[nCount];

				boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
						FinalVar.SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE, stChnState, 5000);
				if (!zRet) {
					ToolKits.showErrorMessage(v.getContext(), "QueryDevState SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE failed");
					return;
				}

				int nRetCount = 0;
				switch (nStateType) {
					case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_ALARMIN:
						tvStateRet.setText("" + stChnState.nAlarmInRetCount);
						nRetCount = stChnState.nAlarmInRetCount < stChnState.nAlarmInCount ? stChnState.nAlarmInRetCount : stChnState.nAlarmInCount;
						break;
					case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_ALARMOUT:
						tvStateRet.setText("" + stChnState.nAlarmOutRetCount);
						nRetCount = stChnState.nAlarmOutRetCount < stChnState.nAlarmOutCount ? stChnState.nAlarmOutRetCount : stChnState.nAlarmOutCount;
						break;
					case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_ALARMBELL:
						tvStateRet.setText("" + stChnState.nAlarmBellRetCount);
						nRetCount = stChnState.nAlarmBellRetCount < stChnState.nAlarmBellCount ? stChnState.nAlarmBellRetCount : stChnState.nAlarmBellCount;
						break;
					case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_EXALARMIN:
						tvStateRet.setText("" + stChnState.nExAlarmInRetCount);
						nRetCount = stChnState.nExAlarmInRetCount < stChnState.nExAlarmInCount ? stChnState.nExAlarmInRetCount : stChnState.nExAlarmInCount;
						break;
					case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_EXALARMOUT:
						tvStateRet.setText("" + stChnState.nExAlarmOutRetCount);
						nRetCount = stChnState.nExAlarmOutRetCount < stChnState.nExAlarmOutCount ? stChnState.nExAlarmOutRetCount : stChnState.nExAlarmOutCount;
						break;
					default:
						return;
				}

				cbStateState.setChecked(false);

				ArrayList<String> alData = new ArrayList<String>();
				for (int i = 0; i < nRetCount; i++) {
					alData.add("Channel " + (i + 1));
				}
				ArrayAdapter<String> apData = new ArrayAdapter<String>(v.getContext() , android.R.layout.simple_spinner_dropdown_item , alData);
				spStateChn.setAdapter(apData);
				spStateChn.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
					@Override
					public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
						switch (nStateType) {
							case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_ALARMIN:
								cbStateState.setChecked(stChnState.pbAlarmInState[position]);
								break;
							case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_ALARMOUT:
								cbStateState.setChecked(stChnState.pbAlarmOutState[position]);
								break;
							case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_ALARMBELL:
								cbStateState.setChecked(stChnState.pbAlarmBellState[position]);
								break;
							case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_EXALARMIN:
								cbStateState.setChecked(stChnState.pbExAlarmInState[position]);
								break;
							case NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_EXALARMOUT:
								cbStateState.setChecked(stChnState.pbExAlarmOutState[position]);
								break;
							default:
								return;
						}
					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {

					}
				});
			}
		});
	}

	private Spinner spStateType;
	private static final String[] m_strStateType = {/*"All", */"Alarm in", "Alarm out", "Alarm bell", "Ext Alarm in", "Ext Alarm out"};
	private EditText etStateCount;
	private TextView tvStateRet;
	private Spinner spStateChn;
	private CheckBox cbStateState;
	private NET_CLIENT_ALARM_CHANNELS_STATE stChnState;
	private int nStateType;
}
