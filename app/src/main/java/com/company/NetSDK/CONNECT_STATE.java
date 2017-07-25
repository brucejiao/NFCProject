package com.company.NetSDK;

import java.io.Serializable;

public class CONNECT_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int  CONNECT_STATE_UNCONNECT = 0;
	public static final int  CONNECT_STATE_CONNECTING = 1;
	public static final int  CONNECT_STATE_CONNECTED = 2;
	public static final int  CONNECT_STATE_ERROR = 255;
}
