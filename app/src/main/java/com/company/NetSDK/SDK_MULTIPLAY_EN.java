package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Structure of multi-screen preview capability
 * \else
 * �໭��Ԥ�������ṹ��
 * \endif
 */
public class SDK_MULTIPLAY_EN implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 1 support; 0 does not support 
	 * \else
	 * 1 ֧�֣�0 ��֧��
	 * \endif
	 */
	public int			nEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-screen preview mask, this parameter does not work 
	 * \else
	 * �໭��Ԥ������
	 * \endif
	 */
	public int			dwMultiPlayMask;
}
