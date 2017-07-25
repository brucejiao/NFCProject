package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param: SDK_CTRL_SET_BYPASS 
 * \else
 * INetSDK.ControlDevice�ӿڵ� SDK_CTRL_SET_BYPASS �������
 * \endif
 */
public class NET_CTRL_SET_BYPASS implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Login Device Password
	 * \else
	 * �����豸������
	 * \endif
	 */
	public String				szDevPwd; 
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Statue, NET_BYPASS_MODE
	 * \else
	 * ͨ��״̬, NET_BYPASS_MODE
	 * \endif
	 */
	public int					emMode; 
	
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channnel Number
	 * \else
	 * ���ر�������ͨ������
	 * \endif
	 */
	public int					nLocalCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channnel ID 
	 * \else
	 * ���ر�������ͨ����
	 * \endif
	 */
	public int					pnLocal[]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel Number
	 * \else
	 * ��չģ�鱨������ͨ������
	 * \endif
	 */
	public int					nExtendedCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel ID
	 * \else
	 * ��չģ�鱨������ͨ����
	 * \endif
	 */
	public int					pnExtended[]; 
}
