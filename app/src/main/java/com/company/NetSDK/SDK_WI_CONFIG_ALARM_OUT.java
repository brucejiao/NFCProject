package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless alarm output configuration
 * \else
 * ���߱����������
 * \endif
 */
public class SDK_WI_CONFIG_ALARM_OUT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm output address
	 * \else
	 * ���������ַ
	 * \endif
	 */
	public byte                address[] = new byte[FinalVar.ALARM_MAX_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * Name of alarm output
	 * \else
	 * �����������
	 * \endif
	 */
	public byte                name[] = new byte[FinalVar.ALARM_MAX_NAME];
}
