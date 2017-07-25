package com.company.NetSDK;

import java.io.Serializable;

public class NET_HDD_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int               nState;                   // Ӳ��״̬��0-������1-����   
	public double            dbTotalSize;              // Ӳ�����������ֽ�Ϊ��λ
	public NET_PARTITION_STATE stuPartitions[] = new NET_PARTITION_STATE[FinalVar.SDK_MAX_STORAGE_PARTITION_NUM]; // ����״̬
    public int               nPartitionNum;              // ������
    
    public NET_HDD_STATE() {
    	for (int i = 0; i < FinalVar.SDK_MAX_STORAGE_PARTITION_NUM; i++) {
    		stuPartitions[i] = new NET_PARTITION_STATE();
    	}
    }
}
