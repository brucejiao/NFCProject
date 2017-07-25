package com.company.NetSDK;

import java.io.Serializable;

public class SDK_NUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int      nChannelID;                           //ͳ��ͨ����
	public byte     szRuleName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];         //��������
	public NET_TIME stuStartTime = new NET_TIME();                         //��ʼʱ��
	public NET_TIME stuEndTime = new NET_TIME();                           //����ʱ��
	public int      nEnteredSubTotal;                     //��������С��
	public int      nExitedSubtotal;                      //��ȥ����С��
	public int      nAvgInside;                           //ƽ����������(��ȥ��ֵ)
	public int      nMaxInside;                           //���������
	public int      nEnteredWithHelmet;                   //����ȫñ��������С��
	public int      nEnteredWithoutHelmet;                //������ȫñ��������С��
	public int      nExitedWithHelmet;                    //����ȫñ��ȥ����С��
	public int      nExitedWithoutHelmet;                 //������ȫñ��ȥ����С��
}
