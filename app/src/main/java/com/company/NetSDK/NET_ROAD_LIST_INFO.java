package com.company.NetSDK;

import java.io.Serializable;

public class NET_ROAD_LIST_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                     szCity[] = new byte[32];             // ���������ĳ�����Ϣ
	public byte                     szRoadList[][] = new byte[2048][256];  // ��·������Ϣ
	public int                      nRoadNum;               // ��·��Ϣ����, ָʾszRoadList�ĵ�1ά
}
