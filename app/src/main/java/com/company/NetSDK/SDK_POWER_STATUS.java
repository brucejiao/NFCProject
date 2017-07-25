package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power status
 * \else
 * ��Դ״̬
 * \endif
 */
public class SDK_POWER_STATUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Search succeeded or not
	 * \else
	 * ��ѯ�Ƿ�ɹ�
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Power amount
	 * \else
	 * ��Դ����
	 * \endif
	 */
	public int                 nCount;

	/**
	 * \if ENGLISH_LANG
	 * Power status
	 * \else
	 * ��Դ״̬
	 * \endif
	 */
	public SDK_POWER_INFO       stuPowers[] = new SDK_POWER_INFO[FinalVar.SDK_MAX_POWER_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Battery Number
	 * \else
	 * �������
	 * \endif
	 */
	public int                 nBatteryNum;

	/**
	 * \if ENGLISH_LANG
	 * Battery Status
	 * \else
	 * ���״̬
	 * \endif
	 */
	public SDK_BATTERY_INFO     stuBatteries[] = new SDK_BATTERY_INFO[FinalVar.SDK_MAX_BATTERY_NUM];
	 
	 public SDK_POWER_STATUS(){
		 for(int i=0 ; i<FinalVar.SDK_MAX_POWER_NUM ; i++){
			 stuPowers[i] = new SDK_POWER_INFO();
		 }
		 
		 for( int i =0 ; i<FinalVar.SDK_MAX_BATTERY_NUM ; i++){
			 stuBatteries[i] = new SDK_BATTERY_INFO();
		 }
	 }
}
