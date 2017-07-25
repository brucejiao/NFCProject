package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network storage config
 * \else
 * ����洢����
 * \endif
 */
public class CFG_NAS_INFO_NEW implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean    			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * ����
	 * \endif
	 */
	public byte[]				szName = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Protocol type, 0-FTP, 1-SMB, 2-ISCSI
	 * \else
	 * Э������, 0-FTP, 1-SMB, 2-ISCSI
	 * \endif
	 */
	public int					nPortocol;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP address or wed address
	 * \else
	 * IP��ַ����ַ
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * �˿�
	 * \endif
	 */
	public int					nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Username
	 * \else
	 * �û���
	 * \endif
	 */
	public byte[]				szUser = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
	public byte[]				szPassword = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Shared directory name
	 * \else
	 * �����Ŀ¼��
	 * \endif
	 */
	public byte[]				szDirectory = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Character encode mode, 0-UTF8, 1-GB2312
	 * \else
	 * �ַ������ʽ, 0-UTF8, 1-GB2312
	 * \endif
	 */
	public int					nCharEncoding;
	
 	/**
	 * \if ENGLISH_LANG
	 * overtime, unit is ms
	 * \else
	 * ��ʱʱ��, ��λ����
	 * \endif
	 */
	public int					nTimeOut;
	
 	/**
	 * \if ENGLISH_LANG
	 * Data string ID
	 * \else
	 * ������ID
	 * \endif
	 */
	public int					nStreamID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Update time, the field changed, need to initialize iSCSI function
	 * \else
	 * ����ʱ��, ���ֶ�ֵ�仯����Ҫ���³�ʼ��iSCSI����
	 * \endif
	 */
	public CFG_NET_TIME_EX		stuUpdateTime = new CFG_NET_TIME_EX();
}
