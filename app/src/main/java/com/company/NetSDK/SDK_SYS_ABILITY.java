package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Search Type
 * \else
 * ��ѯ����
 * \endif
 */
public class SDK_SYS_ABILITY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Dynamic connect capacity
	 * \else
	 * ��ѯ��̬����������
	 * \endif
	 */
	public static final int     ABILITY_DYNAMIC_CONNECT = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Watermark configuration capacity
	 * \else
	 * ˮӡ��������
	 * \endif
	 */
	public static final int     ABILITY_WATERMARK_CFG = 17;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless  configuration capacity
	 * \else
	 * Wireless��������
	 * \endif
	 */
	public static final int     ABILITY_WIRELESS_CFG = 18;
	
	/**
	 * \if ENGLISH_LANG
	 * Device capacity list 
	 * \else
	 * �豸�������б�
	 * \endif
	 */
	public static final int     ABILITY_DEVALL_INFO = 26;
	
	/**
	 * \if ENGLISH_LANG
	 * Card number search capacity 
	 * \else
	 * ���Ų�ѯ����
	 * \endif
	 */
	public static final int     ABILITY_CARD_QUERY = 0x0100;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-window preview capacity
	 * \else
	 * �໭��Ԥ������
	 * \endif
	 */
	public static final int     ABILITY_MULTIPLAY = 0x0101;
	
	/**
	 * \if ENGLISH_LANG
	 * Fast query configuration Capabilities
	 * \else
	 * ���ٲ�ѯ��������
	 * \endif
	 */
	public static final int     ABILITY_QUICK_QUERY_CFG = 0x0102;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless alarm capacity 
	 * \else
	 * ���߱�������
	 * \endif
	 */
	public static final int     ABILITY_INFRARED = 0x0121;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm activation mode function 
	 * \else
	 * �������������ʽ����
	 * \endif
	 */
	public static final int     ABILITY_TRIGGER_MODE = 0x0131;
	
	/**
	 * \if ENGLISH_LANG
	 * Network hard disk partition
	 * \else
	 * ����Ӳ�̷�������
	 * \endif
	 */
	public static final int     ABILITY_DISK_SUBAREA = 0x0141;
	
	/**
	 * \if ENGLISH_LANG
	 * Query DSP Capabilities
	 * \else
	 * ��ѯDSP����
	 * \endif
	 */
	public static final int     ABILITY_DSP_CFG = 0x0151;
	
	/**
	 * \if ENGLISH_LANG
	 * Query SIP,RTSP Capabilities
	 * \else
	 * ��ѯSIP,RTSP����
	 * \endif
	 */
	public static final int     ABILITY_STREAM_MEDIA = 0x0161;
	
	/**
	 * \if ENGLISH_LANG
	 * Search intelligent track capability.
	 * \else
	 * ��ѯ���ܸ�������
	 * \endif
	 */
	public static final int     ABILITY_INTELLI_TRACKER = 0x0171;
}
