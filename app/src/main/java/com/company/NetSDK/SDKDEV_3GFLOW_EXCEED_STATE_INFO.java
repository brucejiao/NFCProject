package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 3G traffic exceeds the threshold status information
 * \else
 * 3G����������ֵ״̬��Ϣ 
 * \endif
 */
public class SDKDEV_3GFLOW_EXCEED_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 3G traffic exceeds a threshold state, and 0 indicates that does not exceed the threshold, 1 represents beyond threshold 
	 * \else
	 * 3G����������ֵ״̬��0��ʾδ������ֵ��1��ʾ������ֵ
	 * \endif
	 */
	public byte                bState; 
}
