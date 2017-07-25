package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Cover Info
 * \else
 * �ڵ���Ϣ
 * \endif
 */
public class CFG_COVER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Capability 
	 * \else
	 * ����
	 * \endif
	 */
	public boolean				abBlockType;
	public boolean				abEncodeBlend;
	public boolean				abPreviewBlend;

	/**
	 * \if ENGLISH_LANG
	 * Covered Area Coordinate 
	 * \else
	 * ���ǵ���������
	 * \endif
	 */
	public CFG_RECT				stuRect = new CFG_RECT();					

	/**
	 * \if ENGLISH_LANG
	 * Covered Color 
	 * \else
	 * ���ǵ���ɫ
	 * \endif
	 */
	public CFG_RGBA				stuColor = new CFG_RGBA();					

	/**
	 * \if ENGLISH_LANG
	 * Covering Type. 0-Black, 1-Mosaic
	 * \else
	 * ���Ƿ�ʽ;0���ڿ飬1��������
	 * \endif
	 */
	public int					nBlockType;					

	/**
	 * \if ENGLISH_LANG
	 * Encode Blend.1-Take Effect;0-No Effect
	 * \else
	 * ���뼶�ڵ�;1����Ч��0������Ч
	 * \endif
	 */
	public int					nEncodeBlend;				

	/**
	 * \if ENGLISH_LANG
	 * Preview Blend;1-Take Effect;0-No Effect
	 * \else
	 * Ԥ���ڵ�;1����Ч��0������Ч
	 * \endif
	 */
	public int					nPreviewBlend;				
}
