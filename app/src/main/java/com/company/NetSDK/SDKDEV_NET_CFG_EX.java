package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network extended configuration structure
 * \else
 * ��չ�������ýṹ��
 * \endif
 */
public class SDKDEV_NET_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device host name
	 * \else
	 * �豸������
	 * \endif
	 */
	public byte                sDevName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * TCP max connection amount
	 * \else
	 * TCP���������
	 * \endif
	 */
	public short                wTcpMaxConnectNum;

	/**
	 * \if ENGLISH_LANG
	 * TCP listening port
	 * \else
	 * TCP֡���˿�
	 * \endif
	 */
	public short                wTcpPort;

	/**
	 * \if ENGLISH_LANG
	 * UDP listening port
	 * \else
	 * UDP�����˿�
	 * \endif
	 */
	public short                wUdpPort;

	/**
	 * \if ENGLISH_LANG
	 * HTTP port number
	 * \else
	 * HTTP�˿ں�
	 * \endif
	 */
	public short                wHttpPort;

	/**
	 * \if ENGLISH_LANG
	 * HTTPS port number
	 * \else
	 * HTTPS�˿ں�
	 * \endif
	 */
	public short                wHttpsPort;

	/**
	 * \if ENGLISH_LANG
	 * SSL port number
	 * \else
	 * SSL�˿ں�
	 * \endif
	 */
	public short                wSslPort;
    
	/**
	 * \if ENGLISH_LANG
	 * Ethernet port number
	 * \else
	 * ��̫������
	 * \endif
	 */
	public int                 nEtherNetNum;

	/**
	 * \if ENGLISH_LANG
	 * Ethernet info
	 * \else
	 * ��̫����
	 * \endif
	 */
	public SDK_ETHERNET_EX      stEtherNet[] = new SDK_ETHERNET_EX[FinalVar.SDK_MAX_ETHERNET_NUM_EX];

	/**
	 * \if ENGLISH_LANG
	 * Alarm server
	 * \else
	 * ����������
	 * \endif
	 */
	public SDK_REMOTE_HOST      struAlarmHost = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * Log server
	 * \else
	 * ��־������
	 * \endif
	 */
	public SDK_REMOTE_HOST      struLogHost = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * SMTP server
	 * \else
	 * SMTP������
	 * \endif
	 */
	public SDK_REMOTE_HOST      struSmtpHost = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * Multiple-cast group
	 * \else
	 * �ಥ��
	 * \endif
	 */
	public SDK_REMOTE_HOST      struMultiCast = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * NFS server
	 * \else
	 * NFS������
	 * \endif
	 */
	public SDK_REMOTE_HOST      struNfs = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * PPPoE server
	 * \else
	 * PPPoE������
	 * \endif
	 */
	public SDK_REMOTE_HOST      struPppoe = new SDK_REMOTE_HOST();
    
	/**
	 * \if ENGLISH_LANG
	 * returned IP after PPPoE registration
	 * \else
	 * PPPoEע�᷵�ص�IP
	 * \endif
	 */
	public byte                sPppoeIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * DDNS server
	 * \else
	 * DDNS������
	 * \endif
	 */
	public SDK_REMOTE_HOST      struDdns = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * DDNS host name
	 * \else
	 * DDNS������
	 * \endif
	 */
	public byte                sDdnsHostName[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];

	/**
	 * \if ENGLISH_LANG
	 * DNS server
	 * \else
	 * DNS������
	 * \endif
	 */
	public SDK_REMOTE_HOST      struDns = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * Email setup
	 * \else
	 * �ʼ�����
	 * \endif
	 */
	public SDK_MAIL_CFG         struMail = new SDK_MAIL_CFG();
    
    public SDKDEV_NET_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_MAX_ETHERNET_NUM_EX; i++) {
    		stEtherNet[i] = new SDK_ETHERNET_EX();
    	}
    }
}
