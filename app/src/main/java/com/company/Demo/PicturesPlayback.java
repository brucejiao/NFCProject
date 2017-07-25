package com.company.Demo;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import com.company.NetSDK.CB_fDataCallBack;
import com.company.NetSDK.CB_fDownLoadPosCallBack;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_RECORDFILE_INFO;
import com.company.NetSDK.NET_TIME;
import com.nfcproject.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class PicturesPlayback extends Activity {
	Resources res;
	
	Button m_btPlayPic;
	
	TextView m_vBeginTime;
	Button m_btSetBeginTime;
	
	TextView m_tvBeginHMS;
	Button m_btBeginHMS;
	
	TextView m_vEndTime;
	Button m_btSetEndTime;
	
	TextView m_tvEndHMS;
	Button m_btEndHMS;
	
	private Bitmap mCurrentBitmap;
	private ImageView mSourceView;
	private View mParent;
	
	static long lRealHandle = 0;
	private static final int	BLACK			 = Color.rgb(0, 0, 0);						//��Ƶ��ɫ����
	
    Calendar dateAndTime = Calendar.getInstance(Locale.CHINA);
    DateFormat fmtDateAndTime = DateFormat.getDateTimeInstance();
    
    DatePickerDialog.OnDateSetListener begin = new DatePickerDialog.OnDateSetListener()
        {
			@Override
			public void onDateSet(DatePicker arg0, int year, int monthOfYear, int dayOfMonth) {
				m_vBeginTime.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
			}   
        };
    DatePickerDialog.OnDateSetListener end = new DatePickerDialog.OnDateSetListener()
        {
	    	@Override
			public void onDateSet(DatePicker arg0, int year, int monthOfYear, int dayOfMonth) {
				m_vEndTime.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
			}
        };
	
	public class TestDownLoadPosCallBack implements CB_fDownLoadPosCallBack {
		@Override
		public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize) {
			if (-1 == dwDownLoadSize) {
				new Thread(new StopDownloadFile(lPlayHandle)).start();
			}
		}
	}
	
	public class TestDataCallBack implements CB_fDataCallBack {
		@Override
		public int invoke(long lRealHandle, int dwDataType, byte[] buffer,
				int dwBufferSize) {
		//	m_PlayView.drawColor(buffer);
			return 0;
		}
	}
	
	public class StopDownloadFile implements Runnable {
		public StopDownloadFile(long handle) {
			lDownloadHandle = handle;
		}
		
		@Override
		public void run() {
			if (0 != lDownloadHandle) {
				INetSDK.StopDownload(lDownloadHandle);
				if (jDownLoad == lDownloadHandle) {
					jDownLoad = 0;
				}
			}
		}
		
		private long lDownloadHandle;
	}
	
	public class PlayPics implements Runnable {
		public PlayPics(long handle) {
			lFind = handle;
		}
		
		@Override
		public void run() {
			Looper.prepare();
			bThWork = true;
			if (0 != lFind) {
				boolean bHasPics = false;
				String filePath = "/mnt/sdcard/NetSDK/";
				TestDownLoadPosCallBack cbUser = new TestDownLoadPosCallBack();
				while (bThWork) {
					NET_RECORDFILE_INFO stuPic = new NET_RECORDFILE_INFO();
					int nRet = INetSDK.FindNextFile(lFind, stuPic);
					if (-1 == nRet) {
						ToolKits.showErrorMessage(PicturesPlayback.this, "FindNextFile " + res.getString(R.string.info_failed));
					} else if (0 == nRet) {
						if (!bHasPics) {
							ToolKits.showMessage(PicturesPlayback.this, res.getString(R.string.play_back_by_pic_info_no_pic));
						} else {
							ToolKits.writeLog("FindNextFile, show end");
						}
						break;
					} else {
						bHasPics = true;
						
			        	// download
						String fileName = String.format("%04d%02d%02d%02d%02d%02d.jpg", 
								stuPic.starttime.dwYear, stuPic.starttime.dwMonth, stuPic.starttime.dwDay, 
								stuPic.starttime.dwHour, stuPic.starttime.dwMinute, stuPic.starttime.dwSecond);
						
						LiveActivity.createFile(filePath, fileName);
						if (0 != jDownLoad) {
							INetSDK.StopDownload(jDownLoad);
						}
						jDownLoad = INetSDK.DownloadByRecordFile(TestNetSDKActivity.m_loginHandle, stuPic, filePath + fileName, cbUser);
						if (0 == jDownLoad) {
							ToolKits.writeErrorLog("Download pictures failed");
							continue;
						}
						
						// show
						try {
							Thread.sleep(2000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						
			        	mCurrentBitmap = createBitmap(filePath + fileName);
						if (null != mCurrentBitmap) {
							curActivity.runOnUiThread(new Runnable() {
								@Override
				                public void run() {
									if (!mCurrentBitmap.isRecycled())
					                {
										mParent.invalidate();
					                    mSourceView.setImageBitmap(mCurrentBitmap);
					                }
									mSourceView.setBackgroundColor(BLACK);
					                mSourceView.setAdjustViewBounds(true);
				                }
				            });
						}
					}
				}
				INetSDK.FindClose(lFind);
			}
			bThWork = false;
			Looper.loop();
		}
		
		private long lFind;
	}
	
	private void playByPictures() {
		NET_TIME stTimeStart = new NET_TIME();
		NET_TIME stTimeEnd = new NET_TIME();
		getPlaybackTime(stTimeStart, stTimeEnd);
		
		boolean bTime = false;
		int nWaitTime = 10000;
		
		/*for (int i = 0; i < MAX_FILE_NUM; i++) {
			stFileInfo[i] = new NET_RECORDFILE_INFO();
		}
		Integer nFileCount = new Integer(0);
		boolean zRet = INetSDK.QueryRecordFile(TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 9, stTimeStart, stTimeEnd, null, stFileInfo, nFileCount, nWaitTime, bTime);
		if (zRet) {
			if (nFileCount.intValue() > 0) {
				nMaxCountPic = nFileCount.intValue();
				nCurPicIndex = 0;
				mTimer = new Timer();
		        mTimerTask = new PlayPictureTask();
		        mTimer.scheduleAtFixedRate(mTimerTask, 0, 3000);
			} else {
				ToolKits.showMessage(this, res.getString(R.string.play_back_by_pic_info_no_pic));
			}
		} else {
			ToolKits.showErrorMessage(this, "QueryRecordFile " + res.getString(R.string.info_failed));
		}*/
		
		long lFind = INetSDK.FindFile(TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 9, null, stTimeStart, stTimeEnd, bTime, nWaitTime);
		if (0 != lFind) {
			thDlPl = new Thread(new PlayPics(lFind));
			thDlPl.start();
		} else {
			ToolKits.showErrorMessage(this, "FindFile " + res.getString(R.string.info_failed));
		}
	}
	
	private Bitmap createBitmap(String fileName)
    {
        Bitmap nBitmap = null;
        if (fileName == null)
        {
            return nBitmap;
        }
        try
        {
        	BitmapFactory.Options options = new BitmapFactory.Options();
        	options.inJustDecodeBounds = true;
            nBitmap = BitmapFactory.decodeFile(fileName,options);
            if((options.outWidth == -1) || (options.outHeight == -1))
            {
            	return null;
            }
            
            if (options.outWidth * options.outHeight > 10 * 1024 *1024)
			{
				return null;
			}
            
            options.inJustDecodeBounds = false;
            nBitmap = BitmapFactory.decodeFile(fileName,options);
        }
        catch (OutOfMemoryError e)
        {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            nBitmap = BitmapFactory.decodeFile(fileName, options);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return nBitmap;
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
        setContentView(R.layout.picturesplayback);
        
        // һ�㲻��Ҫ���������ż�����ֹ� ���������̨�ϳ�ʱ�䣬�޷��ҵ�native���������
  		INetSDK.LoadLibrarys();
  		
        res = this.getResources();
        curActivity = this;
        
        mSourceView = (ImageView)findViewById(R.id.iv_PlayWindow);
        mParent = findViewById(R.id.parent);
        
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-d");
        
        m_vBeginTime = (TextView)findViewById(R.id.begintime_value);
		m_vBeginTime.setText(df.format(dateAndTime.getTime()));
        
		m_vEndTime = (TextView)findViewById(R.id.endtime_value);
		m_vEndTime.setText(df.format(dateAndTime.getTime()));
        
        m_btPlayPic = (Button)findViewById(R.id.bt_play_pic);
        m_btPlayPic.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View arg0) {
        		if (bThWork) {
        			bThWork = false;
        			try {
        				Thread.sleep(5000);
        			} catch (Exception e) {
        				e.printStackTrace();
        			}
        		}
        		playByPictures();
        	}
        });
        
        m_btSetBeginTime = (Button)findViewById(R.id.set_begin_time_btn);
        m_btSetBeginTime.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View arg0) 
			{
				new DatePickerDialog(PicturesPlayback.this, begin, 
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
        		new TimePickerDialog(PicturesPlayback.this, new TimePickerDialog.OnTimeSetListener() {
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
				new DatePickerDialog(PicturesPlayback.this, end,
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
        		new TimePickerDialog(PicturesPlayback.this, new TimePickerDialog.OnTimeSetListener() {
					@Override
					public void onTimeSet(TimePicker arg0, int arg1, int arg2) {
						// TODO Auto-generated method stub
						m_tvEndHMS.setText(arg1 + ":" + arg2 + ":" + "00");
					}
				}, dateAndTime.get(Calendar.HOUR_OF_DAY), dateAndTime.get(Calendar.MINUTE), true).show();
        	}
        });
    }

	@Override
	protected void onDestroy() 
	{
		super.onDestroy();
		if (null != mTimer) {
			mTimer.cancel();
			mTimer = null;
		}
		
		if (bThWork) {
			bThWork = false;
		}
	}
	
	private class PlayPictureTask extends TimerTask {
        @Override
        public void run(){
        	if (nCurPicIndex >= nMaxCountPic) {
        		return;
        	}
        	
        	String filePath = "/mnt/sdcard/NetSDK/";
        	
        	// download
			String fileName = String.format("%04d%02d%02d%02d%02d%02d.jpg", 
					stFileInfo[nCurPicIndex].starttime.dwYear, stFileInfo[nCurPicIndex].starttime.dwMonth, stFileInfo[nCurPicIndex].starttime.dwDay, 
					stFileInfo[nCurPicIndex].starttime.dwHour, stFileInfo[nCurPicIndex].starttime.dwMinute, stFileInfo[nCurPicIndex].starttime.dwSecond);
			
			LiveActivity.createFile(filePath, fileName);
			TestDownLoadPosCallBack cbUser = new TestDownLoadPosCallBack();
			if (0 != jDownLoad) {
				INetSDK.StopDownload(jDownLoad);
			}
			jDownLoad = INetSDK.DownloadByRecordFile(TestNetSDKActivity.m_loginHandle, stFileInfo[nCurPicIndex], filePath + fileName, cbUser);
			if (0 == jDownLoad) {
				ToolKits.writeErrorLog("Download pictures failed");
    			nCurPicIndex++;
				return;
			}
			
			// show
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
        	mCurrentBitmap = createBitmap(filePath + fileName);
			if (null != mCurrentBitmap) {
				curActivity.runOnUiThread(new Runnable() {
					@Override
	                public void run() {
						if (!mCurrentBitmap.isRecycled())
		                {
							mParent.invalidate();
		                    mSourceView.setImageBitmap(mCurrentBitmap);
		                }
						mSourceView.setBackgroundColor(BLACK);
		                mSourceView.setAdjustViewBounds(true);
	                }
	            });
			}
			
			nCurPicIndex++;
        }
    }
	
	private Activity curActivity;
	private Timer mTimer;
	private PlayPictureTask mTimerTask;
	private int nCurPicIndex = 0;
	private int nMaxCountPic = 0;
	private static final int MAX_FILE_NUM = 100;
	private NET_RECORDFILE_INFO stFileInfo[] = new NET_RECORDFILE_INFO[MAX_FILE_NUM];
	private Thread thDlPl = null;
	private boolean bThWork = false;
	long jDownLoad = 0;
}
