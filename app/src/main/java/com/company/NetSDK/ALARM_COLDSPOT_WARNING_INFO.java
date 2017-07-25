package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_COLDSPOT_WARNING_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                 nAction;                        // 0:��ʼ 1:ֹͣ
    public int                 nChannelID;                     // ��Ƶͨ����
    public SDK_POINT            stuCoordinate = new SDK_POINT();                   // ��������,����ֵ 0~8192
    public float               fColdSpotValue;                  // ����¶�ֵ
    public int                 nTemperatureUnit;               // �¶ȵ�λ(��ǰ���õ��¶ȵ�λ),�� CFG_TEMPERATURE_UNIT
}
