package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice interface SDK_CTRL_WIFI_BY_WPS command parameter(WPS rapid configuration WIFI)
 * \else
 * INetSDK.ControlDevice�ӿڵ�SDK_CTRL_WIFI_BY_WPS�������(WPS��������WIFI)
 * \endif
 */
public class SDKCTRL_CONNECT_WIFI_BYWPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * connect parameter(user to fill in)
	 * \else
	 * ���Ӳ���(���û���д)
	 * \endif
	 */
	public SDKCTRL_CONNECT_WIFI_BYWPS_IN     	stuWpsInfo = new SDKCTRL_CONNECT_WIFI_BYWPS_IN(); 
	
	/**
	 * \if ENGLISH_LANG
	 * return data(device to return to)
	 * \else
	 * ��������(���豸����)
	 * \endif
	 */
	public SDKCTRL_CONNECT_WIFI_BYWPS_OUT    	stuWpsResult = new SDKCTRL_CONNECT_WIFI_BYWPS_OUT();
}
