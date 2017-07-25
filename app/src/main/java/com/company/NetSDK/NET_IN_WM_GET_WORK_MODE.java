package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_WM_GET_WORK_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                   nChannel;                       // ���ͨ���Ż��ں�������ͨ����, pszCompositeIDΪNULLʱ��Ч
    public String           	 pszCompositeID;                 // �ں���ID
    public int                   nWindow;                        // ���ں�

}
