package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Battery Voltage Overlow Alarm
 * \else
 * ��ص�ѹ���ͱ���
 * \endif
 */
public class ALARM_BATTERYLOWPOWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:Start 1:Stop 
	 * \else
	 * 0:��ʼ 1:ֹͣ
	 * \endif
	 */
	public int               nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * Surplus Power %��Unit%
	 * \else
	 * ʣ������ٷֱȣ���λ%
	 * \endif
	 */
	public int               nBatteryLeft;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Time 
	 * \else
	 * �¼�����ʱ��
	 * \endif
	 */
	public NET_TIME          stTime = new NET_TIME();                            
}
