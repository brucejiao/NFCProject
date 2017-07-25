package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Current decoding channel status(including channel status, decoding stream info and etc.)
 * \else
 * ��ǰ����ͨ��״̬��Ϣ(����ͨ��״̬����������Ϣ��)
 * \endif
 */
public class DEV_DECCHANNEL_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Responding decoding channel number
	 * \else
	 * ��Ӧ����ͨ����
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * Current decoding channel in opertion status:0 -free,1 -realtime monitoring,2 - playback 3 - Decode Tour
	 * \else
	 * ��ǰ����ͨ�����ڲ���״̬:0�����У�1��ʵʱ���ӣ�2���ط� 3 - ��Ѳ
	 * \endif
	 */
	public byte            byChnState;
	
	/**
	 * \if ENGLISH_LANG
	 * Current data frame rate
	 * \else
	 * ��ǰ����֡��
	 * \endif
	 */
	public byte			byFrame;
	                       
	/**
	 * \if ENGLISH_LANG
	 * Decoding channel data amount
	 * \else
	 * ����ͨ����������
	 * \endif
	 */
	public int				nChannelFLux;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoding data amount
	 * \else
	 * ����������
	 * \endif
	 */
	public int             nDecodeFlux;
	
	/**
	 * \if ENGLISH_LANG
	 * Current data resolution
	 * \else
	 * ��ǰ���ݷֱ���
	 * \endif
	 */
	public byte            szResolution[] = new byte[16];
}
