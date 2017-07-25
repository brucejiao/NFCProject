package com.nfcproject;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by hzxuwen on 2015/4/13.
 */
public class AuthPreferences {
    private static final String KEY_USER_ID = "userid";
    private static final String KEY_GRAIN_NAME = "grainname";
    private static final String KEY_OPTYPE = "optype";

    public static String getUserId() {
        return getString(KEY_USER_ID);
    }

    public static void saveUserId(String userId) {
        saveString(KEY_USER_ID, userId);
    }


    public static String getGrainName() {
        return getString(KEY_GRAIN_NAME);
    }

    public static void saveGrainName(String name) {
        saveString(KEY_GRAIN_NAME, name);
    }


    public static String getOptype() {
        return getString(KEY_OPTYPE);
    }

    public static void saveOptype(String optype) {
        saveString(KEY_OPTYPE, optype);
    }



    private static void saveString(String key, String value) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(key, value);
        editor.commit();
    }

    private static String getString(String key) {
        return getSharedPreferences().getString(key, null);
    }

    public static SharedPreferences getSharedPreferences() {
        return DemoCache.getContext().getSharedPreferences("my_nfc", Context.MODE_PRIVATE);
    }
}
