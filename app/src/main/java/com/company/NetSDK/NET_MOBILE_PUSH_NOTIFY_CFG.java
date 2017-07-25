package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mobile push notification configuration, using RegisterID + AppID subscription (CFG_CMD_MOBILE_PUSH_NOFITY_CFG)
 * \else
 * �ֻ�push notification����,  ʹ��RegisterID+AppID����(��Ӧ CFG_CMD_MOBILE_PUSH_NOFITY_CFG)
 * \endif
 */
public class NET_MOBILE_PUSH_NOTIFY_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Mobile phone registered returned with the Appple/Android server, every time is different 
	 * \else
	 * �ֻ���Appple/ Android������ע�᷵�صģ�ÿ�β�ͬ
	 * \endif
	 */
	public byte                           szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Mobile phone for every client, will produce one 
	 * \else
	 * �ֻ�ÿ��һ���ͻ��ˣ������һ��
	 * \endif
	 */
	public byte                           szAppID[] = new byte[FinalVar.MAX_APP_ID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Platform Type 
	 * \else
	 * ƽ̨����, EM_MOBILE_SERVER_TYPE
	 * \endif
	 */
	public int                             emServerType;
	
	/**
	 * \if ENGLISH_LANG
	 * Push the gateway type, when emServerType is EM_MOBILE_SERVER_TYPE_SDKCLOUD effective
	 * \else
	 * ������������  emServerTypeΪEM_MOBILE_SERVER_TYPE_SDKCLOUDʱ��Ч
	 * \endif
	 * @see EM_PUSH_GATEWAY_TYPE
	 */
	public int                             emPushGatewayType;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid time, the unit is in seconds
	 * \else
	 * ��Чʱ�䣬��λΪ��
	 * \endif
	 */
	public int                             nPeriodOfValidity;
	
	/**
	 * \if ENGLISH_LANG
	 * Android authentication server address
	 * \else
	 * Android��֤��������ַ
	 * \endif
	 */
	public byte                          szAuthServerAddr[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Android authentication server port
	 * \else
	 * Android��֤�������˿�
	 * \endif
	 */
	public int                             nAuthServerPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Push the address of the server (DAHUA agent, at the end of the selected server, for compatible)
	 * By DAHUA server according to the requirements of the official server, use the latest encryption algorithm and then forwarded to the official server
	 * \else
	 * ���ͷ�������ַ(�󻪴���ĩѡ��������������)
	 * �ɴ󻪷��������ٷ�������Ҫ��ѡ�����µļ����㷨��ת�����ٷ�������
	 * \endif
	 */
	public byte                          szPushServerAddr[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Push server port (DAHUA agent)
	 * \else
	 * ���ͷ������˿�(�󻪴���)
	 * \endif
	 */
	public int                             nPushServerPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Set display equipment alias, mobile terminal 
	 * \else
	 * �豸�������ֻ���������ʾ
	 * \endif
	 */
	public byte                            szDevName[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Device identifier, mobile terminal settings to use 
	 * \else
	 * �豸��ʶ���ֻ�������ʹ��
	 * \endif
	 */
	public byte                            szDevID[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Login user name 
	 * \else
	 * ��½�û���
	 * \endif
	 */
	public byte                            szUser[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
	public byte                            szPassword[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * ios certificate information, string after Base64, effective when need to use TLS encryption 
	 * \else
	 * ios֤����Ϣ��base64֮����ַ�������Ҫ����TLS����ʱ��Ч
	 * \endif
	 */
	public byte                          szCertificate[] = new byte[FinalVar.MAX_IOS_CERTIFICATE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * ios secret key,after the base64 string 
	 * \else
	 * ios��Կ��base64֮���ַ���
	 * \endif
	 */
	public byte                          szSecretKey[] = new byte[FinalVar.MAX_IOS_SECRET_KEY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription number MAX, number of object in  pstuSubscribes
	 * \else
	 * ��������͸���, ��ʾpstuSubscribes�Ķ�������
	 * \endif
	 */
	public int                            nSubScribeMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription number in actual, valid in get configuration
	 * \else
	 * ʵ�ʵĶ������͸���, ��ȡ������Ч
	 * \endif
	 */
	public int                             nSubScribeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription type
	 * \else
	 * ��������
	 * \endif
	 */
	public NET_SUBSCRIBE_INFO              pstuSubscribes[];
	
	/**
	 * \if ENGLISH_LANG
	 * Push the server configuration, the official. Preferred server, if push fail, and try again redirection or proxy server 
	 * \else
	 * ���ͷ���������, �ٷ�����ѡ���������������ʧ�ܣ��ٳ����ض������������
	 * \endif
	 */
	public NET_PUSH_SERVER_INFO            stuPushServerMain = new NET_PUSH_SERVER_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Push the server configuration (DAHUA redirection, second server)
	 * \else
	 * ���ͷ���������(���ض��򣬴�ѡ������)
	 * \endif
	 */
	public NET_PUSH_SERVER_INFO            stuPushRedirectServer = new NET_PUSH_SERVER_INFO();
	
	public NET_MOBILE_PUSH_NOTIFY_CFG(int nSubScribeMax) {
		this.nSubScribeMax = nSubScribeMax;
		pstuSubscribes = new NET_SUBSCRIBE_INFO[nSubScribeMax];
		for (int i = 0; i < nSubScribeMax; i++) {
			pstuSubscribes[i] = new NET_SUBSCRIBE_INFO();
		}
	}
}
