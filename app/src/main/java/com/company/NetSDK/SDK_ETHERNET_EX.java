package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ethernet extended Configuration
 * \else
 * ��̫����չ����
 * \endif
 */
public class SDK_ETHERNET_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DVR IP  address
	 * \else
	 * DVR IP ��ַ
	 * \endif
	 */
	public byte                sDevIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * DVR IP subnet mask
	 * \else
	 * DVR IP ��ַ����
	 * \endif
	 */
	public byte                sDevIPMask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Gateway address
	 * 1:10Mbps full-duplex
	 * 2:10Mbps auto-duplex
	 * 3:10Mbps half-duplex
	 * 4:100Mbps full-duplex
	 * 5:100Mbps auto-duplex
	 * 6:100Mbps half-duplex
	 * 7:auto
	 * \else
	 * ���ص�ַ
	 * 1��10Mbps ȫ˫��
     * 2��10Mbps ����Ӧ
     * 3��10Mbps ��˫��
     * 4��100Mbps ȫ˫��
     * 5��100Mbps ����Ӧ
     * 6��100Mbps ��˫��
     * 7������Ӧ
	 * \endif
	 */
	public byte                sGatewayIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte                dwNetInterface;

	/**
	 * \if ENGLISH_LANG
	 * 0:cable,1:wireless
	 * \else
	 * 0�����ߣ�1������
	 * \endif
	 */
	public byte                bTranMedia;

	/**
	 * \if ENGLISH_LANG
	 * Use bit to represent, The first bit:1:valid 0:invalid;The second bit:0:Disable DHCP 1:Enable DHCP;The third bit:0:Do not support DHCP 1:Support DHCP
	 * \else
	 * ��λ��ʾ����һλ��1����Ч 0����Ч���ڶ�λ��0��DHCP�ر� 1��DHCPʹ�ܣ�����λ��0����֧��DHCP 1��֧��DHCP
	 * \endif
	 */
	public byte                bValid;

	/**
	 * \if ENGLISH_LANG
	 * To be the default network card or not.  1: default 0:non-default
	 * \else
	 * �Ƿ���ΪĬ�ϵ����� 1��Ĭ�� 0����Ĭ��
	 * \endif
	 */
	public byte                bDefaultEth;

	/**
	 * \if ENGLISH_LANG
	 * MAC address , read-only.
	 * \else
	 * MAC��ַ��ֻ��
	 * \endif
	 */
	public byte                byMACAddr[] = new byte[FinalVar.SDK_MACADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * mode, 1:balance, 2:multi, 3:fault-toerant
	 * \else
	 * ��������ģʽ, 0:��ģʽ, 1:���ؾ���ģʽ, 2:��ַģʽ, 3:�ݴ�ģʽ
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * Card name, read only
	 * \else
	 * ��������ֻ��
	 * \endif
	 */
	public byte                szEthernetName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
}
