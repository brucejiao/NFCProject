package com.company.Demo;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.company.NetSDK.ALARM_ARM_DISARM_STATE_INFO;
import com.company.NetSDK.ALARM_CONTROL;
import com.company.NetSDK.CB_fMessageCallBack;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_CLIENT_ALARM_STATE;
import com.company.NetSDK.NET_CLIENT_MOTIONDETECT_STATE;
import com.company.NetSDK.NET_CLIENT_VIDEOLOST_STATE;
import com.company.NetSDK.SDK_IOTYPE;
import com.company.NetSDK.SDK_MOTION_DETECT_CFG_EX;
import com.nfcproject.R;

import java.util.LinkedList;
import java.util.Queue;


public class AlarmActivity extends Activity {
    CheckBox m_cbEnable;
    CheckBox m_cbExternal;
    CheckBox m_cbLost;
    CheckBox m_cbDynamic;
    CheckBox m_cbShelter;
    CheckBox m_cbStatic;

    Button m_btQuery;
    Button   m_btStart;

    Button   m_btAlarmIn;
    Button   m_btAlarmOut;

    EditText m_etAlarmInfo;

    Handler m_Hander = new Handler(){};
    Queue<String> m_qAlarmInfo = new LinkedList<String>();
    int		m_index = 0;
    String m_strInfo = "";

    Resources res;

    static boolean m_zListening = false;

    ALARM_CONTROL stInCtr[];
    ALARM_CONTROL stOutCtr[];
    Integer stIOCountIn = new Integer(0);
    Integer stIOCountOut = new Integer(0);
    private final int ALARM_IN_FLAG = 220;
    private final int ALARM_OUT_FLAG = 221;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm);

        // 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
        INetSDK.LoadLibrarys();

        res = this.getResources();

        m_cbEnable = (CheckBox)findViewById(R.id.cb_enable);
        m_cbExternal = (CheckBox)findViewById(R.id.cb_external);
        m_cbLost = (CheckBox)findViewById(R.id.cb_lost);
        m_cbDynamic = (CheckBox)findViewById(R.id.cb_dynamic);
        m_cbShelter = (CheckBox)findViewById(R.id.cb_shelter);
        m_cbStatic = (CheckBox)findViewById(R.id.cb_static);

        m_btQuery = (Button)findViewById(R.id.bt_query);
        m_btStart = (Button)findViewById(R.id.bt_start);

        m_btAlarmIn = (Button)findViewById(R.id.bt_alarm_in);
        m_btAlarmOut = (Button)findViewById(R.id.bt_alarm_out);

        m_etAlarmInfo = (EditText)findViewById(R.id.et_AlarmInfo);

        m_btQuery.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                queryAlarmInfo();
            }
        });

        m_btStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (false == m_zListening) {
                    startListenAlarm();
                } else {
                    stopListenAlarm();
                }
            }
        });

        m_btAlarmIn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] channelNames = new String[stIOCountIn];
                int[] chnAll = new int[stIOCountIn];
                int   usefulCount = 0;
                for (int i = 0; i < stIOCountIn; i++) {
                    String s = AlarmActivity.this.getString(R.string.remote_chn_num);
                    String channelName = s + " " +String.format("%02d", i+1);
                    channelNames[i] = channelName;

                    if (stInCtr[i].state != 0) {
                        chnAll[usefulCount] = i;
                        usefulCount++;
                    }
                }

                int[] chnUseful = new int[usefulCount];
                System.arraycopy(chnAll, 0, chnUseful, 0, usefulCount);

                Intent intent = new Intent();
                intent.putExtra("channelNames", channelNames);
                intent.putExtra("usefulChannel", chnUseful);	//通道号从0开始
                intent.setClass(AlarmActivity.this, ChannelChooseActivity.class);
                startActivityForResult(intent, ALARM_IN_FLAG);
                overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
            }
        });

        m_btAlarmOut.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] channelNames = new String[stIOCountOut];
                int[] chnAll = new int[stIOCountOut];
                int   usefulCount = 0;
                for (int i = 0; i < stIOCountOut; i++) {
                    String s = AlarmActivity.this.getString(R.string.remote_chn_num);
                    String channelName = s + " " +String.format("%02d", i+1);
                    channelNames[i] = channelName;

                    if (stOutCtr[i].state != 0) {
                        chnAll[usefulCount] = i;
                        usefulCount++;
                    }
                }

                int[] chnUseful = new int[usefulCount];
                System.arraycopy(chnAll, 0, chnUseful, 0, usefulCount);

                Intent intent = new Intent();
                intent.putExtra("channelNames", channelNames);
                intent.putExtra("usefulChannel", chnUseful);	//通道号从0开始
                intent.setClass(AlarmActivity.this, ChannelChooseActivity.class);
                startActivityForResult(intent, ALARM_OUT_FLAG);
                overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
            }
        });

        INetSDK.SetDVRMessCallBack(new Test_CB_fMessageCallBack());

        boolean zRet = INetSDK.QueryIOControlState(TestNetSDKActivity.m_loginHandle, SDK_IOTYPE.SDK_ALARMINPUT, null, stIOCountIn, 5000);
        stInCtr = new ALARM_CONTROL[stIOCountIn];
        for (int i = 0; i < stIOCountIn; i++)
        {
            stInCtr[i] = new ALARM_CONTROL();
        }
        zRet = INetSDK.QueryIOControlState(TestNetSDKActivity.m_loginHandle, SDK_IOTYPE.SDK_ALARMINPUT, stInCtr, stIOCountIn, 5000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryIOControlState SDK_ALARMINPUT " + res.getString(R.string.info_failed));
        }

        zRet = INetSDK.QueryIOControlState(TestNetSDKActivity.m_loginHandle, SDK_IOTYPE.SDK_ALARMOUTPUT, null, stIOCountOut, 5000);
        stOutCtr = new ALARM_CONTROL[stIOCountOut];
        for (int i = 0; i < stIOCountOut; i++)
        {
            stOutCtr[i] = new ALARM_CONTROL();
        }
        zRet = INetSDK.QueryIOControlState(TestNetSDKActivity.m_loginHandle, SDK_IOTYPE.SDK_ALARMOUTPUT, stOutCtr, stIOCountOut, 5000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryIOControlState SDK_ALARMOUTPUT " + res.getString(R.string.info_failed));
        }
    }

    @Override
    public void onDestroy() {
        if (m_zListening) {
            stopListenAlarm();
        }
        super.onDestroy();
    }

    void queryAlarmInfo() {
        boolean zRet;

        ALARM_ARM_DISARM_STATE_INFO stuAlarmArmDisarmState = new ALARM_ARM_DISARM_STATE_INFO();
        zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_ALARM_ARM_DISARM, stuAlarmArmDisarmState, 5000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryDevState SDK_DEVSTATE_ALARM_ARM_DISARM " + res.getString(R.string.info_failed));
            //return;
        }

        NET_CLIENT_ALARM_STATE stNetAlarmState = new NET_CLIENT_ALARM_STATE();
        zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_ALARM, stNetAlarmState, 5000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryDevState SDK_DEVSTATE_ALARM " + res.getString(R.string.info_failed));
            //return;
        }

        NET_CLIENT_VIDEOLOST_STATE stNetVideoLostState = new NET_CLIENT_VIDEOLOST_STATE();
        zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_VIDEOLOST, stNetVideoLostState, 5000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryDevState SDK_DEVSTATE_VIDEOLOST " + res.getString(R.string.info_failed));
            //return;
        }

        NET_CLIENT_MOTIONDETECT_STATE stNetMotionDetectState = new NET_CLIENT_MOTIONDETECT_STATE();
        zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_MOTIONDETECT, stNetMotionDetectState, 5000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryDevState SDK_DEVSTATE_MOTIONDETECT " + res.getString(R.string.info_failed));
            //return;
        }

        byte bShelter[] = new byte[16];
        zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_SHELTER_ALARM, bShelter, 5000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryDevState SDK_DEVSTATE_SHELTER_ALARM " + res.getString(R.string.info_failed));
            //return;
        }

        Integer stStatic = new Integer(0);
        zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_STATIC_ALARM, stStatic, 7000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryDevState SDK_DEVSTATE_STATIC_ALARM " + res.getString(R.string.info_failed));
            //return;
        }

        int nArrInd = GlobalSettingActivity.m_nGlobalChn / 32;
        int nChnInd = GlobalSettingActivity.m_nGlobalChn % 32;

        m_cbEnable.setChecked(stuAlarmArmDisarmState.bState == 0 ? false : true);
        m_cbExternal.setChecked((stNetAlarmState.dwAlarmState[nArrInd] & (0x01 << nChnInd)) == 0 ? false : true);
        m_cbLost.setChecked((stNetVideoLostState.dwAlarmState[nArrInd] & (0x01 << nChnInd)) == 0 ? false : true);
        m_cbDynamic.setChecked((stNetMotionDetectState.dwAlarmState[nArrInd] & (0x01 << nChnInd)) == 0 ? false : true);
        if (GlobalSettingActivity.m_nGlobalChn < 32) {
            m_cbStatic.setChecked((stStatic.intValue() & (0x01 << GlobalSettingActivity.m_nGlobalChn)) == 0 ? false : true);
        }
        if (GlobalSettingActivity.m_nGlobalChn < 16) {
            m_cbShelter.setChecked(bShelter[GlobalSettingActivity.m_nGlobalChn] == 0 ? false : true);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }

        if (requestCode == ALARM_IN_FLAG && resultCode == RESULT_OK) {
            final int[] channelNums = data.getIntArrayExtra("usefulChannel");
            for (int i = 0; i < stIOCountIn; i++) {
                stInCtr[i].state = 0;
            }

            for (int i = 0; i < channelNums.length; i++) {
                stInCtr[channelNums[i]].state = 1;
            }

            boolean zRet = INetSDK.IOControl(TestNetSDKActivity.m_loginHandle, SDK_IOTYPE.SDK_ALARMINPUT, stInCtr);
            if (zRet) {
                ToolKits.showMessage(this, "IOControl SDK_ALARMINPUT " + res.getString(R.string.info_success));
            }
        } else if (requestCode == ALARM_OUT_FLAG && resultCode == RESULT_OK) {
            final int[] channelNums = data.getIntArrayExtra("usefulChannel");
            for (int i = 0; i < stIOCountOut; i++) {
                stOutCtr[i].state = 0;
            }

            for (int i = 0; i < channelNums.length; i++) {
                stOutCtr[channelNums[i]].state = 1;
            }

            boolean zRet = INetSDK.IOControl(TestNetSDKActivity.m_loginHandle, SDK_IOTYPE.SDK_ALARMOUTPUT, stOutCtr);
            if (zRet) {
                ToolKits.showMessage(this, "IOControl SDK_ALARMOUTPUT "  + res.getString(R.string.info_success));
            }
        }
    }

    void startListenAlarm() {
        // here config motion enable, then motion event will reported
        SDK_MOTION_DETECT_CFG_EX stDetCfg[] = new SDK_MOTION_DETECT_CFG_EX[1];
        stDetCfg[0] = new SDK_MOTION_DETECT_CFG_EX();
        Integer stRetBytes = new Integer(0);
        boolean zRet = INetSDK.GetDevConfig(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEV_MOTIONALARM_CFG, GlobalSettingActivity.m_nGlobalChn, stDetCfg, stRetBytes, 5000);
        if (zRet) {
            stDetCfg[0].byMotionEn = 1;
            zRet = INetSDK.SetDevConfig(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEV_MOTIONALARM_CFG, GlobalSettingActivity.m_nGlobalChn, stDetCfg, 5000);
        }

        Integer stProVer = new Integer(0);
        zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle,
                FinalVar.SDK_DEVSTATE_PROTOCAL_VER, stProVer, 1000);
        if (!zRet) {
            ToolKits.showErrorMessage(this, "QueryDevState " + res.getString(R.string.info_failed));
            return;
        }

        if (stProVer.intValue() < 5) {
            zRet = INetSDK.StartListen(TestNetSDKActivity.m_loginHandle);
            if (!zRet) {
                ToolKits.showErrorMessage(this, "StartListen " + res.getString(R.string.info_failed));
                return;
            }
        } else {
            zRet = INetSDK.StartListenEx(TestNetSDKActivity.m_loginHandle);
            if (!zRet) {
                ToolKits.showErrorMessage(this, "StartListenEx " + res.getString(R.string.info_failed));
                return;
            }
        }

        m_zListening = true;
        m_btStart.setText(R.string.alarm_activity_stop);

        m_index = 0;
        m_etAlarmInfo.setText("");
    }

    void stopListenAlarm() {
        INetSDK.StopListen(TestNetSDKActivity.m_loginHandle);
        m_zListening = false;
        m_btStart.setText(R.string.alarm_activity_start);
    }

    class Test_CB_fMessageCallBack implements CB_fMessageCallBack {
        @Override
        public boolean invoke(int lCommand, long lLoginID, Object obj, String pchDVRIP, int nDVRPort) {
            if (10 == m_qAlarmInfo.size()) {
                m_qAlarmInfo.poll();
            }
            m_qAlarmInfo.add("[" + ++m_index + "]" + "Get Alarm Event ,  Type is " + lCommand + "\n");

            m_strInfo = "";
            for (String str : m_qAlarmInfo) {
                m_strInfo += str;
            }
            m_Hander.post(new Runnable() {
                public void run() {
                    m_etAlarmInfo.setText(m_strInfo);
                    m_etAlarmInfo.setSelection( m_etAlarmInfo.getText().length());
                }
            });
            return true;
        }
    }
}
