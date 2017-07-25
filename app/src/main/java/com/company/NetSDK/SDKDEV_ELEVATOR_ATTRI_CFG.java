package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Lift running parameter configuration
 * \else
 * �������в�������
 * \endif
 */
public class SDKDEV_ELEVATOR_ATTRI_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Max floor. Min is 2.
	 * \else
	 * ���¥�� ��С2
	 * \endif
	 */
	public int    nMAXFloorNum;

	/**
	 * \if ENGLISH_LANG
	 * Stay verification time ranges from 5-60. It regards as stop current floor if keep this time period.
	 * \else
	 * ͣ���ж�ʱ��,5-60�����ִ�ʱ�䳤����Ϊ�ǵ���ͣ����¥�㡣
	 * \endif
	 */
	public int    nFloorDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * The max time for the lift to go up/down a floor. It regars the lift is malfunction if the time is out of the threshold. The lift stopsa between two floors.
	 * \else
	 * �������л����о���һ������ʱ�䣬���������ʱ�䣬����Ϊ���ݹ��ϣ�����ֹͣ������֮�䡣
	 * \endif
	 */
	public int    nIntervalTime;
}
