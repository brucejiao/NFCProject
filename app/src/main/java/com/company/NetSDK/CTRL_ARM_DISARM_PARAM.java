package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arm and disarm control
 * \else
 * ��������������, INetSDK.ControlDevice(SDK_CTRL_ARMED)
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Arm/disarm state, 0 means disarm, 1 means arm, 2 means forced arm
	 * \else
	 * ������״̬��0��ʾ������1��ʾ������2��ʾǿ�Ʋ���
	 * \endif
	 */
	public byte             bState; 
	
	/**
	 * \if ENGLISH_LANG
	 * User's Password
	 * \else
	 * �û�����
	 * \endif
	 */
	public String			szDevPwd; 
	
	/**
	 * \if ENGLISH_LANG
	 * Contextual Mode, NET_SCENE_MODE
	 * \else
	 * �龰ģʽ, NET_SCENE_MODE
	 * \endif
	 */
	public int 	            emSceneMode; 
	
	/**
	 * \if ENGLISH_LANG
	 * Forwarding the Target Device ID,Null=Non Forward
	 * \else
	 * ת��Ŀ���豸ID,ΪNULL��ʾ��ת��
	 * \endif
	 */
	public String			szDevID; 
}
