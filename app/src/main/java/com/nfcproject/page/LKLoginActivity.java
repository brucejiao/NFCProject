package com.nfcproject.page;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.nfcproject.ClearableEditTextWithIcon;
import com.nfcproject.R;
import com.nfcproject.ServerMain;
import com.nfcproject.utils.CommUtil;
import com.nfcproject.utils.Contents;
import com.nfcproject.utils.SharePreferenceUtil1;

import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by leo on 2016/10/19.
 */
public class LKLoginActivity extends Activity implements View.OnClickListener{
    private LKLoginActivity mContext;
    private View login_layout;
    private ClearableEditTextWithIcon edit_login_account;
    private ClearableEditTextWithIcon edit_login_password;
    private Button done;
    Map<String,String> map = null;
    SharePreferenceUtil1 share;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lk_login_activity);
        mContext = this ;
        share = new SharePreferenceUtil1(mContext, "lk_data", 0);
        init();
    }

    private void init() {
        login_layout=findViewById(R.id.login_layout);
        edit_login_account=(ClearableEditTextWithIcon) findViewById(R.id.edit_login_account);
        edit_login_password=(ClearableEditTextWithIcon)findViewById(R.id.edit_login_password);
//        edit_login_account.setIconResource(R.mipmap.user_account_icon_blue);
//        edit_login_password.setIconResource(R.mipmap.user_pwd_lock_icon);

        done=(Button) findViewById(R.id.done);
        done.setOnClickListener(this);
        edit_login_account.addTextChangedListener(textWatcher);
        edit_login_password .addTextChangedListener(textWatcher);


//        edit_login_account.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if(hasFocus){//获得焦点
//                    edit_login_account.setIconResource(R.mipmap.user_account_icon_blue);
//                }else{//失去焦点
//                    edit_login_account.setIconResource(R.mipmap.user_account_icon);
//                    edit_login_account.removeClearButton();
//
//                }
//            }
//        });

//        edit_login_password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if(hasFocus){//获得焦点
//                    edit_login_password.setIconResource(R.mipmap.user_pwd_lock_icon_blue);
//                }else{//失去焦点
//                    edit_login_password.setIconResource(R.mipmap.user_pwd_lock_icon);
//                    edit_login_password.removeClearButton();
//
//                }
//            }
//        });

    }


    private TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            // 更新右上角按钮状态

                // 登录模式
                boolean isEnable = edit_login_account.getText().length() > 0
                        && edit_login_password.getText().length() > 0;
                updateBtn(done, isEnable);
        }
    };

    private void updateBtn(TextView loginBtn, boolean isEnable) {
//        if(isEnable){
//            loginBtn.setBackgroundColor(Color.parseColor("#6792D7"));
//        }else{
//            loginBtn.setBackgroundColor(Color.parseColor("#cccccc"));
//        }
        loginBtn.setEnabled(isEnable);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.done:
                login();
                break;
        }
    }

    private void login() {
        progress = CommUtil.showProgress(mContext, "正在登录中...");
        if(edit_login_account.getText().toString().trim().length()>0&&edit_login_password.getText().toString().trim().length()>0){
            done.setClickable(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
                            list.add(new BasicNameValuePair("username", edit_login_account.getText().toString().trim()));
                            list.add(new BasicNameValuePair("password", edit_login_password.getText().toString().trim()));
                            map= ServerMain.login(getResources().getString(R.string.path)+getResources().getString(R.string.login),list);
                            handler.sendMessage(new Message());


                        } catch (Exception e) {
                            done.setClickable(true);
                            e.printStackTrace();
                        }
                    }
                }).start();
        }
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            done.setClickable(true);
           if(map!=null){
               if (progress != null) {
                   progress.dismiss();
               }
               if(map.get("status").equals("200")){
                       saveLoginInfo(map.get("emplyno"),map.get("grainName"),map.get("optype"));
                       startActivity(new Intent(LKLoginActivity.this,LKHomeActivity.class));
                       finish();
               }else if(map.get("status").equals("400")){
                   Toast.makeText(getApplicationContext(),map.get("msg"),Toast.LENGTH_LONG).show();
               }else{
                   Toast.makeText(getApplicationContext(),"登录失败",Toast.LENGTH_LONG).show();
               }
           }else{
               Toast.makeText(getApplicationContext(),"登录失败",Toast.LENGTH_LONG).show();
           }
        }
    };

    private void saveLoginInfo(final String userid,final String name,final String optype) {
//        AuthPreferences.saveUserId(userid);
//        AuthPreferences.saveGrainName(name);
//        AuthPreferences.saveOptype(optype);
        share.putString(Contents.ID,userid);
        share.putString(Contents.USERNAME,edit_login_account.getText().toString().trim());
        share.putString(Contents.OPTTYPE,optype);
        share.putString(Contents.WAREHOUSE,name);
    }

}
