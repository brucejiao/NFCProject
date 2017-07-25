package com.company.NetSDK;

import java.io.Serializable;

public class EVENT_COMM_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * NTP time sync status 
	 * \else
	 * NTPУʱ״̬
	 * \endif
	 */
	public int                  emNTPStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * driver info number
	 * \else
	 * ��ʻԱ��Ϣ��
	 * \endif
	 */
	public int                  nDriversNum;
	
	/**
	 * \if ENGLISH_LANG
	 * driver info data 
	 * \else
	 * ��ʻԱ��Ϣ����
	 * \endif
	 */
	public SDK_MSG_OBJECT_EX    pstDriversInfo[];
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ����Ӳ�̻���sd���ɹ�д��·��,ΪNULLʱ��·��������
	 * \endif
	 */
	public String               pszFilePath;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �豸�ɹ�д��ftp��������·��
	 * \endif
	 */
	public String               pszFTPPath;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ��ǰ������Ҫ��ȡ��ǰΥ�µĹ�����Ƶ��FTP�ϴ�·��
	 * \endif
	 */
	public String               pszVideoPath;
}
