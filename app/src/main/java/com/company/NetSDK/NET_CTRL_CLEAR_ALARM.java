package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param: SDK_CTRL_CLEAR_ALARM
 * \else
 * INetSDK.ControlDevice�ӿڵ� SDK_CTRL_CLEAR_ALARM �������
 * \endif
 */
public class NET_CTRL_CLEAR_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Defence Area's ID
	 * \else
	 * ����ͨ����
	 * \endif
	 */
	public int		nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event Type
	 * \else
	 * �¼�����
	 * \endif
	 */
	public int		emAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Landing Equipment Such As Password, Do not Use Encryption Disappear the Police, Direct Assignment of NULL
	 * \else
	 * ��½�豸������,�粻ʹ�ü�������,ֱ�Ӹ�ֵΪNULL
	 * \endif
	 */
	public String	szDevPwd;
}
