package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_MONITORWALL_REMOVE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nMonitorWallNum;                // Ҫɾ���ĵ���ǽ����
    public byte[][]            szNames = new byte[FinalVar.SDK_MAX_MONITORWALL_NUM][FinalVar.SDK_COMMON_STRING_128];  // ����ǽ����

}
