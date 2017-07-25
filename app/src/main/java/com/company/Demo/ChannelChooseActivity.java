package com.company.Demo;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.nfcproject.R;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ChannelChooseActivity extends ListActivity{
	public final static  int				CHANNEL_NUM         =	100;							//通道选择

	private int  					mType;															//多通道选择类型
	private String[]				mChannelNames;													//通道名数组
	private Map<Integer, Integer> 	mChosedChannelNum = new HashMap<Integer, Integer>();			//选中的通道号数组
	private TreeViewAdapter			mAdapter;														//设备列表适配器

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listtree);
		initData();
		getViewElement();
	}



	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		ImageView icon = (ImageView) v.findViewById(R.id.device_arrow);
		IconClick(icon,position);
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
		setResult(RESULT_CANCELED);
		ChannelChooseActivity.this.finish();
		overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
	}

	/**
	 * 初始化参数
	 */
	private void initData() {
		mType = getIntent().getIntExtra("type", 0);
		mChannelNames = getIntent().getStringArrayExtra("channelNames");
		int[] usefulChannels = getIntent().getIntArrayExtra("usefulChannel");
		for (int i = 0; i < usefulChannels.length; i++)
		{
			mChosedChannelNum.put(usefulChannels[i], usefulChannels[i]);
		}
	}

	/**
	 * 填充UI控件
	 */
	private void getViewElement() {
		ImageView title_left = (ImageView)findViewById(R.id.title_left_image);
		title_left.setBackgroundResource(R.drawable.title_btn_back);
		title_left.setVisibility(View.VISIBLE);
		title_left.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				exit();

			}
		});
		TextView title_center = (TextView)findViewById(R.id.title_center);
		title_center.setText(R.string.remote_chn_chose);

		ImageView title_right = (ImageView) findViewById(R.id.title_right_image);
		if (mType == CHANNEL_NUM)
		{
			title_right.setVisibility(View.INVISIBLE);
		}
		else
		{
			title_right.setVisibility(View.VISIBLE);
			title_right.setBackgroundResource(R.drawable.title_save_btn);
			title_right.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					int len = mChosedChannelNum.size();
					int[] chosedChannels = new int[len];
					Iterator<Entry<Integer, Integer>> it = mChosedChannelNum.entrySet().iterator();
					int i = 0;
					while (it.hasNext()) {
						Entry<Integer, Integer> entry = it.next();
						chosedChannels[i] = entry.getKey();
						i++;
					}
					Intent intent = new Intent();
					intent.putExtra("usefulChannel", chosedChannels);
					setResult(RESULT_OK, intent);
					ChannelChooseActivity.this.finish();
				}
			});
		}

		mAdapter = new TreeViewAdapter(ChannelChooseActivity.this);
		setListAdapter(mAdapter);
	}


	/**
	 * 列表适配器
	 * @author 16552
	 *
	 */
	private class TreeViewAdapter extends BaseAdapter
	{

		private LayoutInflater mInflater;

		public TreeViewAdapter(Context context) {
			mInflater = LayoutInflater.from(context);
		}

		@Override
		public int getCount() {
			return mChannelNames == null?0:mChannelNames.length;
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			ViewHolder holder;
			if(convertView == null)
			{
				convertView = mInflater.inflate(R.layout.device_item, null);
				holder = new ViewHolder();

				holder.deviceIcon = (ImageView)convertView.findViewById(R.id.device_icon);
				holder.deviceName = (TextView)convertView.findViewById(R.id.device_item_desc);
				holder.checkIcon = (ImageView)convertView.findViewById(R.id.device_arrow);

				convertView.setTag(holder);
			}
			else
			{
				holder = (ViewHolder)convertView.getTag();
			}
			holder.deviceIcon.setBackgroundResource(R.drawable.cameralist_camera1_select);
			holder.deviceName.setText(mChannelNames[position]);
			if(mChosedChannelNum.containsKey(position))
			{
				holder.checkIcon.setTag("on");
				holder.checkIcon.setImageResource(R.drawable.cameralist_select_h);
			}
			else
			{
				holder.checkIcon.setTag("off");
				holder.checkIcon.setImageResource(R.drawable.cameralist_select);
			}
			final int index = position;
			holder.checkIcon.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					IconClick((ImageView)v,index);

				}
			});
			return convertView;
		}

		class ViewHolder
		{
			TextView  deviceName;
			ImageView  checkIcon;
			ImageView deviceIcon;
		}

	}

	/**
	 * 勾选框点击事件
	 * @param view
	 * @param position
	 */
	private void IconClick(ImageView view,int position)
	{
		if(view.getTag().equals("on"))
		{
			if (mType == CHANNEL_NUM)				//通道选择，单选的，就不能点击取消了
			{
				return;
			}
			else
			{
				mChosedChannelNum.remove(position);
			}
		}
		else
		{
			if (mType == CHANNEL_NUM)				//通道选择，单选的，需要先清空再选择
			{
				mChosedChannelNum.clear();
				mChosedChannelNum.put(position, position);
			}
			else
			{
				mChosedChannelNum.put(position, position);
			}
		}

		if (mType == CHANNEL_NUM)
		{
			mAdapter.notifyDataSetChanged();
			Intent intent = new Intent();
			intent.putExtra("channelNum", position);
			setResult(RESULT_OK, intent);
			ChannelChooseActivity.this.finish();
			return;
		}
		mAdapter.notifyDataSetChanged();
	}
}
