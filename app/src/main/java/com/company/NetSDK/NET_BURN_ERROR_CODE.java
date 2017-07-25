package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * burning error code
 * \else
 * ��¼������
 * \endif
 */

public class NET_BURN_ERROR_CODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * normal
	 * \else
	 * ����
	 * \endif
	 */
	public static final int BURN_CODE_NORMAL 		= 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown error
	 * \else
	 * δ֪����
	 * \endif
	 */
	public static final int BURN_CODE_UNKNOWN_ERROR  = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * burning full
	 * \else
	 * ��¼��
	 * \endif
	 */
	public static final int BURN_CODE_SPACE_FULL  = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * start burning error
	 * \else
	 * ��ʼ��¼����
	 * \endif
	 */
	public static final int BURN_CODE_START_ERROR  = 3;
	
	
	/**
	 * \if ENGLISH_LANG
	 * stop burning error
	 * \else
	 * ֹͣ����
	 * \endif
	 */
	public static final int BURN_CODE_STOP_ERROR  = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * burning error
	 * \else
	 * ��¼����
	 * \endif
	 */
	public static final int BURN_CODE_WRITE_ERROR  = 5;
	
}