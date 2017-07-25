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

import java.util.ArrayList;

//import com.mm.android.avnetsdk.protocolstack.entity.config.TimeSection;

public class WeekdayChooseActivity extends ListActivity{
	public final static int					SINGLE 			= 1;							//单选
	public final static int					MORE			= 2;							//多选
	public final static int					COPY			= 3;							//复制信息
	private int								mType;											//类型：多选/单选
	private int								mSrcIndex;										//复制信息时的原始日期
	private String[]						mDayStrings;									//一周的字符串
	private ArrayList<Integer>				mUsefulDays 	= new ArrayList<Integer>();		//一周中使能的天 从周日开始到周六依次为：0、1、2、....6
	private TreeViewAdapter					mAdapter;										//列表适配器

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listtree);
		initData();
		getViewElement();
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
		WeekdayChooseActivity.this.finish();
		overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
	}


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		ImageView icon = (ImageView) v.findViewById(R.id.device_arrow);
		IconClick(icon,position);
	}


	/**
	 * 初始化数据
	 */
	private void initData() {
		mType = getIntent().getIntExtra("type", SINGLE);
		if (mType == SINGLE)
		{
			mDayStrings = getResources().getStringArray(R.array.week);
			mUsefulDays = getIntent().getIntegerArrayListExtra("usefulDays");
		}
		else if (mType == MORE)
		{
			mDayStrings = getResources().getStringArray(R.array.week_all);
			mUsefulDays = getIntent().getIntegerArrayListExtra("usefulDays");
		}
		else if (mType == COPY)
		{
			mSrcIndex = getIntent().getIntExtra("index", 0);
			mDayStrings = getResources().getStringArray(R.array.week_all);
			mUsefulDays.add(mSrcIndex);
		}
	}

	/**
	 * 填充UI控件
	 */
	private void getViewElement() {
		ImageView title_left = (ImageView)findViewById(R.id.title_left_image);
		title_left.setBackgroundResource(R.drawable.title_btn_back);
		title_left.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				exit();

			}
		});

		TextView title_center = (TextView)findViewById(R.id.title_center);
		title_center.setText(R.string.common_title_date);

		ImageView title_right = (ImageView) findViewById(R.id.title_right_image);
		title_right.setVisibility(View.VISIBLE);
		title_right.setBackgroundResource(R.drawable.title_save_btn);
		if (mType == SINGLE)
		{
			title_right.setVisibility(View.INVISIBLE);
		}
		title_right.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putIntegerArrayListExtra("usefulDays", mUsefulDays);
				setResult(RESULT_OK,intent);
				WeekdayChooseActivity.this.finish();
				overridePendingTransition(R.anim.activity_right_back,R.anim.activity_left_back);
			}
		});
		mAdapter = new TreeViewAdapter(WeekdayChooseActivity.this);
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
			return mDayStrings == null?0:mDayStrings.length;
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
			holder.deviceIcon.setVisibility(View.GONE);
			holder.deviceName.setText(mDayStrings[position]);

			if (mType == SINGLE)
			{										//单选情况下
				if(mUsefulDays.contains(position))
				{
					holder.checkIcon.setTag("on");
					holder.checkIcon.setImageResource(R.drawable.cameralist_select_h);
				}
				else
				{
					holder.checkIcon.setTag("off");
					holder.checkIcon.setImageResource(R.drawable.cameralist_select);
				}
			}
			else
			{
				if (position != 0)					//非全周按钮
				{
					if(mUsefulDays.contains(position - 1))
					{
						holder.checkIcon.setTag("on");
						holder.checkIcon.setImageResource(R.drawable.cameralist_select_h);
					}
					else
					{
						holder.checkIcon.setTag("off");
						holder.checkIcon.setImageResource(R.drawable.cameralist_select);
					}
				}
				else								//全周按钮
				{
					if (mUsefulDays.size() == TimeSection.DAYS_OF_WEEK)
					{
						holder.checkIcon.setTag("on");
						holder.checkIcon.setImageResource(R.drawable.cameralist_select_h);
					}
					else
					{
						holder.checkIcon.setTag("off");
						holder.checkIcon.setImageResource(R.drawable.cameralist_select);
					}
				}
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
			ImageView 	deviceIcon;
			TextView  	deviceName;
			ImageView  	checkIcon;
		}

	}


	/**
	 * 勾选框点击事件
	 * @param view
	 * @param position
	 */
	private void IconClick(ImageView view,int position)
	{
		if (mType == SINGLE)									//单选情况下
		{
			if(view.getTag().equals("on"))
			{
				return;
			}
			else
			{
				mUsefulDays.clear();
				mUsefulDays.add(position);
				mAdapter.notifyDataSetChanged();
				Intent intent = new Intent();
				intent.putExtra("channelNum", position);
				setResult(RESULT_OK, intent);
				WeekdayChooseActivity.this.finish();
			}
		}
		else
		{													//多选和复制情况下
			if (position == 0)								//点击的是全选按钮
			{
				if (view.getTag().equals("on"))
				{
					mUsefulDays.clear();
					if (mType == COPY)
					{
						mUsefulDays.add(mSrcIndex);			//原始的日期不改变
					}
				}
				else
				{
					for (int i = 0; i < TimeSection.DAYS_OF_WEEK; i++)
					{
						if (!mUsefulDays.contains(i))
						{
							mUsefulDays.add(i);
						}
					}
				}
			}
			else											//点击的是周日到周六的按钮
			{
				if(view.getTag().equals("on"))
				{
					if (mType == COPY)						//原始的日期不改变
					{
						if (mSrcIndex == position - 1)
						{
							return;
						}
						mUsefulDays.remove((Object)(position - 1));
					}
					else
					{
						mUsefulDays.remove((Object)(position - 1));
					}
				}
				else
				{
					if (!mUsefulDays.contains(position - 1))
					{
						mUsefulDays.add(position - 1);
					}
				}
			}
			mAdapter.notifyDataSetChanged();
		}
	}
}
