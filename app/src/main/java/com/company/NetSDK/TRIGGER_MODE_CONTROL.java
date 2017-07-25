package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activation type 
 * \else
 * ������ʽ
 * \endif
 */
public class TRIGGER_MODE_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number 
	 * \else
	 * �˿����
	 * \endif
	 */
	public short		index;
	
	/**
	 * \if ENGLISH_LANG
	 * Activation way(0:close.1:manual.2:auto); The SDK reserves the original setup if you do not set channel here. 
	 * \else
	 * ������ʽ(0�ر�1�ֶ�2�Զ�);�����õ�ͨ����sdkĬ�Ͻ�����ԭ��������
	 * \endif
	 */
	public short		mode;
}
