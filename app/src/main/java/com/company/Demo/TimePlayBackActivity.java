package com.company.Demo;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.TimePicker;

import com.company.NetSDK.CB_fDataCallBack;
import com.company.NetSDK.CB_fDownLoadPosCallBack;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_TIME;
import com.company.PlaySDK.Constants;
import com.company.PlaySDK.IPlaySDK;
import com.nfcproject.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class TimePlayBackActivity extends Activity {

	Button m_btBeginCallback;

	TextView m_vBeginTime;
	Button m_btSetBeginTime;

	TextView m_tvBeginHMS;
	Button m_btBeginHMS;

	TextView m_vEndTime;
	Button m_btSetEndTime;

	TextView m_tvEndHMS;
	Button m_btEndHMS;

	private Button m_btPause;
	private boolean m_zPlay = true;
	private Button m_btFast;
	private Button m_btSlow;
	private Button m_btNormal;

	SurfaceView m_PlayView;
	SeekBar m_sbPbByTime;

	TestfDataCallBack m_callback = new TestfDataCallBack();

	static int nPort = IPlaySDK.PLAYGetFreePort();
	private SurfaceHolder holder;
	private boolean bPlaySdkOpen = false;

	Resources res;

	private String strSpeed[] = new String[]{"1/64X", "1/32X", "1/16X", "1/8X", "1/4X", "1/2X", "1X", "2X", "4X", "8X", "16X", "32X", "64X"};
	private int nSpeedCur = 6;

	private Timer mTimer;
	private ProgressUpdateTask mTimerTask;

	private class ProgressUpdateTask extends TimerTask {
		@Override
		public void run(){
			if (!bPlaySdkOpen) {
				return;
			}

			if (null != m_sbPbByTime) {
				int timeOffset = IPlaySDK.PLAYGetPlayedTimeEx(nPort) / 1000;
				m_sbPbByTime.setProgress(timeOffset);
			}
		}
	}

	public class TestDownLoadPosCallBack implements CB_fDownLoadPosCallBack {
		@Override
		public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize) {
			//ToolKits.writeLog("dwTotalSize = " + dwTotalSize + ", dwDownLoadSize = " + dwDownLoadSize);
			m_sbPbByTime.setMax(dwTotalSize);
			if (-1 == dwDownLoadSize) {
				//m_sbPbByTime.setProgress(dwTotalSize);
				new Thread(new Runnable() {
					@Override
					public void run() {
						if (0 != lPlaybackHandle) {
							StopPlayBack();
						}
					}
				}).start();
			} else {
				//m_sbPbByTime.setProgress(dwDownLoadSize);
			}
		}
	}

	public class TestfDataCallBack implements CB_fDataCallBack {
		@Override
		public int invoke(long lPlaybackHandle, int dwDataType, byte buffer[], int dwBufferSize) {
			if (0 == dwDataType) {
				return IPlaySDK.PLAYInputData(nPort, buffer, buffer.length);
			} else if ( dwDataType == 2 ) {
				//m_PlayView.drawColor(pBuffer);
			} else if ( dwDataType == 3 ) {
				//m_PlayView.drawColor(pBuffer);
			}

			return 0;
		}
	}

	static long lPlaybackHandle = 0;

	boolean bRecordFlag = false;

	Calendar dateAndTime = Calendar.getInstance(Locale.CHINA);
	DateFormat fmtDateAndTime = DateFormat.getDateTimeInstance();

	DatePickerDialog.OnDateSetListener begin = new DatePickerDialog.OnDateSetListener() {
		@Override
		public void onDateSet(DatePicker arg0, int year, int monthOfYear, int dayOfMonth) {
			m_vBeginTime.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
		}
	};

	DatePickerDialog.OnDateSetListener end = new DatePickerDialog.OnDateSetListener() {
		@Override
		public void onDateSet(DatePicker arg0, int year, int monthOfYear, int dayOfMonth) {
			m_vEndTime.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
		}
	};

	/**
	 * 开始处理时间回放
	 */
	private void BeginCallBack()
	{
		if (null != mTimer) {
			mTimer.cancel();
			mTimer = null;
		}

		if (0 != lPlaybackHandle) {
			StopPlayBack();
		}

		if (!bPlaySdkOpen) {
			ToolKits.showErrorMessage(this, "PlaySDK " + res.getString(R.string.info_failed));
			return;
		}

		// 获取开始时间和结束时间
		NET_TIME stTimeStart = new NET_TIME();
		NET_TIME stTimeEnd = new NET_TIME();
		getPlaybackTime(stTimeStart, stTimeEnd);

		TestDownLoadPosCallBack posUser = new TestDownLoadPosCallBack();

		/* 可以通过修改NET_PARAM.nSearchRecordTime设置按时间回放超时时间  */
		lPlaybackHandle = INetSDK.PlayBackByTimeEx(
				TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn,
				stTimeStart, stTimeEnd, posUser, m_callback);
		if (lPlaybackHandle == 0 ) {
			ToolKits.showErrorMessage(this, "PlayBackByTimeEx " + res.getString(R.string.info_failed));
			return;
		}

		m_sbPbByTime.setVisibility(View.VISIBLE);
		m_sbPbByTime.incrementProgressBy(1);

		IPlaySDK.PLAYSetPlayedTimeEx(nPort, 0);
		IPlaySDK.PLAYResetBuffer(nPort, 1); // 清码流分析库
		IPlaySDK.PLAYResetBuffer(nPort, 3); // 清播放队列

		mTimer = new Timer();
		mTimerTask = new ProgressUpdateTask();
		mTimer.scheduleAtFixedRate(mTimerTask, 0, 1000);
	}

	private void getPlaybackTime(NET_TIME stTimeStart, NET_TIME stTimeEnd) {
		String strBeginTime = m_vBeginTime.getText().toString();
		String strBeginHMS = m_tvBeginHMS.getText().toString();
		String strEndTime = m_vEndTime.getText().toString();
		String strEndHMS = m_tvEndHMS.getText().toString();

		String beginArray[] = strBeginTime.split("-");
		String beginHMSArr[] = strBeginHMS.split(":");
		String endArray[] = strEndTime.split("-");
		String endHMSArr[] = strEndHMS.split(":");

		stTimeStart.dwYear = Integer.parseInt(beginArray[0]);
		stTimeStart.dwMonth = Integer.parseInt(beginArray[1]);
		stTimeStart.dwDay = Integer.parseInt(beginArray[2]);
		stTimeStart.dwHour = Integer.parseInt(beginHMSArr[0]);
		stTimeStart.dwMinute = Integer.parseInt(beginHMSArr[1]);
		stTimeStart.dwSecond = Integer.parseInt(beginHMSArr[2]);

		stTimeEnd.dwYear = Integer.parseInt(endArray[0]);
		stTimeEnd.dwMonth = Integer.parseInt(endArray[1]);
		stTimeEnd.dwDay = Integer.parseInt(endArray[2]);
		stTimeEnd.dwHour = Integer.parseInt(endHMSArr[0]);
		stTimeEnd.dwMinute = Integer.parseInt(endHMSArr[1]);
		stTimeEnd.dwSecond = Integer.parseInt(endHMSArr[2]);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timeplaybackview);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res = this.getResources();

		m_PlayView = (SurfaceView)findViewById(R.id.view_PlayWindow);

		holder = m_PlayView.getHolder();
		holder.addCallback(new Callback() {

			public void surfaceCreated(SurfaceHolder holder)
			{
				Log.d("[playsdk]surface", "surfaceCreated");
				IPlaySDK.InitSurface(nPort, m_PlayView);
			}

			public void surfaceChanged(SurfaceHolder holder, int format, int width,
									   int height)
			{
				Log.d("[playsdk]surface", "surfaceChanged");
			}

			public void surfaceDestroyed(SurfaceHolder holder)
			{
				Log.d("[playsdk]surface", "surfaceDestroyed");
			}
		});

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-d");

		m_vBeginTime = (TextView)findViewById(R.id.begintime_value);
		m_vBeginTime.setText(df.format(dateAndTime.getTime()));

		m_vEndTime = (TextView)findViewById(R.id.endtime_value);
		m_vEndTime.setText(df.format(dateAndTime.getTime()));

		m_btBeginCallback = (Button)findViewById(R.id.btn_begincallback);
		m_btBeginCallback.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View arg0)
			{
				BeginCallBack();
			}
		});

		m_btSetBeginTime = (Button)findViewById(R.id.set_begin_time_btn);
		m_btSetBeginTime.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View arg0)
			{
				new DatePickerDialog(TimePlayBackActivity.this, begin,
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
				new TimePickerDialog(TimePlayBackActivity.this, new TimePickerDialog.OnTimeSetListener() {
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
				new DatePickerDialog(TimePlayBackActivity.this, end,
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
				new TimePickerDialog(TimePlayBackActivity.this, new TimePickerDialog.OnTimeSetListener() {
					@Override
					public void onTimeSet(TimePicker arg0, int arg1, int arg2) {
						// TODO Auto-generated method stub
						m_tvEndHMS.setText(arg1 + ":" + arg2 + ":" + "00");
					}
				}, dateAndTime.get(Calendar.HOUR_OF_DAY), dateAndTime.get(Calendar.MINUTE), true).show();
			}
		});

		m_sbPbByTime = (SeekBar)findViewById(R.id.sb_pb_time);
		m_sbPbByTime.setVisibility(View.INVISIBLE);
		m_sbPbByTime.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				if (fromUser) {
					if (0 != lPlaybackHandle) {
						boolean zRet = INetSDK.SeekPlayBack(lPlaybackHandle, progress, 0xFFFFFFFF);
						if (zRet) {
							IPlaySDK.PLAYSetPlayedTimeEx(nPort, progress * 1000);
							IPlaySDK.PLAYResetBuffer(nPort, 1); // 清码流分析库
							IPlaySDK.PLAYResetBuffer(nPort, 3); // 清播放队列
						}
					}
				}
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}
		});

		m_btPause = (Button)findViewById(R.id.bt_pb_time_pause);
		m_btPause.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (0 != lPlaybackHandle) {
					if (m_zPlay) {
						int b = IPlaySDK.PLAYPause(nPort, (short)1);
						if (0 != b) {
							m_btPause.setText(R.string.play_back_play);
							m_zPlay = false;
						}
					} else {
						int b = IPlaySDK.PLAYPause(nPort, (short)0);
						if (0 != b) {
							m_btPause.setText(R.string.play_back_pause);
							m_zPlay = true;
						}
					}
				}
			}
		});

		m_btFast = (Button)findViewById(R.id.bt_pb_time_fast);
		m_btFast.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (0 != lPlaybackHandle) {
					int b = IPlaySDK.PLAYFast(nPort);
					if (0 != b) {
						if (nSpeedCur < strSpeed.length - 1) {
							nSpeedCur++;
							ToolKits.showMessage(v.getContext(), strSpeed[nSpeedCur]);
						}

						if (TestNetSDKActivity.m_speedCtrl) {
							boolean zRet = INetSDK.FastPlayBack(lPlaybackHandle);
							if (!zRet) {
								ToolKits.writeErrorLog("FastPlayBack failed");
							}
						}
						return;
					}
				}
				ToolKits.showMessage(v.getContext(), res.getString(R.string.info_failed));
			}
		});

		m_btSlow = (Button)findViewById(R.id.bt_pb_time_slow);
		m_btSlow.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (0 != lPlaybackHandle) {
					int b = IPlaySDK.PLAYSlow(nPort);
					if (0 != b) {
						if (nSpeedCur > 0) {
							nSpeedCur--;
							ToolKits.showMessage(v.getContext(), strSpeed[nSpeedCur]);
						}

						if (TestNetSDKActivity.m_speedCtrl) {
							boolean zRet = INetSDK.SlowPlayBack(lPlaybackHandle);
							if (!zRet) {
								ToolKits.writeErrorLog("SlowPlayBack failed");
							}
						}
						return;
					}
				}
				ToolKits.showMessage(v.getContext(), res.getString(R.string.info_failed));
			}
		});

		m_btNormal = (Button)findViewById(R.id.bt_pb_time_normal);
		m_btNormal.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (0 != lPlaybackHandle) {
					int b = IPlaySDK.PLAYPlay(nPort, m_PlayView);
					if (0 != b) {
						m_btPause.setText(R.string.play_back_pause);
						m_zPlay = true;

						nSpeedCur = 6;
						ToolKits.showMessage(v.getContext(), strSpeed[nSpeedCur]);

						if (TestNetSDKActivity.m_speedCtrl) {
							boolean zRet = INetSDK.NormalPlayBack(lPlaybackHandle);
							if (!zRet) {
								ToolKits.writeErrorLog("NormalPlayBack failed");
							}
						}
						return;
					}
				}
				ToolKits.showMessage(v.getContext(), res.getString(R.string.info_failed));
			}
		});

		boolean bOpenRet = IPlaySDK.PLAYOpenStream(nPort,null,0,1024*1024*2) == 0? false : true;
		IPlaySDK.PLAYSetStreamOpenMode(nPort, Constants.STREAME_FILE);
		if(bOpenRet)
		{
			boolean bPlayRet = IPlaySDK.PLAYPlay(nPort, m_PlayView) == 0 ? false : true;
			if(bPlayRet)
			{
				boolean bSuccess = IPlaySDK.PLAYPlaySoundShare(nPort) == 0 ? false : true;
				if(!bSuccess)
				{
					ToolKits.showErrorMessage(this, "PLAYPlaySoundShare " + res.getString(R.string.info_failed));
					IPlaySDK.PLAYStop(nPort);
					IPlaySDK.PLAYCloseStream(nPort);
					return;
				}

				bPlaySdkOpen = true;
			}
			else
			{
				ToolKits.showErrorMessage(this, "PLAYPlay " + res.getString(R.string.info_failed));
				IPlaySDK.PLAYCloseStream(nPort);
				return;
			}
		} else {
			ToolKits.showErrorMessage(this, "PLAYOpenStream " + res.getString(R.string.info_failed));
			return;
		}
	}

	public void StopPlayBack()
	{
		INetSDK.StopPlayBack(lPlaybackHandle);
		lPlaybackHandle = 0;
	}

	@Override
	protected void onDestroy()
	{
		if (0 != lPlaybackHandle) {
			StopPlayBack();
		}

		if (bPlaySdkOpen) {
			IPlaySDK.PLAYStopSoundShare(nPort);
			IPlaySDK.PLAYStop(nPort);
			IPlaySDK.PLAYCloseStream(nPort);
			bPlaySdkOpen = false;
		}

		super.onDestroy();

		if (null != mTimer) {
			mTimer.cancel();
			mTimer = null;
		}
	}
}