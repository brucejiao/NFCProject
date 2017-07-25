package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New audio detect alarm
 * \else
 * ����Ƶ��ⱨ����Ϣ
 * \endif
 */
public class NET_NEW_SOUND_ALARM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel No. 
	 * \else
	 * ����ͨ����
	 * \endif
	 */
	public int                 channel;                        
	/**
	 * \if ENGLISH_LANG
	 * Alarm type��0��Audio value is too long��1��Audio value is too high 
	 * \else
	 * �������ͣ�0����Ƶֵ���ͣ�1����Ƶֵ����
	 * \endif
	 */
	public int                 alarmType;                      
	/**
	 * \if ENGLISH_LANG
	 * Volume value 
	 * \else
	 * ����ֵ
	 * \endif
	 */
	public int        			volume;                        
	/**
	 * \if ENGLISH_LANG
	 * Audio alarm status, 0:Audio alarm occurred , 1: Audio alarm disappear 
	 * \else
	 * ��Ƶ����״̬, 0: ��Ƶ��������, 1: ��Ƶ������ʧ
	 * \endif
	 */
	public byte                byState;                        
}
