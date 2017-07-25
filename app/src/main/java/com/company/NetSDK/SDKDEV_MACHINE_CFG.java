package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device relative configuration
 * \else
 * ������ص�����
 * \endif
 */
public class SDKDEV_MACHINE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device name or SN 
	 * \else
	 * �������ƻ���
	 * \endif
	 */
	public byte                szMachineName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Device location
	 * \else
	 * ��������ص�
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM]; 
}
