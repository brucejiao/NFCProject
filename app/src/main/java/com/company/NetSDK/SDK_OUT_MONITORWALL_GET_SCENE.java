package com.company.NetSDK;

import java.io.Serializable;
public class SDK_OUT_MONITORWALL_GET_SCENE implements Serializable {
	private static final long serialVersionUID = 1L;
	
    public byte[]           szName = new byte[FinalVar.SDK_DEV_NAME_LEN];// ��ǰԤ������, ����Ϊ��
    public SDK_MONITORWALL_SCENE    stuScene;                       	 // ����ǽ����
}
