package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_SET_PREPULLSRC implements Serializable{
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int             nResultCount;               // �������, ��Ԥ����Դ������ͬ
    public NET_SPLIT_SET_PREPULLSRC_RESULT[] pResults;  // ���
    
    public NET_OUT_SPLIT_SET_PREPULLSRC(int preResultCount) {
    	pResults = new NET_SPLIT_SET_PREPULLSRC_RESULT[preResultCount];
    	
    	for(int i = 0; i < preResultCount; ++i) {
    		pResults[i] = new NET_SPLIT_SET_PREPULLSRC_RESULT();
    	}
    }
}
