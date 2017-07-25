package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device information
 * \else
 * �豸��Ϣ
 * \endif
 */
public class NET_DEVICEINFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SN
	 * \else
	 * ���к�
	 * \endif
	 */
	public byte				sSerialNumber[] = new byte[FinalVar.SDK_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * DVR alarm input amount
	 * \else
	 * DVR�����������
	 * \endif
	 */
	public byte				byAlarmInPortNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR alarm output amount
	 * \else
	 * DVR�����������
	 * \endif
	 */
	public byte				byAlarmOutPortNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR HDD amount 
	 * \else
	 * DVRӲ�̸���
	 * \endif
	 */
	public byte				byDiskNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR type.Please refer to NET_DEVICE_TYPE
	 * \else
	 * DVR����, ��ö��NET_DEVICE_TYPE
	 * \endif
	 */
	public byte				byDVRType;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR channel amount 
	 * \else
	 * DVRͨ������
	 * \endif
	 */
	public byte				byChanNum;
}
