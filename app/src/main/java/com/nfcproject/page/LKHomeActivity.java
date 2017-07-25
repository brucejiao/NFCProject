package com.nfcproject.page;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nfcproject.R;
import com.nfcproject.Video.MyVideo.VideoNetListActivity;
import com.nfcproject.utils.CommUtil;
import com.nfcproject.utils.Contents;
import com.nfcproject.utils.SharePreferenceUtil1;
import com.nfcproject.zxing.android.CaptureActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 主界面
 */
public class LKHomeActivity extends AppCompatActivity {
    private LKHomeActivity mContext;
    @Bind(R.id.iv_out_in_warehouse)
    ImageView mOutInWarehouse;//出入库值仓
    @Bind(R.id.iv_warehouse_search)
    ImageView mWarehouseSearch;//仓储查询
    @Bind(R.id.iv_foodstuff_state)
    ImageView mFoodsStuff;//粮情展示
    @Bind(R.id.iv_video)
    ImageView mVideo;//视频监控
    @Bind(R.id.iv_scanner)
    ImageView mScanner;//扫码
    @Bind(R.id.username)
    TextView mUsername;//用户名
    @Bind(R.id.exit_text)
    TextView mExit;//注销
    SharePreferenceUtil1 share;
    private ProgressDialog progress;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        mContext = this ;
        ButterKnife.bind(this);
        initUI();
        initData();
    }

    /**
     * 界面初始化
     */
    private void initUI() {
        share = new SharePreferenceUtil1(mContext, "lk_data", 0);
        mUsername.setText(share.getString("name"));
    }

    /**
     * 数据初始化
     */
    private void initData() {

    }

    //
    @OnClick({R.id.iv_out_in_warehouse, R.id.iv_warehouse_search, R.id.iv_foodstuff_state, R.id.iv_video, R.id.iv_scanner})
    public void selectedUIOnclick(View view) {
        switch (view.getId()) {
            case R.id.iv_out_in_warehouse://出入库值仓
               String opttype = share.getString(Contents.OPTTYPE);
                if(!(opttype!=null && opttype.equals("7"))) {
                    Toast.makeText(getApplicationContext(),"请使用值仓员账号登录",Toast.LENGTH_LONG).show();
                }else{
                    startActivity(new Intent(this,NFCScannerActivity.class));
                }
                break;
            case R.id.iv_warehouse_search://仓储查询
                Intent storageIntent = new Intent(this, WarehouseStorageActivity.class);
                startActivity(storageIntent);
                break;
            case R.id.iv_foodstuff_state://粮情展示
                Intent stateIntent = new Intent(this, LKStateShowActivity.class);
                startActivity(stateIntent);
                break;
            case R.id.iv_video://视频监控
                progress = CommUtil.showProgress(mContext, "正在加载视频列表...");
                Intent videoIntent = new Intent(this, VideoNetListActivity.class);
//                Intent videoIntent = new Intent(this, LoginModeActivity.class);
//                startActivity(videoIntent);
                startActivityForResult(videoIntent,4);

                break;
            case R.id.iv_scanner://扫码
//                Intent wasteIntent = new Intent(this, CaptureActivity.class);
//                startActivity(wasteIntent);
                //运行时权限
                if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(mContext,new String[]{Manifest.permission.CAMERA},1);
                }else {
//                    startActivityForResult(new Intent(mContext, CaptureActivity.class),0);
                    Intent wasteIntent = new Intent(this, CaptureActivity.class);
                    startActivity(wasteIntent);
                }
                break;
            default:
                break;
        }

    }

    /**
     * 注销
     * @param view
     */
    @OnClick(R.id.exit_text)
    public void exitOnclick(View view){
//        AuthPreferences.saveUserId(null);
//        AuthPreferences.saveOptype(null);
//        AuthPreferences.saveGrainName(null);
        share.remove(Contents.ID);
        share.remove(Contents.USERNAME);
        share.remove(Contents.OPTTYPE);
        startActivity(new Intent(LKHomeActivity.this,LKLoginActivity.class));
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 4  && resultCode ==4){
                if (progress != null) {
                    progress.dismiss();
                }
        }
    }
}