package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensor enumeration type
 * \else
 * ��������Ӧ��ʽö������
 * \endif
 */
public class EM_SENSE_METHOD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Door Sensor
	 * \else
	 * �Ŵ�
	 * \endif
	 */
	public static final int EM_SENSE_DOOR = 0;         

	/**
	 * \if ENGLISH_LANG
	 * Passive IR
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int EM_SENSE_PASSIVEINFRA = 1;   

	/**
	 * \if ENGLISH_LANG
	 * Gas Sensor 
	 * \else
	 * ����
	 * \endif
	 */
	public static final int EM_SENSE_GAS = 2;            

	/**
	 * \if ENGLISH_LANG
	 * Smoke Sensor 
	 * \else
	 * �̸�
	 * \endif
	 */
	public static final int EM_SENSE_SMOKING = 3;        

	/**
	 * \if ENGLISH_LANG
	 * Water Sensor
	 * \else
	 * ˮ��
	 * \endif
	 */
	public static final int EM_SENSE_WATER = 4;          

	/**
	 * \if ENGLISH_LANG
	 * Active IR 
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int EM_SENSE_ACTIVEFRA = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Glass Broken
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int EM_SENSE_GLASS = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * SOS
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int EM_SENSE_EMERGENCYSWITCH = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Vibrate
	 * \else
	 * ��
	 * \endif
	 */
	public static final int EM_SENSE_SHOCK = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Dual(IR+Microwave)
	 * \else
	 * ˫��(����+΢��)
	 * \endif
	 */
	public static final int EM_SENSE_DOUBLEMETHOD = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * Tritechnology
	 * \else
	 * ������
	 * \endif
	 */
	public static final int EM_SENSE_THREEMETHOD = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * Temperature
	 * \else
	 * �¶�
	 * \endif
	 */
	public static final int EM_SENSE_TEMP = 11;
	
	/**
	 * \if ENGLISH_LANG
	 * Humidity
	 * \else
	 * ʪ��
	 * \endif
	 */
	public static final int EM_SENSE_HUMIDITY = 12;
	
	/**
	 * \if ENGLISH_LANG
	 * Call button
	 * \else
	 * ���а�ť
	 * \endif
	 */
	public static final int EM_SENSE_CALLBUTTON = 13;
	
	/**
	 * \if ENGLISH_LANG
	 * Gas pressure
	 * \else
	 * ����ѹ��
	 * \endif
	 */
	public static final int EM_SENSE_GASPRESSURE = 14;
	
	/**
	 * \if ENGLISH_LANG
	 * Gas concentration
	 * \else
	 * ȼ��Ũ��
	 * \endif
	 */
	public static final int EM_SENSE_GASCONCENTRATION = 15;
	
	/**
	 * \if ENGLISH_LANG
	 * Gas flow
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int EM_SENSE_GASFLOW = 16;
	
	/**
	 * \if ENGLISH_LANG
	 * Other
	 * \else
	 * ����
	 * \endif
	 */
	public static final int EM_SENSE_OTHER = 17;

	/**
	 * \if ENGLISH_LANG
	 * Enumeration total
	 * \else
	 * ö����������
	 * \endif
	 */
	public static final int EM_SENSE_NUM = 18;             
}
