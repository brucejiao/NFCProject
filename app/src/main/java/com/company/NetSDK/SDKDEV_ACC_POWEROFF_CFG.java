package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ACC power off configuration
 * \else
 * ACC���߱����¼�����
 * \endif
 */
public class SDKDEV_ACC_POWEROFF_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ACC power off configuration enable
	 * \else
	 * ACC���߱���ʹ��
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * ACC power off delay time(m)
	 * \else
	 * ACC���߱�����ʱʱ��,��λ����
	 * \endif
	 */
	public int                 nDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * handle method
	 * \else
	 * ����ʽ
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX();
}
