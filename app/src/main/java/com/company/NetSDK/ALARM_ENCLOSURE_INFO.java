package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Electronic Fence Alarm
 * \else
 * ����Χ������
 * \endif
 */
public class ALARM_ENCLOSURE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Effective Electronic Fence Types Number 
	 * \else
	 * ��Ч����Χ�����͸���
	 * \endif
	 */
	public int           nTypeNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * Electronic Fence Type, Details As Follows ENCLOSURE_TYPE
	 * \else
	 * ����Χ������, ��ENCLOSURE_TYPE
	 * \endif
	 */
	public byte          bType[] = new byte[16];
	
 	/**
	 * \if ENGLISH_LANG
	 * The Effective Alarm Types Number 
	 * \else
	 * ��Ч�������͸���
	 * \endif
	 */
	public int           nAlarmTypeNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Types��Details As Follows  ENCLOSURE_ALARM_TYPE
	 * \else
	 * �������ͣ��� ENCLOSURE_ALARM_TYPE
	 * \endif
	 */
	public byte          bAlarmType[] = new byte[16];
	
 	/**
	 * \if ENGLISH_LANG
	 * Driver Job Number 
	 * \else
	 * ˾������
	 * \endif
	 */
	public byte          szDriverId[] = new byte[FinalVar.SDK_VEHICLE_DRIVERNO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Electronic FenceID 
	 * \else
	 * ����Χ��ID
	 * \endif
	 */
	public int          unEnclosureId;
	
 	/**
	 * \if ENGLISH_LANG
	 * Speed Limit��Unit km/h 
	 * \else
	 * ���٣���λkm/h
	 * \endif
	 */
	public int          unLimitSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Current Speed 
	 * \else
	 * ��ǰ�ٶ�
	 * \endif
	 */
	public int          unCurrentSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Occuring time 
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
	public NET_TIME      stAlarmTime;
	
 	/**
	 * \if ENGLISH_LANG
	 * Longitude(Unit is 1/1,000,000�㣬Ranges From 0-360��)As East Longitude120.178274��Means 300178274 
	 * \else
	 * ����(��λ�ǰ����֮�ȣ���Χ0-360��)�綫��120.178274�ȱ�ʾΪ300178274
	 * \endif
	 */
	public int         dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * Latitude(Unit is 1/1,000,000�㣬Ranges From0-180��)As North Latitude 30.183382��Means120183382 
	 * \else
	 * γ��(��λ�ǰ����֮�ȣ���Χ0-180��)�籱γ30.183382�ȱ�ʾΪ120183382
	 * \endif
	 */
	public int         dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-live 1-send 
	 * \else
	 * 0-ʵʱ 1-���� 
	 * \endif
	 */
	public byte          bOffline;
}
