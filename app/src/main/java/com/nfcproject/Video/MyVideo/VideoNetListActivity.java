package com.nfcproject.Video.MyVideo;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.company.Demo.TestInterfaceActivity;
import com.company.Demo.ToolKits;
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
import com.nfcproject.utils.CommUtil;
import com.nfcproject.utils.Contents;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 视频网络列表
 */
public class VideoNetListActivity extends AppCompatActivity {
    Resources res;
    static long m_loginHandle = 0;
    static NET_DEVICEINFO deviceInfo;
    static boolean m_speedCtrl;
    static int m_schedule;
    static int nStreaMask = 0;
    static int m_nGlobalChn = 0;
    static int m_nGlobalPbStream = 0;
    private int nExtraChnNum;

    private SDKDEV_DSP_ENCODECAP_EX stEncodeCapOld = new SDKDEV_DSP_ENCODECAP_EX();
    private CFG_DSPENCODECAP_INFO stEncodeCapNew = new CFG_DSPENCODECAP_INFO();

    private int nSpecCap = 20;


    static CFG_CAP_ALARM_INFO stCfgCapAlarm = new CFG_CAP_ALARM_INFO();

    private int nExtraAlarmOutPortNum;
    @Bind(R.id.back)
    LinearLayout mBack;
    @Bind(R.id.void_list)
    ListView mVideoList;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_net_list);
        ButterKnife.bind(this);
        //1.摄像头程序初始化
        initVideo();

        //2.登录
        login();

        }

    /**
     * 摄像头程序初始化
     */
    private void initVideo(){
        // 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
        INetSDK.LoadLibrarys();

        res =  this.getResources();

//        ToolKits.showMessage(this , res.getString(R.string.DemoInit));

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
//        ToolKits.showMessage( this ,  strVersion);
    }

    /**
     * 登录处理
     */
    private void login(){
        deviceInfo = new NET_DEVICEINFO();
        Integer error = new Integer(0);

        DeviceReConnect reConnect = new DeviceReConnect();
        INetSDK.SetAutoReconnect(reConnect);

        DeviceSubDisConnect subDisConnect = new DeviceSubDisConnect();
        INetSDK.SetSubconnCallBack(subDisConnect);

        INetSDK.SetDVRMessCallBack(new Test_CB_fMessageCallBack());
         //2017.08.10修改前
        /*String strIp 		="111.38.247.193";
        String strPort 		= "9110";
        String strUser 		= "huasheng";
        String strPassword 	= "huasheng";*/
        //2017.08.10修改为
        String strIp 		= getResources().getString(R.string.strIp); //"60.174.105.239";
        String strPort 		= getResources().getString(R.string.strPort);//"81";
        String strUser 		= getResources().getString(R.string.strUser);//"shengju";
        String strPassword 	= getResources().getString(R.string.strPassword);//"shengju";

        int nDevPort = 9110;
        try {
            nDevPort = Integer.parseInt(strPort);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        m_loginHandle = INetSDK.LoginEx(strIp, nDevPort,
                strUser, strPassword, nSpecCap, null, deviceInfo, error);



        if ( m_loginHandle != 0 )
        {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Looper.prepare();
                    // stream Type
                    if (INetSDK.QueryDevState(VideoNetListActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_DSP_EX, stEncodeCapOld, 3000)) {
                        nStreaMask = stEncodeCapOld.dwStreamCap;
                    } else if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP, stEncodeCapNew, VideoNetListActivity.m_loginHandle, VideoNetListActivity.m_nGlobalChn, 1024 * 70)) {
                        nStreaMask = stEncodeCapNew.dwStreamCap;
                    }

                    Looper.loop();
                }
            }).start();

//            ToolKits.showMessage( v.getContext(), res.getString(R.string.login_activity_login_success));
            NET_IN_MEMBERNAME inMember = new NET_IN_MEMBERNAME();
            inMember.szCommand = new String();
            NET_OUT_MEMBERNAME outMember = new NET_OUT_MEMBERNAME(50, 260);
            boolean zMemberRet = INetSDK.GetMemberNames(m_loginHandle, inMember, outMember, 3000);

            m_speedCtrl = false;
            m_schedule = 0;
            SDK_DEV_ENABLE_INFO stEnableInfo = new SDK_DEV_ENABLE_INFO();
            if (INetSDK.QuerySystemInfo(VideoNetListActivity.m_loginHandle, SDK_SYS_ABILITY.ABILITY_DEVALL_INFO, stEnableInfo, 3000)) {
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
            nExtraChnNum = VideoNetListActivity.deviceInfo.byChanNum;
            if (-1 == VideoNetListActivity.deviceInfo.byChanNum) {
                SDK_PRODUCTION_DEFNITION stDef = new SDK_PRODUCTION_DEFNITION();
                boolean bRet = INetSDK.QueryProductionDefinition(VideoNetListActivity.m_loginHandle, stDef, 3000);
                if (bRet) {
                    nExtraChnNum = stDef.nVideoInChannel + stDef.nMaxRemoteInputChannels;
                }
            }
            nExtraAlarmOutPortNum = VideoNetListActivity.deviceInfo.byAlarmOutPortNum;

            //登录成功获取视频列表
            Message message = new Message();
            message.what = 1001;
            videoListHandler.sendMessage(message);
        }
        else
        {
            CommUtil.showToast(res.getString(R.string.login_activity_login_failed),VideoNetListActivity.this);
        }

    }

    @Override
    protected void onDestroy()
    {
        INetSDK.Cleanup();
        boolean bResult = INetSDK.Logout(VideoNetListActivity.m_loginHandle);

        if ( bResult == true )
        {
            VideoNetListActivity.m_loginHandle = 0;
        }

        super.onDestroy();
    }

    @Override
    protected void onResume() {
        // reset channel
        VideoNetListActivity.m_nGlobalChn = 0;
        VideoNetListActivity.m_nGlobalPbStream = 0;

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

    /**
     * 获取视频列表
     */
    private void getVideoList(){
        int nChnNum = nExtraChnNum;//视频站点 1~13 有视频  14~32黑屏

        ArrayList<String> alChn = new ArrayList<String>();
//        for (int i = 0; i < nChnNum; i++) {
//            alChn.add(res.getString(R.string.channel_name) + (i + 1));
//        }

        alChn.add(Contents.STATION_1);
        alChn.add(Contents.STATION_2);
        alChn.add(Contents.STATION_3);
        alChn.add(Contents.STATION_4);
        alChn.add(Contents.STATION_5);
        alChn.add(Contents.STATION_6);
        alChn.add(Contents.STATION_7);
        alChn.add(Contents.STATION_8);
        alChn.add(Contents.STATION_9);
        alChn.add(Contents.STATION_10);
        alChn.add(Contents.STATION_11);
        alChn.add(Contents.STATION_12);
        alChn.add(Contents.STATION_13);

        ArrayAdapter<String> aaChn = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alChn);//simple_list_item_single_choice
        mVideoList.setAdapter(aaChn);
        mVideoList.setSelection(m_nGlobalChn);
        mVideoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                m_nGlobalChn = position;
                jumpToLiveActivity();
            }
        });
    }

    /**
     * 登录成功获取视频列表
     */
    Handler videoListHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 1001){
                getVideoList();
            }
        }
    };

    public static LOGIN_MODE m_loginMode;
    public enum LOGIN_MODE {
        LOGIN_MODE_IP,
        LOGIN_MODE_P2P
    }

    /**
     * 跳转到实时画面
     */
    public void jumpToLiveActivity()
    {
        Intent intent = new Intent();
        intent.setClass(this, MyLiveActivity.class);
        startActivityForResult(intent, 2);
        setResult(4);
    }

    @OnClick(R.id.back)
    public void backOnclick(){
        setResult(4);
        finish();
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            setResult(4);
            finish();
            return false;
        }else {
            return super.onKeyDown(keyCode, event);
        }

    }

}
