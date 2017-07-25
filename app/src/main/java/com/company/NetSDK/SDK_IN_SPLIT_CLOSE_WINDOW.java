package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CloseSplitWindow's interface input param(close window)
 * \else
 * CloseSplitWindow�ӿ��������(�ش�)
 * \endif
 */
public class SDK_IN_SPLIT_CLOSE_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * ͨ����(����)
	 * \endif
	 */
	public int					nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Window order
	 * \else
	 * �������
	 * \endif
	 */
	public int					nWindowID;
}
