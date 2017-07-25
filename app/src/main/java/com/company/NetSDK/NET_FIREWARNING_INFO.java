package com.company.NetSDK;

import java.io.Serializable;

public class NET_FIREWARNING_INFO implements Serializable {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public int						nPresetId; 						 // Ԥ�õ���	�Ӳ��¹�������CFG_RADIOMETRY_RULE_INFO��ѡ��
	public NET_RECT		    		stuBoundingBox = new NET_RECT(); // �Ż����ο�	
	public int              		nTemperatureUnit;				 // �¶ȵ�λ(��ǰ���õ��¶ȵ�λ),�� NET_TEMPERATURE_UNIT
	public float                	fTemperature;                    // ��ߵ��¶�ֵ	ͬ֡���Ͳ�ּ���ṩ
    public int		            	nDistance;                       // �Ż�����,��λ�� 0��ʾ��Ч
    public GPS_POINT            	stuGpsPoint = new GPS_POINT();   // �Ż�㾭γ��
}
