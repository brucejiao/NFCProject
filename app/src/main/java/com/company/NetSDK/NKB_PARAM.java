package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New network keyboard
 * \else
 * ��������̿���
 * \endif
 */
public class NKB_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The address of DVR or others, 0xFF is broadcast address
	 * \else
	 * ΪDVR���豸�������ַ��,0xFFΪ�㲥��ַ
	 * \endif
	 */
	public byte                bAddressCode;
	
	/**
	 * \if ENGLISH_LANG
	 * code of status 0/1, 0 is down, 1 is up
	 * \else
	 * ״̬�� 0/1 0��ʾ�������� 1��ʾ�����ſ�
	 * \endif
	 */
	public byte                bKeyStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * extend byte 1
	 * \else
	 * ��չ�ֽ�1
	 * \endif
	 */
	public byte                bExtern1;
	
	/**
	 * \if ENGLISH_LANG
	 * extend byte 2
	 * \else
	 * ��չ�ֽ�2
	 * \endif
	 */
	public byte                bExtern2;
}
