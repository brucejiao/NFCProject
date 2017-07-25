package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * �ⲿ����״̬��Ϣ��Ӧ�ṹ��
 * \endif
 */
public class NET_CLIENT_ALARM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm input amount
	 * \else
	 * �����������
	 * \endif
	 */
	public int				  alarminputcount;
	
	/**
	 * \if ENGLISH_LANG
	 * DWORD value is the state by bit of 32 channels,0-no alarm,1-alarm
	 * \else
	 * ÿһ��DWORD��λ��ʾ32ͨ���ı���״̬, 0-��ʾ�ޱ���, 1-��ʾ�б���
	 * \endif
	 */
	public int                dwAlarmState[] = new int[FinalVar.SDK_MAX_CHANMASK]; 
}
