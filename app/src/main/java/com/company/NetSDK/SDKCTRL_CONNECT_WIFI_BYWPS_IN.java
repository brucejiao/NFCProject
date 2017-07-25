package com.company.NetSDK;

import java.io.Serializable;

public class SDKCTRL_CONNECT_WIFI_BYWPS_IN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * WPS connect type,0:virtual buttons; 1:(device)pin; 2:(wifi hot point)pin
	 * \else
	 * WPS��������,0:���ⰴť��ʽ; 1:(�豸��)pin�뷽ʽ; 2:(wifi�ȵ��)pin�뷽ʽ
	 * \endif
	 */
	public int       	nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * when SSID,nType is 1 or 2,availability,biggest support 32-bit
	 * \else
	 * SSID��nTypeΪ1��2ʱ��Ч�����֧��32λ
	 * \endif
	 */
	public byte       	szSSID[] = new byte[FinalVar.SDK_MAX_SSID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * APPIN, when nType = 2,availability,PIN is 8 digits,from the wife(hot point)
	 * \else
	 * APPIN��, nTypeΪ2ʱ��Ч��PIN��Ϊ8λ���֣����pin���Ǵ�wifi�ȵ���õ���
	 * \endif
	 */
	public byte       	szApPin[] = new byte[FinalVar.SDK_MAX_APPIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * device pin,when nType = 1,availability.produced by the device when empty,not empty soecified by the user,need to increase in wifi
	 * \else
	 * �豸pin��,nTypeΪ1ʱ��Ч:Ϊ��ʱ���豸����;��Ϊ��ʱ����ʾ���û��趨�����֧��8λ���֣����pin��Ҫ��WIFI�ȵ������
	 * \endif
	 */
	public byte      	szWLanPin[] = new byte[FinalVar.SDK_MAX_APPIN_LEN];
}
