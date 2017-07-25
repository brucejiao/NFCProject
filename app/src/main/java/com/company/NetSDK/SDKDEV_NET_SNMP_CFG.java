package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * struct SNMP config struct
 * \else
 * SNMP���ýṹ
 * \endif
 */
public class SDKDEV_NET_SNMP_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SNMP enable
	 * \else
	 * SNMPʹ��
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SNMP port
	 * \else
	 * SNMP�˿�
	 * \endif
	 */
	public int                 iSNMPPort;

	/**
	 * \if ENGLISH_LANG
	 * read common
	 * \else
	 * ����ͬ��
	 * \endif
	 */
	public byte                szReadCommon[] = new byte[FinalVar.SDK_MAX_SNMP_COMMON_LEN];

	/**
	 * \if ENGLISH_LANG
	 * write common
	 * \else
	 * д��ͬ��
	 * \endif
	 */
	public byte                szWriteCommon[] = new byte[FinalVar.SDK_MAX_SNMP_COMMON_LEN];

	/**
	 * \if ENGLISH_LANG
	 * trap address
	 * \else
	 * trap��ַ
	 * \endif
	 */
	public byte                szTrapServer[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * trap port
	 * \else
	 * trap�˿�
	 * \endif
	 */
	public int                 iTrapPort;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V1 enable
	 * \else
	 * �豸�Ƿ���֧�ְ汾1��ʽ��0��ʹ�ܣ�1ʹ��
	 * \endif
	 */
	public byte                bSNMPV1;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V2 enable
	 * \else
	 * �豸�Ƿ���֧�ְ汾2��ʽ��0��ʹ�ܣ�1ʹ��
	 * \endif
	 */
	public byte                bSNMPV2;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V3 enable
	 * \else
	 * �豸�Ƿ���֧�ְ汾3��ʽ��0��ʹ�ܣ�1ʹ��
	 * \endif
	 */
	public byte                bSNMPV3;
}
