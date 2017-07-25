package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SYSLOG remote server ability
 * \else
 * syslog��Զ�̷���������
 * \endif
 */
public class SDKDEV_SYSLOG_REMOTE_SERVER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Server IP address
	 * \else
	 * ��������ַ
	 * \endif
	 */
	public byte    szServerIp[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Server port
	 * \else
	 * �������˿�
	 * \endif
	 */
	public int     nServerPort;

	/**
	 * \if ENGLISH_LANG
	 * Server Enable
	 * \else
	 * ������ʹ��
	 * \endif
	 */
	public byte    bEnable;
}
