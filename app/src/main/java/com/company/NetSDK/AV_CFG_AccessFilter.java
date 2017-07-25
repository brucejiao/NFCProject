package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Visiting Sites Filter Structure
 * \else
 * ���ʵ�ַ����
 * \endif
 */
public class AV_CFG_AccessFilter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean		bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Types, 0-Black List, 1-White List 
	 * \else
	 * ����, 0-������, 1-������
	 * \endif
	 */
	public int			nType;
	
 	/**
	 * \if ENGLISH_LANG
	 * White List IP Amounts 
	 * \else
	 * ������IP����
	 * \endif
	 */
	public int			nWhiteListNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * White List 
	 * \else
	 * ������
	 * \endif
	 */
	public byte[][]		szWhiteList = new byte[FinalVar.AV_CFG_Max_White_List][FinalVar.AV_CFG_Filter_IP_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Black List IP OrIP Segment Black List 
	 * \else
	 * ������IP��IP������
	 * \endif
	 */
	public int			nBlackListNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Black List 
	 * \else
	 * ������
	 * \endif
	 */
	public byte[][]		szBlackList = new byte[FinalVar.AV_CFG_Max_Black_List][FinalVar.AV_CFG_Filter_IP_Len];
}
