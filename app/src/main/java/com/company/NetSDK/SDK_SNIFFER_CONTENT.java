package com.company.NetSDK;

import java.io.Serializable;


public class SDK_SNIFFER_CONTENT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position bit offset
	 * \else
	 * ��־λ��λƫ��
	 * \endif
	 */
	public int           Offset;

	/**
	 * \if ENGLISH_LANG
	 * It is invalid now
	 * \else
	 * Ŀǰû��Ӧ��
	 * \endif
	 */
	public int           Offset2;

	/**
	 * \if ENGLISH_LANG
	 * The symbol position length
	 * \else
	 * ��־λ�ĳ���
	 * \endif
	 */
	public int           Length;

	/**
	 * \if ENGLISH_LANG
	 * It is invalid now
	 * \else
	 * Ŀǰû��Ӧ��
	 * \endif
	 */
	public int           Length2;

	/**
	 * \if ENGLISH_LANG
	 * Title value
	 * \else
	 * �����ֵ
	 * \endif
	 */
	public byte          Title[] = new byte[12];

	/**
	 * \if ENGLISH_LANG
	 * Key value
	 * \else
	 * �ؼ��ֵ�ֵ
	 * \endif
	 */
	public byte          Key[] = new byte[12];
}
