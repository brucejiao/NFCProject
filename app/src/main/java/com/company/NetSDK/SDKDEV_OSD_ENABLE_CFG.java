package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zhengzhou EC_U video data overlay enabling configuration
 * \else
 * ֣������ķEC_U��Ƶ���ݵ���ʹ������
 * \endif
 */
public class SDKDEV_OSD_ENABLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �˿�
	 * \endif
	 */
	public int                 nPort; 
}
