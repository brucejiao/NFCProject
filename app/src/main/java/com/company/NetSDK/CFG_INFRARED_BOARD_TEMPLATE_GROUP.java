package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel template group 
 * \else
 * �������ģ����
 * \endif
 */
public class CFG_INFRARED_BOARD_TEMPLATE_GROUP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Number of template 
	 * \else
	 * ģ������
	 * \endif
	 */
	public int			nTemplateNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Infrared panel template
	 * \else
	 * �������ģ��
	 * \endif
	 */
	public CFG_INFRARED_BOARD_TEMPLATE stuTemplates[] = new CFG_INFRARED_BOARD_TEMPLATE[FinalVar.CFG_MAX_INFRARED_BOARD_TEMPLATE_NUM];
	
	
	public CFG_INFRARED_BOARD_TEMPLATE_GROUP()
	{
		for(int i = 0; i < FinalVar.CFG_MAX_INFRARED_BOARD_TEMPLATE_NUM; i++)
		{
			stuTemplates[i] = new CFG_INFRARED_BOARD_TEMPLATE();
		}	
	}
	
	
}
