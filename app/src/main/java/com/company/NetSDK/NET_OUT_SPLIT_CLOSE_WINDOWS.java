package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_CLOSE_WINDOWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
    public NET_SPLIT_CLOSE_WINDOW_RESULT[] pstuResults;         // �������, �û������ڴ�. �������Ҫ���ؽ��, ����ΪNULL
    public int                 nMaxResultCount;                // ��������������, �û���д.
    public int                 nRetResultCount;                // ���صĽ������
    
    public NET_OUT_SPLIT_CLOSE_WINDOWS(int maxResultCount) {
    	this.nMaxResultCount = maxResultCount;
    	
    	pstuResults = new NET_SPLIT_CLOSE_WINDOW_RESULT[maxResultCount];
    	for (int i = 0; i < maxResultCount; ++i ) {
    		pstuResults[i] = new NET_SPLIT_CLOSE_WINDOW_RESULT();
    	}
    }
}
