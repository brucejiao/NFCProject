package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * ��������ģʽ
 * \endif
 */
public class CFG_BITRATE_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Control Bit Rate
	 * \else
	 * �̶�����
	 * \endif
	 */
	public static final int     BITRATE_CBR = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Variable Bit Rate
	 * \else
	 * �ɱ�����
	 * \endif
	 */
	public static final int     BITRATE_VBR = 1;
}
