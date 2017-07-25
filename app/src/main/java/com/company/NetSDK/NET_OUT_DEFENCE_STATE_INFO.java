package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Info Output Parameter
 * \else
 * ����״̬��Ϣ���������
 * \endif
 */
public class NET_OUT_DEFENCE_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Zone valid number
	 * \else
	 * ������Ч����
	 * \endif
	 */
	public int             nDefenceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone status info, EM_DEFENCE_STATE_TYPE
	 * \else
	 * ����״̬��Ϣ, EM_DEFENCE_STATE_TYPE
	 * \endif
	 */
	public int anDefenceState[] = new int[FinalVar.SDK_MAX_ALARMIN];  
}

