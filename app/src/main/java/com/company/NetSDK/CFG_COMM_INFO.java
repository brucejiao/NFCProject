package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial Port Info Structur
 * \else
 * ������Ϣ�ṹ��
 * \endif
 */
public class CFG_COMM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial Port Protocol 
	 * \else
	 * Э������
	 * \endif
	 */
	public char             szProtocolName[] = new char[FinalVar.MAX_PROTOCOL_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Serial Port Attribute 
	 * \else
	 * ��������
	 * \endif
	 */
	public CFG_COMM_PROP    stuAttribute = new CFG_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Device Address 
	 * \else
	 * ���ڵ�ַ
	 * \endif
	 */
	public int              nAddress;
}
