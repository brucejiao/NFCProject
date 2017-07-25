package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GetSplitWindowRect's interface output param(getting the window position)
 * \else
 * GetSplitWindowRect�ӿ��������(��ȡ����λ��)
 * \endif
 */
public class SDK_OUT_SPLIT_GET_RECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Wndow position, 0~8192
	 * \else
	 * ����λ��, 0~8192
	 * \endif
	 */
	public SDK_RECT				stuRect = new SDK_RECT();
}
