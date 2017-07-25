package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Old log structure 
 * \else
 * �ɵ���־�ṹ��
 * \endif
 */
public class SDK_LOG_ITEM_OLD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Old log structure 
	 * \else
	 * �ɵ���־�ṹ��
	 * \endif
	 */
	public SDK_LOG_ITEM			stuLog;
	
	public SDK_LOG_ITEM_OLD() {
		stuLog = new SDK_LOG_ITEM();
	}
}
