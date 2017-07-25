package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless device expended configuration
 * \else
 * �����豸��չ����
 * \endif
 */
public class SDKDEV_WLAN_DEVICE_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * server id
	 * \else
	 * ��������
	 * \endif
	 */
	public byte                szSSID[] = new byte[36];

	/**
	 * \if ENGLISH_LANG
	 * mac address
	 * \else
	 * mac��ַ
	 * \endif
	 */
	public byte                szMacAddr[] = new byte[18];

	/**
	 * \if ENGLISH_LANG
	 * connect state 0: not connect,1: connected
	 * \else
	 * �Ƿ����ӳɹ� 0:û�У�1: ���ӳɹ�
	 * \endif
	 */
	public byte                byApConnected;

	/**
	 * \if ENGLISH_LANG
	 * connect mod 0:adhoc 1:Infrastructure;
	 * \else
	 * ����ģʽ 0:adhoc 1:Infrastructure;
	 * \endif
	 */
	public byte                byLinkMode;

	/**
	 * \if ENGLISH_LANG
	 * rssi quality(dbm)
	 * \else
	 * �ź�ǿ��(dbm)
	 * \endif
	 */
	public int                 nRSSIQuality;

	/**
	 * \if ENGLISH_LANG
	 * max transmit speed
	 * \else
	 * վ������������
	 * \endif
	 */
	public int        unApMaxBitRate;

	/**
	 * \if ENGLISH_LANG
	 * attestation mod:0:OPEN;1:SHARED;2:WPA;3:WPA-PSK;4:WPA2;5:WPA2-PSK;
	 * 6:WPA-NONE(only use in Adhoc mode),
	 * 7-11 are mix mode,choose one of them can to be connected 
	 * 7:WPA-PSK | WPA2-PSK; 8:WPA | WPA2; 9:WPA | WPA-PSK;
	 * 10:WPA2 | WPA2-PSK; 11:WPA | WPA-PSK |WPA2 |WPA2-PSK //12: UnKnown
	 * \else
	 * ��֤ģʽ0:OPEN;1:SHARED;2:WPA;3:WPA-PSK;4:WPA2;5:WPA2-PSK;
	 * 6:WPA-NONE(����adhoc����ģʽ),
	 * 7-11�ǻ��ģʽ��ѡ�������κ�һ�ֶ����Խ������� 
	 * 7:WPA-PSK | WPA2-PSK; 8:WPA | WPA2; 9:WPA | WPA-PSK;
	 * 10:WPA2 | WPA2-PSK; 11:WPA | WPA-PSK |WPA2 |WPA2-PSK //12: UnKnown
	 * \endif
	 */
	public byte                byAuthMode;

	/**
	 * \if ENGLISH_LANG
	 * encrypt mod 0:off; 2:WEP64bit; 3:WEP128bit; 4:WEP; 5:TKIP; 6:AES(CCMP)
	 * 7: TKIP+AES( mix Mode) 8: UnKnown
	 * \else
	 * ����ģʽ0:off; 2:WEP64bit; 3:WEP128bit; 4:WEP; 5:TKIP; 6:AES(CCMP)
	 * 7: TKIP+AES(���ģʽ) 8: UnKnown
	 * \endif
	 */
	public byte                byEncrAlgr;

	/**
	 * \if ENGLISH_LANG
	 * link quality 0~100(%)
	 * \else
	 * ����ǿ�� 0~100(%)
	 * \endif
	 */
	public byte                byLinkQuality;
}
