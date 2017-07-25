package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio encode information
 * \else
 * ����������Ϣ
 * \endif
 */
public class SDKDEV_TALKDECODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Encode type
	 * \else
	 * ��������
	 * \endif
	 */
	public int					encodeType;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit:8/16
	 * \else
	 * 6λ������8��1
	 * \endif
	 */
	public int					nAudioBit;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling rate such as 8000 or 16000
	 * \else
	 * �����ʣ���8000��16000
	 * \endif
	 */
	public int					dwSampleRate;
	
	/**
	 * \if ENGLISH_LANG
	 * Pack Period,Unit ms
	 * \else
	 * �������, ��λms
	 * \endif
	 */
	public int                  nPacketPeriod;
}
