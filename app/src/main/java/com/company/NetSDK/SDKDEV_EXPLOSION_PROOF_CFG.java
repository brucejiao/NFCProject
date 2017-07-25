package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * explosion proof alarm configuration
 * \else
 * �����б����¼�����
 * \endif
 */
public class SDKDEV_EXPLOSION_PROOF_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * explosion proof alarm configuration enable
	 * \else
	 * �����б���ʹ��
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * handle method
	 * \else
	 * ����ʽ
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX(); 
}
