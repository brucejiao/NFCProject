package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial Port Common Attribute
 * \else
 * ���ڻ�������
 * \endif
 */
public class CFG_COMM_PROP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DataBit;0:5��1:6��2:7��3:8
	 * \else
	 * ����λ;0:5��1:6��2:7��3:8
	 * \endif
	 */
	public byte				byDataBit;
	
	/**
	 * \if ENGLISH_LANG
	 * StopBit;0:1λ��1:1.5λ��2:2λ
	 * \else
	 * ֹͣλ;0:1λ��1:1.5λ��2:2λ
	 * \endif
	 */
	public byte				byStopBit;
	
	/**
	 * \if ENGLISH_LANG
	 * Parity Bit;0:No Check��1:Odd Check;2:Even Check
	 * \else
	 * У��λ;0:��У�飬1:��У��;2:żУ��
	 * \endif
	 */
	public byte				byParity;
	
	/**
	 * \if ENGLISH_LANG
	 * BaudRate;0:300��1:600��2:1200��3:2400��4:4800��	
	 * 5:9600��6:19200��7:38400��8:57600��9:115200
	 * \else
	 * ������;0:300��1:600��2:1200��3:2400��4:4800��	
	 * 5:9600��6:19200��7:38400��8:57600��9:115200
	 * \endif
	 */
	public byte				byBaudRate;
}
