package com.company.NetSDK;

import java.io.Serializable;

public class NET_PARTITION_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int               nStatus;                  // ����״̬��0-������1-���� 
	public double            dbTotalSize;              // �������������ֽ�Ϊ��λ
	public double            dbRemainSize;             // ʣ���������ֽ�Ϊ��λ
}
