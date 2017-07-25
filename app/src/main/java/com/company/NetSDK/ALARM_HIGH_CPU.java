package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * larm of High CPU Occupancy rate, temporarily we set the max limit as 95%
 * \else
 * CPUռ���ʹ����¼��������ݶ�����95%��
 * \endif
 */
public class ALARM_HIGH_CPU implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0: Stop, 1: start
	 * \else
	 * 0��ֹͣ�� 1����ʼ
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1000 times of  CPU Occupancy rate
	 * \else
	 * CPUռ���ʵ�1000��
	 * \endif
	 */
	public int      nUsed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event occurrence time
	 * \else
	 * �¼�����ʱ��    
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();         
}
