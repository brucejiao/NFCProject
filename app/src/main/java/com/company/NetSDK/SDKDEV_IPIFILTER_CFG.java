package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IP Filtering configuration
 * \else
 * IP�������ýṹ��
 * \endif
 */
public class SDKDEV_IPIFILTER_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public int               dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * The current list type;0:White List 1:Blacklist(The device can enable only one type of list)
	 * \else
	 * ��ǰ�������ͣ�0�������� 1�����������豸ֻ��ʹһ��������Ч�������ǰ����������Ǻ�������
	 * \endif
	 */
	public int               dwType;

	/**
	 * \if ENGLISH_LANG
	 * Black list
	 * \else
	 * ������
	 * \endif
	 */
	public IPIFILTER_INFO      BannedIP = new IPIFILTER_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Trusted sites
	 * \else
	 * ������
	 * \endif
	 */
	public IPIFILTER_INFO      TrustIP = new IPIFILTER_INFO();
}
