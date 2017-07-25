package com.company.NetSDK;

import java.io.Serializable;

public class EM_FACEPIC_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * δ֪
	 * \endif
	 */
	public final static int NET_FACEPIC_TYPE_UNKOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * face full size picture
	 * \else
	 * ����ȫ����ͼ
	 * \endif
	 */
	public final static int NET_FACEPIC_TYPE_GLOBAL_SENCE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * face small pictrure
	 * \else
	 * ����Сͼ
	 * \endif
	 */
	public final static int NET_FACEPIC_TYPE_SMALL = 2;
}
