package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio Format
 * \else
 * ��Ƶ��ʽ
 * \endif
 */
public class CFG_AUDIO_ENCODE_FORMAT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * ability
	 * \else
	 * ����
	 * \endif
	 */
	public boolean				abCompression;
	public boolean				abDepth;
	public boolean				abFrequency;
	public boolean				abMode;
	public boolean				abFrameType;
	public boolean				abPacketPeriod;

	/**
	 * \if ENGLISH_LANG
	 * Audio Compression Format��CFG_AUDIO_FORMAT 
	 * \else
	 * ��Ƶѹ��ģʽ, CFG_AUDIO_FORMAT
	 * \endif
	 */
	public int					emCompression;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Depth 
	 * \else
	 * ��Ƶ�������
	 * \endif
	 */
	public int					nDepth;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Frequency 
	 * \else
	 * ��Ƶ����Ƶ��
	 * \endif
	 */
	public int					nFrequency;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Mode 
	 * \else
	 * ��Ƶ����ģʽ
	 * \endif
	 */
	public int					nMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Packet Mode, 0-DHAV, 1-PS 
	 * \else
	 * ��Ƶ���ģʽ, 0-DHAV, 1-PS
	 * \endif
	 */
	public int					nFrameType;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Packet Period, ms 
	 * \else
	 * ��Ƶ�������, ms
	 * \endif
	 */
	public int					nPacketPeriod;
}
