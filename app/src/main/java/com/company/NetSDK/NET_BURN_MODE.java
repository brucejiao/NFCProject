package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burning mode
 * \else
 * ��¼ģʽ 
 * \endif
 */
public class NET_BURN_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * sync
	 * \else
	 * ͬ��
	 * \endif
	 */
	public static final int BURN_MODE_SYNC 		= 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * turn
	 * \else
	 * ����
	 * \endif
	 */
	public static final int BURN_MODE_TURN 	= 1	;
	
	/**
	 * \if ENGLISH_LANG
	 * cycle
	 * \else
	 * ѭ��
	 * \endif
	 */
	public static final int BURN_MODE_CYCLE 	= 2 ;
}
