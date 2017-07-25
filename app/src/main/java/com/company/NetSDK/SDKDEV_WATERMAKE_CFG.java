package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video watermark configuration
 * \else
 * ͼ��ˮӡ����
 * \endif
 */
public class SDKDEV_WATERMAKE_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public int                 nEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit stream(1��n)0-all bit streams
	 * \else
	 * ����(1��n)0-��������
	 * \endif
	 */
	public int                 nStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Data type(1-character,2-picture)
	 * \else
	 * ��������(1-���֣�2-ͼƬ) 
	 * \endif
	 */
	public int                 nKey;
	
	/**
	 * \if ENGLISH_LANG
	 * Character
	 * \else
	 * ����
	 * \endif
	 */
	public byte                szLetterData[] = new byte[FinalVar.SDK_MAX_WATERMAKE_LETTER];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture data
	 * \else
	 * ͼƬ����
	 * \endif
	 */
	public byte                szData[] = new byte[FinalVar.SDK_MAX_WATERMAKE_DATA];
}
