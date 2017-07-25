package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activate device to snapshot overlay card number information, INetSDK.ControlDevice(SDK_CTRL_CAPTURE_START)
 * \else
 * �����豸ץͼ�����ӿ�����Ϣ, INetSDK.ControlDevice(SDK_CTRL_CAPTURE_START)
 * \endif
 */
public class NET_SNAP_COMMANDINFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Card information
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public byte				szCardInfo[] 	= new byte[16];
}
