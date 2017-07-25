package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_ALARM_LOCALALARM and EVENT_ALARM_MOTIONALARM's data
 * \else
 * �����¼����� EVENT_ALARM_LOCALALARM(�ⲿ����)��EVENT_ALARM_MOTIONALARM(���챨��)����)
 * \endif
 */
public class DEV_EVENT_ALARM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * evnent name
	 * \else
	 * �¼�����
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * ʱ���(��λ�Ǻ���)
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * �¼�������ʱ��
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * evnet ID 
	 * \else
	 * �¼�ID
	 * \endif
	 */
	public int                 nEventID;
}
