package com.company.Demo;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.company.NetSDK.EM_USEDEV_MODE;
import com.company.NetSDK.INetSDK;
import com.nfcproject.R;

import java.util.ArrayList;

public class GlobalSettingActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.globalsetting);

        // 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
        INetSDK.LoadLibrarys();

        nExtraChnNum = getIntent().getIntExtra("name_nExtraChnNum", 0);
        nExtraAlarmOutPortNum = getIntent().getIntExtra("name_nExtraAlarmOutPortNum", 0);

        res = this.getResources();

        m_spGlobalChn = (Spinner)findViewById(R.id.sp_globalsetting_chn);
        m_spGlobalPbStream = (Spinner)findViewById(R.id.sp_globalsetting_pb_stream);
        m_btGlobalSet = (Button)findViewById(R.id.bt_globalsetting_set);

        int nChnNum = nExtraChnNum;

        ArrayList<String> alChn = new ArrayList<String>();
        for (int i = 0; i < nChnNum; i++) {
            alChn.add(res.getString(R.string.channel_name) + (i + 1));
        }
        ArrayAdapter<String> aaChn = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alChn);
        m_spGlobalChn.setAdapter(aaChn);
        m_spGlobalChn.setSelection(m_nGlobalChn);

        ArrayList<String> alPbStream = new ArrayList<String>();
        alPbStream.add(res.getString(R.string.global_setting_activity_pb_stream_all));
        alPbStream.add(res.getString(R.string.global_setting_activity_pb_stream_main));
        alPbStream.add(res.getString(R.string.global_setting_activity_pb_stream_sub));

        ArrayAdapter<String> aaStream = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alPbStream);
        m_spGlobalPbStream.setAdapter(aaStream);
        m_spGlobalPbStream.setSelection(m_nGlobalPbStream);

        m_btGlobalSet.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                m_nGlobalChn = m_spGlobalChn.getSelectedItemPosition();
                m_nGlobalPbStream = m_spGlobalPbStream.getSelectedItemPosition(); //0-主辅码流,1-主码流,2-辅码流
                boolean bPbStream = INetSDK.SetDeviceMode(TestNetSDKActivity.m_loginHandle, EM_USEDEV_MODE.SDK_RECORD_STREAM_TYPE, m_nGlobalPbStream);
                if (!bPbStream) {
                    ToolKits.showMessage(v.getContext(), res.getString(R.string.info_failed));
                    return;
                }

                ToolKits.showMessage(v.getContext(), res.getString(R.string.info_success));
            }
        });
    }

    private Spinner m_spGlobalChn;
    private Spinner m_spGlobalPbStream;
    private Button m_btGlobalSet;
    static int m_nGlobalChn = 0;
    static int m_nGlobalPbStream = 0;
    Resources res;

    private int nExtraChnNum;
    private int nExtraAlarmOutPortNum;
}
