package com.company.Demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

class Time
{
	int hour;
	int mintue;
	int second;
	
	public Time(int hour,int mintue,int second)
	{
		this.hour 	= hour;
		this.mintue = mintue;
		this.second = second;
	}
	
	public long getSeconds()
	{
		return hour*3600 + mintue * 60 + second;
	}
}

class SetTime
{
	Time startTime;
	Time endTime;
	
	public SetTime(Time startTime,Time endTime)
	{
		this.startTime 	 = startTime;
		this.endTime	 = endTime;
	}
}

public class DetectView extends View {

	private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";
	private static final int	SECONDS = 24 * 3600;
	
	private int			mUnChooseColor  = Color.rgb(225, 222, 214);
	private int			mChooseColor	= Color.rgb(241, 171, 101);
	private int 		mLineColor1 	= Color.rgb(177, 177, 148);
	private int 		mLineColor2 	= Color.rgb(255, 255, 255);
	private int	 		mDateFontColor 	= Color.rgb(255, 255, 255);
	private int			mDateBackColor  = Color.rgb(105, 105, 97);
	private int	 		mTimeFontColor 	= Color.rgb(82, 82, 70);
	private int			mTimeBackColor  = Color.rgb(169, 168, 158);
	private int			mAlpha			= 220;
	private int			mInterval  		= 2;		//ʱ����Ϊ2Сʱ
	private int			mRow			= 0;
	private int 		mCol			= 0;
	private int 		mDateFontSize 	= 0;
	private int 		mTimeFontSize 	= 0;
	private int 		mWidth;
	private int 		mHeight;
	private String[]	mDateArray 		= {" "," "," "," "," "," "," "};	
	private LinkedHashMap<String, List<SetTime>>	mSetTimes		= null;
	
	public DetectView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mWidth = attrs.getAttributeIntValue(NAMESPACE, "layout_width", 250);
		mHeight = attrs.getAttributeIntValue(NAMESPACE, "layout_height", 250);
		this.setBackgroundColor(mUnChooseColor);
		mCol = mDateArray.length;
		mRow = 24 / mInterval;
		
		//test();
	}
	
//	private void test()
//	{
//		LinkedHashMap<String, List<SetTime>> timeMap = new LinkedHashMap<String, List<SetTime>>();
//		for(int i =0; i< mDateArray.length; i++)
//		{
//			List<SetTime> timeList = new ArrayList<SetTime>();
//			
//			Time start = new Time((i+1)*2, 10, 0);
//			Time end = new Time((i+1)* 2+ 3, 20, 0);
//			SetTime steTime = new SetTime(start, end);
//			timeList.add(steTime);
//			
//			Time start2 = new Time((i+1)*2, 36, 0);
//			Time end2 = new Time((i+1)* 2+ 3, 47, 0);
//			SetTime steTime2 = new SetTime(start2, end2);
//			timeList.add(steTime2);
//			timeMap.put(mDateArray[i], timeList);
//		}
//		setTimes(timeMap);
//	}
	
	public void setTimes(LinkedHashMap<String, List<SetTime>> timeMap)
	{
		if(timeMap == null || timeMap.isEmpty())
		{
			return;
		}
		int len = timeMap.size();
		String[] dateArray = new String[len];
		int i =0;
		Iterator<Entry<String, List<SetTime>>> iter = timeMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, List<SetTime>> entry = iter.next();
			dateArray[i] = entry.getKey();
			i++;
		}
		mDateArray = dateArray;
		
		mSetTimes = timeMap;
		this.invalidate();
	}
	
	
	public void setTimeInterval(int Interval)
	{
		if(Interval < 0)
		{
			return;
		}
		mInterval = Interval;
		mRow = 24 / mInterval;
		this.invalidate();
	}
	
	
	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		mWidth = w;
		mHeight = h;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		
		drawTime(canvas);
		drawDate(canvas);
		drawOther(canvas);
		drawLines(canvas);
		drawTimes(canvas);
		
	}

	private void drawLines(Canvas canvas)
	{
		//�����Ч������һ�����ߺ�һ��������ɵ�
		Paint paint = new Paint();
		paint.setFlags(Paint.ANTI_ALIAS_FLAG);
		paint.setAntiAlias(true);
		
		paint.setColor(mLineColor1);
		paint.setStrokeWidth(1);
		paint.setStyle(Style.STROKE);
		float cellWidth = (float)mWidth/(mCol + 1);
		float cellHeight = (float)mHeight/(mRow + 1);
		
		
		Paint dateLine = new Paint();
		dateLine.setFlags(Paint.ANTI_ALIAS_FLAG);
		dateLine.setAntiAlias(true);
		
		dateLine.setColor(Color.rgb(92, 92, 79));
		dateLine.setStrokeWidth(1);
		dateLine.setStyle(Style.STROKE);
		
		Paint timeLine = new Paint();
		timeLine.setFlags(Paint.ANTI_ALIAS_FLAG);
		timeLine.setAntiAlias(true);
		
		timeLine.setColor(Color.rgb(148, 148, 129));
		timeLine.setStrokeWidth(1);
		timeLine.setStyle(Style.STROKE);
		// ������
		for(int i = 1; i<= mCol; i++)
		{
			float x = cellWidth * i;
			canvas.drawLine(x, 0, x, cellHeight, dateLine);
			canvas.drawLine(x, cellHeight, x, mHeight, paint);
			
		}
		
		for(int i =1; i<= mRow; i++)
		{
			float y = cellHeight * i;
			canvas.drawLine(0, y, cellWidth, y, timeLine);
			canvas.drawLine(cellWidth, y, mWidth, y, paint);
			
		}
		
		// ������
		paint.setColor(mLineColor2);
		dateLine.setColor(Color.rgb(113, 113, 108));
		timeLine.setColor(Color.rgb(182, 182, 176));
		for(int i = 1; i<= mCol; i++)
		{
			float x = cellWidth * i + 1;
			canvas.drawLine(x, 0, x, cellHeight, dateLine);
			canvas.drawLine(x, cellHeight, x, mHeight, paint);
		}
		
		for(int i =1; i<= mRow; i++)
		{
			float y = cellHeight * i + 1;
			canvas.drawLine(0, y, cellWidth, y, timeLine);
			canvas.drawLine(cellWidth, y, mWidth, y,paint);
		}
	}
	
	private void drawDate(Canvas canvas)
	{
		float cellWidth = (float)mWidth/(mCol + 1);
		float cellHeight = (float)mHeight/(mRow + 1);
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setStyle(Style.FILL);
		paint.setColor(mDateBackColor);
		
		//������
		canvas.drawRect(0, 0, mWidth, cellHeight, paint);
		
		//����
		mDateFontSize = (int) (cellHeight/3);
		paint.setStyle(Style.STROKE);
		paint.setColor(mDateFontColor);
		paint.setTextAlign(Align.CENTER);
		paint.setTextSize(mDateFontSize);
		FontMetrics metrics = paint.getFontMetrics();
		float fontHeight = metrics.bottom - metrics.top;
		float y = (cellHeight + fontHeight)/2;
		for(int i =0; i< mCol; i++)
		{
			String text = mDateArray[i];
			float left = cellWidth * (i +1);
			float right = cellWidth * (i +2);
			canvas.drawText(text, (int)(left + right) >> 1, y, paint);
		}
		
	}
	
	private void drawTime(Canvas canvas)
	{
		float cellWidth = (float)mWidth/(mCol + 1);
		float cellHeight = (float)mHeight/(mRow + 1);
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setStyle(Style.FILL);
		paint.setColor(mTimeBackColor);
		
		//������
		canvas.drawRect(0, 0, cellWidth, mHeight, paint);
		
		//����
		mTimeFontSize = (int) (cellHeight/3);
		paint.setStyle(Style.STROKE);
		paint.setColor(mTimeFontColor);
		paint.setTextAlign(Align.CENTER);
		paint.setTextSize(mTimeFontSize);
		FontMetrics metrics = paint.getFontMetrics();
		float fontHeight = (metrics.bottom - metrics.top)/3*2;
		for(int i = 0; i<= mRow; i++)
		{
			String text = getTime(i);
			int top = (int) (cellHeight * i + cellHeight);  // cellHeight ���ڵĸ߶ȱ������
			canvas.drawText(text, (int)cellWidth >> 1, top + fontHeight, paint);
		}
	}
	
	private void drawOther(Canvas canvas)
	{
		float cellWidth = (float)mWidth/(mCol + 1);
		float cellHeight = (float)mHeight/(mRow + 1);
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setStyle(Style.FILL);
		paint.setColor(Color.rgb(116, 116, 107));
		
		//������
		canvas.drawRect(0, 0, cellWidth, cellHeight, paint);
		
	}
	
	private void drawTimes(Canvas canvas)
	{
		if(mSetTimes == null)
		{
			return;
		}
		float cellWidth = (float)mWidth/(mCol + 1);
		float cellHeight = (float)mHeight/(mRow + 1);
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setStyle(Style.FILL);
		paint.setColor(mChooseColor);
		paint.setAlpha(mAlpha);
		for(int i =0; i< mDateArray.length; i++)
		{
			
			if(mDateArray[i] != null)
			{
				List<SetTime> timeList = mSetTimes.get(mDateArray[i]);
				for(SetTime setTime: timeList)
				{
					Time startTime  = setTime.startTime;
					Time endTime	= setTime.endTime;
					float top		= startTime.getSeconds() * (mHeight - cellHeight)/ SECONDS + cellHeight;  // cellHeight ���ڵĸ߶ȱ������
					float bottom 	= endTime.getSeconds() * (mHeight - cellHeight) / SECONDS + cellHeight;
					float left 		= (i + 1) * cellWidth + 1;
					float right		= left + cellWidth -2;
					canvas.drawRect(left, top, right, bottom, paint);
				}
				
			}
			
		}
	}
	
	private String getTime(int index)
	{
		String time = String.format("%02d:00", index*mInterval);
		return time;
	}

}

