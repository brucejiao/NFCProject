package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Out Attribute Structure
 * \else
 * ��Ƶ�������
 * \endif
 */
public class AV_CFG_VideoOutAttr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Left, Ratio, 0~100 
	 * \else
	 * ��߾�, ����, 0~100
	 * \endif
	 */
	public int				nMarginLeft;
	
 	/**
	 * \if ENGLISH_LANG
	 * MarginT op, Ratio, 0~100 
	 * \else
	 * �ϱ߾�, ����, 0~100
	 * \endif
	 */
	public int				nMarginTop;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Right, Ratio, 0~100
	 * \else
	 * �ұ߾�, ����, 0~100
	 * \endif
	 */
	public int				nMarginRight;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Bottom, Ratio, 0~100 
	 * \else
	 * �±߾�, ����, 0~100
	 * \endif
	 */
	public int				nMarginBottom;
	
 	/**
	 * \if ENGLISH_LANG
	 * Brightness, 0~100 
	 * \else
	 * ����, 0~100
	 * \endif
	 */
	public int				nBrightness;
	
 	/**
	 * \if ENGLISH_LANG
	 * Contrast, 0~100 
	 * \else
	 * �Աȶ�, 0~100
	 * \endif
	 */
	public int				nContrast;
	
 	/**
	 * \if ENGLISH_LANG
	 * Saturation, 0~100 
	 * \else
	 * ���Ͷ�, 0~100
	 * \endif
	 */
	public int				nSaturation;
	
 	/**
	 * \if ENGLISH_LANG
	 * Hue, 0~100 
	 * \else
	 * ɫ��, 0~100
	 * \endif
	 */
	public int				nHue;
	
 	/**
	 * \if ENGLISH_LANG
	 * Horizontal Resolution 
	 * \else
	 * ˮƽ�ֱ���
	 * \endif
	 */
	public int				nWidth;
	
 	/**
	 * \if ENGLISH_LANG
	 * Vertical Resolution
	 * \else
	 * ��ֱ�ֱ���
	 * \endif
	 */
	public int				nHeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * Color Depth 
	 * \else
	 * ��ɫ���
	 * \endif
	 */
	public int				nBPP;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-Auto, 1-TV, 2-VGA, 3-DVI 
	 * \else
	 * 0-Auto, 1-TV, 2-VGA, 3-DVI
	 * \endif
	 */
	public int				nFormat;
	
 	/**
	 * \if ENGLISH_LANG
	 * Refresh Rate 
	 * \else
	 * ˢ��Ƶ��
	 * \endif
	 */
	public int				nRefreshRate;
	
 	/**
	 * \if ENGLISH_LANG
	 * Picture Out Gain 
	 * \else
	 * ���ͼ����ǿ
	 * \endif
	 */
	public boolean			bIQIMode;
	
 	/**
	 * \if ENGLISH_LANG
	 * Scan mode, 0-progressive, 1-interlacing
	 * \else
	 * ɨ��ģʽ, 0-����, 1-����
	 * \endif
	 */
	public int				nScanFormat;
}
