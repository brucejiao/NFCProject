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
import com.company.NetSDK.CFG_SHELTER_INFO;
import com.company.NetSDK.CFG_TIME_SECTION;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.nfcproject.R;

import java.util.ArrayList;

public class BlindDetectConfigActivity extends Activity{
	private static final int				RECORD_CHANNEL		=	101;				//录像多通道
	private static final int				ALARMOUT_CHANNEL	=	102;				//报警输出多通道选择
	private static final int				TIMESECTION			=	103;				//布撤防时间段
	private static final int				OPENRECORDDELAY		= 	108;				//录像延时
	private static final int				OPENOUTDELAY		= 	109;				//报警输出延时

	//************************************UI控件*********************************************//
	private RelativeLayout mChannelNumLayout;							//通道选择按钮
	private TextView mChannelNumTextView;						//通道号
	private ImageView mBlindEnableBtn;							//遮挡使能
	private RelativeLayout 					mBlindEnableLayout;							//遮挡使能布局
	private ImageView						mMoreBtn;									//高级配置选择按钮
	private RelativeLayout					mMoreBtnLayout;								//高级配置选择按钮Layout
	private LinearLayout mMorelLayout;								//高级配置模块
	private RelativeLayout 					mTimeSectionLayout;							//布撤防时间按钮
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
	private ProgressDialog mProgressDialog;							//等待框

	//***********************************变量************************************************//
//	private AV_HANDLE 						mDevice;									//登陆句柄
	//private int 							mDeviceId;									//设备ID
	private String[] 						mChannelNames;								//通道名数组
	private int 							mCurrentChannelId;							//当前配置的通道号
	private int 							mChannelSize;								//通道数
	private String[]						mAlarmOutChannelNames;						//报警输出通道名数组
	private int 				 			mAlarmOutCount;								//报警通道数
	//	private BlindDetect 					mBlindDetect;								//当前通道的遮挡配置信息数据结构
//	private BlindDetectOption 				mBlindDetectOption;							//当前通道的遮挡配置信息
	private CFG_SHELTER_INFO mShelterInfoChannel;
	private boolean							mIsFirst = true;							//是否第一次进入页面，第一次获取失败返回前一个界面，后面的不用

	//private SQLiteDatabase      	 		mDataBase;									//数据库
//	private Device							mLocalDevice;
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
//		UIUtility.checkInit(BlindDetectConfigActivity.this);
		setContentView(R.layout.blinddetect_config);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		nExtraChnNum = getIntent().getIntExtra("name_nExtraChnNum", 0);
		nExtraAlarmOutPortNum = getIntent().getIntExtra("name_nExtraAlarmOutPortNum", 0);

//		mHelper = MsgHelper.instance();
//		mDBHelper = new DBHelper();
//		int deviceId = this.getIntent().getIntExtra("deviceId", -1);
//		getLocalDevice(deviceId);

//		IntentFilter filter = new IntentFilter();
//		filter.addAction(TeleConfigListActivity.ACTION_INTENT_DISCONNECT);
//		mBroadcast = new Broadcast();
//		this.registerReceiver(mBroadcast, filter);
		initUIView();
		mProgressDialog = ProgressDialog.show(BlindDetectConfigActivity.this,
				this.getString(R.string.common_msg_wait), this.getString(R.string.common_msg_get_cfg));
		mProgressDialog.setCancelable(false);
		new Thread(){
			public void run()
			{
				initData();
			}
		}.start();
	}

//	private void getLocalDevice(int deviceId)
//	{
//		boolean open = mDBHelper.open(this);
//		if(open)
//		{
//			mLocalDevice = mDBHelper.getDeviceById(deviceId);
//		}
//	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode == RECORD_CHANNEL && resultCode == RESULT_OK)
		{
			final int[] channelNums = data.getIntArrayExtra("usefulChannel");

			for (int i = 0; i < mShelterInfoChannel.stuEventHandler.dwRecordMask.length; i++) {
				mShelterInfoChannel.stuEventHandler.dwRecordMask[i] = 0;
			}

			for (int i = 0; i < channelNums.length; i++) {
				int x = channelNums[i] / 32;
				int y = channelNums[i] % 32;
				mShelterInfoChannel.stuEventHandler.dwRecordMask[x] = mShelterInfoChannel.stuEventHandler.dwRecordMask[x] | (0x01 << y);
			}

			mHandler.post(new Runnable() {

				@Override
				public void run() {
					mRecordChannelTextView.setText(getChosedChannelNames(mShelterInfoChannel.stuEventHandler.dwRecordMask, mChannelNames));
				}
			});
		}
		else if (requestCode == ALARMOUT_CHANNEL && resultCode == RESULT_OK)
		{
			final int[] channelNums = data.getIntArrayExtra("usefulChannel");

			for (int i = 0; i < mShelterInfoChannel.stuEventHandler.dwAlarmOutMask.length; i++) {
				mShelterInfoChannel.stuEventHandler.dwAlarmOutMask[i] = 0;
			}

			for (int i = 0; i < channelNums.length; i++) {
				int x = channelNums[i] / 32;
				int y = channelNums[i] % 32;
				mShelterInfoChannel.stuEventHandler.dwAlarmOutMask[x] = mShelterInfoChannel.stuEventHandler.dwAlarmOutMask[x] | (0x01 << y);
			}

			mHandler.post(new Runnable() {

				@Override
				public void run() {
					mAlarmOutChannelTextView.setText(getChosedChannelNames(mShelterInfoChannel.stuEventHandler.dwAlarmOutMask, mAlarmOutChannelNames));
				}
			});
		}
		else if (requestCode == ChannelChooseActivity.CHANNEL_NUM && resultCode == RESULT_OK)
		{
			mProgressDialog = ProgressDialog.show(BlindDetectConfigActivity.this,
					this.getString(R.string.common_msg_wait), this.getString(R.string.common_msg_get_cfg));
			mProgressDialog.setCancelable(false);
			new Thread(new Runnable() {

				@Override
				public void run() {
					mCurrentChannelId = data.getIntExtra("channelNum", 0);
					if (!getBlindDtetctInfo(mCurrentChannelId))
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
						mShelterInfoChannel.stuTimeSection[i][j] = getTimeByStr(s);
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
				case OPENRECORDDELAY:
					mRecordTimTextView.setText(delay + second);
					mShelterInfoChannel.stuEventHandler.nRecordLatch = delay;
					break;
				case OPENOUTDELAY:
					mAlarmOutTimeTextView.setText(delay + second);
					mShelterInfoChannel.stuEventHandler.nAlarmOutLatch = delay;
					break;
			}
		}
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

	@Override
	protected void onDestroy() {

		clear();
		super.onDestroy();
	}



	@Override
	protected void onPause() {
		synchronized (mStateFlg) {
			mState = ActivityState.Pause;
		}
		super.onPause();
	}

	@Override
	protected void onResume() {
		synchronized (mStateFlg) {
			mState = ActivityState.Resume;
			if(mDisconnect)
			{
				BlindDetectConfigActivity.this.showMyDialog(R.string.dev_state_disconnected,true);
			}
		}
		super.onResume();
	}

	/**
	 * 初始化UI控件
	 */
	private void initUIView() {
		TextView titleText = (TextView)findViewById(R.id.title_center);
		titleText.setText(R.string.remote_type_video_detect_blind);

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
				mProgressDialog = ProgressDialog.show(BlindDetectConfigActivity.this,
						BlindDetectConfigActivity.this.getString(R.string.common_msg_wait), BlindDetectConfigActivity.this.getString(R.string.common_msg_save_cfg));
				mProgressDialog.setCancelable(false);
				new Thread(new Runnable() {

					@Override
					public void run() {
						//保存配置信息
						mShelterInfoChannel.bEnable = mBlindEnableBtn.isSelected();
						mShelterInfoChannel.stuEventHandler.bRecordEnable = mRecordEnableBtn.isSelected();
						mShelterInfoChannel.stuEventHandler.bAlarmOutEn = mAlarmOutEnableBtn.isSelected();
						mShelterInfoChannel.stuEventHandler.bSnapshotEn = mSnaptBtn.isSelected();
//						AV_IN_NewConfigEx inParam = new AV_IN_NewConfigEx();
//						AV_OUT_NewConfigEx outParam = new AV_OUT_NewConfigEx();
//						inParam.strCfgName = Afkinc.METHOD_BLINDETECT;
//						inParam.nChannelID = mCurrentChannelId;
//						inParam.setBuffer = mBlindDetect;
//						boolean nRet = AVNetSDK.AV_SetNewDeviceConfigEx(mDevice, inParam, outParam);
						boolean nRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOBLIND, mShelterInfoChannel, TestNetSDKActivity.m_loginHandle, mCurrentChannelId, 4096);
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
				intent.setClass(BlindDetectConfigActivity.this, ChannelChooseActivity.class);
				startActivityForResult(intent, ChannelChooseActivity.CHANNEL_NUM);
				overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
			}
		});

		mChannelNumTextView = (TextView) findViewById(R.id.channel_choose_text);

		//遮挡检测使能开关
		mBlindEnableLayout = (RelativeLayout) findViewById(R.id.blind_enable_layout);
		mBlindEnableBtn = (ImageView) findViewById(R.id.enable_btn);
		mBlindEnableLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mBlindEnableBtn.isSelected())
				{
					mBlindEnableBtn.setSelected(false);
					mShelterInfoChannel.bEnable = false;
				}
				else
				{
					mBlindEnableBtn.setSelected(true);
					mShelterInfoChannel.bEnable = true;
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

		//录像
		mRecordEnableBtn = (ImageView) findViewById(R.id.record_enable_btn);
		findViewById(R.id.record_layout).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mRecordEnableBtn.isSelected())
				{
					mRecordEnableBtn.setSelected(false);
					mShelterInfoChannel.stuEventHandler.bRecordEnable = false;
				}
				else
				{
					mRecordEnableBtn.setSelected(true);
					mShelterInfoChannel.stuEventHandler.bRecordEnable = true;
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
					if (((0x01 << y) & mShelterInfoChannel.stuEventHandler.dwRecordMask[x]) != 0) {
						chnAll[chnCount] = i;
						chnCount++;
					}
				}

				int[] chnRec = new int[chnCount];
				System.arraycopy(chnAll, 0, chnRec, 0, chnCount);

				Intent intent = new Intent();
				intent.putExtra("usefulChannel", chnRec);
				intent.putExtra("channelNames", mChannelNames);
				intent.setClass(BlindDetectConfigActivity.this, ChannelChooseActivity.class);
				startActivityForResult(intent, RECORD_CHANNEL);
				overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
			}
		});
		mRecordChannelTextView = (TextView) findViewById(R.id.record_channel_text);
		mRecordTimeLayout = (RelativeLayout) findViewById(R.id.record_time_layout);
		mRecordTimeLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int delay = mShelterInfoChannel.stuEventHandler.nRecordLatch;
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
					mShelterInfoChannel.stuEventHandler.bAlarmOutEn = false;
				}
				else
				{
					mAlarmOutEnableBtn.setSelected(true);
					mShelterInfoChannel.stuEventHandler.bAlarmOutEn = true;
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
					if (((0x01 << y) & mShelterInfoChannel.stuEventHandler.dwAlarmOutMask[x]) != 0) {
						chnAll[chnCount] = i;
						chnCount++;
					}
				}

				int[] chnRec = new int[chnCount];
				System.arraycopy(chnAll, 0, chnRec, 0, chnCount);

				Intent intent = new Intent();
				intent.putExtra("usefulChannel", chnRec);
				intent.putExtra("channelNames", mAlarmOutChannelNames);
				intent.setClass(BlindDetectConfigActivity.this, ChannelChooseActivity.class);
				startActivityForResult(intent, ALARMOUT_CHANNEL);
				overridePendingTransition(R.anim.activity_right,R.anim.activity_left);
			}
		});
		mAlarmOutChannelTextView = (TextView) findViewById(R.id.alarmout_channel_text);
		mAlarmOutTimeLayout = (RelativeLayout) findViewById(R.id.alarmout_time_layout);
		mAlarmOutTimeLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int delay = mShelterInfoChannel.stuEventHandler.nAlarmOutLatch;
				openDelayActivity(OPENOUTDELAY, delay, 1, 300,getString(R.string.remote_delay));
			}
		});
		mAlarmOutTimeTextView = (TextView) findViewById(R.id.alarmout_time_text);

		//抓图
		mSnaptBtn = (ImageView) findViewById(R.id.snapt_enable);
		findViewById(R.id.snapt_layout).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mSnaptBtn.isSelected())
				{
					mSnaptBtn.setSelected(false);
					mShelterInfoChannel.stuEventHandler.bSnapshotEn = false;
				}
				else
				{
					mSnaptBtn.setSelected(true);
					mShelterInfoChannel.stuEventHandler.bSnapshotEn = true;
				}

			}
		});
	}

	/**
	 * 初始化数据
	 */
	private void initData() {

//		if(mLocalDevice == null)
//		{
//			showMyDialog(R.string.common_msg_connect_timeout,true);
//			return;
//		}
//		//登录设备
//		mDevice = TeleConfigListActivity.DEVICE;
//		if(mDevice == null)
//		{
//			return;
//		}
//		//获取通道名称
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
		//******************获取补光灯配置信息***************//
		if (!getBlindDtetctInfo(mCurrentChannelId))
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
			String s = BlindDetectConfigActivity.this.getString(R.string.remote_chn_num);
			String channelName = s + " " +String.format("%02d", i+1);
			mAlarmOutChannelNames[i] = channelName;
		}
	}

	/**
	 * 更新UI控件信息
	 */
	private void refrashUI() {
		if (mShelterInfoChannel.bEnable)
		{
			mBlindEnableBtn.setSelected(true);
		}
		else
		{
			mBlindEnableBtn.setSelected(false);
		}

		int chnId[] = new int[FinalVar.MAX_CHANNEL_COUNT];
		int x = mCurrentChannelId / 32;
		int y = mCurrentChannelId % 32;
		chnId[x] |= (0x01 << y);
		mChannelNumTextView.setText(getChosedChannelNames(chnId, mChannelNames));

//		EventHandler eventHandler = mBlindDetectOption.eventHandler;
		CFG_ALARM_MSG_HANDLE stuEventHandler = mShelterInfoChannel.stuEventHandler;

		String second = getString(R.string.remote_second);

		//录像
		mRecordEnableBtn.setSelected(stuEventHandler.bRecordEnable);
		mRecordChannelTextView.setText(getChosedChannelNames(stuEventHandler.dwRecordMask,mChannelNames));
		mRecordTimTextView.setText(String.valueOf(stuEventHandler.nRecordLatch) + second);
		//报警输出
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
			mAlarmOutChannelTextView.setText(getChosedChannelNames(stuEventHandler.dwAlarmOutMask,mAlarmOutChannelNames));
			mAlarmOutTimeTextView.setText(String.valueOf(stuEventHandler.nAlarmOutLatch) + second);
		}
		//抓图
		mSnaptBtn.setSelected(stuEventHandler.bSnapshotEn);

		if (mChannelSize == 1)
		{
			mChannelNumLayout.setVisibility(View.GONE);
			mBlindEnableLayout.setBackgroundResource(R.drawable.preference_single_item);
			mRecordChannelLayout.setVisibility(View.GONE);
			mRecordTimeLayout.setBackgroundResource(R.drawable.preference_last_item);
			mAlarmOutTimeLayout.setBackgroundResource(R.drawable.preference_last_item);
			mAlarmOutChannelLayout.setVisibility(View.GONE);

		}
	}

	/**
	 * 获取遮挡配置
	 * @return
	 */
	private boolean getBlindDtetctInfo(int channelId) {
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
//		inParam.strCfgName = Afkinc.METHOD_BLINDETECT;
//		inParam.nChannelID = channelId;
//		AV_OUT_NewConfigEx outParam = new AV_OUT_NewConfigEx();
//		boolean nRet = AVNetSDK.AV_GetNewDeviceConfigEx(mDevice, inParam, outParam);
		CFG_SHELTER_INFO stShelterInfo = new CFG_SHELTER_INFO();
		boolean nRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOBLIND, stShelterInfo, TestNetSDKActivity.m_loginHandle, channelId, 4096);
		if (nRet)
		{
//			mBlindDetect = (BlindDetect) outParam.retBuffer;
//			if (mBlindDetect == null || mBlindDetect.tables == null || mBlindDetect.tables.length == 0)
//			{
//				mBlindDetect = null;
//				showMyDialog(mHelper.getMsg(CManager.instance().getLastError()),mIsFirst);
//				return false;
//			}
//			mBlindDetectOption = mBlindDetect.tables[0];
			mShelterInfoChannel = stShelterInfo;
			mIsFirst = false;
			return true;
		}
		else
		{
			showMyDialog(R.string.common_msg_get_cfg_failed,mIsFirst);
			return false;
		}
	}

	/**
	 * 获取选中通道的通道名
	 * @param channelNums
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
	 * 跳转到布撤防时间段界面
	 */
	private void openDetectActivity()
	{
		ArrayList<String> timeList = new ArrayList<String>();
//		TimeSection stuTimeSect[][] = mBlindDetect.tables[0].eventHandler.stuTimeSect;
		TimeSection stuTimeSect[][] = new TimeSection[TimeSection.DAYS_OF_WEEK][TimeSection.MAX_COUNT_OF_TS];
		CFG_TIME_SECTION stuNetSDKTime[][] = mShelterInfoChannel.stuTimeSection;
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
				if(BlindDetectConfigActivity.this.isFinishing())
				{
					return;
				}
				try
				{
					new AlertDialog.Builder(BlindDetectConfigActivity.this)
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

	private void exit()
	{
		clear();
		BlindDetectConfigActivity.this.finish();
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

//	private void unRegister()
//	{
//		if(mBroadcast != null)
//		{
//			BlindDetectConfigActivity.this.unregisterReceiver(mBroadcast);
//			mBroadcast = null;
//		}
//	}

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
//						BlindDetectConfigActivity.this.showMyDialog(R.string.dev_state_disconnected,true);
//					}
//				}
//				BlindDetectConfigActivity.this.showMyDialog(R.string.dev_state_disconnected,true);
//				unRegister();
//			}
//
//		}
//
//	}
}
