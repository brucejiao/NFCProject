package com.nfcproject.js;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import com.nfcproject.page.LKStateShowActivity;
import com.nfcproject.page.Show3DActivity;

/**
 * Created by Administrator on 2017/7/16.
 */

public class JSKit {
    private IPageNow mIpageNow;
    private Context ma;
    private ProgressDialog progress;
    public JSKit(Context context) {
        this.ma = context;

    }

    @JavascriptInterface
    public void showMsg(String msg) {
        Toast.makeText(ma, msg, Toast.LENGTH_SHORT).show();
    }
//仓值查询
    @JavascriptInterface
    public void init(String msg) {
//        Toast.makeText(ma, "仓值查询--->"+msg, Toast.LENGTH_SHORT).show();
    }
//粮情列表
    @JavascriptInterface
    public void getData(String msg) {
//        Toast.makeText(ma, "粮情列表--->"+msg, Toast.LENGTH_SHORT).show();
    }
    //show3D
    @JavascriptInterface
    public void show3D(final  String id) {
//        Toast.makeText(ma, "show3D--->"+id, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent((LKStateShowActivity)ma,Show3DActivity.class);
        intent.putExtra("flag",true);
        intent.putExtra("id",id);
        ma.startActivity(intent);
    }

    //show3D
    @JavascriptInterface
    public void getMore(final  String pageNow) {
        mIpageNow = (LKStateShowActivity)ma;
        mIpageNow.onPageNow(pageNow);
    }


    public interface IPageNow{
        void onPageNow(String pageNow);
    }
}
