package com.company.NetSDK;

import java.io.Serializable;

public class NET_RADIOMETRYINFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int        		   nMeterType;                         // ���ز�������,��NET_RADIOMETRY_METERTYPE
    public int                 nTemperUnit;                        // �¶ȵ�λ(��ǰ���õ��¶ȵ�λ),�� NET_TEMPERATURE_UNIT
    public float               fTemperAver;                        // ����¶Ȼ���ƽ���¶�   ���ʱ�� ֻ���ش��ֶ�
    public float               fTemperMax;                         // ����¶� 
    public float               fTemperMin;                         // ����¶� 
    public float               fTemperMid;                         // �м��¶�ֵ    
    public float               fTemperStd;                         // ��׼����ֵ

}
