package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * enclosure version config
 * \else
 * ����Χ���汾������ 
 * \endif
 */
public class SDKDEV_ENCLOSURE_VERSION_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type mask,such as LIMITSPEED | DRIVEALLOW
	 * \else
	 * Χ���������룬��LIMITSPEED | DRIVEALLOW
	 * \endif
	 */
	public int          unType; 
	
	/**
	 * \if ENGLISH_LANG
	 * version
	 * \else
	 * ÿ������һ���汾��,����ͳһƽ̨���豸�ϵ�Χ������
	 * \endif
	 */
	public int          unVersion[] = new int[32]; 
}
