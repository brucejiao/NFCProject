package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_GET_CAMERA_STATEINFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public boolean                bGetAllFlag;                                // �Ƿ��ѯ���������״̬,���ó�ԱΪ TRUE,�� nChannels ��Ա��������
    public int                 nValidNum;                                  // �ó�Ա,bGetAllFlag Ϊ FALSEʱ��Ч,��ʾ nChannels ��Ա��Ч����
    public int                 nChannels[] = new int[FinalVar.SDK_MAX_CAMERA_CHANNEL_NUM];       // �ó�Ա,bGetAllFlag Ϊ FALSEʱ��Ч,����Ҫ��ѯ��ͨ������������
}
