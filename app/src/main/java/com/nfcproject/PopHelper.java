package com.nfcproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.nfcproject.page.LKLoginActivity;
import com.nfcproject.page.NFCScannerActivity;

public class PopHelper {
    private  static NFCScannerActivity instance = null;
    private static Activity context;
    private PopupWindow pop;
    private View view;

    public PopHelper(Activity context,NFCScannerActivity instance) {
        this.context = context;
        this.instance = instance;

        view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.pop, null);
        pop = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        initPop();
        initView();
    }

    private void initPop() {
        pop.setAnimationStyle(android.R.style.Animation_InputMethod);
        pop.setFocusable(true);
        pop.setOutsideTouchable(true);
        pop.setBackgroundDrawable(new BitmapDrawable());
        pop.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    }

    private void initView() {
        View iv_share_top=view.findViewById(R.id.iv_share_top);
        TextView btnCancel = (TextView) view.findViewById(R.id.btn_cancel);
        TextView loginout= (TextView) view.findViewById(R.id.loginout);


        //取消
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();

            }
        });

        loginout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AuthPreferences.saveUserId(null);
                context.startActivity(new Intent(context,LKLoginActivity.class));
                instance.finish();
                pop.dismiss();
            }
        });

        iv_share_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();

            }
        });
    }

    public void show(View view) {
        pop.showAtLocation(view, Gravity.BOTTOM, 0, 0);
    }
}
