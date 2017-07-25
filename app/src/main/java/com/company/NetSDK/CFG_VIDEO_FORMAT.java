package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Format
 * \else
 * ��Ƶ��ʽ
 * \endif
 */
public class CFG_VIDEO_FORMAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Capacity 
	 * \else
	 * ����
	 * \endif
	 */
	public boolean				abCompression;
	public boolean				abWidth;
	public boolean				abHeight;
	public boolean				abBitRateControl;
	public boolean				abBitRate;
	public boolean				abFrameRate;
	public boolean				abIFrameInterval;
	public boolean				abImageQuality;
	public boolean				abFrameType;
	public boolean				abProfile;

	/**
	 * \if ENGLISH_LANG
	 * Compression Format , CFG_VIDEO_COMPRESSION
	 * \else
	 * ��Ƶѹ����ʽ, CFG_VIDEO_COMPRESSION
	 * \endif
	 */
	public int					emCompression;			

	/**
	 * \if ENGLISH_LANG
	 * Video Width
	 * \else
	 * ��Ƶ���
	 * \endif
	 */
	public int					nWidth;						

	/**
	 * \if ENGLISH_LANG
	 * Video Height 
	 * \else
	 * ��Ƶ�߶�
	 * \endif
	 */
	public int					nHeight;					

	/**
	 * \if ENGLISH_LANG
	 * Bit Rate Control, CFG_VIDEO_COMPRESSION
	 * \else
	 * ��������ģʽ, CFG_VIDEO_COMPRESSION
	 * \endif
	 */
	public int					emBitRateControl;			

	/**
	 * \if ENGLISH_LANG
	 * Bit Rate(kbps) 
	 * \else
	 * ��Ƶ����(kbps)
	 * \endif
	 */
	public int					nBitRate;					

	/**
	 * \if ENGLISH_LANG
	 * Frame Rate 
	 * \else
	 * ��Ƶ֡��
	 * \endif
	 */
	public float				nFrameRate;					

	/**
	 * \if ENGLISH_LANG
	 * I Frame Interval 
	 * \else
	 * I֡���(1-100)������50��ʾÿ49��B֡��P֡������һ��I֡��
	 * \endif
	 */
	public int					nIFrameInterval;			

	/**
	 * \if ENGLISH_LANG
	 * Image Quality��VBR����value��1-6 6��best image quality, CFG_VIDEO_COMPRESSION
	 * \else
	 * ͼ������, CFG_VIDEO_COMPRESSION
	 * \endif
	 */
	public int					emImageQuality;				

	/**
	 * \if ENGLISH_LANG
	 * Frame Type 0��DHAV��1��"PS"
	 * \else
	 * ���ģʽ.0��DHAV��1��"PS"
	 * \endif
	 */
	public int					nFrameType;					

	/**
	 * \if ENGLISH_LANG
	 * CFG_H264_PROFILE_RANK
	 * \else
	 * H.264���뼶��, CFG_H264_PROFILE_RANK
	 * \endif
	 */
	public int					emProfile;                
}
