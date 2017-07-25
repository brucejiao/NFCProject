package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_MONITORWALL_GET_COLL_SCHD implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean                bAllCollections;                // TRUE-��ѯ����Ԥ��, ����Ҫָ��Ԥ������. FALSE-��ѯ��������Ӧ��Ԥ��
	public int             		  nCollectionNum;                 // Ԥ����, bAllCollectionsΪFALSEʱ��Ч
	public byte[][]               szCollections = new byte[FinalVar.SDK_MAX_COLLECTION_NUM][FinalVar.SDK_DEVICE_NAME_LEN];   // Ԥ������
	public int                 	  nMonitorWallID;                 // ����ǽID
}
