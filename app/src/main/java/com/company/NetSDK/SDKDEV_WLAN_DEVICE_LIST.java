package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Searched wireless device list
 * \else
 * �������������豸�б�
 * \endif
 */
public class SDKDEV_WLAN_DEVICE_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Searched wireless device amount
	 * \else
	 * �������������豸����
	 * \endif
	 */
	public byte                bWlanDevCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Select to use one wireless device
	 * \else
	 * ѡ��ʹ��ĳ�������豸
	 * \endif
	 */
	public SDKDEV_WLAN_DEVICE   lstWlanDev[] = new SDKDEV_WLAN_DEVICE[FinalVar.SDK_MAX_WLANDEVICE_NUM];
	
	public SDKDEV_WLAN_DEVICE_LIST() {
		for (int i = 0; i < FinalVar.SDK_MAX_WLANDEVICE_NUM; i++) {
			lstWlanDev[i] = new SDKDEV_WLAN_DEVICE();
		}
	}
}
