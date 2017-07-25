package com.company.NetSDK;

import java.io.Serializable;

public class CFG_WLAN_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                    szWlanName[] = new byte[FinalVar.CFG_COMMON_STRING_32];   // Wlan����, ֻ�ܻ�ȡ�����޸�
	public boolean                    bEnable;                            // WIFI����ʹ�ܿ���, TRUE��, FALSE�ر�
    public byte                    szSSID[] = new byte[FinalVar.CFG_MAX_SSID_LEN];           // ��������(SSID)
    public boolean                    bConnectEnable;                     // �ֶ����ӿ���, TRUE�ֶ�����, FALSE�ֶ��Ͽ�
    public boolean                    bLinkEnable;                        // �Զ����ӿ���, TRUE���Զ�����, FALSE�Զ�����, IPC������
    public int                     nLinkMode;                          // ����ģʽ, 0: auto, 1: adhoc, 2: Infrastructure
    public int                     nEncryption;                        // ����ģʽ, 0: off, 1: on, 2: WEP-OPEN, 3: WEP-SHARED, 4: WPA-TKIP, 5: WPA-PSK-TKIP, 6: WPA2-TKIP, 7: WPA2-PSK-TKIP, 8: WPA-AES, 9: WPA-PSK-AES, 10: WPA2-AES, 11: WPA2-PSK-AES
																	    /* ����byAuthMode  , byEncrAlgr  ������ӳ���ϵ
																	    Authentication��֤��ʽ  DataEncryption���ݼ��ܷ�ʽ  Encryption����ģʽ
																	    OPEN                    NONE                        "On" 
																	    OPEN                    WEP                         "WEP-OPEN"
																	    SHARD                   WEP                         "WEP-SHARED"
																	    WPA                     TKIP                        "WPA-TKIP"
																	    WPA-PSK                 TKIP                        "WPA-PSK-TKIP"
																	    WPA2                    TKIP                        "WPA2-TKIP"
																	    WPA2-PSK                TKIP                        "WPA2-PSK-TKIP"
																	    WPA                     AES(CCMP)                   "WPA-AES"
																	    WPA-PSK                 AES(CCMP)                   "WPA-PSK-AES"
																	    WPA2                    AES(CCMP)                   "WPA2-AES"
																	    WPA2-PSK                AES(CCMP)                   "WPA2-PSK-AES"
																	    WPA                     TKIP+AES( mix Mode)         "WPA-TKIP"����"WPA-AES"
																	    WPA-PSK                 TKIP+AES( mix Mode)         "WPA-PSK-TKIP"����"WPA-PSK-AES"
																	    WPA2                    TKIP+AES( mix Mode)         "WPA2-TKIP"����"WPA2-AES"
																	    WPA2-PSK                TKIP+AES( mix Mode)         "WPA2-PSK-TKIP"����"WPA2-PSK-AES"
																	    */
    public int                     emAuthentication;            // ��֤��ʽ, ��ʱû��, EM_CFG_WIRELESS_AUTHENTICATION
    public int                     emDataEncryption;            // ���ݼ��ܷ�ʽ, ��ʱû��, EM_CFG_WIRELESS_DATA_ENCRYPT
    public int                     nKeyType;                           // ��������, 0: Hex, 1: ASCII
    public int                     nKeyID;                             // ��Կ����, ȡֵ0~3
    public byte                    szKeys[][] = new byte[4][32];                      // ��������
    public boolean                    bKeyFlag;                           // �����Ƿ��Ѿ�����
    public CFG_WLAN_EAP            stuEap = new CFG_WLAN_EAP();                             // EAP
    public CFG_WLAN_NETWORK        stuNetwork = new CFG_WLAN_NETWORK();                         // Network
}
