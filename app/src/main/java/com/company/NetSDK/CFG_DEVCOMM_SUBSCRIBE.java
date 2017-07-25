package com.company.NetSDK;

public class CFG_DEVCOMM_SUBSCRIBE {
	public int                             nSubscribeInfoNum;                  // �����������ø���
	public CFG_DEVCOMM_SUBSCRIBE_INFO      stuSubscribeInfo[] = new CFG_DEVCOMM_SUBSCRIBE_INFO[FinalVar.MAX_DEVCOMM_NUM]; // ���Ĵ����������ã���һ�����飬ÿ��Ԫ�ض�Ӧһ������
	
	public CFG_DEVCOMM_SUBSCRIBE() {
		for (int i = 0; i < FinalVar.MAX_DEVCOMM_NUM; i++) {
			stuSubscribeInfo[i] = new CFG_DEVCOMM_SUBSCRIBE_INFO();
		}
	}
}