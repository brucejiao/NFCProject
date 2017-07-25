package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail configuration
 * \else
 * �ʼ�����
 * \endif
 */
public class SDK_MAIL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The IP address of the mail server
	 * \else
	 * �ʼ�������IP��ַ
	 * \endif
	 */
	public byte                sMailIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Mail server port
	 * \else
	 * �ʼ��������˿�
	 * \endif
	 */
	public short                wMailPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Send address
	 * \else
	 * ���͵�ַ
	 * \endif
	 */
    public byte                sSenderAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * �û���
	 * \endif
	 */
    public byte                sUserName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * User password
	 * \else
	 * �û�����
	 * \endif
	 */
    public byte                sUserPsw[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Destination address
	 * \else
	 * Ŀ�ĵ�ַ
	 * \endif
	 */
    public byte                sDestAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * CC address
	 * \else
	 * ���͵�ַ
	 * \endif
	 */
    public byte                sCcAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Dark copied address
	 * \else
	 * ������ַ
	 * \endif
	 */
    public byte                sBccAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Title
	 * \else
	 * ����
	 * \endif
	 */
    public byte                sSubject[] = new byte[FinalVar.SDK_MAX_MAIL_SUBJECT_LEN];
}
