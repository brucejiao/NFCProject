package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_BETWEENRULE_DIFFTEMPER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                             nAction;                        // 0:��ʼ 1:ֹͣ
    public int                             nOsdId;                         // �²�OSD�����е�OSD���
    public int                             nChannelID;                     // ��Ƶͨ����
    public int                             emAlarmContion;                 // �������� 0:С�� 1:���� 2:����, NET_RADIOMETRY_ALARMCONTION
    public int                             nRuleId1;                       // ���¹���1,�ο�����CFG_RADIOMETRY_RULE_INFO
    public int                             nRuleId2;                       // ���¹���2,�ο�����CFG_RADIOMETRY_RULE_INFO
    public float                           fDiffValue;                     // ������²�ֵ
    public int                             nTemperatureUnit;               // �¶ȵ�λ(��ǰ���õ��¶ȵ�λ),�� CFG_TEMPERATURE_UNIT
    public int                             nPresetID;                      // Ԥ�õ�
}
