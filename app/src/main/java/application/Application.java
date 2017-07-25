package application;


import android.app.Activity;

import com.nfcproject.DemoCache;
import com.nfcproject.utils.LogUtil;

import java.util.LinkedList;

public class Application extends android.app.Application {
    private static Application app;

    private LinkedList<Activity> activitys = null;


    public Application() {
        app = this;
    }

    public static synchronized Application getInstance() {
        if (app == null) {
            app = new Application();
        }
        return app;
    }
    public void onCreate() {
        super.onCreate();
        DemoCache.setContext(this);
        activitys = new LinkedList<Activity>();
        registerUncaughtExceptionHandler();
    }

    // 添加Activity到容器中
    public void addActivity(Activity activity) {
        if (activitys != null && activitys.size() > 0) {
            if (!activitys.contains(activity)) {
                activitys.add(activity);
                LogUtil.i("==activity==", activity+"\t<---->length:\t"+activitys.size());
            }
        } else {

            activitys.add(activity);
            LogUtil.i("==activity==", activity+"\t<---->length:\t"+activitys.size());
        }
    }

    // 遍历所有Activity并finish
    public void exitAll() {

        exit();
        System.exit(0);
    }

    public void exit() {

        if (activitys != null && activitys.size() > 0) {
            for (Activity activity : activitys) {
                activity.finish();
            }
        }

    }


    // 注册App异常崩溃处理器
    private void registerUncaughtExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(AppException.getAppExceptionHandler());
    }

}