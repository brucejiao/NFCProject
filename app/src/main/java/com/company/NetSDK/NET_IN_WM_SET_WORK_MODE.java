package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_WM_SET_WORK_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                   nChannel;                       // ���ͨ���Ż��ں�������ͨ����, pszCompositeIDΪNULLʱ��Ч
    public String           	 pszCompositeID;                 // �ں���ID
    public int                   nWindow;                        // ���ں�
    public int                   emMode;                         // ���ڹ���ģʽ NET_WM_WORK_MODE
}
