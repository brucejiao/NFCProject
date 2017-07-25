package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.QueryDevInfo , NET_QUERY_DEV_REMOTE_DEVICE_INFO inquire  the input parameters of remote device information 
 * \else
 * INetSDK.QueryDevInfo , NET_QUERY_DEV_REMOTE_DEVICE_INFO ��ѯԶ���豸��Ϣ�������
 * \endif
 */
public class NET_IN_GET_DEVICE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * �豸ID
	 * \endif
	 */
	public byte                        szDevice[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * device address
	 * \else
	 * �豸��ַ
	 * \endif
	 */
	public byte                        szAttributeIP[] = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * device port
	 * \else
	 * �豸�˿�
	 * \endif
	 */
	public int                         nAttributePort;

	/**
	 * \if ENGLISH_LANG
	 * user name
	 * \else
	 * �û���
	 * \endif
	 */
	public byte                        szAttributeUsername[] = new byte[FinalVar.SDK_COMMON_STRING_128];

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * ����
	 * \endif
	 */
	public byte                        szAttributePassword[] = new byte[FinalVar.SDK_COMMON_STRING_128];

	/**
	 * \if ENGLISH_LANG
	 * manufacturer protocl
	 * \else
	 * ����Э��
	 * \endif
	 */
	public byte                        szAttributeManufacturer[] = new byte[FinalVar.SDK_COMMON_STRING_128];
}
