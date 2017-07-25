package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel template 
 * \else
 * �������ģ��
 * \endif
 */
public class CFG_INFRARED_BOARD_TEMPLATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Panel template ID
	 * \else
	 * ���ģ����
	 * \endif
	 */
	public int			nID;
	
	/**
	 * \if ENGLISH_LANG
	 * Panel Brand Model definitions
	 * \else
	 * ���Ʒ���ͺŶ���
	 * \endif
	 */
	public char	   szName[] = new char[FinalVar.CFG_COMMON_STRING_64];
	
	
	/**
	 * \if ENGLISH_LANG
	 * Panel type, categories, 0 - DVD, TV 
	 * \else
	 * �������, ����, 0-DVD, 1-TV
	 * \endif
	 */
	public int		nCategory;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Panel key number 
	 * \else
	 * ��尴������
	 * \endif
	 */
	public int		 nKeyNum;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Panel buttons
	 * \else
	 * ��尴��
	 * \endif
	 */
	public CFG_INFRARED_KEY stuKeys[] =  new CFG_INFRARED_KEY[FinalVar.CFG_MAX_INFRARED_KEY_NUM];
	
	
	public CFG_INFRARED_BOARD_TEMPLATE()
	{
		for(int i = 0; i < FinalVar.CFG_MAX_INFRARED_KEY_NUM; i++)
		{
			stuKeys[i] = new CFG_INFRARED_KEY();
		}
	}
}