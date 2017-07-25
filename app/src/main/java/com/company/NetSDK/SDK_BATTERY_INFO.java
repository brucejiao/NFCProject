package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Battery Information, INetSDK.QueryDevState, SDK_DEVSTATE_POWER_STATE
 * \else
 * �����Ϣ, INetSDK.QueryDevState�ӿڵ� SDK_DEVSTATE_POWER_STATE �������
 * \endif
 */
public class SDK_BATTERY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Battery Capacity Percentage
	 * \else
	 * ��������ٷֱ�
	 * \endif
	 */
	public int                 nPercent;

	/**
	 * \if ENGLISH_LANG
	 * Whether real charging
	 * \else
	 * �Ƿ��������
	 * \endif
	 */
	public boolean                bCharging;

	/**
	 * \if ENGLISH_LANG
	 * battery in-place status
	 * \else
	 * �����λ״̬
	 * \endif
	 */
	public int emExistState;

	/**
	 * \if ENGLISH_LANG
	 * battery power status
	 * \else
	 * ��ص���״̬
	 * \endif
	 */
	public int	emState;
}
