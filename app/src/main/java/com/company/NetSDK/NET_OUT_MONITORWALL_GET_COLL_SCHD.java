package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_MONITORWALL_GET_COLL_SCHD implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nCollectionNum;                 // Ԥ����
    public MONITORWALL_COLLECTION_SCHEDULE[] stuCollShedule = new MONITORWALL_COLLECTION_SCHEDULE[FinalVar.SDK_MAX_COLLECTION_NUM];  // Ԥ��ʱ���

    public NET_OUT_MONITORWALL_GET_COLL_SCHD() {
    	for(int i = 0; i < FinalVar.SDK_MAX_COLLECTION_NUM; ++i) {
    		stuCollShedule[i] = new MONITORWALL_COLLECTION_SCHEDULE();
    	}
    }
}
