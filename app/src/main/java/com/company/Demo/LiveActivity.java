package com.company.Demo;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;

import com.company.NetSDK.AV_CFG_ChannelVideoColor;
import com.company.NetSDK.CB_fRealDataCallBackEx;
import com.company.NetSDK.CB_fRealPlayDisConnect;
import com.company.NetSDK.CB_fSnapRev;
import com.company.NetSDK.CFG_DSPENCODECAP_INFO;
import com.company.NetSDK.CFG_FLASH_LIGHT;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.SDKDEV_DSP_ENCODECAP_EX;
import com.company.NetSDK.SDK_EXTPTZ_ControlType;
import com.company.NetSDK.SDK_PTZ_ControlType;
import com.company.NetSDK.SDK_RealPlayType;
import com.company.NetSDK.SNAP_PARAMS;
import com.company.PlaySDK.Constants;
import com.company.PlaySDK.IPlaySDK;
import com.company.PlaySDK.IPlaySDKCallBack.DEMUX_INFO;
import com.company.PlaySDK.IPlaySDKCallBack.fDemuxCBFun;
import com.nfcproject.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LiveActivity extends Activity {
	SurfaceView m_PlayView;

	Button m_btStartRecord;
	Button m_btEncode;
	Button m_btSound;
	Button m_btCapture;

	Spinner m_spStream;
	ArrayList<String> alStream = new ArrayList<String>();

	// Flash related
	Button m_btFlash;
	View m_layoutFlash;
	PopupWindow m_popFlash;
	CFG_FLASH_LIGHT stFlash = new CFG_FLASH_LIGHT();

	// PTZ
	Button m_btPtz;
	View m_layoutPtz;
	PopupWindow m_popPtz;

	// volume
	Button m_btVolume;
	View m_LayoutVolume;
	PopupWindow m_popVolume;
	private int nCurVolume = -1;

	// quality
	Button m_btQuality;
	View m_layoutQuality;
	PopupWindow m_popQuality;

	// remote snap
	Button m_btSnap;
	boolean bSnapCbSet = false;

	Resources res;

	private static String[] m_strSpeed;
	byte m_bSpeed = 5;

	private static String[] m_strStream;

	TestRealDataCallBackEx m_callback = new TestRealDataCallBackEx();
	TestVideoDataCallBack m_VideoCallback = new TestVideoDataCallBack();

	static int nPort = IPlaySDK.PLAYGetFreePort();   // 要在IPlaySDK.InitSurface之前调用
	static FileOutputStream m_Fout;

	static long lRealHandle = 0;

	private boolean bRecordFlag = false;
	private boolean bSound = true;
	private SurfaceHolder holder;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.liveview);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res = this.getResources();
		m_strSpeed = new String[]{res.getString(R.string.live_activity_speed_1), res.getString(R.string.live_activity_speed_2),
				res.getString(R.string.live_activity_speed_3), res.getString(R.string.live_activity_speed_4), res.getString(R.string.live_activity_speed_5),
				res.getString(R.string.live_activity_speed_6), res.getString(R.string.live_activity_speed_7), res.getString(R.string.live_activity_speed_8)};
		m_strStream = new String[]{res.getString(R.string.stream_master), res.getString(R.string.stream_sub1),
				res.getString(R.string.stream_sub2), res.getString(R.string.stream_sub3)};

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

		m_btFlash = (Button)findViewById(R.id.bt_flash);
		m_btFlash.setOnClickListener(new LiveButtonsListener());
		if (!TestNetSDKActivity.stCfgCapAlarm.bFlashLight) {
			m_btFlash.setEnabled(false);
		}

		m_btPtz = (Button)findViewById(R.id.bt_ptz);
		m_btPtz.setOnClickListener(new LiveButtonsListener());

		m_btStartRecord = (Button)findViewById(R.id.button_startRecord);
		m_btStartRecord.setOnClickListener(new LiveButtonsListener());

		m_btVolume = (Button)findViewById(R.id.bt_live_volume);
		m_btVolume.setOnClickListener(new LiveButtonsListener());

		m_btEncode = (Button)findViewById(R.id.bt_encode);
		m_btEncode.setOnClickListener(new LiveButtonsListener());

		m_btQuality = (Button)findViewById(R.id.bt_live_quality);
		m_btQuality.setOnClickListener(new LiveButtonsListener());

		m_layoutFlash = View.inflate(LiveActivity.this, R.layout.flashconfigview, null);
		m_layoutPtz = View.inflate(LiveActivity.this, R.layout.ptzview, null);
		m_LayoutVolume = View.inflate(LiveActivity.this, R.layout.volumeview, null);
		m_layoutQuality = View.inflate(LiveActivity.this, R.layout.qualityview, null);

		m_btSound = (Button)findViewById(R.id.bt_sound);
		m_btSound.setOnClickListener(new LiveButtonsListener());

		m_btCapture = (Button)findViewById(R.id.bt_live_capture);
		m_btCapture.setOnClickListener(new LiveButtonsListener());

		m_spStream = (Spinner)findViewById(R.id.sp_live_stream);

		m_btSnap = (Button)findViewById(R.id.bt_live_snap);
		m_btSnap.setOnClickListener(new LiveButtonsListener());

		new Thread(new Runnable() {
			@Override
			public void run() {
				Looper.prepare();

				if ( StartRealPlay(SDK_RealPlayType.SDK_RType_Realplay) == true ) {
					m_callback = new TestRealDataCallBackEx();
					m_VideoCallback = new TestVideoDataCallBack();

					if (lRealHandle != 0) {
						INetSDK.SetRealDataCallBackEx(lRealHandle, m_callback, 1);

						// below code is needed only if you want to save record
						// you should confirm app has permission to create filePath
//                    	String strFile = "/mnt/sdcard/NetSDK/RealData.h264";
//                    	if (createFile("/mnt/sdcard/NetSDK/", "RealData.h264")) {
//        	        		try {
//        	        			m_Fout = new FileOutputStream(strFile, true);
//        	        		} catch (Exception e) {
//        	        			e.printStackTrace();
//        	        		}
//
//        					if (null != m_Fout) {
//        						IPlaySDK.PLAYSetDemuxCallBack(nPort, m_VideoCallback, 0);
//        					}
//        				}
					}
				}
				Looper.loop();
			}
		}).start();

		// stream Type
		int nStreaMask = TestNetSDKActivity.nStreaMask;

		// if nStreaMask from TestNetSDKActivity.nStreaMask is zero,
		// it means get stream type in TestNetSDKActivity failed,
		// so, get again here
		if (0 == nStreaMask) {
			SDKDEV_DSP_ENCODECAP_EX stEncodeCapOld = new SDKDEV_DSP_ENCODECAP_EX();
			CFG_DSPENCODECAP_INFO stEncodeCapNew = new CFG_DSPENCODECAP_INFO();
			if (INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_DSP_EX, stEncodeCapOld, 6000)) {
				nStreaMask = stEncodeCapOld.dwStreamCap;
			} else if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP, stEncodeCapNew, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 1024 * 70)) {
				nStreaMask = stEncodeCapNew.dwStreamCap;
			}
		}

		for (int i = 0; i < 4; i++) {
			if ((nStreaMask & (0x01 << i)) != 0) {
				alStream.add(m_strStream[i]);
			}
		}
		ArrayAdapter<String> aaStream = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alStream);
		m_spStream.setAdapter(aaStream);
		if (!aaStream.isEmpty()) {
			m_spStream.setSelection(0, true);
		}
		m_spStream.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				StopRealPlay();

				int nType = 0;
				for (int i = 0; i < m_strStream.length; i++) {
					if (m_strStream[i].equals(alStream.get(position))) {
						nType = i;
					}
				}

				if ( StartRealPlay(SDK_RealPlayType.SDK_RType_Realplay_0 + nType) == true ) {
					m_callback = new TestRealDataCallBackEx();
					m_VideoCallback = new TestVideoDataCallBack();

					if ( lRealHandle != 0 )
					{
						INetSDK.SetRealDataCallBackEx(lRealHandle, m_callback, 1);

						// below code is needed only if you want to save record
						// you should confirm app has permission to create filePath
//                    	String strFile = "/mnt/sdcard/NetSDK/RealData.h264";
//                    	if (createFile("/mnt/sdcard/NetSDK/", "RealData.h264")) {
//        	        		try {
//        	        			m_Fout = new FileOutputStream(strFile, true);
//        	        		} catch (Exception e) {
//        	        			e.printStackTrace();
//        	        		}
//
//        					if (null != m_Fout) {
//        						IPlaySDK.PLAYSetDemuxCallBack(nPort, m_VideoCallback, 0);
//        					}
//        				}

						// if silent, close sound
						if (!bSound) {
							int ret = IPlaySDK.PLAYStopSoundShare(nPort);
						}
					}
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});
	}

	public boolean StartRealPlay(int nStreamType)
	{
		lRealHandle = INetSDK.RealPlayEx(TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, nStreamType);

		if ( lRealHandle == 0 )
		{
			ToolKits.showErrorMessage(LiveActivity.this, "RealPlayEx " + res.getString(R.string.info_failed));
			return false;
		}

		boolean bOpenRet = IPlaySDK.PLAYOpenStream(nPort,null,0,1024*1024*2) == 0? false : true;
		if(bOpenRet)
		{
			boolean bPlayRet = IPlaySDK.PLAYPlay(nPort, m_PlayView) == 0 ? false : true;
			if(bPlayRet)
			{
				boolean bSuccess = IPlaySDK.PLAYPlaySoundShare(nPort) == 0 ? false : true;
				if(!bSuccess)
				{
					IPlaySDK.PLAYStop(nPort);
					IPlaySDK.PLAYCloseStream(nPort);
					return false;
				}

				if (-1 == nCurVolume) {
					nCurVolume = IPlaySDK.PLAYGetVolume(nPort);
				} else {
					IPlaySDK.PLAYSetVolume(nPort, nCurVolume);
				}
			}
			else
			{
				IPlaySDK.PLAYCloseStream(nPort);
				return false;
			}
		}
		else
		{
			return false;
		}

		return true;
	}

	public void StopRealPlay()
	{
		try {
			IPlaySDK.PLAYStop(nPort);
			IPlaySDK.PLAYStopSoundShare(nPort);
			IPlaySDK.PLAYCloseStream(nPort);

			if (bRecordFlag) {
				INetSDK.StopSaveRealData(lRealHandle);
				bRecordFlag = false;
				m_btStartRecord.setText(R.string.live_activity_start);
			}

			INetSDK.StopRealPlayEx(lRealHandle);

			if (null != m_Fout) {
				m_Fout.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		lRealHandle = 0;
	}

	private void flashProcess() {
		if (null != m_popPtz && m_popPtz.isShowing()) {
			m_popPtz.dismiss();
		}

		if (null != m_popVolume && m_popVolume.isShowing()) {
			m_popVolume.dismiss();
		}

		if (null != m_popQuality && m_popQuality.isShowing()) {
			m_popQuality.dismiss();
		}

		if (null == m_popFlash) {
			m_popFlash = new PopupWindow(m_layoutFlash, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (m_popFlash.isShowing()) {
			m_popFlash.dismiss();
			return;
		} else {
			m_popFlash.showAtLocation(findViewById(R.id.live_view), Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
		}

		CheckBox m_cbFlashEnable;
		SeekBar m_sbBright;

		m_cbFlashEnable = (CheckBox)m_layoutFlash.findViewById(R.id.cb_flash_enable);
		m_sbBright = (SeekBar)m_layoutFlash.findViewById(R.id.sb_bright);
		m_sbBright.setMax(100);
		m_sbBright.incrementProgressBy(1);

		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_FLASH, stFlash, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 4096);
		if (zRet) {
			m_cbFlashEnable.setChecked(stFlash.bEnable);
			m_sbBright.setProgress(stFlash.nBrightness);
		} else {
			ToolKits.showErrorMessage(LiveActivity.this, "GetDevConfig " + res.getString(R.string.info_failed));
			return;
		}

		m_cbFlashEnable.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					stFlash.bEnable = true;
				} else {
					stFlash.bEnable = false;
				}
				ToolKits.SetDevConfig(FinalVar.CFG_CMD_FLASH, stFlash, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 4096);
			}
		});

		m_sbBright.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				if (fromUser) {
					stFlash.nBrightness = progress;
					ToolKits.SetDevConfig(FinalVar.CFG_CMD_FLASH, stFlash, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 4096);
				}
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}
		});
	}

	private void ptzProcess() {
		if (null != m_popFlash && m_popFlash.isShowing()) {
			m_popFlash.dismiss();
		}

		if (null != m_popVolume && m_popVolume.isShowing()) {
			m_popVolume.dismiss();
		}

		if (null != m_popQuality && m_popQuality.isShowing()) {
			m_popQuality.dismiss();
		}

		if (null == m_popPtz) {
			m_popPtz = new PopupWindow(m_layoutPtz, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (m_popPtz.isShowing()) {
			m_popPtz.dismiss();
			return;
		} else {
			m_popPtz.showAtLocation(findViewById(R.id.live_view), Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
		}

		Button m_btUp;
		Button m_btDown;
		Button m_btRight;
		Button m_btLeft;
		Button m_btLUp;
		Button m_btRUp;
		Button m_btLDown;
		Button m_btRDown;
		Button m_btMore;
		Button m_btZoomA;
		Button m_btZoomD;
		Button m_btFocusA;
		Button m_btFocusD;
		Button m_btApertA;
		Button m_btApertD;

		Spinner m_spSpeed;

		m_btUp = (Button)m_layoutPtz.findViewById(R.id.btn_up);
		m_btUp.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_UP_CONTROL, (byte)0, m_bSpeed);
			}});

		m_btDown = (Button)m_layoutPtz.findViewById(R.id.btn_down);
		m_btDown.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_DOWN_CONTROL, (byte)0, m_bSpeed);
			}});

		m_btLeft = (Button)m_layoutPtz.findViewById(R.id.btn_left);
		m_btLeft.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_LEFT_CONTROL, (byte)0, m_bSpeed);
			}});

		m_btRight = (Button)m_layoutPtz.findViewById(R.id.btn_right);
		m_btRight.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_RIGHT_CONTROL, (byte)0, m_bSpeed);
			}});

		m_btLUp = (Button)m_layoutPtz.findViewById(R.id.btn_lup);
		m_btLUp.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_LEFTTOP ,  m_bSpeed, m_bSpeed);
			}});

		m_btRUp = (Button)m_layoutPtz.findViewById(R.id.btn_rup);
		m_btRUp.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_RIGHTTOP ,  m_bSpeed, m_bSpeed);
			}});

		m_btLDown = (Button)m_layoutPtz.findViewById(R.id.btn_ldown);
		m_btLDown.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_LEFTDOWN ,  m_bSpeed, m_bSpeed);
			}});

		m_btRDown = (Button)m_layoutPtz.findViewById(R.id.btn_rdown);
		m_btRDown.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_RIGHTDOWN ,  m_bSpeed, m_bSpeed);
			}});

		m_btMore = (Button)m_layoutPtz.findViewById(R.id.btn_more);
		m_btMore.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//ToolKits.showMessage(v.getContext(), "Hit More");
				//Jump to another Activity to more ptz operation
			}
		});

		m_spSpeed = (Spinner)m_layoutPtz.findViewById(R.id.sp_speed);
		ArrayAdapter<String> apData = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , m_strSpeed);
		m_spSpeed.setAdapter(apData);
		m_spSpeed.setPrompt(res.getString(R.string.live_activity_speed_prom));
		m_spSpeed.setSelection(m_bSpeed - 1);
		m_spSpeed.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
									   int position, long id) {
				m_bSpeed = (byte)(position + 1);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {}
		});

		m_btZoomA = (Button)m_layoutPtz.findViewById(R.id.btn_z_add);
		m_btZoomA.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_ZOOM_ADD_CONTROL, (byte)0, m_bSpeed);
			}
		});

		m_btZoomD = (Button)m_layoutPtz.findViewById(R.id.btn_z_dec);
		m_btZoomD.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_ZOOM_DEC_CONTROL, (byte)0, m_bSpeed);
			}
		});

		m_btFocusA = (Button)m_layoutPtz.findViewById(R.id.btn_f_add);
		m_btFocusA.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_FOCUS_ADD_CONTROL, (byte)0, m_bSpeed);
			}
		});

		m_btFocusD = (Button)m_layoutPtz.findViewById(R.id.btn_f_dec);
		m_btFocusD.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_FOCUS_DEC_CONTROL, (byte)0, m_bSpeed);
			}
		});

		m_btApertA = (Button)m_layoutPtz.findViewById(R.id.btn_a_add);
		m_btApertA.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_APERTURE_ADD_CONTROL, (byte)0, m_bSpeed);
			}
		});

		m_btApertD = (Button)m_layoutPtz.findViewById(R.id.btn_a_dec);
		m_btApertD.setOnTouchListener(new  OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return PTZControl(event, GlobalSettingActivity.m_nGlobalChn, SDK_PTZ_ControlType.SDK_PTZ_APERTURE_DEC_CONTROL, (byte)0, m_bSpeed);
			}
		});
	}

	public class TestVideoDataCallBack implements fDemuxCBFun
	{
		@Override
		public void invoke(int nPort, byte[] pOrgBuffer, int nOrgLen,
						   byte[] pBuffer ,int nLen, DEMUX_INFO stInfo, long dwUser) {
			try {
				if (null != m_Fout) {
					m_Fout.write(pBuffer);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public class TestRealDataCallBackEx implements CB_fRealDataCallBackEx
	{
		@Override
		public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer,
						   int dwBufSize, int param)
		{
			if (0 == dwDataType) {
				IPlaySDK.PLAYInputData(nPort, pBuffer, pBuffer.length);
			}
		}
	}

	public void StartRecord()
	{
		if (0 != lRealHandle) {
			if (!bRecordFlag) {
				// Do confirm the file path is exist, and APP has permission to access, otherwise will failed
				String filePath = "/mnt/sdcard/NetSDK/RealData.dav";
				if (createFile("/mnt/sdcard/NetSDK/", "RealData.dav")) {
					boolean zRet = INetSDK.SaveRealData(lRealHandle, filePath);
					if (!zRet) {
						ToolKits.showErrorMessage(LiveActivity.this, "SaveRealData " + res.getString(R.string.info_failed));
					} else {
						bRecordFlag = true;
						m_btStartRecord.setText(R.string.live_activity_stop);
					}
				}
			} else {
				INetSDK.StopSaveRealData(lRealHandle);
				bRecordFlag = false;
				m_btStartRecord.setText(R.string.live_activity_start);
			}
		}
	}

	private void soundControl() {
		if (0 != lRealHandle) {
			if (bSound) {
				int ret = IPlaySDK.PLAYStopSoundShare(nPort);
				m_btSound.setText(R.string.live_activity_open_sound);
				bSound = false;
			} else {
				int ret = IPlaySDK.PLAYPlaySoundShare(nPort);
				m_btSound.setText(R.string.live_activity_close_sound);
				bSound = true;

				if (-1 == nCurVolume) {
					nCurVolume = IPlaySDK.PLAYGetVolume(nPort);
				} else {
					IPlaySDK.PLAYSetVolume(nPort, nCurVolume);
				}
			}
		}
	}

	private void capture() {
		if (0 != lRealHandle) {
			if (createFile("/mnt/sdcard/NetSDK/", "local.bmp")) {
				int nRet = IPlaySDK.PLAYCatchPicEx(nPort, "/mnt/sdcard/NetSDK/local.bmp", Constants.PicFormat_BMP);
				if (0 != nRet) {
					ToolKits.showMessage(this, res.getString(R.string.info_success));
					return;
				}
			}
		}
		ToolKits.showMessage(this, res.getString(R.string.info_failed));
	}

	private void snap() {
		if (!bSnapCbSet) {
			TestfSnapRev stCb = new TestfSnapRev();
			INetSDK.SetSnapRevCallBack(stCb);
			bSnapCbSet = true;
		}
		SNAP_PARAMS stSnapParam = new SNAP_PARAMS();
		stSnapParam.Channel = GlobalSettingActivity.m_nGlobalChn;
		stSnapParam.Quality = 3;
		stSnapParam.ImageSize = 1;
		stSnapParam.mode = 0;
		stSnapParam.InterSnap = 5;
		stSnapParam.CmdSerial = 100;
		if (INetSDK.SnapPictureEx(TestNetSDKActivity.m_loginHandle, stSnapParam)) {
			ToolKits.showMessage(this, res.getString(R.string.info_success));
			return;
		}
		ToolKits.showMessage(this, res.getString(R.string.info_failed));
	}

	private void setVolume() {
		if (null != m_popFlash && m_popFlash.isShowing()) {
			m_popFlash.dismiss();
		}

		if (null != m_popPtz && m_popPtz.isShowing()) {
			m_popPtz.dismiss();
		}

		if (null != m_popQuality && m_popQuality.isShowing()) {
			m_popQuality.dismiss();
		}

		if (0 != lRealHandle) {
			if (null == m_popVolume) {
				m_popVolume = new PopupWindow(m_LayoutVolume, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			}

			if (m_popVolume.isShowing()) {
				m_popVolume.dismiss();
				return;
			} else {
				m_popVolume.showAtLocation(findViewById(R.id.live_view), Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
			}

			SeekBar m_sbVolume = (SeekBar)m_LayoutVolume.findViewById(R.id.sb_volume);
			m_sbVolume.setMax(100);
			m_sbVolume.incrementProgressBy(1);

			int nVol = IPlaySDK.PLAYGetVolume(nPort);
			m_sbVolume.setProgress(nVol);

			m_sbVolume.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
				@Override
				public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
					if (fromUser) {
						IPlaySDK.PLAYSetVolume(nPort, progress);
						nCurVolume = progress;
					}
				}

				@Override
				public void onStartTrackingTouch(SeekBar seekBar) {

				}

				@Override
				public void onStopTrackingTouch(SeekBar seekBar) {

				}
			});
		}
	}

	private void setQuality() {
		ToolKits.showMessage(this, res.getString(R.string.info_local_configure));
		if (null != m_popPtz && m_popPtz.isShowing()) {
			m_popPtz.dismiss();
		}

		if (null != m_popVolume && m_popVolume.isShowing()) {
			m_popVolume.dismiss();
		}

		if (null != m_popFlash && m_popFlash.isShowing()) {
			m_popFlash.dismiss();
		}

		Integer stBright = new Integer(0);
		Integer stContrast = new Integer(0);
		Integer stSaturation = new Integer(0);
		Integer stHuen = new Integer(0);
		int nRet = IPlaySDK.PLAYGetColor(nPort, 0, stBright, stContrast, stSaturation, stHuen);
		if (0 == nRet) {
			ToolKits.writeLog("Get color failed");
			return ;
		}

		if (null == m_popQuality) {
			m_popQuality = new PopupWindow(m_layoutQuality, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		}

		if (m_popQuality.isShowing()) {
			m_popQuality.dismiss();
			return;
		} else {
			m_popQuality.showAtLocation(findViewById(R.id.live_view), Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
		}

		SeekBar sbBright = (SeekBar)m_layoutQuality.findViewById(R.id.sb_quality_bright);
		sbBright.setMax(128);
		sbBright.incrementProgressBy(1);
		sbBright.setProgress(stBright);
		sbBright.setOnSeekBarChangeListener(new ColorSeekBarListenner());

		SeekBar sbContrast = (SeekBar)m_layoutQuality.findViewById(R.id.sb_quality_contrast);
		sbContrast.setMax(128);
		sbContrast.incrementProgressBy(1);
		sbContrast.setProgress(stContrast);
		sbContrast.setOnSeekBarChangeListener(new ColorSeekBarListenner());

		SeekBar sbSaturation = (SeekBar)m_layoutQuality.findViewById(R.id.sb_quality_saturation);
		sbSaturation.setMax(128);
		sbSaturation.incrementProgressBy(1);
		sbSaturation.setProgress(stSaturation);
		sbSaturation.setOnSeekBarChangeListener(new ColorSeekBarListenner());

		SeekBar sbHuen = (SeekBar)m_layoutQuality.findViewById(R.id.sb_quality_huen);
		sbHuen.setMax(128);
		sbHuen.incrementProgressBy(1);
		sbHuen.setProgress(stHuen);
		sbHuen.setOnSeekBarChangeListener(new ColorSeekBarListenner());
	}

	private void setDevQuality() {
		ToolKits.showMessage(this, res.getString(R.string.info_remote_configure));
		AV_CFG_ChannelVideoColor stAvChnVideoColor = new AV_CFG_ChannelVideoColor();
		if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOCOLOR, stAvChnVideoColor, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240)) {
			ToolKits.writeLog("get config CFG_CMD_VIDEOCOLOR success");

			// there are stAvChnVideoColor.nColorNum configuration in device,
			// you can modify nBrightness, nContrast, nGamma, nHue, nSaturation in stAvChnVideoColor.stuColor[i]
			// according to different time section stAvChnVideoColor.stuColor[i].stuTimeSection
			stAvChnVideoColor.stuColor[0].nBrightness = 60;
			stAvChnVideoColor.stuColor[0].nContrast = 60;
			stAvChnVideoColor.stuColor[0].nGamma = 60;
			stAvChnVideoColor.stuColor[0].nHue = 60;
			stAvChnVideoColor.stuColor[0].nSaturation = 60;
			if (ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOCOLOR, stAvChnVideoColor, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240)) {
				ToolKits.writeLog("set config CFG_CMD_VIDEOCOLOR success");
			} else {
				ToolKits.writeErrorLog("set config CFG_CMD_VIDEOCOLOR failed");
			}
		} else {
			ToolKits.writeErrorLog("get config CFG_CMD_VIDEOCOLOR failed");
		}
	}

	private void jumpToEncodeActivity() {
		Intent intent = new Intent();
		intent.setClass(this, EncodeSettingActivity.class);
		startActivityForResult(intent, 2);
	}

	public boolean PTZControl( MotionEvent event , int nChn ,  int nControl , byte param1 , byte param2)
	{
		int nAction = event.getAction();
		if( (nAction != MotionEvent.ACTION_DOWN) && (nAction != MotionEvent.ACTION_UP) )
		{
			return false;
		}

		boolean zRet = INetSDK.SDKPTZControl(TestNetSDKActivity.m_loginHandle, nChn , nControl ,
				param1 ,param2 ,(byte) 0 , nAction == MotionEvent.ACTION_UP);

		return false;
	}

	public class LiveButtonsListener implements OnClickListener
	{
		public void onClick(View btClick) {
			if( btClick == m_btFlash ) {
				flashProcess();
			} else if (btClick == m_btPtz) {
				ptzProcess();
			} else if (btClick == m_btStartRecord ) {
				StartRecord();
			} else if (btClick == m_btSound ) {
				soundControl();
			} else if (btClick == m_btCapture ) {
				capture();
			} else if (btClick == m_btVolume) {
				setVolume();
			} else if (btClick == m_btEncode) {
				jumpToEncodeActivity();
			} else if (btClick == m_btQuality) {
				// attention please,
				// setQuality function only modify current view, no influence to others' view
				// if you want modify device configuration, reference to setDevQuality, it will affect all users' view
				setQuality();   // setDevQuality();
			} else if (btClick == m_btSnap) {
				snap();
			}
		}
	}

	public class TestRealDataAndDisConn implements CB_fRealDataCallBackEx, CB_fRealPlayDisConnect {
		@Override
		public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer,
						   int dwBufSize, int param)
		{
		}

		@Override
		public void invoke(long lOperateHandle, int dwEventType) {
			ToolKits.writeLog("TestpfAudioDataCallBack");
		}
	}

	public static boolean createFile(String strPath, String strFile) {
		File path = new File(strPath);
		if (!path.exists()) {
			try {
				if (!path.mkdirs()) {
					ToolKits.writeLog("App can't create path " + strPath);
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		File file = new File(strPath + strFile);
		if (file.exists()) {
			file.delete();
		}

		try {
			if (!file.createNewFile()) {
				ToolKits.writeLog("App can't create file " + strPath + strFile);
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public class TestfSnapRev implements CB_fSnapRev {
		@Override
		public void invoke(long lLoginID, byte pBuf[], int RevLen, int EncodeType, int CmdSerial)
		{
			ToolKits.writeLog("TestfSnapRev");
			String strFileName = "";
			if (10 == EncodeType) { // 表示jpeg图片
				if (createFile("/mnt/sdcard/NetSDK/", "remote.jpg")) {
					strFileName = "/mnt/sdcard/NetSDK/remote.jpg";
				}
			} else if (0 == EncodeType) { // mpeg4的i帧
				if (createFile("/mnt/sdcard/NetSDK/", "remote.mpeg4")) {
					strFileName = "/mnt/sdcard/NetSDK/remote.mpeg4";
				}
			} else {
				return;
			}

			if ("" != strFileName) {
				FileOutputStream fileStream;
				try {
					fileStream = new FileOutputStream(strFileName, true);
					fileStream.write(pBuf, 0, RevLen);
					fileStream.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private class ColorSeekBarListenner implements OnSeekBarChangeListener {
		@Override
		public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
			if (fromUser) {
				Integer stValue[] = new Integer[4];
				for (int i = 0; i < 4; i++) {
					stValue[i] = new Integer(0);
				}

				int nRet = IPlaySDK.PLAYGetColor(nPort, 0, stValue[0], stValue[1], stValue[2], stValue[3]);
				if (seekBar == (SeekBar)m_layoutQuality.findViewById(R.id.sb_quality_bright)) {
					nRet = IPlaySDK.PLAYSetColor(nPort, 0, progress, stValue[1], stValue[2], stValue[3]);
				} else if (seekBar == (SeekBar)m_layoutQuality.findViewById(R.id.sb_quality_contrast)) {
					nRet = IPlaySDK.PLAYSetColor(nPort, 0, stValue[0], progress, stValue[2], stValue[3]);
				} else if (seekBar == (SeekBar)m_layoutQuality.findViewById(R.id.sb_quality_saturation)) {
					nRet = IPlaySDK.PLAYSetColor(nPort, 0, stValue[0], stValue[1], progress, stValue[3]);
				} else if (seekBar == (SeekBar)m_layoutQuality.findViewById(R.id.sb_quality_huen)) {
					nRet = IPlaySDK.PLAYSetColor(nPort, 0, stValue[0], stValue[1], stValue[2], progress);
				}
			}
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {

		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {

		}
	}

	@Override
	protected void onDestroy()
	{
		if (null != m_popFlash && m_popFlash.isShowing()) {
			m_popFlash.dismiss();
		}

		if (null != m_popPtz && m_popPtz.isShowing()) {
			m_popPtz.dismiss();
		}

		if (null != m_popVolume && m_popVolume.isShowing()) {
			m_popVolume.dismiss();
		}

		if ( lRealHandle != 0 )
		{
			StopRealPlay();
		}

		super.onDestroy();
	}
}