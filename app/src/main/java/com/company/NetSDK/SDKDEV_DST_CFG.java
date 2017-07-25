package com.company.NetSDK;

import java.io.Serializable;


public class SDKDEV_DST_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DST position way. 0: position in date  , 1:position in week
	 * \else
	 * ����ʱ��λ��ʽ 0:�����ڶ�λ��ʽ, 1:���ܶ�λ��ʽ
	 * \endif
	 */
	public int                 nDSTType;

	/**
	 * \if ENGLISH_LANG
	 * Enable DTS
	 * \else
	 * ��ʼ����ʱ
	 * \endif
	 */
	public SDK_DST_POINT        stDSTStart = new SDK_DST_POINT();

	/**
	 * \if ENGLISH_LANG
	 * End DTS
	 * \else
	 * ��������ʱ
	 * \endif
	 */
	public SDK_DST_POINT        stDSTEnd = new SDK_DST_POINT();
}
