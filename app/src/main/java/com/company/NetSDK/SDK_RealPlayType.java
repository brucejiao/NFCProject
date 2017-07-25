package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Preview type.Corresponding to CLIENT_RealPlayEx
 * \else
 * �˿����
 * \endif
 */
public class SDK_RealPlayType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Real-time preview
	 * \else
	 * ʵʱԤ��
	 * \endif
	 */
	public static final int     SDK_RType_Realplay = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview 
	 * \else
	 * �໭��Ԥ��
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Real-time monitor-main stream. It is the same as DH_RType_Realplay
	 * \else
	 * ʵʱ����-����������ͬ��SDK_RType_Realplay
	 * \endif
	 */
	public static final int     SDK_RType_Realplay_0 = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * 1 Real-time monitor---extra stream 1
	 * \else
	 * ʵʱ����-������1
	 * \endif
	 */
	public static final int     SDK_RType_Realplay_1 = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * 2 Real-time monitor-- extra stream 2
	 * \else
	 * ʵʱ����-������2
	 * \endif
	 */
	public static final int     SDK_RType_Realplay_2 = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 3 Real-time monitor -- extra stream 3
	 * \else
	 * ʵʱ����-������3
	 * \endif
	 */
	public static final int     SDK_RType_Realplay_3 = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview-- 1-window 
	 * \else
	 * �໭��Ԥ����1����
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_1 = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--4-window
	 * \else
	 * �໭��Ԥ����4����
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_4 = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--8-window
	 * \else
	 * �໭��Ԥ����8����
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_8 = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--9-window
	 * \else
	 * �໭��Ԥ����9����
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_9 = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--16-window
	 * \else
	 * �໭��Ԥ����16����
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_16 = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--6-window
	 * \else
	 * �໭��Ԥ����6����
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_6 = 11;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--12-window
	 * \else
	 * �໭��Ԥ����12����
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_12 = 12;
}
