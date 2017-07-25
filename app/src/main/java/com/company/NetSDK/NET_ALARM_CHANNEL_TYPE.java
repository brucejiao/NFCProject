package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding INetSDK.QueryDevState() Interface's SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE Command Parameter 
 * \else
 * ��ӦINetSDK.QueryDevState()�ӿڵ� SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE�������
 * ��ȡ����ͨ��״̬
 * \endif
 */
public class NET_ALARM_CHANNEL_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All channels (including all of the following)
	 * \else
	 * ����ͨ���������������У�
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALL = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input channel 
	 * \else
	 * ��������ͨ��
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMIN = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output channel 
	 * \else
	 * �������ͨ��
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMOUT = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Signal channel 
	 * \else
	 * ����ͨ��
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMBELL = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * Extension module alarm input channel 
	 * \else
	 * ��չģ�鱨������ͨ��
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_EXALARMIN = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * Extension module and alarm output channel
	 * \else
	 * ��չģ�鱨�����ͨ��
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_EXALARMOUT = 5; 
}
