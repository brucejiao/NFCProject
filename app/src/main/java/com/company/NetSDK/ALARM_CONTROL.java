package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm IO control
 * \else
 * ����������
 * \endif
 */
public class ALARM_CONTROL implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �˿����
	 * \endif
	 */
	public short		index;
	
	/**
	 * \if ENGLISH_LANG
	 * Port status
	 * \else
	 * �˿�״̬
	 * \endif
	 */
	public short		state;
}
