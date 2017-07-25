package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm decoder control 
 * \else
 * ��������������
 * \endif
 */
public class DECODER_ALARM_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder. It begins from 0.
	 * \else
	 * �����������ţ���0��ʼ
	 * \endif
	 */
	public int					decoderNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output port. It begin from o.
	 * \else
	 * ��������ڣ���0��ʼ
	 * \endif
	 */
	public short				alarmChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output status;1:open,0:close.
	 * \else
	 * �������״̬��1���򿪣�0���ر�
	 * \endif
	 */
	public short				alarmState;
}
