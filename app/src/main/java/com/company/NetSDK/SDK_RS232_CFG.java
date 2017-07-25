package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232 Serial port configuration
 * \else
 * 232��������
 * \endif
 */
public class SDK_RS232_CFG implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial port Property
	 * \else
	 * ��������
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Serial port functions,Correspond"SDKDEV_COMM_CFG""s232FuncName"(Function name list)
	 * \else
	 * ���ڹ��ܣ���Ӧ"SDKDEV_COMM_CFG"��"s232FuncName"(�������б�)���±�
	 * \endif
	 */
	public byte                byFunction;
}
