package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IPv6 config
 * \else
 * IPv6����
 * \endif
 */
public class SDKDEV_IPV6_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * link address: string length = 44;(every host has an exclusive link address, read only)
	 * \else
	 * ��·��ַ: �ַ���, ����Ϊ44;(��������ÿ̨����ӵ��Ψһ����·��ַ��ֻ��)
	 * \endif
	 */
	public byte               szLinkAddr[] = new byte[44];

	/**
	 * \if ENGLISH_LANG
	 * host IP
	 * \else
	 * ����IP
	 * \endif
	 */
	public byte               szHostIP[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * net prefix, 1-128
	 * \else
	 * ����ǰ׺����Χ��1-128���ɶ���д��
	 * \endif
	 */
	public int              dwPreFix;

	/**
	 * \if ENGLISH_LANG
	 * gateway
	 * \else
	 * Ĭ������
	 * \endif
	 */
	public byte               szGateWay[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * enable of auto get ip
	 * \else
	 * �Զ���ȡʹ��
	 * \endif
	 */
	public boolean               bAutoGet;

	/**
	 * \if ENGLISH_LANG
	 * primary DNS
	 * \else
	 * ��ѡDNS
	 * \endif
	 */
	public byte               szPrimaryDns[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * second DNS
	 * \else
	 * ��ѡDNS
	 * \endif
	 */
	public byte               szSecondDns[] = new byte[40];
}
