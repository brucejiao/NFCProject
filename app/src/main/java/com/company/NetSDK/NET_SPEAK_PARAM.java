package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio talk_speak param
 * \else
 * �����Խ���������	
 * \endif
 */
public class NET_SPEAK_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:talk back(default), 1: propaganda,from propaganda ro talk back,need afresh to configure
	 * \else
	 * 0���Խ���Ĭ��ģʽ����1���������Ӻ����л����Խ�Ҫ��������
	 * \endif
	 */
	public int             nMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Reproducer channel
	 * \else
	 * ������ͨ���ţ�����ʱ��Ч
	 * \endif
	 */
	public int             nSpeakerChannel;      
	
	/**
	 * 
	 * 
	 */
	public int 			   nEnableWait;
}
