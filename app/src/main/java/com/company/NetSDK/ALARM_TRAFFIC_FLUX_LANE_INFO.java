package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flux alarm channel information
 * \else
 * ����ͳ�Ʊ���ͨ����Ϣ
 * \endif
 */
public class ALARM_TRAFFIC_FLUX_LANE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * current time
	 * \else
	 * ��ǰʱ��
	 * \endif
	 */
	public NET_TIME            stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * lane number
	 * \else
	 * ������
	 * \endif
	 */
	public int                 nLane;
	
 	/**
	 * \if ENGLISH_LANG
	 * state:1-traffic jam, 2-traffic jam recover, 3-normal 4-break, 5-break recover
	 * \else
	 * ״ֵ̬��1-��ʾӵ��, 2-��ʾӵ�»ָ�, 3-��ʾ����, 4-��ʾ�ж�, 5-��ʾ�жϻָ�
	 * \endif
	 */
	public int                 nState;
	
 	/**
	 * \if ENGLISH_LANG
	 * flow value,unit:per/second
	 * \else
	 * ����ֵ����λ����/��
	 * \endif
	 */
	public int                 nFlow;
}
