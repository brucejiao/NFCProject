package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * (Message triggers wireless connection configuration)
 * \else
 * (���ż���������������)
 * \endif
 */
public class SDKDEV_SMSACTIVATION_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public int               dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * Sender amount
	 * \else
	 * ���ŷ����߸���
	 * \endif
	 */
	public int               dwSenderNum;

	/**
	 * \if ENGLISH_LANG
	 * Sender, normally the cellphone number
	 * \else
	 * ���ŷ����ߣ�һ��Ϊ�ֻ�����
	 * \endif
	 */
	public byte              SZSender[][] = new byte[FinalVar.SDK_MMS_SMSACTIVATION_NUM][32];
}
