package com.company.Demo;

import android.app.Activity;
import android.content.res.Resources;
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

import com.company.NetSDK.CFG_CAP_RECORD_INFO;
import com.company.NetSDK.CFG_RECORD_INFO;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.nfcproject.R;

import java.util.ArrayList;

public class RecordPlanConfig extends Activity{
	Spinner m_spChn;
	TextView m_tvPreRec;
	EditText m_etPreRec;
	CheckBox m_cbRedundancy;
	Spinner m_spStream;
	Spinner m_spDay;
	Spinner m_spSeg;
	EditText m_etStartHour;
	EditText m_etStartMin;
	EditText m_etStartSec;
	EditText m_etStopHour;
	EditText m_etStopMin;
	EditText m_etStopSec;
	CheckBox m_cbMotion;
	CheckBox m_cbAlarm;
	CheckBox m_cbNormal;
	CheckBox m_cbMAndA;
	Button m_btSave;
	
	Resources res;
	
	private ArrayList<String> m_alChn = new ArrayList<String>();
	private static String[] m_strStream;
	private static String[] m_strDay;
	private static String[] m_strSeg;
	
	private CFG_RECORD_INFO stRecordCfg[];
	private int nChnNum = 0;
	
	CFG_CAP_RECORD_INFO stCapRecord = new CFG_CAP_RECORD_INFO();
	
	private int nExtraChnNum;
 	private int nExtraAlarmOutPortNum;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordplan);
        
	    // һ�㲻��Ҫ���������ż�����ֹ� ���������̨�ϳ�ʱ�䣬�޷��ҵ�native���������
		INetSDK.LoadLibrarys();
        
        nExtraChnNum = getIntent().getIntExtra("name_nExtraChnNum", 0);
        nExtraAlarmOutPortNum = getIntent().getIntExtra("name_nExtraAlarmOutPortNum", 0);
        
        res = this.getResources();
        
        m_strStream = new String[]{res.getString(R.string.stream_master), res.getString(R.string.stream_sub1), 
        		res.getString(R.string.stream_sub2), res.getString(R.string.stream_sub3)};
        m_strDay = new String[]{res.getString(R.string.week_day_sun), res.getString(R.string.week_day_mon), res.getString(R.string.week_day_tue), 
        		res.getString(R.string.week_day_wed), res.getString(R.string.week_day_thur), res.getString(R.string.week_day_fri), res.getString(R.string.week_day_sat)};
        m_strSeg = new String[]{res.getString(R.string.record_plan_seg1), res.getString(R.string.record_plan_seg2), res.getString(R.string.record_plan_seg3), 
        		res.getString(R.string.record_plan_seg4), res.getString(R.string.record_plan_seg5), res.getString(R.string.record_plan_seg6)};
        
        m_spChn = (Spinner)findViewById(R.id.sp_rec_chn);
        m_tvPreRec = (TextView)findViewById(R.id.tv_rec_chn);
        m_etPreRec = (EditText)findViewById(R.id.et_rec_time);
        m_cbRedundancy = (CheckBox)findViewById(R.id.cb_rec_redundancy);
        m_spStream = (Spinner)findViewById(R.id.sp_rec_stream);
        m_spDay = (Spinner)findViewById(R.id.sp_rec_day);
        m_spSeg = (Spinner)findViewById(R.id.sp_rec_seg);
        m_etStartHour = (EditText)findViewById(R.id.et_rec_start_hour);
        m_etStartMin = (EditText)findViewById(R.id.et_rec_start_min);
        m_etStartSec = (EditText)findViewById(R.id.et_rec_start_sec);
        m_etStopHour = (EditText)findViewById(R.id.et_rec_stop_hour);
        m_etStopMin = (EditText)findViewById(R.id.et_rec_stop_min);
        m_etStopSec = (EditText)findViewById(R.id.et_rec_stop_sec);
        m_cbMotion = (CheckBox)findViewById(R.id.cb_rec_motion);
        m_cbAlarm = (CheckBox)findViewById(R.id.cb_rec_alarm);
        m_cbNormal = (CheckBox)findViewById(R.id.cb_rec_normal);
        m_cbMAndA = (CheckBox)findViewById(R.id.cb_rec_motionandalarm);
        m_btSave = (Button)findViewById(R.id.bt_rec_save);
        
        m_cbMAndA.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
        		if (m_cbMAndA.isChecked()) {
        			m_cbMotion.setChecked(false);
        			m_cbMotion.setClickable(false);
        			m_cbAlarm.setChecked(false);
        			m_cbAlarm.setClickable(false);
        		} else {
        			m_cbMotion.setClickable(true);
        			m_cbAlarm.setClickable(true);
        		}
        	}
        });
        
        ArrayAdapter<String> apStream = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, m_strStream);
        m_spStream.setAdapter(apStream);
        
        ArrayAdapter<String> apDay = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, m_strDay);
        m_spDay.setAdapter(apDay);
        
        ArrayAdapter<String> apSeg = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, m_strSeg);
        m_spSeg.setAdapter(apSeg);
        
//        NET_DEV_CHN_COUNT_INFO stChnCount = new NET_DEV_CHN_COUNT_INFO();
//        INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_DEV_CHN_COUNT, stChnCount, 3000);
//        nChnNum = nExtraChnNum < stChnCount.stuVideoIn.nMaxTotal ? nExtraChnNum : stChnCount.stuVideoIn.nMaxTotal;
        nChnNum = nExtraChnNum;
        stRecordCfg = new CFG_RECORD_INFO[nChnNum];
        for (int i = 0; i < nChnNum; i++) {
        	m_alChn.add(res.getString(R.string.channel_name) + (i + 1));
        	stRecordCfg[i] = new CFG_RECORD_INFO();
        	boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORD, stRecordCfg[i], TestNetSDKActivity.m_loginHandle, i, 4096);
        	if (!zRet) {
        		ToolKits.showErrorMessage(this, res.getString(R.string.record_plan_get_failed));
        	}
        }
        ArrayAdapter<String> apChn = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, m_alChn);
        m_spChn.setAdapter(apChn);
        m_spChn.setOnItemSelectedListener(new SpSelectedListener());
        m_spDay.setOnItemSelectedListener(new SpSelectedListener());
        m_spSeg.setOnItemSelectedListener(new SpSelectedListener());
        
        m_btSave.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
        		saveCurrentPlan();
        	}
        });
        
        // ��������
        if (0 == (TestNetSDKActivity.m_schedule & 0x01)) {
        	m_cbRedundancy.setEnabled(false);
        }
        
        // Ԥ¼����
        if (0 != (TestNetSDKActivity.m_schedule & 0x02)) {
        	char szOutBuffer[] = new char[10240];
    		Integer stError = new Integer(0);
    		boolean bQN = INetSDK.QueryNewSystemInfo(TestNetSDKActivity.m_loginHandle, FinalVar.CFG_CAP_CMD_RECORD, 0, szOutBuffer, stError, 5000);
    		if (bQN) {
    			bQN = INetSDK.ParseData(FinalVar.CFG_CAP_CMD_RECORD, szOutBuffer, stCapRecord, null);
    			if (!bQN) {
    				ToolKits.showErrorMessage(this, "ParseData CFG_CAP_CMD_RECORD " + res.getString(R.string.info_failed));
    			} else {
    				String strTxPreRec = m_tvPreRec.getText().toString();
    				m_tvPreRec.setText(strTxPreRec + "[0," + stCapRecord.dwMaxPreRecordTime + "]");
    			}
    		} else {
    			ToolKits.showErrorMessage(this, "QueryNewSystemInfo CFG_CAP_CMD_RECORD " + res.getString(R.string.info_failed));
    		}
        } else {
        	m_etPreRec.setEnabled(false);
        }
	}
	
	@Override
	protected void onDestroy() 
	{
		super.onDestroy();
	}
	
	private class SpSelectedListener implements Spinner.OnItemSelectedListener {
		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			if (position >= 0) {
				switch (parent.getId()) {
				case R.id.sp_rec_chn:
					updateChnRecordPlan(position);
					break;
				case R.id.sp_rec_day:
					updateDayRecordPlan(position);
					break;
				case R.id.sp_rec_seg:
					updateSegRecordPlan(position);
					break;
				}
			}
		}
		
		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			
		}
	}
	
	private void updateChnRecordPlan(int pos) {
		if ((null != stRecordCfg) && (null != stRecordCfg[pos])) {
			m_etPreRec.setText("" + stRecordCfg[pos].nPreRecTime);
			m_cbRedundancy.setChecked(stRecordCfg[pos].bRedundancyEn);
			m_spStream.setSelection(stRecordCfg[pos].nStreamType);
			m_spDay.setSelection(0);
			updateDayRecordPlan(0);
		}
	}
	
	private void updateDayRecordPlan(int pos) {
		int nChn = m_spChn.getSelectedItemPosition();
		if ((null != stRecordCfg) && (nChn >=0) && (null != stRecordCfg[nChn])) {
			m_spSeg.setSelection(0);
			updateSegRecordPlan(0);
		}
	}
	
	private void updateSegRecordPlan(int pos) {
		int nChn = m_spChn.getSelectedItemPosition();
		int nDay = m_spDay.getSelectedItemPosition();
		if ((null != stRecordCfg) && (nChn >=0) && (null != stRecordCfg[nChn]) && (nDay >= 0)) {
			m_etStartHour.setText("" + stRecordCfg[nChn].stuTimeSection[nDay][pos].nBeginHour);
			m_etStartMin.setText("" + stRecordCfg[nChn].stuTimeSection[nDay][pos].nBeginMin);
			m_etStartSec.setText("" + stRecordCfg[nChn].stuTimeSection[nDay][pos].nBeginSec);
			m_etStopHour.setText("" + stRecordCfg[nChn].stuTimeSection[nDay][pos].nEndHour);
			m_etStopMin.setText("" + stRecordCfg[nChn].stuTimeSection[nDay][pos].nEndMin);
			m_etStopSec.setText("" + stRecordCfg[nChn].stuTimeSection[nDay][pos].nEndSec);
			
			m_cbMotion.setChecked((stRecordCfg[nChn].stuTimeSection[nDay][pos].dwRecordMask & 0x00000001) == 0 ? false : true);
			m_cbAlarm.setChecked((stRecordCfg[nChn].stuTimeSection[nDay][pos].dwRecordMask & 0x00000002) == 0 ? false : true);
			m_cbNormal.setChecked((stRecordCfg[nChn].stuTimeSection[nDay][pos].dwRecordMask & 0x00000004) == 0 ? false : true);
			m_cbMAndA.setChecked((stRecordCfg[nChn].stuTimeSection[nDay][pos].dwRecordMask & 0x00000008) == 0 ? false : true);
			if (m_cbMAndA.isChecked()) {
				m_cbMotion.setClickable(false);
				m_cbAlarm.setClickable(false);
			} else {
				m_cbMotion.setClickable(true);
				m_cbAlarm.setClickable(true);
			}
		}
	}
	
	private void saveCurrentPlan() {
		try{
			int nChn = m_spChn.getSelectedItemPosition();
			int nStream = m_spStream.getSelectedItemPosition();
			int nDay = m_spDay.getSelectedItemPosition();
			int nSeg = m_spSeg.getSelectedItemPosition();
			int nPreTime = Integer.parseInt(m_etPreRec.getText().toString());
			if (0 != stCapRecord.dwMaxPreRecordTime) {
				if ((nPreTime <0)
					|| (nPreTime > stCapRecord.dwMaxPreRecordTime)) {
					ToolKits.showMessage(this, res.getString(R.string.record_plan_prerec_failed));
					return;
				}
			}
			boolean zRedundancy = m_cbRedundancy.isChecked();
			boolean zMotion = m_cbMotion.isChecked();
			boolean zAlarm = m_cbAlarm.isChecked();
			boolean zNormal = m_cbNormal.isChecked();
			boolean zMAndA = m_cbMAndA.isChecked();
			
			int nBeginHour = Integer.parseInt(m_etStartHour.getText().toString());
			int nBeginMin = Integer.parseInt(m_etStartMin.getText().toString());
			int nBeginSec = Integer.parseInt(m_etStartSec.getText().toString());
			int nEndHour = Integer.parseInt(m_etStopHour.getText().toString());
			int nEndMin = Integer.parseInt(m_etStopMin.getText().toString());
			int nEndSec = Integer.parseInt(m_etStopSec.getText().toString());
			
			if ((nBeginHour < 0 || nBeginHour > 23)
					|| (nBeginMin < 0 || nBeginMin > 59)
					|| (nBeginSec < 0 || nBeginSec > 59)
					|| (nEndHour < 0 || nEndHour > 24)
					|| (nEndMin < 0 || nEndMin > 59)
					|| (nEndSec < 0 || nEndSec > 59)
					|| (nEndHour == 24 && (nEndMin != 0 || nEndSec != 0))) {
				ToolKits.showMessage(this, res.getString(R.string.record_plan_time_invalid));
				return;
			}
			
			int nBeginTime = nBeginHour * 10000 + nBeginMin * 100 + nBeginSec;
			int nEndTime = nEndHour * 10000 + nEndMin * 100 + nEndSec;
			if (nBeginTime > nEndTime) {
				ToolKits.showMessage(this, res.getString(R.string.record_plan_time_failed));
				return;
			}
			
			if ((null != stRecordCfg) && (nChn >=0) && (null != stRecordCfg[nChn]) && (nDay >= 0) && (nSeg >= 0) && (nStream >= 0)) {
				stRecordCfg[nChn].nPreRecTime = nPreTime;
				stRecordCfg[nChn].bRedundancyEn = zRedundancy;
				stRecordCfg[nChn].nStreamType = nStream;
				
				stRecordCfg[nChn].stuTimeSection[nDay][nSeg].nBeginHour = nBeginHour;
				stRecordCfg[nChn].stuTimeSection[nDay][nSeg].nBeginMin = nBeginMin;
				stRecordCfg[nChn].stuTimeSection[nDay][nSeg].nBeginSec = nBeginSec;
				
				stRecordCfg[nChn].stuTimeSection[nDay][nSeg].nEndHour = nEndHour;
				stRecordCfg[nChn].stuTimeSection[nDay][nSeg].nEndMin = nEndMin;
				stRecordCfg[nChn].stuTimeSection[nDay][nSeg].nEndSec = nEndSec;
				
				
				if (zMotion) {
					stRecordCfg[nChn].stuTimeSection[nDay][nSeg].dwRecordMask |= 0x01;
				} else {
					stRecordCfg[nChn].stuTimeSection[nDay][nSeg].dwRecordMask &= 0xFFFFFFFE;
				}
				
				if (zAlarm) {
					stRecordCfg[nChn].stuTimeSection[nDay][nSeg].dwRecordMask |= 0x02;
				} else {
					stRecordCfg[nChn].stuTimeSection[nDay][nSeg].dwRecordMask &= 0xFFFFFFFD;
				}
				
				if (zNormal) {
					stRecordCfg[nChn].stuTimeSection[nDay][nSeg].dwRecordMask |= 0x04;
				} else {
					stRecordCfg[nChn].stuTimeSection[nDay][nSeg].dwRecordMask &= 0xFFFFFFFB;
				}
				
				if (zMAndA) {
					stRecordCfg[nChn].stuTimeSection[nDay][nSeg].dwRecordMask |= 0x08;
				} else {
					stRecordCfg[nChn].stuTimeSection[nDay][nSeg].dwRecordMask &= 0xFFFFFFF7;
				}
				
				boolean zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORD, stRecordCfg[nChn], TestNetSDKActivity.m_loginHandle, nChn, 4096);
	        	if (!zRet) {
	        		ToolKits.showErrorMessage(this, res.getString(R.string.info_failed));
	        	}
	        	else{
	        		ToolKits.showMessage(this, res.getString(R.string.info_success));
	        	}
			}
		}catch(Exception ex){
			ToolKits.writeLog("Input Data is invalid");	
		}
	}
}
