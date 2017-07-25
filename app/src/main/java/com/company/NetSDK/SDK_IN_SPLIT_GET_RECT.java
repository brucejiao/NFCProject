package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GetSplitWindowRect's interface input param(setting the window position)
 * \else
 * GetSplitWindowRect�������(���ô���λ��)
 * \endif
 */
public class SDK_IN_SPLIT_GET_RECT implements Serializable {
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
	public int	nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Window order
	 * \else
	 * �������
	 * \endif
	 */
	public int	nWindowID;



}
