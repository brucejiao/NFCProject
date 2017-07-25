package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Interface type,responding to the interface CLIENT_SetSubconnCallBack
 * \else
 * �ӿ����ͣ���ӦCLIENT_SetSubconnCallBack�ӿ�
 * \endif
 */
public class EM_INTERFACE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown interface
	 * \else
	 * δ֪�ӿ�
	 * \endif
	 */
	public static int 		SDK_INTERFACE_OTHER = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Realtime monitoring interface
	 * \else
	 * ʵʱ���ӽӿ�
	 * \endif
	 */
	public static int 		SDK_INTERFACE_REALPLAY = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Realtime multiple-window preview
	 * \else
	 * �໭��Ԥ���ӿ�
	 * \endif
	 */
	public static int 		SDK_INTERFACE_PREVIEW = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback interface
	 * \else
	 * �˻طŽӿ�
	 * \endif
	 */
	public static int 		SDK_INTERFACE_PLAYBACK = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Download interface
	 * \else
	 * ���ؽӿ�
	 * \endif
	 */
	public static int 		SDK_INTERFACE_DOWNLOAD = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Download picture interface
	 * \else
	 * ��������ͼƬ�ӿ�
	 * \endif
	 */
	public static int 		SDK_INTERFACE_REALLOADPIC = 5;
}
