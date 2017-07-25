package com.company.Demo;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.company.NetSDK.INetSDK;
import com.company.NetSDK.SDK_MULTIPLAY_EN;
import com.company.NetSDK.SDK_SYS_ABILITY;
import com.nfcproject.R;
import com.nfcproject.page.LKHomeActivity;

import java.util.ArrayList;
import java.util.List;

import application.Application;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ContentListActivity extends Activity/*ListActivity */
{
	@Bind(R.id.void_list)
	ListView mVideoList;
	@Bind(R.id.back)
	LinearLayout mBack;
	private List<String> arrayData;
	Resources res;

	private int nExtraChnNum;
	private int nExtraAlarmOutPortNum;

	public void showLog(String strLog)
	{
		Toast.makeText(this, strLog, Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_net_list);
		ButterKnife.bind(this);
		Application.getInstance().addActivity(this);
		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		nExtraChnNum = getIntent().getIntExtra("name_nExtraChnNum", 0);
		nExtraAlarmOutPortNum = getIntent().getIntExtra("name_nExtraAlarmOutPortNum", 0);

		res = this.getResources();
		arrayData = getData();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayData);
//		setListAdapter(adapter);
		mVideoList.setAdapter(adapter);
		checkedItem();
	}

	private List<String> getData() {
		List<String> data = new ArrayList<String>();
		data.add(res.getString(R.string.GlobalSetting));
		data.add(res.getString(R.string.MultiPlay));
		data.add(res.getString(R.string.RealPlay));
//		data.add(res.getString(R.string.FilePlayBack));
//		data.add(res.getString(R.string.TimePlayBack));
//		data.add(res.getString(R.string.PicPlayBack));
//		data.add(res.getString(R.string.Talk));
//		data.add(res.getString(R.string.Alarm));
//		data.add(res.getString(R.string.UserMan));
//		data.add(res.getString(R.string.DiskInfo));
//		data.add(res.getString(R.string.RecordPlan));
//		data.add(res.getString(R.string.MotionDetect));
//		data.add(res.getString(R.string.ShelterDetect));
//		data.add(res.getString(R.string.intelbrass));
//		data.add(res.getString(R.string.TestInterface));

		return data;
	}

	@Override
	protected void onDestroy()
	{
		boolean bResult = INetSDK.Logout(TestNetSDKActivity.m_loginHandle);

		if ( bResult == true )
		{
			TestNetSDKActivity.m_loginHandle = 0;
		}

		super.onDestroy();
	}

	public void jumpToGlobalSettingActivity() {
		Intent intent = new Intent();
		intent.putExtra("name_nExtraChnNum", nExtraChnNum);
		intent.putExtra("name_nExtraAlarmOutPortNum", nExtraAlarmOutPortNum);
		intent.setClass(this, GlobalSettingActivity.class);
		startActivityForResult(intent, 0);
	}

	public void jumpToMultiPlayActivity() {
		SDK_MULTIPLAY_EN stuMpEn = new SDK_MULTIPLAY_EN();
		boolean bQuery = INetSDK.QuerySystemInfo(TestNetSDKActivity.m_loginHandle, SDK_SYS_ABILITY.ABILITY_MULTIPLAY, stuMpEn, 5000);
		if (bQuery) {
			if (stuMpEn.nEnable > 0) {
				Intent intent = new Intent();
				intent.putExtra("name_nExtraChnNum", nExtraChnNum);
				intent.putExtra("name_nExtraAlarmOutPortNum", nExtraAlarmOutPortNum);
				intent.setClass(this, MultiPlayActivity.class);
				startActivityForResult(intent, 1);
			} else {
				ToolKits.showMessage(this, res.getString(R.string.multi_play_activity_info));
			}
		} else {
			ToolKits.showErrorMessage(this, "QuerySystemInfo " + res.getString(R.string.info_failed));
		}
	}

	public void jumpToLiveActivity()
	{
		Intent intent = new Intent();
		intent.setClass(this, LiveActivity.class);
		startActivityForResult(intent, 2);
	}

	public void jumpToRecordListActivity()
	{
		Intent intent = new Intent();
		intent.setClass(this, RecordListActivity.class);
		startActivityForResult(intent, 3);
	}

	public void jumpToTimePlaybackActivity()
	{
		Intent intent = new Intent();
		intent.setClass(this, TimePlayBackActivity.class);
		startActivityForResult(intent, 4);
	}

	public void jumpToPicturesPlayback()
	{
		Intent intent = new Intent();
		intent.setClass(this, PicturesPlayback.class);
		startActivityForResult(intent , 5);
	}

	public void jumpToTalkActivity()
	{
		Intent intent = new Intent();
		intent.setClass(this , TalkActivity.class);
		startActivityForResult(intent , 6);
	}

	public void jumpToAlarmActivity() {
		Intent intent = new Intent();
		intent.setClass(this, AlarmActivity.class);
		startActivityForResult(intent , 7);
	}

	public void jumpToUserMngActivity() {
		Intent intent = new Intent();
		intent.setClass(this, UserManagement.class);
		startActivityForResult(intent , 8);
	}

	public void jumpToDiskInfoActivity() {
		Intent intent = new Intent();
		intent.setClass(this, DiskInfoActivity.class);
		startActivityForResult(intent , 9);
	}

	public void jumpToRecordPlanActivity() {
		Intent intent = new Intent();
		intent.putExtra("name_nExtraChnNum", nExtraChnNum);
		intent.putExtra("name_nExtraAlarmOutPortNum", nExtraAlarmOutPortNum);
		intent.setClass(this, RecordPlanConfig.class);
		startActivityForResult(intent , 10);
	}

	public void jumpToMotionDetectActivity() {
		Intent intent = new Intent();
		intent.putExtra("name_nExtraChnNum", nExtraChnNum);
		intent.putExtra("name_nExtraAlarmOutPortNum", nExtraAlarmOutPortNum);
		intent.setClass(this, MotionDetectConfigActivity.class);
		startActivityForResult(intent , 11);
	}

	public void jumpToShelterDetectActivity() {
		Intent intent = new Intent();
		intent.putExtra("name_nExtraChnNum", nExtraChnNum);
		intent.putExtra("name_nExtraAlarmOutPortNum", nExtraAlarmOutPortNum);
		intent.setClass(this, BlindDetectConfigActivity.class);
		startActivityForResult(intent , 12);
	}

	public void jumpToIntelBrassActivity() {
		Intent intent = new Intent();
		intent.setClass(this , IntelBrassActivity.class);
		startActivityForResult(intent , 13);
	}

	public void jumpToTestInterfaceActivity() {
		Intent intent = new Intent();
		intent.setClass(this , TestInterfaceActivity.class);
		startActivityForResult(intent , 14);
	}

//	@Override
//	protected void onListItemClick(ListView l, View v, int position, long id) {
//		if ( position == 0 ) {
//			jumpToGlobalSettingActivity();
//		} else if ( position == 1 ) {
//			jumpToMultiPlayActivity();
//		} else if ( position == 2 ) {
//			jumpToLiveActivity();
//		}
//		else if ( position == 3 ) {
//			jumpToRecordListActivity();
//		} else if ( position == 4 ) {
//			jumpToTimePlaybackActivity();
//		} else if (position == 5 ) {
//			jumpToPicturesPlayback();
//		} else if (position == 6 ) {
//			jumpToTalkActivity();
//		} else if (position == 7 ) {
//			jumpToAlarmActivity();
//		} else if( position == 8 ) {
//			jumpToUserMngActivity();
//		} else if( position == 9 ) {
//			jumpToDiskInfoActivity();
//		} else if( position == 10 ) {
//			jumpToRecordPlanActivity();
//		} else if( position == 11 ) {
//			jumpToMotionDetectActivity();
//		} else if( position == 12 ) {
//			jumpToShelterDetectActivity();
//		} else if( position == 13 ) {
//			jumpToIntelBrassActivity();
//		} else if( position == 14 ) {
//			jumpToTestInterfaceActivity();
//		}

//		super.onListItemClick(l, v, position, id);
//	}

	private void checkedItem(){
		mVideoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if ( position == 0 ) {
					jumpToGlobalSettingActivity();
				} else if ( position == 1 ) {
					jumpToMultiPlayActivity();
				} else if ( position == 2 ) {
					jumpToLiveActivity();
				}
//		else if ( position == 3 ) {
//			jumpToRecordListActivity();
//		} else if ( position == 4 ) {
//			jumpToTimePlaybackActivity();
//		} else if (position == 5 ) {
//			jumpToPicturesPlayback();
//		} else if (position == 6 ) {
//			jumpToTalkActivity();
//		} else if (position == 7 ) {
//			jumpToAlarmActivity();
//		} else if( position == 8 ) {
//			jumpToUserMngActivity();
//		} else if( position == 9 ) {
//			jumpToDiskInfoActivity();
//		} else if( position == 10 ) {
//			jumpToRecordPlanActivity();
//		} else if( position == 11 ) {
//			jumpToMotionDetectActivity();
//		} else if( position == 12 ) {
//			jumpToShelterDetectActivity();
//		} else if( position == 13 ) {
//			jumpToIntelBrassActivity();
//		} else if( position == 14 ) {
//			jumpToTestInterfaceActivity();
//		}
			}
		});
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if (keyCode == KeyEvent.KEYCODE_BACK )
		{
			Intent intent = new Intent(ContentListActivity.this, LKHomeActivity.class);
			startActivity(intent);
			Application.getInstance().exit();
		}

		return false;

	}

	@OnClick(R.id.back)
	public void setmBack(View view){
		Intent intent = new Intent(ContentListActivity.this, LKHomeActivity.class);
		startActivity(intent);
		Application.getInstance().exit();
	}
}