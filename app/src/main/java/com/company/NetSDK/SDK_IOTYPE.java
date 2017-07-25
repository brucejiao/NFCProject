package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IO control command. Corresponding to QueryIOControlState
 * \else
 * IO���������Ӧ  QueryIOControlState�ӿ�
 * \endif
 */
public class SDK_IOTYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Control alarm input 
	 * \else
	 * ���Ʊ�������
	 * \endif
	 */
	public static final int     SDK_ALARMINPUT = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Control alarm output 
	 * \else
	 * ���Ʊ������
	 * \endif
	 */
	public static final int     SDK_ALARMOUTPUT = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Control alarm decoder output
	 * \else
	 * ���Ʊ������������
	 * \endif
	 */
	public static final int     SDK_DECODER_ALARMOUT = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Control wireless alarm output 
	 * \else
	 * �������߱������
	 * \endif
	 */
	public static final int     SDK_WIRELESS_ALARMOUT = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm activation type(auto/manual/close). Use TRIGGER_MODE_CONTROL structure
	 * \else
	 * ����������ʽ���ֶ�,�Զ�,�رգ���ʹ�� TRIGGER_MODE_CONTROL �ṹ��
	 * \endif
	 */
	public static final int     SDK_ALARM_TRIGGER_MODE = 7;
}
