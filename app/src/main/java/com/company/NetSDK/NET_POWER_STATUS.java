package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ���������⣬������ʹ��
 * \else
 * ���������⣬������ʹ��
 * \endif
 */
public class NET_POWER_STATUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 public boolean            bEnable;                            // ��ѯ�Ƿ�ɹ�
	 public int                nCount;                             // ��Դ����
	 public NET_POWER_INFO     stuPowers[] = new NET_POWER_INFO[FinalVar.SDK_MAX_POWER_NUM];        // ��Դ״̬
	 public int                nBatteryNum;                        // �������
	 public NET_BATTERY_INFO   stuBatteries[] = new NET_BATTERY_INFO[FinalVar.SDK_MAX_BATTERY_NUM];   // ���״̬
	 
	 public NET_POWER_STATUS(){
		 for(int i=0 ; i<FinalVar.SDK_MAX_POWER_NUM ; i++){
			 stuPowers[i] = new NET_POWER_INFO();
		 }
		 
		 for( int i =0 ; i<FinalVar.SDK_MAX_BATTERY_NUM ; i++){
			 stuBatteries[i] = new NET_BATTERY_INFO();
		 }
	 }
}
