package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Fatigue Driving Alarm
 * \else
 * ƣ�ͼ�ʻ����
 * \endif
 */
public class ALARM_TIREDDRIVE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * struct size
	 * \else
	 * 0:��ʼ 1:ֹͣ
	 * \endif
	 */
	public int               nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start
	 * \else
	 * ������ʻʱ�䣬��λ����
	 * \endif
	 */
	public int               nDriveTime;
	
 	/**
	 * \if ENGLISH_LANG
	 * drive time, unit:minute
	 * \else
	 * �¼�����ʱ��
	 * \endif
	 */
	public NET_TIME          stTime = new NET_TIME();
}
