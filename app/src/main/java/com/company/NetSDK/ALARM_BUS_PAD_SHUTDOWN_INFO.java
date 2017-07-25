package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_BUS_PAD_SHUTDOWN_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                nDelayTime;                      // �ػ���ʱʱ�䣬��λ����
	public boolean               bConfirm;                        // �Ƿ���Ҫȷ��
	public NET_TIME_EX        stuUtcTime = new NET_TIME_EX();                      // �¼�������ʱ��
    public int              dwUtc;                           // �¼�������ʱ��, ����ȷ��
}
