package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SET_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                     nChannel;               // ���ͨ����
    public int                     nWindow;                // ���ں�
    public SDK_SPLIT_SOURCE[]      pstuSrcs;               // ��ʾԴ����, �ɽ��д�����Ѳ
    public int                     nSrcCount;              // ��ʾԴ����
	public NET_IN_SET_TOUR_SOURCE(int nSrcCount) {
		this.nSrcCount = nSrcCount;
		
		pstuSrcs = new SDK_SPLIT_SOURCE[nSrcCount];
		for (int i = 0; i < pstuSrcs.length; i++) {
			pstuSrcs[i] = new SDK_SPLIT_SOURCE(); 
		}
	}
}
