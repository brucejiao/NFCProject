package com.company.NetSDK;

import java.io.Serializable;

public class NET_MONITORWALL_ENABLE_INFO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean             bEanble;                        // ʹ��
	public byte[]              szName = new byte[FinalVar.SDK_COMMON_STRING_128];   // ����ǽ����

}
