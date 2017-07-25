package com.company.Demo;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.company.NetSDK.CB_fDataCallBack;
import com.company.NetSDK.CB_fDownLoadPosCallBack;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_RECORDFILE_INFO;
import com.company.PlaySDK.Constants;
import com.company.PlaySDK.IPlaySDK;
import com.nfcproject.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RecordPlayActivity extends Activity {

	NET_RECORDFILE_INFO m_recordInfo = null;

	SurfaceView m_PlayView;
	private SurfaceHolder holder;

	private Button m_btPause;
	private boolean m_zPlay = true;
	private Button m_btFast;
	private Button m_btSlow;
	private Button m_btNormal;

	static int nPort = IPlaySDK.PLAYGetFreePort();

	TestDownLoadCallBack m_Downloadcallback = new TestDownLoadCallBack();
	TestfDataCallBack m_callback = new TestfDataCallBack();

	SeekBar m_sbByFile;
	private String strSpeed[] = new String[]{"1/64X", "1/32X", "1/16X", "1/8X", "1/4X", "1/2X", "1X", "2X", "4X", "8X", "16X", "32X", "64X"};
	private int nSpeedCur = 6;

	private boolean bPlaySdkOpen = false;
	private Timer mTimer;
	private ProgressUpdateTask mTimerTask;
	private long lTotalTime = 0;
	private long lTotalSize = 0;

	private class ProgressUpdateTask extends TimerTask {
		@Override
		public void run(){
			if (!bPlaySdkOpen) {
				return;
			}

			if (null != m_sbByFile) {
				int timeOffset = IPlaySDK.PLAYGetPlayedTimeEx(nPort) / 1000;
				m_sbByFile.setProgress((int)((lTotalSize * timeOffset) / lTotalTime));
			}
		}
	}

	public class TestDownLoadCallBack implements CB_fDownLoadPosCallBack
	{
		@Override
		public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize) {
			//ToolKits.writeLog("dwTotalSize = " + dwTotalSize + ", dwDownLoadSize = " + dwDownLoadSize);
			m_sbByFile.setMax(dwTotalSize);
			lTotalSize = dwTotalSize;
			if (-1 == dwDownLoadSize) {
				//m_sbByFile.setProgress(dwTotalSize);
				new Thread(new Runnable() {
					@Override
					public void run() {
						if (0 != lPlaybackHandle) {
							StopPlayBack();
						}
					}
				}).start();
			} else {
				//m_sbByFile.setProgress(dwDownLoadSize);
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

	Resources res;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recordplayview);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res = this.getResources();

		m_recordInfo = (NET_RECORDFILE_INFO) RecordListActivity.g_recordFileInfo;

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

		m_sbByFile = (SeekBar)findViewById(R.id.sb_pb_file);
		m_sbByFile.setVisibility(View.INVISIBLE);
		m_sbByFile.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				if (fromUser) {
					if (0 != lPlaybackHandle) {
						boolean zRet = INetSDK.SeekPlayBack(lPlaybackHandle, 0xFFFFFFFF, progress);
						if (zRet) {
							IPlaySDK.PLAYSetPlayedTimeEx(nPort, (int)(((lTotalTime * progress * 1000) / lTotalSize)));
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

		m_btPause = (Button)findViewById(R.id.bt_pb_file_pause);
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

		m_btFast = (Button)findViewById(R.id.bt_pb_file_fast);
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

		m_btSlow = (Button)findViewById(R.id.bt_pb_file_slow);
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

		m_btNormal = (Button)findViewById(R.id.bt_pb_file_normal);
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

		StartRealPlay();
	}

	public boolean StartRealPlay()
	{
		if (null != mTimer) {
			mTimer.cancel();
			mTimer = null;
		}

		if (!bPlaySdkOpen) {
			ToolKits.showErrorMessage(this, "PlaySDK " + res.getString(R.string.info_failed));
			return false;
		}

		lPlaybackHandle = INetSDK.PlayBackByRecordFileEx(
				TestNetSDKActivity.m_loginHandle, m_recordInfo, m_Downloadcallback, m_callback);
		if (lPlaybackHandle == 0) {
			ToolKits.showErrorMessage(this, "PlayBackByRecordFileEx " + res.getString(R.string.info_failed));
			return false;
		}

		try {
			String strBegin = String.format("%04d/%02d/%02d %02d:%02d:%02d", m_recordInfo.starttime.dwYear, m_recordInfo.starttime.dwMonth,
					m_recordInfo.starttime.dwDay, m_recordInfo.starttime.dwHour, m_recordInfo.starttime.dwMinute, m_recordInfo.starttime.dwSecond);
			Date dataBegin = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(strBegin);
			long lBegin = dataBegin.getTime() / 1000;

			String strEnd = String.format("%04d/%02d/%02d %02d:%02d:%02d", m_recordInfo.endtime.dwYear, m_recordInfo.endtime.dwMonth,
					m_recordInfo.endtime.dwDay, m_recordInfo.endtime.dwHour, m_recordInfo.endtime.dwMinute, m_recordInfo.endtime.dwSecond);
			Date dataEnd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(strEnd);
			long lEnd = dataEnd.getTime() / 1000;

			lTotalTime = lEnd - lBegin;
		} catch (Exception e) {
			e.printStackTrace();
		}

		m_sbByFile.setVisibility(View.VISIBLE);
		m_sbByFile.incrementProgressBy(1);

		mTimer = new Timer();
		mTimerTask = new ProgressUpdateTask();
		mTimer.scheduleAtFixedRate(mTimerTask, 0, 1000);

		// 设置消息回调函数
		// INetSDK.SetDVRMessCallBack(m_Messagecallback);
		return true;
	}

	public void StopPlayBack()
	{
		INetSDK.StopPlayBack(lPlaybackHandle);
		lPlaybackHandle = 0;
	}

	@Override
	protected void onDestroy()
	{
		if ( lPlaybackHandle != 0 )
		{
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