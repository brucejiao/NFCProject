package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SET_DEVICE_POSITION implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public byte	szPosition[] = new byte[FinalVar.SDK_COMMON_STRING_512];
}
