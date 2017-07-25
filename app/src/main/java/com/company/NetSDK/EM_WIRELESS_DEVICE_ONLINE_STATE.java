package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless device online type
 * \else
 * / �����豸����״̬����
 * \endif
 */
public class EM_WIRELESS_DEVICE_ONLINE_STATE implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown type
	 * \else
	 * / δ֪
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_STATE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Out line
	 * \else
	 * / ����
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_STATE_OUTLINE = 1;           
	
	/**
	 * \if ENGLISH_LANG
	 * Online
	 * \else
	 * / ����
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_STATE_ONLINE = 2;           
}
