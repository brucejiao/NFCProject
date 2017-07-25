package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_DOFINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                 nBeginNumber;               // [0, totalCount-1], ��ѯ��ʼ���,��ʾ��beginNumber����¼��ʼ,ȡcount����¼����; 
	public int                 nCount;                     // ÿ�β�ѯ������ͳ������
	public int                 nWaittime;                  // �ȴ��������ݵĳ�ʱʱ��            
}
