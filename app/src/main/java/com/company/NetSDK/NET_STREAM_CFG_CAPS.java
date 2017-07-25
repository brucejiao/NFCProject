package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * stream config corresponding capacity
 * \else
 * �������ö�Ӧ����
 * \endif
 */
public class NET_STREAM_CFG_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * supported audio encode type��see DH_TALK_CODING_TYPE
	 * \else
	 * ֧�ֵ���Ƶ�������ͣ����DH_TALK_CODING_TYPE
	 * \endif
	 */
	public int                 nAudioCompressionTypes[] = new int[FinalVar.SDK_MAX_AUDIO_ENCODE_TYPE];
	
	/**
	 * \if ENGLISH_LANG
	 * audio compression quantity
	 * \else
	 * ��Ƶѹ����ʽ����
	 * \endif
	 */
	public int                 nAudioCompressionTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * video encode mode mask��see "encode mode"
	 * \else
	 * ��Ƶ����ģʽ���룬���"����ģʽ"
	 * \endif
	 */
	public int                 dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * supportedvideo resolution, discard
	 * \else
	 * ֧�ֵ���Ƶ�ֱ���
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolutionTypes[] = new SDK_RESOLUTION_INFO[FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * different resolution max frame, subscript nResolutionTypescorresponding
	 * \else
	 * ��ͬ�ֱ�����֡�����ֵ���±���nResolutionTypes��Ӧ
	 * \endif
	 */
	public int                 nResolutionFPSMax[] = new int[FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * video resolution quantity
	 * \else
	 * ��Ƶ�ֱ��ʸ���
	 * \endif
	 */
	public int                 nResolutionTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * max video stream(kbps)
	 * \else
	 * �����Ƶ����(kbps)
	 * \endif
	 */
	public int                 nMaxBitRateOptions; 
	
	/**
	 * \if ENGLISH_LANG
	 * min video stream(kbps)
	 * \else
	 * ��С��Ƶ����(kbps)
	 * \endif
	 */
	public int                 nMinBitRateOptions;
	
	/**
	 * \if ENGLISH_LANG
	 * supported��H.264 Profile level,refer to enumeration type EM_H264_PROFILE_RANK;
	 * \else
	 * ֧�ֵ�H.264 Profile�ȼ�������ö������ EM_H264_PROFILE_RANK;
	 * \endif
	 */
	public byte                bH264ProfileRank[] = new byte[EM_H264_PROFILE_RANK.SDK_PROFILE_HIGH];
	
	/**
	 * \if ENGLISH_LANG
	 * supported H.264 Profile level
	 * \else
	 * ֧�ֵ�H.264 Profile�ȼ�����
	 * \endif
	 */
	public int                 nH264ProfileRankNum;
	
	/**
	 * \if ENGLISH_LANG
	 * when resolution is  cif, max p frame(Kbps)
	 * \else
	 * ���ֱ���Ϊcifʱ���p֡(Kbps)
	 * \endif
	 */
	public int                 nCifPFrameMaxSize;
	
	/**
	 * \if ENGLISH_LANG
	 * when currentresolution is cif, min p frame(Kbps)
	 * \else
	 * ���ֱ���Ϊcifʱ��Сp֡(Kbps)
	 * \endif
	 */
	public int                 nCifPFrameMinSize;
	
	/**
	 * \if ENGLISH_LANG
	 * video max frame rate��as 0 ��make nResolutionFPSMax as standard
	 * \else
	 * ��Ƶ֡�����ֵ��Ϊ0ʱ����nResolutionFPSMaxΪ׼
	 * \endif
	 */
	public int                 nFPSMax;
	
	/**
	 * \if ENGLISH_LANG
	 * supportedvideo resolution
	 * \else
	 * ֧�ֵ���Ƶ�ֱ���
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuIndivResolutionTypes[][] = new SDK_RESOLUTION_INFO[FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM][FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * 0: stuResolutionTypes is valid 1: stuIndivResolutionTypes is valid
	 * \else
	 * 0: stuResolutionTypes,nResolutionTypeNum ��Ч
	 * \endif
	 */
	public boolean             abIndivResolution;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ��ͬ����ģʽ�ֱ�֧�ֵ���Ƶ�ֱ��ʸ���
	 * \endif
	 */
	public int                 nIndivResolutionNums[] = new int[FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM];
	
	public NET_STREAM_CFG_CAPS() {
		for (int i = 0; i < FinalVar.SDK_MAX_CAPTURE_SIZE_NUM; i++) {
			stuResolutionTypes[i] = new SDK_RESOLUTION_INFO();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM; i++) {
			for (int j = 0; j < FinalVar.SDK_MAX_CAPTURE_SIZE_NUM; j++) {
				stuIndivResolutionTypes[i][j] = new SDK_RESOLUTION_INFO();
			}
		}
	}
}
