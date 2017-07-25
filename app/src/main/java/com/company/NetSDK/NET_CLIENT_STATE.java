package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General alarm informaiton
 * \else
 * ��ͨ������Ϣ
 * \endif
 */
public class NET_CLIENT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No. 
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int					channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input port amount 
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
	public byte					alarm[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Motion detection 
	 * \else
	 * ��̬���
	 * \endif
	 */
	public byte					motiondection[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss 
	 * \else
	 * ��Ƶ��ʧ
	 * \endif
	 */
	public byte					videolost[] = new byte[16];
}
