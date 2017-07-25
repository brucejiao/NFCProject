package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to StartSearchDevices
 * \else
 * ��Ӧ StartSearchDevices �ӿ�
 * \endif
 */
public class DEVICE_NET_INFO_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 4 for IPV4, 6 for IPV6
	 * \else
	 * �˿����
	 * \endif
	 */
	public int                 iIPVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * IP IPV4 like"192.168.0.1" IPV6 like "2008::1/64"
	 * \else
	 * IP IPV4����"192.168.0.1" IPV6����"2008::1/64"
	 * \endif
	 */
	public byte				szIP[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Tcp port
	 * \else
	 * tcp�˿�
	 * \endif
	 */
	public int				    nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Subnet mask(IPV6 do not have subnet mask)
	 * \else
	 * �������� IPV6����������
	 * \endif
	 */
	public byte				szSubmask[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Gateway
	 * \else
	 * ����
	 * \endif
	 */
	public byte				szGateway[] = new byte[64];
	
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
	 * �豸����
	 * \endif
	 */
	public byte				szDeviceType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device manufactory, see EM_IPC_TYPE
	 * \else
	 * Ŀ���豸����������,����ο�EM_IPC_TYPE��	
	 * \endif
	 */
	public byte                byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * 1-Standard definition 2-High definition
	 * \else
	 * 1-���� 2-����
	 * \endif
	 */
	public byte                byDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Dhcp, true-open, false-close
	 * \else
	 * Dhcpʹ��״̬, true-��, false-��
	 * \endif
	 */
	public boolean                bDhcpEn;
	
	/**
	 * \if ENGLISH_LANG
	 * ECC data 
	 * \else
	 * У������ ͨ���첽�����ص���ȡ(���޸��豸IPʱ���ô���Ϣ����У��)
	 * \endif
	 */
	public byte                verifyData[] = new byte[88];
	
	/**
	 * \if ENGLISH_LANG
	 * Serial no
	 * \else
	 * �����к�
	 * \endif
	 */
	public byte                szSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Soft version  
	 * \else
	 * �豸����汾��   
	 * \endif
	 */
	public byte                szDevSoftVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device detail type
	 * \else
	 * �豸�ͺ�
	 * \endif
	 */
	public byte                szDetailType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM type
	 * \else
	 * OEM�ͻ�����
	 * \endif
	 */
	public byte                szVendor[] = new byte[FinalVar.SDK_MAX_STRING_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * �豸����
	 * \endif
	 */
	public byte                szDevName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User name for log in device(it need be filled when modify device ip)
	 * \else
	 * ��½�豸�û��������޸��豸IPʱ��Ҫ��д��
	 * \endif
	 */
	public byte                szUserName[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Pass word for log in device(it need be filled when modify device ip)
	 * \else
	 * ��½�豸���루���޸��豸IPʱ��Ҫ��д��
	 * \endif
	 */
	public byte                szPassWord[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * HTTP server port
	 * \else
	 * HTTP����˿ں�
	 * \endif
	 */
	public int					nHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of video input channel
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int                	wVideoInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of remote video input
	 * \else
	 * Զ����Ƶ����ͨ����
	 * \endif
	 */
	public int                	wRemoteVideoInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of video output channel 
	 * \else
	 * ��Ƶ���ͨ����
	 * \endif
	 */
	public int                	wVideoOutputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of alarm input
	 * \else
	 * ��������ͨ����
	 * \endif
	 */
	public int                	wAlarmInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of alarm output
	 * \else
	 * �������ͨ����
	 * \endif
	 */
	public int                	wAlarmOutputCh;
}
