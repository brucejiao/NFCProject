package com.company.NetSDK;

import java.io.Serializable;

public class NET_RECENCY_CAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final int   RECENCY_CAR_INFO_UNKNOW  = 0	;
	
	/**
	 * \if ENGLISH_LANG
	 * newest
	 * \else
	 * ����
	 * \endif
	 */
	public static final int   RECENCY_CAR_INFOO_NEWEST = 1 	;
	
	/**
	 * \if ENGLISH_LANG
	 * oldest
	 * \else
	 * ���
	 * \endif
	 */
	public static final int   RECENCY_CAR_INFO_ODLEST  = 2  ;
}
