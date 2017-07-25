package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DefenceArea Type
 * \else
 * ��������
 * \endif
 */
public class EM_CFG_DEFENCEAREATYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unkown
	 * \else
	 * δ֪
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Unknown = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Real-time DefenceArea 
	 * \else
	 * ��ʱ���� 
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_InTime = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Delay DefenceArea
	 * \else
	 * ��ʱ����
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Delay = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Fullday DefenceArea
	 * \else
	 * 24Сʱ����
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDay = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �𾯷���
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Fire = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 24Сʱ��������
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDaySound = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 24Сʱ��������
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDaySlient = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �������1
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Entrance1 = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �������2
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Entrance2 = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �ڲ�����
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_InSide = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �ⲿ����
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_OutSide = 10;
}
