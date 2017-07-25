package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ACC power off configuration
 * \else
 * �����������
 * \endif
 */
public class SDKDEV_ABOUT_VEHICLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * bAutoBootEnable
	 * \else
	 * �Զ�����ʹ��
	 * \endif
	 */
	public boolean 				bAutoBootEnable;

	/**
	 * \if ENGLISH_LANG
	 * dwAutoBootTime
	 * \else
	 * ÿ���Զ�����ʱ���, ��λ��,��0����.[0,82800]
	 * \endif
	 */
	public int					dwAutoBootTime;

	/**
	 * \if ENGLISH_LANG
	 * bAutoShutDownEnable
	 * \else
	 * �Զ��ػ�ʹ��
	 * \endif
	 */
	public boolean				bAutoShutDownEnable;

	/**
	 * \if ENGLISH_LANG
	 * dwAutoShutDownTime
	 * \else
	 * ÿ���Զ��ػ�ʱ���, ��λ��,��0����.[0,82800]
	 * \endif
	 */
	public int					dwAutoShutDownTime;

	/**
	 * \if ENGLISH_LANG
	 * dwShutDownDelayTime
	 * \else
	 * ��ʱ�ػ�ʱ��,��λ��.
	 * \endif
	 */
	public int					dwShutDownDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * bEventNoDisk
	 * \else
	 * 1,(Ignore:����); 2,(Reboot:����ϵͳ)
	 * \endif
	 */
	public int					bEventNoDisk;

	/**
	 * \if ENGLISH_LANG
	 * bWifiEnable
	 * \else
	 * �Ƿ�֧�ֳ�������ģ��.
	 * \endif
	 */
	public boolean				bWifiEnable;

	/**
	 * \if ENGLISH_LANG
	 * bUpperSpeedEnable
	 * \else
	 * �Ƿ�ʹ�ó����ж�
	 * \endif
	 */
	public boolean				bUpperSpeedEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * bLowerSpeedEnable
	 * \else
	 * �Ƿ�ʹ�õ����ж�
	 * \endif
	 */
	public boolean				bLowerSpeedEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * dwUpperSpeedValue
	 * \else
	 * ����ֵ������(1,1000).����/Сʱ
	 * \endif
	 */
	public int					dwUpperSpeedValue;
	
	/**
	 * \if ENGLISH_LANG
	 * dwLowerSpeedValue
	 * \else
	 * ����ֵ������(1,1000).����/Сʱ
	 * \endif
	 */
	public int 					dwLowerSpeedValue;

	/**
	 * \if ENGLISH_LANG
	 * dwUpperSpeedDelayTime
	 * \else
	 * ���ó��ٳ���ֵ
	 * \endif
	 */
	public int					dwUpperSpeedDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * dwLowerSpeedDelayTime
	 * \else
	 * ���õ��ٳ���ֵ
	 * \endif
	 */
	public int					dwLowerSpeedDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * dwAlarmMaskEnable
	 * \else
	 * ��ѯ/���õ��ӱ�����Ϣʹ��,0:�ر�,1:��, ÿһλ�ӵ͵��߱�ʾ�����ⲿ����ͨ��0-Nʹ��
	 * \endif
	 */	
	public int					dwAlarmMaskEnable;

	/**
	 * \if ENGLISH_LANG
	 * bSpeedOverAlarmRecordEnable
	 * \else
	 * ���ٱ�������¼��ʹ��
	 * \endif
	 */	
	public boolean				bSpeedOverAlarmRecordEnable;

	/**
	 * \if ENGLISH_LANG
	 * bSpeedLowAlarmRecordEnable
	 * \else
	 * ���ٱ�������¼��ʹ�� 
	 * \endif
	 */	
	public boolean				bSpeedLowAlarmRecordEnable;
}
