package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IR button
 * \else
 * ���ⰴ��
 * \endif
 */
public class NET_CTRL_INFRARED_KEY_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IR control channel no.
	 * \else
	 * �������ͨ����
	 * \endif
	 */
	public int		nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * IR button ID
	 * \else
	 * ���ⰴ��ID
	 * \endif
	 */
	public int		nKey; 
}
