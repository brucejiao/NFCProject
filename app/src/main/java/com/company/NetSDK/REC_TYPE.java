package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record related (schedule,motion detection,alarm)
 * \else
 * ¼������(��ʱ����̬��⡢����)
 * \endif
 */
public class REC_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final int SDK_REC_TYPE_TIM = 0;
	public static final int SDK_REC_TYPE_MTD = 1;
	public static final int SDK_REC_TYPE_ALM = 2;
	public static final int SDK_REC_TYPE_NUM = 3;
}
