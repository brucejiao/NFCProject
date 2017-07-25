package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of speed limit (SDK_DEVSTATE_SPEED_LIMIT)
 * \else
 * ���ٱ�����·�����ٱ��� (SDK_DEVSTATE_SPEED_LIMIT)
 * \endif
 */
public class ALARM_SPEED_LIMIT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * alarm type oLowerSpeed, UpperSpeed	
	 * \else
	 * ���ٱ������LowerSpeed, UpperSpeed
	 * \endif
	 */
	public byte                szType[] = new byte[FinalVar.SDK_SPEEDLIMIT_TYPE_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * limit speed KM/H 
	 * \else
	 * ���� ��λKM/H 
	 * \endif
	 */
	public int                 iSpeedLimit;
	
 	/**
	 * \if ENGLISH_LANG
	 * speed KM/H
	 * \else
	 * �ٶ� ��λKM/H
	 * \endif
	 */
	public int                 iSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * crossing ID
	 * \else
	 * ·�����к�
	 * \endif
	 */
	public byte                szCrossingID[] = new byte[FinalVar.SDK_MAX_CROSSING_ID];
	
 	/**
	 * \if ENGLISH_LANG
	 * longitude(millionth degree, 0-360)
	 * \else
	 * ����(��λ�ǰ����֮�ȣ���Χ0-360��)�綫��120.178274�ȱ�ʾΪ300178274
	 * \endif
	 */
	public int                 dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * latidude(millionth degree,0-180)
	 * \else
	 * γ��(��λ�ǰ����֮�ȣ���Χ0-180��)�籱γ30.183382�ȱ�ʾΪ120183382
	 * \endif
	 */
	public int                 dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
	public SDKDEVTIME          stTime = new SDKDEVTIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-in real time,1-to fill 
	 * \else
	 * 0-ʵʱ 1-���� 
	 * \endif
	 */
	public byte                bOffline;
}
