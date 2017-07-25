package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_GET_BACKGROUND implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean             bEnable;                            // ʹ��
    public byte[]             szFileName = new byte[FinalVar.SDK_COMMON_STRING_256];   // ����ͼ����

}
