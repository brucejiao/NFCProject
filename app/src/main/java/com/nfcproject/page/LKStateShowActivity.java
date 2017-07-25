package com.nfcproject.page;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.widget.EditText;

import com.nfcproject.R;
import com.nfcproject.ServerMain;
import com.nfcproject.js.JSKit;
import com.nfcproject.utils.CommUtil;

import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 粮情展示
 */
public class LKStateShowActivity extends AppCompatActivity implements JSKit.IPageNow {
    private LKStateShowActivity mContext;
    @Bind(R.id.lq_state_show)
    WebView mStateShow;
    private JSKit js;
    private ProgressDialog progress;
    @Bind(R.id.search_key)//查询关键字
            EditText mSearchKey;

    String mResult = "";
    String mSearchText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lkstate_show);
        ButterKnife.bind(this);
        mContext = this ;
        initUI();

    }

    private void initUI(){
//        mStateShow.loadUrl("file:///android_asset/3D/index.html");
        mStateShow.loadUrl("file:///android_asset/lqzs/index.html");
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

        webSettings.setLayoutAlgorithm(LayoutAlgorithm.NARROW_COLUMNS);

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
    }


    private void initNetData(final  String pageNow) {
        mSearchText = mSearchKey.getText().toString();
        progress = CommUtil.showProgress(mContext, "正在查询中...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
                    list.add(new BasicNameValuePair("house",mSearchText ));// 2  3  5
                    if(!CommUtil.isNullOrBlank(pageNow)){
                        list.add(new BasicNameValuePair("pageNow",pageNow ));// 2  3  5
                    }else{
                        list.add(new BasicNameValuePair("pageNow","1" ));// 2  3  5
                    }
                    list.add(new BasicNameValuePair("pageSize","5" ));// 2  3  5
                    mResult = ServerMain.showBarnRsvtempList(getResources().getString(R.string.path) + getResources().getString(R.string.showBarnRsvtempList), list);
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
                mStateShow.loadUrl("javascript:getData("+mResult+")");
                if (progress != null) {
                    progress.dismiss();
                }
            }
        }
    };

    /**
     * 查询
     * @param view
     */
    @OnClick(R.id.search_submit)
    public void submit(View view){
        initNetData("1");
//        mStateShow.loadUrl("javascript:showMsg()");
    }

    @OnClick(R.id.back)
    public void backOnclick(){
        finish();
    }

    @Override
    public void onPageNow(String pageNow) {
        initNetData(pageNow);
    }
}
