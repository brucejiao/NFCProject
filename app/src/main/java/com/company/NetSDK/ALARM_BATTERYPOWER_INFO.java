package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * battery scheduled notice event
 * \else
 * ��ص�����ʱ֪ͨ�¼�
 * \endif
 */
public class ALARM_BATTERYPOWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * battery no.
	 * \else
	 * ������
	 * \endif
	 */
	public int 		  nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * event time
	 * \else
	 * �¼�ʱ��
	 * \endif
	 */
	public NET_TIME   stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * battery percentage
	 * \else
	 * ��ص����ٷֱ�
	 * \endif
	 */
	public int        nPercent;
}
