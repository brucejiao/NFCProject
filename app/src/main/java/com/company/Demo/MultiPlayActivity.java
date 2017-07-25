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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.company.NetSDK.CB_fRealDataCallBackEx;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.SDK_RealPlayType;
import com.company.PlaySDK.IPlaySDK;
import com.nfcproject.R;

import java.util.ArrayList;

public class MultiPlayActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multiplay);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		nExtraChnNum = getIntent().getIntExtra("name_nExtraChnNum", 0);
		nExtraAlarmOutPortNum = getIntent().getIntExtra("name_nExtraAlarmOutPortNum", 0);

		res = this.getResources();
		m_PlayView = (SurfaceView)findViewById(R.id.sv_mp);

		holder = m_PlayView.getHolder();
		holder.addCallback(new Callback() {
			public void surfaceCreated(SurfaceHolder holder) {
				Log.d("[playsdk]surface", "surfaceCreated");
				IPlaySDK.InitSurface(nPort, m_PlayView);
			}

			public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
				Log.d("[playsdk]surface", "surfaceChanged");
			}

			public void surfaceDestroyed(SurfaceHolder holder) {
				Log.d("[playsdk]surface", "surfaceDestroyed");
			}
		});

		spType = (Spinner)findViewById(R.id.sp_mp_type);
		String[] strType = new String[]{res.getString(R.string.multi_play_activity_mp_1), res.getString(R.string.multi_play_activity_mp_4),
				res.getString(R.string.multi_play_activity_mp_8), res.getString(R.string.multi_play_activity_mp_9), res.getString(R.string.multi_play_activity_mp_16),
				res.getString(R.string.multi_play_activity_mp_6), res.getString(R.string.multi_play_activity_mp_12), res.getString(R.string.multi_play_activity_mp_25),
				res.getString(R.string.multi_play_activity_mp_36)};
		ArrayAdapter<String> aaType = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, strType);
		spType.setAdapter(aaType);
		spType.setPrompt(res.getString(R.string.multi_play_activity_type_prm));

		int nChnNum = nExtraChnNum;
		ArrayList<String> alChn = new ArrayList<String>();
		for (int i = 0; i < nChnNum; i++) {
			alChn.add(res.getString(R.string.channel_name) + (i + 1));
		}
		spChn = (Spinner)findViewById(R.id.sp_mp_chn);
		ArrayAdapter<String> aaChn = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alChn);
		spChn.setAdapter(aaChn);
		spChn.setPrompt(res.getString(R.string.multi_play_activity_chn_prm));

		btStart = (Button)findViewById(R.id.bt_mp_start);
		btStart.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (bPlay) {
					if (0 != lRealHandle) {
						INetSDK.StopRealPlayEx(lRealHandle);
						lRealHandle = 0;
					}

					btStart.setText(res.getString(R.string.multi_play_activity_start));
					bPlay = false;
				} else {
					int nType = spType.getSelectedItemPosition();
					int nChn = spChn.getSelectedItemPosition();
					if (!multiPlay(nChn, SDK_RealPlayType.SDK_RType_Multiplay_1 + nType)) {
						return;
					}

					btStart.setText(res.getString(R.string.multi_play_activity_stop));
					bPlay = true;
				}
			}
		});

		boolean bOpenRet;
		if (IPlaySDK.PLAYOpenStream(nPort, null, 0, 1024 * 1024 * 2) == 0) {
			bOpenRet = false;
		} else {
			bOpenRet = true;
		}

		if (bOpenRet)
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

	@Override
	public void onDestroy() {
		if (0 != lRealHandle) {
			INetSDK.StopRealPlayEx(lRealHandle);
			lRealHandle = 0;
		}

		if (bPlaySdkOpen) {
			IPlaySDK.PLAYStopSoundShare(nPort);
			IPlaySDK.PLAYStop(nPort);
			IPlaySDK.PLAYCloseStream(nPort);
			bPlaySdkOpen = false;
		}

		super.onDestroy();
	}

	private boolean multiPlay(int nChn, int nStreamType) {
		if (!bPlaySdkOpen) {
			ToolKits.showErrorMessage(this, "PlaySDK " + res.getString(R.string.info_failed));
			return false;
		}

		if (0 != lRealHandle) {
			INetSDK.StopRealPlayEx(lRealHandle);
			lRealHandle = 0;
		}

		lRealHandle = INetSDK.RealPlayEx(TestNetSDKActivity.m_loginHandle, nChn, nStreamType);
		if (0 == lRealHandle) {
			ToolKits.showErrorMessage(this, "RealPlayEx " + res.getString(R.string.info_failed));
			return false;
		}

		m_callback = new TestRealDataCallBackEx();
		INetSDK.SetRealDataCallBackEx(lRealHandle, m_callback, 1);

		return true;
	}

	public class TestRealDataCallBackEx implements CB_fRealDataCallBackEx {
		@Override
		public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize, int param) {
			if (0 == dwDataType) {
				IPlaySDK.PLAYInputData(nPort, pBuffer, pBuffer.length);
			}
		}
	}

	private SurfaceView m_PlayView;
	private SurfaceHolder holder;
	private Resources res;
	private int nPort = IPlaySDK.PLAYGetFreePort();
	private boolean bPlaySdkOpen = false;
	private long lRealHandle = 0;
	private TestRealDataCallBackEx m_callback = new TestRealDataCallBackEx();
	private Spinner spType;
	private Spinner spChn;
	private Button btStart;
	private boolean bPlay = false;

	private int nExtraChnNum;
	private int nExtraAlarmOutPortNum;
}
