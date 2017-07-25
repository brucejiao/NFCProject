package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture functional attributes structure
 * \else
 * ץͼ�������Խṹ��
 * \endif
 */
public class SDK_QUERY_SNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount 
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int					nChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution(Bit). Please refer to enumeration CAPTURE_SIZE
	 * \else
	 * �ֱ���(��λ)������鿴ö��CAPTURE_SIZE
	 * \endif
	 */
	public int					dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid length of Frequency[128] array
	 * \else
	 * Frequence[128]�������Ч����
	 * \endif
	 */
	public int					nFramesCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Frame rate(value) 
	 * -25:1f/25s;-24:1f/24s;-23:1f/23s;-22:1f/23s
	 * ?-?-
	 * 0: invalid;1:1f/s;2:2f/s;3:13f/s
	 * 4:4f/s;5:5f/s;17:17f/s;18:18f/s
	 * 19:19f/s;20:20f/s
	 * ?-?-
	 * 25: 25f/s
	 * \else
	 * ֡��(����ֵ)
	 * -25��25��1֡��-24��24��1֡��-23��23��1֡��-22��22��1֡
	 * ����
	 * 0����Ч��1��1��1֡��2��1��2֡��3��1��3֡
	 * 4��1��4֡��5��1��5֡��17��1��17֡��18��1��18֡
	 * 19��1��19֡��20��1��20֡
	 * ����
	 * 25: 1��25֡
	 * \endif
	 */
	public byte					Frames[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * valid length of SnapMode[16] array
	 * \else
	 * SnapMode[16]�������Ч����
	 * \endif
	 */
	public int					nSnapModeCount;
	
	/**
	 * \if ENGLISH_LANG
	 * (value)0:activate scheduled snapshot,1:Manually activate snapshot
	 * \else
	 * (����ֵ)0����ʱ����ץͼ��1���ֶ�����ץͼ
	 * \endif
	 */
	public byte					SnapMode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid length of Format[16] array
	 * \else
	 * Format[16]�������Ч����
	 * \endif
	 */
	public int					nPicFormatCount;
	
	/**
	 * \if ENGLISH_LANG
	 * (Value)0:BMP format,1:JPG format
	 * \else
	 * (����ֵ)0��BMP��ʽ��1��JPG��ʽ
	 * \endif
	 */
	public byte 				PictureFormat[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * valid length of Quality[32] array
	 * \else
	 * Quality[32]�������Ч����
	 * \endif
	 */
	public int					nPicQualityCount;
	
	/**
	 * \if ENGLISH_LANG
	 * value
	 * 100:Image quality 100%;80:Image quality 80%;60:Image quality60%
	 * 50:Image quality50%;30:Image quality30%;10:Image quality10%
	 * \else
	 * ����ֵ
	 * 100��ͼ������100%��80:ͼ������80%��60:ͼ������60%
	 * 50:ͼ������50%��30:ͼ������30%��10:ͼ������10%
	 * \endif
	 */
	public byte 				PictureQuality[] = new byte[32];
}
