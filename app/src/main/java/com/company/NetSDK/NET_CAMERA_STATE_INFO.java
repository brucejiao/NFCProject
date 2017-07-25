package com.company.NetSDK;

import java.io.Serializable;

public class NET_CAMERA_STATE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                     nChannel;           // �����ͨ����, -1��ʾͨ������Ч
    public int                     emConnectionState;  // ����״̬, EM_CAMERA_STATE_TYPE
}
