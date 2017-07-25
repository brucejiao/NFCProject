package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Region Appointed Information
 * \else
 * ���򶥵���Ϣ
 * \endif
 */
public class CFG_POLYGON implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Abscissa 0~8191
	 * \else
	 * ������ 0~8191
	 * \endif
	 */
	public int					nX;
	
	/**
	 * \if ENGLISH_LANG
	 * Ordinate 0~8191
	 * \else
	 * ������ 0~8191
	 * \endif
	 */
	public int					nY;
}
