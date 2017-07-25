package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 485 Decoder Configuration
 * \else
 * 485����������
 * \endif
 */
public class SDK_485_CFG implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Com Attributes
	 * \else
	 * ��������
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type,corresponding to the subscriptof "Protocol List(Refer to SDKDEV_COMM_CFG)
	 * \else
	 * Э�����ͣ���Ӧ"Э�����б�(�ο�SDKDEV_COMM_CFG)�±�
	 * \endif
	 */
	public byte                wProtocol;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-Compatible,local PTZ 1-Remote network PTZ(DEV_ENCODER_CFG) 
	 * \else
	 * 0-���ݣ�������̨ 1-Զ��������̨,ͨ��������ѯ(DEV_ENCODER_CFG) 
	 * \endif
	 */
	public byte                bPTZType;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder Address��0 - 255
	 * \else
	 * ��������ַ��0 - 255 
	 * \endif
	 */
	public byte                wDecoderAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Martix ID
	 * \else
	 * �����
	 * \endif
	 */
	public byte                byMartixID;
}
