package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_CLOSE_WINDOWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nChannel;                       // ���ͨ���Ż��ں�������ͨ����, pszCompositeIDΪNULLʱ��Ч
    public String         	   pszCompositeID;                 // �ں���ID
    public int[]               pnWindows;                      // ���ں�����ָ��
    public int                 nWindowCount;                   // ��������
    
    public NET_IN_SPLIT_CLOSE_WINDOWS( int windowCount) {
    	this.nWindowCount = windowCount;
    	pnWindows = new int[windowCount];
    }
}
