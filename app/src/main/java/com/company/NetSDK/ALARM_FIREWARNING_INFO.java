package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_FIREWARNING_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nState;                             // 0 - ��ʼ,1 - ����,-1:������
    public int                 nChannel;                           // ��Ӧ��Ƶͨ����
}
