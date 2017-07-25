package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input color config. Each input video has several corresponding color setups. 
 * \else
 * ��Ƶ������ɫ����, ÿ����Ƶ����ͨ����Ӧ�����ɫ����
 * \endif
 */
public class AV_CFG_VideoColor implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Period
	 * \else
	 * ʱ���
	 * \endif
	 */
	public AV_CFG_TimeSection	stuTimeSection = new AV_CFG_TimeSection();
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness, 1~100
	 * \else
	 * ����, 0~100
	 * \endif
	 */
	public int			nBrightness;
	
	/**
	 * \if ENGLISH_LANG
	 * Contrastness, 1~100
	 * \else
	 * �Աȶ�, 0~100
	 * \endif
	 */
	public int			nContrast;
	
	/**
	 * \if ENGLISH_LANG
	 * Saturation, 1~100
	 * \else
	 * ���Ͷ�, 0~100
	 * \endif
	 */
	public int			nSaturation;
	
	/**
	 * \if ENGLISH_LANG
	 * Hue, 1~100
	 * \else
	 * ɫ��, 0~100
	 * \endif
	 */
	public int			nHue;
	
	/**
	 * \if ENGLISH_LANG
	 * plus, 0~100
	 * \else
	 * ����, 0~100
	 * \endif
	 */
	public int			nGamma;
}
