package com.company.NetSDK;

import java.io.Serializable;

public class NET_EVENT_INFO_TO_CONFIRM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int               dwEventType;            // �¼�����, ��ӦCLIENT_AttachBusState�ӿڵ��¼�����
	public NET_TIME            stuTime = new NET_TIME();                // �¼�ʱ��, UTC��
    public int                lTime;                  // �¼�ʱ��, UTC��, ��λ��
}
