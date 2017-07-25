package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Sub System Status Type
 * \else
 * ������ϵͳ״̬����
 * \endif
 */
public class EM_ALARM_SUBSYSTEM_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unkown
	 * \else
	 * δ֪
	 * \endif
	 */
	public static final int ALARM_SUBSYSTEM_STATE_UNKNOWN 			= 		0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Activated
	 * \else
	 * �Ѽ���
	 * \endif
	 */
	public static final int ALARM_SUBSYSTEM_STATE_ACTIVE 			= 		1 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Not activated
	 * \else
	 * δ����
	 * \endif
	 */
	public static final int	ALARM_SUBSYSTEM_STATE_INACTIVE 			=     	2 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Not distributed
	 * \else
	 * δ����
	 * \endif
	 */
	public static final int	ALARM_SUBSYSTEM_STATE_UNDISTRIBUTED     =     	3 ;
}
