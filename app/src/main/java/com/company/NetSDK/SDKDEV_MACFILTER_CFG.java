package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * MAC filter configuration
 * \else
 * MAC�������ýṹ��
 * \endif
 */
public class SDKDEV_MACFILTER_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public int                 dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * current list type,0:white list, 1:blacklist (The device can enable only one type of list) can only user one kind of device
	 * \else
	 * ��ǰ�������ͣ�0�������� 1�����������豸ֻ��ʹһ��������Ч�������ǰ����������Ǻ�������
	 * \endif
	 */
	public int                 dwType;

	/**
	 * \if ENGLISH_LANG
	 * black list Mac
	 * \else
	 * ������Mac
	 * \endif
	 */
	public MACFILTER_INFO        stuBannedMac = new MACFILTER_INFO();

	/**
	 * \if ENGLISH_LANG
	 * white list Mac
	 * \else
	 * ������Mac
	 * \endif
	 */
	public MACFILTER_INFO        stuTrustMac = new MACFILTER_INFO();
}
