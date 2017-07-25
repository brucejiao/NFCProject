package com.company.Demo;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.company.NetSDK.CTRL_ARM_DISARM_PARAM;
import com.company.NetSDK.CtrlType;
import com.company.NetSDK.INetSDK;
import com.nfcproject.R;


public class IntelBrassArmedActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.armedview);
        
        spMode = (Spinner)findViewById(R.id.sp_intelbrass_armed_mode);
		ArrayAdapter<String> apData = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , m_strArmedMode);
		spMode.setAdapter(apData);
		
		spScene = (Spinner)findViewById(R.id.sp_intelbrass_armed_scene);
		apData = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , m_strArmedScene);
		spScene.setAdapter(apData);
		
		etPsw = (EditText)findViewById(R.id.et_intelbrass_armed_psw);
		etPsw.setFocusable(true);
		
		Button btSet = (Button)findViewById(R.id.bt_intelbrass_armed_set);
		btSet.setOnClickListener(new OnClickListener() {
			@Override
        	public void onClick(View v) {
				CTRL_ARM_DISARM_PARAM stParam = new CTRL_ARM_DISARM_PARAM();
				stParam.bState = (byte)spMode.getSelectedItemPosition();
				stParam.szDevPwd = etPsw.getText().toString();
				stParam.emSceneMode = spScene.getSelectedItemPosition();
				stParam.szDevID = null;
				boolean zRet = INetSDK.ControlDevice(TestNetSDKActivity.m_loginHandle, CtrlType.SDK_CTRL_ARMED, stParam, 10000);
				if (!zRet) {
					ToolKits.showErrorMessage(v.getContext(), "ControlDevice SDK_CTRL_ARMED failed");
				} else {
					ToolKits.showMessage(v.getContext(), "ControlDevice SDK_CTRL_ARMED success");
				}
			}
		});
	}
	
	private Spinner spMode;
	private Spinner spScene;
	private EditText etPsw;
	private static final String[] m_strArmedMode = {"Disarming", "Arming", "Force Arming"};
	private static final String[] m_strArmedScene = {"Unknow", "Out Door", "In Door"};
}
