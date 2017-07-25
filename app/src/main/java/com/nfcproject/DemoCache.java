package com.nfcproject;

import android.content.Context;


/**
 * Created by jezhee on 2/20/15.
 */
public class DemoCache {

    private static String mobile;
    private static Context context;






    public static String getMobile() {
        return mobile;
    }

    public static void setMobile(String mobile) {
        DemoCache.mobile = mobile;
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        DemoCache.context = context.getApplicationContext();
    }


    public static void clear() {
        mobile=null;
    }







}

