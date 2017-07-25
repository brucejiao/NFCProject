package com.company.Demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.company.NetSDK.AV_CFG_ChannelName;
import com.company.NetSDK.CFG_ALARM_MSG_HANDLE;
import com.company.NetSDK.CFG_MOTION_INFO;
import com.company.NetSDK.CFG_TIME_SECTION;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.nfcproject.R;

import java.util.ArrayList;

public class MotionDetectConfigActivity extends Activity{

	private static final int				RECORD_CHANNEL		=	101;				//录像多通道
	private static final int				ALARMOUT_CHANNEL	=	102;				//报警输出多通道选择
	private static final int				TIMESECTION			=	103;				//布撤防时间段
	private static final int				REGION				=	104;				//动检区域选择
	private static final int				OPENDEJITTER		= 	105;				//去抖动
	private static final int				OPENLEVEL			=	106;				//灵敏度
	private static final int				OPENLIGHTDELAY		= 	107;				//补光灯延时
	private static final int				OPENRECORDDELAY		= 	108;				//录像延时
	private static final int				OPENOUTDELAY		= 	109;				//报警输出延时
	//************************************UI控件*********************************************//
	private RelativeLayout 					mChannelNumLayout;							//通道选择按钮
	private TextView						mChannelNumTextView;						//通道号
	private RelativeLayout 					mMotionEnableLayout;						//动态使能布局
	private ImageView						mMotionEnableBtn;							//动态使能检测
	private ImageView						mMoreBtn;									//高级配置选择按钮
	private RelativeLayout					mMoreBtnLayout;								//高级配置选择按钮Layout
	private LinearLayout 					mMorelLayout;								//高级配置模块
	private RelativeLayout 					mTimeSectionLayout;							//布撤防时间按钮
	private RelativeLayout					mDejitterLayout;							//去抖动Layout
	private TextView 						mDejitterTextView;							//去抖动时间
	private RelativeLayout					mLevelLayout;								//灵敏度Layout
	private TextView 						mLevelTextView;								//灵敏度
	private RelativeLayout 					mRregionLayout;								//区域设置Layout
	private RelativeLayout					mFlashlightEnableLayout;					//补光灯使能开关Layout
	private ImageView 						mFlashlightEnableBtn;						//补光灯使能开关
	private	RelativeLayout					mFlashlightTimeLayout;						//补光灯延时Layout
	private TextView 						mFlashlightTimeTextView;					//补光灯延时时间
	private ImageView 						mRecordEnableBtn;							//录像使能开关
	private RelativeLayout					mRecordChannelLayout;						//录像通道选择Layout
	private TextView						mRecordChannelTextView;						//录像通道
	private RelativeLayout					mRecordTimeLayout;							//录像延时Layout
	private TextView 						mRecordTimTextView;							//录像延时时间
	private RelativeLayout					mAlarmOutEnableLayout;						//报警输出使能开关Layout
	private ImageView 						mAlarmOutEnableBtn;							//报警输出使能开关
	private RelativeLayout 					mAlarmOutChannelLayout;						//报警输出通道选择Layout
	private TextView						mAlarmOutChannelTextView;					//报警输出通道
	private	RelativeLayout					mAlarmOutTimeLayout;						//报警使出延时Layout
	private TextView 						mAlarmOutTimeTextView;						//报警输出延时时间
	private ImageView 						mSnaptBtn;									//抓图使能开关
	private ProgressDialog		 			mProgressDialog;							//等待框

	//***********************************变量************************************************//
//	private AV_HANDLE 						mDevice;									//登陆句柄
//	private Device							mLocalDevice;
	private String[] 						mChannelNames;								//通道名数组
	private int 							mCurrentChannelId;							//当前配置的通道号
	private int 							mChannelSize;								//通道数
	private String[]						mAlarmOutChannelNames;						//报警输出通道名数组
	private int 				 			mAlarmOutCount;								//报警通道数
	//	private MotionDetect 					mMotionDetect;								//当前通道的动检配置信息数据结构
//	private MotionDetectOption 				mMotionDetectOption;						//当前通道的动检配置信息
	private CFG_MOTION_INFO mMotionInfoChannel;
	private boolean							mIsFirst = true;							//是否第一次进入页面，第一次获取失败返回前一个界面，后面的不用
	private int								mVideoStandard;								//视频制式 0:PAL 1:NTSC
	private boolean							mHasFlash = true;							//设备是否有补光灯

	//	private MsgHelper 	   					mHelper;									//错误号帮组类
	private Handler 						mHandler = new Handler();
	//	private Broadcast						mBroadcast;
//	private DBHelper						mDBHelper;
	private boolean							mDisconnect = false;
	private byte[]							mStateFlg = new byte[1];
	private ActivityState					mState;
	private enum ActivityState
	{
		Pause,
		Resume,
	}

	private int nExtraChnNum;
	private int nExtraAlarmOutPortNum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		mDBHelper = new DBHelper();
//		UIUtility.checkInit(MotionDetectConfigActivity.this);
//		IntentFilter filter = new IntentFilter();
//		filter.addAction(TeleConfigListActivity.ACTION_INTENT_DISCONNECT);
//		mBroadcast = new Broadcast();
//		this.registerReceiver(mBroadcast, filter);

		setContentView(R.layout.motiondetect_config);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		nExtraChnNum = getIntent().getIntExtra("name_nExtraChnNum", 0);
		nExtraAlarmOutPortNum = getIntent().getIntExtra("name_nExtraAlarmOutPortNum", 0);

//		mHelper = MsgHelper.instance();
//		int deviceId = this.getIntent().getIntExtra("deviceId", -1);
//		getLocalDevice(deviceId);
		initUIView();
		mProgressDialog = ProgressDialog.show(MotionDetectConfigActivity.this,
				this.getString(R.string.common_msg_wait), this.getString(R.string.common_msg_get_cfg));
		mProgressDialog.setCancelable(false);
		new Thread(){
			public void run()
			{
				initData();
			}
		}.start();
	}



	@Override
	protected void onDestroy() {
		clear();
		super.onDestroy();
	}



	@Override
	protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (data == null)
		{
			return;
		}
		if(requestCode == RECORD_CHANNEL && resultCode == RESULT_OK)
		{
			final int[] channelNums = data.getIntArrayExtra("usefulChannel");

			for (int i = 0; i < mMotionInfoChannel.stuEventHandler.dwRecordMask.length; i++) {
				mMotionInfoChannel.stuEventHandler.dwRecordMask[i] = 0;
			}

			for (int i = 0; i < channelNums.length; i++) {
				int x = channelNums[i] / 32;
				int y = channelNums[i] % 32;
				mMotionInfoChannel.stuEventHandler.dwRecordMask[x] = mMotionInfoChannel.stuEventHandler.dwRecordMask[x] | (0x01 << y);
			}

			if (channelNums.length > 0) {
				mMotionInfoChannel.stuEventHandler.abRecordMask = true;
			}

			mHandler.post(new Runnable() {

				@Override
				public void run() {
					mRecordChannelTextView.setText(getChosedChannelNames(mMotionInfoChannel.stuEventHandler.dwRecordMask, mChannelNames));
				}
			});
		}
		else if (requestCode == ALARMOUT_CHANNEL && resultCode == RESULT_OK)
		{
			final int[] channelNums = data.getIntArrayExtra("usefulChannel");

			for (int i = 0; i < mMotionInfoChannel.stuEventHandler.dwAlarmOutMask.length; i++) {
				mMotionInfoChannel.stuEventHandler.dwAlarmOutMask[i] = 0;
			}

			for (int i = 0; i < channelNums.length; i++) {
				int x = channelNums[i] / 32;
				int y = channelNums[i] % 32;
				mMotionInfoChannel.stuEventHandler.dwAlarmOutMask[x] = mMotionInfoChannel.stuEventHandler.dwAlarmOutMask[x] | (0x01 << y);
			}

			mHandler.post(new Runnable() {

				@Override
				public void run() {
					mAlarmOutChannelTextView.setText(getChosedChannelNames(mMotionInfoChannel.stuEventHandler.dwAlarmOutMask, mAlarmOutChannelNames));
				}
			});
		}
		else if (requestCode == ChannelChooseActivity.CHANNEL_NUM && resultCode == RESULT_OK)
		{
			mProgressDialog = ProgressDialog.show(MotionDetectConfigActivity.this,
					this.getString(R.string.common_msg_wait), this.getString(R.string.common_msg_get_cfg));
			mProgressDialog.setCancelable(false);
			new Thread(new Runnable() {

				@Override
				public void run() {
					mCurrentChannelId = data.getIntExtra("channelNum", 0);
					if (!getMotionDtetctInfo(mCurrentChannelId))
					{
						return;
					}
					mHandler.post(new Runnable() {

						@Override
						public void run() {
							refrashUI();
						}
					});
					dismissDialog();
				}
			}).start();
		}
		else if (requestCode == REGION && resultCode == RESULT_OK)
		{
			//mMotionInfoChannel.byRegion = data.getByteArrayListExtra("region");

			long[] areaAdapter;
			areaAdapter = data.getLongArrayExtra("region");

			if (mMotionInfoChannel.abDetectRegion) {
				mMotionInfoChannel.stuRegion[0].nMotionRow = areaAdapter.length;
				mMotionInfoChannel.stuRegion[0].nMotionCol = 22;

				for (int i = 0; i < mMotionInfoChannel.stuRegion[0].nMotionRow; i++) {
					for (int j = 0; j <mMotionInfoChannel.stuRegion[0].nMotionCol; j++) {
						if ((areaAdapter[i] & (0x01 << j)) != 0) {
							mMotionInfoChannel.stuRegion[0].byRegion[i][j] = 1;
						} else {
							mMotionInfoChannel.stuRegion[0].byRegion[i][j] = 0;
						}
					}
				}
			} else {
				mMotionInfoChannel.nMotionRow = areaAdapter.length;
				mMotionInfoChannel.nMotionCol = 22;

				for (int i = 0; i < mMotionInfoChannel.nMotionRow; i++) {
					for (int j = 0; j < mMotionInfoChannel.nMotionCol; j++) {
						if ((areaAdapter[i] & (0x01 << j)) != 0) {
							mMotionInfoChannel.byRegion[i][j] = 1;
						} else {
							mMotionInfoChannel.byRegion[i][j] = 0;
						}
					}
				}
			}
		}
		else if (requestCode == TIMESECTION && resultCode == RESULT_OK)
		{
			ArrayList<String> mTimeList = data.getStringArrayListExtra("time");
			if(mTimeList != null)
			{
				for(int i =0; i< TimeSection.DAYS_OF_WEEK; i++)
				{
					for(int j =0; j< TimeSection.MAX_COUNT_OF_TS;j++)
					{
						String s =  mTimeList.get(i*TimeSection.MAX_COUNT_OF_TS + j);
						mMotionInfoChannel.stuTimeSection[i][j] = getTimeByStr(s);
					}
				}
			}
		}
		else if (resultCode == RESULT_OK)
		{
			String second = this.getString(R.string.remote_second);
			int delay = 0;
			if(data != null)
			{
				delay = data.getIntExtra("delay", 0);
			}
			switch(requestCode)
			{
//				case OPENDEJITTER:
//					mDejitterTextView.setText(delay + second);
//					mMotionDetectOption.eventHandler.dejitter = delay;
//					break;
				case OPENLEVEL:
					mLevelTextView.setText(delay + "");
					if (mMotionInfoChannel.abDetectRegion) {
						mMotionInfoChannel.stuRegion[0].nSenseLevel = delay;
					} else {
						mMotionInfoChannel.nSenseLevel = delay;
					}
					break;
				case OPENLIGHTDELAY:
					mFlashlightTimeTextView.setText(delay + second);
					mMotionInfoChannel.stuEventHandler.nFlashLatch = delay;
					break;
				case OPENRECORDDELAY:
					mRecordTimTextView.setText(delay + second);
					mMotionInfoChannel.stuEventHandler.nRecordLatch = delay;
					break;
				case OPENOUTDELAY:
					mAlarmOutTimeTextView.setText(delay + second);
					mMotionInfoChannel.stuEventHandler.nAlarmOutLatch = delay;
					break;
			}
		}
	}



	@Override
	protected void onResume() {
		synchronized (mStateFlg) {
			mState = ActivityState.Resume;
			if(mDisconnect)
			{
				MotionDetectConfigActivity.this.showMyDialog(R.string.dev_state_disconnected,true);
			}
		}
		super.onResume();
	}



	@Override
	protected void onPause() {
		synchronized (mStateFlg) {
			mState = ActivityState.Pause;
		}
		super.onPause();
	}



	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK)
		{
			exit();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	/**
	 * 初始化UI控件
	 */
	private void initUIView() {
		TextView titleText = (TextView)findViewById(R.id.title_center);
		titleText.setText(R.string.remote_type_video_detect_motion);

		ImageView titleLeft = (ImageView)findViewById(R.id.title_left_image);
		titleLeft.setBackgroundResource(R.drawable.title_btn_back);
		titleLeft.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				exit();
			}
		});

		ImageView titleRight = (ImageView) findViewById(R.id.title_right_image);
		titleRight.setVisibility(View.VISIBLE);
		titleRight.setBackgroundResource(R.drawable.title_save_btn);
		titleRight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mProgressDialog = ProgressDialog.show(MotionDetectConfigActivity.this,
						MotionDetectConfigActivity.this.getString(R.string.common_msg_wait), MotionDetectConfigActivity.this.getString(R.string.common_msg_save_cfg));
				mProgressDialog.setCancelable(false);
				new Thread(new Runnable() {

					@Override
					public void run() {
						//保存配置信息
						mMotionInfoChannel.bEnable = mMotionEnableBtn.isSelected();
						mMotionInfoChannel.stuEventHandler.bFlashEnable = mFlashlightEnableBtn.isSelected();
						mMotionInfoChannel.stuEventHandler.bRecordEnable = mRecordEnableBtn.isSelected();
						mMotionInfoChannel.stuEventHandler.bAlarmOutEn = mAlarmOutEnableBtn.isSelected();
						mMotionInfoChannel.stuEventHandler.bSnapshotEn = mSnaptBtn.isSelected();
//						AV_IN_NewConfigEx inParam = new AV_IN_NewConfigEx();
//						AV_OUT_NewConfigEx outParam = new AV_OUT_NewConfigEx();
//						inParam.strCfgName = Afkinc.METHOD_MOTIONDETECT;
//						inParam.nChannelID = mCurrentChannelId;
//						inParam.setBuffer = mMotionDetect;
//						boolean nRet = AVNetSDK.AV_SetNewDeviceConfigEx(mDevice, inParam, outParam);
						boolean nRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_MOTIONDETECT, mMotionInfoChannel, TestNetSDKActivity.m_loginHandle, mCurrentChannelId, 4096);
						if (nRet)
						{
							showMyDialog(R.string.common_msg_save_cfg_success, false);
						}
						else
						{
							showMyDialog(R.string.common_msg_save_cfg_failed, false);
						}
					}
				}).start();
			}
		});


		mMorelLayout = (LinearLayout) findViewById(R.id.more_config_layout);

		//通道选择
		mChannelNumLayout = (RelativeLayout) findViewById(R.id.channel_choose_layout);
		mChannelNumLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("type", ChannelChooseActivity.CHANNEL_NUM);
				String[] channelNames = null;
//				int count = ((CDevice)mDevice).getDevInfo().channelcount - ((CDevice)mDevice).getDevInfo().AnalogChnNum;
//				if(count > 0)
//				{
//					int len = mChannelNames.length - count;
//					channelNames = new String[len];
//					for(int i =0; i< len; i++)
//					{
//						channelNames[i] = mChannelNames[i];
//					}
//				}
//				else
//				{
//					channelNames = mChannelNames;
//				}
//				if(channelNames == null || channelNames.length == 0)
//				{
//					channelNames = mChannelNames;
//				}
				channelNames = mChannelNames;
				intent.putExtra("channelNames", channelNames);
				intent.putExtra("usefulChannel", new int[] {mCurrentChannelId});	//通道号从0开始
				intent.setClass(MotionDetectConfigActivity.this, ChannelChooseActivity.class);
				startActivityForResult(intent, ChannelChooseActivity.CHANNEL_NUM);
				overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
			}
		});

		mChannelNumTextView = (TextView) findViewById(R.id.channel_choose_text);

		//动态检测使能开关
		mMotionEnableLayout = (RelativeLayout) findViewById(R.id.motion_enable_layout);
		mMotionEnableBtn = (ImageView) findViewById(R.id.enable_btn);
		mMotionEnableLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mMotionEnableBtn.isSelected())
				{
					mMotionEnableBtn.setSelected(false);
					mMotionInfoChannel.bEnable = false;
				}
				else
				{
					mMotionEnableBtn.setSelected(true);
					mMotionInfoChannel.bEnable = true;
				}

			}
		});

		//高级功能选项按钮
		mMoreBtn = (ImageView) findViewById(R.id.more_config_btn);
		mMoreBtnLayout = (RelativeLayout) findViewById(R.id.more_config_btn_layout);
		mMoreBtnLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mMoreBtn.isSelected())
				{
					mMoreBtn.setSelected(false);
					mMorelLayout.setVisibility(View.GONE);
				}
				else
				{
					mMoreBtn.setSelected(true);
					mMorelLayout.setVisibility(View.VISIBLE);
				}
			}
		});

		//高级配置模块
		//布撤防时间
		mTimeSectionLayout = (RelativeLayout) findViewById(R.id.detect_time_layout);
		mTimeSectionLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				openDetectActivity();
			}
		});

		//去抖动
//	    mDejitterLayout = (RelativeLayout) findViewById(R.id.dejitter_layout);
//	    mDejitterLayout.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				int delay = mMotionDetectOption.eventHandler.dejitter;
//				//TODO:区分K100，由于设备差异范围不同，客户端目前没法统一，暂时给5-600默认。
//				openDelayActivity(OPENDEJITTER, delay, 5, 600,getString(R.string.remote_dejitter));
//			}
//		});
//	    mDejitterTextView = (TextView) findViewById(R.id.dejitter_time);

		//灵敏度
		mLevelLayout = (RelativeLayout) findViewById(R.id.level_layout);
		mLevelLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int delay;
				if (mMotionInfoChannel.abDetectRegion) {
					delay = mMotionInfoChannel.stuRegion[0].nSenseLevel;
					//TODO:区分K100，由于设备差异范围不同，客户端目前没法统一，暂时给5-600默认。
					openDelayActivity(OPENLEVEL, delay, 0, 100, getString(R.string.remote_sensitivity));
				} else {
					delay = mMotionInfoChannel.nSenseLevel;
					//TODO:区分K100，由于设备差异范围不同，客户端目前没法统一，暂时给5-600默认。
					openDelayActivity(OPENLEVEL, delay, 1, 6, getString(R.string.remote_sensitivity));
				}
			}
		});
		mLevelTextView = (TextView) findViewById(R.id.level_text);

		//区域设置
		mRregionLayout = (RelativeLayout) findViewById(R.id.region_layout);
		mRregionLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				long[] areaAdapter = new long[FinalVar.MAX_MOTION_ROW];
				if (mMotionInfoChannel.abDetectRegion) {
					for (int i = 0; i < FinalVar.MAX_MOTION_ROW; i++) {
						for (int j = 0; j < FinalVar.MAX_MOTION_COL; j++) {
							if (mMotionInfoChannel.stuRegion[0].byRegion[i][j] != 0) {
								areaAdapter[i] = areaAdapter[i] | (0x01 << j);
							}
						}
					}
				} else {
					for (int i = 0; i < FinalVar.MAX_MOTION_ROW; i++) {
						for (int j = 0; j < FinalVar.MAX_MOTION_COL; j++) {
							if (mMotionInfoChannel.byRegion[i][j] != 0) {
								areaAdapter[i] = areaAdapter[i] | (0x01 << j);
							}
						}
					}
				}

				Intent intent = new Intent();
				intent.putExtra("VideoStandard", mVideoStandard);
				intent.putExtra("region", areaAdapter);
				intent.setClass(MotionDetectConfigActivity.this, DetectAreaActivity.class);
				startActivityForResult(intent, REGION);
				overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
			}
		});

		//补光灯
		mFlashlightEnableLayout = (RelativeLayout) findViewById(R.id.flashlight_enable_layout);
		mFlashlightEnableBtn = (ImageView) findViewById(R.id.flashlight_enable_btn);
		mFlashlightEnableLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mFlashlightEnableBtn.isSelected())
				{
					mFlashlightEnableBtn.setSelected(false);
					mMotionInfoChannel.stuEventHandler.bFlashEnable = false;
				}
				else
				{
					mFlashlightEnableBtn.setSelected(true);
					mMotionInfoChannel.stuEventHandler.bFlashEnable = true;
				}

			}
		});
		mFlashlightTimeLayout = (RelativeLayout) findViewById(R.id.flashlight_time_layout);
		mFlashlightTimeLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int delay = mMotionInfoChannel.stuEventHandler.nFlashLatch;
				openDelayActivity(OPENLIGHTDELAY, delay, 10, 300,getString(R.string.remote_delay));
			}
		});
		mFlashlightTimeTextView = (TextView) findViewById(R.id.flashlight_delay_time);

		//录像
		View configRelativeLayout  = (RelativeLayout) findViewById(R.id.record_enable_layout);
		mRecordEnableBtn = (ImageView) findViewById(R.id.record_enable_btn);
		configRelativeLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mRecordEnableBtn.isSelected())
				{
					mRecordEnableBtn.setSelected(false);
					mMotionInfoChannel.stuEventHandler.bRecordEnable = false;
				}
				else
				{
					mRecordEnableBtn.setSelected(true);
					mMotionInfoChannel.stuEventHandler.bRecordEnable = true;
				}

			}
		});
		mRecordChannelLayout = (RelativeLayout) findViewById(R.id.record_channel_layout);
		mRecordChannelLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int[] chnAll = new int[mChannelNames.length];
				int chnCount = 0;
				for (int i = 0; i < mChannelNames.length; i++) {
					int x = i / 32;
					int y = i % 32;
					if (((0x01 << y) & mMotionInfoChannel.stuEventHandler.dwRecordMask[x]) != 0) {
						chnAll[chnCount] = i;
						chnCount++;
					}
				}

				int[] chnRec = new int[chnCount];
				System.arraycopy(chnAll, 0, chnRec, 0, chnCount);

				Intent intent = new Intent();
				intent.putExtra("usefulChannel", chnRec);
				intent.putExtra("channelNames", mChannelNames);
				intent.setClass(MotionDetectConfigActivity.this, ChannelChooseActivity.class);
				startActivityForResult(intent, RECORD_CHANNEL);
				overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
			}
		});
		mRecordChannelTextView = (TextView) findViewById(R.id.record_channel_text);
		mRecordTimeLayout = (RelativeLayout) findViewById(R.id.record_time_layout);
		mRecordTimeLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int delay = mMotionInfoChannel.stuEventHandler.nRecordLatch;
				openDelayActivity(OPENRECORDDELAY, delay, 10, 300,getString(R.string.remote_delay));
			}
		});
		mRecordTimTextView = (TextView) findViewById(R.id.record_time_text);

		//报警输出
		mAlarmOutEnableLayout = (RelativeLayout) findViewById(R.id.alarmout_enable_layout);
		mAlarmOutEnableBtn = (ImageView) findViewById(R.id.alarmout_enable_btn);
		mAlarmOutEnableLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mAlarmOutEnableBtn.isSelected())
				{
					mAlarmOutEnableBtn.setSelected(false);
					mMotionInfoChannel.stuEventHandler.bAlarmOutEn = false;
				}
				else
				{
					mAlarmOutEnableBtn.setSelected(true);
					mMotionInfoChannel.stuEventHandler.bAlarmOutEn = true;
				}
			}
		});
		mAlarmOutChannelLayout = (RelativeLayout) findViewById(R.id.alarmout_channel_layout);
		mAlarmOutChannelLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int[] chnAll = new int[mAlarmOutChannelNames.length];
				int chnCount = 0;
				for (int i = 0; i < mAlarmOutChannelNames.length; i++) {
					int x = i / 32;
					int y = i % 32;
					if (((0x01 << y) & mMotionInfoChannel.stuEventHandler.dwAlarmOutMask[x]) != 0) {
						chnAll[chnCount] = i;
						chnCount++;
					}
				}

				int[] chnRec = new int[chnCount];
				System.arraycopy(chnAll, 0, chnRec, 0, chnCount);

				Intent intent = new Intent();
				intent.putExtra("usefulChannel", chnRec);
				intent.putExtra("channelNames", mAlarmOutChannelNames);
				intent.setClass(MotionDetectConfigActivity.this, ChannelChooseActivity.class);
				startActivityForResult(intent, ALARMOUT_CHANNEL);
				overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
			}
		});
		mAlarmOutChannelTextView = (TextView) findViewById(R.id.alarmout_channel_text);
		mAlarmOutTimeLayout = (RelativeLayout) findViewById(R.id.alarmout_time_layout);
		mAlarmOutTimeLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int delay = mMotionInfoChannel.stuEventHandler.nAlarmOutLatch;
				openDelayActivity(OPENOUTDELAY, delay, 1, 300,getString(R.string.remote_delay));
			}
		});
		mAlarmOutTimeTextView = (TextView) findViewById(R.id.alarmout_time_text);

		//抓图
		View SnaptLayout = findViewById(R.id.snapt_layout);
		mSnaptBtn = (ImageView) findViewById(R.id.snapt_enable);
		SnaptLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mSnaptBtn.isSelected())
				{
					mSnaptBtn.setSelected(false);
					mMotionInfoChannel.stuEventHandler.bSnapshotEn = false;
				}
				else
				{
					mSnaptBtn.setSelected(true);
					mMotionInfoChannel.stuEventHandler.bSnapshotEn = true;
				}

			}
		});
	}

//	private void getLocalDevice(int deviceId)
//	{
//		boolean open = mDBHelper.open(this);
//		if(open)
//		{
//			mLocalDevice = mDBHelper.getDeviceById(deviceId);
//		}
//	}

	//初始化数据
	private void initData() {

//		if(mLocalDevice == null)
//		{
//			showMyDialog(R.string.common_msg_connect_timeout,true);
//			return;
//		}
//		mDevice = TeleConfigListActivity.DEVICE;
//		if(mDevice == null)
//		{
//			return;
//		}
		//登录设备

//		mVideoStandard = ((CDevice)mDevice).getDevInfo().ispal?0:1;
		//获取通道名称
//		AV_IN_Config inParam = new AV_IN_Config();
//		AV_OUT_Config outParam = new AV_OUT_Config();
//		inParam.type = E_ConfigType.CHANNEL_NAME;
//		boolean bGet = AVNetSDK.AV_GetDeviceConfig(mDevice, inParam, outParam);
		int nChnNum = nExtraChnNum;

		mChannelNames = new String[nChnNum];
		for (int i = 0; i < nChnNum; i++) {
			AV_CFG_ChannelName stChnName = new AV_CFG_ChannelName();
			boolean bGet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_CHANNELTITLE, stChnName, TestNetSDKActivity.m_loginHandle, i, 4096);
			if(!bGet)
			{
				showMyDialog(R.string.common_msg_get_cfg_failed,mIsFirst);
				return;
			}

			mChannelNames[i] = new String(stChnName.szName);
		}
//		mChannelNames = (String[]) outParam.value;
		mChannelSize = mChannelNames.length;
		mCurrentChannelId = 0;
		//******************获取动检配置信息***************//
		//获取动检配置信息
		if (!getMotionDtetctInfo(mCurrentChannelId))
		{
			return;
		}
		getAlarmOutChannelNames();
		//填充UI上的数据
		mHandler.post(new Runnable() {

			@Override
			public void run() {
				refrashUI();
			}
		});
		dismissDialog();
		mIsFirst = false;
	}


	/**
	 * 填充UI 数据
	 */
	private void refrashUI() {
		if (mMotionInfoChannel.bEnable)
		{
			mMotionEnableBtn.setSelected(true);
		}
		else
		{
			mMotionEnableBtn.setSelected(false);
		}

		int chnId[] = new int[FinalVar.MAX_CHANNEL_COUNT];
		int x = mCurrentChannelId / 32;
		int y = mCurrentChannelId % 32;
		chnId[x] |= (0x01 << y);
		mChannelNumTextView.setText(getChosedChannelNames(chnId, mChannelNames));

//		EventHandler eventHandler = mMotionDetectOption.eventHandler;
		CFG_ALARM_MSG_HANDLE stuEventHandler = mMotionInfoChannel.stuEventHandler;

		String second = getString(R.string.remote_second);

		//去抖动
//		mDejitterTextView.setText(String.valueOf(eventHandler.dejitter) + second);

		//灵敏度
		if (mMotionInfoChannel.abDetectRegion) {
			mLevelTextView.setText(String.valueOf(mMotionInfoChannel.stuRegion[0].nSenseLevel));
		} else {
			mLevelTextView.setText(String.valueOf(mMotionInfoChannel.nSenseLevel));
		}

		//补光灯
		if (mHasFlash)
		{
			mFlashlightEnableBtn.setSelected(stuEventHandler.bFlashEnable);
			mFlashlightTimeTextView.setText(String.valueOf(stuEventHandler.nFlashLatch) + second);
		}
		else
		{
			mFlashlightEnableLayout.setVisibility(View.GONE);
			mFlashlightTimeLayout.setVisibility(View.GONE);
		}
		//录像
		mRecordEnableBtn.setSelected(stuEventHandler.bRecordEnable);
		mRecordChannelTextView.setText(getChosedChannelNames(stuEventHandler.dwRecordMask, mChannelNames));
		mRecordTimTextView.setText(String.valueOf(stuEventHandler.nRecordLatch) + second);
		//报警输出
		if (mAlarmOutChannelNames.length == 0)
		{
			mAlarmOutEnableLayout.setVisibility(View.GONE);
			mAlarmOutTimeLayout.setVisibility(View.GONE);
			mAlarmOutChannelLayout.setVisibility(View.GONE);
		}
		else
		{
			mAlarmOutEnableBtn.setSelected(stuEventHandler.bAlarmOutEn);
			mAlarmOutChannelTextView.setText(getChosedChannelNames(stuEventHandler.dwAlarmOutMask, mAlarmOutChannelNames));
			mAlarmOutTimeTextView.setText(String.valueOf(stuEventHandler.nAlarmOutLatch) + second);
		}
		//抓图
		mSnaptBtn.setSelected(stuEventHandler.bSnapshotEn);

		if (mChannelSize == 1)
		{
			mChannelNumLayout.setVisibility(View.GONE);

			mMotionEnableLayout.setBackgroundResource(R.drawable.preference_single_item);
			mRecordChannelLayout.setVisibility(View.GONE);
			mRecordTimeLayout.setBackgroundResource(R.drawable.preference_last_item);
			mAlarmOutChannelLayout.setVisibility(View.GONE);
			mAlarmOutTimeLayout.setBackgroundResource(R.drawable.preference_last_item);

		}
	}

	/**
	 * 获取选中通道的通道名
	 * @param channelNums   选中的通道的通道号数组
	 * @param allChannelNames   被选择的通道名数组
	 * @return
	 */
	private String getChosedChannelNames(int[] channelNums, String[] allChannelNames) {
		//拼装要显示的字符串
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < allChannelNames.length; i++)
		{
			int x = i / 32;
			int y = i % 32;
			if ((channelNums[x] & (0x01 << y)) != 0) {
				if (i == allChannelNames.length - 1)
				{
					stringBuffer.append(allChannelNames[i]);
				}
				else
				{
					stringBuffer.append(allChannelNames[i] + getString(R.string.common_title_comma));
				}
			}
		}
		return stringBuffer.toString();
	}

	/**
	 * 获取动检配置
	 * @return
	 */
	private boolean getMotionDtetctInfo(int channelId) {
//		AV_IN_QueryUserInfo in = new AV_IN_QueryUserInfo();
//		in.authTpe = AuthType.VIDEOCONF;
//		AV_OUT_QueryUserInfo out = new AV_OUT_QueryUserInfo();
//		boolean operate = AVNetSDK.AV_QuerryUserInfo(mDevice,in,out);
//		if(!operate) //检查权限超时
//		{
//			CManager.instance().setLastError(AVNetSDK.AV_NET_WAIT_TIMEOUT);
//			showMyDialog(mHelper.getMsg(CManager.instance().getLastError()),mIsFirst);
//			return false;
//		}
//		if(!out.bHasPermission) //无权限
//		{
//			showMyDialog(R.string.common_msg_no_permission,mIsFirst);
//			return false;
//		}
//
//		AV_IN_NewConfigEx inParam = new AV_IN_NewConfigEx();
//		inParam.strCfgName = Afkinc.METHOD_MOTIONDETECT;
//		inParam.nChannelID = channelId;
//		AV_OUT_NewConfigEx outParam = new AV_OUT_NewConfigEx();
//		boolean nRet = AVNetSDK.AV_GetNewDeviceConfigEx(mDevice, inParam, outParam);
		CFG_MOTION_INFO stMotionInfo = new CFG_MOTION_INFO();
		boolean nRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_MOTIONDETECT, stMotionInfo, TestNetSDKActivity.m_loginHandle, channelId, 10240);
		if (nRet)
		{
//			mMotionDetect = (MotionDetect) outParam.retBuffer;
//			if (mMotionDetect == null || mMotionDetect.tables == null || mMotionDetect.tables.length == 0)
//			{
//				mMotionDetect = null;
//				showMyDialog(mHelper.getMsg(CManager.instance().getLastError()),mIsFirst);
//				return false;
//			}
//			mMotionDetectOption = mMotionDetect.tables[0];
//			if(mMotionDetectOption.eventHandler.flashEnable == null)
//			{
//				mHasFlash = false;
//			}
//			if(TeleConfigListActivity.mAlarmCaps == null || !TeleConfigListActivity.mAlarmCaps.Flash)
//			{
//				mHasFlash = false;
//			}
			mMotionInfoChannel = stMotionInfo;
			mHasFlash = TestNetSDKActivity.stCfgCapAlarm.bFlashLight; //mHasFlash = mMotionInfoChannel.stuEventHandler.abFlashEn;
			return true;
		}
		else
		{
			//TODO： 获取配置失败，即errcode为1，提示获取配置失败
//		    if(CManager.instance().getLastError() == AVNetSDK.AV_Error)
//		    {
			showMyDialog((R.string.common_msg_get_cfg_failed),true);
//		    }
//		    else
//		    {
//		        showMyDialog(mHelper.getMsg(CManager.instance().getLastError()),mIsFirst);
//		    }
			return false;
		}
	}

	/**
	 * 查询报警输出通道信息
	 */
	private void getAlarmOutChannelNames()
	{

//		mAlarmOutCount = ((CDevice)mDevice).getDevInfo().alarmoutputcount;
		mAlarmOutCount = nExtraAlarmOutPortNum;
		mAlarmOutChannelNames = new String[mAlarmOutCount];
		for (int i = 0; i < mAlarmOutCount; i++)
		{
			String s = MotionDetectConfigActivity.this.getString(R.string.remote_chn_num);
			String channelName = s + " " +String.format("%02d", i+1);
			mAlarmOutChannelNames[i] = channelName;
		}
	}

	/**
	 * 跳转到布撤防时间段界面
	 */
	private void openDetectActivity()
	{
		ArrayList<String> timeList = new ArrayList<String>();
//		TimeSection stuTimeSect[][] = mMotionDetect.tables[0].eventHandler.stuTimeSect;
		TimeSection stuTimeSect[][] = new TimeSection[TimeSection.DAYS_OF_WEEK][TimeSection.MAX_COUNT_OF_TS];
		CFG_TIME_SECTION stuNetSDKTime[][] = mMotionInfoChannel.stuTimeSection;
		for(int i =0; i< TimeSection.DAYS_OF_WEEK; i++)
		{
			for(int j =0; j< TimeSection.MAX_COUNT_OF_TS;j++)
			{
				stuTimeSect[i][j] = new TimeSection();
				stuTimeSect[i][j].nEnable = stuNetSDKTime[i][j].dwRecordMask;
				stuTimeSect[i][j].nBeginHour = stuNetSDKTime[i][j].nBeginHour;
				stuTimeSect[i][j].nBeginMinute = stuNetSDKTime[i][j].nBeginMin;
				stuTimeSect[i][j].nBeginSecond = stuNetSDKTime[i][j].nBeginSec;
				stuTimeSect[i][j].nEndHour = stuNetSDKTime[i][j].nEndHour;
				stuTimeSect[i][j].nEndMinute = stuNetSDKTime[i][j].nEndMin;
				stuTimeSect[i][j].nEndSecond = stuNetSDKTime[i][j].nEndSec;

				timeList.add(stuTimeSect[i][j].toString());
			}
		}
		Intent intent = new Intent();
		intent.setClass(this, DetectShowActivity.class);
		intent.putStringArrayListExtra("time",timeList);
		startActivityForResult(intent, TIMESECTION);
		overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
	}

	/**
	 * 跳转到延时界面
	 * @param index
	 * @param delay
	 * @param min
	 * @param max
	 */
	private void openDelayActivity(int index,int delay,int min, int max,String configTitle)
	{
		Intent intent = new Intent();
		intent.setClass(this, DelaySettingActivity.class);
		intent.putExtra("delay", delay);
		intent.putExtra("min", min);
		intent.putExtra("max", max);
		intent.putExtra("configTitle", configTitle);
		startActivityForResult(intent, index);
		overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
	}

	/**
	 * 根据布防时间配置界面传回的字符串获取TimeSection
	 * @param timeStr
	 * @return
	 */
	private CFG_TIME_SECTION getTimeByStr(String timeStr)
	{
//		TimeSection timeSection = new TimeSection();
//		String[] tmp = timeStr.split(" ");
//
//		timeSection.nEnable = Integer.valueOf(tmp[0]);
//		String[] time = tmp[1].split("-");
//		String[] s = time[0].split(":");
//		String[] e = time[1].split(":");
//		timeSection.nBeginHour = Integer.parseInt(s[0]);
//		timeSection.nBeginMinute = Integer.parseInt(s[1]);
//		timeSection.nBeginSecond = Integer.parseInt(s[2]);
//		timeSection.nEndHour = Integer.parseInt(e[0]);
//		timeSection.nEndMinute = Integer.parseInt(e[1]);
//		timeSection.nEndSecond = Integer.parseInt(e[2]);
//
//		return timeSection;

		CFG_TIME_SECTION timeSection = new CFG_TIME_SECTION();
		String[] tmp = timeStr.split(" ");

		timeSection.dwRecordMask = Integer.valueOf(tmp[0]);
		String[] time = tmp[1].split("-");
		String[] s = time[0].split(":");
		String[] e = time[1].split(":");
		timeSection.nBeginHour = Integer.parseInt(s[0]);
		timeSection.nBeginMin = Integer.parseInt(s[1]);
		timeSection.nBeginSec = Integer.parseInt(s[2]);
		timeSection.nEndHour = Integer.parseInt(e[0]);
		timeSection.nEndMin = Integer.parseInt(e[1]);
		timeSection.nEndSec = Integer.parseInt(e[2]);

		return timeSection;
	}

	/**
	 * 错误提示框
	 * @param resId
	 */
	private void showMyDialog(final int resId,final boolean isFirst)
	{
		runOnUiThread(new Runnable() {

			@Override
			public void run() {
				if(MotionDetectConfigActivity.this.isFinishing())
				{
					return;
				}
				try
				{
					new AlertDialog.Builder(MotionDetectConfigActivity.this)
							.setTitle(R.string.common_msg_title)
							.setMessage(resId)
							.setCancelable(false)
							.setPositiveButton(R.string.common_confirm, new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog, int which) {
									dismissDialog();
									if (isFirst)
									{
										exit();
									}
								}
							}).show();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}

			}
		});
	}

//	private void logOut()
//	{
//		if(mDevice != null)
//		{
//			//AVNetSDK.AV_Logout(mDevice);
//			mDevice = null;
//		}
//	}

	private void clear()
	{

//		mDBHelper.close();
		dismissDialog();
//		logOut();
//		unRegister();

	}

//	private void unRegister()
//	{
//		if(mBroadcast != null)
//		{
//			MotionDetectConfigActivity.this.unregisterReceiver(mBroadcast);
//			mBroadcast = null;
//		}
//	}

	private void exit()
	{
		clear();
		MotionDetectConfigActivity.this.finish();
		overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
	}

	/**
	 * 等待框消失
	 */
	private void dismissDialog()
	{
		if(mProgressDialog != null && mProgressDialog.isShowing())
		{
			mProgressDialog.dismiss();
			mProgressDialog = null;
		}
	}

//	private class Broadcast extends BroadcastReceiver
//	{
//
//		@Override
//		public void onReceive(Context context, Intent intent) {
//			String action = intent.getAction(); //设备断线
//			if(action.equals(TeleConfigListActivity.ACTION_INTENT_DISCONNECT))
//			{
//				synchronized (mStateFlg) {
//					if(mState == ActivityState.Pause)
//					{
//						mDisconnect = true;
//					}
//					else
//					{
//						MotionDetectConfigActivity.this.showMyDialog(R.string.dev_state_disconnected,true);
//					}
//				}
//				unRegister();
//			}
//
//		}
//
//	}

}
