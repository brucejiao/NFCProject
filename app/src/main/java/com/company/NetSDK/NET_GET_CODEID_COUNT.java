package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get successful code item number
 * \else
 * ��ȡ����ɹ���������
 * \endif
 */
public class NET_GET_CODEID_COUNT implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Code successful total items
	 * \else
	 * ����ɹ���������
	 * \endif
	 */
	public int nCodeIDCount;      
}
