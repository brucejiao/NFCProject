package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye mode
 * \else
 * ���۽���ģʽ
 * \endif
 */
public class CFG_CALIBRATE_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknown mode 
	 * \else
	 * δ֪ģʽ 
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_UNKOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * original image mode
	 * \else
	 * ԭʼͼ��ģʽ
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_ORIGIAL = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * config mode
	 * \else
	 * ����ģʽ
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_CONFIG = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * panorama mode
	 * \else
	 * ȫ��ģʽ
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_PANORAMA = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * dual panorama mode
	 * \else
	 * ˫ȫ��ģʽ
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_DOUBLEPANORAMA = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 1+3 mode�ꡧone original fish eyeimage plus 3 EPtz images��?
	 * \else
	 * 1+3ģʽ��һ��ԭʼ����ͼ���3��EPtzͼ��
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_ORIGIALPLUSTHREEEPTZREGION = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * single image EPtz mode�ꡧonly one EPtz image��?
	 * \else
	 * ������EPtzģʽ��ֻ��һ��EPtz���棩
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_SINGLE = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * 4 image mode�ꡧ4 EPtz control images��?
	 * \else
	 * 4����ģʽ��4��EPtz���ƻ��棩
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_FOUREPTZREGION = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * normal mode
	 * \else
	 * ��ͨģʽ
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_NORMAL = 8;
}
