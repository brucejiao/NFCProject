package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless routing config
 * \else
 * ����·������
 * \endif
 */
public class SDKDEV_WIRELESS_ROUTING_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * SSID����
	 * \endif
	 */
	public byte                szSSID[] = new byte[36];

	/**
	 * \if ENGLISH_LANG
	 * hide SSID
	 * \else
	 * �Ƿ�����SSID
	 * \endif
	 */
	public boolean                bHideSSID;

	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte                szIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * sub mark
	 * \else
	 * ��������
	 * \endif
	 */
	public byte                szSubMark[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * gateway
	 * \else
	 * ����
	 * \endif
	 */
	public byte                szGateWay[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * country
	 * \else
	 * ����, DefaultĬ�ϲ�ָ�������������б�ο�����·��������Ϣ
	 * \endif
	 */
	public byte                szCountry[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * safe type: 1-no encryption; 2-WEP; 2-WPA-PSK; 3-WPA2-PSK
	 * \else
	 * ��Ȩģʽ: 1-������; 2-WEPģʽ; 2-WPA-PSKģʽ; 3-WPA2-PSKģʽ
	 * \endif
	 */
	public int                 nSafeType;

	/**
	 * \if ENGLISH_LANG
	 * encryption: WEP(1-auto 2-open 3-shareable); WPA-PSK/WPA2-PSK(4-TKIP 5-AES)
	 * \else
	 * ���ܷ�ʽ: WEPģʽ(1-�Զ� 2-���� 3-����); WPA-PSKģʽ/WPA2-PSKģʽ(4-TKIP 5-AES)
	 * \endif
	 */
	public int                 nEncryption;

	/**
	 * \if ENGLISH_LANG
	 * key
	 * \else
	 * ������Կ
	 * \endif
	 */
	public byte                szKey[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * �ŵ�, ��Ч�ŵ��б�ο�����·��������Ϣ
	 * \endif
	 */
	public int                 nChannel;

	/**
	 * \if ENGLISH_LANG
	 * auto channel select
	 * \else
	 * �Զ�ѡ���ŵ�
	 * \endif
	 */
	public boolean                bAutoChannelSelect;
}
