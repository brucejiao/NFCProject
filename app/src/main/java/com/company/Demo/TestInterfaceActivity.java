package com.company.Demo;

import android.app.ListActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.company.NetSDK.*;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


public class TestInterfaceActivity extends ListActivity {
	public interface ListFunctionInterface {
		public void listFun();
	};

	private List<ListFunctionInterface> listFunctions = new ArrayList<ListFunctionInterface>();
	private List<String> testList = new ArrayList<String>();
	private long lanalyHandle = 0;
	public static final String DISCONNECTED_BROAST = "disconnected_callback";
	public static final String AUTOCONNECTED_BROAST = "autoconnected_callback";



	private void addFunctionToList(String listItemName, ListFunctionInterface interfaceFunction)
	{
		listFunctions.add(interfaceFunction);
		testList.add(listItemName);
	}

	/////////////////////////////////////////////在这里新增列表项/////////////////////////////////////
	private void generFunctionList()
	{
		addFunctionToList("TestThermoGraphy", new ListFunctionInterface() {
			public void listFun() {
				TestThermoGraphy();
			}
		});

		addFunctionToList("TestOperateMonitorWall", new ListFunctionInterface() {
			public void listFun() {
				TestOperateMonitorWall();
			}
		});

		addFunctionToList("TestMonitorWall", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestMonitorWall();
			}
		});

		addFunctionToList("TestQueryBackupDevInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryBackupDevInfo();
			}
		});

		addFunctionToList("TestQueryCompositeInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryCompositeInfo();
			}
		});

		// 融合屏查询
		addFunctionToList("SpliseScreen", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SpliceScreen();
			}
		});

		addFunctionToList("GetSpliseScreen", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetSpliceScreen();
			}
		});

		// 自由开窗
		addFunctionToList("OpenSplitWindow ", new ListFunctionInterface() {
			@Override
			public void listFun() {
				OpenSplitWindow ();
			}
		});

		// 自由关窗
		addFunctionToList("CloseSplitWindow ", new ListFunctionInterface() {
			@Override
			public void listFun() {
				CloseSplitWindow();
			}
		});
		addFunctionToList("SetSplitWindowRect ", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SetSplitWindowRect ();
			}
		});
		addFunctionToList("SetSplitTopWindow ", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SetSplitTopWindow ();
			}
		});
		addFunctionToList("GetSplitWindowInfo ", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetSplitWindowInfo ();
			}
		});
		addFunctionToList("MobileSubscribe", new ListFunctionInterface(){
			@Override
			public void listFun(){
				MobileSubscribe();
			}
		});

		addFunctionToList("MobileSubscribeDelete", new ListFunctionInterface(){
			@Override
			public void listFun(){
				MobileSubscribeDelete();
			}
		});
		addFunctionToList("TestOperateSplit", new ListFunctionInterface() {
			public void listFun() {
				TestOperateSplit();
			}
		});

		addFunctionToList("TestCfgAlarm", new ListFunctionInterface() {
			public void listFun() {
				TestCfgAlarm();
			}
		});

		addFunctionToList("TestCfgNTP", new ListFunctionInterface() {
			public void listFun() {
				TestCfgNTP();
			}
		});

		addFunctionToList("TestCourseRecord", new ListFunctionInterface() {
			public void listFun() {
				TestCourseRecord();
			}
		});

		addFunctionToList("TestModifyDevice", new ListFunctionInterface() {
			public void listFun() {
				TestModifyDevice();
			}
		});

		addFunctionToList("TestRomoveDevice", new ListFunctionInterface() {
			public void listFun() {
				TestRomoveDevice();
			}
		});

		addFunctionToList("TestOpenDoor", new ListFunctionInterface() {
			public void listFun() {
				TestOpenDoor();
			}
		});

		addFunctionToList("TestAddLowRateWLAN", new ListFunctionInterface() {
			public void listFun() {
				TestAddLowRateWLAN();
			}
		});

		addFunctionToList("TestGetWirelessDev", new ListFunctionInterface() {
			public void listFun() {
				TestGetWirelessDev();
			}
		});

		addFunctionToList("GetCodeIDState", new ListFunctionInterface() {
			public void listFun() {
				TestGetCodeIDState();
			}
		});

		addFunctionToList("TestAddLowRateWLAN", new ListFunctionInterface() {
			public void listFun() {
				TestAddLowRateWLAN();
			}
		});

		addFunctionToList("TestSetMail", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestSetMail();
			}
		});

		addFunctionToList("TestCloudUpgrader", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestCloudUpgrader();
			}
		});

		addFunctionToList("TestCfgDVRIP", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestCfgDVRIP();
			}
		});

		addFunctionToList("TestSearchAndCofig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestSearchAndCofig();
			}
		});

		addFunctionToList("TestEmailCfg", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestEmailCfg();
			}
		});

		addFunctionToList("TestSmartEncodeCfg", new ListFunctionInterface(){
			@Override
			public void listFun() {
				TestSmartEncodeCfg();
			}
		});

		addFunctionToList("TestWlanCfg", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestWlanCfg();
			}
		});

		addFunctionToList("TestSnapPictureToFile", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestSnapPictureToFile();
			}
		});

		addFunctionToList("TestNumberStat", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestNumberStat();
			}
		});

		addFunctionToList("TestChannelName", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestChannelName();
			}
		});

		addFunctionToList("TestCommConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestCommConfig();
			}
		});

		addFunctionToList("TestFindFile", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestFindFile();
			}
		});
		addFunctionToList("TestListen", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestListen();
			}
		});

		addFunctionToList("TestTalk", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestTalk();
			}
		});

		addFunctionToList("TestUserOperation", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestUserOperation();
			}
		});

		addFunctionToList("TestRecordState", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestRecordState();
			}
		});


		addFunctionToList("TestStatisticFlux", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestStatisticFlux();
			}
		});

		addFunctionToList("TestIO", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestIO();
			}
		});

		addFunctionToList("TestKeyFrame", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestKeyFrame();
			}
		});

		addFunctionToList("TestComm", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestComm();
			}
		});

		addFunctionToList("TestDevConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestDevConfig();
			}
		});

		addFunctionToList("TestDevTime", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestDevTime();
			}
		});

		addFunctionToList("TestSearchDev", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestSearchDev();
			}
		});

		addFunctionToList("TestRecord", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestRecord();
			}
		});

		addFunctionToList("TestAlm", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestAlm();
			}
		});

		addFunctionToList("TestQueryDev", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryDev();
			}
		});

		addFunctionToList("TestPtz", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestPtz();
			}
		});

		addFunctionToList("TestLoadPicEx", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestRealLoadPicEx();
			}
		});

		addFunctionToList("TestFileBurned", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestFileBurned();
			}
		});

		addFunctionToList("TestQProdDef", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQProdDef();
			}
		});

		addFunctionToList("TestMatrix", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestMatrix();
			}
		});

		addFunctionToList("TestCfgEncode", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestCfgEncode();
			}
		});

		addFunctionToList("TestDevState", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestDevState();
			}
		});

		addFunctionToList("TestControlDev", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestControlDev();
			}
		});
		addFunctionToList("IntelBrass", new ListFunctionInterface(){
			@Override
			public void listFun(){
				IntelBrass();
			}
		});

		addFunctionToList("MobilePushNotify", new ListFunctionInterface(){
			@Override
			public void listFun(){
				MobilePushNotify();
			}
		});

		addFunctionToList("GetDeviceInfoAll", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetDeviceInfoAll();
			}
		});

		addFunctionToList("AttachCameraState", new ListFunctionInterface(){
			@Override
			public void listFun(){
				AttachCameraState();
			}
		});


		addFunctionToList("TestQueryDeviceLog", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryDeviceLog();
			}
		});


		addFunctionToList("testGetBypass", new ListFunctionInterface(){
			@Override
			public void listFun(){
				testGetBypass();
			}
		});


		addFunctionToList("TestGetActiveDefenceInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestGetActiveDefenceInfo();
			}
		});

		addFunctionToList("TestQueryBurnDevInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryBurnDevInfo();
			}
		});

		addFunctionToList("TestQueryBurnSessionNum", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestQueryBurnSessionNum();
			}
		});

		// 测试刻录相关功能
		addFunctionToList("TestBurnFunction", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestBurnFunction();
			}
		});

		// 测试庭审主机相关配置
		addFunctionToList("TestCourtHearingConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestCourtHearingConfig();
			}
		});

		// 测试庭审主机相关接口
		addFunctionToList("TestCourtHearingInterface", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestCourtHearingInterface();
			}
		});

		// 公安智能项目
		addFunctionToList("TestIVS", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestIVSInterface();
			}
		});

		// 四川移动看店配置
		addFunctionToList("TestVspScydkd", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TTestVspScydkdInterface();
			}
		});

		// 录像下载
		addFunctionToList("TestDownloadByTime", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestDownloadByTime();
			}
		});

	}

	private BroadcastReceiver dynamicReceiver   = new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			if(intent.getAction().equals(DISCONNECTED_BROAST)){

				ToolKits.writeLog("DISCONNECTED_BROAST lanalyHandle:" + lanalyHandle);
				if(lanalyHandle != 0)
				{
					INetSDK.StopLoadPic(lanalyHandle);
					lanalyHandle = 0;
				}
			}
			else if(intent.getAction().equals(AUTOCONNECTED_BROAST)) {
				ToolKits.writeLog("DISCONNECTED_BROAST AUTOCONNECTED_BROAST:" + lanalyHandle);
				DevicePicUpload cbProc = new DevicePicUpload();
				lanalyHandle = INetSDK.RealLoadPictureEx(
						TestNetSDKActivity.m_loginHandle, 0, FinalVar.EVENT_IVS_ALL, true, cbProc, 0);
			}
		}};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		generFunctionList();


		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, testList);
		setListAdapter(adapter);

		IntentFilter dynamicFilter = new IntentFilter();
		dynamicFilter.addAction(DISCONNECTED_BROAST);
		dynamicFilter.addAction(AUTOCONNECTED_BROAST);
		registerReceiver(dynamicReceiver, dynamicFilter);  // 注册自定义动态广播消息*/
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		unregisterReceiver(dynamicReceiver);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		ListFunctionInterface function = listFunctions.get(position);
		if(function != null)
		{
			function.listFun();
		}
		super.onListItemClick(l, v, position, id);
	}

	void testGetBypass() {
		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}

			@Override
			protected  Integer doInBackground(Void... params)
			{
				NET_DEVSTATE_GET_BYPASS stuBypass = new NET_DEVSTATE_GET_BYPASS();

				// 如果要查询本地通道，就初始化如下字段
				stuBypass.nLocalCount = 5;
				stuBypass.pnLocal = new int[stuBypass.nLocalCount];
				for (int i = 0; i < stuBypass.nLocalCount; i++)
				{
					stuBypass.pnLocal[i] = i;
				}
				stuBypass.pemLocal = new int[stuBypass.nLocalCount];

				// 如果要查询扩展通道，就初始化如下字段
				stuBypass.nExtendedCount = 4;
				stuBypass.pnExtended = new int[stuBypass.nExtendedCount];
				for (int i = 0; i < stuBypass.nExtendedCount; i++)
				{
					stuBypass.pnExtended[i] = i;
				}
				stuBypass.pemExtended = new int[stuBypass.nExtendedCount];

				try {
					boolean bRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_GET_BYPASS, stuBypass, 5000);
					if (bRet)
					{
						for (int i = 0; i < stuBypass.nLocalCount; i++)
						{
							ToolKits.writeErrorLog("channel" + stuBypass.pnLocal[i] + " is " + stuBypass.pemLocal[i]);
						}
						for (int i = 0; i < stuBypass.nExtendedCount; i++)
						{
							ToolKits.writeErrorLog("extchannel" + stuBypass.pnExtended[i] + " is " + stuBypass.pemExtended[i]);
						}
					}
					else
					{
						ToolKits.writeErrorLog("query bypass state err:" + INetSDK.GetLastError());
						return -1;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				return 0;
			}
			@Override
			protected void onPostExecute(Integer result) {
				ToolKits.writeLog("SimpleAsyncTask result: " + result);
			}
		}.execute();
	}

	void TestGetActiveDefenceInfo()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}

			@Override
			protected  Integer doInBackground(Void... params)
			{
				NET_ACTIVATEDDEFENCEAREA stuActiveDefence = new NET_ACTIVATEDDEFENCEAREA();

				// 如果要查询本地通道，就初始化如下字段
				stuActiveDefence.nAlarmInCount = 8;
				stuActiveDefence.nRetAlarmInCount = 0;
				stuActiveDefence.pstuAlarmInDefenceAreaInfo = new NET_ACTIVATEDDEFENCEAREA_INFO[stuActiveDefence.nAlarmInCount];
				for (int i = 0; i < stuActiveDefence.nAlarmInCount; i++)
				{
					stuActiveDefence.pstuAlarmInDefenceAreaInfo[i] = new NET_ACTIVATEDDEFENCEAREA_INFO();
				}

				// 如果要查询扩展通道，就初始化如下字段
				stuActiveDefence.nExAlarmInCount = 2;
				stuActiveDefence.nRetExAlarmInCount = 0;
				stuActiveDefence.pstuExAlarmInDefenceAreaInfo = new NET_ACTIVATEDDEFENCEAREA_INFO[stuActiveDefence.nExAlarmInCount];
				for (int i = 0; i < stuActiveDefence.nExAlarmInCount; i++)
				{
					stuActiveDefence.pstuExAlarmInDefenceAreaInfo[i] = new NET_ACTIVATEDDEFENCEAREA_INFO();
				}

				try {
					boolean bRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_ACTIVATEDDEFENCEAREA, stuActiveDefence, 5000);
					if (bRet)
					{
						for (int i = 0; i < stuActiveDefence.nRetAlarmInCount; i++)
						{
							ToolKits.writeErrorLog("activated defence[" + i + "] is " + stuActiveDefence.pstuAlarmInDefenceAreaInfo[i].nChannel);
							ToolKits.writeLog("activated time: " + stuActiveDefence.pstuAlarmInDefenceAreaInfo[i].stuActivationTime.toString());
						}
						for (int i = 0; i < stuActiveDefence.nRetExAlarmInCount; i++)
						{
							ToolKits.writeErrorLog("activated extdefence[" + i + "] is " + stuActiveDefence.pstuExAlarmInDefenceAreaInfo[i].nChannel);
						}
					}
					else
					{
						ToolKits.writeErrorLog("query active defence state err:" + INetSDK.GetLastError());
						return -1;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}

				return 0;
			}
			@Override
			protected void onPostExecute(Integer result) {
				ToolKits.writeLog("SimpleAsyncTask result: " + result);
			}
		}.execute();
	}

	void TestCommConfig() {
		CFG_COMMGROUP_INFO m_stCommInfo = new CFG_COMMGROUP_INFO();
		m_stCommInfo.nCommNum = 4;

		if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_COMM, m_stCommInfo,
				TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 1024)) {
			ToolKits.showMessage(this, "Get Config Success");

		} else {
			ToolKits.showMessage(this, "Get Config Failed");
		}
	}

	void TestFindFile() {
		NET_TIME stBegin = new NET_TIME();
		stBegin.dwYear = 2014;
		stBegin.dwMonth = 12;
		stBegin.dwDay = 12;
		NET_TIME stEnd = new NET_TIME();
		stEnd.dwYear = 2014;
		stEnd.dwMonth = 12;
		stEnd.dwDay = 12;
		stEnd.dwHour = 23;
		stEnd.dwMinute = 59;
		stEnd.dwSecond = 59;

		MEDIAFILE_FACE_DETECTION_PARAM stQueryPar = new MEDIAFILE_FACE_DETECTION_PARAM();
		stQueryPar.nChannelID = GlobalSettingActivity.m_nGlobalChn;
		stQueryPar.stuStartTime = stBegin;
		stQueryPar.stuEndTime = stEnd;
		stQueryPar.emPicType = EM_FACEPIC_TYPE.NET_FACEPIC_TYPE_SMALL;
		stQueryPar.bDetailEnable = false;
		long lRetQuery = INetSDK.FindFileEx(TestNetSDKActivity.m_loginHandle,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE_DETECTION, stQueryPar,
				5000);
		MEDIAFILE_FACE_DETECTION_INFO stQueryFile[] = new MEDIAFILE_FACE_DETECTION_INFO[5];
		for (int i = 0; i < 5; i++) {
			stQueryFile[i] = new MEDIAFILE_FACE_DETECTION_INFO();
		}
		int nFileCount = INetSDK.FindNextFileEx(lRetQuery,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE_DETECTION, stQueryFile,
				5000);
		boolean zRet = INetSDK.FindCloseEx(lRetQuery);
		if (!zRet) {
			ToolKits.writeErrorLog("FindCloseEx failed");
		}
	}

	//订阅报警事件
	void TestListen() {
		boolean zRet;

//		NET_ROAD_LIST_INFO stRoadList = new NET_ROAD_LIST_INFO();
//		zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_GET_ROAD_LIST, stRoadList, 5000);

		INetSDK.SetDVRMessCallBack(new TestMessageCallBack());
		zRet = INetSDK.StartListenEx(TestNetSDKActivity.m_loginHandle);
		// INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
	}

	void TestTalk() {
		String strLog = "";

		strLog += "\nTesting SetDeviceMode...";
		boolean zRet = INetSDK.SetDeviceMode(TestNetSDKActivity.m_loginHandle,
				EM_USEDEV_MODE.SDK_TALK_CLIENT_MODE, null);
		strLog += zRet;

		strLog += "\nTesting StartTalkEx...";
		long lServiceH = INetSDK.StartTalkEx(TestNetSDKActivity.m_loginHandle,
				new TestpfAudioDataCallBack());
		strLog += lServiceH;

		strLog += "\nTesting TalkSendData...";
		int nRet = INetSDK.TalkSendData(lServiceH, null);
		strLog += nRet;

		strLog += "\nTesting StopTalkEx...";
		zRet = INetSDK.StopTalkEx(lServiceH);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestUserOperation() {
		String strLog = "";

		USER_MANAGE_INFO_EX stManaInfo = new USER_MANAGE_INFO_EX();

		strLog += "\nTesting QueryUserInfoEx...";
		boolean zRet = INetSDK.QueryUserInfoEx(
				TestNetSDKActivity.m_loginHandle, stManaInfo, 5000);
		strLog += zRet;

		strLog += "\nTesting OperateUserInfoEx...";
		zRet = INetSDK.OperateUserInfoEx(TestNetSDKActivity.m_loginHandle, 4,
				stManaInfo.userList[12], null, 5000);
		strLog += zRet;
		strLog += "\nTesting OperateUserInfoEx...";
		zRet = INetSDK.OperateUserInfoEx(TestNetSDKActivity.m_loginHandle, 3,
				stManaInfo.userList[12], null, 5000);
		strLog += zRet;

		strLog += "\nTesting StopTalkEx...";
		strLog += zRet;

		USER_MANAGE_INFO stMana = new USER_MANAGE_INFO();

		strLog += "\nTesting QueryUserInfo...";
		zRet = INetSDK.QueryUserInfo(TestNetSDKActivity.m_loginHandle, stMana,
				5000);
		strLog += zRet;
		strLog += "\nTesting OperateUserInfo...";
		zRet = INetSDK.OperateUserInfo(TestNetSDKActivity.m_loginHandle, 4,
				stMana.userList[12], null, 5000);
		strLog += zRet;
		strLog += "\nTesting OperateUserInfo...";
		zRet = INetSDK.OperateUserInfo(TestNetSDKActivity.m_loginHandle, 3,
				stMana.userList[12], null, 5000);
		strLog += zRet;

		USER_MANAGE_INFO_NEW stManaNew = new USER_MANAGE_INFO_NEW();
		strLog += "\nTesting QueryUserInfoNew...";
		zRet = INetSDK.QueryUserInfoNew(TestNetSDKActivity.m_loginHandle,
				stManaNew, 5000);
		strLog += zRet;
		strLog += "\nTesting OperateUserInfoNew...";
		zRet = INetSDK.OperateUserInfoNew(TestNetSDKActivity.m_loginHandle, 4,
				stManaNew.userList[12], null, 5000);
		strLog += zRet;
		strLog += "\nTesting OperateUserInfoNew...";
		zRet = INetSDK.OperateUserInfoNew(TestNetSDKActivity.m_loginHandle, 3,
				stManaNew.userList[12], null, 5000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestQueryLog() {
		String strLog = "";

		SDK_LOG_ITEM stLogs[] = new SDK_LOG_ITEM[3];
		for (int i = 0; i < stLogs.length; i++) {
			stLogs[i] = new SDK_LOG_ITEM();
		}
		Integer stRetCount = new Integer(0);
		Integer stReserved = new Integer(0);

		boolean zRet = INetSDK.QueryLogEx(TestNetSDKActivity.m_loginHandle,
				SDK_LOG_QUERY_TYPE.SDKLOG_ALL, stLogs, stRetCount, stReserved, 5000);
		stReserved = Integer.valueOf(1);
		zRet = INetSDK.QueryLogEx(TestNetSDKActivity.m_loginHandle,
				SDK_LOG_QUERY_TYPE.SDKLOG_ALL, stLogs, stRetCount, stReserved, 5000);

		ToolKits.showMessage(this, strLog);
	}

	void TestRecordState() {
		byte buf[] = new byte[32];
		Integer stRet = new Integer(0);
		boolean zRet = INetSDK.QueryRecordState(TestNetSDKActivity.m_loginHandle, buf, stRet, 3000);
		byte bufIn[] = new byte[16];
		for (int i = 0; i < 16; i++) {
			bufIn[i] = buf[i];
		}
		zRet = INetSDK.SetupRecordState(TestNetSDKActivity.m_loginHandle, bufIn);
	}

	void TestStatisticFlux() {
		String strLog = "";

		strLog += "\nTesting GetStatiscFlux...";
		int nRet = INetSDK.GetStatiscFlux(TestNetSDKActivity.m_loginHandle, 0);
		strLog += nRet;
		strLog += "\nTesting SetMaxFlux...";
		boolean zRet = INetSDK.SetMaxFlux(TestNetSDKActivity.m_loginHandle,
				(short) 1024);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestIO() {
		String strLog = "";

		ALARM_CONTROL stInCtr[] = new ALARM_CONTROL[16];
		for (int i = 0; i < 16; i++) {
			stInCtr[i] = new ALARM_CONTROL();
		}
		Integer stIOCount = new Integer(0);
		strLog += "\nTesting QueryIOControlState...";
		boolean zRet = INetSDK.QueryIOControlState(
				TestNetSDKActivity.m_loginHandle, SDK_IOTYPE.SDK_ALARMINPUT,
				stInCtr, stIOCount, 3000);
		strLog += zRet;
		strLog += "\nTesting IOControl...";
		zRet = INetSDK.IOControl(TestNetSDKActivity.m_loginHandle,
				SDK_IOTYPE.SDK_ALARMINPUT, stInCtr);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestKeyFrame() {
		String strLog = "";

		strLog += "\nTesting MakeKeyFrame...";
		boolean zRet = INetSDK.MakeKeyFrame(TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 0);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestComm() {
		String strLog = "";

		SDK_COMM_STATE stParam = new SDK_COMM_STATE();
		strLog += "\nTesting QueryTransComParams...";
		boolean zRet = INetSDK.QueryTransComParams(
				TestNetSDKActivity.m_loginHandle, 0, stParam, 3000);
		strLog += zRet;

		TestfTransComCallBack stCb = new TestfTransComCallBack();
		strLog += "\nTesting CreateTransComChannel...";
		long lHandle = INetSDK.CreateTransComChannel(
				TestNetSDKActivity.m_loginHandle, 0, 115200, 4, 1, 1, stCb);
		strLog += lHandle;

		byte data[] = new byte[8];
		data[0] = 'a';
		data[1] = 'b';
		data[2] = 'c';
		data[3] = 'd';
		data[4] = 'e';
		data[5] = 'f';
		data[6] = 'g';
		data[7] = 'h';
		strLog += "\nTesting SendTransComData...";
		zRet = INetSDK.SendTransComData(lHandle, data, 8);
		strLog += zRet;

		strLog += "\nTesting DestroyTransComChannel...";
		zRet = INetSDK.DestroyTransComChannel(lHandle);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestDevConfig() {
		boolean zRet;

		Integer stRet = new Integer(0);
		SDK_DVR_VIDEOOSD_CFG stVideoOsdCfg[] = new SDK_DVR_VIDEOOSD_CFG[1];
		stVideoOsdCfg[0] = new SDK_DVR_VIDEOOSD_CFG();
		zRet = INetSDK.GetDevConfig(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEV_VIDEO_OSD_CFG,
				GlobalSettingActivity.m_nGlobalChn, stVideoOsdCfg, stRet, 3000);
		zRet = INetSDK.SetDevConfig(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEV_VIDEO_OSD_CFG,
				GlobalSettingActivity.m_nGlobalChn, stVideoOsdCfg, 3000);

		stRet = new Integer(0);
		SDKDEV_WLAN_INFO stCfg[] = new SDKDEV_WLAN_INFO[1];
		stCfg[0] = new SDKDEV_WLAN_INFO();
		zRet = INetSDK.GetDevConfig(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEV_WLAN_CFG, GlobalSettingActivity.m_nGlobalChn, stCfg, stRet, 3000);
		stCfg[0].nEncryption = 7;
		System.arraycopy("IPC-GYL".getBytes(), 0, stCfg[0].szSSID, 0, "IPC-GYL".getBytes().length);
		System.arraycopy("88668866".getBytes(), 0, stCfg[0].szKeys[0], 0, "88668866".getBytes().length);
		System.arraycopy("88668866".getBytes(), 0, stCfg[0].szWPAKeys, 0, "88668866".getBytes().length);
		zRet = INetSDK.SetDevConfig(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEV_WLAN_CFG, GlobalSettingActivity.m_nGlobalChn, stCfg, 3000);
		if (!zRet) {
			ToolKits.writeErrorLog("error, ");
		}
	}

	void TestChannelName() {
		byte name[] = new byte[16 * 32];
		Integer stRet = new Integer(0);
		boolean zRet = INetSDK.QueryChannelName(
				TestNetSDKActivity.m_loginHandle, name, stRet, 1000);
		zRet = INetSDK.SetupChannelName(TestNetSDKActivity.m_loginHandle, name);

		SDK_CHANNEL_OSDSTRING stOSDStr = new SDK_CHANNEL_OSDSTRING();
		stOSDStr.bEnable = true;
		stOSDStr.dwPosition[0] = 1;
		stOSDStr.dwPosition[1] = 3;
		stOSDStr.szStrings[0][0] = 'a';
		stOSDStr.szStrings[0][1] = 'b';
		stOSDStr.szStrings[0][2] = 'c';
		stOSDStr.szStrings[1][0] = 'd';
		stOSDStr.szStrings[1][1] = 'e';
		stOSDStr.szStrings[1][2] = 'f';
		zRet = INetSDK.SetupChannelOsdString(TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, stOSDStr);
	}

	void TestDevTime() {
		String strLog = "";

		NET_TIME stNetTime = new NET_TIME();
		strLog += "\nTesting QueryDeviceTime...";
		boolean zRet = INetSDK.QueryDeviceTime(
				TestNetSDKActivity.m_loginHandle, stNetTime, 2000);
		strLog += zRet;
		strLog += "\nTesting SetupDeviceTime...";
		zRet = INetSDK.SetupDeviceTime(TestNetSDKActivity.m_loginHandle,
				stNetTime);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestSearchDev() {
		boolean bRet;
		TestfSearchDevicesCB stCb = new TestfSearchDevicesCB();
		long lRet = INetSDK.StartSearchDevices(stCb);
		bRet = INetSDK.StopSearchDevices(lRet);

		DEVICE_NET_INFO stInfo[] = new DEVICE_NET_INFO[2];
		stInfo[0] = new DEVICE_NET_INFO();
		stInfo[1] = new DEVICE_NET_INFO();
		Integer stNum = new Integer(0);
		bRet = INetSDK.SearchDevices(stInfo, stNum, 6000);
		for (int i = 0; i < stNum; i++) {
			ToolKits.writeLog(new String(stInfo[i].szIP).trim());
		}

		DEVICE_IP_SEARCH_INFO stIpInfo = new DEVICE_IP_SEARCH_INFO();
		stIpInfo.nIpNum = 3;
		System.arraycopy("172.23.1.25".getBytes(), 0, stIpInfo.szIP[0], 0,
				"172.23.2.66".getBytes().length);
		System.arraycopy("172.23.1.26".getBytes(), 0, stIpInfo.szIP[1], 0,
				"172.23.2.67".getBytes().length);
		System.arraycopy("172.23.1.27".getBytes(), 0, stIpInfo.szIP[2], 0,
				"172.23.2.68".getBytes().length);
		bRet = INetSDK.SearchDevicesByIPs(stIpInfo, stCb, 3000);
	}

	void TestDecode() {
		String strLog = "";

		TestfMessDataCallBack stCb = new TestfMessDataCallBack();
		strLog += "\nTesting SetOperateCallBack...";
		boolean zRet = INetSDK.SetOperateCallBack(
				TestNetSDKActivity.m_loginHandle, stCb);
		strLog += zRet;

		TestfDecPlayBackPosCallBack stPlBkCb = new TestfDecPlayBackPosCallBack();
		strLog += "\nTesting SetDecPlaybackPos...";
		zRet = INetSDK.SetDecPlaybackPos(TestNetSDKActivity.m_loginHandle,
				stPlBkCb);
		strLog += zRet;

		DEV_DECODER_INFO stInfo = new DEV_DECODER_INFO();
		strLog += "\nTesting QueryDecoderInfo...";
		zRet = INetSDK.QueryDecoderInfo(TestNetSDKActivity.m_loginHandle,
				stInfo, 3000);
		strLog += zRet;

		int nDecoderId = 0;
		DEV_ENCODER_INFO stEncDev = new DEV_ENCODER_INFO();
		String sIp = "172.28.2.99";
		String sUser = "admin";
		System.arraycopy(sIp.toCharArray(), 0, stEncDev.szDevIp, 0,
				sIp.length());
		System.arraycopy(sUser.toCharArray(), 0, stEncDev.szDevUser, 0,
				sUser.length());
		System.arraycopy(sUser.toCharArray(), 0, stEncDev.szDevPwd, 0,
				sUser.length());
		stEncDev.wDevPort = 37777;
		stEncDev.nDevChannel = 0;
		stEncDev.nStreamType = 0;
		stEncDev.bDevChnEnable = 1;
		stEncDev.byConnType = 0;
		stEncDev.byWorkMode = 0;
		strLog += "\nTesting SwitchDecTVEncoder...";
		long lOperateHandle = INetSDK.SwitchDecTVEncoder(
				TestNetSDKActivity.m_loginHandle, nDecoderId, stEncDev);
		strLog += lOperateHandle;

		DEC_PLAYBACK_FILE_PARAM stFilePara = new DEC_PLAYBACK_FILE_PARAM();
		System.arraycopy(sIp.toCharArray(), 0, stFilePara.szDevIp, 0,
				sIp.length());
		stFilePara.wDevPort = 37777;
		stFilePara.bDevChnEnable = 1;
		stFilePara.byDecoderID = (byte) nDecoderId;
		System.arraycopy(sUser.toCharArray(), 0, stFilePara.szDevUser, 0,
				sUser.length());
		System.arraycopy(sUser.toCharArray(), 0, stFilePara.szDevPwd, 0,
				sUser.length());

		NET_TIME stBegin = new NET_TIME();
		stBegin.dwYear = 2013;
		stBegin.dwMonth = 1;
		stBegin.dwDay = 1;
		NET_TIME stEnd = new NET_TIME();
		stEnd.dwYear = 2013;
		stEnd.dwMonth = 1;
		stEnd.dwDay = 1;
		long lFindHandle = INetSDK.FindFile(TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 0, null, stBegin, stEnd,
				false, 3000);
		NET_RECORDFILE_INFO stFile = new NET_RECORDFILE_INFO();
		INetSDK.FindNextFile(lFindHandle, stFile);
		zRet = INetSDK.FindClose(lFindHandle);
		stFilePara.stuRecordInfo = stFile;

		strLog += "\nTesting DecTVPlayback...";
		long lPlBkFile = INetSDK.DecTVPlayback(
				TestNetSDKActivity.m_loginHandle, nDecoderId,
				DEC_PLAYBACK_MODE.Dec_By_Device_File, stFilePara);
		strLog += lPlBkFile;

		strLog += "\nTesting CtrlDecPlayback...";
		zRet = INetSDK
				.CtrlDecPlayback(TestNetSDKActivity.m_loginHandle, nDecoderId,
						DEC_CTRL_PLAYBACK_TYPE.Dec_Playback_Pause, 10, 1000);
		strLog += zRet;

		int nMonitorId = 1;
		int nSplitNum = 4;
		byte bChn[] = new byte[4];
		bChn[0] = 0;
		bChn[1] = 1;
		bChn[2] = 2;
		bChn[3] = 3;
		strLog += "\nTesting CtrlDecTVScreen...";
		long lRetHandle = INetSDK.CtrlDecTVScreen(
				TestNetSDKActivity.m_loginHandle, nMonitorId, true, nSplitNum,
				bChn, 4);
		strLog += lRetHandle;

		DEV_DECCHANNEL_STATE stDecChnSta = new DEV_DECCHANNEL_STATE();
		strLog += "\nTesting QueryDecChannelFlux...";
		zRet = INetSDK.QueryDecChannelFlux(TestNetSDKActivity.m_loginHandle,
				nDecoderId, stDecChnSta, 1000);
		strLog += zRet;

		DEV_DECODER_TV stTVInfo = new DEV_DECODER_TV();
		strLog += "\nTesting QueryDecoderTVInfo...";
		zRet = INetSDK.QueryDecoderTVInfo(TestNetSDKActivity.m_loginHandle,
				nDecoderId, stTVInfo, 3000);
		strLog += zRet;

		DEV_ENCODER_INFO stEncInfo = new DEV_ENCODER_INFO();
		strLog += "\nTesting QueryDecEncoderInfo...";
		zRet = INetSDK.QueryDecEncoderInfo(TestNetSDKActivity.m_loginHandle,
				nDecoderId, stEncInfo, 3000);
		strLog += zRet;

		byte bArr[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		strLog += "\nTesting SetDecTVOutEnable...";
		zRet = INetSDK.SetDecTVOutEnable(TestNetSDKActivity.m_loginHandle,
				bArr, 9, 3000);
		strLog += zRet;

		byte byChns[] = { 4, 5, 6, 7 };
		strLog += "\nTesting AddTourCombin...";
		int iAddTour = INetSDK.AddTourCombin(TestNetSDKActivity.m_loginHandle,
				nMonitorId, nSplitNum, byChns, 4, 1000);
		strLog += iAddTour;

		strLog += "\nTesting SetTourCombin...";
		zRet = INetSDK.SetTourCombin(TestNetSDKActivity.m_loginHandle,
				nMonitorId, iAddTour, nSplitNum, byChns, 4, 1000);
		strLog += zRet;

		DEC_COMBIN_INFO stDecComb = new DEC_COMBIN_INFO();
		strLog += "\nTesting QueryTourCombin...";
		zRet = INetSDK.QueryTourCombin(TestNetSDKActivity.m_loginHandle,
				nMonitorId, iAddTour, stDecComb, 1000);
		strLog += zRet;

		DEC_TOUR_COMBIN stDecTour = new DEC_TOUR_COMBIN();
		strLog += "\nTesting QueryDecoderTour...";
		zRet = INetSDK.QueryDecoderTour(TestNetSDKActivity.m_loginHandle,
				nMonitorId, stDecTour, 1000);
		strLog += zRet;

		strLog += "\nTesting SetDecoderTour...";
		zRet = INetSDK.SetDecoderTour(TestNetSDKActivity.m_loginHandle,
				nMonitorId, stDecTour, 1000);
		strLog += zRet;

		strLog += "\nTesting CtrlDecoderTour...";
		zRet = INetSDK.CtrlDecoderTour(TestNetSDKActivity.m_loginHandle,
				nMonitorId, DEC_CTRL_TOUR_TYPE.Dec_Tour_Start, 1000);
		strLog += zRet;

		strLog += "\nTesting DelTourCombin...";
		zRet = INetSDK.DelTourCombin(TestNetSDKActivity.m_loginHandle,
				nMonitorId, iAddTour, 1000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestRecord() {
		String strLog = "";

		NET_TIME stTime = new NET_TIME();
		stTime.dwYear = 2013;
		stTime.dwMonth = 12;
		NET_RECORD_STATUS stStatus = new NET_RECORD_STATUS();
		strLog += "\nTesting QueryRecordStatus...";
		boolean zRet = INetSDK.QueryRecordStatus(
				TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 0, stTime, null, stStatus,
				3000);
		strLog += zRet;

		NET_TIME stTimeB = new NET_TIME();
		stTimeB.dwYear = 2013;
		stTimeB.dwMonth = 12;
		stTimeB.dwDay = 1;
		NET_TIME stTimeE = new NET_TIME();
		stTimeE.dwYear = 2013;
		stTimeE.dwMonth = 12;
		stTimeE.dwDay = 31;
		BOOL_RET bRet = new BOOL_RET();
		strLog += "\nTesting QueryRecordTime...";
		zRet = INetSDK.QueryRecordTime(TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 0, stTimeB, stTimeE, null,
				bRet, 3000);
		strLog += zRet;

		NET_RECORDFILE_INFO stRecFileInfo[] = new NET_RECORDFILE_INFO[16];
		for (int i = 0; i < 16; i++) {
			stRecFileInfo[i] = new NET_RECORDFILE_INFO();
		}
		Integer stCount = new Integer(0);
		strLog += "\nTesting QuickQueryRecordFile...";
		zRet = INetSDK.QuickQueryRecordFile(TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 0, stTimeB, stTimeE, null,
				stRecFileInfo, stCount, 3000, false);
		strLog += zRet;

		NET_FURTHEST_RECORD_TIME stFurTime = new NET_FURTHEST_RECORD_TIME(16);
		strLog += "\nTesting QueryFurthestRecordTime...";
		zRet = INetSDK.QueryFurthestRecordTime(
				TestNetSDKActivity.m_loginHandle, 0, null, stFurTime, 3000);
		strLog += zRet;

		byte bArrState[] = new byte[16];
		Integer stRetLen = new Integer(0);
		strLog += "\nTesting QueryExtraRecordState...";
		zRet = INetSDK.QueryExtraRecordState(TestNetSDKActivity.m_loginHandle,
				bArrState, stRetLen, 3000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestAlm() {
		String strLog = "";

		strLog += "\nTesting AlarmReset...";
		boolean zRet = INetSDK.AlarmReset(TestNetSDKActivity.m_loginHandle, -1,
				GlobalSettingActivity.m_nGlobalChn, null, 3000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestQueryDev() {
		String strLog = "";
		SDK_PRODUCTION_DEFNITION stProd = new SDK_PRODUCTION_DEFNITION();

		boolean zRetTemp = INetSDK.QueryProductionDefinition(
				TestNetSDKActivity.m_loginHandle, stProd, 1000);
		if (!zRetTemp)
		{
			strLog += "\nFailed to query definition.....";
			ToolKits.showMessage(this, strLog);

			return;
		}

		int nVideoInChannel = stProd.nVideoInChannel;


		Integer stIntRet = new Integer(0);
		Integer stIntRetLen = new Integer(0);
		strLog += "\nTesting QueryRemotDevState...";
		for (int i=0; i<nVideoInChannel; i++)
		{
			boolean zRet = INetSDK.QueryRemotDevState(
					TestNetSDKActivity.m_loginHandle,
					FinalVar.SDK_DEVSTATE_ONLINE,
					GlobalSettingActivity.m_nGlobalChn, stIntRet,
					stIntRetLen, 3000);

			strLog += zRet;
			strLog += "\nThe remote ipc state on channel:";

			if (1 == stIntRet)
			{
				strLog += "Online";
			}
			else
			{
				strLog += "OffLine";
			}

			ToolKits.showMessage(this, strLog);
		}

		/*SDK_CARD_QUERY_EN stQuery = new SDK_CARD_QUERY_EN();
		strLog += "\nTesting QuerySystemInfo...";
		zRet = INetSDK.QuerySystemInfo(TestNetSDKActivity.m_loginHandle,
				SDK_SYS_ABILITY.ABILITY_CARD_QUERY, stQuery, 3000);
		strLog += zRet;

		char cBuf[] = new char[512];
		Integer stErr = new Integer(0);
		strLog += "\nTesting QueryNewSystemInfo...";
		zRet = INetSDK.QueryNewSystemInfo(TestNetSDKActivity.m_loginHandle,
				"magicBox.getCPUUsage", GlobalSettingActivity.m_nGlobalChn,
				cBuf, stErr, 3000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);*/
	}

	void TestPtz() {
		String strLog = "";

		PTZ_OPT_ATTR stArrt = new PTZ_OPT_ATTR();
		strLog += "\nTesting GetPtzOptAttr...";
		boolean zRet = INetSDK.GetPtzOptAttr(TestNetSDKActivity.m_loginHandle,
				0, stArrt, 3000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestLoadPic() {
		String strLog = "";

		TestfAnalyzerDataCallBack stCb = new TestfAnalyzerDataCallBack();
		strLog += "\nTesting RealLoadPicture...";
		long lRealLoad = INetSDK.RealLoadPicture(
				TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, FinalVar.EVENT_IVS_ALL,
				stCb);
		strLog += lRealLoad;

		strLog += "\nTesting StopLoadPic...";
		boolean zRet = INetSDK.StopLoadPic(lRealLoad);
		strLog += zRet;

		boolean zNeeded = true;
		strLog += "\nTesting RealLoadPictureEx...";
		lRealLoad = INetSDK.RealLoadPictureEx(TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, FinalVar.EVENT_IVS_ALL,
				zNeeded, stCb, null);
		strLog += lRealLoad;

		strLog += "\nTesting StopLoadPic...";
		zRet = INetSDK.StopLoadPic(lRealLoad);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestFileBurned() {
		String strLog = "";

		boolean zRet;
		/*
		 * SDK_BURNING_DEVINFO stBurnDevInfo = new SDK_BURNING_DEVINFO(); strLog
		 * += "\nTesting QueryDevState..."; zRet = INetSDK.QueryDevState(
		 * TestNetSDKActivity.m_loginHandle, INetSDK.SDK_DEVSTATE_BURNING_DEV,
		 * stBurnDevInfo, 1000); strLog += zRet;
		 */

		NET_IN_FILEBURNED_START stInStart = new NET_IN_FILEBURNED_START();
		stInStart.szMode = "append";
		stInStart.szDeviceName = "/dev/sda"; // stBurnDevInfo.stDevs[0].dwDriverName.toString();
		stInStart.szFilename = "/mnt/sdcard/NetSDK/collectorsdk.bat";
		stInStart.cbBurnPos = new TestfBurnFileCallBack();
		NET_OUT_FILEBURNED_START stOutStart = new NET_OUT_FILEBURNED_START();
		strLog += "\nTesting StartUploadFileBurned...";
		long lFileBurned = INetSDK.StartUploadFileBurned(
				TestNetSDKActivity.m_loginHandle, stInStart, stOutStart, 1000);
		strLog += lFileBurned;

		strLog += "\nTesting StartUploadFileBurned...";
		zRet = INetSDK.SendFileBurned(lFileBurned);
		strLog += zRet;

		strLog += "\nTesting StopUploadFileBurned...";
		zRet = INetSDK.StopUploadFileBurned(lFileBurned);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestQProdDef() {
		String strLog = "";

		SDK_PRODUCTION_DEFNITION stProd = new SDK_PRODUCTION_DEFNITION();
		strLog += "\nTesting QueryProductionDefinition...";
		boolean zRet = INetSDK.QueryProductionDefinition(
				TestNetSDKActivity.m_loginHandle, stProd, 1000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestMatrix() {
		String strLog = "";

		SDK_MATRIX_CARD_LIST stCardList = new SDK_MATRIX_CARD_LIST();
		boolean zRet = INetSDK.QueryMatrixCardInfo(
				TestNetSDKActivity.m_loginHandle, stCardList, 3000);

		for (int i = 0; i < stCardList.nCount; i++) {
			ToolKits.writeLog("Inchannel" + stCardList.stuCards[i].nAudioInChn);
		}

		SDK_SPLIT_CAPS stCaps = new SDK_SPLIT_CAPS();
		zRet = INetSDK.GetSplitCaps(TestNetSDKActivity.m_loginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, stCaps, 1000);

		SDK_SPLIT_MODE_INFO stMode = new SDK_SPLIT_MODE_INFO();
		stMode.emSplitMode = SDK_SPLIT_MODE.SDK_SPLIT_4;
		zRet = INetSDK.SetSplitMode(TestNetSDKActivity.m_loginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, stMode, 1000);

		zRet = INetSDK.GetSplitMode(TestNetSDKActivity.m_loginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, stMode, 1000);

		SDK_SPLIT_SOURCE stSplitSrc[] = new SDK_SPLIT_SOURCE[16];
		for (int i = 0; i < 16; i++) {
			stSplitSrc[i] = new SDK_SPLIT_SOURCE();
		}
		Integer stRetCount = new Integer(0);
		zRet = INetSDK.GetSplitSource(TestNetSDKActivity.m_loginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, -1, stSplitSrc,
				stRetCount, 1000);

		zRet = INetSDK.SetSplitSource(TestNetSDKActivity.m_loginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, -1, stSplitSrc,
				stRetCount.intValue(), 1000);

		ToolKits.showMessage(this, strLog);
	}

	void TestCfgEncode() {
		SDKDEV_SYSTEM_ATTR_CFG stSystemArr[] = new SDKDEV_SYSTEM_ATTR_CFG[1];
		stSystemArr[0] = new SDKDEV_SYSTEM_ATTR_CFG();
		Integer stRet = new Integer(0);
		boolean zRet = INetSDK.GetDevConfig(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEV_DEVICECFG, -1, stSystemArr, stRet, 3000);
		if (zRet) {
			CFG_ENCODE_INFO stEncInfo[] = new CFG_ENCODE_INFO[stSystemArr[0].byVideoCaptureNum];
			CFG_DSPENCODECAP_INFO stDspEncCap[] = new CFG_DSPENCODECAP_INFO[stSystemArr[0].byVideoCaptureNum];
			// CFG_RECORD_INFO stRecord[] = new
			// CFG_RECORD_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_ALARMIN_INFO stAlarmIn[] = new
			// CFG_ALARMIN_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_NETALARMIN_INFO stNetAlarmIn[] = new
			// CFG_NETALARMIN_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_MOTION_INFO stMotion[] = new
			// CFG_MOTION_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_SHELTER_INFO stShelter[] = new
			// CFG_SHELTER_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_VIDEOLOST_INFO stLossDetect[] = new
			// CFG_VIDEOLOST_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_STORAGENOEXIST_INFO[] stStorageNotExist = new
			// CFG_STORAGENOEXIST_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_STORAGEFAILURE_INFO[] stStorageFailure = new
			// CFG_STORAGEFAILURE_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_STORAGELOWSAPCE_INFO[] stStorageLowSpace = new
			// CFG_STORAGELOWSAPCE_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_NETABORT_INFO[] stNetAbort = new
			// CFG_NETABORT_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_IPCONFLICT_INFO[] stIPConflict = new
			// CFG_IPCONFLICT_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_WATERMARK_INFO[] stWaterMark = new
			// CFG_WATERMARK_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_ANALYSERULES_INFO[] stVideoAnalyseRule = new
			// CFG_ANALYSERULES_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_RAINBRUSH_INFO[] stRainBrush = new
			// CFG_RAINBRUSH_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_DEV_DISPOSITION_INFO[] stGeneral = new
			// CFG_DEV_DISPOSITION_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_ATMMOTION_INFO[] stFetchMoneyOverTime = new
			// CFG_ATMMOTION_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_DEVICESTATUS_INFO[] stDeviceStatus = new
			// CFG_DEVICESTATUS_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_IPSERVER_STATUS[] stIpsServer = new
			// CFG_IPSERVER_STATUS[stSystemArr.byVideoCaptureNum];
			// CFG_VIDEOENCODEROI_INFO[] stVideoEncodeROI = new
			// CFG_VIDEOENCODEROI_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_RTSP_INFO_OUT[] stRTSP = new
			// CFG_RTSP_INFO_OUT[stSystemArr.byVideoCaptureNum];
			// CFG_VIDEODIAGNOSIS_GLOBAL[] stVideoDiagnosisGlobal = new
			// CFG_VIDEODIAGNOSIS_GLOBAL[stSystemArr.byVideoCaptureNum];
			// CFG_TRAFFIC_WORKSTATE_INFO[] stWorkState = new
			// CFG_TRAFFIC_WORKSTATE_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_STORAGEGROUP_INFO[] stStorageDevGroup = new
			// CFG_STORAGEGROUP_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_RECORDTOGROUP_INFO[] stRecordToGroup = new
			// CFG_RECORDTOGROUP_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_ANALYSERULES_INFO[] stIVSFramRule = new
			// CFG_ANALYSERULES_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_METADATA_SERVER[] stMetaDataServer = new
			// CFG_METADATA_SERVER[stSystemArr.byVideoCaptureNum];
			// AV_CFG_RecordMode[] stRecordMode = new
			// AV_CFG_RecordMode[stSystemArr.byVideoCaptureNum];
			// AV_CFG_VideoOutAttr[] stVideoOut = new
			// AV_CFG_VideoOutAttr[stSystemArr.byVideoCaptureNum];
			// AV_CFG_RemoteDevice[] stRemoteDevice = new
			// AV_CFG_RemoteDevice[stSystemArr.byVideoCaptureNum];
			// AV_CFG_RemoteChannel[] stRemoteChannel = new
			// AV_CFG_RemoteChannel[stSystemArr.byVideoCaptureNum];
			// AV_CFG_RemoteChannel[] stRaid = new
			// AV_CFG_RemoteChannel[stSystemArr.byVideoCaptureNum];
			// AV_CFG_RecordSource[] stRecordSource = new
			// AV_CFG_RecordSource[stSystemArr.byVideoCaptureNum];
			// AV_CFG_StorageGroup[] stStorageGroup = new
			// AV_CFG_StorageGroup[stSystemArr.byVideoCaptureNum];
			// AV_CFG_Language[] stLanguage = new
			// AV_CFG_Language[stSystemArr.byVideoCaptureNum];
			// AV_CFG_AccessFilter[] stAccessFilter = new
			// AV_CFG_AccessFilter[stSystemArr.byVideoCaptureNum];
			// AV_CFG_AutoMaintain[] stAutoMaintain = new
			// AV_CFG_AutoMaintain[stSystemArr.byVideoCaptureNum];
			// CFG_NAS_INFO_EX[] stNAS = new
			// CFG_NAS_INFO_EX[stSystemArr.byVideoCaptureNum];
			AV_CFG_ChannelName stChnName[] = new AV_CFG_ChannelName[stSystemArr[0].byVideoCaptureNum];

			for (int i = 0; i < stSystemArr[0].byVideoCaptureNum; i++) {
				stEncInfo[i] = new CFG_ENCODE_INFO();
				stDspEncCap[i] = new CFG_DSPENCODECAP_INFO();
				// stRecord[i] = new CFG_RECORD_INFO();
				// stAlarmIn[i] = new CFG_ALARMIN_INFO();
				// stNetAlarmIn[i] = new CFG_NETALARMIN_INFO();
				// stLossDetect[i] = new CFG_VIDEOLOST_INFO();
				// stStorageNotExist[i] = new CFG_STORAGENOEXIST_INFO();
				// stStorageFailure[i] = new CFG_STORAGEFAILURE_INFO();
				// stStorageLowSpace[i] = new CFG_STORAGELOWSAPCE_INFO();
				// stNetAbort[i] = new CFG_NETABORT_INFO();
				// stIPConflict[i] = new CFG_IPCONFLICT_INFO();
				// stWaterMark[i] = new CFG_WATERMARK_INFO();
				// stVideoAnalyseRule[i] = new CFG_ANALYSERULES_INFO();
				// stRainBrush[i] = new CFG_RAINBRUSH_INFO();
				// stFetchMoneyOverTime[i] = new CFG_ATMMOTION_INFO();
				// stDeviceStatus[i] = new CFG_DEVICESTATUS_INFO();
				// stVideoEncodeROI[i] = new CFG_VIDEOENCODEROI_INFO();
				// stRTSP[i] = new CFG_RTSP_INFO_OUT();
				// stVideoDiagnosisGlobal[i] = new CFG_VIDEODIAGNOSIS_GLOBAL();
				// stWorkState[i] = new CFG_TRAFFIC_WORKSTATE_INFO();
				// stStorageDevGroup[i] = new CFG_STORAGEGROUP_INFO(2048);
				// stRecordToGroup[i] = new CFG_RECORDTOGROUP_INFO();
				// stMetaDataServer[i] = new CFG_METADATA_SERVER();
				// stRecordMode[i] = new AV_CFG_RecordMode();
				// stVideoOut[i] = new AV_CFG_VideoOutAttr();
				// stRemoteDevice[i] = new AV_CFG_RemoteDevice(8);
				// stRemoteChannel[i] = new AV_CFG_RemoteChannel();
				// stRaid[i] = new AV_CFG_RemoteChannel();
				// stRecordSource[i] = new AV_CFG_RecordSource();
				// stStorageGroup[i] = new AV_CFG_StorageGroup();
				// stLanguage[i] = new AV_CFG_Language();
				// stAccessFilter[i] = new AV_CFG_AccessFilter();
				// stAutoMaintain[i] = new AV_CFG_AutoMaintain();
				// stNAS[i] = new CFG_NAS_INFO_EX();
				// stMotion[i] = new CFG_MOTION_INFO();
				// stShelter[i] = new CFG_SHELTER_INFO();
				stChnName[i] = new AV_CFG_ChannelName();
			}

			for (int i = 0; i < stSystemArr[0].byVideoCaptureNum; i++) {
				boolean zRetEnc;

				SDKDEV_DSP_ENCODECAP stDspCap = new SDKDEV_DSP_ENCODECAP();
				zRetEnc = INetSDK.QueryDevState(
						TestNetSDKActivity.m_loginHandle,
						FinalVar.SDK_DEVSTATE_DSP, stDspCap, 3000);
				if (!zRetEnc) {
					zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ENCODE,
							stEncInfo[i], TestNetSDKActivity.m_loginHandle, i,
							4096);
					if (!zRetEnc) {
						ToolKits.showErrorMessage(this, "GetDevConfig failed, "
								+ FinalVar.CFG_CMD_ENCODE + ", chn: " + i);
					} else {
						zRetEnc = ToolKits.SetDevConfig(
								FinalVar.CFG_CMD_ENCODE, stEncInfo[i],
								TestNetSDKActivity.m_loginHandle, i, 4096);
					}
				}
				// NAS
				/*
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_NASEX,
				 * stNAS[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_NASEX + ", chn: "
				 * + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_NASEX, stNAS[i],
				 * TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //AutoMaintain zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_AUTOMAINTAIN,
				 * stAutoMaintain[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_AUTOMAINTAIN +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_AUTOMAINTAIN,
				 * stAutoMaintain[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //AccessFilter zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_ACCESSFILTER,
				 * stAccessFilter[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_ACCESSFILTER +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_ACCESSFILTER,
				 * stAccessFilter[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //Language zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_LANGUAGE,
				 * stLanguage[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_LANGUAGE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_LANGUAGE,
				 * stLanguage[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //StorageGroup zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGEGROUP,
				 * stStorageGroup[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGEGROUP +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGEGROUP,
				 * stStorageGroup[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //RecordSource zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORDSOURCE,
				 * stRecordSource[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RECORDSOURCE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORDSOURCE,
				 * stRecordSource[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //Raid zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RAID,
				 * stRaid[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RAID + ", chn: " +
				 * i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RAID, stRaid[i],
				 * TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //RemoteChannel zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_REMOTECHANNEL,
				 * stRemoteChannel[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_REMOTECHANNEL +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_REMOTECHANNEL,
				 * stRemoteChannel[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //RemoteDevice zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_REMOTEDEVICE,
				 * stRemoteDevice[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_REMOTEDEVICE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_REMOTEDEVICE,
				 * stRemoteDevice[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //VideoOut zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOOUT,
				 * stVideoOut[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOOUT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOOUT,
				 * stVideoOut[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //RecordMode zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORDMODE,
				 * stRecordMode[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RECORDMODE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORDMODE,
				 * stRecordMode[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * }
				 */
				/*
				 * //MetaDataServer zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_MD_SERVER,
				 * stMetaDataServer[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_MD_SERVER +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_MD_SERVER,
				 * stMetaDataServer[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //IVSFramRule zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_IVSFRAM_RULE,
				 * stIVSFramRule[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_IVSFRAM_RULE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_IVSFRAM_RULE,
				 * stIVSFramRule[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * }
				 */
				/*
				 * //RecordToGroup zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORDTOGROUP,
				 * stRecordToGroup[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RECORDTOGROUP +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORDTOGROUP,
				 * stRecordToGroup[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP,
				 * stDspEncCap[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_HDVR_DSP +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_HDVR_DSP,
				 * stDspEncCap[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 *
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORD,
				 * stRecord[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RECORD + ", chn: "
				 * + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORD, stRecord[i],
				 * TestNetSDKActivity.m_loginHandle, i, 4096); }
				 *
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ALARMINPUT,
				 * stAlarmIn[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_ALARMINPUT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_ALARMINPUT,
				 * stAlarmIn[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */

				/*
				 * //NetAlarm zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_NETALARMINPUT,
				 * stNetAlarmIn[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_NETALARMINPUT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_NETALARMINPUT,
				 * stNetAlarmIn[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * }
				 */
				/*
				 * //LossDetect stLossDetect[i].nChannelID = i; zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOLOST,
				 * stLossDetect[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOLOST +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOLOST,
				 * stLossDetect[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * }
				 */
				/*
				 * //StorageNotExist //stStorageNotExist[i].bEnable = true;
				 * zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGENOEXIST,
				 * stStorageNotExist[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGENOEXIST +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGENOEXIST,
				 * stStorageNotExist[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //StorageFailure zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGEFAILURE,
				 * stStorageFailure[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGEFAILURE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGEFAILURE,
				 * stStorageFailure[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //StorageLowSpace zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGELOWSAPCE,
				 * stStorageLowSpace[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGELOWSAPCE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGELOWSAPCE,
				 * stStorageLowSpace[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //NetAbort zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_NETABORT,
				 * stNetAbort[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_NETABORT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_NETABORT,
				 * stNetAbort[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //IPConflict zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_IPCONFLICT,
				 * stIPConflict[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_IPCONFLICT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_IPCONFLICT,
				 * stIPConflict[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * }
				 */
				/*
				 * //WaterMark zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_WATERMARK,
				 * stWaterMark[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_WATERMARK +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_WATERMARK,
				 * stWaterMark[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //VideoAnalyseRule zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_ANALYSERULE,
				 * stVideoAnalyseRule[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_ANALYSERULE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_ANALYSERULE,
				 * stVideoAnalyseRule[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //RainBrush stRainBrush[i].bEnable = true; zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_RAINBRUSH,
				 * stRainBrush[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RAINBRUSH +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RAINBRUSH,
				 * stRainBrush[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //General zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_DEV_GENERRAL,
				 * stGeneral[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_DEV_GENERRAL +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_DEV_GENERRAL,
				 * stGeneral[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //FetchMoneyOverTime zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_ATMMOTION,
				 * stFetchMoneyOverTime[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_ATMMOTION +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_ATMMOTION,
				 * stFetchMoneyOverTime[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //DeviceStatus zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_DEVICESTATUS,
				 * stDeviceStatus[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_DEVICESTATUS +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_DEVICESTATUS,
				 * stDeviceStatus[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //IpsServer zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_IPSSERVER,
				 * stIpsServer[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_IPSSERVER +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_IPSSERVER,
				 * stIpsServer[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //VideoEncodeROI zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOENCODEROI,
				 * stVideoEncodeROI[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOENCODEROI +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOENCODEROI,
				 * stVideoEncodeROI[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */
				/*
				 * //RTSP zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RTSP,
				 * stRTSP[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RTSP + ", chn: " +
				 * i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RTSP, stRTSP[i],
				 * TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //VideoDiagnosisGlobal zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEODIAGNOSIS_GLOBAL,
				 * stVideoDiagnosisGlobal[i], TestNetSDKActivity.m_loginHandle,
				 * i, 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " +
				 * FinalVar.CFG_CMD_VIDEODIAGNOSIS_GLOBAL + ", chn: " + i); }
				 * else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEODIAGNOSIS_GLOBAL,
				 * stVideoDiagnosisGlobal[i], TestNetSDKActivity.m_loginHandle,
				 * i, 4096); }
				 */
				/*
				 * //WorkState zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_TRAFFIC_WORKSTATE,
				 * stWorkState[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_TRAFFIC_WORKSTATE
				 * + ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_TRAFFIC_WORKSTATE,
				 * stWorkState[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */
				/*
				 * //StorageDevGroup zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGEDEVGROUP,
				 * stStorageDevGroup[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGEDEVGROUP +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGEDEVGROUP,
				 * stStorageDevGroup[i], TestNetSDKActivity.m_loginHandle, i,
				 * 4096); }
				 */

				/*
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOLOST,
				 * stLossDetect[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOLOST +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOLOST,
				 * stLossDetect[i], TestNetSDKActivity.m_loginHandle, i, 4096);
				 * }
				 */

				/*
				 * zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_MOTIONDETECT,
				 * stMotion[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_MOTIONDETECT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_MOTIONDETECT,
				 * stMotion[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 *
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOBLIND,
				 * stShelter[i], TestNetSDKActivity.m_loginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOBLIND +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOBLIND,
				 * stShelter[i], TestNetSDKActivity.m_loginHandle, i, 4096); }
				 */

				zRetEnc = ToolKits
						.GetDevConfig(FinalVar.CFG_CMD_CHANNELTITLE,
								stChnName[i], TestNetSDKActivity.m_loginHandle,
								i, 4096);
				if (!zRetEnc) {
					ToolKits.showErrorMessage(this, "GetDevConfig failed, "
							+ FinalVar.CFG_CMD_CHANNELTITLE + ", chn: " + i);
				} else {
					String strName = new String(stChnName[i].szName);
					zRetEnc = ToolKits.SetDevConfig(
							FinalVar.CFG_CMD_CHANNELTITLE, stChnName[i],
							TestNetSDKActivity.m_loginHandle, i, 4096);
				}
			}
		}
	}

	void TestDevState() {

		byte byNumOfChn = TestNetSDKActivity.deviceInfo.byChanNum;


		final int numChannel = byNumOfChn & 0xff;


		// 耗时处理建议异步去做，不要在UI线程处理
		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}

			@Override
			protected  Integer doInBackground(Void... params) {
				String strLog = "";
				strLog += "\nTesting the state of the remote IPC...";

				for (int i = 0; i < numChannel; i++)
				{
					boolean zRet = false;
					SDKDEV_VIRTUALCAMERA_STATE_INFO stDevVirtualCam = new SDKDEV_VIRTUALCAMERA_STATE_INFO();
					stDevVirtualCam.nChannelID = i;
					zRet = INetSDK.QueryDevState(
							TestNetSDKActivity.m_loginHandle,
							FinalVar.SDK_DEVSTATE_VIRTUALCAMERA,
							stDevVirtualCam,
							3000);

					if ((stDevVirtualCam.szDeviceType[0] != 0) && (true == zRet))
					{
						strLog += "\nThe state of the remote ipc on channel ";
						strLog += i;
						strLog += " is ";

						if (CONNECT_STATE.CONNECT_STATE_UNCONNECT == stDevVirtualCam.emConnectState)
						{
							strLog += "offLine";
						}
						else if (CONNECT_STATE.CONNECT_STATE_CONNECTING == stDevVirtualCam.emConnectState)
						{
							strLog += "connceting";
						}
						else if (CONNECT_STATE.CONNECT_STATE_CONNECTED == stDevVirtualCam.emConnectState)
						{
							strLog += "onLine";
						}
						else
						{
							strLog += "stateError";
						}
						ToolKits.writeLog(strLog);
						strLog = "";
					}
				}
				return 0;

			}
			@Override
			protected void onPostExecute(Integer result) {

			}
		}.execute();


	}

	void TestReboot() {
		String strLog = "";

		strLog += "\nTesting RebootDev...";
		boolean zRet = INetSDK.RebootDev(TestNetSDKActivity.m_loginHandle);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestShutDown() {
		String strLog = "";

		strLog += "\nTesting ShutDownDev...";
		boolean zRet = INetSDK.ShutDownDev(TestNetSDKActivity.m_loginHandle);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestNewKeyBoard(int type) {
		NKB_PARAM stPram = new NKB_PARAM();
		stPram.bAddressCode = (byte) 0xFF;

		stPram.bKeyStatus = 0;
		boolean zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				type, stPram, 3000);
		stPram.bKeyStatus = 1;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, type,
				stPram, 3000);
	}

	void TestControlDev() {
		boolean zRet;

		// zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
		// CtrlType.SDK_CTRL_REBOOT, null, 3000);

		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_ENTER, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_ESC, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_UP, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_DOWN, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_LEFT, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_RIGHT, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_REC, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_PLAY, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_STOP, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_SLOW, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_FAST, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_PREW, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_NEXT, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_FN1, null, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_FN2, null, 3000);

		// new network keyboard
		// keyboard login
		NKB_PARAM stPram = new NKB_PARAM();
		stPram.bAddressCode = (byte) 0xFF;
		stPram.bKeyStatus = 1;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_LOGIN, stPram, 3000);

		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_PLAY);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_ESC);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_ENTER);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_ONE);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_NINE);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_REC);

		stPram.bExtern1 = 5;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_KEYBOARD_CHNNEL, stPram, 3000);
	}

	void IntelBrass() {
		boolean zRet;

		CTRL_ARM_DISARM_PARAM stParam = new CTRL_ARM_DISARM_PARAM();
		stParam.bState = 1;
		stParam.szDevPwd = new String("admin");
		stParam.emSceneMode = NET_SCENE_MODE.NET_SCENE_MODE_INDOOR;
		stParam.szDevID = null;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_CTRL_ARMED, stParam, 3000);

		NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE stSubsystem = new NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE();
		stSubsystem.nChannelId = 0;
		stSubsystem.bActive = true;
		zRet = INetSDK
				.ControlDevice(TestNetSDKActivity.m_loginHandle,
						CtrlType.SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET,
						stSubsystem, 3000);

		NET_CTRL_SET_BYPASS stBypass = new NET_CTRL_SET_BYPASS();
		stBypass.szDevPwd = new String("admin");
		stBypass.emMode = NET_BYPASS_MODE.NET_BYPASS_MODE_NORMAL;
		stBypass.pnLocal = new int[] { 0, 1 };
		stBypass.nLocalCount = stBypass.pnLocal.length;
		stBypass.pnExtended = new int[] { 0, 1 };
		stBypass.nExtendedCount = stBypass.pnExtended.length;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_CTRL_SET_BYPASS, stBypass, 3000);

		CTRL_ARM_DISARM_PARAM_EX stCtrlArmParamEx = new CTRL_ARM_DISARM_PARAM_EX();
		stCtrlArmParamEx.stuIn.emState = NET_ALARM_MODE.NET_ALARM_MODE_ARMING;
		stCtrlArmParamEx.stuIn.szDevPwd = "admin";
		stCtrlArmParamEx.stuIn.emSceneMode = NET_SCENE_MODE.NET_SCENE_MODE_INDOOR;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_CTRL_ARMED_EX, stCtrlArmParamEx, 5000);

		CFG_ALARMOUT_INFO stCfgAlarmOutInfo = new CFG_ALARMOUT_INFO();
		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ALARMOUT,
				stCfgAlarmOutInfo, TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 10240);
		zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_ALARMOUT,
				stCfgAlarmOutInfo, TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 10240);

		CFG_DEFENCE_AREA_DELAY_INFO stCfgDefenceAreaDelay = new CFG_DEFENCE_AREA_DELAY_INFO();
		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_DEFENCE_AREA_DELAY,
				stCfgDefenceAreaDelay, TestNetSDKActivity.m_loginHandle, -1,
				10240);
		zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_DEFENCE_AREA_DELAY,
				stCfgDefenceAreaDelay, TestNetSDKActivity.m_loginHandle, -1,
				10240);

		CFG_ALARMBELL_INFO stAlarmBell = new CFG_ALARMBELL_INFO();
		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ALARMBELL, stAlarmBell,
				TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 10240);
		zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_ALARMBELL, stAlarmBell,
				TestNetSDKActivity.m_loginHandle,
				GlobalSettingActivity.m_nGlobalChn, 10240);

		ALARMCTRL_PARAM stOut = new ALARMCTRL_PARAM();
		stOut.nAlarmNo = 0;
		stOut.nAction = 1;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_TRIGGER_ALARM_OUT, stOut, 3000);

		NET_CTRL_ALARMBELL stBell = new NET_CTRL_ALARMBELL();
		stBell.nChannelID = 0;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_CTRL_START_ALARMBELL, stBell, 3000);
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle,
				CtrlType.SDK_CTRL_STOP_ALARMBELL, stBell, 3000);

		INetSDK.SetDVRMessCallBack(new TestMessageCallBack());
		Integer stProVer = new Integer(0);
		zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEVSTATE_PROTOCAL_VER, stProVer, 1000);
		if (zRet) {
			if (stProVer.intValue() < 5) {
				zRet = INetSDK.StartListen(TestNetSDKActivity.m_loginHandle);
				if (!zRet) {
					ToolKits.showErrorMessage(this, "StartListen failed");
					return;
				}
			} else {
				zRet = INetSDK.StartListenEx(TestNetSDKActivity.m_loginHandle);
				if (!zRet) {
					ToolKits.showErrorMessage(this, "StartListenEx failed");
					return;
				}
			}

			zRet = INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
		}
	}

	void MobileSubscribe() {
		String strRegisterID = "szRegisterID"; // this is a mobile id registration on google GCM service
		String strAppID = "com.company.Demo";
		String strAuthServerAddr = "https://www.google.com/accounts/ClientLogin";
		String strPushServerAddr = "https://cellphonepush.quickddns.com/gcm/send";
		String strMainAddr = "https://android.googleapis.com/gcm/send";
		String strRedirectAddr = ""; // not used
		String strDevName = "Device01_NVR"; // device name
		String strDevID = "468101c5"; // device id
		String strUser = "AIzaSyDXwrcImAjxWhNC4WYqygjXEDS-Z83hBMo"; // API Key get from google service
		String strPsw = ""; //
		String strCertificate = ""; //is used just on iOS
		String strSecretKey = ""; // not used
		String strNumber = ""; // not used
		String strSound = ""; // is used just on iOS
		Integer stuErr = new Integer(0);
		Integer stuRes = new Integer(0);

		NET_MOBILE_PUSH_NOTIFY_CFG stNotifyCfg = new NET_MOBILE_PUSH_NOTIFY_CFG(1);
		System.arraycopy(strRegisterID.getBytes(), 0, stNotifyCfg.szRegisterID, 0, strRegisterID.getBytes().length);
		System.arraycopy(strAppID.getBytes(), 0, stNotifyCfg.szAppID, 0, strAppID.getBytes().length);
		stNotifyCfg.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
		stNotifyCfg.emPushGatewayType = EM_PUSH_GATEWAY_TYPE.EM_PUSH_GATEWAY_TYPE_APPLE_PUSH;
		stNotifyCfg.nPeriodOfValidity = 500646880;
		System.arraycopy(strAuthServerAddr.getBytes(), 0, stNotifyCfg.szAuthServerAddr, 0, strAuthServerAddr.getBytes().length);
		stNotifyCfg.nAuthServerPort = 443;
		System.arraycopy(strPushServerAddr.getBytes(), 0, stNotifyCfg.szPushServerAddr, 0, strPushServerAddr.getBytes().length);
		stNotifyCfg.nPushServerPort = 443;
		System.arraycopy(strMainAddr.getBytes(), 0, stNotifyCfg.stuPushServerMain.szAddress, 0, strMainAddr.getBytes().length);
		stNotifyCfg.stuPushServerMain.nPort = 443;
		System.arraycopy(strRedirectAddr.getBytes(), 0, stNotifyCfg.stuPushRedirectServer.szAddress, 0, strRedirectAddr.getBytes().length);
		stNotifyCfg.stuPushRedirectServer.nPort = 2006;
		System.arraycopy(strDevName.getBytes(), 0, stNotifyCfg.szDevName, 0, strDevName.getBytes().length);
		System.arraycopy(strDevID.getBytes(), 0, stNotifyCfg.szDevID, 0, strDevID.getBytes().length);
		System.arraycopy(strUser.getBytes(), 0, stNotifyCfg.szUser, 0, strUser.getBytes().length);
		System.arraycopy(strPsw.getBytes(), 0, stNotifyCfg.szPassword, 0, strPsw.getBytes().length);
		System.arraycopy(strCertificate.getBytes(), 0, stNotifyCfg.szCertificate, 0, strCertificate.getBytes().length);
		System.arraycopy(strSecretKey.getBytes(), 0, stNotifyCfg.szSecretKey, 0, strSecretKey.getBytes().length);

		if(stNotifyCfg.nSubScribeMax > 0){
			stNotifyCfg.pstuSubscribes[0].nCode = FinalVar.EVENT_IVS_STORAGENOTEXIST;
			System.arraycopy(strSound.getBytes(), 0, stNotifyCfg.pstuSubscribes[0].szSound, 0, strSound.getBytes().length);
			stNotifyCfg.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_SCENECHANGE;
			stNotifyCfg.pstuSubscribes[0].nChnNum = 2;
			stNotifyCfg.pstuSubscribes[0].nIndexs[0] = 1;
			stNotifyCfg.pstuSubscribes[0].nIndexs[1] = 2;
			System.arraycopy(strNumber.getBytes(), 0, stNotifyCfg.pstuSubscribes[0].szNumber, 0, strNumber.getBytes().length);
		}

		boolean zSet = INetSDK.SetMobileSubscribeCfg(TestNetSDKActivity.m_loginHandle, stNotifyCfg, stuErr, stuRes, 5000);
		if (!zSet) {
			ToolKits.writeErrorLog("SetMobileSubscribeCfg failed");
		}
	}

	void MobileSubscribeDelete() {
		String strRegisterID = "szRegisterID"; // this is a mobile id registration on google GCM service
		String strAppID = "com.company.Demo";
		String strAuthServerAddr = "https://www.google.com/accounts/ClientLogin";
		String strPushServerAddr = "https://cellphonepush.quickddns.com/gcm/send";
		String strMainAddr = "https://android.googleapis.com/gcm/send";
		String strRedirectAddr = ""; // not used
		String strDevName = "Device01_NVR"; // device name
		String strDevID = "468101c5"; // device id
		String strUser = "AIzaSyDXwrcImAjxWhNC4WYqygjXEDS-Z83hBMo"; // API Key get from google service
		String strPsw = ""; //
		String strCertificate = ""; //is used just on iOS
		String strSecretKey = ""; // not used

		Integer stuErr = new Integer(0);
		Integer stuRes = new Integer(0);

		NET_MOBILE_PUSH_NOTIFY_CFG stNotifyCfg = new NET_MOBILE_PUSH_NOTIFY_CFG(0);
		System.arraycopy(strRegisterID.getBytes(), 0, stNotifyCfg.szRegisterID, 0, strRegisterID.getBytes().length);
		System.arraycopy(strAppID.getBytes(), 0, stNotifyCfg.szAppID, 0, strAppID.getBytes().length);
		stNotifyCfg.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
		stNotifyCfg.emPushGatewayType = EM_PUSH_GATEWAY_TYPE.EM_PUSH_GATEWAY_TYPE_APPLE_PUSH;
		stNotifyCfg.nPeriodOfValidity = 500646880;
		System.arraycopy(strAuthServerAddr.getBytes(), 0, stNotifyCfg.szAuthServerAddr, 0, strAuthServerAddr.getBytes().length);
		stNotifyCfg.nAuthServerPort = 443;
		System.arraycopy(strPushServerAddr.getBytes(), 0, stNotifyCfg.szPushServerAddr, 0, strPushServerAddr.getBytes().length);
		stNotifyCfg.nPushServerPort = 443;
		System.arraycopy(strMainAddr.getBytes(), 0, stNotifyCfg.stuPushServerMain.szAddress, 0, strMainAddr.getBytes().length);
		stNotifyCfg.stuPushServerMain.nPort = 443;
		System.arraycopy(strRedirectAddr.getBytes(), 0, stNotifyCfg.stuPushRedirectServer.szAddress, 0, strRedirectAddr.getBytes().length);
		stNotifyCfg.stuPushRedirectServer.nPort = 2006;
		System.arraycopy(strDevName.getBytes(), 0, stNotifyCfg.szDevName, 0, strDevName.getBytes().length);
		System.arraycopy(strDevID.getBytes(), 0, stNotifyCfg.szDevID, 0, strDevID.getBytes().length);
		System.arraycopy(strUser.getBytes(), 0, stNotifyCfg.szUser, 0, strUser.getBytes().length);
		System.arraycopy(strPsw.getBytes(), 0, stNotifyCfg.szPassword, 0, strPsw.getBytes().length);
		System.arraycopy(strCertificate.getBytes(), 0, stNotifyCfg.szCertificate, 0, strCertificate.getBytes().length);
		System.arraycopy(strSecretKey.getBytes(), 0, stNotifyCfg.szSecretKey, 0, strSecretKey.getBytes().length);

		boolean zSet = INetSDK.SetMobileSubscribeCfg(TestNetSDKActivity.m_loginHandle, stNotifyCfg, stuErr, stuRes, 5000);
		if (!zSet) {
			ToolKits.writeErrorLog("SetMobileSubscribeCfg failed");
		}
	}

	void MobilePushNotify() {
		String strRegisterID = "szRegisterID";
		String strAppID = "szAppID";
		String strAuthServerAddr = "szAuthServerAddr";
		String strPushServerAddr = "szPushServerAddr";
		String strMainAddr = "stuPushServerMain.szAddress";
		String strRedirectAddr = "stuPushRedirectServer.szAddress";
		String strDevName = "szDevName";
		String strDevID = "szDevID";
		String strUser = "admin";
		String strPsw = "admin";
		String strCertificate = "szCertificate";
		String strSecretKey = "szSecretKey";
		String strNumber = "12345678901";
		String strSound = "music.caf";
		Integer stuErr = new Integer(0);
		Integer stuRes = new Integer(0);

		NET_MOBILE_PUSH_NOTIFY stNotify = new NET_MOBILE_PUSH_NOTIFY(2);
		System.arraycopy(strRegisterID.getBytes(), 0, stNotify.szRegisterID, 0,
				strRegisterID.getBytes().length);
		stNotify.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
		stNotify.nPeriodOfValidity = 100;
		System.arraycopy(strAuthServerAddr.getBytes(), 0,
				stNotify.szAuthServerAddr, 0,
				strAuthServerAddr.getBytes().length);
		stNotify.nAuthServerPort = 2000;
		System.arraycopy(strPushServerAddr.getBytes(), 0,
				stNotify.szPushServerAddr, 0,
				strPushServerAddr.getBytes().length);
		stNotify.nPushServerPort = 2002;
		System.arraycopy(strMainAddr.getBytes(), 0,
				stNotify.stuPushServerMain.szAddress, 0,
				strMainAddr.getBytes().length);
		stNotify.stuPushServerMain.nPort = 2004;
		System.arraycopy(strRedirectAddr.getBytes(), 0,
				stNotify.stuPushRedirectServer.szAddress, 0,
				strRedirectAddr.getBytes().length);
		stNotify.stuPushRedirectServer.nPort = 2006;
		System.arraycopy(strDevName.getBytes(), 0, stNotify.szDevName, 0,
				strDevName.getBytes().length);
		System.arraycopy(strDevID.getBytes(), 0, stNotify.szDevID, 0,
				strDevID.getBytes().length);
		System.arraycopy(strUser.getBytes(), 0, stNotify.szUser, 0,
				strUser.getBytes().length);
		System.arraycopy(strPsw.getBytes(), 0, stNotify.szPassword, 0,
				strPsw.getBytes().length);
		System.arraycopy(strCertificate.getBytes(), 0, stNotify.szCertificate,
				0, strCertificate.getBytes().length);
		System.arraycopy(strSecretKey.getBytes(), 0, stNotify.szSecretKey, 0,
				strSecretKey.getBytes().length);
		stNotify.pstuSubscribes[0].nCode = FinalVar.EVENT_IVS_NOANSWERCALL;
		stNotify.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_SCENECHANGE;
		stNotify.pstuSubscribes[0].nChnNum = 2;
		stNotify.pstuSubscribes[0].nIndexs[0] = 1;
		stNotify.pstuSubscribes[0].nIndexs[1] = 2;
		stNotify.pstuSubscribes[1].nCode = FinalVar.EVENT_IVS_PROFILEALARMTRANSMIT;
		stNotify.pstuSubscribes[1].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_SCENECHANGE;
		stNotify.pstuSubscribes[1].nChnNum = 1;
		stNotify.pstuSubscribes[1].nIndexs[0] = 3;
		boolean zSet = INetSDK.SetMobilePushNotify(
				TestNetSDKActivity.m_loginHandle, stNotify, stuErr, stuRes,
				5000);
		if (!zSet) {
			ToolKits.writeErrorLog("SetMobilePushNotify failed");
		}

		NET_MOBILE_PUSH_NOTIFY_DEL stIn = new NET_MOBILE_PUSH_NOTIFY_DEL();
		System.arraycopy(strRegisterID.getBytes(), 0, stIn.szRegisterID, 0,
				strRegisterID.getBytes().length);
		NET_OUT_DELETECFG stOut = new NET_OUT_DELETECFG();
		boolean zDel = INetSDK.DelMobilePushNotify(
				TestNetSDKActivity.m_loginHandle, stIn, stOut, 5000);
		if (!zDel) {
			ToolKits.writeErrorLog("DelMobilePushNotify failed");
		}

		NET_MOBILE_PUSH_NOTIFY_CFG stNotifyCfg = new NET_MOBILE_PUSH_NOTIFY_CFG(
				1);
		System.arraycopy(strRegisterID.getBytes(), 0, stNotifyCfg.szRegisterID,
				0, strRegisterID.getBytes().length);
		System.arraycopy(strAppID.getBytes(), 0, stNotifyCfg.szAppID, 0,
				strAppID.getBytes().length);
		stNotifyCfg.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_SDKCLOUD;
		stNotifyCfg.emPushGatewayType = EM_PUSH_GATEWAY_TYPE.EM_PUSH_GATEWAY_TYPE_ANDROID_GCM;
		stNotifyCfg.nPeriodOfValidity = 100;
		System.arraycopy(strAuthServerAddr.getBytes(), 0,
				stNotifyCfg.szAuthServerAddr, 0,
				strAuthServerAddr.getBytes().length);
		stNotifyCfg.nAuthServerPort = 2000;
		System.arraycopy(strPushServerAddr.getBytes(), 0,
				stNotifyCfg.szPushServerAddr, 0,
				strPushServerAddr.getBytes().length);
		stNotifyCfg.nPushServerPort = 2002;
		System.arraycopy(strMainAddr.getBytes(), 0,
				stNotifyCfg.stuPushServerMain.szAddress, 0,
				strMainAddr.getBytes().length);
		stNotifyCfg.stuPushServerMain.nPort = 2004;
		System.arraycopy(strRedirectAddr.getBytes(), 0,
				stNotifyCfg.stuPushRedirectServer.szAddress, 0,
				strRedirectAddr.getBytes().length);
		stNotifyCfg.stuPushRedirectServer.nPort = 2006;
		System.arraycopy(strDevName.getBytes(), 0, stNotifyCfg.szDevName, 0,
				strDevName.getBytes().length);
		System.arraycopy(strDevID.getBytes(), 0, stNotifyCfg.szDevID, 0,
				strDevID.getBytes().length);
		System.arraycopy(strUser.getBytes(), 0, stNotifyCfg.szUser, 0,
				strUser.getBytes().length);
		System.arraycopy(strPsw.getBytes(), 0, stNotifyCfg.szPassword, 0,
				strPsw.getBytes().length);
		System.arraycopy(strCertificate.getBytes(), 0,
				stNotifyCfg.szCertificate, 0, strCertificate.getBytes().length);
		System.arraycopy(strSecretKey.getBytes(), 0, stNotifyCfg.szSecretKey,
				0, strSecretKey.getBytes().length);
		stNotifyCfg.pstuSubscribes[0].nCode = FinalVar.EVENT_IVS_STORAGENOTEXIST;
		System.arraycopy(strSound.getBytes(), 0,
				stNotifyCfg.pstuSubscribes[0].szSound, 0,
				strSound.getBytes().length);
		stNotifyCfg.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_SCENECHANGE;
		stNotifyCfg.pstuSubscribes[0].nChnNum = 2;
		stNotifyCfg.pstuSubscribes[0].nIndexs[0] = 1;
		stNotifyCfg.pstuSubscribes[0].nIndexs[1] = 2;
		System.arraycopy(strNumber.getBytes(), 0,
				stNotifyCfg.pstuSubscribes[0].szNumber, 0,
				strNumber.getBytes().length);
		zSet = INetSDK.SetMobilePushNotifyCfg(TestNetSDKActivity.m_loginHandle,
				stNotifyCfg, stuErr, stuRes, 5000);
		if (!zSet) {
			ToolKits.writeErrorLog("SetMobilePushNotifyCfg failed");
		}

		NET_MOBILE_PUSH_NOTIFY_CFG_DEL stInCfg = new NET_MOBILE_PUSH_NOTIFY_CFG_DEL();
		System.arraycopy(strRegisterID.getBytes(), 0, stInCfg.szRegisterID, 0,
				strRegisterID.getBytes().length);
		System.arraycopy(strAppID.getBytes(), 0, stInCfg.szAppID, 0,
				strAppID.getBytes().length);
		NET_OUT_DELETECFG stOutCfg = new NET_OUT_DELETECFG();
		zDel = INetSDK.DelMobilePushNotifyCfg(TestNetSDKActivity.m_loginHandle,
				stInCfg, stOutCfg, 5000);
		if (!zDel) {
			ToolKits.writeErrorLog("DelMobilePushNotifyCfg failed");
		}
	}
	void GetDeviceInfoAll() {
		boolean zRet;

		SDK_IN_MATRIX_GET_CAMERAS stCamerasIn = new SDK_IN_MATRIX_GET_CAMERAS();
		SDK_OUT_MATRIX_GET_CAMERAS stCamerasOut = new SDK_OUT_MATRIX_GET_CAMERAS(50);
		zRet = INetSDK.MatrixGetCameras(TestNetSDKActivity.m_loginHandle, stCamerasIn, stCamerasOut, 5000);
		if (!zRet) {
			ToolKits.writeErrorLog("MatrixGetCameras failed");
		} else {
			int nCount = stCamerasOut.nRetCameraCount < stCamerasOut.nMaxCameraCount ? stCamerasOut.nRetCameraCount : stCamerasOut.nMaxCameraCount;
			for (int i = 0; i < nCount; i++) {
				ToolKits.writeLog(stCamerasOut.pstuCameras[i].nUniqueChannel
						+ ": "
						+ new String(stCamerasOut.pstuCameras[i].szDevID)
						+ " "
						+ new String(
						stCamerasOut.pstuCameras[i].stuRemoteDevice.szDevType)
						+ " "
						+ new String(
						stCamerasOut.pstuCameras[i].stuRemoteDevice.szDevName)
						+ " "
						+ new String(
						stCamerasOut.pstuCameras[i].stuRemoteDevice.szIp)
						+ " "
						+ new String(
						stCamerasOut.pstuCameras[i].stuRemoteDevice.szUser));
			}
		}

		NET_IN_GET_CAMERA_STATEINFO getIn = new NET_IN_GET_CAMERA_STATEINFO();
		getIn.bGetAllFlag = true;
		NET_OUT_GET_CAMERA_STATEINFO getOut = new NET_OUT_GET_CAMERA_STATEINFO(256);
		zRet = INetSDK.QueryDevInfo(TestNetSDKActivity.m_loginHandle,
				FinalVar.NET_QUERY_GET_CAMERA_STATE, getIn, getOut, null, 5000);
		if (!zRet) {
			ToolKits.writeErrorLog("QueryDevInfo, NET_QUERY_GET_CAMERA_STATE failed");
		}


//		NET_IN_GET_DEVICE_INFO_ALL stDevInfoAllIn = new NET_IN_GET_DEVICE_INFO_ALL();
//		NET_OUT_GET_DEVICE_INFO_ALL stDevInfoAllOut = new NET_OUT_GET_DEVICE_INFO_ALL(20);
//		zRet = INetSDK.QueryDevInfo(TestNetSDKActivity.m_loginHandle,
//				FinalVar.NET_QUERY_DEV_REMOTE_DEVICE_INFO_ALL, stDevInfoAllIn,
//				stDevInfoAllOut, null, 5000);
//		if (!zRet) {
//			ToolKits.writeErrorLog("QueryDevInfo, NET_QUERY_DEV_REMOTE_DEVICE_INFO_ALL failed");
//		} else {
//			for (int i = 0; i < stDevInfoAllOut.pstuInfo.length; i++) {
//				ToolKits.writeLog((i + 1) + ": "
//						+ new String(stDevInfoAllOut.pstuInfo[i].szDevType));
//			}
//		}


//		NET_IN_GET_DEVICE_INFO stDevInfoIn = new NET_IN_GET_DEVICE_INFO();
//		System.arraycopy("172.11.9.17".getBytes(), 0,
//				stDevInfoIn.szAttributeIP, 0, "172.11.9.17".getBytes().length);
//		stDevInfoIn.nAttributePort = 37777;
//		System.arraycopy("admin".getBytes(), 0,
//				stDevInfoIn.szAttributeUsername, 0, "admin".getBytes().length);
//		System.arraycopy("admin".getBytes(), 0,
//				stDevInfoIn.szAttributePassword, 0, "admin".getBytes().length);
//		System.arraycopy("Dahua".getBytes(), 0,
//				stDevInfoIn.szAttributeManufacturer, 0,
//				"Dahua".getBytes().length);
//		NET_OUT_GET_DEVICE_INFO stDevInfoOut = new NET_OUT_GET_DEVICE_INFO();
//		zRet = INetSDK.QueryDevInfo(TestNetSDKActivity.m_loginHandle,
//				FinalVar.NET_QUERY_DEV_REMOTE_DEVICE_INFO, stDevInfoIn,
//				stDevInfoOut, null, 5000);
//		if (!zRet) {
//			ToolKits.writeErrorLog("QueryDevInfo, NET_QUERY_DEV_REMOTE_DEVICE_INFO failed");
//		}
	}

	public class Tets_CB_fCameraStateCallBack implements
			CB_fCameraStateCallBack {
		@Override
		public void invoke(long lLoginID, long lAttachHandle,
						   final NET_CB_CAMERASTATE pBuf) {
			ToolKits.writeLog("lLoginID = " + lLoginID + ", lAttachHandle = "
					+ lAttachHandle + ", nChannel = " + pBuf.nChannel
					+ ", emConnectState = " + pBuf.emConnectState);
		}
	}

	//订阅摄像头状态
	void AttachCameraState() {
		NET_IN_CAMERASTATE stIn = new NET_IN_CAMERASTATE(1);
		stIn.pChannels[0] = -1;
		stIn.cbCamera = new Tets_CB_fCameraStateCallBack();
		NET_OUT_CAMERASTATE stOut = new NET_OUT_CAMERASTATE();
		long lAttach = INetSDK.AttachCameraState(
				TestNetSDKActivity.m_loginHandle, stIn, stOut, 3000);
		ToolKits.writeLog("AttachCameraState lAttach: " +  lAttach);
		try {
			Thread.sleep(30000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		boolean zRet = INetSDK.DetachCameraState(lAttach);
		ToolKits.writeLog("DetachCameraState zRet: " + zRet);
	}

	public void testSetDevicePosition() {
		String strLog = "";

		NET_IN_SET_DEVICE_POSITION stuIn = new NET_IN_SET_DEVICE_POSITION();
		String strPos = "hangzhou-china";
		System.arraycopy(strPos.getBytes(), 0, stuIn.szPosition, 0,
				strPos.length());

		NET_OUT_SET_DEVICE_POSITION stuOut = new NET_OUT_SET_DEVICE_POSITION();

		if (INetSDK.SetDevicePosition(TestNetSDKActivity.m_loginHandle, stuIn,
				stuOut, 5000)) {
			// set ok
			strLog += "Set device position to ";
			strLog += stuIn.szPosition;
			strLog += " ok";
			ToolKits.writeLog(strLog);
		} else {
			// set failed
			int nErr = INetSDK.GetLastError();
			strLog += "Set device position to ";
			strLog += stuIn.szPosition;
			strLog += " err";
			ToolKits.writeLog(strLog);
		}
	}

	public void testGetDevicePosition() {
		NET_IN_GET_DEVICE_POSITION pstuIn = new NET_IN_GET_DEVICE_POSITION();
		NET_OUT_GET_DEVICE_POSITION pstuOut = new NET_OUT_GET_DEVICE_POSITION();

		if (INetSDK.GetDevicePosition(TestNetSDKActivity.m_loginHandle, pstuIn,
				pstuOut, 5000)) {
			// get ok
		} else {
			// get failed
			int nErr = INetSDK.GetLastError();
		}
	}

	public void testSnapPictureByEvent() {
		NET_IN_SNAP_BY_EVENT pstuIn = new NET_IN_SNAP_BY_EVENT();
		NET_OUT_SNAP_BY_EVENT pstuOut = new NET_OUT_SNAP_BY_EVENT();

		if (INetSDK.SnapPictureByEvent(TestNetSDKActivity.m_loginHandle,
				pstuIn, pstuOut, 5000)) {
			// snap ok
		} else {
			// snap failed
			int nErr = INetSDK.GetLastError();
		}
	}

	public class DevicePicUpload implements CB_fAnalyzerDataCallBack {
		String EventMsg = new String("");
		@Override
		public void invoke(long lAnalyzerHandle, int dwAlarmType,
						   Object alarmInfo, byte pBuffer[], int dwBufSize,
						   int nSequence, int reserved) {
			ToolKits.writeLog("pic uploaded!");
			if(dwAlarmType == FinalVar.EVENT_IVS_TRAFFICGATE) //交通卡口事件
			{
				DEV_EVENT_TRAFFICGATE_INFO trafficInfo = (DEV_EVENT_TRAFFICGATE_INFO)alarmInfo;
				ToolKits.writeLog("DevicePicUpload EVENT_IVS_TRAFFICGATE plate color:： " + trafficInfo.stuObject.rgbaMainColor + "plate type: " + new String(trafficInfo.szVehicleType)
				);
				EventMsg = "Plate Number " + new String(trafficInfo.stuObject.szText).trim()
						+ "; Auto Logos " + new String(trafficInfo.stuVehicle.szText).trim();

				ToolKits.writeLog("Year: " + trafficInfo.UTC.dwYear + "mon: " + trafficInfo.UTC.dwMonth + "day: " + trafficInfo.UTC.dwDay +
						"hour: " + trafficInfo.UTC.dwHour);

				String strFileName = "";
				//保存名字可以自己修改
				if (ToolKits.createFile("/mnt/sdcard/NetSDK/", "trafficgate.jpg")) {
					strFileName = "/mnt/sdcard/NetSDK/trafficgate.jpg";
				}
				if ("" != strFileName) {
					FileOutputStream fileStream;
					try {
						fileStream = new FileOutputStream(strFileName, true);
						fileStream.write(pBuffer, 0, dwBufSize);
						fileStream.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			if(dwAlarmType == FinalVar.EVENT_IVS_TRAFFICJUNCTION) //交通路口
			{
				DEV_EVENT_TRAFFICJUNCTION_INFO trafficInfo = (DEV_EVENT_TRAFFICJUNCTION_INFO)alarmInfo;
				ToolKits.writeLog("DevicePicUpload EVENT_IVS_TRAFFICJUNCTION plate color:： " + new String(trafficInfo.stTrafficCar.szPlateColor).trim() + "plate type: " + new String(trafficInfo.stTrafficCar.szPlateType).trim()
						+ " vehicle number: " + new String(trafficInfo.stTrafficCar.szPlateNumber).trim());

				ToolKits.writeLog("Year: " + trafficInfo.UTC.dwYear + "mon: " + trafficInfo.UTC.dwMonth + "day: " + trafficInfo.UTC.dwDay +
						"hour: " + trafficInfo.UTC.dwHour);

				String strFileName = "";
				if (ToolKits.createFile("/mnt/sdcard/NetSDK/", "trafficJunction.jpg")) {
					strFileName = "/mnt/sdcard/NetSDK/trafficJunction.jpg";
				}
				if ("" != strFileName) {
					FileOutputStream fileStream;
					try {
						fileStream = new FileOutputStream(strFileName, true);
						fileStream.write(pBuffer, 0, dwBufSize);
						fileStream.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			if(dwAlarmType == FinalVar.EVENT_IVS_TRAFFIC_MANUALSNAP) //手动抓拍
			{
				DEV_EVENT_TRAFFIC_MANUALSNAP_INFO trafficInfo = (DEV_EVENT_TRAFFIC_MANUALSNAP_INFO)alarmInfo;
				ToolKits.writeLog("DevicePicUpload DEV_EVENT_TRAFFIC_MANUALSNAP_INFO plate color:： " + new String(trafficInfo.stTrafficCar.szPlateColor) + "plate type: " + new String(trafficInfo.stTrafficCar.szPlateType)
						+ "Vehicle color:" + trafficInfo.stuVehicle.rgbaMainColor + " vehicle number: " + new String(trafficInfo.stTrafficCar.szPlateNumber));

				ToolKits.writeLog("Year: " + trafficInfo.UTC.dwYear + "mon: " + trafficInfo.UTC.dwMonth + "day: " + trafficInfo.UTC.dwDay +
						"hour: " + trafficInfo.UTC.dwHour);

				String strFileName = "";
				if (ToolKits.createFile("/mnt/sdcard/NetSDK/", "trafficManualSnap.jpg")) {
					strFileName = "/mnt/sdcard/NetSDK/trafficManualSnap.jpg";
				}
				if ("" != strFileName) {
					FileOutputStream fileStream;
					try {
						fileStream = new FileOutputStream(strFileName, true);
						fileStream.write(pBuffer, 0, dwBufSize);
						fileStream.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			return;
		}
	}

	public void TestRealLoadPicEx() {

		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}

			@Override
			protected  Integer doInBackground(Void... params) {
				DevicePicUpload cbProc = new DevicePicUpload();
				lanalyHandle = INetSDK.RealLoadPictureEx(
						TestNetSDKActivity.m_loginHandle, 0, FinalVar.EVENT_IVS_ALL, true, cbProc, 0);
				if (lanalyHandle != 0) {
					// start listen upload pic and info ok
					ToolKits.writeLog(" 手动抓拍触发0通道");
					MANUAL_SNAP_PARAMETER stuSanpParam = new MANUAL_SNAP_PARAMETER();
					stuSanpParam.nChannel = 0;
					boolean bret  = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_MANUAL_SNAP, stuSanpParam, 3000);
					if(!bret)
					{
						ToolKits.writeLog("手动抓拍失败");
					}

					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					//INetSDK.StopLoadPic(lHandle);
				} else {
					// start listen upload pic and info failed
					int nErr = INetSDK.GetLastError();
				}

				return 0;
			}
			@Override
			protected void onPostExecute(Integer result) {
				ToolKits.writeLog("SimpleAsyncTask result: " + result);
			}
		}.execute();

	}

	public void testDownloadFile() {

	}

	public class TestfGpsInfoCallBack implements CB_fSubcribeGPSCallBack {
		@Override
		public void invoke(long lLoginID, GPS_Info gpsInfo) {
			ToolKits.writeLog("TestfGpsInfoCallBack");
		}
	}

	public void testGpsInfo() {
		TestfGpsInfoCallBack stCb = new TestfGpsInfoCallBack();
		INetSDK.SetSubcribeGPSCallBack(stCb);

		INetSDK.SubcribeGPS(TestNetSDKActivity.m_loginHandle, true, 3000, 3);

		try {
			Thread.sleep(10);
		} catch (Exception e) {
			e.printStackTrace();
		}

		INetSDK.SubcribeGPS(TestNetSDKActivity.m_loginHandle, false, 0, 0);
	}

	public void testSetSpeedLimit() {

		int nChannel = 0;
		SDKDEV_ABOUT_VEHICLE_CFG stOut[] = new SDKDEV_ABOUT_VEHICLE_CFG[1];
		stOut[0] = new SDKDEV_ABOUT_VEHICLE_CFG();
		int nRetLen = 0;
		boolean bRet = INetSDK.GetDevConfig(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEV_ABOUT_VEHICLE_CFG, nChannel, stOut, nRetLen,
				3000);
		if (!bRet) {
			return;
		}

		bRet = INetSDK.SetDevConfig(TestNetSDKActivity.m_loginHandle,
				FinalVar.SDK_DEV_ABOUT_VEHICLE_CFG, nChannel, stOut, 5000);
		if (bRet) {
			//
		} else {
			//
		}
	}

	public class TestfBurnFileCallBack implements CB_fBurnFileCallBack {
		@Override
		public void invoke(long lLoginID, long lUploadHandle, int nTotalSize,
						   int nSendSize) {
			ToolKits.writeLog("TestfBurnFileCallBack");
		}
	}

	public class TestfAnalyzerDataCallBack implements CB_fAnalyzerDataCallBack {
		@Override
		public void invoke(long lAnalyzerHandle, int dwAlarmType,
						   Object pAlarmInfo, byte pBuffer[], int dwBufSize,
						   int nSequence, int reserved) {
			ToolKits.writeLog("TestfAnalyzerDataCallBack");
		}
	}

	public class TestfDecPlayBackPosCallBack implements
			CB_fDecPlayBackPosCallBack {
		@Override
		public void invoke(long lLoginID, int nEncoderID, int dwTotalSize,
						   int dwPlaySize) {
			ToolKits.writeLog("TestfDecPlayBackPosCallBack");
		}
	}

	public class TestfMessDataCallBack implements CB_fMessDataCallBack {
		@Override
		public void invoke(long lCommand, NET_CALLBACK_DATA lpData) {
			ToolKits.writeLog("TestfMessDataCallBack");
		}
	}

	public class TestfSnapRev implements CB_fSnapRev {
		@Override
		public void invoke(long lLoginID, byte pBuf[], int RevLen,
						   int EncodeType, int CmdSerial) {
			ToolKits.writeLog("TestfSnapRev");
		}
	}

	public class TestfSearchDevicesCB implements CB_fSearchDevicesCB {
		@Override
		public void invoke(DEVICE_NET_INFO_EX pDevNetInfo) {
			ToolKits.writeLog("TestfSearchDevicesCB");
			ToolKits.writeLog(new String(pDevNetInfo.szIP));
		}
	}

	public class TestfTransComCallBack implements CB_fTransComCallBack {
		@Override
		public void invoke(long lLoginID, long lTransComChannel,
						   byte pBuffer[], int dwBufSize) {
			ToolKits.writeLog("TestfTransComCallBack");
		}
	}

	public class TestMessageCallBack implements CB_fMessageCallBack {
		@Override
		public boolean invoke(int lCommand, long lLoginID, Object obj,
							  String pchDVRIP, int nDVRPort) {
			ToolKits.writeLog("TestMessageCallBack");
			if (FinalVar.SDK_ALARM_ARMMODE_CHANGE_EVENT == lCommand) {
				ALARM_ARMMODE_CHANGE_INFO stInfo = (ALARM_ARMMODE_CHANGE_INFO) obj;
				ToolKits.writeLog("emTriggerMode" + stInfo.emTriggerMode);
			} else if (FinalVar.SDK_ALARM_BYPASSMODE_CHANGE_EVENT == lCommand) {
				ALARM_BYPASSMODE_CHANGE_INFO stInfo = (ALARM_BYPASSMODE_CHANGE_INFO) obj;
				ToolKits.writeLog("emTriggerMode" + stInfo.emTriggerMode);
			}
			// 上传中盟失败数据个数（对应结构体ALARM_UPLOADPIC_FAILCOUNT_INFO）
			else if (FinalVar.SDK_ALARM_UPLOADPIC_FAILCOUNT == lCommand) {
				ALARM_UPLOADPIC_FAILCOUNT_INFO stInfo = (ALARM_UPLOADPIC_FAILCOUNT_INFO) obj;
				ToolKits.writeLog("TestMessageCallBack SDK_ALARM_UPLOADPIC_FAILCOUNT: "
						+ "failCount: " + stInfo.nFailCount);
			} else if (FinalVar.SDK_ALARM_UPLOAD_PIC_FAILED == lCommand) {
				ALARM_UPLOAD_PIC_FAILED_INFO stInfo = (ALARM_UPLOAD_PIC_FAILED_INFO)obj;
				ToolKits.writeLog("SDK_ALARM_UPLOAD_PIC_FAILED, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_HEATIMG_TEMPER == lCommand) {
				ALARM_HEATIMG_TEMPER_INFO stInfo = (ALARM_HEATIMG_TEMPER_INFO)obj;
				ToolKits.writeLog("测温点温度异常 SDK_ALARM_HEATIMG_TEMPER, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_BETWEENRULE_TEMP_DIFF == lCommand) {
				ALARM_BETWEENRULE_DIFFTEMPER_INFO stInfo = (ALARM_BETWEENRULE_DIFFTEMPER_INFO)obj;
				ToolKits.writeLog("规则间温差异常 SDK_ALARM_BETWEENRULE_TEMP_DIFF, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_HOTSPOT_WARNING == lCommand) {
				ALARM_HOTSPOT_WARNING_INFO stInfo = (ALARM_HOTSPOT_WARNING_INFO)obj;
				ToolKits.writeLog("热点异常 SDK_ALARM_HOTSPOT_WARNING, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_COLDSPOT_WARNING == lCommand) {
				ALARM_COLDSPOT_WARNING_INFO stInfo = (ALARM_COLDSPOT_WARNING_INFO)obj;
				ToolKits.writeLog("冷点异常 SDK_ALARM_COLDSPOT_WARNING, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_FIREWARNING_INFO == lCommand) {
				ALARM_FIREWARNING_INFO_DETAIL stInfo = (ALARM_FIREWARNING_INFO_DETAIL)obj;
				ToolKits.writeLog("火情报警信息 SDK_ALARM_FIREWARNING_INFO, nChannel = " + stInfo.nChannel);
				for (int i = 0; i < stInfo.nWarningInfoCount; i ++) {
					ToolKits.writeLog("Count = " + i +"SDK_ALARM_FIREWARNING_INFO, nPresetId = " + stInfo.stuFireWarningInfo[i].nPresetId);
				}
			} else if (FinalVar.SDK_ALARM_FIREWARNING == lCommand) {
				ALARM_FIREWARNING_INFO stInfo = (ALARM_FIREWARNING_INFO)obj;
				ToolKits.writeLog("着火点报警事件 SDK_ALARM_FIREWARNING, nChannel = " + stInfo.nChannel);
				ToolKits.writeLog("着火点报警事件  SDK_ALARM_FIREWARNING, nState = " + stInfo.nState);
			} else if (FinalVar.SDK_ALARM_FACE_OVERHEATING == lCommand) {
				ALARM_FACE_OVERHEATING_INFO stInfo = (ALARM_FACE_OVERHEATING_INFO)obj;
				ToolKits.writeLog("人体发热预 SDK_ALARM_FACE_OVERHEATING, nRelativeId = " + stInfo.nRelativeId);
				ToolKits.writeLog("人体发热预 SDK_ALARM_FACE_OVERHEATING, nTemperatureUnit = " + stInfo.nTemperatureUnit);
				ToolKits.writeLog("人体发热预 SDK_ALARM_FACE_OVERHEATING, fTemperature = " + stInfo.fTemperature);
			}
			return true;
		}
	}

	public class TestServiceCallBack implements CB_fServiceCallBack {
		@Override
		public int invoke(long lHandle, String pIp, short wPort, int lCommand,
						  Object pParam) {
			ToolKits.writeLog("TestServiceCallBack");
			return 0;
		}
	}

	public class TestpfAudioDataCallBack implements CB_pfAudioDataCallBack {
		@Override
		public void invoke(long lTalkHandle, byte pDataBuf[], byte byAudioFlag) {
			ToolKits.writeLog("TestpfAudioDataCallBack");
		}
	}

	// test query device log
	void TestQueryDeviceLog() {
		QUERY_DEVICE_LOG_PARAM queryDevLog = new QUERY_DEVICE_LOG_PARAM();
		queryDevLog.emLogType = (int) (SDK_LOG_QUERY_TYPE.SDKLOG_ALL); // enumeration
		// value,
		// as:
		// SDK_LOG_QUERY_TYPE
		queryDevLog.nLogStuType = 1;
		queryDevLog.nStartNum = 0;
		queryDevLog.nEndNum = 99;

		NET_TIME stBegin = new NET_TIME();
		stBegin.dwYear = 2016;
		stBegin.dwMonth = 5;
		stBegin.dwDay = 24;
		stBegin.dwHour = 0;
		stBegin.dwMinute = 0;
		queryDevLog.stuStartTime = stBegin;

		NET_TIME stEnd = new NET_TIME();
		stEnd.dwYear = 2016;
		stEnd.dwMonth = 6;
		stEnd.dwDay = 23;
		stEnd.dwHour = 23;
		stEnd.dwMinute = 59;
		queryDevLog.stuEndTime = stEnd;

		SDK_DEVICE_LOG_ITEM_EX[] sdkDeviceLog = new SDK_DEVICE_LOG_ITEM_EX[100];
		for (int i = 0; i < 100; i++)
			sdkDeviceLog[i] = new SDK_DEVICE_LOG_ITEM_EX();

		Integer recLogNum = new Integer(0);
		boolean bSuccess = INetSDK.QueryDeviceLog(TestNetSDKActivity.m_loginHandle,
				queryDevLog, sdkDeviceLog, recLogNum, 3000);

		if (bSuccess) {
			for (int i= 0; i < recLogNum; i++) {
				String log = "The " + (i + 1) + "th log: \n";
				log = log + sdkDeviceLog[i].stuOperateTime.year + "/" + sdkDeviceLog[i].stuOperateTime.month + "/" + sdkDeviceLog[i].stuOperateTime.day
						+ " " + sdkDeviceLog[i].stuOperateTime.hour + ":" + sdkDeviceLog[i].stuOperateTime.minute + ":" + sdkDeviceLog[i].stuOperateTime.second + " ";

				int nValid = 0;
				byte detail[];
				for (int j = 0; j < sdkDeviceLog[i].szDetailContext.length; j++) {
					if (sdkDeviceLog[i].szDetailContext[j] == 0) {
						break;
					}
					nValid++;
				}

				if (nValid != 0) {
					detail = new byte[nValid];
					for (int j = 0; j < nValid; j++) {
						detail[j] = (byte)sdkDeviceLog[i].szDetailContext[j];
					}

					String strDetail = new String(detail);
					log = log + strDetail;
				}

				log += "\n";
				ToolKits.writeLog(log);
			}
		}
	}

	// 获取操作员用户名
	void TestGetOperatorName()
	{
		NET_IN_GET_OPERATOR_NAME  stInGetOperatorName = new NET_IN_GET_OPERATOR_NAME();
		NET_OUT_GET_OPERATOR_NAME stOutGetOperatorName = new NET_OUT_GET_OPERATOR_NAME();
		boolean bSuccess = INetSDK.GetOperatorName(TestNetSDKActivity.m_loginHandle, stInGetOperatorName, stOutGetOperatorName, 3000);
		try {
			String strName = new String(stOutGetOperatorName.szOpearatorName);
			ToolKits.writeLog("GetOperatorName bSuccess: " + bSuccess + "name: " + strName);
		} catch(Exception e)
		{

		}
	}

	// 获取设备刻录信息， 这些接口不要在UI线程中处理，放到子线程处理
	void TestQueryBurnDevInfo()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}
			@Override
			protected  Integer doInBackground(Void... params)
			{
				try {
					SDK_BURNING_DEVINFO burnDevInfo = new SDK_BURNING_DEVINFO();
					boolean bRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_BURNING_DEV, burnDevInfo, 5000);
					if (bRet)
					{
						ToolKits.writeLog("query burn dev info success");
						ToolKits.writeLog("burn dev devnum: " + burnDevInfo.dwDevNum);
						for(int i = 0; i < burnDevInfo.dwDevNum; i++)
						{
							ToolKits.writeLog("burn info:  busType: " + burnDevInfo.stDevs[i].dwBusType +
									" driverType: " + burnDevInfo.stDevs[i].dwDriverType + " remainSpace: " + burnDevInfo.stDevs[i].dwRemainSpace +
									" totalSpace: " + burnDevInfo.stDevs[i].dwTotalSpace + " driverName: " +
									new String(burnDevInfo.stDevs[i].dwDriverName));
						}
					}
					else
					{
						ToolKits.writeErrorLog("query burn dev info err:" + INetSDK.GetLastError());
						return -1;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}

				return 0;
			}
			@Override
			protected void onPostExecute(Integer result) {
				ToolKits.writeLog("SimpleAsyncTask result: " + result);
			}
		}.execute();
	}

	// 取刻录会话总数， 这些接口不要在UI线程中处理，放到子线程处理
	void TestQueryBurnSessionNum()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}
			@Override
			protected  Integer doInBackground(Void... params)
			{
				try {
					Integer nBurnSessionm = new Integer(0);
					boolean bRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_BURN_SESSION_NUM, nBurnSessionm, 5000);
					if (bRet)
					{
						ToolKits.writeLog("query burn session num success num: " + nBurnSessionm);
					}
					else
					{
						ToolKits.writeErrorLog("query burn session num err:" + INetSDK.GetLastError());
						return -1;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				return 0;
			}
			@Override
			protected void onPostExecute(Integer result) {
				ToolKits.writeLog("SimpleAsyncTask result: " + result);
			}
		}.execute();
	}

	// 测试刻录相关功能（开始/停止刻录会话  开始/停止 刻录，暂停/恢复刻录), 这些接口不要在UI线程中处理，放到子线程处理
	void TestBurnFunction()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}
			@Override
			protected  Integer doInBackground(Void... params)
			{
				try {

					//////////////////////打开刻录会话/////////////////////////////////////////////
					NET_IN_START_BURN_SESSION stuInStartBurnSession = new NET_IN_START_BURN_SESSION();
					stuInStartBurnSession.nSessionID = 0; //从0开始

					NET_OUT_START_BURN_SESSION stuOutStartBurnSession = new NET_OUT_START_BURN_SESSION();
					long lBurnSession = INetSDK.StartBurnSession(TestNetSDKActivity.m_loginHandle, stuInStartBurnSession,
							stuOutStartBurnSession, 3000);
					ToolKits.writeLog("StartBurnSession result: " + lBurnSession);

					//////////////////////////////////////开始刻录/////////////////////////////////////
					NET_IN_START_BURN	 stuInStartBurn = new NET_IN_START_BURN();
					stuInStartBurn.nDevMask |= (1 << 1); //从0开始，这里刻录设备第2个有效(每位代表是否有效)

					stuInStartBurn.nChannelCount = 1;
					stuInStartBurn.szChannels[0] = 1;  //这里测试只第2个通道

					stuInStartBurn.emMode = NET_BURN_MODE.BURN_MODE_SYNC;
					stuInStartBurn.emPack = NET_BURN_RECORD_PACK.BURN_PACK_DHAV;

					NET_OUT_START_BURN stuOutStartBurn = new NET_OUT_START_BURN();

					boolean bStartBurn = INetSDK.StartBurn(lBurnSession, stuInStartBurn, stuOutStartBurn, 3000);
					ToolKits.writeLog("StartBurn result: " + bStartBurn);



					//  获取刻录状态
						/* NET_IN_BURN_GET_STATE stuInBurnGetState = new  NET_IN_BURN_GET_STATE();
						 NET_OUT_BURN_GET_STATE stuOutBurnGetState = new NET_OUT_BURN_GET_STATE();
						 boolean bBurnGetState = INetSDK.BurnGetState(lBurnSession, stuInBurnGetState, stuOutBurnGetState, 3000);
						 ToolKits.writeLog("BurnGetState result: " + bBurnGetState);
						 if(bBurnGetState)
						 {
							 ToolKits.writeLog("BurnGetState emState: " + stuOutBurnGetState.emState + "emErrorCode: "
									 + stuOutBurnGetState.emErrorCode);
						 }*/


					///////////////////////////////////监听刻录状态/////////////////////////////////////////////////////
					NET_IN_ATTACH_STATE stuInAttachState = new NET_IN_ATTACH_STATE();
					stuInAttachState.lBurnSession  = lBurnSession;
					stuInAttachState.cbAttachState = new CB_fAttachBurnStateCB() {
						@Override
						public void invoke(long lLoginID, long lAttachHandle,  final long lBurnSession,  NET_OUT_BURN_GET_STATE burnState)
						{
							ToolKits.writeLog("call back burn state emState: " + burnState.emState + "emErrorCode: " + burnState.emErrorCode
									+ "lBurnSession: " + lBurnSession);

							// 当刻录状态为run的时候，可以做打点，暂停/恢复。停止刻录等操作
							if(NET_BURN_STATE.BURN_STATE_BURNING == burnState.emState)
							{

								new Thread(new Runnable() {
									@Override
									public void run() {
										Looper.prepare();

										////////////////////////////打点，重点标记///////////////////////////////////////
										NET_IN_BURN_MARK_TAG stuInBurnMarkTag = new NET_IN_BURN_MARK_TAG();
										stuInBurnMarkTag.szDescInfo = "mark tag";
										NET_OUT_BURN_MARK_TAG stuOutBurnMarkTag = new NET_OUT_BURN_MARK_TAG();

										boolean bMarkTag = INetSDK.BurnMarkTag(lBurnSession, stuInBurnMarkTag, stuOutBurnMarkTag, 3000);
										ToolKits.writeLog("mark tag result: " + bMarkTag);

												 /*
												 /////////////////////////////////暂停刻录//////////////////////////////////////
												 boolean bPauseBurn = INetSDK.PauseBurn(lBurnSession, true);
												 ToolKits.writeLog("Pause burn result: " + bPauseBurn);

												 /////////////////////////////////恢复刻录//////////////////////////////////////
												 boolean bRestore = INetSDK.PauseBurn(lBurnSession, false);
												 ToolKits.writeLog("restore burn result: " + bRestore);

												 /////////////////////////////////停止刻录//////////////////////////////////////
												 boolean bStopBurn = INetSDK.StopBurn(lBurnSession);
												 ToolKits.writeLog("StopBurn result: " + bStopBurn);*/

										Looper.loop();
									}
								}).start();
							}
						}
					};

					NET_OUT_ATTACH_STATE stuOutAttachState = new NET_OUT_ATTACH_STATE();
					long lAttachHandle =  INetSDK.AttachBurnState(TestNetSDKActivity.m_loginHandle, stuInAttachState, stuOutAttachState, 3000);

					//Thread.currentThread().sleep(20 * 1000, 0);

					///////////////////////////////////取消监听刻录状态/////////////////////////////////////////////////////
					// boolean bDetachBurnState =  INetSDK.DetachBurnState(lAttachHandle);
					// ToolKits.writeLog("DetachBurnState result: " + bDetachBurnState);

					/////////////////////////////////关闭刻录会话//////////////////////////////////////
					// boolean bStopBurnSession = INetSDK.StopBurnSession(lBurnSession);
					// ToolKits.writeLog("StopBurnSession result: " + bStopBurnSession);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				return 0;
			}
			@Override
			protected void onPostExecute(Integer result) {
				ToolKits.writeLog("SimpleAsyncTask result: " + result);
			}
		}.execute();
	}

	//测试庭审主机配置
	void TestCourtHearingConfig()
	{

		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}
			@Override
			protected  Integer doInBackground(Void... params)
			{
				try {
					int nChannelNum = TestNetSDKActivity.deviceInfo.byChanNum & 0xff;
					ToolKits.writeLog("TestCourtHearingConfig nChannelNum: " + nChannelNum);

					boolean bRet = false;

					/////////////////////////一键静音的配置/////////////////////////////////

					CFG_AUDIO_MATRIX_SILENCE stuAudioMatrixSilence = new CFG_AUDIO_MATRIX_SILENCE(5);

					bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_AUDIO_MATRIX_SILENCE, stuAudioMatrixSilence,
							TestNetSDKActivity.m_loginHandle, 0,  1024 * 10);

					if (bRet)
					{
						ToolKits.writeLog("get audio matrix  silence success : " + bRet);

						stuAudioMatrixSilence.nMaxInputListCount = 1;
						stuAudioMatrixSilence.nRetInputListCountOut = 1;
						stuAudioMatrixSilence.pstSilenceInputChn[0].nMatrix = 0;
						stuAudioMatrixSilence.pstSilenceInputChn[0].nOutChannel = 0;
						stuAudioMatrixSilence.pstSilenceInputChn[0].nInputChnConut = 2;
						stuAudioMatrixSilence.pstSilenceInputChn[0].snInputChannel[0] = 1;
						stuAudioMatrixSilence.pstSilenceInputChn[0].snInputChannel[1] = 2;
						bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_AUDIO_MATRIX_SILENCE, stuAudioMatrixSilence,
								TestNetSDKActivity.m_loginHandle, 0, 1024 * 10);
						ToolKits.writeErrorLog("set audio matrix  silence bRet: "  + bRet);

					}
					else
					{
						ToolKits.writeErrorLog("get audio matrix  silence err: " + INetSDK.GetLastError());
					}

					///////////////////一键静音控制接口////////////////////////////////////

					bRet = false;
					NET_IN_AUDIO_MATRIX_SILENCE stuInAudioMatrixSilence = new NET_IN_AUDIO_MATRIX_SILENCE(1);
					stuInAudioMatrixSilence.bEnable = true;
					stuInAudioMatrixSilence.stSlienceChannel[0].nMatrix = 0;
					stuInAudioMatrixSilence.stSlienceChannel[0].nOutChannel = 2;
					stuInAudioMatrixSilence.stSlienceChannel[0].nOutPutChannel[0] = 0;
					stuInAudioMatrixSilence.stSlienceChannel[0].nOutPutChannel[1] = 1;

					NET_OUT_AUDIO_MATRIX_SILENCE stuOutAudioMatrixSilence = new NET_OUT_AUDIO_MATRIX_SILENCE();

					bRet = INetSDK.ControlDeviceEx(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_AUDIO_MATRIX_SILENCE, stuInAudioMatrixSilence,
							stuOutAudioMatrixSilence, 3000);
					ToolKits.writeErrorLog("ControlDeviceEx audio matrix silence bRet: "  + bRet);

			    		 /*
			    		 /////////////////////////////////////////////语言激励配置////////////////////////////////////////////////////
			    		 CFG_AUDIO_SPIRIT stuAudioSpirit = new CFG_AUDIO_SPIRIT(nChannelNum);


			    		boolean bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_AUDIO_SPIRIT, stuAudioSpirit,
			    				TestNetSDKActivity.m_loginHandle, -1, 2048);

						if (bRet)
						{
							ToolKits.writeLog("get audio spirit config success " + " bEnable: " + stuAudioSpirit.bEnable +
									" nAudioLimit: " + stuAudioSpirit.nAudioLimit +  " nDelayTime " +
									stuAudioSpirit.nDelayTime);


							bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_AUDIO_SPIRIT, stuAudioSpirit,
				    				TestNetSDKActivity.m_loginHandle, -1, 2048);
							ToolKits.writeErrorLog("set audio spirit config result bRet: "  + bRet);

						}
						else
						{
							ToolKits.writeErrorLog("get audio spirit config err: " + INetSDK.GetLastError());
						}


						/////////////////////////////////////合成通道配置//////////////////////////////////////////////////////////////
						CFG_COMPOSE_CHANNEL stuCompseChannel = new CFG_COMPOSE_CHANNEL();

				    		 bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_COMPOSE_CHANNEL, stuCompseChannel,
				    				TestNetSDKActivity.m_loginHandle, 0, 2048);

							if (bRet)
							{
								ToolKits.writeLog("get commpose channel success ");

								bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_COMPOSE_CHANNEL, stuCompseChannel,
					    				TestNetSDKActivity.m_loginHandle, 0, 2048);
								ToolKits.writeErrorLog("set commpose channe bRet: "  + bRet);

							}
							else
							{
								ToolKits.writeErrorLog("get commpose channel err: " + INetSDK.GetLastError());
							}

						 ///////////////////////////////////////////查询下位矩阵输出通道名称/////////////////////////////////////////////////////////////////
						 //下位矩阵配置
							CFG_LOWER_MATRIX_LIST stuLowerMatrixList = new CFG_LOWER_MATRIX_LIST();

				    		 bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_LOWER_MATRIX, stuLowerMatrixList,
				    				TestNetSDKActivity.m_loginHandle, -1, 2048);

							if (bRet)
							{
								ToolKits.writeLog("get lower matrix success ");

								bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_LOWER_MATRIX, stuLowerMatrixList,
					    				TestNetSDKActivity.m_loginHandle, -1, 2048);
								ToolKits.writeErrorLog("set lower matrix bRet: "  + bRet);

							}
							else
							{
								ToolKits.writeErrorLog("get lower matrix err: " + INetSDK.GetLastError());
							}*/

					//////////////////////////////////////////////////////////////////////////////////////////////////
					return bRet ? 1 : 0;

				}
				catch (Exception e) {
					e.printStackTrace();
				}
				return 0;
			}
			@Override
			protected void onPostExecute(Integer result) {
				ToolKits.writeLog("SimpleAsyncTask result: " + result);
			}
		}.execute();
	}

	// 测试庭审主机相关接口
	void TestCourtHearingInterface()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
			}
			@Override
			protected  Integer doInBackground(Void... params)
			{
				try {

					boolean bRet = false;
			    		/*
			    			//////////////////////////////////////查询一级输出切换能力///////////////////////////////////////////
				    		SDK_SPLIT_CAPS splitCaps = new  SDK_SPLIT_CAPS();
				    		bRet = INetSDK.GetSplitCaps(TestNetSDKActivity.m_loginHandle, 1, splitCaps, 3000);
				    		ToolKits.writeLog("GetSplitCaps result: " + bRet);
				    		if(bRet)
				    		{
				    			for(int i = 0; i < splitCaps.nModeCount; i++)
				    			{
				    				ToolKits.writeLog("GetSplitCaps i =   "+ i  +  " emSplitMode: " + splitCaps.emSplitMode[i]);
				    			}
				    			for(int i =0 ; i < splitCaps.nInputChannelCount; i++)
				    			{
				    				ToolKits.writeLog("GetSplitCaps i =   "+ i  +   " szInputChannels: " + splitCaps.szInputChannels[i]);
				    			}
				    		}

				    		bRet = false;
				    		////////////////////////////////////查询分割模式/////////////////////////////////////////////
				    		SDK_SPLIT_MODE_INFO splitModeInfo = new SDK_SPLIT_MODE_INFO();
				    		bRet = INetSDK.GetSplitMode(TestNetSDKActivity.m_loginHandle, 1, splitModeInfo, 3000);
				    		ToolKits.writeLog("GetSplitMode result: " + bRet);
				    		if(bRet)
				    		{
				    			ToolKits.writeLog("GetSplitMode emSplitMode: " + splitModeInfo.emSplitMode + " nGroupID: " + splitModeInfo.nGroupID);
				    		}

				    		// SetSplitMode已经封装，但 设备不支持，

				    		///////////////////////////////////查询显示源/////////////////////////////////////////////////////////
				    		bRet = false;
				    		int nMaxSplitSource = 10;
				    		Integer nRetCount= new Integer(0);
				    		SDK_SPLIT_SOURCE szStuSplitSource[] = new SDK_SPLIT_SOURCE[nMaxSplitSource];
				    		for(int i = 0; i < nMaxSplitSource; i++)
				    		{
				    			szStuSplitSource[i] = new SDK_SPLIT_SOURCE();
				    		}
				    		bRet = INetSDK.GetSplitSource(TestNetSDKActivity.m_loginHandle, 0, 1, szStuSplitSource, nRetCount, 3000);
				    		ToolKits.writeLog("GetSplitMode GetSplitSource  result: " + bRet + " nRetCount: " + nRetCount);

				    		// 设置显示源 SetSplitSource已经封装，但设备不支持

				    		////////////////////////////////////设置显示源, 支持同时设置多个窗口///////////////////////////////////////

				    		NET_IN_SPLIT_SET_MULTI_SOURCE stuInSplitSetMulitSource = new NET_IN_SPLIT_SET_MULTI_SOURCE(1);
				    		stuInSplitSetMulitSource.emCtrlType = EM_VIDEO_OUT_CTRL_TYPE.EM_VIDEO_OUT_CTRL_CHANNEL;
				    		stuInSplitSetMulitSource.nChannel   = 1;
				    		stuInSplitSetMulitSource.bSplitModeEnable = true;
				    		stuInSplitSetMulitSource.emSplitMode = SDK_SPLIT_MODE.SDK_SPLIT_1;
				    		stuInSplitSetMulitSource.nGroupID    = 0;
				    		stuInSplitSetMulitSource.nWindowCount  = 1;
				    		stuInSplitSetMulitSource.szWindows[0] = 0;
				    		String DeviceID = "Unique";
				    		System.arraycopy(DeviceID.toCharArray(), 0,stuInSplitSetMulitSource.szStuSources[0].szDeviceID, 0,
				    				DeviceID.length());

				    		stuInSplitSetMulitSource.szStuSources[0].bEnable    = true;
				    		stuInSplitSetMulitSource.szStuSources[0].nInterval  = 0;
				    		stuInSplitSetMulitSource.szStuSources[0].nVideoChannel = 0;
				    		stuInSplitSetMulitSource.szStuSources[0].nStreamType  = 0;
				    		ToolKits.writeLog("stuInSplitSetMulitSource.szStuSources[0].szDeviceID:" + stuInSplitSetMulitSource.szStuSources[0].szDeviceID);

				    		NET_OUT_SPLIT_SET_MULTI_SOURCE stuOutSplitSetMulitSource = new NET_OUT_SPLIT_SET_MULTI_SOURCE();
				    		bRet = INetSDK.SplitSetMultiSource(TestNetSDKActivity.m_loginHandle, stuInSplitSetMulitSource,
				    				stuOutSplitSetMulitSource, 3000);

				    		ToolKits.writeLog("SplitSetMultiSource bRet:" + bRet);


				    		/////////////////////////////配置下位矩阵切换////////////////////////////////
				    		NET_IN_MATRIX_SWITCH stuMatrixSwitchIn = new NET_IN_MATRIX_SWITCH(1, 1);
				    	    NET_OUT_MATRIX_SWITCH stuMatrixSwitchOut = new NET_OUT_MATRIX_SWITCH();
				    	    int nChannel = 1;
				    	    int nOutChannel = 1;

				    	    stuMatrixSwitchIn.emSplitMode = SDK_SPLIT_MODE.SDK_SPLIT_6;
				    	    stuMatrixSwitchIn.szOutputChannels[0] = nChannel;
				    	    stuMatrixSwitchIn.szInputChannels[0] = nOutChannel;
				    	    bRet = false;
				    	    bRet = INetSDK.MatrixSwitch(TestNetSDKActivity.m_loginHandle, stuMatrixSwitchIn, stuMatrixSwitchOut, 3000);
				    	    ToolKits.writeLog("MatrixSwitch bRet:" + bRet);*/

					//////////// 查询外接设备//////////////////////////////////////////////////////
					NET_EXTERNAL_DEVICE stuExternalDev = new NET_EXTERNAL_DEVICE();
					bRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
							FinalVar.SDK_DEVSTATE_EXTERNAL_DEVICE, stuExternalDev, 5000);
					if (bRet)
					{
						ToolKits.writeLog("query external device info success ");
						ToolKits.writeLog("device type:" + stuExternalDev.emType + "  device id:" + stuExternalDev.szDevID
								+ "  device name:" + stuExternalDev.szDevName);
					}

					//////////// 时序器操作//////////////////////////////////////////////////////

					////////////////////////////////////////////////红外面板模板配置/////////////////////////////////////////

					CFG_INFRARED_BOARD_TEMPLATE_GROUP stuInfraredBoardTemplateGroup = new CFG_INFRARED_BOARD_TEMPLATE_GROUP();

					bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_INFRARED_BOARD_TEMPLATE, stuInfraredBoardTemplateGroup,
							TestNetSDKActivity.m_loginHandle, 0, 2048);

					if (bRet)
					{
						ToolKits.writeLog("get infrared board template group success ");

						bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_INFRARED_BOARD_TEMPLATE, stuInfraredBoardTemplateGroup,
								TestNetSDKActivity.m_loginHandle, 0, 2048);
						ToolKits.writeErrorLog("set infrared board template group succes bRet: "  + bRet);

					}
					else
					{
						ToolKits.writeErrorLog("get infrared board template group  err: " + INetSDK.GetLastError());
					}

					///////////////////////////////////////////////////////////红外面板配置///////////////////

					CFG_INFRARED_BOARD_GROUP stuInfraredBoardTGroup = new CFG_INFRARED_BOARD_GROUP();

					bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_INFRARED_BOARD, stuInfraredBoardTGroup,
							TestNetSDKActivity.m_loginHandle, 0, 2048);

					if (bRet)
					{
						ToolKits.writeLog("get infrared board  group success nBoardNum: " + stuInfraredBoardTGroup.nBoardNum);

						bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_INFRARED_BOARD, stuInfraredBoardTGroup,
								TestNetSDKActivity.m_loginHandle, 0, 2048);
						ToolKits.writeErrorLog("set infrared board  group succes bRet: "  + bRet);

					}
					else
					{
						ToolKits.writeErrorLog("get infrared board  group  err: " + INetSDK.GetLastError());
					}

					//////////////////////////////////////红外按键控制/////////////////////////////////////
					NET_CTRL_INFRARED_KEY_PARAM stCtrlInfraredKeyParam = new NET_CTRL_INFRARED_KEY_PARAM();
					stCtrlInfraredKeyParam.nChannel = 0;
					stCtrlInfraredKeyParam.nKey     = 1;
					boolean bControl = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_INFRARED_KEY, stCtrlInfraredKeyParam, 3000);
					ToolKits.writeErrorLog("ControlDevice infrared key  bRet: "  + bRet);

					/////////////////////////////////////上下位矩阵输出关系恢复/////////////////////////////////////////
					////////保存上下位矩阵输出关系///////////////
					NET_CTRL_MATRIX_SAVE_SWITCH stuMatrixSwitchSave = new NET_CTRL_MATRIX_SAVE_SWITCH();
					stuMatrixSwitchSave.pszName = "up-lower1";
					bControl = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_MATRIX_SAVE_SWITCH, stuMatrixSwitchSave, 3000);
					if (bControl)
					{
						ToolKits.writeLog("ControlDevice matrix  switch save success. Name: " + stuMatrixSwitchSave.pszName);
						//////////恢复上下位矩阵输出关系/////////////////
						NET_CTRL_MATRIX_RESTORE_SWITCH stuMatrixSwitchRestore = new NET_CTRL_MATRIX_RESTORE_SWITCH();
						stuMatrixSwitchRestore.pszName = "up-lower1";
						bControl = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTR_MATRIX_RESTORE_SWITCH, stuMatrixSwitchRestore, 3000);
						if (bControl)
						{
							ToolKits.writeLog("ControlDevice matrix  switch restore success. Name: " + stuMatrixSwitchSave.pszName);
						}
						else
						{
							ToolKits.writeErrorLog("ControlDevice matrix  switch restore  err: "  + INetSDK.GetLastError());
						}
					}
					else
					{
						ToolKits.writeErrorLog("ControlDevice matrix  switch save  err: "  + INetSDK.GetLastError());
					}


			    		 /*// 查询下位矩阵输入输出通道数
			    		 // 查询产品定义
			    		 SDK_PRODUCTION_DEFNITION stuProductionDefnition = new SDK_PRODUCTION_DEFNITION();
			    		 bRet = INetSDK.QueryProductionDefinition(TestNetSDKActivity.m_loginHandle, stuProductionDefnition, 3000);
			    		 ToolKits.writeLog("QueryProductionDefinition result: " + bRet);

			    		 if(bRet)
			    		 {
			    			 for(int i = 0; i < FinalVar.SDK_MAX_LOWER_MITRIX_NUM; i++)
			    			 {
			    				 ToolKits.writeLog("QueryProductionDefinition zLowerMatrixInputChannels i =  " + i + " inputChannel: " +
			    						 stuProductionDefnition.szLowerMatrixInputChannels[i]);
			    			 }
			    			 for(int i = 0; i < FinalVar.SDK_MAX_LOWER_MITRIX_NUM; i++)
			    			 {
			    				 ToolKits.writeLog("QueryProductionDefinition zLowerMatrixInputChannels i =  " + i + " OutputChannel: " +
			    						 stuProductionDefnition.szLowerMatrixOutputChannels[i]);
			    			 }
			    		 }
			    		 bRet = false;
			    		///////////////////////////////查询输入通道      获取所有有效显示源////////////////////////////////////////////////

			    	    SDK_IN_MATRIX_GET_CAMERAS stuInMatrixGetCameras = new SDK_IN_MATRIX_GET_CAMERAS();
			    	    SDK_OUT_MATRIX_GET_CAMERAS stuOutMatrixGetCameras = new SDK_OUT_MATRIX_GET_CAMERAS(50, 20);
			    	    bRet = INetSDK.MatrixGetCameras(TestNetSDKActivity.m_loginHandle, stuInMatrixGetCameras, stuOutMatrixGetCameras, 3000);
			    	    ToolKits.writeLog("MatrixGetCameras result: " + bRet);

			    	    if(bRet)
			    	    {
			    	    	 ToolKits.writeLog("MatrixGetCameras nRetCameraCount: " + stuOutMatrixGetCameras.nRetCameraCount  + " nRealChannelCount: " +
			    	    			 stuOutMatrixGetCameras.nRealChannelCount);

			    	    }*/







					//////////////////////////////////////////////////////////////////////////////////////////////////
					return bRet ? 1 : 0;

				}
				catch (Exception e) {
					e.printStackTrace();
				}
				return 0;
			}
			@Override
			protected void onPostExecute(Integer result) {
				ToolKits.writeLog("SimpleAsyncTask result: " + result);
			}
		}.execute();
	}

	void TestIVSInterface() {
		boolean zRet;

		CFG_ANALYSESOURCE_INFO stSrcInfo = new CFG_ANALYSESOURCE_INFO(32);
		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ANALYSESOURCE, stSrcInfo, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240);

		String strPath = "EFC/f2895162c1c14825bac8fe69f5ef574d.dav"/*"EFC/d6c089ca7e184c98aaed2628d26bf08c.dav"*/;
		stSrcInfo.bEnable = true;
		stSrcInfo.nChannelID = GlobalSettingActivity.m_nGlobalChn;
		stSrcInfo.abDeviceInfo = false;
		stSrcInfo.emSourceType = CFG_VIDEO_SOURCE_TYPE.CFG_VIDEO_SOURCE_FILESTREAM;
		stSrcInfo.stuSourceFile.emFileType = CFG_SOURCE_FILE_TYPE.CFG_SOURCE_FILE_RECORD;
		System.arraycopy(strPath.getBytes(), 0, stSrcInfo.stuSourceFile.szFilePath, 0, strPath.length());
		zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_ANALYSESOURCE, stSrcInfo, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240);

		long lAnalyzerHandle = INetSDK.RealLoadPictureEx(TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, FinalVar.EVENT_IVS_ALL, true, new Test_CB_fAnalyzerDataCallBack(), 0);

		NET_IN_ATTACH_VIDEOANALYSE_STATE stAttachIn = new NET_IN_ATTACH_VIDEOANALYSE_STATE();
		stAttachIn.nChannleId = GlobalSettingActivity.m_nGlobalChn;
		NET_OUT_ATTACH_VIDEOANALYSE_STATE stAttachOut = new NET_OUT_ATTACH_VIDEOANALYSE_STATE();
		zRet = INetSDK.AttachVideoAnalyseState(TestNetSDKActivity.m_loginHandle, stAttachIn, new Test_CB_fVideoAnalyseState(), stAttachOut, 5000);

		NET_CTRL_START_VIDEO_ANALYSE stStartAnalyse = new NET_CTRL_START_VIDEO_ANALYSE();
		stStartAnalyse.nChannelId = GlobalSettingActivity.m_nGlobalChn;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_START_VIDEO_ANALYSE, stStartAnalyse, 5000);

		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		NET_CTRL_STOP_VIDEO_ANALYSE stStopAnalyse = new NET_CTRL_STOP_VIDEO_ANALYSE();
		stStopAnalyse.nChannelId = GlobalSettingActivity.m_nGlobalChn;
		zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_STOP_VIDEO_ANALYSE, stStopAnalyse, 5000);

		zRet = INetSDK.DetachVideoAnalyseState(stAttachOut.lAttachHandle);

		zRet = INetSDK.StopLoadPic(lAnalyzerHandle);
	}

	void TTestVspScydkdInterface() {
		boolean zRet;

//		CFG_VSP_SCYDKD_INFO info = new CFG_VSP_SCYDKD_INFO();
//		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VSP_SCYDKD, info, TestNetSDKActivity.m_loginHandle, -1, 10240);
//		if (!zRet) {
//			ToolKits.showErrorMessage(this, "GetDevConfig failed, " + FinalVar.CFG_CMD_VSP_SCYDKD);
//		} else {
//			System.arraycopy("admin".getBytes(), 0, info.szUserName, 0, "admin".length());
//			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_VSP_SCYDKD, info, TestNetSDKActivity.m_loginHandle, -1, 10240);
//			if (!zRet) {
//				ToolKits.showErrorMessage(this, "SetDevConfig failed, " + FinalVar.CFG_CMD_VSP_SCYDKD);
//			}
//		}

//		CFG_COMPOSE_CHANNEL info2 = new CFG_COMPOSE_CHANNEL();
//		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_COMPOSE_LINKAGE, info2, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240);
//		if (!zRet) {
//			ToolKits.showErrorMessage(this, "GetDevConfig failed, " + FinalVar.CFG_CMD_COMPOSE_LINKAGE);
//		} else {
//			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_COMPOSE_LINKAGE, info2, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240);
//			if (!zRet) {
//				ToolKits.showErrorMessage(this, "SetDevConfig failed, " + FinalVar.CFG_CMD_COMPOSE_LINKAGE);
//			}
//		}

		NET_EXTERNAL_DEVICE device[] = new NET_EXTERNAL_DEVICE[8];
		for (int i = 0; i < device.length; i++) {
			device[i] = new NET_EXTERNAL_DEVICE();
		}
		zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_EXTERNAL_DEVICE, device, 3000);
		if (zRet) {
			for (int i = 0; i < device.length; i++) {
				if (device[i].emType == NET_EXT_DEV_TYPE.EXT_DEV_UNKNOWN) {
					break;
				}

				if (device[i].emType == NET_EXT_DEV_TYPE.EXT_DEV_SEQUENCE_POWER) {
					int n = 0;
					for (int j = 0; j < device[i].szDevID.length; j++) {
						if (device[i].szDevID[j] != 0) {
							n++;
						} else {
							break;
						}
					}

					NET_IN_CAP_SEQPOWER stIn = new NET_IN_CAP_SEQPOWER();
					stIn.pszDeviceID = new String(device[i].szDevID, 0, n);
					NET_OUT_CAP_SEQPOWER stOut = new NET_OUT_CAP_SEQPOWER();
					zRet = INetSDK.GetDevCaps(TestNetSDKActivity.m_loginHandle, FinalVar.NET_DEV_CAP_SEQPOWER, stIn, stOut, 3000);
					if (zRet) {
						ToolKits.writeLog("nChannelNum = " + stOut.nChannelNum);
					}
				}
			}
		}
	}

	void TestDownloadByTime() {
		NET_TIME beginTime = new NET_TIME();
		beginTime.dwYear = 2016;
		beginTime.dwMonth = 2;
		beginTime.dwDay = 23;

		NET_TIME endTime = new NET_TIME();
		endTime.dwYear = 2016;
		endTime.dwMonth = 2;
		endTime.dwDay = 23;
		endTime.dwHour = 0;
		endTime.dwMinute = 30;

		String recFileName = "/sdcard/NetSDK/downloadbytime.dav";

//		long lDownload = INetSDK.DownloadByTimeEx2(TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL,
//				beginTime, endTime, recFileName, new Test_CB_fTimeDownLoadPosCallBack(), new Test_CB_fDataCallBack(), SC_TYPE.SC_NONE, null);
		long lDownload = INetSDK.DownloadByTimeEx(TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL,
				beginTime, endTime, recFileName, new Test_CB_fTimeDownLoadPosCallBack(), new Test_CB_fDataCallBack(), null);
		if (lDownload != 0) {
			INetSDK.StopDownload(lDownload);
		}
//		if (0 != lDownload) {
//			try {
//				Thread.sleep(60000 * 5);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			INetSDK.StopDownload(lDownload);
//		}
	}

	public class Test_CB_fTimeDownLoadPosCallBack implements CB_fTimeDownLoadPosCallBack {
		@Override
		public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo) {
			//ToolKits.writeLog("lPlayHandle = " + lPlayHandle + ", dwTotalSize = " + dwTotalSize + ", dwDownLoadSize = " + dwDownLoadSize);
		}
	}

	public class Test_CB_fDataCallBack implements CB_fDataCallBack {
		@Override
		public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize) {
			// 如果需要转码，把这里的buffer和dwBufferSize传给转码库接口
			//ToolKits.writeLog("lRealHandle = " + lRealHandle + ", dwDataType = " + dwDataType + ", dwBufferSize = " + dwBufferSize);
			return 0;
		}
	}

	public class Test_CB_fVideoAnalyseState implements CB_fVideoAnalyseState {
		@Override
		public int invoke(long lAttachHandle, NET_VIDEOANALYSE_STATE pAnalyseStateInfos, Object pReserved) {
			ToolKits.writeLog("Test_CB_fVideoAnalyseState, dwProgress = " + pAnalyseStateInfos.dwProgress);
			return 0;
		}
	}

	public class Test_CB_fAnalyzerDataCallBack implements CB_fAnalyzerDataCallBack {
		@Override
		public void invoke(long lAnalyzerHandle, int dwAlarmType, Object alarmInfo, byte pBuffer[], int dwBufSize, int nSequence, int reserved) {
			ToolKits.writeLog("Received IVS event ");
			if (FinalVar.EVENT_IVS_FACEDETECT == dwAlarmType) { // 人脸识别
				ToolKits.writeLog("EVENT_IVS_FACEDETECT");
			} else if (FinalVar.EVENT_IVS_TRAFFICJUNCTION == dwAlarmType) { // 车牌识别
				ToolKits.writeLog("EVENT_IVS_TRAFFICJUNCTION");
			}
		}
	}

	void TestNumberStat() {
		NET_IN_FINDNUMBERSTAT startIn = new NET_IN_FINDNUMBERSTAT();
		startIn.nChannelID = 0;
		startIn.nGranularityType = 1;
		startIn.nWaittime = 3000;
		startIn.stStartTime.dwYear = 2015;
		startIn.stStartTime.dwMonth = 12;
		startIn.stStartTime.dwDay = 1;
		startIn.stEndTime.dwYear = 2015;
		startIn.stEndTime.dwMonth = 12;
		startIn.stEndTime.dwDay = 14;
		NET_OUT_FINDNUMBERSTAT startOut = new NET_OUT_FINDNUMBERSTAT();
		long lFindHandle = INetSDK.StartFindNumberStat(TestNetSDKActivity.m_loginHandle, startIn, startOut);
		if (lFindHandle != 0 && startOut.dwTotalCount > 0) {
			int nCount = startOut.dwTotalCount;
			int nStep = 10; // 根据实际业务设置
			int nLoop = nCount / nStep;
			for (int i = 0; i < nLoop + 1; i++) {
				NET_IN_DOFINDNUMBERSTAT doIn = new NET_IN_DOFINDNUMBERSTAT();
				doIn.nBeginNumber = i * nStep;
				doIn.nCount = (i == nLoop) ? (nCount - doIn.nBeginNumber) : nStep;
				doIn.nWaittime = 3000;
				NET_OUT_DOFINDNUMBERSTAT doOut = new NET_OUT_DOFINDNUMBERSTAT(nStep);
				int nRet = INetSDK.DoFindNumberStat(lFindHandle, doIn, doOut);
				if (nRet < 0) {
					ToolKits.writeErrorLog("DoFindNumberStat failed");
				}
				//doOut.nCount 把 doOut.pstuNumberStat[i].nEnteredSubTotal 和 doOut.pstuNumberStat[i].nExitedSubtotal 输出
			}

			boolean bRet = INetSDK.StopFindNumberStat(lFindHandle);
			if (!bRet) {
				ToolKits.writeErrorLog("DoFindNumberStat failed");
			}
		}
	}

	void TestSnapPictureToFile() {
		String name = "/sdcard/NetSDK/123.jpg";

		NET_IN_SNAP_PIC_TO_FILE_PARAM stIn = new NET_IN_SNAP_PIC_TO_FILE_PARAM();
		NET_OUT_SNAP_PIC_TO_FILE_PARAM stOut = new NET_OUT_SNAP_PIC_TO_FILE_PARAM(1024 * 1024);

		stIn.stuParam.Channel = GlobalSettingActivity.m_nGlobalChn;
		stIn.stuParam.Quality = 3;
		stIn.stuParam.ImageSize = 1;
		stIn.stuParam.mode = 0;
		stIn.stuParam.InterSnap = 5;
		stIn.stuParam.CmdSerial = 100;
		System.arraycopy(name.getBytes(), 0, stIn.szFilePath, 0, name.getBytes().length);
		if (!INetSDK.SnapPictureToFile(TestNetSDKActivity.m_loginHandle, stIn, stOut, 3000)) {
			ToolKits.writeErrorLog("SnapPictureToFile failed");
		}
	}

	void TestWlanCfg() {
		CFG_NETAPP_WLAN stCfg = new CFG_NETAPP_WLAN();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_WLAN, stCfg, TestNetSDKActivity.m_loginHandle, -1, 10240);
		if (zRet) {
			stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[0] = new byte[FinalVar.AV_CFG_IP_Address_Len_EX];
			stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[1] = new byte[FinalVar.AV_CFG_IP_Address_Len_EX];
			System.arraycopy("8.8.8.8".getBytes(), 0, stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[0], 0, "8.8.8.8".getBytes().length);
			System.arraycopy("8.8.4.4".getBytes(), 0, stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[1], 0, "8.8.4.4".getBytes().length);
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_WLAN, stCfg, TestNetSDKActivity.m_loginHandle, -1, 10240);
		}
	}

	void TestSmartEncodeCfg() {
		ToolKits.writeLog("TestSmartEncodeCfg");
		CFG_SMART_ENCODE_INFO stCfgs = new CFG_SMART_ENCODE_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_SMART_ENCODE, stCfgs, TestNetSDKActivity.m_loginHandle, 0, 10240);
		if (zRet) {
			ToolKits.writeLog("bSmartH264 : " + stCfgs.bSmartH264);
			stCfgs.bSmartH264 = !stCfgs.bSmartH264;
			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_SMART_ENCODE, stCfgs, TestNetSDKActivity.m_loginHandle, 0, 10240);
			if (zRet)
			{
				ToolKits.writeLog("SmartH264 SetDevConfig OK !");
			}
		}
	}

	void TestEmailCfg() {
		ToolKits.writeLog("TestEmailCfg");
		CFG_EMAIL_INFO stCfgs = new CFG_EMAIL_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_EMAIL, stCfgs, TestNetSDKActivity.m_loginHandle, -1, 10240);
		if (zRet) {
			ToolKits.writeLog("bEnable : " + stCfgs.bEnable);
			String address = new String(stCfgs.szAddress, 0, 4);
			ToolKits.writeLog("Address : " + address);

			for (int i = 0; i < stCfgs.nRetReciversNum; ++i)
			{
				ToolKits.writeLog("szReceivers : " + stCfgs.szReceivers[i]);
			}

			ToolKits.writeLog("stuHealthReport->nInterval " + stCfgs.stuHealthReport.nInterval);

			// test for set dev config
			stCfgs.bEnable = !stCfgs.bEnable;
			stCfgs.stuHealthReport.nInterval = 60;

			String UserName = new String(stCfgs.szUserName, 0, stCfgs.szUserName.length);
			ToolKits.writeLog("UserName : " + UserName);

			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_EMAIL, stCfgs, TestNetSDKActivity.m_loginHandle, -1, 10240);
			if (zRet)
			{
				ToolKits.writeLog("Email SetDevConfig OK !");
			}
		}
	}

	void TestSearchAndCofig() {
		boolean bRet;

		// 打开设备软AP，不需要登录，进行搜索设备，回调函数中获取到设备IP
		TestfSearchDevicesCB stCb = new TestfSearchDevicesCB();
		long lRet = INetSDK.StartSearchDevices(stCb);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		bRet = INetSDK.StopSearchDevices(lRet);   // 回调函数里面搜索到设备之后，启线程调用该接口停止搜索

		// 利用上面搜索到的设备IP，调用登录接口进行登录（LiveActivity.java），获取设备的SSID列表
		SDKDEV_WLAN_DEVICE_LIST_EX stListEx[] = new SDKDEV_WLAN_DEVICE_LIST_EX[1];
		stListEx[0] = new SDKDEV_WLAN_DEVICE_LIST_EX();
		Integer stIntRet = new Integer(0);
		bRet = INetSDK.GetDevConfig(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEV_WLAN_DEVICE_CFG_EX, -1, stListEx, stIntRet, 5000);
		if (bRet) {
			for (int i = 0; i < stListEx[0].bWlanDevCount; i++) {
				String strSSID = new String(stListEx[0].lstWlanDev[i].szSSID);   // 把szSSID最后面的那些0去掉，可以解决乱码问题
				ToolKits.writeLog(strSSID);
			}

			// 选择上面的一个SSID，配置参数
			SDKDEV_WLAN_INFO stCfg[] = new SDKDEV_WLAN_INFO[1];
			stCfg[0] = new SDKDEV_WLAN_INFO();
			bRet = INetSDK.GetDevConfig(TestNetSDKActivity.m_loginHandle,
					FinalVar.SDK_DEV_WLAN_CFG, GlobalSettingActivity.m_nGlobalChn, stCfg, stIntRet, 5000);
			stCfg[0].nEncryption = 7;
			stCfg[0].byConnectedFlag = 1;
			stCfg[0].szSSID = new byte[36];
			stCfg[0].szKeys[0] = new byte[32];
			stCfg[0].szKeys[1] = new byte[32];
			stCfg[0].szKeys[2] = new byte[32];
			stCfg[0].szKeys[3] = new byte[32];
			stCfg[0].szWPAKeys = new byte[128];
			System.arraycopy("IPC-GYL".getBytes(), 0, stCfg[0].szSSID, 0, "IPC-GYL".getBytes().length);
			System.arraycopy("66886688".getBytes(), 0, stCfg[0].szKeys[0], 0, "66886688".getBytes().length);
			System.arraycopy("66886688".getBytes(), 0, stCfg[0].szWPAKeys, 0, "66886688".getBytes().length);
			bRet = INetSDK.SetDevConfig(TestNetSDKActivity.m_loginHandle,
					FinalVar.SDK_DEV_WLAN_CFG, GlobalSettingActivity.m_nGlobalChn, stCfg, 3000);
			if (!bRet) {
				ToolKits.writeErrorLog("error, ");
			}
		}
	}

	void TestCfgDVRIP() {
		ToolKits.writeLog("TestCfgDVRIP");
		CFG_DVRIP_INFO stCfgs = new CFG_DVRIP_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_DVRIP, stCfgs, TestNetSDKActivity.m_loginHandle, -1, 10240);
		if (zRet) {
			ToolKits.writeLog("nUDPPort : " + stCfgs.nUDPPort);
			String address = new String(stCfgs.szMCASTAddress, 0, 13);
			ToolKits.writeLog("Address : " + address);

			for (int i = 0; i < stCfgs.nRegistersNum; ++i)
			{
				ToolKits.writeLog("stuRegisters : " + stCfgs.stuRegisters[i].nServersNum);
			}

			ToolKits.writeLog("emStreamPolicy " + stCfgs.emStreamPolicy);

			// test for set dev config
			stCfgs.nUDPPort = stCfgs.nUDPPort;

			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_DVRIP, stCfgs, TestNetSDKActivity.m_loginHandle, -1, 10240);
			if (zRet)
			{
				ToolKits.writeLog("DVRIP SetDevConfig OK !");
			}
		}
	}

	void TestCloudUpgrader() {
		// query devtype
		CFG_DEV_DISPOSITION_INFO devtype = new CFG_DEV_DISPOSITION_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_DEV_GENERRAL, devtype, TestNetSDKActivity.m_loginHandle, -1, 10240);
		if (zRet) {
			String type = ToolKits.ByteArrayToString(devtype.szMachineName);
			if (null != type) {
				ToolKits.writeLog(type);
				if (!type.equals("LHV2008")) {
					return;
				}
			}
		}

		// check new firmware
		SDKDEV_UPGRADE_STATE_INFO upgrade_info = new SDKDEV_UPGRADE_STATE_INFO();
		boolean retCheck = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_GET_UPGRADE_STATE, upgrade_info, 10 * 1000);
		if (retCheck) {
			int state = upgrade_info.nState;
			switch (state) {
				case 0: //None
					ToolKits.writeLog("No newer firmware");
					break;
				case 1: //Regular
					// upgrader
					boolean retUpgrader = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_UPGRADE_DEVICE, null, 10 * 1000);
					if (retUpgrader) {
						ToolKits.writeLog("Upgrader success");
					} else {
						ToolKits.writeErrorLog("Upgrader failed");
					}
					break;
				default:
					break;
			}
		} else {
			ToolKits.writeErrorLog("QueryDevState failed");
		}
	}

	void TestSetMail() {
		NET_IN_TEST_MAIL stuIn = new NET_IN_TEST_MAIL();
		NET_OUT_TEST_MAIL stuOut = new NET_OUT_TEST_MAIL();
		if (INetSDK.ControlDeviceEx(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_TEST_MAIL, stuIn, stuOut, 10 * 1000)) {
			ToolKits.writeLog("Test Mail sucess");
		}else {
			ToolKits.writeErrorLog("Test Mail failed");
		}
	}

	// 增加无线设备
	void TestAddLowRateWLAN() {
		NET_CTRL_LOWRATEWPAN_ADD stuIn = new NET_CTRL_LOWRATEWPAN_ADD();
		stuIn.stuCodeIDInfo.nWirelessId = 2;
		stuIn.stuCodeIDInfo.bEnable = true;
		stuIn.stuCodeIDInfo.emType = NET_WIRELESS_DEVICE_TYPE.NET_WIRELESS_DEVICE_TYPE_MAGNETOMER;
		stuIn.stuCodeIDInfo.emMode = EM_WIRELESS_DEVICE_MODE.EM_WIRELESS_DEVICE_MODE_NORMAL;
		stuIn.stuCodeIDInfo.emSenseMethod = EM_CODEID_SENSE_METHOD_TYPE.EM_CODEID_SENSE_METHOD_TYPE_DOOR_MAGNETISM;

		String customNameString = new String("app.test");
		String snString = new String("app.test");
		System.arraycopy(customNameString.getBytes(), 0, stuIn.stuCodeIDInfo.szCustomName, 0, customNameString.length());
		System.arraycopy(snString.getBytes(), 0, stuIn.stuCodeIDInfo.szSerialNumber, 0, snString.length());

		if (INetSDK.ControlDeviceEx(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_ADD, stuIn, null, 10 * 1000)) {
			ToolKits.writeLog("Add low rate WLAN sucess");
		}else {
			ToolKits.writeErrorLog("Add low rate WLAN failed");
		}
	}

	/**
	 * 查询设备可支持页数能力级
	 * @return 最大页数
	 */
	int GetMaxPage()
	{
		/// 最大页数
		CFG_CAP_LOWRATEWPAN stuCaps = new CFG_CAP_LOWRATEWPAN();
		char szOutBuffer[] = new char[1024];
		Integer stError = new Integer(0);
		boolean bQN = INetSDK.QueryNewSystemInfo(TestNetSDKActivity.m_loginHandle, FinalVar.CFG_CAP_CMD_LOWRATEWPAN, 0, szOutBuffer, stError, 5000);
		if (bQN) {
			bQN = INetSDK.ParseData(FinalVar.CFG_CAP_CMD_LOWRATEWPAN, szOutBuffer, stuCaps, null);
			if (!bQN) {
				ToolKits.writeErrorLog("INetSDK.ParseData CFG_CAP_CMD_LOWRATEWPAN error");
				return -1;
			}
		} else {
			ToolKits.writeErrorLog("INetSDK.QueryNewSystemInfo CFG_CAP_CMD_LOWRATEWPAN error");
		}

		return stuCaps.nMaxPageSize;
	}

	/**
	 * 无线设备列表及外设使能状态
	 */
	void TestGetCodeIDState() {
		/// 获取总条数
		NET_GET_CODEID_COUNT stuCount = new NET_GET_CODEID_COUNT();
		if (!INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_GET_CODEID_COUNT, stuCount, 10*1000)) {
			ToolKits.writeErrorLog("Get CodeID Count failed");
			return;
		}

		NET_GET_CODEID_LIST stuList = new NET_GET_CODEID_LIST(20/*GetMaxPage()*/);
		stuList.nStartIndex = 0;

		/// 按页查找
		do {
			if (!INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_GET_CODEID_LIST, stuList, 10*1000)) {
				ToolKits.writeErrorLog("INetSDK.QueryDevState SDK_DEVSTATE_GET_CODEID_LIST error");
			}

			for (int i = 0; i < stuList.nRetCodeIDNum; ++i) {
				ToolKits.writeLog("SerialNO " + new String(stuList.pstuCodeIDInfo[i].szSerialNumber).trim());
			}

			stuList.nStartIndex += stuList.nQueryNum;
		}while(stuList.nStartIndex < 20 /*GetMaxPage()*/);

	}

	/**
	 * 查询无线设备状态
	 */
	void TestGetWirelessDev() {

		NET_GET_WIRELESS_DEVICE_STATE stuMsg = new NET_GET_WIRELESS_DEVICE_STATE(20/*GetMaxPage()*/);
		stuMsg.nStartIndex = 0;

		/// 按页查找
		do {
			if (!INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_GET_WIRESSLESS_STATE, stuMsg, 10*1000)) {
				ToolKits.writeErrorLog("INetSDK.QueryDevState SDK_DEVSTATE_GET_CODEID_LIST error");
			}

			for (int i = 0; i < stuMsg.nRetQueryNum; ++i) {
				ToolKits.writeLog("SerialNO " + new String(stuMsg.pstuDeviceInfo[i].szSerialNumber).trim());
			}

			stuMsg.nStartIndex += stuMsg.nQueryNum;
		}while(stuMsg.nStartIndex < 20 /*GetMaxPage()*/);
	}

	/**
	 * 门禁系统，开锁
	 */
	void TestOpenDoor() {
		NET_CTRL_ACCESS_OPEN stuIn = new NET_CTRL_ACCESS_OPEN();
		if (INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_ACCESS_OPEN, stuIn, 10 * 1000)) {
			ToolKits.writeLog("Test Open Door sucess");
		}else {
			ToolKits.writeErrorLog("Test Open Door failed");
		}
	}

	/**
	 * 报警盒子，删除指定的设备
	 */
	void TestRomoveDevice() {
		NET_CTRL_LOWRATEWPAN_REMOVE stuIn = new NET_CTRL_LOWRATEWPAN_REMOVE();
		stuIn.nWirelessId = 20160608;
		System.arraycopy("SN: Test".getBytes(), 0, stuIn.szSerialNumber, 0, "SN: Test".length());
		if (INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_REMOVE, stuIn, 10 * 1000)) {
			ToolKits.writeLog("Test Romove Device sucess");
		}else {
			ToolKits.writeErrorLog("Test Romove Device failed");
		}
	}

	/**
	 * 报警盒子，修改设备信息
	 */
	void TestModifyDevice() {
		NET_CTRL_LOWRATEWPAN_MODIFY stuIn = new NET_CTRL_LOWRATEWPAN_MODIFY();
		System.arraycopy("Test".getBytes(), 0, stuIn.stuCodeIDInfo.szName, 0, "Test".length());
		stuIn.stuCodeIDInfo.bEnable = true;

		if (INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_MODIFY, stuIn, 10 * 1000)) {
			ToolKits.writeLog("Test Modify Device sucess");
		}else {
			ToolKits.writeErrorLog("Test Modify Device failed");
		}
	}

	/**
	 * 教学录播:
	 * 	设置课程录像模式
	 * 	获取课程录像模式
	 *  获取导播预览通道号
	 *  录播操作参考 TestRecordState
	 *  获取软件版本
	 *
	 *  录播主机通道绑定关系配置
	 *  查询录播录像文件
	 */
	void TestCourseRecord() {
		boolean bRet = false;
		// 设置: 注意如果重复设置相同的录像模式，设备将会返回失败
		NET_IN_SET_COURSE_RECORD_MODE pInBuf = new NET_IN_SET_COURSE_RECORD_MODE();
		pInBuf.emRecordMode = 1; // 普通模式
		NET_OUT_SET_COURSE_RECORD_MODE pOutBuf = new NET_OUT_SET_COURSE_RECORD_MODE();
		if(INetSDK.SetCourseRecordMode(TestNetSDKActivity.m_loginHandle, pInBuf, pOutBuf, 10*1000)) {
			ToolKits.writeLog("SetCourseRecordMode Success");
		}
		else {
			ToolKits.writeLog("SetCourseRecordMode Failed");
		}

		// 获取
		NET_IN_GET_COURSE_RECORD_MODE getModeIn = new NET_IN_GET_COURSE_RECORD_MODE();
		NET_OUT_GET_COURSE_RECORD_MODE getModeOut = new NET_OUT_GET_COURSE_RECORD_MODE();

		if(INetSDK.GetCourseRecordMode(TestNetSDKActivity.m_loginHandle, getModeIn, getModeOut, 10*1000)) {
			ToolKits.writeLog("GetCourseRecordMode Success" + "Mode " + getModeOut.emRecordMode);
		}
		else {
			ToolKits.writeLog("GetCourseRecordMode Failed");
		}

		// 导播预览通道号
		NET_IN_GET_COMPOSITE_PREVIEW_CHANNEL getChannelIn  = new NET_IN_GET_COMPOSITE_PREVIEW_CHANNEL();
		NET_OUT_GET_COMPOSITE_PREVIEW_CHANNEL getChannelOut = new NET_OUT_GET_COMPOSITE_PREVIEW_CHANNEL();

		bRet = INetSDK.GetCompositePreviewChannel(TestNetSDKActivity.m_loginHandle,  getChannelIn,  getChannelOut, 10*1000);
		if (bRet) {
			ToolKits.writeLog("GetCompositePreviewChannel Success"
					+ "ChannelNum " + getChannelOut.nChannelNum);
			for(int i = 0; i < getChannelOut.nChannelNum; i ++) {
				ToolKits.writeLog("i " + i + ", Channel is " + getChannelOut.nChannel[i]);
			}
		}
		else {
			ToolKits.writeLog("GetCompositePreviewChannel Failed");
		}

		// 获取软件版本
		SDKDEV_VERSION_INFO info = new SDKDEV_VERSION_INFO();
		bRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_SOFTWARE, info, 10*1000);
		if (bRet) {
			ToolKits.writeLog("QueryDevState" + "SV: " + new String(info.szSoftWareVersion).trim());
			ToolKits.writeLog("QueryDevState" + "szDevSerialNo: " + new String(info.szDevSerialNo).trim());
		}
		else {
			ToolKits.writeLog("QueryDevState  SDK_DEVSTATE_SOFTWARE Failed");
		}

		// 开启关闭录播
		NET_IN_SET_COURSE_RECORD_STATE InMsg = new NET_IN_SET_COURSE_RECORD_STATE();
		InMsg.nAction = 0;
		InMsg.nChannel = 0;

		NET_OUT_SET_COURSE_RECORD_STATE OutMsg = new NET_OUT_SET_COURSE_RECORD_STATE();
		bRet = INetSDK.SetCourseRecordState(TestNetSDKActivity.m_loginHandle, InMsg, OutMsg, 10*1000);
		if (bRet) {
			ToolKits.writeLog("SetCoureRecordState Success");
		}
		else {
			ToolKits.writeLog("SetCoureRecordState Failed");
		}

		// 录播主机通道绑定关系配置
		CFG_COURSE_CHANNELBIND_INFO stCfgs = new CFG_COURSE_CHANNELBIND_INFO();
		boolean bCfgs = ToolKits.GetDevConfig(FinalVar.CFG_CMD_COURSE_CHANNELBIND, stCfgs, TestNetSDKActivity.m_loginHandle, -1, 10240);
		if (bCfgs) {
			// 当配置时需要停止录播
			bCfgs = ToolKits.SetDevConfig(FinalVar.CFG_CMD_COURSE_CHANNELBIND, stCfgs, TestNetSDKActivity.m_loginHandle, -1, 10240);
			if (bCfgs)
			{
				ToolKits.writeLog("CHANNELBIND SetDevConfig OK ! " + stCfgs);
			}
		}

		// 查询录播录像文件
		NET_IN_QUERY_COURSEMEDIA_FILEOPEN  stuInOpen = new NET_IN_QUERY_COURSEMEDIA_FILEOPEN();
		stuInOpen.stuStartTime.dwYear = 2016;
		stuInOpen.stuStartTime.dwMonth = 7;
		stuInOpen.stuStartTime.dwDay = 8;
		stuInOpen.stuEndTime.dwYear = 2016;
		stuInOpen.stuEndTime.dwMonth = 7;
		stuInOpen.stuEndTime.dwDay = 12;
		NET_OUT_QUERY_COURSEMEDIA_FILEOPEN stuOutOpen = new NET_OUT_QUERY_COURSEMEDIA_FILEOPEN();

		INetSDK.OpenQueryCourseMediaFile(TestNetSDKActivity.m_loginHandle, stuInOpen, stuOutOpen,2000);

		if (stuOutOpen.nfindID > 0) {
			NET_IN_QUERY_COURSEMEDIA_FILE stuInDo = new NET_IN_QUERY_COURSEMEDIA_FILE();
			stuInDo.nfindID = stuOutOpen.nfindID;
			stuInDo.nOffset = 0;
			stuInDo.nCount = 10;
			NET_OUT_QUERY_COURSEMEDIA_FILE stuOutDo = new NET_OUT_QUERY_COURSEMEDIA_FILE();

			INetSDK.DoQueryCourseMediaFile(TestNetSDKActivity.m_loginHandle, stuInDo, stuOutDo, 2000);
		}
		NET_IN_QUERY_COURSEMEDIA_FILECLOSE stuInColse = new NET_IN_QUERY_COURSEMEDIA_FILECLOSE();
		NET_OUT_QUERY_COURSEMEDIA_FILECLOSE stuOutColse = new NET_OUT_QUERY_COURSEMEDIA_FILECLOSE();
		stuInColse.nFindID = stuOutOpen.nfindID;

		INetSDK.CloseQueryCourseMediaFile(TestNetSDKActivity.m_loginHandle, stuInColse, stuOutColse,2000);
	}

	/**
	 * 配置NTP
	 */
	void TestCfgNTP() {
		CFG_NTP_INFO stCfgs = new CFG_NTP_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_NTP, stCfgs, TestNetSDKActivity.m_loginHandle, -1, 10240);
		if (zRet) {
			ToolKits.writeLog("bEnable : " + stCfgs.bEnable);
			ToolKits.writeLog("Address : " + new String(stCfgs.szAddress).trim());

			// 设置
			stCfgs.bEnable = true;
			String timeZone = new String("BeiJing");
			System.arraycopy(timeZone.getBytes(), 0, stCfgs.szTimeZoneDesc, 0, timeZone.getBytes().length);

			// 备用服务器
			for(int i = 0; i < stCfgs.nSandbyServerNum; ++i ) {
				ToolKits.writeLog("i " + i + "Port " + stCfgs.stuStandbyServer[i].nPort);
			}

			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_NTP, stCfgs, TestNetSDKActivity.m_loginHandle, -1, 10240);
			if (zRet)
			{
				ToolKits.writeLog("NTP SetDevConfig OK !");
			}
		}
	}

	/**
	 * 配置报警联动
	 */
	void TestCfgAlarm() {
		CFG_ALARMIN_INFO stCfgs = new CFG_ALARMIN_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ALARMINPUT, stCfgs, TestNetSDKActivity.m_loginHandle, 0, 1024*1024);
		if (zRet) {
			//设置
			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_ALARMINPUT, stCfgs, TestNetSDKActivity.m_loginHandle, 0, 1024*1024);
			if (zRet)
			{
				ToolKits.writeLog("SetDevConfig OK !");
			}
		}

	}

	/**
	 * 视频分割操作类型
	 */
	void TestOperateSplit() {
		long lLoginID = TestNetSDKActivity.m_loginHandle;
		int emType = -1;
		int nWaitTime = 5000;
		boolean bRet = false;
		Object inParam;
		Object outParam;

		/// 1. 设置背景图片
//    	NET_IN_SPLIT_SET_BACKGROUND inParam = new NET_IN_SPLIT_SET_BACKGROUND();
//    	inParam.bEnable = true;
//    	inParam.nChannel = 1;
//    	inParam.pszFileName = new String("SetBackGround");
//
//    	NET_OUT_SPLIT_SET_BACKBROUND outParam = new NET_OUT_SPLIT_SET_BACKBROUND();
//
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_BACKGROUND;

		/// 2. 获取背景图片
//    	NET_IN_SPLIT_GET_BACKGROUND inParam = new NET_IN_SPLIT_GET_BACKGROUND();
//    	NET_OUT_SPLIT_GET_BACKGROUND outParam = new NET_OUT_SPLIT_GET_BACKGROUND();
//
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_GET_BACKGROUND;

		/// 3. 设置预拉流源
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_PREPULLSRC;
//    	NET_IN_SPLIT_SET_PREPULLSRC inParam = new NET_IN_SPLIT_SET_PREPULLSRC(2);
//    	NET_OUT_SPLIT_SET_PREPULLSRC outParam = new NET_OUT_SPLIT_SET_PREPULLSRC(2);

		/// 4. 设置源边框高亮使能开关
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_HIGHLIGHT;
//    	NET_IN_SPLIT_SET_HIGHLIGHT inParam = new NET_IN_SPLIT_SET_HIGHLIGHT();
//    	NET_OUT_SPLIT_SET_HIGHLIGHT outParam = new NET_OUT_SPLIT_SET_HIGHLIGHT();

		/// 5. 调整窗口Z序
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_ZORDER;
//    	NET_IN_SPLIT_SET_ZORDER inParam = new NET_IN_SPLIT_SET_ZORDER();
//    	inParam.nChannel = 0;
//    	NET_OUT_SPLIT_SET_ZORDER outParam = new NET_OUT_SPLIT_SET_ZORDER(5);

		/// 6. 窗口轮巡控制
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_TOUR;
//    	inParam = new NET_IN_SPLIT_SET_TOUR();
//    	outParam = new NET_OUT_SPLIT_SET_TOUR();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 7. 获取窗口轮巡状态
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_GET_TOUR_STATUS;
//    	inParam = new NET_IN_SPLIT_GET_TOUR_STATUS();
//    	outParam = new NET_OUT_SPLIT_GET_TOUR_STATUS(5);
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 8. 获取屏内窗口信息
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_GET_SCENE;
//    	inParam = new NET_IN_SPLIT_GET_SCENE();
//    	outParam = new NET_OUT_SPLIT_GET_SCENE(5);
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 9. 批量开窗
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_OPEN_WINDOWS;
//    	inParam = new NET_IN_SPLIT_OPEN_WINDOWS(5);
//    	outParam = new NET_OUT_SPLIT_OPEN_WINDOWS(5);
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 10. 设置工作模式
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_WORK_MODE;
//    	inParam = new NET_IN_SPLIT_SET_WORK_MODE();
//    	outParam = new NET_OUT_SPLIT_SET_WORK_MODE();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 11. 获取播放器实例
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_GET_PLAYER;
//    	inParam = new NET_IN_SPLIT_GET_PLAYER();
//    	outParam = new NET_OUT_SPLIT_GET_PLAYER();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 12. 设置窗口工作模式
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_SET_WORK_MODE;
//    	inParam = new NET_IN_WM_SET_WORK_MODE();
//    	outParam = new NET_OUT_WM_SET_WORK_MODE();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 13. 获取窗口工作模式
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_GET_WORK_MODE;
//    	inParam = new NET_IN_WM_GET_WORK_MODE();
//    	outParam = new NET_OUT_WM_GET_WORK_MODE();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 14. 批量关窗
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_CLOSE_WINDOWS;
//    	inParam = new NET_IN_SPLIT_CLOSE_WINDOWS(5);
//    	outParam = new NET_OUT_SPLIT_CLOSE_WINDOWS(5);
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 15. 设置输出屏的鱼眼矫正规则
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_SET_FISH_EYE_PARAM;
//    	inParam = new NET_IN_WM_SET_FISH_EYE_PARAM(5);
//    	outParam = new NET_OUT_WM_SET_FISH_EYE_PARAM();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 16. 设置窗口走廊模式
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_SET_CORRIDOR_MODE;
//    	inParam = new NET_IN_WM_SET_CORRIDOR_MODE();
//    	outParam = new NET_OUT_WM_SET_CORRIDOR_MODE();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

		/// 17. 获取窗口走廊模式
		emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_GET_CORRIDOR_MODE;
		inParam = new NET_IN_WM_GET_CORRIDOR_MODE();
		outParam = new NET_OUT_WM_GET_CORRIDOR_MODE();
		bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
		if (bRet) {
			ToolKits.writeLog("OperateSplit OK !!!");
		}
		else{
			ToolKits.writeErrorLog("Failed to OperateSplit");
		}
	}

	/**
	 * 查询备份设备详细信息
	 */
	public void TestQueryBackupDevInfo()
	{

		SDKDEV_BACKUP_LIST backupDevList = new SDKDEV_BACKUP_LIST();

		boolean bRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_BACKUP_DEV, backupDevList, 5000);
		if (bRet)
		{
			ToolKits.writeLog("query backup dev list succeed" + backupDevList.nBackupDevNum + "/" + backupDevList.szBackupDevNames[0]);
			SDKDEV_BACKUP_INFO backupDevInfo = new SDKDEV_BACKUP_INFO();

			System.arraycopy(backupDevList.szBackupDevNames[0], 0, backupDevInfo.szName, 0, backupDevList.szBackupDevNames[0].length);
			boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_BACKUP_DEV_INFO, backupDevInfo, 5000);
			if(zRet) {
				ToolKits.writeLog("query backup dev info succeed" + backupDevInfo.szName + backupDevInfo.byType + backupDevInfo.byBus
						+ backupDevInfo.nCapability + backupDevInfo.nRemain + backupDevInfo.szDirectory);
			} else {
				ToolKits.writeErrorLog("query backup dev info err:" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeErrorLog("query backup dev list err:" + INetSDK.GetLastError());

		}

	}

	/**
	 * 查询融合屏通道信息
	 */
	public void TestQueryCompositeInfo()
	{

		SDK_COMPOSITE_CHANNEL compositeDevInfo = new SDK_COMPOSITE_CHANNEL();
		boolean bRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_COMPOSITE_CHN, compositeDevInfo, 5000);
		if (bRet)
		{
			ToolKits.writeLog("query composite dev info success" + compositeDevInfo);
		}
		else
		{
			ToolKits.writeErrorLog("query composite dev info err:" + INetSDK.GetLastError());
		}
	}

	/**
	 * 测试融合屏配置
	 */
	public void SpliceScreen() {
		String name = "dahua00";
		String wallName = "dahuaWall00";
		String strCmd = FinalVar.CFG_CMD_SPLICESCREEN;
		AV_CFG_SpliceScreen stParseData = new AV_CFG_SpliceScreen();
		int nBufferLen = 64 * 1024;
		boolean zRet = ToolKits.GetDevConfig(strCmd, stParseData, TestNetSDKActivity.m_loginHandle, -1, nBufferLen);
		if(zRet) {
			ToolKits.writeLog("QueryConfig Succeed!" + "szName=" + new String(stParseData.szName) + "; szWallName=" + new String(stParseData.szWallName) +
					"; nBlockID=" + String.valueOf(stParseData.nBlockID) +  "; nTop=" +String.valueOf(stParseData.stuRect.nTop) + "; nBottom=" + String.valueOf(stParseData.stuRect.nBottom)
					+ "; nLeft=" + String.valueOf(stParseData.stuRect.nLeft) + "; nRight=" + String.valueOf(stParseData.stuRect.nRight));

			System.arraycopy(name.getBytes(), 0, stParseData.szName, 0, name.getBytes().length);
			System.arraycopy(wallName.getBytes(), 0, stParseData.szWallName, 0, wallName.getBytes().length);
			stParseData.nBlockID = 1;
			stParseData.stuRect.nTop = 25;
			stParseData.stuRect.nBottom = 25;
			stParseData.stuRect.nLeft = 25;
			stParseData.stuRect.nRight = 25;
			boolean bRet = ToolKits.SetDevConfig(strCmd, stParseData, TestNetSDKActivity.m_loginHandle, 0, nBufferLen);
			if(bRet) {
				ToolKits.writeLog("SetConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("SetConfig Failed!" + INetSDK.GetLastError());
			}
		}else{
			ToolKits.writeErrorLog("QueryConfig Failed!" + INetSDK.GetLastError());
		}
	}

	/**
	 * CFG_CMD_DVRIP//  Get //"DVRIP"
	 */
	public void GetSpliceScreen() {
		String szID = "55555";
		String adress = "111.3.16.45";
		String strCmd = FinalVar.CFG_CMD_DVRIP;
		CFG_DVRIP_INFO stParseData = new CFG_DVRIP_INFO();
		int nBufferLen = 64 * 1024;
		boolean zRet = ToolKits.GetDevConfig(strCmd, stParseData, TestNetSDKActivity.m_loginHandle, 0, nBufferLen);
		if(zRet) {
			ToolKits.writeLog("ConfigGet Succeed!" + String.valueOf(stParseData.nTcpPort) + "; " + String.valueOf(stParseData.nSSLPort) + ";" + String.valueOf(stParseData.nUDPPort) + ";" + String.valueOf(stParseData.nRegistersNum));

			stParseData.stuRegisters[0].bEnable = !stParseData.stuRegisters[0].bEnable;
			System.arraycopy(szID.getBytes(), 0, stParseData.stuRegisters[0].szDeviceID , 0, szID.getBytes().length);
			stParseData.stuRegisters[0].stuServers[0].nPort = 37006;
			System.arraycopy(adress.getBytes(), 0, stParseData.stuRegisters[0].stuServers[0].szAddress, 0, adress.getBytes().length);

			boolean bRet = ToolKits.SetDevConfig(strCmd, stParseData, TestNetSDKActivity.m_loginHandle, 0, nBufferLen);
			if(bRet) {
				ToolKits.writeLog("ConfigSet Succeed!");
			}else {
				ToolKits.writeErrorLog("ConfigSet Failed!" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeErrorLog("ConfigGet Failed!" + INetSDK.GetLastError());
		}
	}

	/**
	 * 自由开窗
	 */
	public void OpenSplitWindow()
	{
		SDK_IN_SPLIT_OPEN_WINDOW inOpenWindow = new SDK_IN_SPLIT_OPEN_WINDOW();
		inOpenWindow.nChannel = 0;
		inOpenWindow.stuRect.left = 20;
		inOpenWindow.stuRect.right = 20;
		inOpenWindow.stuRect.top = 20;
		inOpenWindow.stuRect.bottom = 20;
		inOpenWindow.bDirectable = true;
		SDK_OUT_SPLIT_OPEN_WINDOW outOpenWindow = new SDK_OUT_SPLIT_OPEN_WINDOW();
//     	outOpenWindow.nWindowID = 1;
//     	outOpenWindow.nZOrder = 1;

		boolean zRet = INetSDK.OpenSplitWindow(TestNetSDKActivity.m_loginHandle, inOpenWindow, outOpenWindow, 5000);
		if (zRet)
		{
			ToolKits.writeLog("OpenSplitWindow Succeed!" + inOpenWindow + outOpenWindow);

		} else {
			ToolKits.writeErrorLog("OpenSplitWindow Failed!" + INetSDK.GetLastError());
		}
	}

	/**
	 * 自由关窗
	 */
	public void CloseSplitWindow()
	{

		SDK_IN_SPLIT_CLOSE_WINDOW inCloseWindow = new SDK_IN_SPLIT_CLOSE_WINDOW();
		inCloseWindow.nChannel = 0;
		inCloseWindow.nWindowID = 1;
		SDK_OUT_SPLIT_CLOSE_WINDOW  outCloseWindow = new  SDK_OUT_SPLIT_CLOSE_WINDOW();

		boolean zRet = INetSDK.CloseSplitWindow(TestNetSDKActivity.m_loginHandle, inCloseWindow, outCloseWindow, 5000);
		if (zRet)
		{
			ToolKits.writeLog("CloseSplitWindow Succeed!" + inCloseWindow + outCloseWindow);

		} else {
			ToolKits.writeErrorLog("CloseSplitWindow Failed!" + INetSDK.GetLastError());

		}
	}

	/**
	 *设置窗口位置
	 */
	public void SetSplitWindowRect()
	{
		SDK_IN_SPLIT_SET_RECT inSetRect = new SDK_IN_SPLIT_SET_RECT();
		inSetRect.nChannel = 0;
		inSetRect.nWindowID = 1;
		inSetRect.stuRect.left = 20;
		inSetRect.stuRect.right = 20;
		inSetRect.stuRect.top = 20;
		inSetRect.stuRect.bottom = 20;
		inSetRect.bDirectable = false;
		SDK_OUT_SPLIT_SET_RECT outSetRect = new SDK_OUT_SPLIT_SET_RECT();

		boolean zRet = INetSDK.SetSplitWindowRect(TestNetSDKActivity.m_loginHandle, inSetRect, outSetRect, 5000);
		if (zRet)
		{
			ToolKits.writeLog("SetSplitWindowRect Succeed!" );

		} else {
			ToolKits.writeErrorLog("SetSplitWindowRect Failed!" + INetSDK.GetLastError());

		}
	}

	/**
	 * 设置窗口次序
	 */
	public void SetSplitTopWindow()
	{
		SDK_IN_SPLIT_SET_TOP_WINDOW inSetTop = new SDK_IN_SPLIT_SET_TOP_WINDOW();
		inSetTop.nChannel = 0;
		inSetTop.nWindowID = 1;
		SDK_OUT_SPLIT_SET_TOP_WINDOW outSetTop = new SDK_OUT_SPLIT_SET_TOP_WINDOW(10);
		outSetTop.pZOders[0].nWindowID = 22222;
		outSetTop.pZOders[0].nZOrder = 1;
		outSetTop.nMaxWndCount = 10;
		outSetTop.nWndCount = 6;

		boolean zRet = INetSDK.SetSplitTopWindow(TestNetSDKActivity.m_loginHandle, inSetTop, outSetTop, 5000) ;
		if (zRet)
		{
			ToolKits.writeLog("SetSplitTopWindow Succeed!" );

		} else {
			ToolKits.writeErrorLog("SetSplitTopWindow Failed!" + INetSDK.GetLastError());
		}
	}

	/**
	 * 获取当前显示的所有窗口信息
	 */
	public void GetSplitWindowInfo()
	{
		SDK_IN_SPLIT_GET_WINDOWS inGetWindow = new SDK_IN_SPLIT_GET_WINDOWS();
		SDK_OUT_SPLIT_GET_WINDOWS outGetWindow = new SDK_OUT_SPLIT_GET_WINDOWS();
		boolean zRet = INetSDK.GetSplitWindowsInfo(TestNetSDKActivity.m_loginHandle, inGetWindow, outGetWindow, 5000); 						if (zRet)
	{
		ToolKits.writeLog("GetSplitWindow Succeed!" + "inGetWindow:" + inGetWindow + "outGetWindow:" + outGetWindow);
	} else {
		ToolKits.writeErrorLog("GetSplitWindow Failed!" + INetSDK.GetLastError());
	}
	}

	/**
	 *  矩阵相关接口测试
	 *  	1. 电视墙配置		CFG_CMD_MONITORWALL, AV_CFG_MonitorWall
	 */
	public void TestMonitorWall() {
		long hHandle = TestNetSDKActivity.m_loginHandle;
		int nWaitTime = 5000;
		boolean bRet = false;
		long hAttach = 0;

		/// 1. 电视墙配置
//    	AV_CFG_MonitorWall monitorWall = new AV_CFG_MonitorWall();
//    	String strCmd = FinalVar.CFG_CMD_MONITORWALL;
//    	bRet = ToolKits.GetDevConfig(strCmd, monitorWall, hHandle, -1, 1024*1024*2);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to Get CFG_CMD_MONITORWALL");
//    		return;
//    	}
//    	else {
//    		ToolKits.writeLog("Successed to Get CFG_CMD_MONITORWALL");
//		}
//
//    	AV_CFG_MonitorWall[] mw = new AV_CFG_MonitorWall[18];
//    	for (int i = 0; i < mw.length; i++) {
//			mw[i] = new AV_CFG_MonitorWall();
//		}
//
//    	boolean result = false;
//    	int nBufferLen = 2*1024*1024;
//    	Integer error = new Integer(0);
//        char szBuffer[] = new char[nBufferLen];
//        int nChn = -1;
//        Integer count = new Integer(0);
//        String strCmd = FinalVar.CFG_CMD_MONITORWALL;
//        if(INetSDK.GetNewDevConfig( hHandle, strCmd , nChn, szBuffer,nBufferLen, error, 10000) )
//        {
//         	if( INetSDK.ParseData(strCmd ,szBuffer , mw , count ) )
//         	{
//         		result = true;
//         		ToolKits.writeLog("Has Configure " + count);

//         		result = INetSDK.PacketData(strCmd, mw, szBuffer, nBufferLen);
//         		if (result) {
//         			Integer errorInteger = new Integer(0);
//         			Integer restartInteger = new Integer(0);
//         			INetSDK.SetNewDevConfig(hHandle, strCmd, -1, szBuffer, nBufferLen, errorInteger, restartInteger, 10000);
//         		}
//         	}
//         }

		/// 1.1 Remote Device
//    	AV_CFG_RemoteDevice remoteDevice = new AV_CFG_RemoteDevice(128);
//    	String strCmd = FinalVar.CFG_CMD_REMOTEDEVICE;
//    	bRet = ToolKits.GetDevConfig(strCmd, remoteDevice, hHandle, -1, 1024*1024*2);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to Get CFG_CMD_REMOTEDEVICE, ");
//    		return;
//    	}
//    	else {
//    		ToolKits.writeLog("Successed to Get CFG_CMD_REMOTEDEVICE, ");
//		}
//
//    	AV_CFG_RemoteDevice[] mw = new AV_CFG_RemoteDevice[18];
//    	for (int i = 0; i < mw.length; i++) {
//			mw[i] = new AV_CFG_RemoteDevice(128);
//		}
//
//    	boolean result = false;
//    	int nBufferLen = 2*1024*1024;
//    	Integer error = new Integer(0);
//        char szBuffer[] = new char[nBufferLen];
//        int nChn = -1;
//        Integer count = new Integer(0);
//        String strCmdEx = FinalVar.CFG_CMD_REMOTEDEVICE;
//        if(INetSDK.GetNewDevConfig( hHandle, strCmdEx , nChn, szBuffer,nBufferLen, error, 10000) )
//        {
//         	if( INetSDK.ParseData(strCmd ,szBuffer , mw , count ) )
//         	{
//         		result = true;
//         		ToolKits.writeLog("Has Configure " + count);
//         		result = INetSDK.PacketData(strCmd, mw, szBuffer, nBufferLen);
//         		if (result) {
//         			Integer errorInteger = new Integer(0);
//         			Integer restartInteger = new Integer(0);
//         			INetSDK.SetNewDevConfig(hHandle, strCmd, -1, szBuffer, nBufferLen, errorInteger, restartInteger, 10000);
//         		}
//         	}
//         }

		/// 2. 获取窗口位置，针对自由开窗窗口
//    	SDK_IN_SPLIT_GET_RECT pInParam = new SDK_IN_SPLIT_GET_RECT();
//    	SDK_OUT_SPLIT_GET_RECT pOutParam = new SDK_OUT_SPLIT_GET_RECT();
//    	bRet = INetSDK.GetSplitWindowRect(hHandle, pInParam, pOutParam, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to GetSplitWindowRect");
//    	}

		/// 3. 设置获取显示源 , 参考  TestMatrix
		/// 4. 获取电视墙预案
//    	SDK_IN_WM_GET_COLLECTIONS inGetCollections = new SDK_IN_WM_GET_COLLECTIONS();
//    	SDK_OUT_WM_GET_COLLECTIONS outGetCollections = new SDK_OUT_WM_GET_COLLECTIONS(10);
//    	bRet = INetSDK.GetMonitorWallCollections(hHandle, inGetCollections, outGetCollections, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to GetMonitorWallCollections");
//    	}

		/// 5. 加载预案
//    	SDK_IN_WM_LOAD_COLLECTION inLoaCollection = new SDK_IN_WM_LOAD_COLLECTION();
//    	inLoaCollection.pszName = new String("TestCollection");
//    	SDK_OUT_WM_LOAD_COLLECTION outLoaCollection = new SDK_OUT_WM_LOAD_COLLECTION();
//    	bRet = INetSDK.LoadMonitorWallCollection(hHandle, inLoaCollection, outLoaCollection, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to LoadMonitorWallCollection");
//    	}

		/// 6. 保存预案.
//    	SDK_IN_WM_SAVE_COLLECTION inSaveCollection = new SDK_IN_WM_SAVE_COLLECTION();
//    	inSaveCollection.pszName = new String("TestSaveCollection");
//    	SDK_OUT_WM_SAVE_COLLECTION outSaveCollection = new SDK_OUT_WM_SAVE_COLLECTION();
//    	bRet = INetSDK.SaveMonitorWallCollection(hHandle, inSaveCollection, outSaveCollection, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to SaveMonitorWallCollection");
//    	}

		/// 7. 预案重命名
//    	SDK_IN_WM_RENAME_COLLECTION inRenameCollection = new SDK_IN_WM_RENAME_COLLECTION();
//    	inRenameCollection.pszOldName = new String("OldName");
//    	inRenameCollection.pszNewName = new String("NewName");
//    	SDK_OUT_WM_RENAME_COLLECTION outRenameCollection =  new SDK_OUT_WM_RENAME_COLLECTION();
//    	bRet = INetSDK.RenameMonitorWallCollection(hHandle, inRenameCollection, outRenameCollection, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to SaveMonitorWallCollection");
//    	}

		/// 8. 获取电视墙场景
//    	SDK_IN_MONITORWALL_GET_SCENE inGetScene = new SDK_IN_MONITORWALL_GET_SCENE();
//    	inGetScene.nMonitorWallID = 0;
//    	SDK_OUT_MONITORWALL_GET_SCENE outGetScene = new SDK_OUT_MONITORWALL_GET_SCENE();
//    	outGetScene.stuScene = new SDK_MONITORWALL_SCENE(20, 20, 5, 5);
//    	bRet = INetSDK.MonitorWallGetScene(hHandle, inGetScene, outGetScene, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to MonitorWallGetScene");
//    	}
//
//    	ToolKits.writeLog("szName" + new String(outGetScene.szName).trim());

		/// 9. 设置电视墙场景
//    	SDK_IN_MONITORWALL_SET_SCENE inSetScene = new SDK_IN_MONITORWALL_SET_SCENE();
//    	inSetScene.stuScene = outGetScene.stuScene;
//    	SDK_OUT_MONITORWALL_SET_SCENE outSetScene = new SDK_OUT_MONITORWALL_SET_SCENE();
//    	bRet = INetSDK.MonitorWallSetScene(hHandle, inSetScene, outSetScene, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to MonitorWallSetScene");
//    	}

		/// 10. 设置窗口轮巡显示源
//    	NET_IN_GET_TOUR_SOURCE inTourSource = new NET_IN_GET_TOUR_SOURCE();
//    	NET_OUT_GET_TOUR_SOURCE outTourSource = new NET_OUT_GET_TOUR_SOURCE(20, 5);
//    	bRet = INetSDK.GetTourSource(hHandle, inTourSource, outTourSource, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to GetTourSource");
//    	}
//
//    	NET_IN_SET_TOUR_SOURCE inSetTourSource = new NET_IN_SET_TOUR_SOURCE(5);
//    	NET_OUT_SET_TOUR_SOURCE outSetTourSource = new NET_OUT_SET_TOUR_SOURCE();
//
//    	bRet = INetSDK.SetTourSource(hHandle, inSetTourSource, outSetTourSource, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to SetTourSource");
//    	}

		/// 11. 音频输出模式
//    	SDK_IN_GET_AUDIO_OUTPUT inGetAudio  = new SDK_IN_GET_AUDIO_OUTPUT();
//    	SDK_OUT_GET_AUDIO_OUTPUT outGetAudio = new SDK_OUT_GET_AUDIO_OUTPUT(5);
//    	bRet = INetSDK.GetSplitAudioOuput(hHandle, inGetAudio, outGetAudio, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to GetSplitAudioOuput");
//    	}
//
//    	SDK_IN_SET_AUDIO_OUTPUT inSetAudio =  new SDK_IN_SET_AUDIO_OUTPUT();
//    	SDK_OUT_SET_AUDIO_OUTPUT outSetAudio = new SDK_OUT_SET_AUDIO_OUTPUT();
//    	bRet = INetSDK.SetSplitAudioOuput(hHandle, inSetAudio, outSetAudio, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to SetSplitAudioOuput");
//    	}

		/// 12. 订阅轮巡状态
//    	NET_IN_ATTACH_SPLIT_TOUR inSplitTour = new NET_IN_ATTACH_SPLIT_TOUR();
//    	inSplitTour.cbStatus = new CB_fTourStatusCallBack() {
//			public void invoke(long lLoginID, long lAttachHandle,
//					NET_SPLIT_TOUR_STATUS_INFO pstStatus) {
//				ToolKits.writeLog("invoke of split tour: " + pstStatus.stuSource.nAudioChannel);
//			}
//    	};
//    	inSplitTour.nChannel = 0;
//    	NET_OUT_ATTACH_SPLIT_TOUR outSplitTour = new NET_OUT_ATTACH_SPLIT_TOUR();
//    	hAttach = INetSDK.AttachSplitTour(hHandle, inSplitTour, outSplitTour, nWaitTime);
//    	if (0 == hAttach){
//    		ToolKits.writeErrorLog("Failed to attach split tour");
//    	}
		// 取消订阅
		//INetSDK.DetachSplitTour(hHandle);

		/// 13. 订阅预案轮巡状态
		NET_IN_WM_ATTACH_TOUR inWall = new NET_IN_WM_ATTACH_TOUR();
		inWall.cbStatus = new CB_fMonitorWallTourStatusCallBack() {

			public void invoke(long lLoginID, long lAttachHandle,
							   NET_WM_TOUR_STATUS_INFO pstStatus) {
				ToolKits.writeErrorLog("Failed to attach monitorWall tour: " + pstStatus.stuScene.nRetSplitSceneCount);
			}
		};
		NET_OUT_WM_ATTACH_TOUR outWall = new NET_OUT_WM_ATTACH_TOUR();
		long hAttachMonitorWall = INetSDK.MonitorWallAttachTour(hHandle, inWall, outWall, nWaitTime);

		// 取消订阅
//    	INetSDK.MonitorWallDetachTour(hAttachMonitorWall);

		/// 14. 电视墙开关
//    	SDK_IN_WM_POWER_CTRL inCtrlPower = new SDK_IN_WM_POWER_CTRL();
//    	inCtrlPower.bPowerOn = true;
//    	inCtrlPower.nMonitorWallID = 1;
//    	inCtrlPower.nTVID = -1;
//    	inCtrlPower.pszBlockID = null;
//    	SDK_OUT_WM_POWER_CTRL outCtrlPower = new SDK_OUT_WM_POWER_CTRL();
//    	bRet = INetSDK.PowerControl(hHandle, inCtrlPower, outCtrlPower, nWaitTime);
	}

	void TestOperateMonitorWall()
	{
		long lLoginID = TestNetSDKActivity.m_loginHandle;
		int nWaitTime = 5000;
		boolean bRet = false;
		int emType = -1;
		Object pInParam;
		Object pOutParam;

		/// 0. 添加电视墙, 对应 NET_IN_MONITORWALL_ADD 和 NET_OUT_MONITORWALL_ADD
		emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_ADD;
		pInParam = new NET_IN_MONITORWALL_ADD(5, 5);
		pOutParam = new NET_OUT_MONITORWALL_ADD();
		bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

		/// 1. 预案轮巡控制, 对应 NET_IN_CTRL_COLLECTIONTOUR 和  NET_OUT_CTRL_COLLECTIONTOUR
//    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_CTRL_TOUR;
//    	pInParam = new NET_IN_CTRL_COLLECTIONTOUR();
//    	pOutParam = new NET_OUT_CTRL_COLLECTIONTOUR();
//    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

		/// 2. 获取矩阵当前状态, 对应 NET_IN_MONITORWALL_GET_STATUS 和  NET_OUT_MONITORWALL_GET_STATUS
//    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_GET_STATUS;
//    	pInParam = new NET_IN_MONITORWALL_GET_STATUS();
//    	pOutParam = new NET_OUT_MONITORWALL_GET_STATUS();
//    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

		/// 3. 设置预案时间表, 对应 NET_IN_MONITORWALL_SET_COLL_SCHD 和 NET_OUT_MONITORWALL_SET_COLL_SCHD
//    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_SET_COLL_SCHD;
//    	pInParam = new NET_IN_MONITORWALL_SET_COLL_SCHD();
//    	pOutParam = new NET_OUT_MONITORWALL_SET_COLL_SCHD();
//    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

		/// 4. 获取预案时间表, 对应 NET_IN_MONITORWALL_GET_COLL_SCHD 和 NET_OUT_MONITORWALL_GET_COLL_SCHD
		emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_GET_COLL_SCHD;
		pInParam = new NET_IN_MONITORWALL_GET_COLL_SCHD();
		pOutParam = new NET_OUT_MONITORWALL_GET_COLL_SCHD();
		bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

		/// 5. 删除电视墙, 对应 NET_IN_MONITORWALL_REMOVE 和 NET_OUT_MONITORWALL_REMOVE
		emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_REMOVE;
		pInParam = new NET_IN_MONITORWALL_REMOVE();
		pOutParam = new NET_OUT_MONITORWALL_REMOVE();
		bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

		/// 6. 设置使能, 对应 NET_IN_MONITORWALL_SET_ENABLE 和 NET_OUT_MONITORWALL_SET_ENABLE
		emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_SET_ENABLE;
		pInParam = new NET_IN_MONITORWALL_SET_ENABLE();
		pOutParam = new NET_OUT_MONITORWALL_SET_ENABLE();
		bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

		/// 7. 获取使能, 对应 NET_IN_MONITORWALL_GET_ENABLE 和 NET_OUT_MONITORWALL_GET_ENABLE
		emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_GET_ENABLE;
		pInParam = new NET_IN_MONITORWALL_GET_ENABLE();
		pOutParam = new NET_OUT_MONITORWALL_GET_ENABLE();
		bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

		/// 8. 电视墙是否存在, 对应 NET_IN_MONITORWALL_NAME_EXIST 和 NET_OUT_MONITORWALL_NAME_EXIST
		emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_NAME_EXIST;
		pInParam = new NET_IN_MONITORWALL_NAME_EXIST();
		pOutParam = new NET_OUT_MONITORWALL_NAME_EXIST();
		bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);
	}

	/**
	 * 热成像相关接口
	 */
	void TestThermoGraphy() {
		long lLoginID = TestNetSDKActivity.m_loginHandle;
		int nWaitTime = 5000;
		boolean bRet = false;
		int nQueryType = -1;
		int emType = -1;

		/// 1. 查询测温度的参数值
//    	nQueryType = FinalVar.NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER;
//    	NET_IN_RADIOMETRY_GETPOINTTEMPER inGetpointtemper = new NET_IN_RADIOMETRY_GETPOINTTEMPER();
//    	inGetpointtemper.nChannel = 1;
//    	inGetpointtemper.stCoordinate.nx = 0;
//    	inGetpointtemper.stCoordinate.ny = 0;
//    	NET_OUT_RADIOMETRY_GETPOINTTEMPER outGetpointtemper = new NET_OUT_RADIOMETRY_GETPOINTTEMPER();
//    	bRet = INetSDK.QueryDevInfo(lLoginID, nQueryType, inGetpointtemper, outGetpointtemper, null, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Query Point Temper Failed!");
//    	}
//    	else {
//    		ToolKits.writeLog("TemperAver: " +outGetpointtemper.stPointTempInfo.fTemperAver);
//    	}

		/// 2. 查询测温项的参数值
//    	nQueryType = FinalVar.NET_QUERY_DEV_RADIOMETRY_TEMPER;
//    	NET_IN_RADIOMETRY_GETTEMPER inGettemper = new NET_IN_RADIOMETRY_GETTEMPER();
//    	inGettemper.stCondition.nChannel = 1;
//    	inGettemper.stCondition.nMeterType = NET_RADIOMETRY_METERTYPE.NET_RADIOMETRY_METERTYPE_LINE; // 线
//    	inGettemper.stCondition.nPresetId = 1;
//    	inGettemper.stCondition.nRuleId = 1;
//
//    	NET_OUT_RADIOMETRY_GETTEMPER outGettemper = new NET_OUT_RADIOMETRY_GETTEMPER();
//
//    	bRet = INetSDK.QueryDevInfo(lLoginID, nQueryType, inGettemper, outGettemper, null, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Query Temper Failed!");
//    	}
//    	else {
//    		ToolKits.writeLog("TemperAver: " +outGettemper.stTempInfo.fTemperAver);
//    	}

		/// 3. 温度报表查询
		emType = NET_FIND.NET_FIND_RADIOMETRY;
		NET_IN_RADIOMETRY_STARTFIND inStartfind = new NET_IN_RADIOMETRY_STARTFIND();
		inStartfind.nChannel = 1;
		inStartfind.nMeterType = NET_RADIOMETRY_METERTYPE.NET_RADIOMETRY_METERTYPE_LINE;
		inStartfind.stStartTime.dwYear = 2016;
		inStartfind.stStartTime.dwMonth = 8;
		inStartfind.stStartTime.dwDay = 4;

		inStartfind.stEndTime.dwYear = 2016;
		inStartfind.stEndTime.dwMonth = 8;
		inStartfind.stEndTime.dwDay = 4;
		inStartfind.stEndTime.dwHour = 23;
		inStartfind.stEndTime.dwMinute = 59;

		inStartfind.emPeriod = EM_RADIOMETRY_PERIOD.EM_RADIOMETRY_PERIOD_5;

		NET_OUT_RADIOMETRY_STARTFIND outStartfind = new NET_OUT_RADIOMETRY_STARTFIND();
		bRet = INetSDK.StartFind(lLoginID, emType, inStartfind, outStartfind, nWaitTime);
		if (!bRet) {
			ToolKits.writeErrorLog("StartFind Failed!");
			return;
		}

		// doFind
		int doCount = 10;
		NET_IN_RADIOMETRY_DOFIND inDofind = new NET_IN_RADIOMETRY_DOFIND();
		do{
			inDofind.nFinderHanle = outStartfind.nFinderHanle;
			inDofind.nCount = doCount;
			NET_OUT_RADIOMETRY_DOFIND outDofind = new NET_OUT_RADIOMETRY_DOFIND();
			bRet = INetSDK.DoFind(lLoginID, emType, inDofind, outDofind, nWaitTime);
			if (!bRet) {
				ToolKits.writeErrorLog("DoFind Failed!");
				return;
			}

			if (doCount > outDofind.nFound){
				break;
			}

			inDofind.nBeginNumber += doCount;

		}while(true);

		// stopFind
		NET_IN_RADIOMETRY_STOPFIND inStopfind = new NET_IN_RADIOMETRY_STOPFIND();
		inStopfind.nFinderHanle = outStartfind.nFinderHanle;
		NET_OUT_RADIOMETRY_STOPFIND outStopfind = new NET_OUT_RADIOMETRY_STOPFIND();
		bRet = INetSDK.StopFind(lLoginID, emType, inStopfind, outStopfind, nWaitTime);
		if (!bRet) {
			ToolKits.writeErrorLog("StopFind Failed!");
			return;
		}

	}
}
