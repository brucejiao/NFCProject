package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event report with card info
 * \else
 * �˿����
 * \endif
 */
public class EVENT_CARD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Card no. string
	 * \else
	 * ��Ƭ����ַ���
	 * \endif
	 */
	public byte szCardNumber[] = new byte[FinalVar.SDK_EVENT_CARD_LEN];     
}
