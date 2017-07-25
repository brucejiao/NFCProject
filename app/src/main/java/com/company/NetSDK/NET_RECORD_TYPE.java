package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record file type
 * \else
 * ¼���ļ�����
 * \endif
 */
public class NET_RECORD_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All the video
	 * \else
	 * ����¼��
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_ALL = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * common  video
	 * \else
	 * ��ͨ¼��
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_NORMAL = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * External alarm video
	 * \else
	 * �ⲿ����¼��
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_ALARM = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * DM alarm video
	 * \else
	 * ���챨��¼��
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_MOTION = 3; 
}
