package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ethernet Settings
 * \else
 * ��̫������
 * \endif
 */
public class SDK_ETHERNET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DVR IP Address
	 * \else
	 * DVR IP ��ַ
	 * \endif
	 */
	public byte                sDevIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * IP Mask
	 * \else
	 * ���ص�ַ
	 * \endif
	 */
	public byte                sDevIPMask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * 10M/100M self-adaption,Index:
	 * <table>
	 * <tr><td>1</td><td>10Mbps full duplex</td></tr>
	 * <tr><td>2</td><td>10Mbps self-adaption</td></tr>
	 * <tr><td>3</td><td>10Mbps half-duplex</td></tr>
	 * <tr><td>4</td><td>100Mbps full duplex</td></tr>
	 * <tr><td>5</td><td>100Mbps self-adaption</td></tr>
	 * <tr><td>6</td><td>100Mbps half-duplex</td></tr>
	 * <tr><td>7</td><td>Self-adaption</td></tr>
	 * </table>
	 * \else
	 * 10M/100M ����Ӧ,����:
	 * <table>
	 * <tr><td>1</td><td>10Mbps ȫ˫��</td></tr>
	 * <tr><td>2</td><td>10Mbps ����Ӧ</td></tr>
	 * <tr><td>3</td><td>10Mbps ��˫��</td></tr>
	 * <tr><td>4</td><td>100Mbps ȫ˫��</td></tr>
	 * <tr><td>5</td><td>100Mbps ����Ӧ</td></tr>
	 * <tr><td>6</td><td>100Mbps ��˫��</td></tr>
	 * <tr><td>7</td><td>����Ӧ</td></tr>
	 * </table>
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
	 * 0��Wired,1��Wireless
	 * \else
	 * 0�����ߣ�1������
	 * \endif
	 */
	public byte                bTranMedia;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit 1, 1��Valid 0��Invalid��Bit 2��0��DHCP disable 1��DHCP enable��Bit 3��0��Not support DHCP 1��Support DHCP
	 * \else
	 * ��λ��ʾ����һλ��1����Ч 0����Ч���ڶ�λ��0��DHCP�ر� 1��DHCPʹ�ܣ�����λ��0����֧��DHCP 1��֧��DHCP
	 * \endif
	 */
	public byte                bValid;
	
	/**
	 * \if ENGLISH_LANG
	 * Default NIC, 1��Default 0��Non default
	 * \else
	 * �Ƿ���ΪĬ�ϵ�����, 1��Ĭ�� 0����Ĭ��
	 * \endif
	 */
	public byte                bDefaultEth;
	
	/**
	 * \if ENGLISH_LANG
	 * MAC address,read only
	 * \else
	 * MAC��ַ��ֻ��
	 * \endif
	 */
	public byte                byMACAddr[] = new byte[FinalVar.SDK_MACADDR_LEN];
}
