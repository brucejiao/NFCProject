package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The structure of the image watermarking capabilities
 * \else
 * ͼ��ˮӡ�����ṹ��
 * \endif
 */
public class SDK_WATERMAKE_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1 support; 0 does not support.
	 * \else
	 * 1 ֧��;0 ��֧��
	 * \endif
	 */
	public char		isSupportWM;
	
	/**
	 * \if ENGLISH_LANG
	 * 0: text watermark; 1: picture watermark; 2: supports both text watermark and image watermark
	 * \else
	 * 0:����ˮӡ;1:ͼƬˮӡ;2:ͬʱ֧������ˮӡ��ͼƬˮӡ
	 * \endif
	 */
	public char		supportWhat;
}
