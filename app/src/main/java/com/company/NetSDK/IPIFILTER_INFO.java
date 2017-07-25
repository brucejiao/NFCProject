package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IP Information
 * \else
 * IP��Ϣ
 * \endif
 */
public class IPIFILTER_INFO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int               dwIPNum;
	public byte                SZIP[][] = new byte[FinalVar.SDK_IPIFILTER_NUM][FinalVar.SDK_MAX_IPADDR_LEN];
}
