package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Arming/Disarming Status Change Event Info
 * \else
 * ������״̬�仯�¼�����Ϣ
 * \endif
 */
public class ALARM_ARMMODE_CHANGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * �����¼�������ʱ��
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Status After Change {@link com.company.NetSDK.NET_ALARM_MODE NET_ALARM_MODE}
	 * \else
	 * �仯���״̬ {@link com.company.NetSDK.NET_ALARM_MODE NET_ALARM_MODE}
	 * \endif
	 */
	public int                 bArm;
	
	/**
	 * \if ENGLISH_LANG
	 * Scene Mode {@link com.company.NetSDK.NET_SCENE_MODE NET_SCENE_MODE}
	 * \else
	 * �龰ģʽ {@link com.company.NetSDK.NET_SCENE_MODE NET_SCENE_MODE}
	 * \endif
	 */
	public int                 emSceneMode;
	
	/**
	 * \if ENGLISH_LANG
	 * ID number, remote control number or keypad address, emTriggerMode=0 when  belong to NET_EM_TRIGGER_MODE_NET
	 * \else
	 * ID��, ң������Ż���̵�ַ, emTriggerModeΪNET_EM_TRIGGER_MODE_NET����ʱΪ0
	 * \endif
	 */
	public int                 dwID; 
	
	/**
	 * \if ENGLISH_LANG
	 * trigger mode, NET_EM_TRIGGER_MODE
	 * \else
	 * ������ʽ, NET_EM_TRIGGER_MODE
	 * \endif
	 */
	public int                 emTriggerMode; 
}
