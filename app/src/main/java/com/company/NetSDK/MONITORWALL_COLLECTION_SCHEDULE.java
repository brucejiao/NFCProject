package com.company.NetSDK;

import java.io.Serializable;

public class MONITORWALL_COLLECTION_SCHEDULE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public byte[] 			szName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];     // Ԥ������
	public SDK_TSECT[][]    stuSchedule = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM];   // ʱ���, ��һά��Ԫ�ر�ʾ����~�����ͽڼ���

	public MONITORWALL_COLLECTION_SCHEDULE() {
		for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; ++i){
			for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; ++j) {
				stuSchedule[i][j] = new SDK_TSECT();
			}
		}
	}
}
