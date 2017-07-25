package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New audio detection alarm
 * \else
 * �µ���Ƶ��ⱨ����Ϣ
 * \endif
 */
public class SDK_NEW_SOUND_ALARM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * The alarm channel number 
	 * \else
	 * ������ͨ������
	 * \endif
	 */
	public int                         channelcount;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm information
	 * \else
	 * ������Ϣ 
	 * \endif
	 */
	public NET_NEW_SOUND_ALARM_STATE   SoundAlarmInfo[] = new NET_NEW_SOUND_ALARM_STATE[FinalVar.SDK_MAX_ALARM_IN_NUM];
	
	public SDK_NEW_SOUND_ALARM_STATE() {
		for (int i = 0; i < FinalVar.SDK_MAX_ALARM_IN_NUM; i++) {
			SoundAlarmInfo[i] = new NET_NEW_SOUND_ALARM_STATE();
		}
	}
}
