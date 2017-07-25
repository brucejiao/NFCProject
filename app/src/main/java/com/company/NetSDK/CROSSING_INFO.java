package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Crossing information
 * \else
 * ·����Ϣ
 * \endif
 */
public class CROSSING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Crossing ID
	 * \else
	 * ·�����к�
	 * \endif
	 */
	public byte				szCrossingID[] = new byte[FinalVar.SDK_MAX_CROSSING_ID]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Latitude(0-180 Degree, 30.183382 degree==120183382)
	 * \else
	 * γ��(��λ�ǰ����֮�ȣ���Χ0-180��)�籱γ30��.��183382�ȱ�ʾΪ120183382)
	 * \endif
	 */
	public int 				dwLatitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * Longitude(0-360 Degree, 120.178274 degree==300178274)
	 * \else
	 * ����(��λ�ǰ����֮�ȣ���Χ0-360��) �綫��120��.��178274�ȱ�ʾΪ300178274��
	 * \endif
	 */
	public int				dwLongitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * limit speed(KM/H)
	 * \else
	 * ·������ֵ,��λKm/h 0��ʾ������,������ʾ����ֵ����
	 * \endif
	 */
	public short			wSpeedLimit;
}
