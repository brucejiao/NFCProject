package com.company.NetSDK;

import java.io.Serializable;

public class NET_SPLIT_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public SDK_SPLIT_SOURCE[]        pstuSrcs;               // ��ʾԴ����, �û������ڴ�
    public int                       nMaxSrcCount;           // ��ʾԴ�������
    public int                       nRetSrcCount;           // ���ص���ʾԴ����
	
    public NET_SPLIT_TOUR_SOURCE(int nMaxSrcCount) {
		this.nMaxSrcCount = nMaxSrcCount;
		
		pstuSrcs = new SDK_SPLIT_SOURCE[nMaxSrcCount];
		
		for(int i = 0; i < nMaxSrcCount; ++i) {
			pstuSrcs[i] = new SDK_SPLIT_SOURCE();
		}
	}  
}
