package com.company.Demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.nfcproject.R;

import application.Application;

public class LoginModeActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginmode);
		Application.getInstance().addActivity(this);
        m_loginMode = LOGIN_MODE.LOGIN_MODE_IP;
        jumpToIPActivity();

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	private void jumpToIPActivity() {
		Intent intent = new Intent();
		intent.setClass(this, TestNetSDKActivity.class);
		startActivityForResult(intent, 2);
	}


	public static LOGIN_MODE m_loginMode;

	public enum LOGIN_MODE {
		LOGIN_MODE_IP,
		LOGIN_MODE_P2P
	}
}
