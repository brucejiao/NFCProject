package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * (Wireless) Infrared Alarm Configuration
 * \else
 * (����)���ⱨ������
 * \endif
 */
public class SDK_INFRARED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ��������ʹ��
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Input Name
	 * \else
	 * ������������
	 * \endif
	 */
	public byte                szAlarmName[] = new byte[FinalVar.SDK_MAX_ALARM_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm In Pattern
	 * \else
	 * ���������벨��
	 * \endif
	 */
	public int                 nAlarmInPattern;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmOutPattern
	 * \else
	 * �����������
	 * \endif
	 */
	public int                 nAlarmOutPattern;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmInAddress
	 * \else
	 * ���������ַ
	 * \endif
	 */
	public byte                szAlarmInAddress[] = new byte[FinalVar.SDK_MAX_ALARM_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * SensorType, normal open or normal close
	 * \else
	 * �ⲿ�豸���������ͳ��� or ����
	 * \endif
	 */
	public int                 nSensorType;
	
	/**
	 * \if ENGLISH_LANG
	 * DefendEfectTime
	 * \else
	 * ��������ʱʱ�䣬�ڴ�ʱ���ñ���������Ч
	 * \endif
	 */
	public int                 nDefendEfectTime;
	
	/**
	 * \if ENGLISH_LANG
	 * DefendAreaType
	 * \else
	 * ��������
	 * \endif
	 */
	public int                 nDefendAreaType;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmSmoothTime
	 * \else
	 * ����ƽ��ʱ�䣬���ڴ�ʱ�������ֻ��һ��������������������������Ե�����һ��
	 * \endif
	 */
	public int                 nAlarmSmoothTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Schedule
	 * \else
	 * ʱ���
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Handle Mode
	 * \else
	 * ����ʽ
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
	
	public SDK_INFRARED_INFO() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
