package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Privacy mask info
 * \else
 * �ڵ���Ϣ
 * \endif
 */
public class VIDEO_COVER_ATTR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask area coordinates
	 * \else
	 * ���ǵ���������
	 * \endif
	 */
	public SDK_RECT             rcBlock = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask color
	 * \else
	 * ���ǵ���ɫ
	 * \endif
	 */
	public int                 nColor;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask mode��0: black block,1: Mosaic
	 * \else
	 * ���Ƿ�ʽ��0���ڿ飬1��������
	 * \endif
	 */
	public byte                bBlockType;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask when encode��1��Enable,0��Disable
	 * \else
	 * ���뼶�ڵ���1����Ч��0������Ч
	 * \endif
	 */
	public byte                bEncode;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask when preview�� 1��Enable,0��Disable
	 * \else
	 * Ԥ���ڵ��� 1����Ч��0������Ч
	 * \endif
	 */
	public byte                bPriview;
}
