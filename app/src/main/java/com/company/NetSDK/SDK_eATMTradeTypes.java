package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Trade type
 * \else
 * ��������
 * \endif
 */
public class SDK_eATMTradeTypes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * INSERTCARD
	 * \else
	 * �忨 
	 * \endif
	 */
	public static final int TRADE_TYPE_INC = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * WITHDRAWCARD
	 * \else
	 * �˿�
	 * \endif
	 */
	public static final int TRADE_TYPE_WDC = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * CHECKTIME
	 * \else
	 * Уʱ
	 * \endif
	 */
	public static final int TRADE_TYPE_CKT = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * QUERY
	 * \else
	 * ��ѯ
	 * \endif
	 */
	public static final int TRADE_TYPE_INQ = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Withdrawal
	 * \else
	 * ȡ��
	 * \endif
	 */
	public static final int TRADE_TYPE_CWD = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * Change password
	 * \else
	 * ����
	 * \endif
	 */
	public static final int TRADE_TYPE_PIN = 5;
	
 	/**
	 * \if ENGLISH_LANG
	 * Treansfer
	 * \else
	 * ת��
	 * \endif
	 */
	public static final int TRADE_TYPE_TFR = 6;
	
 	/**
	 * \if ENGLISH_LANG
	 * Saving
	 * \else
	 * ���
	 * \endif
	 */
	public static final int TRADE_TYPE_DEP = 7;
	
 	/**
	 * \if ENGLISH_LANG
	 * No-card search
	 * \else
	 * �޿���ѯ
	 * \endif
	 */
	public static final int TRADE_TYPE_NCINQ = 8;
	
 	/**
	 * \if ENGLISH_LANG
	 * No-card saving
	 * \else
	 * �޿����
	 * \endif
	 */
	public static final int TRADE_TYPE_NCDEP = 9;
	
 	/**
	 * \if ENGLISH_LANG
	 * Other
	 * \else
	 * ����
	 * \endif
	 */
	public static final int TRADE_TYPE_OTHERS = 10;
	
 	/**
	 * \if ENGLISH_LANG
	 * Total
	 * \else
	 * ��
	 * \endif
	 */
	public static final int TRADE_TYPE_ALL = 11;
}
