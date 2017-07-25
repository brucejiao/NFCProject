package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_GET_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                     nChannel;               // ���ͨ����, pszCompsiteIDΪNULLʱ��Ч
    public String             	   pszCompositeID;         // ƴ����ID
    public int                     nWindow;                // ���ں�, -1��ʾ���д���
}
