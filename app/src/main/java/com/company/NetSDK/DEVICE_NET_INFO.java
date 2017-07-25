package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to SearchDevices
 * \else
 * ��Ӧ SearchDevices �ӿ�
 * \endif
 */
public class DEVICE_NET_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte				szIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * tcp�˿�
	 * \endif
	 */
	public int					nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Subnet mask
	 * \else
	 * ��������
	 * \endif
	 */
	public byte				szSubmask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Gateway
	 * \else
	 * ����
	 * \endif
	 */
	public byte				szGateway[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * MAC address
	 * \else
	 * MAC��ַ
	 * \endif
	 */
	public byte				szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type
	 * \else
	 * ���豸����
	 * \endif
	 */
	public byte				szDeviceType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Manufactory
	 * \else
	 * Ŀ���豸����������,����ο� EM_IPC_TYPE ��
	 * \endif
	 */
	public byte                byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * 4: IPv4, szXXX is in format with dot; 6:IPv6, szXXX is 128-bit *16 bytes) numerical format
	 * \else
	 * 4: IPv4, szXXXΪ����ַ�����ʽ;  6:IPv6, szXXXΪ128λ(16�ֽ�)��ֵ��ʽ
	 * \endif
	 */
	public byte                byIPVersion;
}
