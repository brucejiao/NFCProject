package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * No HDD Alarm Linkage Configuration 
 * \else
 * ��Ӳ�̱�����������
 * \endif
 */
public class CFG_STORAGENOEXIST_INFO implements Serializable {
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
	public boolean				 bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Handler 
	 * \else
	 * ��������
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();							    
}