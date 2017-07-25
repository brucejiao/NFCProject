package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel audio and video properties
 * \else
 * ͨ������Ƶ����
 * \endif
 */
public class SDK_VIDEOENC_OPT implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The Video Enable; 1: open, 0: Close
	 * \else
	 * ��Ƶʹ�ܣ�1���򿪣�0���ر�
	 * \endif
	 */
	
	public byte				byVideoEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Stream Control; referring to the constant stream control "defined as follows:
	 * Definition			Numerical 
	 * SDK_CAPTURE_BRC_CBR	0 
	 * SDK_CAPTURE_BRC_VBR	1 
	 * \else
	 * �������ƣ����ճ���"��������"����
	 * \endif
	 */
	public byte				byBitRateControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Frame rate
	 * \else
	 * ֡��
	 * \endif
	 */
	public byte				byFramesPerSec;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode mode:please refer to constant Encode Mode definition
	 * \else
	 * ����ģʽ�����ճ���"����ģʽ"����
	 * \endif
	 */
	public byte				byEncodeMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution:please refer to constant Resolution definition.
	 * \else
	 * �ֱ��ʣ����ճ���"�ֱ���"����
	 * \endif
	 */
	public byte				byImageSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Level 1-6
	 * \else
	 * ��byImageQlty������չ����byImageQltyΪ0��ץͼ���õ�ImgQltyΪ10/30/50/60/80/100����ֵ���������õ�ImgQltyֵΪ1-6������֮ǰ��1-6���Σ���//ImgQltyTypeΪ1����ImgQlty��ΧΪ0~100
	 * \endif
	 */
	public byte				byImageQlty;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public byte             byImageQltyType;
	
	/**
	 * \if ENGLISH_LANG
	 * Limit stream parameter
	 * \else
	 * ����������
	 * \endif
	 */
	public int				wLimitStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable audio;1:open,0:close
	 * \else
	 * ��Ƶʹ�ܣ�1���򿪣�0���ر�
	 * \endif
	 */
	public byte				byAudioEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode mode:0:G711A,1:PCM,2:G711U,3:AMR,4:AAC
	 * \else
	 * ��Ƶ��������: 0:G711A,1:PCM,2:G711U,3:AMR,4:AAC
	 * \endif
	 */
	public byte				wFormatTag;
	
	/**
	 * \if ENGLISH_LANG
	 * Track amount
	 * \else
	 * ������
	 * \endif
	 */
	public int				nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling depth 	
	 * \else
	 * �������	
	 * \endif
	 */
	public int				wBitsPerSample;
	
	/**
	 * \if ENGLISH_LANG
	 * Enabling audio
	 * \else
	 * ��Ƶ����ʹ��
	 * \endif
	 */
	public byte				bAudioOverlay;
	
	/**
	 * \if ENGLISH_LANG
	 * H.264 Profile rank(when byEncodeMode is h264, this value works ), see enmu struct EM_H264_PROFILE_RANK,when this value is 0, it means nothing
	 * \else
	 * H.264 Profile�ȼ�(������ģʽΪH264ʱ�˲���ֵ��Ч),����ö������EM_H264_PROFILE_RANK����0��������ǰ����ʾ���ֶ���Ч������Ҫ���Ǽ���
	 * \endif
	 */
	public byte				bH264ProfileRank;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling rate
	 * \else
	 * ������
	 * \endif
	 */
	public int				nSamplesPerSec;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-149. I frame interval amount. Describe the P frame amount between two I frames.
	 * \else
	 * I֡���֡��������������I֮֡���P֡������0-149
	 * \endif
	 */
	public byte				bIFrameInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				bScanMode;
}
