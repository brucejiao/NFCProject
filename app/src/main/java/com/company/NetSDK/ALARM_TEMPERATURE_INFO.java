package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * temperature alarm info
 * \else
 * �¶ȹ��߱���
 * \endif
 */
public class ALARM_TEMPERATURE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * sensor name
	 * \else
	 * �¶ȴ���������
	 * \endif
	 */
	public byte               szSensorName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start	
	 * \else
	 * 0:��ʼ 1:ֹͣ
	 * \endif
	 */
	public int                nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * current temperature, unit:degree centigrade
	 * \else
	 * ��ǰ�¶�ֵ, ��λ���϶�
	 * \endif
	 */
	public float              fTemperature;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time
	 * \else
	 * �¼�����ʱ��
	 * \endif
	 */
	public NET_TIME           stTime = new NET_TIME();
}
