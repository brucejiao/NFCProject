package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Matrix sub card list
 * \else
 * �˿����
 * \endif
 */
public class SDK_MATRIX_CARD_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Sub card  amount
	 * \else
	 * �˿����
	 * \endif
	 */
	public int					nCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub card list 
	 * \else
	 * �ӿ��б�
	 * \endif
	 */
	public SDK_MATRIX_CARD		stuCards[] = new SDK_MATRIX_CARD[FinalVar.SDK_MATRIX_MAX_CARDS];	
	
	public SDK_MATRIX_CARD_LIST() {
		for (int i = 0; i < FinalVar.SDK_MATRIX_MAX_CARDS; i++) {
			stuCards[i] = new SDK_MATRIX_CARD();
		}
	}
}
