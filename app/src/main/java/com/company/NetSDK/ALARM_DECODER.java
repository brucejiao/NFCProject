package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarming Decoder 
 * \else
 * �����������ı���
 * \endif
 */
public class ALARM_DECODER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Now it supports max 8 alarm input ports. Reserved 8 bits for future development.
	 * \else
	 * �������֧��8����������ڣ���8λ���Ժ���չ
	 * \endif
	 */
	public int               dwAlarmDecoder;
	
 	/**
	 * \if ENGLISH_LANG
	 * It means it is from which alarm decoder.
	 * \else
	 * ��ʾ�ڼ�������������
	 * \endif
	 */
	public byte                bDecoderIndex;              
}
