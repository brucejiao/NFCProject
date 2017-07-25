package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network Area Server Configuration 
 * \else
 * ����洢���������� 
 * \endif
 */
public class CFG_NAS_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ�ܿ���
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Version of Network Area Server 0=FTP,1=NAS 
	 * \else
	 * ����洢�������汾0=�ϵ�FTP��1=NAS�洢
	 * \endif
	 */
	public int					nVersion;
	
 	/**
	 * \if ENGLISH_LANG
	 * Protocol Type0=FTP 1=SMB 
	 * \else
	 * Э������0=FTP 1=SMB
	 * \endif
	 */
	public int					nProtocol;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP or Domain Name 
	 * \else
	 * IP��ַ��������
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port Number 
	 * \else
	 * �˿ں�
	 * \endif
	 */
	public int					nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * User Name 
	 * \else
	 * �ʻ���
	 * \endif
	 */
	public byte[]				szUserName = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
	public byte[]				szPassword = new byte[FinalVar.MAX_PASSWORD_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Shared Directory 
	 * \else
	 * �����Ŀ¼��
	 * \endif
	 */
	public byte[]				szDirectory = new byte[FinalVar.MAX_DIRECTORY_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Lenth of file 
	 * \else
	 * �ļ�����
	 * \endif
	 */
	public int					nFileLen;
	
 	/**
	 * \if ENGLISH_LANG
	 * Interval 
	 * \else
	 * �����ļ�ʱ����
	 * \endif
	 */
	public int					nInterval;
	
 	/**
	 * \if ENGLISH_LANG
	 * Period of Storage 
	 * \else
	 * �洢ʱ���
	 * \endif
	 */
	public CFG_CHANNEL_TIME_SECTION[] stuChnTime = new CFG_CHANNEL_TIME_SECTION[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Valid Number of Storage 
	 * \else
	 * ��Ч�Ĵ洢ʱ�����
	 * \endif
	 */
	public int					nChnTimeCount;
	
	public CFG_NAS_INFO() {
		for (int i = 0; i < FinalVar.MAX_VIDEO_CHANNEL_NUM; ++i) {
			this.stuChnTime[i] = new CFG_CHANNEL_TIME_SECTION();
		}
	}
}
