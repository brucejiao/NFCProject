package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_FINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                 nChannelID;                 // Ҫ���в�ѯ��ͨ����
	public NET_TIME            stStartTime = new NET_TIME();                // ��ʼʱ�� ��ʱ��ȷ��Сʱ
	public NET_TIME            stEndTime = new NET_TIME();                  // ����ʱ�� ��ʱ��ȷ��Сʱ
	public int                 nGranularityType;           // ��ѯ����0:����,1:Сʱ,2:��,3:��,4:��,5:��,6:��
	public int                 nWaittime;                  // �ȴ��������ݵĳ�ʱʱ��
}
