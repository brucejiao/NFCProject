package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * cascading order window
 * \else
 * ���ڲ������
 * \endif
 */
public class SDK_WND_ZORDER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * �������
	 * \endif
	 */
	public int				nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Z order
	 * \else
	 * Z����
	 * \endif
	 */
	public int				nZOrder;
}
