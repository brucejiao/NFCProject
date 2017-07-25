package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Network disconnection callback function original shape
 * \else
 * 网络断线处理接口
 * \endif
 */
public interface CB_fDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * \else
	 * 网络断线回调函数
	 * @param lLoginID 登录句柄,
	 * @param pchDVRIP 设备IP
	 * @param nDVRPort 设备端口
	 * \endif
	 */
	public void invoke(long lLoginID, String pchDVRIP, int nDVRPort);
}