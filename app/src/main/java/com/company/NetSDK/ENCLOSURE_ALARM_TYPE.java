package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Types
 * \else
 * ��������
 * \endif
 */
public class ENCLOSURE_ALARM_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Drive In
	 * \else
	 * ʻ��
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_DRIVEIN = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * Drive Out
	 * \else
	 * ʻ��
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_DRIVEOUT = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overspeed
	 * \else
	 * ����
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_OVERSPEED = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overspeed Disapper
	 * \else
	 * ������ʧ
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_SPEEDCLEAR = 3;
}
