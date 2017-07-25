package com.company.NetSDK;

import java.io.Serializable;


public class SDKCTRL_CONNECT_WIFI_BYWPS_OUT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * return pin,when WPS's connect type is device end,this parameter is valid.
	 * \else
	 * �����豸PIN�룬��WPS��������Ϊ(�豸��)pin�뷽ʽʱ�����������Ч
	 * \endif
	 */
	public byte            	szRetWLanPin[] = new byte[FinalVar.SDK_MAX_APPIN_LEN];
}
