package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_SET_ZORDER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nChannel;                       // ���ͨ���Ż��ں�������ͨ����, pszCompositeIDΪNULLʱ��Ч
    public String         	   pszCompositeID;                 // �ں���ID
    public int                 nWindow;                        // ���ں�
    public int   			   emZOrder;                       // ������Z�� NET_WINDOW_ZORDER
}
