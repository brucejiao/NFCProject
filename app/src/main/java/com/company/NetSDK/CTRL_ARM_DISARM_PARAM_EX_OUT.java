package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/disarm control expansion output parameter
 * \else
 * ����������������չ�������
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX_OUT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * alarm source input arming failed zone number 
	 * \else
	 * �б���Դ���벼��ʧ�ܵķ�������
	 * \endif
	 */
	public int               dwSourceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * alarm source input failed zone no.,zone no. start from 0
	 * \else
	 * �б���Դ����ʧ�ܵķ�����, �����Ŵ�0��ʼ
	 * \endif
	 */
	public int                 nSource[] = new int[FinalVar.ARM_DISARM_ZONE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * link alarm arming failed zone number 
	 * \else
	 * ��������������ʧ�ܵķ�������
	 * \endif
	 */
    public int               dwLinkNum;
    
    /**
     * \if ENGLISH_LANG
     * link alarm failed zone no., zone no. start from 0
     * \else
     * ����������ʧ�ܵķ�����, �����Ŵ�0��ʼ
     * \endif
     */
    public int                 nLink[] = new int[FinalVar.ARM_DISARM_ZONE_MAX];
}
