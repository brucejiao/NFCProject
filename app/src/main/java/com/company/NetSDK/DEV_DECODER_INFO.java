package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Decoder information
 * \else
 * ���ӵı�������Ϣ
 * \endif
 */
public class DEV_DECODER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type
	 * \else
	 * ����
	 * \endif
	 */
	public byte			szDecType[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * TV number
	 * \else
	 * TV����
	 * \endif
	 */
	public int				nMonitorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel number
	 * \else
	 * ����ͨ������
	 * \endif
	 */
	public int				nEncoderNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported by a number of TV screen partition
	 * \else
	 * ֧�ֵ�TV����ָ�������������ʽ��ʾ��0Ϊ��β
	 * \endif
	 */
	public byte			szSplitMode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * TV enable
	 * \else
	 * ��TVʹ��
	 * \endif
	 */
	public byte            bMonitorEnable[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * TV tip display enable 0:not support 1:support.
	 * \else
	 * ָʾ�Ƿ�֧��TV��ʾ��Ϣ��������, 0:��֧�� 1:֧��.
	 * \endif
	 */
	public byte            bTVTipDisplay;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ������ͨ����ʾ������Ϣʹ��
	 * \endif
	 */
	public byte            byLayoutEnable[] = new byte[48];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ������ͨ����ʾ������Ϣʹ������,�ӵ�λ����λ֧��64��ͨ��,����dwLayoutEnMask[0]�ǵ�32λ
	 * \endif
	 */
	public int           	dwLayoutEnMask[] = new int[2];
}
