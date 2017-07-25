package com.company.Demo;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;

import com.company.NetSDK.CB_fDownLoadPosCallBack;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_RECORDFILE_INFO;
import com.company.NetSDK.NET_TIME;
import com.nfcproject.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;


public class RecordListActivity extends Activity 
{
	private List<String> arrayData;
	Button m_btBeginCallback;

	TextView m_vBeginTime;
	Button m_btSetBeginTime;

	TextView m_tvBeginHMS;
	Button m_btBeginHMS;

	TextView m_vEndTime;
	Button m_btSetEndTime;

	TextView m_tvEndHMS;
	Button m_btEndHMS;

	ListView m_listView;

	Resources res;

	Calendar dateAndTime = Calendar.getInstance(Locale.CHINA);
	DateFormat fmtDateAndTime = DateFormat.getDateTimeInstance();

	DatePickerDialog.OnDateSetListener begin = new DatePickerDialog.OnDateSetListener()
	{
		@Override
		public void onDateSet(DatePicker arg0, int year, int monthOfYear, int dayOfMonth) {
			m_vBeginTime.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
		}
	};
	DatePickerDialog.OnDateSetListener end = new DatePickerDialog.OnDateSetListener()
	{
		@Override
		public void onDateSet(DatePicker arg0, int year, int monthOfYear, int dayOfMonth) {
			m_vEndTime.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
		}
	};

	public class TestDownLoadPosCallBack implements CB_fDownLoadPosCallBack {
		@Override
		public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize)
		{
			// TODO Auto-generated method stub

		}
	}

	NET_RECORDFILE_INFO m_stFileInfo[] = new NET_RECORDFILE_INFO[100];

	public void search()
	{
		String strBeginTime = m_vBeginTime.getText().toString();
		String strBeginHMS = m_tvBeginHMS.getText().toString();
		String strEndTime = m_vEndTime.getText().toString();
		String strEndHMS = m_tvEndHMS.getText().toString();

		String beginArray[] = strBeginTime.split("-");
		String beginHMSArr[] = strBeginHMS.split(":");
		String endArray[] = strEndTime.split("-");
		String endHMSArr[] = strEndHMS.split(":");

		NET_TIME stTimeStart = new NET_TIME();
		stTimeStart.dwYear = Integer.parseInt(beginArray[0]);
		stTimeStart.dwMonth = Integer.parseInt(beginArray[1]);
		stTimeStart.dwDay = Integer.parseInt(beginArray[2]);
		stTimeStart.dwHour = Integer.parseInt(beginHMSArr[0]);
		stTimeStart.dwMinute = Integer.parseInt(beginHMSArr[1]);
		stTimeStart.dwSecond = Integer.parseInt(beginHMSArr[2]);

		NET_TIME stTimeEnd = new NET_TIME();
		stTimeEnd.dwYear = Integer.parseInt(endArray[0]);
		stTimeEnd.dwMonth = Integer.parseInt(endArray[1]);
		stTimeEnd.dwDay = Integer.parseInt(endArray[2]);
		stTimeEnd.dwHour = Integer.parseInt(endHMSArr[0]);
		stTimeEnd.dwMinute = Integer.parseInt(endHMSArr[1]);
		stTimeEnd.dwSecond = Integer.parseInt(endHMSArr[2]);

		int nRecordFileType = 0;
		String cardID = "";

		for (int i = 0; i < m_stFileInfo.length; i++) {
			m_stFileInfo[i] = new NET_RECORDFILE_INFO();
		}

		Integer nFileCount = new Integer(0);
		int nWaitTime = 30000;
		boolean bTime = false;

		boolean bRetQ = INetSDK.QueryRecordFile(
				TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn,
				nRecordFileType, stTimeStart, stTimeEnd, cardID, m_stFileInfo, nFileCount, nWaitTime, bTime);

		if ( bRetQ == true && nFileCount > 0 )
		{
			arrayData = new ArrayList<String>();
			for ( int i=0; i<nFileCount; i++ )
			{
				arrayData.add( "No. " + i + ": " + String.valueOf(m_stFileInfo[i].filename) );
			}

			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1,arrayData);
			m_listView.setAdapter(adapter);

			m_listView.setOnItemClickListener(
					new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> parent, View view,
												int position, long id)
						{	// 获取指定内容，跳转到播放页面
							jumpToPlayView( position  );
						}
					});
		}
		else
		{
			ToolKits.showErrorMessage(this , "QueryRecordFile " + res.getString(R.string.info_failed));
		}
	}

	static public Object g_recordFileInfo = "test111";

	void jumpToPlayView( int pos )
	{
		g_recordFileInfo = m_stFileInfo[pos];

		Intent intent = new Intent();
		intent.setClass(this, RecordPlayActivity.class);
		startActivityForResult(intent, 2);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recordlistview);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res = this.getResources();

		m_listView = (ListView)findViewById(R.id.view_ListWindow);

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-d");

		m_vBeginTime = (TextView)findViewById(R.id.begintime_value);
		m_vBeginTime.setText(df.format(dateAndTime.getTime()));

		m_vEndTime = (TextView)findViewById(R.id.endtime_value);
		m_vEndTime.setText(df.format(dateAndTime.getTime()));

		m_btBeginCallback = (Button)findViewById(R.id.btn_search);
		m_btBeginCallback.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View arg0)
			{
				search();
			}
		});

		m_btSetBeginTime = (Button)findViewById(R.id.set_begin_time_btn);
		m_btSetBeginTime.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View arg0)
			{

				new DatePickerDialog(RecordListActivity.this, begin,
						dateAndTime.get(Calendar.YEAR),
						dateAndTime.get(Calendar.MONTH),
						dateAndTime.get(Calendar.DAY_OF_MONTH)).show();
			}
		});

		m_tvBeginHMS = (TextView)findViewById(R.id.tv_begin_time_HMS);
		m_btBeginHMS = (Button)findViewById(R.id.bt_begin_time_HMS);
		m_btBeginHMS.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				new TimePickerDialog(RecordListActivity.this, new TimePickerDialog.OnTimeSetListener() {
					@Override
					public void onTimeSet(TimePicker arg0, int arg1, int arg2) {
						// TODO Auto-generated method stub
						m_tvBeginHMS.setText(arg1 + ":" + arg2 + ":" + "00");
					}
				}, dateAndTime.get(Calendar.HOUR_OF_DAY), dateAndTime.get(Calendar.MINUTE), true).show();
			}
		});

		m_btSetEndTime = (Button)findViewById(R.id.set_end_time_btn);
		m_btSetEndTime.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View arg0)
			{
				new DatePickerDialog(RecordListActivity.this, end,
						dateAndTime.get(Calendar.YEAR),
						dateAndTime.get(Calendar.MONTH),
						dateAndTime.get(Calendar.DAY_OF_MONTH)).show();
			}
		});

		m_tvEndHMS = (TextView)findViewById(R.id.tv_end_time_HMS);
		m_btEndHMS = (Button)findViewById(R.id.bt_end_time_HMS);
		m_btEndHMS.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				new TimePickerDialog(RecordListActivity.this, new TimePickerDialog.OnTimeSetListener() {
					@Override
					public void onTimeSet(TimePicker arg0, int arg1, int arg2) {
						// TODO Auto-generated method stub
						m_tvEndHMS.setText(arg1 + ":" + arg2 + ":" + "00");
					}
				}, dateAndTime.get(Calendar.HOUR_OF_DAY), dateAndTime.get(Calendar.MINUTE), true).show();
			}
		});
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
	}
}