package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Multi-DDNS Configuration
 * \else
 * ��ddns���ýṹ��
 * \endif
 */
public class SDK_DDNS_SERVER_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DDNS Server ID
	 * \else
	 * ddns������id��
	 * \endif
	 */
	public int               dwId;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable, only one DDNS server can be set to enabled in the same time
	 * \else
	 * ʹ�ܣ�ͬһʱ��ֻ����һ��ddns����������ʹ��״̬
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Server type 
	 * \else
	 * ���������ͣ�ϣ��.. 
	 * \endif
	 */
    public byte                szServerType[] = new byte[FinalVar.SDK_MAX_SERVER_TYPE_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server IP
	 * \else
	 * ������ip��������
	 * \endif
	 */
    public byte                szServerIp[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server Port
	 * \else
	 * �������˿�
	 * \endif
	 */
    public int               dwServerPort;
    
    /**
	 * \if ENGLISH_LANG
	 * DVR Domain,ie jeckean.3322.org
	 * \else
	 * dvr��������jeckean.3322.org
	 * \endif
	 */
    public byte                szDomainName[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Username
	 * \else
	 * �û���
	 * \endif
	 */
    public byte                szUserName[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
    public byte                szUserPsw[] = new byte[FinalVar.SDK_MAX_HOST_PSWLEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server alias,ie "private inter ddns"
	 * \else
	 * ��������������"private inter ddns"
	 * \endif
	 */
    public byte                szAlias[] = new byte[FinalVar.SDK_MAX_DDNS_ALIAS_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * DDNS Alive Period
	 * \else
	 * DDNS ����ʱ��
	 * \endif
	 */
    public int               dwAlivePeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * Domain Mode :0-Manually input, szDomainName valid; 1-Default Domain szDefaultDomainName valid
	 * \else
	 * ����ģʽ:0-�ֶ���������,szDomainName��Ч; 1-Ĭ������szDefaultDomainName��Ч
	 * \endif
	 */
    public byte                ByMode;
    
    /**
	 * \if ENGLISH_LANG
	 * Default Domain, Read only
	 * \else
	 * Ĭ������,ֻ��
	 * \endif
	 */
    public byte                szDefaultDomainName[] = new byte[FinalVar.SDK_MAX_DEFAULT_DOMAIN_LEN];
}
