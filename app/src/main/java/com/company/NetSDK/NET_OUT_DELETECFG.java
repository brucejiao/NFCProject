package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_DELETECFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The error code device returns
	 * \else
	 * �豸���صĴ�����
	 * \endif
	 */
	public int           nError;

	/**
	 * \if ENGLISH_LANG
	 * Device reboot or not
	 * \else
	 * �豸�Ƿ�����
	 * \endif
	 */
	public int           nRestart;

	/**
	 * \if ENGLISH_LANG
	 * Option. Please refer to enumeration NET_EM_CONFIGOPTION
	 * \else
	 * ѡ�� �����ö��NET_EM_CONFIGOPTION
	 * \endif
	 */
	public int         dwOptionMask;
}
