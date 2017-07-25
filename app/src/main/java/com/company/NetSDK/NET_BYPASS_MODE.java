package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Bypass Status Type
 * \else
 * ��·״̬����
 * \endif
 */
public class NET_BYPASS_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown Status
	 * \else
	 * δ֪״̬
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_UNKNOW = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Bypass
	 * \else
	 * ��·
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_BYPASS = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * ����
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_NORMAL = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Isolate
	 * \else
	 * ����
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_ISOLATED = 3;
}
