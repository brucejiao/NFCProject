package com.company.NetSDK;

public class NET_IN_EXCHANGEDATA {
	public int							nChannel;				// ���ں�
	public boolean						bFlag;					// TRUE Ϊ�������ݲ��ȴ��ظ���FALSE ֻ�ǲɼ�����
	public int							nCollectTime;			// ���ڲɼ�ʱ��(��λ������)
	public int							nSendDataLength;		// �������ݳ��ȣ�bFlag = TRUE ��Ч
	public char[]						pSendData;				// �����������ݣ�bFlag = TRUE ��Ч
}
