package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GetSplitWindowsInfo's interface output param
 * \else
 * GetSplitWindowsInfo�ӿ��������
 * \endif
 */
public class SDK_OUT_SPLIT_GET_WINDOWS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Windows info
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public SDK_BLOCK_COLLECTION	stuWindows = new SDK_BLOCK_COLLECTION();					
}
