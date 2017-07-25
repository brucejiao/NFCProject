package com.company.NetSDK;

import java.io.Serializable;


public class SDK_SNIFFER_FRAMEID implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Symbol position bit Offset
	 * \else
	 * ��־λ��λƫ��
	 * \endif
	 */
	public int           Offset;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position length
	 * \else
	 * ��־λ�ĳ���
	 * \endif
	 */
	public int           Length;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position value
	 * \else
	 * ��־λ��ֵ
	 * \endif
	 */
	public byte          Key[] = new byte[16];

}
