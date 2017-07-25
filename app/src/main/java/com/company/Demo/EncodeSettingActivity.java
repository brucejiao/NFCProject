package com.company.Demo;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.company.NetSDK.CFG_DSPENCODECAP_INFO;
import com.company.NetSDK.CFG_ENCODE_INFO;
import com.company.NetSDK.CFG_VIDEO_COMPRESSION;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_IN_ENCODE_CFG_CAPS;
import com.company.NetSDK.NET_OUT_ENCODE_CFG_CAPS;
import com.company.NetSDK.SDKDEV_DSP_ENCODECAP;
import com.company.NetSDK.SDKDEV_SYSTEM_ATTR_CFG;
import com.company.NetSDK.SDK_RESOLUTION_INFO;
import com.nfcproject.R;

import java.util.ArrayList;

public class EncodeSettingActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.encodesettingview);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res = this.getResources();

		spMode = (Spinner)findViewById(R.id.sp_encode_mode);
		spResolution = (Spinner)findViewById(R.id.sp_encode_resolution);
		spFps = (Spinner)findViewById(R.id.sp_encode_fps);
		spBitRate = (Spinner)findViewById(R.id.sp_encode_bitrate);
		tvBitRateScope = (TextView)findViewById(R.id.tv_encode_bitrate_scope);
		btSet = (Button)findViewById(R.id.bt_encode_set);

		initData();

		spMode.setOnItemSelectedListener(new SpSelectedListener());
		spResolution.setOnItemSelectedListener(new SpSelectedListener());
		spFps.setOnItemSelectedListener(new SpSelectedListener());
		spBitRate.setOnItemSelectedListener(new SpSelectedListener());
		btSet.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if (ToolKits.SetDevConfig(FinalVar.CFG_CMD_ENCODE, stEncInfo, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240))  {
					ToolKits.showMessage(v.getContext(), res.getString(R.string.info_success));
				} else {
					ToolKits.showErrorMessage(v.getContext(), res.getString(R.string.info_failed));
				}
			}
		});
	}

	private void initData() {
		bF6 = false;

		// get byVideoStandard
		SDKDEV_SYSTEM_ATTR_CFG stSysArrt[] = new SDKDEV_SYSTEM_ATTR_CFG[1];
		stSysArrt[0] = new SDKDEV_SYSTEM_ATTR_CFG();
		if (INetSDK.GetDevConfig(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEV_DEVICECFG, 0, stSysArrt, null, 15000)) {
			nVideoStandard = stSysArrt[0].byVideoStandard;
		} else {
			ToolKits.writeErrorLog("GetDevConfig for SDK_DEV_DEVICECFG failed");
			initSpinners();
			return;
		}

		// get CFG_CMD_ENCODE for GetDevCaps
		if (!ToolKits.GetDevConfig(FinalVar.CFG_CMD_ENCODE, stEncInfo, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240)) {
			ToolKits.writeErrorLog("ToolKits.GetDevConfig failed");
			initSpinners();
			return;
		}

		// get FPS, BIT RATE, H264 PROFILE
		getF6Data();

		if (!bF6) {
			// get caps
			if ((ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP, stEncodeCapNew, TestNetSDKActivity.m_loginHandle, GlobalSettingActivity.m_nGlobalChn, 10240))
					&& (0 != stEncodeCapNew.dwEncodeModeMask)
					&& (0 != stEncodeCapNew.dwImageSizeMask)) {
				nModeMask = stEncodeCapNew.dwEncodeModeMask;
				nResolutionMask = stEncodeCapNew.dwImageSizeMask;
			} else if ((INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_DSP, stEncodeCapOld, 10000))
					&& (0 != stEncodeCapOld.dwEncodeModeMask)
					&& (0 != stEncodeCapOld.dwImageSizeMask)) {
				nModeMask = stEncodeCapOld.dwEncodeModeMask;
				nResolutionMask = stEncodeCapOld.dwImageSizeMask;
			} else {
				bF6 = false;
			}
		} else {
			nModeMask = stOutCfgCaps.stuMainFormatCaps[0].dwEncodeModeMask;
		}

		if (0 == nModeMask) {
			ToolKits.writeLog("GetDevCaps, encode mode is null");
			initSpinners();
			return;
		}

		// mode
		setModeScopeAndShow();

		// resolution
		setResolutionScopeAndShow();

		// fps
		setFpsScopeAndShow();

		// bit rate
		SetBitRateScopeAndShow();
	}

	private int resolutionToIndex(SDK_RESOLUTION_INFO stInfo) {
		for (int i = 0; i < alResolution.size(); i++) {
			String value[];
			if (bF6) {
				value = alResolution.get(i).split("\\*");
			} else {
				value = alResolution.get(i).split("\\(")[1].split("\\)")[0].split("\\*");
			}

			if (((int)stInfo.snWidth == Integer.parseInt(value[0]))
					&& ((int)stInfo.snHight == Integer.parseInt(value[1]))) {
				return i;
			}
		}

		return -1;
	}

	private SDK_RESOLUTION_INFO indexToResolution(int index) {
		String value[];
		if (bF6) {
			value = alResolution.get(index).split("\\*");
		} else {
			value = alResolution.get(index).split("\\(")[1].split("\\)")[0].split("\\*");
		}

		SDK_RESOLUTION_INFO stInfo = new SDK_RESOLUTION_INFO();
		stInfo.snWidth = (short)Integer.parseInt(value[0]);
		stInfo.snHight = (short)Integer.parseInt(value[1]);

		return stInfo;
	}

	private class SpSelectedListener implements Spinner.OnItemSelectedListener {
		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			if (position >= 0) {
				switch (parent.getId()) {
					case R.id.sp_encode_mode:
						updateMode(position);
						break;
					case R.id.sp_encode_resolution:
						updateResolution(position);
						break;
					case R.id.sp_encode_fps:
						updateFps(position);
						break;
					case R.id.sp_encode_bitrate:
						updateBitRate(position);
						break;
				}
			}
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {

		}
	}

	private void updateMode(int pos) {
		for (int i = 0; i < strMode.length; i++) {
			if (strMode[i].equals((alMode.get(pos)))) {
				stEncInfo.stuMainStream[0].stuVideoFormat.emCompression = i;
				break;
			}
		}

		for (int i = 0; i < strModeProfile.length; i++) {
			if (strModeProfile[i].equals((alMode.get(pos)))) {
				stEncInfo.stuMainStream[0].stuVideoFormat.emCompression = CFG_VIDEO_COMPRESSION.VIDEO_FORMAT_H264;
				stEncInfo.stuMainStream[0].stuVideoFormat.abProfile = true;
				stEncInfo.stuMainStream[0].stuVideoFormat.emProfile = i + 1;
				break;
			}
		}

		getF6Data();

		// resolution
		setResolutionScopeAndShow();

		// fps
		setFpsScopeAndShow();

		// bit rate
		SetBitRateScopeAndShow();
	}

	private void updateResolution(int pos) {
		SDK_RESOLUTION_INFO stInfo = indexToResolution(pos);
		stEncInfo.stuMainStream[0].stuVideoFormat.nWidth = stInfo.snWidth;
		stEncInfo.stuMainStream[0].stuVideoFormat.nHeight = stInfo.snHight;

		getF6Data();

		// fps
		setFpsScopeAndShow();

		// bit rate
		SetBitRateScopeAndShow();
	}

	private void updateFps(int pos) {
		stEncInfo.stuMainStream[0].stuVideoFormat.nFrameRate = pos + 1;

		getF6Data();

		// bit rate
		SetBitRateScopeAndShow();
	}

	private void updateBitRate(int pos) {
		stEncInfo.stuMainStream[0].stuVideoFormat.nBitRate = Integer.parseInt(alBitRate.get(pos));
	}

	private void getBitRateScope(int fps, int iframes, int width, int height, int encode, int[] nTmp) {
		int gop = (iframes > 149) ? 50 : iframes;
		double scalar = width*height/(352.0*288)/gop;

		double minRaw = 0;
		if (encode == 5) { //mjpg
			minRaw = (gop + IFRAME_PFRAME_QUOTIENT - 1)*fps*7*3*scalar;
		} else {
			minRaw = (gop + IFRAME_PFRAME_QUOTIENT - 1)*fps*MIN_CIF_PFRAME_SIZE*scalar;
		}
		nTmp[0] = roundToFactor((int)minRaw, (1 << (int)log2(minRaw))/4);

		double maxRaw = (gop + IFRAME_PFRAME_QUOTIENT - 1)*fps*MAX_CIF_PFRAME_SIZE*scalar;
		nTmp[1] = roundToFactor((int)maxRaw, (1 << (int)log2(maxRaw))/4);
	}

	private int roundToFactor(int n, int f)
	{
		if (0 == f) {
			return n;
		}

		return f*roundf(n/(float)f);
	}

	private double log2(double value) {
		return Math.log(value) / Math.log((double)2);
	}

	private int roundf(float f) {
		return (int)(f+0.5);
	}

	private void getF6Data() {
		char cJson[] = new char[10240];
		byte bJson[] = new byte[10240];
		if (!INetSDK.PacketData(FinalVar.CFG_CMD_ENCODE, stEncInfo, cJson, 10240)) {
			ToolKits.writeErrorLog("PacketDatag failed");
			bF6 = false;
			return;
		}

		for (int i = 0; i < 10240; i++) {
			bJson[i] = (byte)cJson[i];
		}

		NET_IN_ENCODE_CFG_CAPS stIn = new NET_IN_ENCODE_CFG_CAPS();
		stIn.nChannelId = GlobalSettingActivity.m_nGlobalChn;
		stIn.nStreamType = 0;
		stIn.pchEncodeJson = bJson;
		stOutCfgCaps = new NET_OUT_ENCODE_CFG_CAPS();
		if (!INetSDK.GetDevCaps(TestNetSDKActivity.m_loginHandle, FinalVar.NET_ENCODE_CFG_CAPS, stIn, stOutCfgCaps, 10000)) {
			ToolKits.writeErrorLog("GetDevCaps failed");
			bF6 = false;
			return;
		}

		bF6 = true;
	}

	private void setModeScopeAndShow() {
		// mode scope
		alMode = new ArrayList<String>();
		for (int i = 0; i < strMode.length; i++) {
			if ((nModeMask & (1 << i)) != 0) {
				if (strMode[i].equals("H.264")
						&& (stOutCfgCaps.stuMainFormatCaps[0].nH264ProfileRankNum > 0)) { // profile
					for (int j = 0; j < stOutCfgCaps.stuMainFormatCaps[0].nH264ProfileRankNum; j++) {
						alMode.add(strModeProfile[stOutCfgCaps.stuMainFormatCaps[0].bH264ProfileRank[j] - 1]);
					}
				} else {
					alMode.add(strMode[i]);
				}
			}
		}
		ArrayAdapter<String> apMode = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alMode);
		spMode.setAdapter(apMode);

		// show current mode
		for (int i = 0; i < alMode.size(); i++) {
			if (alMode.get(i).equals(strMode[stEncInfo.stuMainStream[0].stuVideoFormat.emCompression])) {
				spMode.setSelection(i, true);
				break;
			}

			if (CFG_VIDEO_COMPRESSION.VIDEO_FORMAT_H264 == stEncInfo.stuMainStream[0].stuVideoFormat.emCompression) {
				if (stEncInfo.stuMainStream[0].stuVideoFormat.abProfile
						&& alMode.get(i).equals(strModeProfile[stEncInfo.stuMainStream[0].stuVideoFormat.emProfile - 1])) {
					spMode.setSelection(i, true);
					break;
				}
			}
		}
	}

	private void setResolutionScopeAndShow() {
		alResolution = new ArrayList<String>();
		if (bF6) {
			int nModeInd = stEncInfo.stuMainStream[0].stuVideoFormat.emCompression;
			if (nModeInd <= CFG_VIDEO_COMPRESSION.VIDEO_FORMAT_H265) {
				if (stOutCfgCaps.stuMainFormatCaps[0].abIndivResolution) {
					for (int i = 0; i < stOutCfgCaps.stuMainFormatCaps[0].nIndivResolutionNums[nModeInd]; i++) {
						alResolution.add(stOutCfgCaps.stuMainFormatCaps[0].stuIndivResolutionTypes[nModeInd][i].snWidth
								+ "*" + stOutCfgCaps.stuMainFormatCaps[0].stuIndivResolutionTypes[nModeInd][i].snHight);
					}
				} else {
					for (int i = 0; i < stOutCfgCaps.stuMainFormatCaps[0].nResolutionTypeNum; i++) {
						alResolution.add(stOutCfgCaps.stuMainFormatCaps[0].stuResolutionTypes[i].snWidth
								+ "*" + stOutCfgCaps.stuMainFormatCaps[0].stuResolutionTypes[i].snHight);
					}
				}
			}
		} else {
			for (int i = 0; i < strResolution.length && i < 32; i++) {
				if ((nResolutionMask & (1 << i)) != 0) {
					alResolution.add(strResolution[i] + "(" + s_resolution[nVideoStandard][i][0] + "*" + s_resolution[nVideoStandard][i][1] + ")");
				}
			}
		}
		ArrayAdapter<String> apResolution = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alResolution);
		spResolution.setAdapter(apResolution);

		// show current resolution
		SDK_RESOLUTION_INFO stInfo = new SDK_RESOLUTION_INFO();
		stInfo.snWidth = (short)stEncInfo.stuMainStream[0].stuVideoFormat.nWidth;
		stInfo.snHight = (short)stEncInfo.stuMainStream[0].stuVideoFormat.nHeight;
		int index = resolutionToIndex(stInfo);
		if (-1 != index) {
			spResolution.setSelection(index, true);
		}
	}

	private void setFpsScopeAndShow() {
		// scope
		int maxFps = 0;
		if (stOutCfgCaps.stuMainFormatCaps[0].nFPSMax != 0) {
			maxFps = stOutCfgCaps.stuMainFormatCaps[0].nFPSMax;
		} else {
			SDK_RESOLUTION_INFO stInfo = new SDK_RESOLUTION_INFO();
			stInfo.snWidth = (short)stEncInfo.stuMainStream[0].stuVideoFormat.nWidth;
			stInfo.snHight = (short)stEncInfo.stuMainStream[0].stuVideoFormat.nHeight;
			int index = resolutionToIndex(stInfo);
			if (-1 != index) {
				maxFps = stOutCfgCaps.stuMainFormatCaps[0].nResolutionFPSMax[index];
			}
		}

		alFps = new ArrayList<String>();
		if (0 == maxFps) {
			for (int i = 0; i < 25; i++) {
				alFps.add("" + (i + 1));
			}
		} else {
			for (int i = 0; i < maxFps; i++) {
				alFps.add("" + (i + 1));
			}
		}

		ArrayAdapter<String> apFps = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alFps);
		spFps.setAdapter(apFps);

		// show
		if ((int)stEncInfo.stuMainStream[0].stuVideoFormat.nFrameRate <= alFps.size()) {
			spFps.setSelection(((int)stEncInfo.stuMainStream[0].stuVideoFormat.nFrameRate) - 1, true);
		} else {
			if (0 != alFps.size()) {
				spFps.setSelection(alFps.size() - 1, true);
				stEncInfo.stuMainStream[0].stuVideoFormat.nFrameRate = alFps.size();
			}
		}
	}

	private void SetBitRateScopeAndShow() {
		// scope
		Integer min = new Integer(0);
		Integer max = new Integer(0);
		if ((0 == stOutCfgCaps.stuMainFormatCaps[0].nMinBitRateOptions)
				&& (0 == stOutCfgCaps.stuMainFormatCaps[0].nMaxBitRateOptions)) {
			int fps;
			if ((int)stEncInfo.stuMainStream[0].stuVideoFormat.nFrameRate <= alFps.size()) {
				fps = (int)stEncInfo.stuMainStream[0].stuVideoFormat.nFrameRate;
			} else {
				fps = alFps.size();
			}

			int[] nTmp = new int[]{0, 0};
			getBitRateScope(fps, 2 * fps,
					stEncInfo.stuMainStream[0].stuVideoFormat.nWidth,
					stEncInfo.stuMainStream[0].stuVideoFormat.nHeight,
					stEncInfo.stuMainStream[0].stuVideoFormat.emCompression,
					nTmp);
			min = nTmp[0];
			max = nTmp[1];
		} else {
			min = stOutCfgCaps.stuMainFormatCaps[0].nMinBitRateOptions;
			max = stOutCfgCaps.stuMainFormatCaps[0].nMaxBitRateOptions;
		}

		tvBitRateScope.setText(min.intValue() + "~" + max.intValue() + " KB/s");

		alBitRate = new ArrayList<String>();
		for (int i = 0; i < strBitRate.length; i++) {
			if ((Integer.parseInt(strBitRate[i]) >= min.intValue())
					&& (Integer.parseInt(strBitRate[i]) <= max.intValue())) {
				alBitRate.add(strBitRate[i]);
			}
		}

		ArrayAdapter<String> apBitRate = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alBitRate);
		spBitRate.setAdapter(apBitRate);

		// show
		for (int i = 0; i < alBitRate.size(); i++) {
			if (alBitRate.get(i).equals(String.valueOf(stEncInfo.stuMainStream[0].stuVideoFormat.nBitRate))) {
				spBitRate.setSelection(i, true);
				return;
			}
		}
		if (0 != alBitRate.size()) {
			spBitRate.setSelection(alBitRate.size() - 1, true);
			stEncInfo.stuMainStream[0].stuVideoFormat.nBitRate = Integer.parseInt(alBitRate.get(alBitRate.size() - 1));
		}
	}

	private void initSpinners() {
		alMode = new ArrayList<String>();
		ArrayAdapter<String> apMode = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alMode);
		spMode.setAdapter(apMode);

		alResolution = new ArrayList<String>();
		ArrayAdapter<String> apResolution = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alResolution);
		spResolution.setAdapter(apResolution);

		alFps = new ArrayList<String>();
		ArrayAdapter<String> apFps = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alFps);
		spFps.setAdapter(apFps);

		alBitRate = new ArrayList<String>();
		ArrayAdapter<String> apBitRate = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alBitRate);
		spBitRate.setAdapter(apBitRate);
	}

	private Spinner spMode;
	private Spinner spResolution;
	private Spinner spFps;
	private Spinner spBitRate;
	private TextView tvBitRateScope;
	private Button btSet;

	private ArrayList<String> alMode;
	private ArrayList<String> alResolution;
	private ArrayList<String> alFps;
	private ArrayList<String> alBitRate;

	private int nVideoStandard; //0:PAL, 1:NTSC
	private int nModeMask;
	private int nResolutionMask;

	private static final String strMode[] = {"MPEG4", "MS-MPEG4", "MPEG2", "MPEG1", "H.263", "MJPG", "FCC-MPEG4", "H.264", "H.265"};
	private static final String strModeProfile[] ={"H.264 Baseline", "H.264 Main", "H.264 Extended", "H.264 High"};
	private static final String strResolution[] = {"D1", "HD1", "BCIF", "CIF", "QCIF", "VGA", "QVGA", "SVCD",
			"QQVGA", "SVGA", "XVGA", "WXGA", "SXGA", "WSXGA", "UXGA", "WUXGA",
			"LFT", "720", "1080", "1_3M", "2_5M", "5M", "3M", "5_0M",
			"1_2M", "1408_1024", "8M", "2560_1920", "960H", "960_720", "NHD", "QNHD", "QQNHD"};
	private static final String strBitRate[] = {"10", "20", "32", "48", "64", "80", "96", "128", "160", "192", "224",
			"256", "320", "384", "448", "512", "640", "768", "896", "1024", "1280",
			"1536", "1792", "2048", "4096", "6144", "8192", "10240", "12288", "14336", "16384"};

	SDKDEV_DSP_ENCODECAP stEncodeCapOld = new SDKDEV_DSP_ENCODECAP();
	CFG_DSPENCODECAP_INFO stEncodeCapNew = new CFG_DSPENCODECAP_INFO();
	CFG_ENCODE_INFO stEncInfo = new CFG_ENCODE_INFO();
	NET_OUT_ENCODE_CFG_CAPS stOutCfgCaps;

	private static final int MIN_CIF_PFRAME_SIZE = 7;
	private static final int MAX_CIF_PFRAME_SIZE = 40;
	private static final int IFRAME_PFRAME_QUOTIENT = 3;

	private static final short s_resolution[][][] = new short[][][]{
			// pal
			{{704,	576},
					{352,	576},
					{704,	288},
					{352,	288},
					{176,	144},
					{640,	480},
					{320,	240},
					{480,	480},
					{160,	128},
					{800,	592},
					{1024,	768},
					{1280,	800},
					{1280,	1024},
					{1600,	1024},
					{1600,	1200},
					{1900,	1200},
					{240,	192},
					{1280,	720},
					{1920,	1080},
					{1280,	960},
					{1872,	1408},
					{3744,	1408},
					{2048,	1536},
					{2432,	2050},
					{1216,	1024},
					{1408,	1024},
					{3296,	2472},
					{2560,	1920},
					{960,	576},
					{60,   720},
					{640,   360},
					{320,   180},
					{160,   90}},

			// ntsc
			{{704,	480},
					{352,	480},
					{704,	240},
					{352,	240},
					{176,	120},
					{640,	480},
					{320,	240},
					{480,	480},
					{160,	128},
					{800,	592},
					{1024,	768},
					{1280,	800},
					{1280,	1024},
					{1600,	1024},
					{1600,	1200},
					{1900,	1200},
					{240,	192},
					{1280,	720},
					{1920,	1080},
					{1280,	960},
					{1872,	1408},
					{3744,	1408},
					{2048,	1536},
					{2432,	2050},
					{1216,	1024},
					{1408,	1024},
					{296,	2472},
					{2560,	1920},
					{960,	480},
					{60,   720},
					{640,   360},
					{320,   180},
					{160,   90}}
	};

	Resources res;
	private boolean bF6 = false;
}
