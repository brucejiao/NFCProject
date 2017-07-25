package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_MONITORWALL_GET_ENABLE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int                 nMonitorWallNum;                // ����ǽ����
    public NET_MONITORWALL_ENABLE_INFO[] stuEnable = new NET_MONITORWALL_ENABLE_INFO[FinalVar.SDK_MAX_MONITORWALL_NUM];  // ����ǽʹ��

    public NET_OUT_MONITORWALL_GET_ENABLE() {
    	for(int i = 0 ; i < FinalVar.SDK_MAX_MONITORWALL_NUM; ++i) {
    		stuEnable[i] = new NET_MONITORWALL_ENABLE_INFO();
    	}
    }
}
