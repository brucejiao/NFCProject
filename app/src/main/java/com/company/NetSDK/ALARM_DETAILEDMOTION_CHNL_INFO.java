package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Detailed Motion Detection Alarm Info
 * \else
 * ��ϸ���챨����Ϣ
 * \endif
 */

public class ALARM_DETAILEDMOTION_CHNL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No. 
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * If Alarm TRUE/FALSE 
	 * \else
	 * �Ƿ񱨾� TRUE/FALSE
	 * \endif
	 */
	public boolean               bAlarm;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Level,Unit ,Calculate By the Small Grid Numbers of Motion Detect Divide Total Numbers of Small Grid
	 * \else
	 * �������𣬵�λǧ��֮���Զ��췢��С����������С��������
	 * \endif
	 */
	public int                nLevel;        
}
