package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ���������⣬������ʹ��
 * \else
 * ���������⣬������ʹ��
 * \endif
 */
public class NET_BATTERY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public 	int        nPercent;                       // ��������ٷֱ�
	public	boolean    bCharging;                      // �Ƿ��������
	//�����λ״̬ EM_BATTERY_EXIST_STATE
	public  int        emExistState ;
	//��ص���״̬ EM_BATTERY_STATE
	public 	int 		emState;
}
