package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The Device type of Wireless
 * \else
 * �����豸����
 * \endif
 */
public class NET_WIRELESS_DEVICE_TYPE implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown type
	 * \else
	 * δ֪����
	 * \endif
	 */
	public static final int 	NET_WIRELESS_DEVICE_TYPE_UNKNOWN = 0;               
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless Keyboard
	 * \else
	 * ���߼���
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_KEYBOARD = 1;          
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless defence area
	 * \else
	 * ���߷��� 
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_DEFENCE = 2;           
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless remote control
	 * \else
	 * ����ң�� 
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_REMOTECONTROL = 3;     
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless door sensor
	 * \else
	 * �����Ŵ� 
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_MAGNETOMER = 4;        

	/**
	 * \if ENGLISH_LANG
	 * Wireless alarm bell
	 * \else
	 * ���߾���
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_ALARMBELL = 5;  
}
