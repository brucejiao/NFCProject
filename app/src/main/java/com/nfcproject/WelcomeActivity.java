package com.nfcproject;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;

import com.nfcproject.page.LKHomeActivity;
import com.nfcproject.page.LKLoginActivity;
import com.nfcproject.utils.Contents;
import com.nfcproject.utils.SharePreferenceUtil1;

import java.util.List;

public class WelcomeActivity extends Activity {
    private WelcomeActivity mContext;

    private boolean customSplash = false;

    private static boolean firstEnter = true; // 是否首次进入

    SharePreferenceUtil1 share;
    String mUserId ="";
    String mOpttype ="";
    String mUsername ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        /*SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);*/
        mContext = this ;
        share = new SharePreferenceUtil1(mContext, "lk_data", 0);
        mUserId = share.getString(Contents.ID);
        mOpttype= share.getString(Contents.OPTTYPE);
        mUsername = share.getString(Contents.USERNAME);
        if (savedInstanceState != null) {
            setIntent(new Intent()); // 从堆栈恢复，不再重复解析之前的intent
        }
        if (!firstEnter) {
            onIntent();
        } else {
            showSplashView();
        }

    }

    @Override
    public void onResume() {
        super.onResume();

        if (firstEnter) {
            firstEnter = false;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    if (canAutoLogin()) {
                      onIntent();
                    } else {
                        startActivity(new Intent(WelcomeActivity.this,LKLoginActivity.class));
                        finish();
                    }
                }
            };

            if (customSplash) {
                new Handler().postDelayed(runnable, 1);
            } else {
                runnable.run();
            }
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        /**
         * 如果Activity在，不会走到onCreate，而是onNewIntent，这时候需要setIntent
         * 场景：点击通知栏跳转到此，会收到Intent
         */
        setIntent(intent);
        onIntent();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.clear();
    }

    //判断app是否在运行
    public static boolean stackResumed(Context context) {
        ActivityManager manager = (ActivityManager) context
                .getApplicationContext().getSystemService(
                        Context.ACTIVITY_SERVICE);
        String packageName = context.getApplicationContext().getPackageName();
        List<ActivityManager.RunningTaskInfo> recentTaskInfos = manager.getRunningTasks(1);
        if (recentTaskInfos != null && recentTaskInfos.size() > 0) {
            ActivityManager.RunningTaskInfo taskInfo = recentTaskInfos.get(0);
            if (taskInfo.baseActivity.getPackageName().equals(packageName) && taskInfo.numActivities > 1) {
                return true;
            }
        }

        return false;
    }


    // 处理收到的Intent
    private void onIntent() {
        if (!canAutoLogin()) {
            // 判断当前app是否正在运行
            if (!stackResumed(WelcomeActivity.this)) {
                startActivity(new Intent(WelcomeActivity.this,LKLoginActivity.class));
            }
            finish();
        } else {
            // 已经登录过了，处理过来的请求 如点开的通知信息处理
            startActivity(new Intent(WelcomeActivity.this,LKHomeActivity.class));

            }

            if (!firstEnter) {
                finish();
            } else {
                showMainActivity();
            }


    }

    /**
     * 已经登陆过，自动登陆
     */
    private boolean canAutoLogin() {
        String id = mUserId;
        return !TextUtils.isEmpty(id);
    }


    /**
     * 首次进入，打开欢迎界面
     */
    private void showSplashView() {
        getWindow().setBackgroundDrawableResource(R.mipmap.main_bg);
        customSplash = true;
    }

    private void showMainActivity() {
        showMainActivity(null);
    }

    private void showMainActivity(Intent intent) {
        startActivity(new Intent(WelcomeActivity.this,LKHomeActivity.class));
        finish();
    }




}
