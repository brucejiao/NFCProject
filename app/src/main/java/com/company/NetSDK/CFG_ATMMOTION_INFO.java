package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ATM Withdraw Overtime Configuration 
 * \else
 * ATMȡ�ʱ����
 * \endif
 */
public class CFG_ATMMOTION_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Withdraw Overtime Time,Unit:Second 
	 * \else
	 * ȡ�ʱʱ��,��λ:��
	 * \endif
	 */
	public int				nTimeLimit;
}