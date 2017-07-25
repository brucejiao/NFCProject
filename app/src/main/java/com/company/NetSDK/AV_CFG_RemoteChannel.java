package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Channel Structure
 * \else
 * Զ��ͨ��
 * \endif
 */
public class AV_CFG_RemoteChannel implements Serializable {
	
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
	public boolean		bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device ID 
	 * \else
	 * �豸ID
	 * \endif
	 */
	public byte[]		szDeviceID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel No. 
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int			nChannel;
}

