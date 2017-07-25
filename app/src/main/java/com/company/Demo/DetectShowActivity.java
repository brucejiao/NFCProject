package com.company.Demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.nfcproject.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

//import com.mm.android.avnetsdk.protocolstack.entity.config.TimeSection;

public class DetectShowActivity extends Activity {

	private ArrayList<String> 						mTimeList;
	private LinkedHashMap<String, List<SetTime>> 	mTimeMap;
	private DetectView								mDetectView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		UIUtility.checkInit(DetectShowActivity.this);
		setContentView(R.layout.detect_show);
		initUI();
		initData(this.getIntent());
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode == RESULT_OK && data != null)
		{
			initData(data);
		}

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK)
		{
			exit();
		}
		return super.onKeyDown(keyCode, event);
	}

	private void exit()
	{
		Intent data = new Intent();
		data.putStringArrayListExtra("time", mTimeList);
		setResult(RESULT_OK, data);
		DetectShowActivity.this.finish();
		overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
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

		final ImageView rightBtn = (ImageView)findViewById(R.id.title_right_image);
		rightBtn.setBackgroundResource(R.drawable.title_btn_modify);
		rightBtn.setVisibility(View.VISIBLE);
		rightBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				goSettingActivity();

			}
		});

		mDetectView = (DetectView) findViewById(R.id.detect_view);
	}

	private void initData(Intent intent)
	{
		mTimeList = intent.getStringArrayListExtra("time");
		if(mTimeList != null)
		{
			String[] week = this.getResources().getStringArray(R.array.week_short);
			mTimeMap = new LinkedHashMap<String, List<SetTime>>();
			for(int i =0; i< TimeSection.DAYS_OF_WEEK; i++)
			{
				List<SetTime> timeList = new ArrayList<SetTime>();
				for(int j =0; j< TimeSection.MAX_COUNT_OF_TS;j++)
				{
					String s =  mTimeList.get(i*TimeSection.MAX_COUNT_OF_TS + j);
					SetTime time = getTimeByStr(s);
					if(time != null)
					{
						timeList.add(time);
					}
				}
				mTimeMap.put(week[i], timeList);
			}

			mDetectView.setTimes(mTimeMap);
		}
	}

	private SetTime getTimeByStr(String timeStr)
	{
		String[] tmp = timeStr.split(" ");
		if(tmp[0].equals("1"))
		{
			String[] time = tmp[1].split("-");
			String[] s = time[0].split(":");
			String[] e = time[1].split(":");
			Time sTime = null;
			Time eTime = null;
			sTime = new Time(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
			eTime = new Time(Integer.parseInt(e[0]), Integer.parseInt(e[1]), Integer.parseInt(e[2]));
			SetTime setTime = new SetTime(sTime, eTime);
			return setTime;
		}
		else
		{
			return null;
		}
	}
	private void goSettingActivity()
	{
		Intent intent = new Intent();
		intent.setClass(this, DetectSettingActivity.class);
		intent.putStringArrayListExtra("time",mTimeList);
		startActivityForResult(intent, 0);
		overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
	}

}
