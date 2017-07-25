package com.company.NetSDK;

import java.io.Serializable;

public class EM_LOGIN_SPAC_CAP_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TCP login, default
	 * \else
	 * TCP��½, Ĭ�Ϸ�ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_TCP               = 0;
    
    /**
	 * \if ENGLISH_LANG
	 * No criteria login
	 * \else
	 * ��������½
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_ANY               = 1;
    
    /**
	 * \if ENGLISH_LANG
	 * auto sign up login
	 * \else
	 * ����ע��ĵ���
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_SERVER_CONN       = 2;
    
    /**
	 * \if ENGLISH_LANG
	 * multicast login, default
	 * \else
	 * �鲥��½, Ĭ�Ϸ�ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_MULTICAST         = 3;
    
    /**
	 * \if ENGLISH_LANG
	 * UDP method login
	 * \else
	 * UDP��ʽ�µĵ���
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_UDP               = 4;
    
    /**
	 * \if ENGLISH_LANG
	 * only main connection login
	 * \else
	 * ֻ���������µĵ���
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_MAIN_CONN_ONLY    = 6;
    
    /**
	 * \if ENGLISH_LANG
	 * SSL encryption login
	 * \else
	 * SSL���ܷ�ʽ��½
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_SSL               = 7;
    
    /**
	 * \if ENGLISH_LANG
	 * Chendu Jiafa login
	 * \else
	 * �ɶ��ѷ���½
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_CD_JF             = 8;
    
    /**
	 * \if ENGLISH_LANG
	 * login IVS box remote device
	 * \else
	 * ��¼���ܺ�Զ���豸
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_INTELLIGENT_BOX   = 9;
    
    /**
	 * \if ENGLISH_LANG
	 * login device do not config
	 * \else
	 * ��¼�豸����ȡ���ò���
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_NO_CONFIG         = 10;
    
    /**
	 * \if ENGLISH_LANG
	 * USB key device login
	 * \else
	 * ��U���豸�ĵ���
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_U_LOGIN           = 11;
    
    /**
	 * \if ENGLISH_LANG
	 * LDAP login
	 * \else
	 * LDAP��ʽ��¼
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_LDAP              = 12;
    
    /**
	 * \if ENGLISH_LANG
	 * AD��ActiveDirectory�� login
	 * \else
	 * AD��ActiveDirectory����¼��ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_AD                = 13;
    
    /**
	 * \if ENGLISH_LANG
	 * Radius  login 
	 * \else
	 * Radius ��¼��ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_RADIUS            = 14;
    
    /**
	 * \if ENGLISH_LANG
	 * Socks5 login
	 * \else
	 * Socks5��½��ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_SOCKET_5          = 15;
    
    /**
	 * \if ENGLISH_LANG
	 * cloud login
	 * \else
	 * �Ƶ�½��ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_CLOUD             = 16;
    
    /**
	 * \if ENGLISH_LANG
	 * dual authentication loin
	 * \else
	 * ���μ�Ȩ��½��ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_AUTH_TWICE        = 17;
    
    /**
	 * \if ENGLISH_LANG
	 * TS stream client login
	 * \else
	 * TS�����ͻ��˵�½��ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_TS                = 18;
    
    /**
	 * \if ENGLISH_LANG
	 * web private login
	 * \else
	 * ΪP2P��½��ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_P2P               = 19;
    
    /**
	 * \if ENGLISH_LANG
	 * mobile client login
	 * \else
	 * �ֻ��ͻ��˵�½
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_MOBILE            = 20;
    
    /**
	 * \if ENGLISH_LANG
	 * invalid login
	 * \else
	 * ��Ч�ĵ�½��ʽ
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_INVALID           = 21;
}
