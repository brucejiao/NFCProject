package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User network use status info 
 * \else
 * �û�����ʹ��״̬��Ϣ
 * \endif
 */
public class SDKDEV_USER_NET_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * User name 
	 * \else
	 * �û���
	 * \endif
	 */
	public byte				szUserName[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Group 
	 * \else
	 * �û���
	 * \endif
	 */
	public byte				szUserGroup[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Login time 
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME			time = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Enabled channel amount 
	 * \else
	 * ������ͨ������
	 * \endif
	 */
	public int					nOpenedChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel network status 
	 * \else
	 * ͨ������״̬
	 * \endif
	 */
	public SDKDEV_USE_CHANNEL_STATE	channelInfo[] = new SDKDEV_USE_CHANNEL_STATE[FinalVar.SDK_MAX_CHANNUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Ip address 
	 * \else
	 * ip��ַ
	 * \endif
	 */
	public byte                szIpAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN_EX];
	
	public SDKDEV_USER_NET_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_CHANNUM; i++) {
			channelInfo[i] = new SDKDEV_USE_CHANNEL_STATE();
		}
	}
}
