package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_GET_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public NET_SPLIT_TOUR_SOURCE[]  pstuWndSrcs;            // ������Ѳ��Ϣ����, �û������ڴ�
    public int                     nMaxWndCount;           	// �����������, �û���д
    public int                     nRetWndCount;			// ���صĴ�������
	
    public NET_OUT_GET_TOUR_SOURCE(int maxWndCount, int maxSrcCount) {
    	this.nMaxWndCount = maxWndCount;
    	pstuWndSrcs = new NET_SPLIT_TOUR_SOURCE[maxWndCount];
    	
    	for(int i = 0; i < nMaxWndCount; ++i) {
    		pstuWndSrcs[i] = new NET_SPLIT_TOUR_SOURCE(maxSrcCount);
    	}
	}           
}
