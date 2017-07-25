package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_OPEN_WINDOWS implements Serializable {
	private static final long serialVersionUID = 1L;
	
    public NET_SPLIT_WINDOW_INFO[]  pstuWindows;                // ������Ϣ, �û������ڴ�

	public int                 nMaxWindowCount;                // ������Ϣ�������, �û�����
    public int                 nRetWindowCount;                // ��������
    
    public NET_OUT_SPLIT_OPEN_WINDOWS(int maxWindowCount) {
    	this.nMaxWindowCount = maxWindowCount;
    	pstuWindows = new  NET_SPLIT_WINDOW_INFO[maxWindowCount];
    	for (int i = 0; i < maxWindowCount; ++i ) {
    		pstuWindows[i] = new  NET_SPLIT_WINDOW_INFO();
    	}
    }
}
