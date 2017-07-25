package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:Not scan wifi (Manually added), 1: scanned wifi
	 * \else
	 * 0:��ɨ��wifi (�ֶ���ӵ�), 1ɨ�赽��wifi
	 * \endif
	 */
	public boolean        bIsScan;

	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * SSID
	 * \endif
	 */
	public byte        szSSID[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Verify type
	 * 0:OPEN 
	 * 1:RESTRICTE
	 * 2:WEP
	 * 3:WPA
	 * 4:WPA2
	 * 5:WPA-PSK
	 * 6:WPA2-PSK
	 * \else
	 * У������
	 * 0:OPEN 
	 * 1:RESTRICTE
	 * 2:WEP
	 * 3:WPA
	 * 4:WPA2
	 * 5:WPA-PSK
	 * 6:WPA2-PSK
	 * \endif
	 */
	public int         nSafeType;
	
	/**
	 * \if ENGLISH_LANG
	 * Encryption method
	 * 0:OPEN
	 * 1:TKIP
	 * 2:WEP
	 * 3:AES
	 * 4:NONE(No verify)
	 * 5:AUTO
	 * 6:SHARED
	 * \else
	 * ���ܷ�ʽ
	 * 0:OPEN
	 * 1:TKIP
	 * 2:WEP
	 * 3:AES
	 * 4:NONE(��У��)
	 * 5:AUTO
	 * 6:SHARED
	 * \endif
	 */
	public int        nEncryprion;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection key
	 * \else
	 * ������Կ
	 * \endif
	 */
	public byte        szKey[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * AP site signal
	 * \else
	 * APվ���ź�
	 * \endif
	 */
	public int         nStrength;

	/**
	 * \if ENGLISH_LANG
	 * AP site maximum transmission rate, with units, read-only
	 * \else
	 * APվ������������,����λ ֻ��
	 * \endif
	 */
	public int         nMaxBitRate;

	/**
	 * \if ENGLISH_LANG
	 * If success connect read-only
	 * \else
	 * �Ƿ����ӳɹ�ֻ��
	 * \endif
	 */
	public int         nIsCnnted;

	/**
	 * \if ENGLISH_LANG
	 * If save read-only
	 * \else
	 * �Ƿ��Ѿ�����ֻ��
	 * \endif
	 */
	public int         nIsSaved;

	/**
	 * \if ENGLISH_LANG
	 * Priority,(1-32)
	 * \else
	 * ���ȼ�,(1-32)
	 * \endif
	 */
	public int         nPriority;

	/**
	 * \if ENGLISH_LANG
	 * Host address
	 * \else
	 * ������ַ
	 * \endif
	 */
	public byte        szHostIP[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Host network mask
	 * \else
	 * ��������
	 * \endif
	 */
	public byte        szHostNetmask[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Host gateway
	 * \else
	 * ��������
	 * \endif
	 */
	public byte        szHostGateway[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Radio frequency, using channel logo
	 * \else
	 * ����Ƶ�ʣ�����ͨ����ʶ
	 * \endif
	 */
	public int         nWifiFreq;

	/**
	 * \if ENGLISH_LANG
	 * 0:disable 1:enable(default value is 1)
	 * \else
	 * 0����ʹ�� 1��ʹ��(ɨ�赽��dhcpĬ��ʹ�ܴ�)
	 * \endif
	 */
	public int         nEnDHCP;

	/**
	 * \if ENGLISH_LANG
	 * Verify index of WEP,0:no support,1-4 is index
	 * \else
	 * WEPУ�������µ���Կ����,0����֧����Կ���� >0:��Կ����ֵ����Χ1-4
	 * \endif
	 */
	public byte        byKeyIndex;
}
