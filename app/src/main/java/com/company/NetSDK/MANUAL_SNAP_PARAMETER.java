package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Manual snap parameter
 * \else
 * �ֶ�ץ�Ĳ���
 * \endif
 */
public class MANUAL_SNAP_PARAMETER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * snap channel,start with 0
	 * \else
	 * ץͼͨ��,��0��ʼ
	 * \endif
	 */
	public int                 nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * snap sequence string
	 * \else
	 * ץͼ���к��ַ���
	 * \endif
	 */
	public byte                bySequence[] = new byte[64]; 
}
