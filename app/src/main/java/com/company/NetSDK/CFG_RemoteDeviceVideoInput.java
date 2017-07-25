package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input channel
 * \else
 * ��Ƶ����ͨ��
 * \endif
 */
public class CFG_RemoteDeviceVideoInput implements Serializable {
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
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device name 
	 * \else
	 * �豸���� 
	 * \endif
	 */
	public byte[]			szName = new byte[FinalVar.MAX_DEVICE_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Control ID 
	 * \else
	 * ����ID 
	 * \endif
	 */
	public byte[]			szControlID = new byte[FinalVar.MAX_DEV_ID_LEN_EX];
	
 	/**
	 * \if ENGLISH_LANG
	 * Main stream url address
	 * \else
	 * ������url��ַ
	 * \endif
	 */
	public byte[]			szMainUrl = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * Sub stream url address
	 * \else
	 * ������url��ַ 
	 * \endif
	 */
	public byte[]			szExtraUrl = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * Server type, 0-TCP, 1-UDP, 2-MCAST, -1-AUTO
	 * \else
	 * ��������, 0-TCP, 1-UDP, 2-MCAST, -1-AUTO
	 * \endif
	 */
	public int				nServiceType;
}