package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_GET_PLAYER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                   	nChannel;                       // ���ͨ���Ż��ں�������ͨ����, pszCompositeIDΪNULLʱ��Ч
    public String           		pszCompositeID;                 // �ں���ID
    public int  					emType;                         // ����������  NET_SPLIT_PLAYER_TYPE
    public int                   	nWindow;                        // ���������ڵĴ��ں�
}
