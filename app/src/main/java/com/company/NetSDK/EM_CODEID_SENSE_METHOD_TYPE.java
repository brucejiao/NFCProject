package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The type of sense method
 * \else
 * ��������ʽ
 * \endif
 */
public class EM_CODEID_SENSE_METHOD_TYPE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * δ֪��
	 * \endif
	 */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_UNKOWN = 0;         
   
    /**
     * \if ENGLISH_LANG
     * Door Magnetism
     * \else
     * �Ŵ�
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_DOOR_MAGNETISM = 1; 
    
    /**
     * \if ENGLISH_LANG
     * Gas Sensor
     * \else
     * ȼ������
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_GAS_SENSOR = 2;
    
    /**
     * \if ENGLISH_LANG
     * Curtain Sensor
     * \else
     * Ļ��������
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_CURTAIN_SENSOR = 3;
    
    /**
     * \if ENGLISH_LANG
     * Mobile Sensor
     * \else
     * �ƶ�������
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_MOBILE_SENSOR = 4; 
    
    /**
     * \if ENGLISH_LANG
     * Passive Infrared Sensor
     * \else
     * �������⴫����
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_PASSIVEINFRA = 5;  

    /**
     * \if ENGLISH_LANG
     * urgency button
     * \else
     * ������ť
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_URGENCY_BUTTON = 6;
    
    /**
     * \if ENGLISH_LANG
     * Smoking Sensor
     * \else
     * ��������
     * \endif
     */   
}
