package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_FACE_OVERHEATING_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                     nRelativeId;                                        // ����ͼƬID,�� NET_FACE_INFO->nRelativeID��ͬ
    public int                     nTemperatureUnit;                                   // �¶ȵ�λ(��ǰ���õ��¶ȵ�λ),�� NET_TEMPERATURE_UNIT
    public float                   fTemperature;                                       // �����¶�ֵ

}
