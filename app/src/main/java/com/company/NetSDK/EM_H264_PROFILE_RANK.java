package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * H264 profile rank
 * \else
 * H264 ���뼶��
 * \endif
 */
public class EM_H264_PROFILE_RANK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * offer I/P frame, only support progressive and CAVLC
	 * \else
	 * �ṩI/P֡����֧��progressive(����ɨ��)��CAVLC
	 * \endif
	 */
	public static final int SDK_PROFILE_BASELINE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * offer I/P/B frame, support progressiv and interlaced,offer CAVLC and CABAC
	 * \else
	 * �ṩI/P/B֡��֧��progressiv��interlaced���ṩCAVLC��CABAC
	 * \endif
	 */
	public static final int SDK_PROFILE_MAIN = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * offer I/P/B/SP/SI frame,only support progressive and CAVLC
	 * \else
	 * �ṩI/P/B/SP/SI֡����֧��progressive(����ɨ��)��CAVLC
	 * \endif
	 */
	public static final int SDK_PROFILE_EXTENDED = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * FRExt,base on Main_Profile:8x8 intra prediction, custom quant, lossless video coding, more yuv
	 * \else
	 * ��FRExt��Main_Profile������������8x8 intra prediction(8x8 ֡��Ԥ��), custom 
	 * quant(�Զ�������), lossless video coding(������Ƶ����), �����yuv��ʽ
	 * \endif
	 */
	public static final int SDK_PROFILE_HIGH = 4;
}
