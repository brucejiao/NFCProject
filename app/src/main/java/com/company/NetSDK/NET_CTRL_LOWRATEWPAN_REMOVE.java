package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remove specified wireless device
 * \else
 * ɾ��ָ�������豸
 * \endif
 */
public class NET_CTRL_LOWRATEWPAN_REMOVE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static final int SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN = 32;
	
	/**
	 * \if ENGLISH_LANG
	 * wireless device Id
	 * \else
	 * �����豸ID
	 * \endif
	 */
    public long                  nWirelessId;
    
    /**
	 * \if ENGLISH_LANG
	 * wireless device Id
	 * \else
	 * �����豸ID
	 * \endif
	 */
    public byte[]                szSerialNumber = new byte[SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN];                                                                                
}
