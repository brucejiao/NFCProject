package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_FIREWARNING_INFO_DETAIL implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                 		nChannel;                     // ��Ƶͨ����
    public int				   		nWarningInfoCount;			  // ������Ϣ����
    public NET_FIREWARNING_INFO 	stuFireWarningInfo[] = new NET_FIREWARNING_INFO[FinalVar.MAX_FIREWARNING_INFO_NUM]; // ���屨����Ϣ

    public ALARM_FIREWARNING_INFO_DETAIL() {
    	for(int i = 0; i < FinalVar.MAX_FIREWARNING_INFO_NUM; ++i) {
        	stuFireWarningInfo[i] = new NET_FIREWARNING_INFO();
    	}
    }
}
