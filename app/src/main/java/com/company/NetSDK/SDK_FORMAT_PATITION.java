package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * format the partition information, INetSDK.ControlDevice(SDK_CTRL_FORMAT_PATITION)
 * \else
 * ��ʽ��������Ϣ, INetSDK.ControlDevice(SDK_CTRL_FORMAT_PATITION)
 * \endif
 */
public class SDK_FORMAT_PATITION implements Serializable {
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
	public String		pszStorageName; 
	
	/**
	 * \if ENGLISH_LANG
	 * partition name
	 * \else
	 * ������
	 * \endif
	 */
	public String		pszPatitionName; 
}
