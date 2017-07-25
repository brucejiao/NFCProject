package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Log search type 
 * \else
 * ��־��ѯ����
 * \endif
 */
public class SDK_LOG_QUERY_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All logs
	 * \else
	 * ������־
	 * \endif
	 */
	public static final int     SDKLOG_ALL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * System logs 
	 * \else
	 * ϵͳ��־
	 * \endif
	 */
	public static final int     SDKLOG_SYSTEM = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Configuration logs
	 * \else
	 * ������־
	 * \endif
	 */
	public static final int     SDKLOG_CONFIG = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage logs
	 * \else
	 * �洢���
	 * \endif
	 */
	public static final int     SDKLOG_STORAGE = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm logs 
	 * \else
	 * ������־
	 * \endif
	 */
	public static final int     SDKLOG_ALARM = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Record related
	 * \else
	 * ¼�����
	 * \endif
	 */
	public static final int     SDKLOG_RECORD = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Account related
	 * \else
	 * �ʺ����
	 * \endif
	 */
	public static final int     SDKLOG_ACCOUNT = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Clear log 
	 * \else
	 * �����־
	 * \endif
	 */
	public static final int     SDKLOG_CLEAR = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback related 
	 * \else
	 * �ط����
	 * \endif
	 */
	public static final int     SDKLOG_PLAYBACK = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Concerning the front-end management and running
	 * \else
	 * ǰ�˹����������
	 * \endif
	 */
	public static final int     SDKLOG_MANAGER = 9;
}
