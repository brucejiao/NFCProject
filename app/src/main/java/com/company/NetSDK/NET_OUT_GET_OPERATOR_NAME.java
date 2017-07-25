package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output arguments of GetOperatorName
 * \else
 * GetOperatorName �������
 * \endif
 */
public class NET_OUT_GET_OPERATOR_NAME implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * operator name
	 * \else
	 * ����Ա�û���
	 * \endif
	 */
	public byte         szOpearatorName[] = new byte[FinalVar.MAX_USERNAME_LEN];
	

}
