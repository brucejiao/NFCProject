package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video wall output channel info
 * \else
 * ����ǽ
 * \endif
 */
public class AV_CFG_MonitorWallTVOut implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID. It is "null" or "Local"(local device)
	 * \else
	 * �豸ID, Ϊ�ջ�"Local"��ʾ�����豸
	 * \endif
	 */
	public byte[]			szDeviceID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * ͨ��ID
	 * \endif
	 */
	public int		nChannelID; 
	
	/**
	 * \if ENGLISH_LANG
	 * Screen name
	 * \else
	 * ��Ļ����
	 * \endif
	 */
	public byte[]			szName = new byte[FinalVar.AV_CFG_Channel_Name_Len];

}
