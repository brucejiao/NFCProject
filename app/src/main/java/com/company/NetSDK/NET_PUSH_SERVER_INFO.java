package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Push the server configuration
 * \else
 * ���ͷ���������
 * \endif
 */
public class NET_PUSH_SERVER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Address
	 * \else
	 * ��ַ
	 * \endif
	 */
	public byte                           szAddress[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * �˿�
	 * \endif
	 */
    public int                             nPort;
}
