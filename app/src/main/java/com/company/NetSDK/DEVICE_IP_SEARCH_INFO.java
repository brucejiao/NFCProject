package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to SearchDevicesByIPs
 * \else
 * ��Ӧ SearchDevicesByIPs �ӿ�
 * \endif
 */
public class DEVICE_IP_SEARCH_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The IPs number for search
	 * \else
	 * ��ǰ������IP����
	 * \endif
	 */
	public int                 nIpNum;
	
	/**
	 * \if ENGLISH_LANG
	 * The IPs for search
	 * \else
	 * �����������IP��Ϣ
	 * \endif
	 */
	public byte                szIP[][] = new byte[FinalVar.SDK_MAX_SAERCH_IP_NUM][64];  
}
