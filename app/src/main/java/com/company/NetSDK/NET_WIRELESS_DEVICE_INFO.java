package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless devices info
 * \else
 * �����豸״̬
 * \endif
 */
public class NET_WIRELESS_DEVICE_INFO implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	/**
	 * \if ENGLISH_LANG
	 * Device serial NO
	 * \else
	 * �����豸���к�
	 * \endif
	 */
	public byte szSerialNumber[] = new byte[FinalVar.NET_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Online state of device: 0-unknown, 1-outline, 2-online 
	 * \else
	 * �����豸����״̬
	 * \endif
	 * @see EM_WIRELESS_DEVICE_ONLINE_STATE
	 */
	public int emOnlineState;          
	
	/**
	 * \if ENGLISH_LANG
	 * Current power state of device: 0-unknown power, 1-normal power, 2-low power
	 * \else
	 * �����豸����״̬
	 * \endif
	 * @see EM_WIRELESS_DEVICE_POWER_STATE
	 */
	public int emPowerState;           
}
