package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * (Dailing triggers the wireless connection)
 * \else
 * (���ż���������������)
 * \endif
 */
public class SDKDEV_DIALINACTIVATION_CFG implements Serializable {
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
	 * �����߸���
	 * \endif
	 */
	public int               dwCallerNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Sender, normally the cellphone
	 * \else
	 * ������, һ��Ϊ�ֻ�����
	 * \endif
	 */
	public byte              SZCaller[][] = new byte[FinalVar.SDK_MMS_DIALINACTIVATION_NUM][32];
}
