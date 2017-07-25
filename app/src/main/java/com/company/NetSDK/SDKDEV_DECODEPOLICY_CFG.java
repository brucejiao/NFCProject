package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decode policy configuration
 * \else
 * ������ص�����
 * \endif
 */
public class SDKDEV_DECODEPOLICY_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * (read only):minimal delay time(ms)
	 * \else
	 * �뻺��ʱ�䷶Χ(ֻ��)����С����ʱ��(��λ��ms)
	 * \endif
	 */
	public int                 nMinTime;

	/**
	 * \if ENGLISH_LANG
	 * (read only):maximal delay time(ms)
	 * \else
	 * �뻺��ʱ�䷶Χ(ֻ��)����󻺳�ʱ��(��λ��ms)
	 * \endif
	 */
	public int                 nMaxTime;

	/**
	 * \if ENGLISH_LANG
	 * device decode delay time(ms)
	 * \else
	 * Ŀ���豸���뻺��ʱ��(��λ��ms)
	 * \endif
	 */
	public int                 nDeocdeBufTime;
}
