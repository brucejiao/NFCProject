package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * enclosure config
 * \else
 * ����Χ������
 * \endif
 */
public class SDKDEV_ENCLOSURE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * mask
	 * \else
	 * ����Χ���������룬�� ENCLOSURE_TYPE
	 * \endif
	 */
	public int          unType;

	/**
	 * \if ENGLISH_LANG
	 * front 4 bit means country, province, city, town
	 * \else
	 * ǰ��λ�ֱ������ҡ�ʡ���л�������(0-255)����4bytes����
	 * \endif
	 */
	public byte          bRegion[] = new byte[8];

	/**
	 * \if ENGLISH_LANG
	 * rect id
	 * \else
	 * һ��������һ��ID��ʶ
	 * \endif
	 */
	public int          unId;

	/**
	 * \if ENGLISH_LANG
	 * speed limit(km/h)
	 * \else
	 * ���٣���λkm/h
	 * \endif
	 */
	public int          unSpeedLimit;

	/**
	 * \if ENGLISH_LANG
	 * rect point number
	 * \else
	 * ����Χ�����򶥵���
	 * \endif
	 */
	public int          unPointNum;

	/**
	 * \if ENGLISH_LANG
	 * rect point info
	 * \else
	 * ����Χ��������Ϣ
	 * \endif
	 */
	public GPS_POINT     stPoints[] = new GPS_POINT[128];

	/**
	 * \if ENGLISH_LANG
	 * station name
	 * \else
	 * ����Χ����Χ�ĳ�վվ������
	 * \endif
	 */
	public byte          szStationName[] = new byte[FinalVar.SDK_STATION_NAME_LEN];
	
	public SDKDEV_ENCLOSURE_CFG() {
		for (int i = 0; i < 128; i++) {
			stPoints[i] = new GPS_POINT();
		}
	}
}
