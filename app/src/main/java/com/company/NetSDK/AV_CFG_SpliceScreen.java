package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * array
 * \else
 * ����
 * \endif
 */
public class AV_CFG_SpliceScreen implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * Splice screen name
	 * \else
	 * ƴ��������
	 * \endif
	 */
	public byte[]  	    szName = new byte[FinalVar.AV_CFG_Channel_Name_Len];	
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor wall name
	 * \else
	 * ��������ǽ����
	 * \endif
	 */
	public byte[]       szWallName = new byte[FinalVar.AV_CFG_Monitor_Name_Len];// ��������ǽ����
	
	/**
	 * \if ENGLISH_LANG
	 * Zone number
	 * \else
	 * �����������
	 * \endif
	 */
	public int			nBlockID;			
	
	/**
	 * \if ENGLISH_LANG
	 * Zone axis
	 * \else
	 * ��������(0~8191)
	 * \endif
	 */
	public AV_CFG_Rect	stuRect = new AV_CFG_Rect();							// ��������(0~8191)
}
