package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel buttons
 * \else
 * ������尴��
 * \endif
 */
public class CFG_INFRARED_KEY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Panel buttons name
	 * \else
	 * ��尴������
	 * \endif
	 */
	public char       szName[] = new char[FinalVar.CFG_COMMON_STRING_32];
	
	/**
	 * \if ENGLISH_LANG
	 *  Panel buttons to display text, buttons label
	 * \else
	 * ��尴����ʾ���֣���ťlabel
	 * \endif
	 */
	public char			szText[] = new char[FinalVar.CFG_COMMON_STRING_64];
	
}