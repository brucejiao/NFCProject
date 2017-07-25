package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Arm/Disarm Mode
 * \else
 * ������ģʽ
 * \endif
 */
public class NET_ALARM_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * δ֪
	 * \endif
	 */
	public static final int NET_ALARM_MODE_UNKNOWN = -1;
	
	/**
	 * \if ENGLISH_LANG
	 * Disarm
	 * \else
	 * ����
	 * \endif
	 */
	public static final int NET_ALARM_MODE_DISARMING = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Arm
	 * \else
	 * ����
	 * \endif
	 */
	public static final int NET_ALARM_MODE_ARMING = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Enhanced Arm
	 * \else
	 * ǿ�Ʋ���
	 * \endif
	 */
	public static final int NET_ALARM_MODE_FORCEON = 2;
}
