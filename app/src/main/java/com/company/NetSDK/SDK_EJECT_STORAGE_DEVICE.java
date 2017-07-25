package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * manual pop-up storage device, INetSDK.ControlDevice(SDK_CTRL_EJECT_STORAGE)
 * \else
 * �ֶ������洢�豸, INetSDK.ControlDevice(SDK_CTRL_EJECT_STORAGE)
 * \endif
 */
public class SDK_EJECT_STORAGE_DEVICE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * storage name
	 * \else
	 * �洢�豸����
	 * \endif
	 */
	public String				pszStorageName;
}
