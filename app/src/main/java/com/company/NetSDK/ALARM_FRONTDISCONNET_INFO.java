package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * front IPC disconnect alarm info
 * \else
 * ǰ�˶���������Ϣ
 * \endif
 */
public class ALARM_FRONTDISCONNET_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start	
	 * \else
	 * 0:��ʼ 1:ֹͣ
	 * \endif
	 */
	public int                nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time
	 * \else
	 * �¼�����ʱ��
	 * \endif
	 */
	public NET_TIME           stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * front IP's address
	 * \else
	 * ǰ��IPC��IP��ַ
	 * \endif
	 */
	public byte               szIpAddress[] = new byte[FinalVar.MAX_PATH];
}
