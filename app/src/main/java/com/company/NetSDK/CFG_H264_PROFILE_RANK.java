package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * H264 code level
 * \else
 * H264 ���뼶��
 * \endif
 */
public class CFG_H264_PROFILE_RANK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P frame��only support progressive and CAVLC
	 * \else
	 * �ṩI/P֡����֧��progressive(����ɨ��)��CAVLC
	 * \endif
	 */
	public static final int PROFILE_BASELINE = 1;                       

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P/B frame��support progressiv and interlaced��provide CAVLC or CABAC
	 * \else
	 * �ṩI/P/B֡��֧��progressiv��interlaced���ṩCAVLC��CABAC
	 * \endif
	 */
	public static final int PROFILE_MAIN = 2;                               

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P/B/SP/SI frame, only support progressive and CAVLC
	 * \else
	 * �ṩI/P/B/SP/SI֡����֧��progressive(����ɨ��)��CAVLC
	 * \endif
	 */
	public static final int PROFILE_EXTENDED = 3;                           

	/**
	 * \if ENGLISH_LANG
	 * As FRExt��Main_Profile new��8x8 intra prediction(8x8 frame forecast), custom 
	 * quant(custom), lossless video coding, more yuv formats
	 * \else
	 * ��FRExt��Main_Profile������������8x8 intra prediction(8x8 ֡��Ԥ��), custom\n
	 * quant(�Զ�������), lossless video coding(������Ƶ����), �����yuv��ʽ
	 * \endif
	 */
	public static final int PROFILE_HIGH = 4;                               
												
}
