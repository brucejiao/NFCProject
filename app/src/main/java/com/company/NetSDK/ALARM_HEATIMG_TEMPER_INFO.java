package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_HEATIMG_TEMPER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public byte                szName[] = new byte[64];                         // �¶��쳣������  �Ӳ��¹�����������ѡ��
    public int                 nAlarmId;                           // ��������    
    public int                 nResult;                            // �������ֵ fTemperatureValue ������,��ö�� NET_RADIOMETRY_RESULT
    public int                 nAlarmContion;                      // ��������,��ö�� NET_RADIOMETRY_ALARMCONTION
    public float               fTemperatureValue;                  // �����¶�ֵ
    public int                 nTemperatureUnit;                   // �¶ȵ�λ(��ǰ���õ��¶ȵ�λ),�� CFG_TEMPERATURE_UNIT
    public SDK_POINT            stCoordinate = new SDK_POINT();                       // �����������   ���������ϵ,ȡֵ��Ϊ0~8191
    public int                 nPresetID;                          // Ԥ�õ�
    public int                 nChannel;                           // ͨ����
    public int                 nAction;                            // 0:��ʼ 1:ֹͣ -1:������
}
