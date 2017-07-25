package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OpenSplitWindow's interface input param(open window)
 * \else
 * OpenSplitWindow�ӿ��������(����)
 * \endif
 */
public class SDK_IN_SPLIT_OPEN_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel no.
	 * \else
	 * ͨ����(����)
	 * \endif
	 */
	public int					nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Windon position, 0~8192
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
