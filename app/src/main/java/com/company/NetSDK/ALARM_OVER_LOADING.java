package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of over loading
 * \else
 * ���ر���
 * \endif
 */
public class ALARM_OVER_LOADING implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * current time
	 * \else
	 * ��ǰʱ��
	 * \endif
	 */
	public NET_TIME            stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * latidude(millionth degree,0-180)
	 * \else
	 * γ��(��λ�ǰ����֮�ȣ���Χ0-180��)�籱γ30.183382�ȱ�ʾΪ120183382
	 * \endif
	 */
	public int               dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * longitude(millionth degree, 0-360)
	 * \else
	 * ����(��λ�ǰ����֮�ȣ���Χ0-360��)�綫��120.178274�ȱ�ʾΪ300178274
	 * \endif
	 */
	public int               dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * driver id
	 * \else
	 * ��ʻԱID
	 * \endif
	 */
	public byte                szDriverNo[] = new byte[FinalVar.SDK_VEHICLE_DRIVERNO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * current speed
	 * \else
	 * ��ǰ�ٶ�
	 * \endif
	 */
	public int               dwCurSpeed;
}
