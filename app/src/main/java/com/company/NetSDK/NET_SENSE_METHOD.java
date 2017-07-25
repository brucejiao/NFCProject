package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensor Enumeration Type
 * \else
 * ��������Ӧ��ʽö������
 * \endif
 */
public class NET_SENSE_METHOD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown Type
	 * \else
	 * δ֪����
	 * \endif
	 */
	public static final int NET_SENSE_UNKNOWN = -1;
	
	/**
	 * \if ENGLISH_LANG
	 * Door Sensor
	 * \else
	 * �Ŵ�
	 * \endif
	 */
	public static final int NET_SENSE_DOOR = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Passive IR
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int NET_SENSE_PASSIVEINFRA = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Gas Sensor
	 * \else
	 * ����
	 * \endif
	 */
	public static final int NET_SENSE_GAS = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Smoke Sensor
	 * \else
	 * �̸�
	 * \endif
	 */
	public static final int NET_SENSE_SMOKING = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Water Sensor
	 * \else
	 * ˮ��
	 * \endif
	 */
	public static final int NET_SENSE_WATER = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Active IR
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int NET_SENSE_ACTIVEFRA = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Broken Glass
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int NET_SENSE_GLASS = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Emergency
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int NET_SENSE_EMERGENCYSWITCH = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Shock
	 * \else
	 * ��
	 * \endif
	 */
	public static final int NET_SENSE_SHOCK = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * Dual(IR+Microwave)
	 * \else
	 * ˫��(����+΢��)
	 * \endif
	 */
	public static final int NET_SENSE_DOUBLEMETHOD = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * Three Technology
	 * \else
	 * ������
	 * \endif
	 */
	public static final int NET_SENSE_THREEMETHOD = 11;
	
	/**
	 * \if ENGLISH_LANG
	 * Temperature
	 * \else
	 * �¶�
	 * \endif
	 */
	public static final int NET_SENSE_TEMP = 12;
	
	/**
	 * \if ENGLISH_LANG
	 * Humidity
	 * \else
	 * ʪ��
	 * \endif
	 */
	public static final int NET_SENSE_HUMIDITY = 13;
	
	/**
	 * \if ENGLISH_LANG
	 * Call Button
	 * \else
	 * ���а�ť
	 * \endif
	 */
	public static final int NET_SENSE_CALLBUTTON = 14;
	
	/**
	 * \if ENGLISH_LANG
	 * Other
	 * \else
	 * ����
	 * \endif
	 */
	public static final int NET_SENSE_OTHER = 15;
	
	/**
	 * \if ENGLISH_LANG
	 * Enumeration Type Total
	 * \else
	 * ö����������
	 * \endif
	 */
	public static final int NET_SENSE_NUM = 16;
}
