package com.company.NetSDK;

import java.io.Serializable;

public class GPS_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * GPS,GLONASS
	 * \else
	 * GPS��GLONASS���ģʽ(ģ�鶨λ���ݴ�GPS��GLONASS�����л�ȡ����������Դ���ĸ�ϵͳ����ȷ��,����ģ���ڲ��Զ��ᴦ��)
	 * \endif
	 */
	public final static int GPS_OR_GLONASS_MODE = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * GLONASS
	 * \else
	 * GLONASSģʽ(��ģ��Ķ�λ���ݴӶ���˹��GLONASS��λϵͳ�л�ȡ)
	 * \endif
	 */
	public final static int GLONASS_MODE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * GPS
	 * \else
	 * GPSģʽ(��ģ��Ķ�λ���ݴ�������GPSϵͳ�л�ȡ) 
	 * \endif
	 */
	public final static int GPS_MODE = 2;
}
