package com.company.Demo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.nfcproject.R;

public class DetectAreaActivity extends Activity {
	private final static int	ROW18			= 18;						//P制行数
	private final static int	ROW15			= 15;						//N制行数
	private final static int	LINE			= 22;						//列数

	private long[]				mRetRegion;									//返回的区域数组
	private long[]				mRegion;									//显示在View上的区域数组
	private int					mRow;										//行数
	private int					mVideoStandard;								//视频制式 0:PAL 1:NTSC
	private int					mMotionWidth;								//区域控件宽
	private int					mMotionHeight;								//区域控件高

	private LinearLayout mParentLayout;								//区域控件的父窗口
	private MotionAreaView 		mAreaView;									//区域控件
	private ImageView mEditView;									//编辑按钮
	private ImageView 			mDeleteView;								//擦出按钮
	private ImageView 			mDragView;									//拖拽按钮
	private CustomScrollView 	mVScrollView;								//垂直ScrollView
	private CustomHScrollView 	mHScrollView;								//水平ScrollView

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detect_area);
		initData();
		initUIView();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK)
		{
			for (int i = 0; i < mRetRegion.length; i++)
			{
				if (i < mRow)
				{
					mRetRegion[i] = mAreaView.getAreas()[i];
				}
			}
			Intent intent = new Intent();
			intent.putExtra("region", mRetRegion);
			setResult(RESULT_OK, intent); //正常退出
			DetectAreaActivity.this.finish();
			overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		mVideoStandard = getIntent().getIntExtra("VideoStandard", 0);
		Display display = getWindowManager().getDefaultDisplay();
		int screenWidth = display.getWidth();
		if (mVideoStandard == 0)
		{
			mMotionWidth = screenWidth;
			mMotionHeight = ROW18 * screenWidth / LINE;
			mRow = ROW18;
		}
		else
		{
			mMotionWidth = screenWidth;
			mMotionHeight = ROW15 * screenWidth / LINE;
			mRow = ROW15;
		}
		mRetRegion = getIntent().getLongArrayExtra("region");
		mRegion = new long[mRow];
		for (int i = 0; i < mRow; i++)
		{
			mRegion[i] = mRetRegion[i];
		}
	}

	/**
	 * 初始化UI 控件
	 */
	private void initUIView() {
		TextView titleText = (TextView)findViewById(R.id.title_center);
		titleText.setText(R.string.remote_region);

		ImageView titleLeft = (ImageView)findViewById(R.id.title_left_image);
		titleLeft.setBackgroundResource(R.drawable.title_btn_back);
		titleLeft.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				for (int i = 0; i < mRetRegion.length; i++)
//				{
//					if (i < mRow)
//					{
//						[i];
//					}
//				}
				mRetRegion = mAreaView.getAreas();
				Intent intent = new Intent();
				intent.putExtra("region", mRetRegion);
				setResult(RESULT_OK, intent); //正常退出
				DetectAreaActivity.this.finish();
				overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
			}
		});

		mVScrollView = (CustomScrollView) findViewById(R.id.motion_vScroll);
		mHScrollView = (CustomHScrollView) findViewById(R.id.motion_hScroll);
		mVScrollView.setLayoutParams(new RelativeLayout.LayoutParams(mMotionWidth, mMotionHeight));
		mHScrollView.setLayoutParams(new FrameLayout.LayoutParams(mMotionWidth, mMotionHeight));

		mParentLayout = (LinearLayout) findViewById(R.id.motion_area_parent);
		mParentLayout.setLayoutParams(new FrameLayout.LayoutParams(mMotionWidth, mMotionHeight));

		mAreaView = (MotionAreaView) findViewById(R.id.motion_areaView);
		mAreaView.setLayoutParams(new LinearLayout.LayoutParams(mMotionWidth, mMotionHeight));
		mAreaView.setScrollView(mVScrollView, mHScrollView);
		mAreaView.setRowAndCol(mRow, LINE);
		mAreaView.setAreas(mRegion);
		mEditView = (ImageView) findViewById(R.id.motion_edit);
		mEditView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mAreaView.setMode(MotionAreaView.EDIT);
				mDeleteView.setSelected(false);
				mEditView.setSelected(true);
				mDragView.setSelected(false);
				mVScrollView.setScrollEnable(false);
				mHScrollView.setScrollEnable(false);
			}
		});

		mDeleteView = (ImageView) findViewById(R.id.motion_delete);
		mDeleteView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mAreaView.setMode(MotionAreaView.DELETE);
				mDeleteView.setSelected(true);
				mEditView.setSelected(false);
				mDragView.setSelected(false);
				mVScrollView.setScrollEnable(false);
				mHScrollView.setScrollEnable(false);
			}
		});

		mDragView = (ImageView) findViewById(R.id.motion_drag);
		mDragView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mAreaView.setMode(MotionAreaView.DRAG);
				mDeleteView.setSelected(false);
				mEditView.setSelected(false);
				mDragView.setSelected(true);
				mVScrollView.setScrollEnable(true);
				mHScrollView.setScrollEnable(true);
			}
		});
	}
}
