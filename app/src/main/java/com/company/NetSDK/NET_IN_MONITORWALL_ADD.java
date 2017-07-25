package com.company.NetSDK;

import java.io.Serializable;
public class NET_IN_MONITORWALL_ADD implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    public SDK_MONITORWALL stuMonitorWall; // ����ǽ��Ϣ

    public NET_IN_MONITORWALL_ADD(int blockCount, int OutputCount) {
    	stuMonitorWall = new SDK_MONITORWALL(blockCount, OutputCount);
    }
}
