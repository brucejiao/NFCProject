package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * ��Ѳ��������
 * \endif
 */
public class DEC_CTRL_TOUR_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * stop
	 * \else
	 * ֹͣ
	 * \endif
	 */
	public static final int     Dec_Tour_Stop = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * start
	 * \else
	 * ��ʼ
	 * \endif
	 */
	public static final int     Dec_Tour_Start = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * pause
	 * \else
	 * ��ͣ
	 * \endif
	 */
	public static final int     Dec_Tour_Pause = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * resume
	 * \else
	 * �ָ�
	 * \endif
	 */
	public static final int     Dec_Tour_Resume = 3;
}
