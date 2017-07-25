package com.company.Demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class CustomHScrollView extends HorizontalScrollView { 
	
	private boolean mEnable = false;
   // private GestureDetector mGestureDetector; 
    OnTouchListener mGestureListener;
  
    public CustomHScrollView(Context context, AttributeSet attrs) { 
        super(context, attrs); 
       // mGestureDetector = new GestureDetector(new YScrollDetector()); 
        setFadingEdgeLength(0); 
    } 
  
    public void setScrollEnable(boolean enable)
    {
    	mEnable = enable;
    }
    
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) { 
        return super.onInterceptTouchEvent(ev) && mEnable; 
    } 
  
    // Return false if we're scrolling in the y direction   
    class YScrollDetector extends SimpleOnGestureListener { 
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) { 
            if(Math.abs(distanceY) < Math.abs(distanceX)) { 
                return true; 
            } 
            return false; 
        } 
    } 
}
