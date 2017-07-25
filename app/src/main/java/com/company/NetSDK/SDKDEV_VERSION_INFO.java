package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device software version information. Corresponding to QueryDevState
 * \else
 * �豸����汾��Ϣ����Ӧ QueryDevState�ӿ�
 * \endif
 */
public class SDKDEV_VERSION_INFO implements Serializable {
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
	public byte				szDevSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type. See enumeration NET_DEVICE_TYPE. Please refer to SDKDEV_SYSTEM_ATTR_CFG 
	 * \else
	 * �豸���ͣ���ö�� NET_DEVICE_TYPE,�μ� SDKDEV_SYSTEM_ATTR_CFG 
	 * \endif
	 */
	public byte				byDevType;
	
	/**
	 * \if ENGLISH_LANG
	 * Device detailed type. String format. It may bu null.
	 * \else
	 * �豸��ϸ�ͺţ��ַ�����ʽ������Ϊ��
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol version No. 
	 * \else
	 * Э��汾��
	 * \endif
	 */
	public int				nProtocalVer;
	
	/**
	 * \if ENGLISH_LANG
	 * Software version 
	 * \else
	 * ����汾 
	 * \endif
	 */
	public byte				szSoftWareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Software version build date 
	 * \else
	 * ����汾��������
	 * \endif
	 */
	public int				dwSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp software version 
	 * \else
	 * ��Ƭ�汾��Ϣ���ַ�����ʽ������Ϊ��
	 * \endif
	 */
	public byte				szPeripheralSoftwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp software version build date 
	 * \else
	 * ��Ƭ�汾��������
	 * \endif
	 */
	public int				dwPeripheralSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Not in use now 
	 * \else
	 * ������Ϣ��λоƬ�汾��Ϣ���ַ�����ʽ������Ϊ��
	 * \endif
	 */
	public byte				szGeographySoftwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ������Ϣ��λоƬ�汾��������
	 * \endif
	 */
	public int				dwGeographySoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Hadrware version 
	 * \else
	 * Ӳ���汾
	 * \endif
	 */
	public byte				szHardwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Not in use now 
	 * \else
	 * ����û��ʹ�� 
	 * \endif
	 */
	public int				dwHardwareDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version 
	 * \else
	 * web�汾 
	 * \endif
	 */
	public byte				szWebVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Web version build date 
	 * \else
	 * web�汾�������� 
	 * \endif
	 */
	public int				dwWebBuildDate;
}
