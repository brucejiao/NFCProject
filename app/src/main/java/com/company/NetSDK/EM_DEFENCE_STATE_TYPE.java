package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Type
 * \else
 * ����״̬����
 * \endif
 */
public class EM_DEFENCE_STATE_TYPE implements Serializable {
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
    public final static int EM_DEFENCE_STATE_UNKNOWN  = 0 ;
    
    /**
	 * \if ENGLISH_LANG
	 * Bypass
	 * \else
	 * ��·
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_BYPASS   = 1 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Open, for alarm under disarming
	 * \else
	 * ��, ָ��������·�������
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_OPEN     = 2 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Close
	 * \else
	 * �ر�
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_CLOSE    = 3 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Alarm, for alarm under arming
	 * \else
	 * ����, ָ��������·�������
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_ALARMING = 4 ; 
}
