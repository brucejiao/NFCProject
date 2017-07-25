package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_NETCARD_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * card number
	 * \else
	 * ��Ч������
	 * \endif
	 */
    public int                nCardNum; 
    
    /**
	 * \if ENGLISH_LANG
	 * card info string
	 * \else
	 * ������Ϣ�ַ���
	 * \endif
	 */
    public byte               cardInfo[][] = new byte[FinalVar.SDK_MAX_CARD_NUM][FinalVar.SDK_MAX_CARDINFO_LEN];  
}
