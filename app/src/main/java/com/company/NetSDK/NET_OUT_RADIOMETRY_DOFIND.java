package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_RADIOMETRY_DOFIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                         nFound;                             // ʵ�ʲ�ѯ���ĵ���
    public NET_RADIOMETRY_QUERY[]      stInfo = new NET_RADIOMETRY_QUERY[FinalVar.NET_RADIOMETRY_DOFIND_MAX];  // �¶�ͳ����Ϣ
	
    public NET_OUT_RADIOMETRY_DOFIND() {
    	for (int i = 0; i < stInfo.length; i++) {
			stInfo[i] = new NET_RADIOMETRY_QUERY();
		}
	}
}
