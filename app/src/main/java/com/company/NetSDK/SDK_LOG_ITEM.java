package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Log information. Corresponding to QueryLog
 * \else
 * ��־��Ϣ
 * \endif
 */
public class SDK_LOG_ITEM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Date
	 * \else
	 * ����
	 * \endif
	 */
	public SDKDEVTIME			time = new SDKDEVTIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Type
	 * \else
	 * ����
	 * \endif
	 */
	public short				type;
	
	/**
	 * \if ENGLISH_LANG
	 * Data
	 * \else
	 * ����
	 * \endif
	 */
	public byte				data;
	
	/**
	 * \if ENGLISH_LANG
	 * Content
	 * \else
	 * ����
	 * \endif
	 */
	public byte				context[] = new byte[8];
}
