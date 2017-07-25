package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail configuration structure 
 * \else
 * �ʼ����ýṹ��
 * \endif
 */
public class SDKDEV_MAIL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Mail server address(IP and domain name )
	 * \else
	 * �ʼ���������ַ(IP��������)
	 * \endif
	 */
	public byte                sMailIPAddr[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
	
	public byte                sSubMailIPAddr[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Mail server port
	 * \else
	 * �ʼ��������˿�
	 * \endif
	 */
	public short                wMailPort;
	
    public short                wSubMailPort;
    
    /**
	 * \if ENGLISH_LANG
	 * From
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
	public byte                sUserName[] = new byte[FinalVar.SDK_MAX_MAIL_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * �û�����
	 * \endif
	 */
	public byte                sUserPsw[] = new byte[FinalVar.SDK_MAX_MAIL_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * To
	 * \else
	 * Ŀ�ĵ�ַ
	 * \endif
	 */
	public byte                sDestAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * CC
	 * \else
	 * ���͵�ַ
	 * \endif
	 */
	public byte                sCcAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * BCC
	 * \else
	 * ������ַ
	 * \endif
	 */
	public byte                sBccAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Subject
	 * \else
	 * ����
	 * \endif
	 */
	public byte                sSubject[] = new byte[FinalVar.SDK_MAX_MAIL_SUBJECT_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Enable 0:false,	1:true
	 * \else
	 * ʹ��0:false,    1:true
	 * \endif
	 */
	public byte                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SSL enable
	 * \else
	 * SSLʹ��
	 * \endif
	 */
	public byte                bSSLEnable;

	/**
	 * \if ENGLISH_LANG
	 * Send interval,[0,3600]s
	 * \else
	 * ����ʱ����,[0,3600]��
	 * \endif
	 */
	public short                wSendInterval;

	/**
	 * \if ENGLISH_LANG
	 * Anonymous Options[0,1], 0:FALSE,1:TRUE.
	 * \else
	 * ����ѡ��[0,1], 0��ʾFALSE,1��ʾTRUE.
	 * \endif
	 */
	public byte                bAnonymous;

	/**
	 * \if ENGLISH_LANG
	 * Attach enable[0,1], 0:FALSE,1:TRUE.
	 * \else
	 * ����ʹ��[0,1], 0��ʾFALSE,1��ʾTRUE.
	 * \endif
	 */
	public byte                bAttachEnable;
}
