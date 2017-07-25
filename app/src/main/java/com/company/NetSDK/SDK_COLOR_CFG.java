package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Color Attribute
 * \else
 * ������ɫ����
 * \endif
 */
public class SDK_COLOR_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Scehdule
	 * \else
	 * ʱ���
	 * \endif
	 */
	public SDK_TSECT			stSect = new SDK_TSECT();

	/**
	 * \if ENGLISH_LANG
	 * Brightness; 0-100 
	 * \else
	 * ���ȣ�0-100
	 * \endif
	 */
	public byte				byBrightness;			

	/**
	 * \if ENGLISH_LANG
	 * Contrast; 0-100 
	 * \else
	 * �Աȶȣ�0-100
	 * \endif
	 */
	public byte				byContrast;				

	/**
	 * \if ENGLISH_LANG
	 * Saturation; 0-100 
	 * \else
	 * ���Ͷȣ�0-100
	 * \endif
	 */
	public byte				bySaturation;			

	/**
	 * \if ENGLISH_LANG
	 * Hue 
	 * \else
	 * ɫ�ȣ�0-100
	 * \endif
	 */
	public byte				byHue;					

	/**
	 * \if ENGLISH_LANG
	 * gain 
	 * \else
	 * ����ʹ��
	 * \endif
	 */
	public byte				byGainEn;				

	/**
	 * \if ENGLISH_LANG
	 * gain:0-100 
	 * \else
	 * ���棻0-100
	 * \endif
	 */
	public byte				byGain;					

	/**
	 * \if ENGLISH_LANG
	 * value 0-100 
	 * \else
	 * ٤��ֵ 0-100
	 * \endif
	 */
	public byte				byGamma;                
}
