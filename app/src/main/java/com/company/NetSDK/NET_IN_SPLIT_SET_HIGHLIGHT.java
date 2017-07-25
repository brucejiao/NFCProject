package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_SET_HIGHLIGHT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int             nChannel;                   // ��Ƶ���ͨ��
    public int             nWindow;                    // ���ں�
    public boolean         bHighLightEn;               // �߿����ʹ��,TRUE-��ʾ����
    public SDK_COLOR_RGBA  stuColor = new SDK_COLOR_RGBA();                   // �߿���ɫ 
}
