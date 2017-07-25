package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The language types device supported 
 * \else
 * �豸֧����������
 * \endif
 */
public class SDK_DEV_LANGUAGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The language amount supported
	 * \else
	 * ֧�����Ը���
	 * \endif
	 */
	public int					dwLanguageNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Enumeration value please refer to SDK_LANGUAGE_TYPE
	 * \else
	 * ö��ֵ����� DK_LANGUAGE_TYPE
	 * \endif
	 */
	public byte					byLanguageType[] = new byte[252];	
}
