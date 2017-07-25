package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_MONITORWALL_GET_ENABLE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nMonitorWallNum;                // Ҫ��ѯ�ĵ���ǽ����, -1��ʾ��ѯ���е���ǽ
    public byte[][]            szNames = new byte[FinalVar.SDK_MAX_MONITORWALL_NUM][FinalVar.SDK_COMMON_STRING_128];  // ����ǽ����, nMonitorWallNum>0ʱ��Ч
}
