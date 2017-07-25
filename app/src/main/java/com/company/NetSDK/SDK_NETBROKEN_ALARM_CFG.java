package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network Anomaly alarm
 * \else
 * �����쳣����
 * \endif
 */
public class SDK_NETBROKEN_ALARM_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public byte               byEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Message
	 * \else
	 * ��Ϣ
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
}
