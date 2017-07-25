package com.company.NetSDK;

import java.io.Serializable;

public class NET_MONITORWALL_STATUS_INFO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public int         	 nInterval;                      // ��Ѳʱ����
	public int        	 nCollectionNum;                 // Ԥ����Ѳ��
	public byte[][]      szCollections = new byte[FinalVar.SDK_MAX_COLLECTION_NUM][FinalVar.SDK_DEVICE_NAME_LEN];         // Ԥ����Ѳ������
	public byte[]        szName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];     // ��ǰ��ʾ��Ԥ������
}
