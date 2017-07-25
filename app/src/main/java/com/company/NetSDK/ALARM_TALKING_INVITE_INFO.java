package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Event Type SDK_ALARM_TALKING_INVITE(Device request talk event)Corresponding Data Description Info
 * \else
 * �����¼�����SDK_ALARM_TALKING_INVITE(�豸����Է�����Խ��¼�)��Ӧ������������Ϣ
 * \endif
 */
public class ALARM_TALKING_INVITE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device Expected Talk Start Party
	 * \else
	 * �豸ϣ���ĶԽ�����
	 * \endif
	 */
	public int                  emCaller;
	
	/**
	 * \if ENGLISH_LANG
	 * Event Trigger Time
	 * \else
	 * �¼�����ʱ��
	 * \endif
	 */
	public NET_TIME             stuTime = new NET_TIME();
}
