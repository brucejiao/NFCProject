package com.company.Demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import com.nfcproject.R;

public class DelaySettingActivity extends Activity {


	private SeekBar 			mPTZSeekBar;
	private TextView 			mPTZText;

	private int 				mConfig = 0;
	private int 				mMin	= 0;
	private int					mMax	= 0;
	private String				mConfigTitle = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setting_layout_ptz);
		mMin = this.getIntent().getIntExtra("min", 0);
		mMax = this.getIntent().getIntExtra("max", 0);
		mConfig = this.getIntent().getIntExtra("delay", 0);
		mConfigTitle = this.getIntent().getStringExtra("configTitle");

		ImageView titleLeft = (ImageView)findViewById(R.id.title_left_image);
		titleLeft.setBackgroundResource(R.drawable.title_btn_back);
		titleLeft.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				exit();
			}
		});

		TextView titleText = (TextView)findViewById(R.id.title_center);
		titleText.setText(mConfigTitle);

		mPTZText = (TextView)findViewById(R.id.progress);
		mPTZText.setText(String.valueOf(mConfig));

		mPTZSeekBar = (SeekBar)findViewById(R.id.seek);
		mPTZSeekBar.setMax(mMax - mMin);
		mPTZSeekBar.setProgress(mConfig - mMin);
		mPTZSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
										  boolean fromUser) {
				mConfig = progress + mMin;
				mPTZText.setText(String.valueOf(mConfig));

			}
		});
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode==KeyEvent.KEYCODE_BACK)
		{
			exit();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	private void exit()
	{
		Intent data = new Intent();
		data.putExtra("delay", mConfig);
		setResult(RESULT_OK, data); //正常退出
		DelaySettingActivity.this.finish();
		overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
	}

}
