package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm status
 * \else
 * ����״̬
 * \endif
 */
public class ALARMCTRL_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel. It begins from 0. 
	 * \else
	 * ����ͨ���ţ���0��ʼ
	 * \endif
	 */
	public int					nAlarmNo;
	
	/**
	 * \if ENGLISH_LANG
	 * 1:activate alarm,0:stop alarm  
	 * \else
	 * 1������������0��ֹͣ����
	 * \endif
	 */
	public int					nAction;
}
