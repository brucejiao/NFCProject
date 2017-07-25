package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network transmission strategy configuration
 * \else
 * ���紫���������
 * \endif
 */
public class SDKDEV_TRANSFER_STRATEGY_CFG implements Serializable {
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
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * 0��Video quality priority,1��Fluency priority,2��Auto,
	 * \else
	 * 0���������ȣ�1�����������ȣ�2���Զ���
	 * \endif
	 */
	public int                 iStrategy;
}
