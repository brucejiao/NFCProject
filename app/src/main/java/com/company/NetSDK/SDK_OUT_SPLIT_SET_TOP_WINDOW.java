package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SetSplitWindowLevels's interface output param(setting window order)
 * \else
 * SetSplitWindowLevels�ӿ��������(���ô��ڴ���)
 * \endif
 */
public class SDK_OUT_SPLIT_SET_TOP_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Window order array
	 * \else
	 * ���ڴ�������
	 * \endif
	 */
	public SDK_WND_ZORDER		pZOders[];
	
	/**
	 * \if ENGLISH_LANG
	 * Window order array size
	 * \else
	 * ���ڴ��������С
	 * \endif
	 */
	public int					nMaxWndCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of returned window
	 * \else
	 * ���صĴ�������
	 * \endif
	 */
	public int					nWndCount;
	
	public SDK_OUT_SPLIT_SET_TOP_WINDOW(int nMax) {
		nMaxWndCount = nMax;
		pZOders = new SDK_WND_ZORDER[nMaxWndCount];
		for (int i = 0; i < nMaxWndCount; i++) {
			pZOders[i] = new SDK_WND_ZORDER();
		}
	}
}
