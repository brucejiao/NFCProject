package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless remote configuration
 * \else
 * ����ң��������
 * \endif
 */
public class SDK_WI_CONFIG_ROBOT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The address of the remote control
	 * \else
	 * ң������ַ
	 * \endif
	 */
	public byte                address[] = new byte[FinalVar.ALARM_MAX_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * The name of the remote control
	 * \else
	 * ң��������
	 * \endif
	 */
	public byte                name[] = new byte[FinalVar.ALARM_MAX_NAME];           // ң��������
}
