package com.company.Demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.nfcproject.R;

public class DateSettingActivity extends Activity {

	private int				mIndex;
	private TimePicker		mTimeStart;
	private TimePicker 		mTimeEnd;
	private int 		 	mStartHour;
	private int			 	mStartMinute;
	private int 		 	mEndHour;
	private int			 	mEndMinute;
	private Toast		 	mToast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		startUP();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.date_setting);
		initUI();
		initData();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	private void exit()
	{
		this.finish();
		overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
	}

	private void startUP()
	{
//		UIUtility.checkInit(this);

	}

	private void initUI()
	{

		TextView titleText = (TextView)findViewById(R.id.title_center);
		titleText.setText(R.string.remote_detect_time);
		ImageView btnBack = (ImageView)findViewById(R.id.title_left_image);
		btnBack.setBackgroundResource(R.drawable.title_btn_back);
		btnBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				exit();

			}
		});

		mTimeStart = (TimePicker)findViewById(R.id.timePicker);
		mTimeStart.setIs24HourView(true);
		mTimeEnd = (TimePicker)findViewById(R.id.timePicker2);
		mTimeEnd.setIs24HourView(true);

		Button confirm = (Button)findViewById(R.id.date_ok);
		confirm.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				mTimeStart.clearFocus();
				mTimeEnd.clearFocus();
				mTimeStart.invalidate();
				mTimeEnd.invalidate();
				mStartHour =  mTimeStart.getCurrentHour();   //0~23小时制
				mStartMinute = mTimeStart.getCurrentMinute();
				mEndHour = mTimeEnd.getCurrentHour();
				mEndMinute = mTimeEnd.getCurrentMinute();
				if(!ValidForInput())
				{
					showToast(R.string.pb_time_restrict);
					return;
				}
				Intent intent = new Intent();
				String time = String.format("%02d:%02d:00-%02d:%02d:59", mStartHour,mStartMinute,mEndHour,mEndMinute);
				intent.putExtra("index", mIndex);
				intent.putExtra("time", time);
				setResult(RESULT_OK,intent);
				exit();
			}
		});
	}


	private void initData()
	{
		try
		{
			mIndex = this.getIntent().getIntExtra("index", 0);
			String timeStr = this.getIntent().getStringExtra("time");
			String[] times = timeStr.split("-");
			String[] startTime = times[0].split(":");
			String[] endTime = times[1].split(":");
			mStartHour = Integer.valueOf(startTime[0]);
			mStartMinute = Integer.valueOf(startTime[1]);
			mEndHour = Integer.valueOf(endTime[0]);
			mEndMinute = Integer.valueOf(endTime[1]);

			//按照获取到得配置信息显示时间
			mTimeStart.setCurrentHour(mStartHour);
			mTimeStart.setCurrentMinute(mStartMinute);
			mTimeEnd.setCurrentHour(mEndHour);
			mTimeEnd.setCurrentMinute(mEndMinute);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private boolean ValidForInput()
	{
		int extHour = mEndHour - mStartHour;
		int extMinute = mEndMinute - mStartMinute;

		if(extHour > 0 || (extHour ==0 && extMinute >0))
		{
			return true;
		}
		return false;

	}

	private void showToast(final int resId)
	{
		if(DateSettingActivity.this.isFinishing())
		{
			return;
		}
		runOnUiThread(new Runnable() {

			@Override
			public void run() {
				if(mToast == null)
				{
					mToast = Toast.makeText(DateSettingActivity.this, resId, Toast.LENGTH_LONG);
				}
				mToast.setText(resId);
				mToast.setDuration(Toast.LENGTH_SHORT);
				mToast.show();

			}
		});

	}

}
