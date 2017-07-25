package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_OPEN_WINDOWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 	nChannel;                       // ���ͨ���Ż��ں�������ͨ����, pszCompositeIDΪNULLʱ��Ч
    public String         		pszCompositeID;                 // �ں���id
    public int                	nWindowNum;                     // ��������
    public NET_RECT[]           pstuWindowRects;                // ������������
    public boolean              bDirectable;                    // ����ֱͨ����
	
    public NET_IN_SPLIT_OPEN_WINDOWS(int windowNumber) {
    	this.nWindowNum = windowNumber;
    	
    	pstuWindowRects = new NET_RECT[windowNumber];
    	
    	for(int i = 0; i < windowNumber; ++i ) {
    		pstuWindowRects[i] = new NET_RECT();
    	}
    }
}
