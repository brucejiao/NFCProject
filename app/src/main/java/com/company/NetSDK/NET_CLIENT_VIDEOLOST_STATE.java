package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Struct of video loss alarm
 * \else
 * ��Ƶ��ʧ����״̬��Ϣ��Ӧ�ṹ��
 * \endif
 */
public class NET_CLIENT_VIDEOLOST_STATE implements Serializable {	
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
	public int				   channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for alarm status of channel 0-31. 0-No alarm��1-Have alarm 
	 * \else
	 * ÿһ��int��λ��ʾ32ͨ���ı���״̬, 0-��ʾ�ޱ���, 1-��ʾ�б���
	 * \endif
	 */
	public int           	   dwAlarmState[] = new int[FinalVar.SDK_MAX_CHANMASK]; 
}
