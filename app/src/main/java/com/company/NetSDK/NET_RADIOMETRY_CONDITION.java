package com.company.NetSDK;

import java.io.Serializable;

public class NET_RADIOMETRY_CONDITION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nPresetId;                          // Ԥ�õ���    
    public int                 nRuleId;                            // ������ 
    public int                 nMeterType;                         // ���������,�� NET_RADIOMETRY_METERTYPE
    public byte[]              szName =  new byte[64];                         // �����������,�Ӳ������ù���������ѡȡ
    public int                 nChannel;                           // ͨ����

}
