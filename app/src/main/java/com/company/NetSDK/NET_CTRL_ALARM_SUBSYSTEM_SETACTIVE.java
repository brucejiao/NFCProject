package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm sub system activation setup parameter(corresponding SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET command)
 * \else
 * ������ϵͳ�������ò���(��ӦSDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET����)
 * \endif
 */
public class NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * sub system no.
	 * \else
	 * ��ϵͳ��
	 * \endif
	 */
	public int					nChannelId;
	
	/**
	 * \if ENGLISH_LANG
	 * sub system enable status ,TRUE means enable, FALSE means disable
	 * \else
	 * ��ϵͳ����״̬,TRUE ��ʾ����,FALSE��ʾ������
	 * \endif
	 */
	public boolean 				bActive; 
}
