package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm configuration
 * \else
 * ��������
 * \endif
 */
public class CFG_ALARMBELL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Duty cycle
	 * \else
	 * �����������ʱ��, ��λ: ����(0-99), 0 ��ʾ��һ�¾�ֹͣ
	 * \endif
	 */
	public int nPersistentTime;
}
