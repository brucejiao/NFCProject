package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Failure Status, Input Parameter
 * \else
 * ��������״̬, �������
 * \endif
 */
public class NET_IN_ALARM_FAULT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Type to search, EM_ALARM_FAULT_STATE_TYPE
	 * \else
	 * ����ѯ������, EM_ALARM_FAULT_STATE_TYPE
	 * \endif
	 */
	public int  emType;
}