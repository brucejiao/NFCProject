package com.company.NetSDK;

import java.io.Serializable;

public class GPS_POINT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * ����(��λ�ǰ����֮�ȣ���Χ0-360��)�綫��120.178274�ȱ�ʾΪ300178274
	 * \endif
	 */
	public int         dwLongitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * latidude
	 * \else
	 * γ��(��λ�ǰ����֮�ȣ���Χ0-180��)�籱γ30.183382�ȱ�ʾΪ120183382
	 * \endif
	 */
	public int         dwLatidude; 
}
