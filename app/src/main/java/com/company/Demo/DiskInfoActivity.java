package com.company.Demo;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.SDK_HARDDISK_STATE;
import com.nfcproject.R;

import java.util.ArrayList;

public class DiskInfoActivity extends Activity {
	Spinner m_spDiskList;

	TextView m_tvName;
	TextView m_tvState;
	TextView m_tvRest;
	TextView m_tvTotal;

	Resources res;

	String strState[];

	SDK_HARDDISK_STATE stDisk = new SDK_HARDDISK_STATE();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diskinfo);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res = this.getResources();
		strState = new String[]{res.getString(R.string.disk_info_hiberation),
				res.getString(R.string.disk_info_active), res.getString(R.string.disk_info_malfucntion)};

		m_spDiskList = (Spinner)findViewById(R.id.sp_disk_list);

		m_tvName = (TextView)findViewById(R.id.tv_disk_name);
		m_tvState = (TextView)findViewById(R.id.tv_disk_state);
		m_tvRest = (TextView)findViewById(R.id.tv_disk_rest);
		m_tvTotal = (TextView)findViewById(R.id.tv_disk_total);

		m_tvName.setText("");
		m_tvState.setText("");
		m_tvRest.setText("");
		m_tvTotal.setText("");

		m_spDiskList.setOnItemSelectedListener(new MySelectedListener());

		ArrayList<String> alGroup = new ArrayList<String>();

		boolean zRet = INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_DISK, stDisk, 3000);
		if (zRet) {
			if (stDisk.dwDiskNum > 0) {
				for (int i = 0; i < stDisk.dwDiskNum; i++) {
					alGroup.add(res.getString(R.string.disk_info_disk_name) + " " + (i + 1));
				}
			}
		} else {
			ToolKits.writeErrorLog("QueryDevState failed");
		}

		ArrayAdapter<String> apGroup = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alGroup);
		m_spDiskList.setAdapter(apGroup);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	private class MySelectedListener implements Spinner.OnItemSelectedListener {
		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			int nGroupPos = m_spDiskList.getSelectedItemPosition();
			if (nGroupPos >= 0) {
				switch (parent.getId()) {
					case R.id.sp_disk_list:
						updateDiskInfo(nGroupPos);
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

	private void updateDiskInfo(int pos) {
		m_tvName.setText("HDD" + stDisk.stDisks[pos].bDiskNum);
		int nState = stDisk.stDisks[pos].dwStatus & 0x07;
		if ((nState >= 0) && (nState <= 2)) {
			m_tvState.setText(strState[nState]);
		}
		m_tvRest.setText(stDisk.stDisks[pos].dwFreeSpace + "M");
		m_tvTotal.setText(stDisk.stDisks[pos].dwVolume + "M");
	}
}
