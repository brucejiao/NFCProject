package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arm disarm state info
 * \else
 * ����������״̬��Ϣ
 * \endif
 */
public class ALARM_ARM_DISARM_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Arm-disarm,0 means disarm,1 means arm, 2 means ForceOn
	 * \else
	 * ������״̬��0��ʾ������1��ʾ������2��ʾǿ�Ʋ���
	 * \endif
	 */
	public byte                bState;
}
