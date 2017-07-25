package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Voice-activated audio channel configuration
 * \else
 * ����������Ƶͨ������
 * \endif
 */
public class CFG_AUDIO_SPIRIT_CHANNEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Voice incentives linked video channel number
	 * \else
	 * ��������������Ƶͨ����
	 * \endif
	 */
	public int				nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice incentive priorities, 1 ~ 10
	 * \else
	 * �����������ȼ�, 1~10
	 * \endif
	 */
	public int				nPriority;
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding video camera preset point, consistent with the 0 to 255 PTZ
	 * \else
	 *  ��Ӧ����Ƶ�������Ԥ�õ�, ����̨һ��0~255
	 * \endif
	 */
	public int				nPreset;
	
}