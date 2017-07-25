package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General alarm info expansion structure
 * \else
 * ��ͨ������Ϣ
 * \endif
 */
public class NET_CLIENT_STATE_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int					channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input amount 
	 * \else
	 * ����������� 
	 * \endif
	 */
	public int					alarminputcount;
	
	/**
	 * \if ENGLISH_LANG
	 * External alarm 
	 * \else
	 * �ⲿ����
	 * \endif
	 */
	public byte					alarm[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Motion detect 
	 * \else
	 * ��̬���
	 * \endif
	 */
	public byte					motiondection[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss 
	 * \else
	 * ��Ƶ��ʧ
	 * \endif
	 */
	public byte					videolost[] = new byte[32];
}
