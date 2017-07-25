package com.company.NetSDK;

import java.io.Serializable;

public class NET_LOGIC_CHN_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknow
	 * \else
	 * δ֪
	 * \endif
	 */
	public static final int LOGIC_CHN_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Local channel 
	 * \else
	 * ����ͨ��
	 * \endif
	 */
	public static final int LOGIC_CHN_LOCAL = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Remote access channel
	 * \else
	 * Զ��ͨ��
	 * \endif
	 */
	public static final int LOGIC_CHN_REMOTE = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Synthesis of channel, for the judicial equipment contains picture in picture channel and mixing channel 
	 * \else
	 * �ϳ�ͨ��, ����ͥ���豸�������л�ͨ���ͻ���ͨ��
	 * \endif
	 */
	public static final int LOGIC_CHN_COMPOSE = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * matrix channel��including analog matrix and digital matrix
	 * \else
	 * ģ�����ͨ��
	 * \endif
	 */
	public static final int LOGIC_CHN_MATRIX = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * cascading channel
	 * \else
	 * ����ͨ��
	 * \endif
	 */
	public static final int LOGIC_CHN_CASCADE = 5; 
}
