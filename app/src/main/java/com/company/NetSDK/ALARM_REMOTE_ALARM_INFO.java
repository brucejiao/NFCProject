package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of remote 
 * \else
 * Զ���ⲿ������Ϣ
 * \endif
 */
public class ALARM_REMOTE_ALARM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * channel ID,from 1
	 * \else
	 * ͨ���ţ���1��ʼ
	 * \endif
	 */
	public int        nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * state,0-reset,1-setting
	 * \else
	 * ����״̬��0-������λ��1-������λ
	 * \endif
	 */
	public int        nState;
}
