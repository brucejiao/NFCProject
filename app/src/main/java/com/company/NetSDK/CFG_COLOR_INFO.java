package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Color Info
 * \else
 * ������ɫ����
 * \endif
 */
public class CFG_COLOR_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Brightness,0-100 
	 * \else
	 * ����(0-100)
	 * \endif
	 */
	public int					nBrightness;				

	/**
	 * \if ENGLISH_LANG
	 * Contrast,0-100 
	 * \else
	 * �Աȶ�(0-100)
	 * \endif
	 */
	public int					nContrast;					

	/**
	 * \if ENGLISH_LANG
	 * Saturation,0-100 
	 * \else
	 * ���Ͷ�(0-100)
	 * \endif
	 */
	public int					nSaturation;				

	/**
	 * \if ENGLISH_LANG
	 * Hue,0-100 
	 * \else
	 * ɫ��(0-100)
	 * \endif
	 */
	public int					nHue;						

	/**
	 * \if ENGLISH_LANG
	 * Gain,0-100 
	 * \else
	 * ����(0-100)
	 * \endif
	 */
	public int					nGain;						

	/**
	 * \if ENGLISH_LANG
	 * Gain Enable 
	 * \else
	 * ����ʹ��
	 * \endif
	 */
	public boolean				bGainEn;					
}
