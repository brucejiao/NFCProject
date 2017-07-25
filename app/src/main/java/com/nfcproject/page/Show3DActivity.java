package com.nfcproject.page;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.nfcproject.R;
import com.nfcproject.ServerMain;
import com.nfcproject.js.JSKit;
import com.nfcproject.utils.CommUtil;

import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * show3d
 */
public class Show3DActivity extends AppCompatActivity {
   private Show3DActivity  mContext ;
    @Bind(R.id.show_3d)
    WebView mStateShow;
    private JSKit js;
    String mResult = "";
    private ProgressDialog progress;

//    private Show3DActivity() {
//    }
//
//    private static Show3DActivity instance;
//
//    public static synchronized  Show3DActivity getInstance() {
//        if (instance == null)
//            instance = new Show3DActivity();
//        return instance;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show3_d);
        ButterKnife.bind(this);
        mContext = this ;
        initUI();
    }

    private void initUI(){
        mStateShow.loadUrl("file:///android_asset/3D/index.html");
        initData();
    }

    private void initData(){
        WebSettings webSettings = mStateShow.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //实例化js对象
        js = new JSKit(this);


// User settings

        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setUseWideViewPort(true);//关键点

        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);

        webSettings.setDisplayZoomControls(true);
        webSettings.setJavaScriptEnabled(true); // 设置支持javascript脚本
        webSettings.setAllowFileAccess(true); // 允许访问文件
        webSettings.setBuiltInZoomControls(true); // 设置显示缩放按钮
        webSettings.setSupportZoom(true); // 支持缩放
        webSettings.setLoadWithOverviewMode(true);

//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        int mDensity = metrics.densityDpi;
//        Log.d("maomao", "densityDpi = " + mDensity);
//        if (mDensity == 240) {
//            webSettings.setDefaultZoom(ZoomDensity.FAR);
//        } else if (mDensity == 160) {
//            webSettings.setDefaultZoom(ZoomDensity.MEDIUM);
//        } else if(mDensity == 120) {
//            webSettings.setDefaultZoom(ZoomDensity.CLOSE);
//        }else if(mDensity == DisplayMetrics.DENSITY_XHIGH){
//            webSettings.setDefaultZoom(ZoomDensity.FAR);
//        }else if (mDensity == DisplayMetrics.DENSITY_TV){
//            webSettings.setDefaultZoom(ZoomDensity.FAR);
//        }else{
//            webSettings.setDefaultZoom(ZoomDensity.MEDIUM);
//        }


/**
 * 用WebView显示图片，可使用这个参数 设置网页布局类型： 1、LayoutAlgorithm.NARROW_COLUMNS ：
 * 适应内容大小 2、LayoutAlgorithm.SINGLE_COLUMN:适应屏幕，内容将自动缩放
 */
//        webSettings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);

        //把js绑定到全局的myjs上，myjs的作用域是全局的，初始化后可随处使用
        mStateShow.addJavascriptInterface(js, "myjs");
        mStateShow.setWebChromeClient(new WebChromeClient());

        //调用接口
        boolean flag = getIntent().getBooleanExtra("flag",false);
        String id = getIntent().getStringExtra("id");
        if(flag){
            initNetData(id);
        }
    }

    public void initNetData(final  String id) {
        progress = CommUtil.showProgress(mContext, "正在查询中...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
                    list.add(new BasicNameValuePair("id",id));// 2  3  5
                    mResult = ServerMain.getShow3D(getResources().getString(R.string.path) + getResources().getString(R.string.show3DDate), list);
                    Message message = new Message();
                    message.what = 100;
                    netHandler.sendMessage(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    Handler netHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 100){
//                CommUtil.showAlert("RESULT -->"+mResult,mContext);
                mStateShow.loadUrl("javascript:init("+mResult+")");
                if (progress != null) {
                    progress.dismiss();
                }
            }
        }
    };
}
