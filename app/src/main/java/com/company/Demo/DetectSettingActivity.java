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

//import com.mm.android.avnetsdk.protocolstack.entity.config.TimeSection;

public class DetectSettingActivity extends Activity {

	private static final String			OFF				= "off";
	private static final String			ON				= "on";
	private static final int 			OPENDAY			= 100;
	private static final int 			OPENCOPY		= 101;
	private static final int 			OPENTIME		= 102;
	private static final int 			TIMECOUNT		= 6;
	private static final int[] 			layoutId 		= {R.id.detect_time1_layout, R.id.detect_time2_layout,R.id.detect_time3_layout,
														   R.id.detect_time4_layout,R.id.detect_time5_layout,R.id.detect_time6_layout};
	private static final int[] 			textId 	 		= {R.id.detect_time1,R.id.detect_time2,R.id.detect_time3,
															R.id.detect_time4,R.id.detect_time5,R.id.detect_time6};
	private static final int[] 			labelId 	 	= {R.id.detect_time1_text,R.id.detect_time2_text,R.id.detect_time3_text,
															R.id.detect_time4_text,R.id.detect_time5_text,R.id.detect_time6_text};
	private static final int[] 			imageId 	 	= {R.id.detect_time1_check,R.id.detect_time2_check,R.id.detect_time3_check,
															R.id.detect_time4_check,R.id.detect_time5_check,R.id.detect_time6_check};
	private TimeSet[][]					mTimeSets		= new TimeSet[TimeSection.DAYS_OF_WEEK][TimeSection.MAX_COUNT_OF_TS];
	private String[]					mWeek;
	private ArrayList<Integer> 			mCopyList;
	private int							mCurrentIndex;
	
	private View						mDateLayout;
	private TextView					mDateText;
	private View						mCopyLayout;
	private TextView					mCopyText;
	private View[]						mTimeLayout 	= new View[TIMECOUNT];
	private TextView[]					mTimeText		= new TextView[TIMECOUNT];
	private TextView[]					mTimeLabel		= new TextView[TIMECOUNT];
	private ImageView[]					mTimeImage		= new ImageView[TIMECOUNT];
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		startUP();
		setContentView(R.layout.detect_setting);
		initUI();
		initData();
		
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
			switch(requestCode)
			{
				case OPENDAY:
					mCurrentIndex = data.getIntExtra("channelNum", 0);
					mDateText.setText(mWeek[mCurrentIndex]);
					mCopyText.setText("");
					insertView(mCurrentIndex);
					break;
				case OPENCOPY:
					mCopyList = data.getIntegerArrayListExtra("usefulDays");
					StringBuffer sb = new StringBuffer();
					for(Integer i : mCopyList)
					{
						sb.append(mWeek[i] + " ");
					}
					mCopyText.setText(sb.toString());
					break;
				case OPENTIME:
					int index = data.getIntExtra("index", 0);
					String time = data.getStringExtra("time");
					mTimeText[index].setText(time);
					setSwitch(mTimeImage[index],"1");
					break;
				default:
					break;
			}
			
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
		this.finish();
		overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
	}
	
	private void startUP()
	{
//		UIUtility.checkInit(this);
		
	}
	
	private void initData()
	{
		ArrayList<String> timeList = this.getIntent().getStringArrayListExtra("time");
		parseTimeString(timeList);
		mWeek = this.getResources().getStringArray(R.array.week_short);
		mCurrentIndex = 0;
		insertView(mCurrentIndex);
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
		rightBtn.setBackgroundResource(R.drawable.title_save_btn);
		rightBtn.setVisibility(View.VISIBLE);
		rightBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				save();
			}
		});
		
		mDateText	 = (TextView)findViewById(R.id.detect_date);
		mDateLayout  = findViewById(R.id.detect_date_layout);
		mDateLayout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openDayActivity(mCurrentIndex);
				
			}
		});
		
		mCopyText	= (TextView)findViewById(R.id.detect_copy);
		mCopyLayout = findViewById(R.id.detect_copy_layout);
		mCopyLayout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openDayActivityByCopy(mCurrentIndex);
				
			}
		});
		
		for(int i =0; i< TIMECOUNT; i++)
		{
			mTimeLayout[i]  = findViewById(layoutId[i]);
			mTimeText[i]	= (TextView)findViewById(textId[i]);
			mTimeLabel[i]   = (TextView)findViewById(labelId[i]);
			mTimeImage[i]	= (ImageView) findViewById(imageId[i]);
			mTimeImage[i].setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					channgeSwitch((ImageView)v);
					
				}
			});
			mTimeLabel[i].setText(mTimeLabel[i].getText() + " " + (i+1));
			final int index = i;
			mTimeLayout[i].setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					String time = mTimeText[index].getText().toString();
					openDateActivity(index,time);
					
				}
			});
		}
		
	}
	
	private void insertView(int index)
	{
		mDateText.setText(mWeek[index]);
		TimeSet[] times = mTimeSets[index];
		for(int i = 0; i< TIMECOUNT; i++)
		{
			setSwitch(mTimeImage[i],times[i].enbale);
			mTimeText[i].setText(times[i].timeStr);
		}
	}
	
	private void setSwitch(ImageView imageView,String on)
	{
		if(on.equals("1"))
		{
			imageView.setTag(ON);
			imageView.setSelected(true);
		}
		else
		{
			imageView.setTag(OFF);
			imageView.setSelected(false);
		}
	}
	
	private void channgeSwitch(ImageView imageView)
	{
		if(imageView.getTag().equals(OFF))
		{
			imageView.setTag(ON);
			imageView.setSelected(true);
		}
		else
		{
			imageView.setTag(OFF);
			imageView.setSelected(false);
		}
	}
	
	private void parseTimeString(ArrayList<String> timeList)
	{
		if(timeList == null)
		{
			return;
		}
		for(int i =0; i< TimeSection.DAYS_OF_WEEK; i++)
		{
			for(int j =0; j< TimeSection.MAX_COUNT_OF_TS;j++)
			{
				String s =  timeList.get(i*TimeSection.MAX_COUNT_OF_TS + j);
				TimeSet timeSet = new TimeSet();
				String[] tmp = s.split(" ");
				timeSet.enbale = tmp[0];
				timeSet.timeStr = tmp[1];
				mTimeSets[i][j] = timeSet;
			}
		}
	}
	
	private void openDayActivity(int index)
	{
		Intent intent = new Intent();
		intent.setClass(this, WeekdayChooseActivity.class);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(index);
		intent.putIntegerArrayListExtra("usefulDays",list );
		intent.putExtra("type", WeekdayChooseActivity.SINGLE);
		startActivityForResult(intent, OPENDAY);
		overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
	}
	
	private void openDayActivityByCopy(int index)
	{
		Intent intent = new Intent();
		intent.setClass(this, WeekdayChooseActivity.class);
		intent.putExtra("index",index);
		intent.putExtra("type", WeekdayChooseActivity.COPY);
		startActivityForResult(intent, OPENCOPY);
		overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
	}
	
	private void openDateActivity(int index,String time)
	{
		Intent intent = new Intent();
		intent.setClass(this, DateSettingActivity.class);
		intent.putExtra("index", index);
		intent.putExtra("time", time);
		startActivityForResult(intent, OPENTIME);
		overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
	}
	
	private void save()
	{
		TimeSet[] timeSet = mTimeSets[mCurrentIndex];
		for(int i =0 ;i < TIMECOUNT; i++)
		{
			if(mTimeImage[i].getTag().equals(ON))
			{
				timeSet[i].enbale = "1";
			}
			else
			{
				timeSet[i].enbale = "0";
			}
			timeSet[i].timeStr = mTimeText[i].getText().toString();
		}
		
		if(mCopyList != null) //�и���ʱ��Σ�������ʱ�����
		{
			for(Integer i : mCopyList)
			{
				if(i != mCurrentIndex)
				{
					TimeSet[] tmp = mTimeSets[i];
					for(int j =0 ;j < TIMECOUNT; j++)
					{
						tmp[j].enbale = timeSet[j].enbale;
						tmp[j].timeStr = timeSet[j].timeStr;
					}
				}
			}
		}
		ArrayList<String> timeList = new ArrayList<String>();
		for(int i =0; i< TimeSection.DAYS_OF_WEEK; i++)
		{
			for(int j =0; j< TimeSection.MAX_COUNT_OF_TS;j++)
			{
				TimeSet time = mTimeSets[i][j];
				String s = time.enbale + " " + time.timeStr;
				timeList.add(s);
			}
		}
		
		Intent data = new Intent();
		data.putStringArrayListExtra("time", timeList);
		setResult(RESULT_OK,data);
		exit();
	}
	
	private class TimeSet
	{
		public String 	enbale  = "0";  // 0 ������    1����
		public String	timeStr = null;
	}
}
