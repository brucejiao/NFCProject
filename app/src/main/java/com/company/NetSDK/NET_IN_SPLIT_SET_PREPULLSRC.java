package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_SET_PREPULLSRC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int             nChannel;                   // ��Ƶ���ͨ��
    public int             nWindow;                    // ���ں�
    public int             nSrcCount;                  // Ԥ����Դ����
    public SDK_SPLIT_SOURCE[] pSources;                  // Ԥ����Դ��Ϣ
	
    public NET_IN_SPLIT_SET_PREPULLSRC(int sourceCount){
    	this.nSrcCount = sourceCount;
    	pSources = new SDK_SPLIT_SOURCE[sourceCount];
    	for (int i = 0; i < sourceCount; ++i) {
    		pSources[i] = new SDK_SPLIT_SOURCE();
    	}
    } 
}
