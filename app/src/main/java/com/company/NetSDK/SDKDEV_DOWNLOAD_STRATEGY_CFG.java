package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video download policy configuration
 * \else
 * ¼�����ز�������
 * \endif
 */
public class SDKDEV_DOWNLOAD_STRATEGY_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TRUE��High-speed downloads, FALSE: ordinary download
	 * \else
	 * TRUE���������أ�FALSE����ͨ����
	 * \endif
	 */
	public boolean                bEnable;
}
