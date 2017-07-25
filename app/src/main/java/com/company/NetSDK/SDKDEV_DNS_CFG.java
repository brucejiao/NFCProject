package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DNS server setup 
 * \else
 * DNS����������
 * \endif
 */
public class SDKDEV_DNS_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public byte                szPrimaryIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	public byte                szSecondaryIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
}
