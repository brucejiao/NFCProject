package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * ���������������Ϣ
 * \endif
 */
public class DEC_COMBIN_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Combin ID
	 * \else
	 * ���ID
	 * \endif
	 */
	public int				nCombinID;
	
	/**
	 * \if ENGLISH_LANG
	 * Partition number
	 * \else
	 * ����ָ��� 
	 * \endif
	 */
	public int             nSplitType;
	
	/**
	 * \if ENGLISH_LANG
	 * Display channel
	 * \else
	 * ��ʾͨ��
	 * \endif
	 */
	public byte            bDisChn[]		= new byte[16];
}
