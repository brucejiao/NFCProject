package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The length of the video package configuration
 * \else
 * ¼������������
 * \endif
 */
public class SDKDEV_RECORD_PACKET_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:by time,1:by size
	 * \else
	 * 0:��ʱ�䣬1������С
	 * \endif
	 */
	public int                 nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * nType = 0:(minutes),nType = 1:(KB)
	 * \else
	 * nType = 0ʱ:��λ���ӣ�nType = 1ʱ:��λKB
	 * \endif
	 */
	public int                 nValue; 
}
