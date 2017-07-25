package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video polling
 * \else
 * ��Ƶ��Ѳ
 * \endif
 */
public class SDK_VIDEOGROUP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Polling enabled
	 * \else
	 * ��Ѳʹ��
	 * \endif
	 */
	public boolean                bTourEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Polling interval in seconds, 5-300
	 * \else
	 * ��Ѳ�������λ��, 5-300
	 * \endif
	 */
	public int                 nTourPeriod;
	
	/**
	 * \if ENGLISH_LANG
	 * The polling channel mask form
	 * \else
	 * ��Ѳ��ͨ����������ʽ��ʾ
	 * \endif
	 */
	public int               dwChannelMask;
}
