package com.company.Demo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.company.NetSDK.CB_fDisConnect;
import com.company.NetSDK.CB_fHaveLogin;
import com.company.NetSDK.CB_fHaveReConnect;
import com.company.NetSDK.CB_fMessageCallBack;
import com.company.NetSDK.CB_fSubDisConnect;
import com.company.NetSDK.CFG_CAP_ALARM_INFO;
import com.company.NetSDK.CFG_DSPENCODECAP_INFO;
import com.company.NetSDK.DEV_PLAY_RESULT;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.LOG_SET_PRINT_INFO;
import com.company.NetSDK.NET_DEVICEINFO;
import com.company.NetSDK.NET_DEVICEINFO_Ex;
import com.company.NetSDK.NET_IN_MEMBERNAME;
import com.company.NetSDK.NET_OUT_MEMBERNAME;
import com.company.NetSDK.NET_PARAM;
import com.company.NetSDK.SDKDEV_DSP_ENCODECAP_EX;
import com.company.NetSDK.SDK_DEV_ENABLE_INFO;
import com.company.NetSDK.SDK_DEV_FUNC;
import com.company.NetSDK.SDK_PRODUCTION_DEFNITION;
import com.company.NetSDK.SDK_SYS_ABILITY;
import com.nfcproject.R;

import application.Application;


public class TestNetSDKActivity extends Activity {
	Button m_btLogin;
	EditText m_serverIp;
	EditText m_serverPort;
	EditText m_serverUserName;
	EditText m_serverPassword;
	CheckBox m_cbAutoLogin;
	Resources res;

	static long m_loginHandle = 0;
	static NET_DEVICEINFO deviceInfo;
	static boolean m_speedCtrl;
	static int m_schedule;
	static int nStreaMask = 0;

	private SDKDEV_DSP_ENCODECAP_EX stEncodeCapOld = new SDKDEV_DSP_ENCODECAP_EX();
	private CFG_DSPENCODECAP_INFO stEncodeCapNew = new CFG_DSPENCODECAP_INFO();

	private int nSpecCap = 20;

	private SharedPreferences shardPreferences;

	static CFG_CAP_ALARM_INFO stCfgCapAlarm = new CFG_CAP_ALARM_INFO();

	private int nExtraChnNum;
	private int nExtraAlarmOutPortNum;

	public class DeviceDisConnect implements CB_fDisConnect
	{
		@Override
		public void invoke(long lLoginID, String pchDVRIP, int nDVRPort) {
			ToolKits.writeLog("Device " + pchDVRIP + " DisConnect!");
			Intent intent = new Intent();
			intent.setAction(TestInterfaceActivity.DISCONNECTED_BROAST);        //设置Action
			sendBroadcast(intent);                  //发送Intent
			return ;
		}
	}

	public class DeviceReConnect implements CB_fHaveReConnect
	{
		@Override
		public void invoke(long lLoginID, String pchDVRIP, int nDVRPort)
		{
			ToolKits.writeLog("Device " + pchDVRIP + " ReConnect!");
			Intent intent = new Intent();
			intent.setAction(TestInterfaceActivity.AUTOCONNECTED_BROAST);        //设置Action
			sendBroadcast(intent);                  //发送Intent
		}
	}

	public class DeviceSubDisConnect implements CB_fSubDisConnect
	{
		@Override
		public void invoke(int emInterfaceType, boolean bOnline,
						   long lOperateHandle, long lLoginID) {

			ToolKits.writeLog("Device SubConnect DisConnect");
		}
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_vedio);
		Application.getInstance().addActivity(this);
		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res =  this.getResources();
		shardPreferences = this.getPreferences(Activity.MODE_WORLD_READABLE);

//		ToolKits.showMessage(this , res.getString(R.string.DemoInit));

		// NetSDK 动态库日志
		LOG_SET_PRINT_INFO logInfo = new LOG_SET_PRINT_INFO();
		logInfo.bSetFilePath = true;
		String file = new String("/mnt/sdcard/sdk_log.log");
		System.arraycopy(file.getBytes(), 0, logInfo.szLogFilePath, 0, file.length());
		INetSDK.LogOpen(logInfo);

		DeviceDisConnect disConnect = new DeviceDisConnect();
		boolean zRet = INetSDK.Init(disConnect);

		INetSDK.SetConnectTime(4000, 3);

		NET_PARAM stNetParam = new NET_PARAM();
		stNetParam.nWaittime = 3000;   //函数等待超时时间
		stNetParam.nSearchRecordTime = 30000;  //录像回放超时时间
		INetSDK.SetNetworkParam(stNetParam);

		// 34317138 -> 3.43.17138
		int dbVersion = INetSDK.GetSDKVersion();
		int nBig = dbVersion / 10000000;
		int nMid = (dbVersion - (nBig * 10000000)) / 100000;
		int nRev = dbVersion - (nBig * 10000000) - (nMid * 100000);
		String strVersion = String.format(res.getString(R.string.SDKVersion) +"%d.%d.%d" ,
				nBig, nMid, nRev);
//		ToolKits.showMessage( this ,  strVersion);

		m_btLogin 			= (Button)findViewById(R.id.button1);
		m_serverIp 			= (EditText)findViewById(R.id.editText_server);
		m_serverPort 		= (EditText)findViewById(R.id.editText_server_Port);
		m_serverUserName 	= (EditText)findViewById(R.id.editText_server_user);
		m_serverPassword 	= (EditText)findViewById(R.id.editText_server_password);
		m_cbAutoLogin       = (CheckBox)findViewById(R.id.cb_login_autologin);

		if (shardPreferences.getBoolean("login_isAutoLogin", false)) {
			m_cbAutoLogin.setChecked(true);
		} else {
			try {
				m_cbAutoLogin.setChecked(false);
			}catch (Exception e){
				e.printStackTrace();
				e.printStackTrace();
				e.printStackTrace();
			}
			m_cbAutoLogin.setChecked(false);
		}
		m_serverIp.setText(shardPreferences.getString("login_ip", "111.38.247.193"));
		m_serverPort.setText(shardPreferences.getString("login_port", "9110"));
		m_serverUserName.setText(shardPreferences.getString("login_name", "huasheng"));
		m_serverPassword.setText(shardPreferences.getString("login_pswd", "huasheng"));

        // 登录到视频
        loginVideo();

	/*	m_btLogin.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
                loginVideo();
			}
		});*/
	}


    /***
     * 登录到视频
     */
    private void loginVideo(){
      /*  if (m_loginHandle !=0)
        {
            INetSDK.Logout(m_loginHandle);
            m_loginHandle = 0;
        }*/

        deviceInfo = new NET_DEVICEINFO();
        Integer error = new Integer(0);

        DeviceReConnect reConnect = new DeviceReConnect();
        INetSDK.SetAutoReconnect(reConnect);

        DeviceSubDisConnect subDisConnect = new DeviceSubDisConnect();
        INetSDK.SetSubconnCallBack(subDisConnect);

        INetSDK.SetDVRMessCallBack(new Test_CB_fMessageCallBack());

        String strIp 		= m_serverIp.getText().toString();
        String strPort 		= m_serverPort.getText().toString();
        String strUser 		= m_serverUserName.getText().toString();
        String strPassword 	= m_serverPassword.getText().toString();

        int nDevPort = 37777;
        try {
            nDevPort = Integer.parseInt(strPort);
        } catch (Exception e) {
            e.printStackTrace();
//            ToolKits.showMessage(TestNetSDKActivity.this, res.getString(R.string.login_activity_port_err));
            return;
        }

//		    	boolean bOptimeze = INetSDK.SetOptimizeMode(EM_OPTIMIZE_TYPE.EM_OPT_TYPE_MOBILE_V1, null);

        m_loginHandle = INetSDK.LoginEx(strIp, nDevPort,
                strUser, strPassword, nSpecCap, null, deviceInfo, error);



        if ( m_loginHandle != 0 )
        {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Looper.prepare();

                    // stream Type
                    if (INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_DSP_EX, stEncodeCapOld, 3000)) {
                        nStreaMask = stEncodeCapOld.dwStreamCap;
                    } else if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP, stEncodeCapNew, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 1024 * 70)) {
                        nStreaMask = stEncodeCapNew.dwStreamCap;
                    }

                    Looper.loop();
                }
            }).start();

//            ToolKits.showMessage(TestNetSDKActivity.this, res.getString(R.string.login_activity_login_success));

            NET_IN_MEMBERNAME inMember = new NET_IN_MEMBERNAME();
            inMember.szCommand = new String();
            NET_OUT_MEMBERNAME outMember = new NET_OUT_MEMBERNAME(50, 260);
            boolean zMemberRet = INetSDK.GetMemberNames(m_loginHandle, inMember, outMember, 3000);

            m_speedCtrl = false;
            m_schedule = 0;
            SDK_DEV_ENABLE_INFO stEnableInfo = new SDK_DEV_ENABLE_INFO();
            if (INetSDK.QuerySystemInfo(TestNetSDKActivity.m_loginHandle, SDK_SYS_ABILITY.ABILITY_DEVALL_INFO, stEnableInfo, 3000)) {
                if (stEnableInfo.IsFucEnable[SDK_DEV_FUNC.EN_PLAYBACK_SPEED_CTRL] != 0) {
                    m_speedCtrl = true;
                }

                m_schedule = stEnableInfo.IsFucEnable[SDK_DEV_FUNC.EN_SCHEDULE];
            }
            stCfgCapAlarm = new CFG_CAP_ALARM_INFO();
            char szOutBuffer[] = new char[10240];
            Integer stError = new Integer(0);
            boolean bQN = INetSDK.QueryNewSystemInfo(m_loginHandle, FinalVar.CFG_CAP_ALARM, 0, szOutBuffer, stError, 5000);
            if (bQN) {
                bQN = INetSDK.ParseData(FinalVar.CFG_CAP_ALARM, szOutBuffer, stCfgCapAlarm, null);
                if (!bQN) {
                    ToolKits.writeErrorLog("INetSDK.ParseData CFG_CAP_ALARM error");
                }
            } else {
                ToolKits.writeErrorLog("INetSDK.QueryNewSystemInfo CFG_CAP_ALARM error");
            }

            // TestNetSDKActivity.deviceInfo在activity直接使用出现过问题，改用putextra方式
            nExtraChnNum = TestNetSDKActivity.deviceInfo.byChanNum;
            if (-1 == TestNetSDKActivity.deviceInfo.byChanNum) {
                SDK_PRODUCTION_DEFNITION stDef = new SDK_PRODUCTION_DEFNITION();
                boolean bRet = INetSDK.QueryProductionDefinition(TestNetSDKActivity.m_loginHandle, stDef, 3000);
                if (bRet) {
                    nExtraChnNum = stDef.nVideoInChannel + stDef.nMaxRemoteInputChannels;
                }
            }
            nExtraAlarmOutPortNum = TestNetSDKActivity.deviceInfo.byAlarmOutPortNum;

            jumpToContentListActivity();
        }
        else
        {
            ToolKits.showErrorMessage(TestNetSDKActivity.this, res.getString(R.string.login_activity_login_failed));
        }
    }


	public void jumpToContentListActivity()
	{
		Intent intent = new Intent();
		intent.putExtra("name_nExtraChnNum", nExtraChnNum);
		intent.putExtra("name_nExtraAlarmOutPortNum", nExtraAlarmOutPortNum);
		intent.setClass(this, ContentListActivity.class);
		startActivityForResult(intent, 2);
	}



	@Override
	protected void onDestroy()
	{
//		Logout();
		INetSDK.Cleanup();

//		ToolKits.showMessage(this , res.getString(R.string.DemoExit));

		super.onDestroy();
	}

	@Override
	protected void onResume() {
		// reset channel
		GlobalSettingActivity.m_nGlobalChn = 0;
		GlobalSettingActivity.m_nGlobalPbStream = 0;

		super.onResume();
	}

	public class TestfHaveLogin implements CB_fHaveLogin {
		@Override
		public void invoke(long lLoginID, String pchDVRIP, int nDVRPort, boolean bOnline, NET_DEVICEINFO_Ex stuDeviceInfo, int nError) {
			ToolKits.writeLog("TestfHaveLogin");
		}
	}

	class Test_CB_fMessageCallBack implements CB_fMessageCallBack {
		@Override
		public boolean invoke(int lCommand, long lLoginID, Object obj, String pchDVRIP, int nDVRPort) {
			ToolKits.writeLog("Event: " + lCommand);
			if (12295 == lCommand) {
				DEV_PLAY_RESULT stResult = (DEV_PLAY_RESULT)obj;
				ToolKits.writeLog("ResultCode: " + stResult.dwResultCode + ", PlayHandle: " + stResult.lPlayHandle);
			}
			return true;
		}
	}
}