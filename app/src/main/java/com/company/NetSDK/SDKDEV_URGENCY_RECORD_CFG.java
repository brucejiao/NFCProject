package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Emergency storage configuration
 * \else
 * �����洢����
 * \endif
 */
public class SDKDEV_URGENCY_RECORD_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable or not. 1=enable.0=disable
	 * \else
	 * �Ƿ�ʹ�ܣ�1ʹ�ܣ�0��ʹ��
	 * \endif
	 */
	public boolean    bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Max record time. Unit is second.
	 * \else
	 * ���¼��ʱ�䣬��λ��
	 * \endif
	 */
	public int    nMaxRecordTime;
}
