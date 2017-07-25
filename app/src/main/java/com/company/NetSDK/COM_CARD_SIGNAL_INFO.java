package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232/485 com card signal info configuration
 * \else
 * 232���ڿ����źš�485���ڿ����ź��¼�����
 * \endif
 */
public class COM_CARD_SIGNAL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * card number start location
	 * \else
	 * ������ʼλ
	 * \endif
	 */
	public short                wCardStartPose; 
	
	/**
	 * \if ENGLISH_LANG
	 * card number length
	 * \else
	 * ���ų���
	 * \endif
	 */
	public short                wCardLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * start string
	 * \else
	 * ��ʼ��
	 * \endif
	 */
	public byte                cStartCharacter[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * end string
	 * \else
	 * ������
	 * \endif
	 */
	public byte                cEndCharacter[] = new byte[32];
}
