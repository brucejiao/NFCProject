package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm channel number
 * \else
 * ����ͨ����
 * \endif
 */
public class NET_ALARM_CHANNEL_COUNT implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Local alarm input channel no.
	 * \else
	 * ���ر�������ͨ����
	 * \endif
	 */
	public int nLocalAlarmIn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Local alarm output channel no.
	 * \else
	 * ���ر������ͨ����
	 * \endif
	 */
	public int nLocalAlarmOut;
	
 	/**
	 * \if ENGLISH_LANG
	 * Remote alarm input channel no.
	 * \else
	 * Զ�̱�������ͨ����
	 * \endif
	 */
	public int nRemoteAlarmIn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Remote alarm output channel no.
	 * \else
	 * Զ�̱������ͨ����
	 * \endif
	 */
	public int nRemoteAlarmOut;
}