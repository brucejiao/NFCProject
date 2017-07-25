package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fire alarm
 * \else
 * �𾯱���
 * \endif
 */
public class SDKDEV_FIRE_ALARM_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * �𾯱���ʱ�ܣ�
	 * \endif
	 */
	public boolean                byFireEn; 
	
	/**
	 * \if ENGLISH_LANG
	 * handler
	 * \else
	 * ����ʽ
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX(); 
}
