package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding structure of motion detect alarm status info
 * \else
 * ��̬��ⱨ��״̬��Ϣ��Ӧ�ṹ��
 * \endif
 */
public class NET_CLIENT_MOTIONDETECT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * ͨ������
	 * \endif
	 */
	public int				channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * DWORD value is the state by bit of 32 channels,0-no alarm,1-alarm
	 * \else
	 * ÿһ��int��λ��ʾ32ͨ���ı���״̬, 0-��ʾ�ޱ���, 1-��ʾ�б���
	 * \endif
	 */
	public int              dwAlarmState[] = new int[FinalVar.SDK_MAX_CHANMASK];
}
