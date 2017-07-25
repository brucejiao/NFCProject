package com.company.NetSDK;

import java.io.Serializable;

public class CFG_REGISTER_SERVER_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public boolean             bEnable;                            						// ����ע��ʹ��
	public byte                szDeviceID[] = new byte[FinalVar.MAX_ADDRESS_LEN];       // �豸ID
	public int                 nServersNum;                        						// ����������
	public CFG_SERVER_INFO     stuServers[] = new CFG_SERVER_INFO[FinalVar.MAX_SERVER_NUM];  // ����������       						// ����������
	
	public CFG_REGISTER_SERVER_INFO() {
		for(int i = 0; i < FinalVar.MAX_SERVER_NUM; ++i) {
			stuServers[i] = new CFG_SERVER_INFO();
		}
	}
}
