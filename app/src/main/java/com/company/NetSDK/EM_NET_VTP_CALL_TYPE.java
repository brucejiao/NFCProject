package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of video phone call
 * \else
 *  ��Ƶ�绰��������
 * \endif
 */
public class EM_NET_VTP_CALL_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SIP calling
	 * \else
	 * SIP����
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_TYPE_SIP = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * GSM calling
	 * \else
	 * GSM����
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_TYPE_GSM = 1; 
}
