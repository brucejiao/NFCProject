package com.company.Demo;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.company.NetSDK.INetSDK;
import com.company.NetSDK.USER_INFO_NEW;
import com.company.NetSDK.USER_MANAGE_INFO_NEW;
import com.nfcproject.R;

import java.util.ArrayList;

public class UserManagement extends Activity {
	Spinner m_spGroup;
	Spinner m_spUser;
	Spinner m_spRight;

	EditText m_etOldPsw;
	EditText m_etNewPsw_1;
	EditText m_etNewPsw_2;

	Button m_btModify;

	Resources res;

	static USER_MANAGE_INFO_NEW m_stUserInfo = new USER_MANAGE_INFO_NEW();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usermanage);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res = this.getResources();

		m_spGroup = (Spinner)findViewById(R.id.sp_group);
		m_spUser = (Spinner)findViewById(R.id.sp_user);
		m_spRight = (Spinner)findViewById(R.id.sp_right);

		m_etOldPsw = (EditText)findViewById(R.id.et_oldpsw);
		m_etNewPsw_1 = (EditText)findViewById(R.id.et_newpsw_1);
		m_etNewPsw_2 = (EditText)findViewById(R.id.et_newpsw_2);

		m_btModify = (Button)findViewById(R.id.bt_modify);

		// init
		getUserInfo();

		m_spGroup.setOnItemSelectedListener(new MySelectedListener());
		m_btModify.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				modifyUserPsw();
			}
		});
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
	}

	private void getUserInfo() {
		boolean zRet = INetSDK.QueryUserInfoNew(TestNetSDKActivity.m_loginHandle, m_stUserInfo, 10000);
		if (zRet) {
			ToolKits.showMessage(this , "QueryUserInfoNew " + res.getString(R.string.info_success));
		} else {
			ToolKits.showErrorMessage(this , "QueryUserInfoNew " + res.getString(R.string.info_failed));
			return;
		}

		ArrayList<String> alGroup = new ArrayList<String>();
		for (int i = 0; i < m_stUserInfo.dwGroupNum; i++) {
			String strGroup = ToolKits.CharArrayToString(m_stUserInfo.groupListEx[i].name , "UTF-8");
			if( null != strGroup){
				alGroup.add(strGroup);
			}
		}
		ArrayAdapter<String> apGroup = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alGroup);
		m_spGroup.setAdapter(apGroup);
	}

	private void updateUser(int pos) {
		ArrayList<String> alUser = new ArrayList<String>();
		for (int i = 0; i < m_stUserInfo.dwUserNum; i++) {
			if (m_stUserInfo.groupListEx[pos].dwID == m_stUserInfo.userList[i].dwGroupID) {

				String strName = ToolKits.CharArrayToString(m_stUserInfo.userList[i].name , "UTF-8");
				if(null != strName){
					alUser.add(strName);
				}
			}
		}
		ArrayAdapter<String> apUser = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alUser);
		m_spUser.setAdapter(apUser);
	}

	private void modifyUserPsw() {
		String strOld = m_etOldPsw.getText().toString();
		String strNew1 = m_etNewPsw_1.getText().toString();
		String strNew2 = m_etNewPsw_2.getText().toString();

		char[] cNewOld = ToolKits.StringToCharArray(strOld, "UTF-8");
		char[] cNew1 = ToolKits.StringToCharArray(strNew1, "UTF-8");

		USER_INFO_NEW stOld = new USER_INFO_NEW();
		USER_INFO_NEW stNew = new USER_INFO_NEW();

		if (strNew1.equals(strNew2)) {
			System.arraycopy(cNew1, 0, stNew.passWord, 0, cNew1.length);
		} else {
			ToolKits.showMessage(this, res.getString(R.string.user_manager_psw_dif));
			m_etNewPsw_1.setText("");
			m_etNewPsw_2.setText("");
			return;
		}

		if (m_spUser.getSelectedItemPosition() < 0) {
			return;
		}

		String strCurrentName = m_spUser.getSelectedItem().toString();
		char[] cCurrentName = ToolKits.StringToCharArray(strCurrentName, "UTF-8");
		System.arraycopy(cCurrentName, 0, stOld.name, 0, cCurrentName.length);
		System.arraycopy(cNewOld, 0, stOld.passWord, 0, cNewOld.length);

		boolean zRet = INetSDK.OperateUserInfoNew(TestNetSDKActivity.m_loginHandle, 6, stNew, stOld, 5000);
		if (zRet) {
			ToolKits.showMessage(this, res.getString(R.string.info_success));
		} else {
			ToolKits.showErrorMessage(this, "OperateUserInfoNew " + res.getString(R.string.info_failed));
		}

		m_etOldPsw.setText("");
		m_etNewPsw_1.setText("");
		m_etNewPsw_2.setText("");
	}

	private class MySelectedListener implements Spinner.OnItemSelectedListener {
		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			int nGroupPos = m_spGroup.getSelectedItemPosition();
			if (nGroupPos >= 0) {
				switch (parent.getId()) {
					case R.id.sp_group:
						updateUser(nGroupPos);
						break;
					case R.id.sp_user:
						break;
					default:
						break;
				}
			}
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {

		}
	}
}
