package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Sub System Status, INetSDK.QueryDevStatecorresponding to command SDK_DEVSTATE_ALARMSUBSYSTEM_STATE
 * \else
 * ������ϵͳ״̬, INetSDK.QueryDevState��Ӧ����SDK_DEVSTATE_ALARMSUBSYSTEM_STATE
 * \endif
 */
public class NET_ALARM_SUBSYSTEM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Valid Sub System Number
	 * \else
	 * ��Ч��ϵͳ����
	 * \endif
	 */
	public int		nMaxAlarmSubSystem;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub System Status Info, EM_ALARM_SUBSYSTEM_STATE_TYPE
	 * \else
	 * ��ϵͳ״̬��Ϣ, EM_ALARM_SUBSYSTEM_STATE_TYPE
	 * \endif
	 */
	public int emState[] = new int[FinalVar.SDK_MAX_ALARM_SUBSYSTEM_NUM];  
}
