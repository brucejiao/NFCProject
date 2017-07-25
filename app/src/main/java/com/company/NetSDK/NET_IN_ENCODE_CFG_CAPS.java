package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get device encode config corresponding capacity input parameter
 * \else
 * ��ȡ�豸�������ö�Ӧ�����������
 * \endif
 */
public class NET_IN_ENCODE_CFG_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                 nChannelId; 
	
	/**
	 * \if ENGLISH_LANG
	 * stream type��0��main stream��1��sub stream1��2��sub stream2��3��sub stream3��4��snapshot stream
	 * can be left unset, whatever value it is set, you get results of main stream, sub stream1 and snapshot stream
	 * \else
	 * �������ͣ�0����������1��������1��2��������2��3��������3��4��ץͼ����
	 * �˲������Բ������ָ��ʲô���ͣ��豸��������������ץͼ����������
	 * \endif
	 */
	public int                 nStreamType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Encode config��cia calling dhconfigsdk.dll port CLIENT_PacketData to get
	 * correspondingsampling command is CFG_CMD_ENCODE
	 * \else
	 * Encode���ã�ͨ������dhconfigsdk.dll�нӿ�CLIENT_PacketData��װ�õ�
	 * ��Ӧ�ķ�װ����Ϊ CFG_CMD_ENCODE 
	 * \endif
	 */
	public byte                pchEncodeJson[];
}
