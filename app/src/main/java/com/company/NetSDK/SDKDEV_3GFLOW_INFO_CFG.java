package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 3G Flow info config
 * \else
 * 3G������Ϣ����
 * \endif
 */
public class SDKDEV_3GFLOW_INFO_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * strategy, 0: charged by flow every month 1:charged by time every month
	 * \else
	 * ����ʹ�ò���, 0:���������� 1:��ʱ�����
	 * \endif
	 */
	public int                 nStrategy;
	
	/**
	 * \if ENGLISH_LANG
	 * up limit, by flow: MB, by time: h
	 * \else
	 * ����ʹ������, ������: ��λMB ��ʱ��: ��λСʱ
	 * \endif
	 */
	public int                 nUpLimit;
}
