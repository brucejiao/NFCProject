package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SetSplitWindowRect's interface input param(setting the window position)
 * \else
 * SetSplitWindowRect�������(���ô���λ��)
 * \endif
 */
public class SDK_IN_SPLIT_SET_RECT implements Serializable {
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
	public int 				nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Wndow position, 0~8192
	 * \else
	 * ����λ��, 0~8192
	 * \endif
	 */
	public SDK_RECT				stuRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Coordinate whether meet the confitions
	 * \else
	 * �����Ƿ�����ֱͨ����, ֱͨ��ָƴ������ʽ�£��˴�����������Ϊ����������
	 * \endif
	 */
	public boolean				bDirectable;
}
