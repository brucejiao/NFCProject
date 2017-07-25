package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Limit HDD Alarm Linkage Configuration
 * \else
 * �洢�豸�ռ䲻�㱨������
 * \endif
 */
public class CFG_STORAGELOWSAPCE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ�ܿ���
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Lower Limit, Percentage(0~99) 
	 * \else
	 * Ӳ��ʣ���������ޣ��ٷ���(0~99)
	 * \endif
	 */
	public int					nLowerLimit;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Handler 
	 * \else
	 * ��������	
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();
}
