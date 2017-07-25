package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * video stream type
 * \else
 * ��Ƶ��������
 * \endif
 */
public class NET_STREAM_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Others
	 * \else
	 * ����
	 * \endif
	 */
	public static final int NET_EM_STREAM_ERR = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Main"-Main stream
	 * \else
	 * "Main"-������
	 * \endif
	 */
	public static final int NET_EM_STREAM_MAIN = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Extra1"-Extra stream 1
	 * \else
	 * "Extra1"-������1
	 * \endif
	 */
	public static final int NET_EM_STREAM_EXTRA_1 = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Extra2"-Extra stream 2
	 * \else
	 * "Extra2"-������2
	 * \endif
	 */
	public static final int NET_EM_STREAM_EXTRA_2 = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Extra3"-Extra stream 3
	 * \else
	 * "Extra3"-������3
	 * \endif
	 */
	public static final int NET_EM_STREAM_EXTRA_3 = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Snapshot"-Snap bit stream
	 * \else
	 * "Snapshot"-ץͼ����
	 * \endif
	 */
	public static final int NET_EM_STREAM_SNAPSHOT = 5; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Object"-Object stream
	 * \else
	 * "Object"-������
	 * \endif
	 */
	public static final int NET_EM_STREAM_OBJECT = 6; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Auto"
	 * \else
	 * "Auto"-�Զ�ѡ���������
	 * \endif
	 */
	public static final int NET_EM_STREAM_AUTO = 7; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Preview"
	 * \else
	 * "Preview"-Ԥ������������
	 * \endif
	 */
	public static final int NET_EM_STREAM_PREVIEW = 8; 
	
	/**
	 * \if ENGLISH_LANG
	 * No video stream (audio only)
	 * \else
	 * ����Ƶ����(����Ƶ)
	 * \endif
	 */
	public static final int NET_EM_STREAM_NONE = 9; 
}
