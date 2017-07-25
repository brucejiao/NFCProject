package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Local Alarm Event(��SDK_ALARM_ALARM_EX upgrade)
 * \else
 * ���ر����¼�(��SDK_ALARM_ALARM_EX����)
 * \endif
 */
public class ALARM_ALARM_INFO_EX2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * 0: start 1: stop
	 * \else
	 * 0:��ʼ 1:ֹͣ
	 * \endif
	 */
	public int                 nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * �����¼�������ʱ��
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Sensor Type {@link com.company.NetSDK.NET_SENSE_METHOD NET_SENSE_METHOD}
	 * \else
	 * ���������� {@link com.company.NetSDK.NET_SENSE_METHOD NET_SENSE_METHOD}
	 * \endif
	 */
	public int                 emSenseType;
}
