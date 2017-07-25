package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flashlight control
 * \else
 * ���������
 * \endif
 */
public class CFG_FLASH_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Working mode, 0-flash prohibited, 1- always flash, 2- automatic flash
	 * \else
	 * ����ģʽ��0-��ֹ���⣬1-ʼ�����⣬2-�Զ�����
	 * \endif
	 */
	public byte				byMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Working value,0-0us, 1-64us, 2-128us, 3-192...15-960us 
	 * \else
	 * ����ֵ, 0-0us, 1-64us, 2-128us, 3-192...15-960us
	 * \endif
	 */
	public byte				byValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Trigger mode, 0-low level, 1- high level, 2- upper edge 3- lower edge
	 * \else
	 * ����ģʽ, 0-�͵�ƽ 1-�ߵ�ƽ 2-������ 3-�½���
	 * \endif
	 */
	public byte				byPole;
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness pre-set value range (0~100)
	 * \else
	 * ����Ԥ��ֵ  ����0~100
	 * \endif
	 */
	public byte                byPreValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Duty ratio, 0~100  
	 * \else
	 * ռ�ձ�, 0~100
	 * \endif
	 */
	public byte				byDutyCycle;
	
	/**
	 * \if ENGLISH_LANG
	 * Frenquency multiple, 0~10 
	 * \else
	 * ��Ƶ, 0~10
	 * \endif
	 */
	public byte				byFreqMultiple;
}
