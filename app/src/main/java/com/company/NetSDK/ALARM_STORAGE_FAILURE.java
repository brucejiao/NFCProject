package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * storage failure alarm info
 * \else
 * �洢�쳣����
 * \endif
 */
public class ALARM_STORAGE_FAILURE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start
	 * \else
	 * 0��ֹͣ�� 1����ʼ
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * protocol type
	 * \else
	 * Э�����ͣ�Ŀǰֻ֧��FTP
	 * \endif
	 */
	public byte      szProtocol[] = new byte[FinalVar.SDK_MAX_STRING_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * server device's ip 
	 * \else
	 * ������IP��ַ
	 * \endif
	 */
	public byte      szServerAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * port number
	 * \else
	 * �˿ں�
	 * \endif
	 */
	public int     dwPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time
	 * \else
	 * �¼�����ʱ��
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel, from 1, 0 means does not distinguish
	 * \else
	 * ͨ����, ��1��ʼ, 0��ʾ������ͨ��
	 * \endif
	 */
	public int       nChannel;
}
