package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial port status
 * \else
 * ���ڻ�������
 * \endif
 */
public class SDK_COMM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number 
	 * \else
	 * �Ƿ���
	 * \endif
	 */
	public int					uBeOpened;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ������
	 * \endif
	 */
	public int					uBaudRate;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ����λ
	 * \endif
	 */
	public int					uDataBites;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ֹͣλ
	 * \endif
	 */
	public int					uStopBits;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * У��λ
	 * \endif
	 */
	public int					uParity;
}
