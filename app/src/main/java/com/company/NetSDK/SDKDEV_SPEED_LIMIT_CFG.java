package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK_DEV_SPEED_LIMIT_CFG configuration
 * \else
 * SDK_DEV_SPEED_LIMIT_CFG ���ýṹ
 * \endif
 */
public class SDKDEV_SPEED_LIMIT_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable speed limit;1:enable,0:disable
	 * \else
	 * ����ʹ��1��ʹ�ܣ�0����ʹ�ܡ�
	 * \endif
	 */
	public byte                byEnable;

	/**
	 * \if ENGLISH_LANG
	 * upper speed(KM/H) 0: none limit speed, >0:limit speed
	 * \else
	 * �ٶ�����ֵ����λKM/H 0��ʾ������,����0��ʾ����
	 * \endif
	 */
	public short                wMaxSpeed;

	/**
	 * \if ENGLISH_LANG
	 * low speed(KM/H) 0: none limit speed, >0:limit speed
	 * \else
	 * �ٶ�����ֵ����λKM/H 0��ʾ������,����0��ʾ����
	 * \endif
	 */
	public short                wMinSpeed;
}
