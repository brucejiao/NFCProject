package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NTP setup 
 * \else
 * NTP����
 * \endif
 */
public class SDKDEV_NTP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable or not
	 * \else
	 * �Ƿ�����
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * NTP  server default port is 123
	 * \else
	 * NTP������Ĭ�϶˿�Ϊ123
	 * \endif
	 */
	public int                 nHostPort;

	/**
	 * \if ENGLISH_LANG
	 * Host IP
	 * \else
	 * ����IP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * Domain name
	 * \else
	 * ����
	 * \endif
	 */
	public byte                szDomainName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Read only ,0:IP,1:domain name ,2:IP and domain name
	 * \else
	 * �������ã�0����ʾIP��1����ʾ������2����ʾIP������
	 * \endif
	 */
	public int                 nType;

	/**
	 * \if ENGLISH_LANG
	 * Update time(minute)
	 * \else
	 * ����ʱ��(����)
	 * \endif
	 */
	public int                 nUpdateInterval;

	/**
	 * \if ENGLISH_LANG
	 * Please refer to SDK_TIME_ZONE_TYPE
	 * \else
	 * ��SDK_TIME_ZONE_TYPE
	 * \endif
	 */
	public int                 nTimeZone;
}
