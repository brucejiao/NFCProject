package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * power current status type
 * \else
 * ��Դ����״̬����
 * \endif
 */
public class EM_CURRENT_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * δ֪
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_UNKNOWN 		= 0 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current too high
	 * \else
	 * ��������
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_OVER_CURRENT 	= 1 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current normal
	 * \else
	 * ��������
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_NORMAL			= 2 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current too low
	 * \else
	 * ��ԴǷ��
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_UNDER_CURRENT  = 3 ;
}
