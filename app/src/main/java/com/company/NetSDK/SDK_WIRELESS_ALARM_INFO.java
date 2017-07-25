package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The structure of the wireless alarm capability
 * \else
 * ���߱��������ṹ��
 * \endif
 */
public class SDK_WIRELESS_ALARM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support the 
	 * \else
	 * �Ƿ�֧��
	 * \endif
	 */
	public boolean		bSupport;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of alarm inputs 
	 * \else
	 * �������
	 * \endif
	 */
	public int			nAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of alarm output 
	 * \else
	 * �������
	 * \endif
	 */
	public int			nAlarmOutCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The number of the remote control 
	 * \else
	 * ң��������
	 * \endif
	 */
	public int			nRemoteAddrCount;
}
