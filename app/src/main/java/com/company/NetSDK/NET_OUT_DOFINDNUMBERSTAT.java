package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_DOFINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                 nCount;                          // ��ѯ��������ͳ����Ϣ����
	public SDK_NUMBERSTAT      pstuNumberStat[];                 // ��������ͳ����Ϣ����
    
    public NET_OUT_DOFINDNUMBERSTAT(int nMaxStat) {
    	pstuNumberStat = new SDK_NUMBERSTAT[nMaxStat];
    	for (int i = 0; i < nMaxStat; i++) {
    		pstuNumberStat[i] = new SDK_NUMBERSTAT();
    	}
    }
}
