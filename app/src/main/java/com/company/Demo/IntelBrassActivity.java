package com.company.Demo;

import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;

import com.company.NetSDK.ALARMCTRL_PARAM;
import com.company.NetSDK.ALARM_BATTERYPOWER_INFO;
import com.company.NetSDK.ALARM_BELLSTATUS_INFO;
import com.company.NetSDK.ALARM_CIDEVENT_INFO;
import com.company.NetSDK.ALARM_DEFENCE_STATUS_CHANGE_INFO;
import com.company.NetSDK.CB_fMessageCallBack;
import com.company.NetSDK.CtrlType;
import com.company.NetSDK.EM_ALARM_FAULT_STATE_TYPE;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_ALARM_FAULT_STATE;
import com.company.NetSDK.NET_ALARM_SUBSYSTEM_STATE;
import com.company.NetSDK.NET_ARM_MODE_INFO;
import com.company.NetSDK.NET_CTRL_ALARMBELL;
import com.company.NetSDK.NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE;
import com.company.NetSDK.NET_DEFENCE_STATE_INFO;
import com.company.NetSDK.NET_OUT_ALARM_FAULT_STATE;
import com.company.NetSDK.NET_POWER_STATUS;
import com.nfcproject.R;

import java.util.ArrayList;
import java.util.List;

public class IntelBrassActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		res = this.getResources();
		arrayData = getData();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayData);
		setListAdapter(adapter);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch (position) {
			case 0:
				jumpToArmedActivity();
				break;
			case 1:
				jumpToSubsystemActivity();
				break;
			case 2:
				jumpToBypassActivity();
				break;
			case 3:
				jumpToPgmActivity();
				break;
			case 4:
				jumpToBellActivity();
				break;
			case 5:
				jumpToCidActivity();
				break;
			case 6:
				jumpToIntelBrassStateActivity();
				break;
			case 7:
				jumpToIntelBrasssArmModeActiviy();
				break;
			case 8:
				jumpToManyStateActivity();
				break;

			default:
				break;
		}

		super.onListItemClick(l, v, position, id);
	}

	private List<String> getData() {
		List<String> data = new ArrayList<String>();
		data.add(res.getString(R.string.intelbrass_armed));
		data.add(res.getString(R.string.intelbrass_subsystem));
		data.add(res.getString(R.string.intelbrass_bypass));
		data.add(res.getString(R.string.intelbrass_pgm));
		data.add(res.getString(R.string.intelbrass_bell));
		data.add(res.getString(R.string.intelbrass_cid));
		data.add(res.getString(R.string.intelbrass_state));
		data.add(res.getString(R.string.intelbrass_arm_mode));
		data.add(res.getString(R.string.intelbrass_many_state));

		return data;
	}

	private void jumpToArmedActivity() {
		Intent intent = new Intent();
		intent.setClass(this, IntelBrassArmedActivity.class);
		startActivityForResult(intent, 2);
	}

	private void jumpToSubsystemActivity() {
		if (null == m_layoutSubsystem) {
			m_layoutSubsystem = View.inflate(this, R.layout.subsystemview, null);
			m_popSubsystem = new PopupWindow(m_layoutSubsystem, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (null != m_popCur) {
			if (m_cidListen) {
				INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
				m_cidListen = false;
				m_btListen.setText(R.string.intelbrass_cid_start);
			}
			m_popCur.dismiss();
			if (m_popCur == m_popSubsystem) {
				m_popCur = null;
				return;
			}
		}
		m_popSubsystem.showAtLocation(this.getListView(), Gravity.CENTER, 0, 0);
		m_popCur = m_popSubsystem;

		spChn = (Spinner)m_layoutSubsystem.findViewById(R.id.sp_intelbrass_subsystem_chn);
		ArrayAdapter<String> apData = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , m_strSubsystemChn);
		spChn.setAdapter(apData);

		cbActive = (CheckBox)m_layoutSubsystem.findViewById(R.id.cb_intelbrass_subsystem_active);

		Button btSet = (Button)m_layoutSubsystem.findViewById(R.id.bt_intelbrass_subsystem_set);
		btSet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE stSubsystem = new NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE();
				stSubsystem.nChannelId = spChn.getSelectedItemPosition();
				stSubsystem.bActive = cbActive.isChecked();
				boolean zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET, stSubsystem, 5000);
				if (zRet) {
					ToolKits.showMessage(v.getContext(), "ControlDevice SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET success");
				} else {
					ToolKits.showErrorMessage(v.getContext(), "ControlDevice SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET failed");
				}
			}
		});

		Button btRet = (Button)m_layoutSubsystem.findViewById(R.id.bt_intelbrass_subsystem_ret);
		btRet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				m_popCur.dismiss();
				m_popCur = null;
			}
		});
	}

	private void jumpToBypassActivity() {
		Intent intent = new Intent();
		intent.setClass(this, IntelBrassBypassActivity.class);
		startActivityForResult(intent, 2);
	}

	private void jumpToPgmActivity() {
		if (null == m_layoutPgm) {
			m_layoutPgm = View.inflate(this, R.layout.pgmview, null);
			m_popPgm = new PopupWindow(m_layoutPgm, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (null != m_popCur) {
			if (m_cidListen) {
				INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
				m_cidListen = false;
				m_btListen.setText(R.string.intelbrass_cid_start);
			}
			m_popCur.dismiss();
			if (m_popCur == m_popPgm) {
				m_popCur = null;
				return;
			}
		}
		m_popPgm.showAtLocation(this.getListView(), Gravity.CENTER, 0, 0);
		m_popCur = m_popPgm;

		spPgmChn = (Spinner)m_layoutPgm.findViewById(R.id.sp_intelbrass_pgm_chn);
		ArrayAdapter<String> apData = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , m_strPgmChn);
		spPgmChn.setAdapter(apData);

		cbPgmActive = (CheckBox)m_layoutPgm.findViewById(R.id.cb_intelbrass_pgm_trigger);

		Button btSet = (Button)m_layoutPgm.findViewById(R.id.bt_intelbrass_pgm_set);
		btSet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ALARMCTRL_PARAM stOut = new ALARMCTRL_PARAM();
				stOut.nAlarmNo = spPgmChn.getSelectedItemPosition();
				stOut.nAction = cbPgmActive.isChecked() ? 1 : 0;
				boolean zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_TRIGGER_ALARM_OUT, stOut, 3000);
				if (!zRet) {
					ToolKits.showErrorMessage(v.getContext(), "ControlDevice SDK_TRIGGER_ALARM_OUT failed");
				} else {
					ToolKits.showMessage(v.getContext(), "ControlDevice SDK_TRIGGER_ALARM_OUT success");
				}
			}
		});

		Button btRet = (Button)m_layoutPgm.findViewById(R.id.bt_intelbrass_pgm_ret);
		btRet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				m_popCur.dismiss();
				m_popCur = null;
			}
		});
	}

	private void jumpToBellActivity() {
		if (null == m_layoutBell) {
			m_layoutBell = View.inflate(this, R.layout.bellview, null);
			m_popBell = new PopupWindow(m_layoutBell, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (null != m_popCur) {
			if (m_cidListen) {
				INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
				m_cidListen = false;
				m_btListen.setText(R.string.intelbrass_cid_start);
			}
			m_popCur.dismiss();
			if (m_popCur == m_popBell) {
				m_popCur = null;
				return;
			}
		}
		m_popBell.showAtLocation(this.getListView(), Gravity.CENTER, 0, 0);
		m_popCur = m_popBell;

		spBellChn = (Spinner)m_layoutBell.findViewById(R.id.sp_intelbrass_bell_chn);
		ArrayAdapter<String> apData = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , m_strBellChn);
		spBellChn.setAdapter(apData);

		cbBellActive = (CheckBox)m_layoutBell.findViewById(R.id.cb_intelbrass_bell_active);

		Button btSilentSet = (Button)m_layoutBell.findViewById(R.id.bt_intelbrass_silent_bell_set);
		btSilentSet.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				boolean zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_SILENT_ALARM_SET, null, 3000);
				if (!zRet) {
					ToolKits.showErrorMessage(v.getContext(), "ControlDevice SDK_CTRL_SILENT_ALARM_SET failed");
				} else {
					ToolKits.showMessage(v.getContext(), "ControlDevice SDK_CTRL_SILENT_ALARM_SET success");
				}

			}

		});

		Button btSet = (Button)m_layoutBell.findViewById(R.id.bt_intelbrass_bell_set);
		btSet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				NET_CTRL_ALARMBELL stBell = new NET_CTRL_ALARMBELL();
				stBell.nChannelID = 0;
				if (cbBellActive.isChecked()) {
					boolean zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_START_ALARMBELL, stBell, 3000);
					if (!zRet) {
						ToolKits.showErrorMessage(v.getContext(), "ControlDevice SDK_CTRL_START_ALARMBELL failed");
					} else {
						ToolKits.showMessage(v.getContext(), "ControlDevice SDK_CTRL_START_ALARMBELL success");
					}
				} else {
					boolean zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_STOP_ALARMBELL, stBell, 3000);
					if (!zRet) {
						ToolKits.showErrorMessage(v.getContext(), "ControlDevice SDK_CTRL_STOP_ALARMBELL failed");
					} else {
						ToolKits.showMessage(v.getContext(), "ControlDevice SDK_CTRL_STOP_ALARMBELL success");
					}
				}
			}
		});

		Button btRet = (Button)m_layoutBell.findViewById(R.id.bt_intelbrass_bell_ret);
		btRet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				m_popCur.dismiss();
				m_popCur = null;
			}
		});
	}

	private void jumpToCidActivity() {
		if (null == m_layoutCid) {
			m_layoutCid = View.inflate(this, R.layout.cideventview, null);
			m_popCid = new PopupWindow(m_layoutCid, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (null != m_popCur) {
			if (m_cidListen) {
				INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
				m_cidListen = false;
				m_btListen.setText(R.string.intelbrass_cid_start);
			}
			m_popCur.dismiss();
			if (m_popCur == m_popCid) {
				m_popCur = null;
				return;
			}
		}
		m_popCid.showAtLocation(this.getListView(), Gravity.CENTER, 0, 0);
		m_popCur = m_popCid;

		m_tvShow = (TextView)m_layoutCid.findViewById(R.id.tv_intelbrass_cid_count);

		m_btListen = (Button)m_layoutCid.findViewById(R.id.bt_intelbrass_cid_start);
		m_btListen.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (m_cidListen) {
					boolean zRet = INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
					m_cidListen = false;
					m_btListen.setText(R.string.intelbrass_cid_start);
				} else {
					INetSDK.SetDVRMessCallBack(new TestMessageCallBack());
					Integer stProVer = new Integer(0);
					boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
							FinalVar.SDK_DEVSTATE_PROTOCAL_VER, stProVer, 1000);
					zRet = INetSDK.StartListenEx(TestNetSDKActivity.m_loginHandle);
					if (!zRet) {
						return;
					}
					/*
					if (zRet) {
						if (stProVer.intValue() < 5) {
							zRet = INetSDK.StartListen(TestNetSDKActivity.m_loginHandle);
							if (!zRet) {
								return;
							}
						} else {
							zRet = INetSDK.StartListenEx(TestNetSDKActivity.m_loginHandle);
							if (!zRet) {
								return;
							}
						}
					}
					*/
					m_cidListen = true;
					m_btListen.setText(R.string.intelbrass_cid_stop);
				}
			}
		});

		Button btRet = (Button)m_layoutCid.findViewById(R.id.bt_intelbrass_cid_ret);
		btRet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (m_cidListen) {
					INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
					m_cidListen = false;
					m_btListen.setText(R.string.intelbrass_cid_start);
				}
				m_popCur.dismiss();
				m_popCur = null;
			}
		});
	}

	private void jumpToIntelBrassStateActivity() {
		Intent intent = new Intent();
		intent.setClass(this, IntelBrassStateActivity.class);
		startActivityForResult(intent, 2);
	}

	private void jumpToIntelBrasssArmModeActiviy(){

		if (null == m_layoutArmMode) {
			m_layoutArmMode = View.inflate(this, R.layout.armmodeview, null);
			m_popArmMode = new PopupWindow(m_layoutArmMode, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (null != m_popCur) {
			m_popCur.dismiss();
			if (m_popCur == m_popArmMode) {
				m_popCur = null;
				return;
			}
		}
		m_popArmMode.showAtLocation(this.getListView(), Gravity.CENTER, 0, 0);
		m_popCur = m_popArmMode;

		m_cbMode = (CheckBox)m_layoutArmMode.findViewById(R.id.cb_intelbrass_arm_mode_state);
		Button btGet = (Button)m_layoutArmMode.findViewById(R.id.bt_intelbrass_arm_mode_get);
		btGet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				NET_ARM_MODE_INFO stArmMode = new NET_ARM_MODE_INFO();

				boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
						FinalVar.SDK_DEVSTATE_ARM_MODE_GET, stArmMode, 2000);
				if (!zRet) {
					ToolKits.showErrorMessage(v.getContext(), "QueryDevState SDK_DEVSTATE_ARM_MODE_GET failed");
					return;
				}
				else{
					if(1 == stArmMode.nArmMode){
						m_cbMode.setChecked(true);
					}
					else if( 0 == stArmMode.nArmMode ){
						m_cbMode.setChecked(false);
					}
					else{
						ToolKits.showMessage(v.getContext(), "Get Unknow Mode");
					}
				}
			}
		});
	}


	private void QueryPowerState(View v){
		NET_POWER_STATUS stPoewrState = new NET_POWER_STATUS();
		boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEVSTATE_POWER_STATE, stPoewrState, 2000);
		if (!zRet) {
			ToolKits.showErrorMessage(v.getContext(), "QueryDevState SDK_DEVSTATE_POWER_STATE failed");
			return;
		}
	}

	private void QueryAlarmSubSystemState(View v){
		NET_ALARM_SUBSYSTEM_STATE stAlarmSubSystemState = new NET_ALARM_SUBSYSTEM_STATE();
		boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEVSTATE_ALARMSUBSYSTEM_STATE, stAlarmSubSystemState, 2000);
		if (!zRet) {
			ToolKits.showErrorMessage(v.getContext(), "QueryDevState SDK_DEVSTATE_ALARMSUBSYSTEM_STATE failed");
			return;
		}
		else
		{
			String strState[] = {"Unknow" , "Active" , "InActive" , "undistributed"};
			String strShow = new String();
			for( int i =0 ; i< stAlarmSubSystemState.nMaxAlarmSubSystem ; i++)
			{
				strShow += String.format("Chn[%d] , State[%s]\n" ,
						i , strState[stAlarmSubSystemState.emState[i]]);
			}
			ToolKits.writeLog( strShow );
		}
	}

	private String GetStateArray(String strPrompt , int nArrayNum , int[] nStateArray){
		String strState[] = {"Unknow" , "Normal" , "Fault"};
		String strResult = strPrompt + " States:\n";

		for( int i =0 ; i< nArrayNum ; i++)
		{
			strResult += String.format("Chn[%d] , State[%s]\n" ,
					i , strState[nStateArray[i]]);
		}

		return strResult;
	}

	private String GenShowString(NET_OUT_ALARM_FAULT_STATE stParam){
		String strShow = new String();

		String strState[] = {"Unknow" , "Normal" , "Fault"};

		strShow += String.format("ConnectFaultState , State[%s]\n" ,
				strState[stParam.nConnectFaultState] );

		strShow += GetStateArray("Bell" , stParam.nBell , stParam.anBellState);
		strShow += GetStateArray("FaultKeyboar" , stParam.nFaultKeyboard , stParam.anFaultKeyboard);
		strShow += GetStateArray("TamperKeyboard" , stParam.nTamperKeyboard , stParam.anTamperKeyboard);
		strShow += GetStateArray("ShortOutSensor" , stParam.nShortOutSensor , stParam.anShortOutSensor);
		strShow += GetStateArray("TamperSensor" , stParam.nTamperSensor , stParam.anTamperSensor);

		return strShow;
	}

	private void QueryAlarmFaultState(View v){
		NET_ALARM_FAULT_STATE stAlarmFaultState = new NET_ALARM_FAULT_STATE();
		stAlarmFaultState.stuIn.emType = EM_ALARM_FAULT_STATE_TYPE.EM_ALARM_FAULT_STATE_ALL;
		boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEVSTATE_ALARM_FAULT_STATE, stAlarmFaultState, 2000);
		if (!zRet) {
			ToolKits.showErrorMessage(v.getContext(), "QueryDevState SDK_DEVSTATE_ALARM_FAULT_STATE failed");
			return;
		}

		ToolKits.writeLog( GenShowString(stAlarmFaultState.stuOut) );
	}

	private void QueryDefenceState(View v){
		NET_DEFENCE_STATE_INFO stDefenceState = new NET_DEFENCE_STATE_INFO();
		stDefenceState.stuIn.nDefenceNum = 3;
		for(int i =0 ; i<stDefenceState.stuIn.nDefenceNum ; i++){
			stDefenceState.stuIn.anDefence[i] = i;
		}

		boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEVSTATE_DEFENCE_STATE, stDefenceState, 2000);
		if (!zRet) {
			ToolKits.showErrorMessage(v.getContext(), "QueryDevState SDK_DEVSTATE_DEFENCE_STATE failed");
			return;
		}

		String strState[] = {"Unknow" , "ByPass" , "Open" , "Close" , "Alarming"};
		String strShow = "Get Defence State==>:\n";
		for(int i=0 ; i<stDefenceState.stuOut.nDefenceNum ; i++){
			strShow += String.format("Chn[%d] , State = %s\n" , i , strState[stDefenceState.stuOut.anDefenceState[i]]);
		}

		ToolKits.writeLog( strShow );
	}

	private void jumpToManyStateActivity(){
		if (null == m_layoutManyState) {
			m_layoutManyState = View.inflate(this, R.layout.manystateview, null);
			m_popManyState = new PopupWindow(m_layoutManyState, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (null != m_popCur) {
			m_popCur.dismiss();
			if (m_popCur == m_popManyState) {
				m_popCur = null;
				return;
			}
		}
		m_popManyState.showAtLocation(this.getListView(), Gravity.CENTER, 0, 0);
		m_popCur = m_popManyState;

		m_etContent = (EditText)m_layoutManyState.findViewById(R.id.et_intelbrass_mamy_state);
		Button btGet = (Button)m_layoutManyState.findViewById(R.id.bt_intelbrass_many_state_get);
		btGet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				QueryPowerState(v);				// 查询电源状态
				QueryAlarmSubSystemState(v);	// 获取子系统状态
				QueryAlarmFaultState(v);		// 获取故障状态
				QueryDefenceState(v);		    // 防区状态查询
			}
		});
	}

	private class TestMessageCallBack implements CB_fMessageCallBack {
		@Override
		public boolean invoke(int lCommand, long lLoginID, Object obj, String pchDVRIP, int nDVRPort) {
			ToolKits.writeLog("TestMessageCallBack, lCommand = " + lCommand);
			if (FinalVar.SDK_ALARM_CIDEVENT == lCommand) {
				if (null != m_tvShow) {
					ALARM_CIDEVENT_INFO stCidEventInfo = (ALARM_CIDEVENT_INFO)obj;
					String strShow =
							String.format("CID Event: %s" , new String(stCidEventInfo.szCID) );
					ToolKits.writeLog( strShow );
				}
			}
			else if( FinalVar.SDK_ALARM_BATTERYPOWER_EVENT == lCommand){
				if (null != m_tvShow) {
					ALARM_BATTERYPOWER_INFO stBatteryPower = (ALARM_BATTERYPOWER_INFO)obj;
					String strShow =
							String.format("BatteryPower Event: Channel[%d] , At Time %s , Percent: %d%%" ,
									stBatteryPower.nChannel , stBatteryPower.stuTime.toString() ,
									stBatteryPower.nPercent );

					ToolKits.writeLog( strShow );
				}
			}
			else if( FinalVar.SDK_ALARM_BELLSTATUS_EVENT  == lCommand){
				if (null != m_tvShow) {
					ALARM_BELLSTATUS_INFO stBellStatusInfo = (ALARM_BELLSTATUS_INFO)obj;
					String strShow =
							String.format("Bell Status Evnet : Channel[%d] ,Time %s , nAction = %d" ,
									stBellStatusInfo.nChannel , stBellStatusInfo.stuTime.toString() ,
									stBellStatusInfo.nAction);
					ToolKits.writeLog( strShow );
				}
			}
			else if( FinalVar.SDK_ALARM_DEFENCE_STATE_CHANGE_EVENT == lCommand){
				ALARM_DEFENCE_STATUS_CHANGE_INFO stDefenceStatusChangeInfo = (ALARM_DEFENCE_STATUS_CHANGE_INFO)obj;
				String strState[] = {"Unknow" , "ByPass" , "Open" , "Close" , "Alarming"};
				String strShow =
						String.format("*******Channel[%d] , Time %s , State = %s\n" ,
								stDefenceStatusChangeInfo.nChannelID ,
								stDefenceStatusChangeInfo.stuTime.toString() ,
								strState[stDefenceStatusChangeInfo.emStatus]);
				ToolKits.writeLog( strShow );
			}
			return true;
		}
	}

	private List<String> arrayData;
	private Resources res;

	private PopupWindow m_popCur;

	private View m_layoutSubsystem;
	private PopupWindow m_popSubsystem;
	private Spinner spChn;
	private CheckBox cbActive;
	private static final String[] m_strSubsystemChn = {"Channel 1", "Channel 2", "Channel 3", "Channel 4"};

	private View m_layoutPgm;
	private PopupWindow m_popPgm;
	private Spinner spPgmChn;
	private CheckBox cbPgmActive;
	private static final String[] m_strPgmChn = {"Channel 1", "Channel 2", "Channel 3", "Channel 4"};

	private View m_layoutBell;
	private PopupWindow m_popBell;
	private Spinner spBellChn;
	private CheckBox cbBellActive;
	private static final String[] m_strBellChn = {"Channel 1", "Channel 2", "Channel 3", "Channel 4"};

	private View m_layoutCid;
	private PopupWindow m_popCid;
	private boolean m_cidListen = false;
	TextView m_tvShow;
	Button m_btListen;

	private View m_layoutArmMode;
	private PopupWindow m_popArmMode;
	private CheckBox m_cbMode;

	private View m_layoutManyState;
	private PopupWindow m_popManyState;
	private EditText m_etContent;
}
