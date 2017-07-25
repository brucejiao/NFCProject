package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Camera Displacement Alarm Event Struction
 * \else
 * �������λ�����¼�
 * \endif
 */
public class ALARM_CAMERA_MOVE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Alarming Channel Numbers 
	 * \else
	 * ��������ͨ����
	 * \endif
	 */
	public int                         nChannelNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarming Channel Info 
	 * \else
	 * ��������ͨ������Ϣ
	 * \endif
	 */
	public byte               alarmChannels[] = new byte[FinalVar.SDK_MAX_CHANNUM_EX];
}
