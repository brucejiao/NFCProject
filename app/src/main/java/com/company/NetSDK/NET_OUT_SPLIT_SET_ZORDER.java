package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_SET_ZORDER implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SDK_WND_ZORDER[]    pZOders;                        // ���ڴ�������, �û������ڴ�
    public int                 nMaxWndCount;                   // ���ڴ��������С
    public int                 nWndCount;                      // ���صĴ�������
    
    public NET_OUT_SPLIT_SET_ZORDER(int maxWindowCount) {
    	this.nMaxWndCount = maxWindowCount;
    	
    	pZOders = new SDK_WND_ZORDER[maxWindowCount];
    	for(int i = 0; i < maxWindowCount; ++i) {
    		pZOders[i] = new SDK_WND_ZORDER();
    	}
    }
}
