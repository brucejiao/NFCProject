package com.nfcproject.utils;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtil {

	private static final boolean IS_OPEN_LOG = true;
	
	private static final String BASE_TAG = "Aisino:";
	
	private static String APP_CODE_VERSION = "";
	
	private static String getCallerInfo() {
        StackTraceElement[] stack = (new Throwable()).getStackTrace();
        StackTraceElement ele = null;
        String className = "";
        String methodName = "";
        int lineNO = 0;
        if (stack.length > 2) {
            ele = stack[2];
            try {
                className = Class.forName(ele.getClassName()).getSimpleName();
                methodName = ele.getMethodName();
                lineNO = ele.getLineNumber();
            } catch (ClassNotFoundException e) {
            }
        }
        
    	SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    	APP_CODE_VERSION = simple.format(new Date());
        String callerInfo = className + ":" + methodName + ":" + APP_CODE_VERSION + lineNO + "---->";
        return callerInfo;
    }
	
	public static void i(String tag, String msg){
		if (IS_OPEN_LOG){
			Log.i(BASE_TAG + tag, getCallerInfo() + msg);
		}
	}
	
	public static void d(String tag, String msg){
		if (IS_OPEN_LOG){
			Log.d(BASE_TAG + tag, getCallerInfo() + msg);
		}
	}
	
	public static void w(String tag, String msg){
		if (IS_OPEN_LOG){
			Log.w(BASE_TAG + tag, getCallerInfo() + msg);
		}
	}
	
	public static void e(String tag, String msg){
		if (IS_OPEN_LOG){
			Log.e(BASE_TAG + tag, getCallerInfo() + msg);
		}
	}
}
