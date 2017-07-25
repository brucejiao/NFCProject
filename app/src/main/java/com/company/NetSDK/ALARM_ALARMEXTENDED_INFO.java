package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extension Module Alarm Event
 * \else
 * ��չģ�鱨���¼�
 * \endif
 */
public class ALARM_ALARMEXTENDED_INFO implements Serializable {
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
	 * 0:start 1:stop
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
}
