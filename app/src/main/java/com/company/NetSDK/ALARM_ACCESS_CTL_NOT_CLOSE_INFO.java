package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control Open Event Detail
 * \else
 * �Ž�δ���¼���ϸ��Ϣ
 * \endif
 */
public class ALARM_ACCESS_CTL_NOT_CLOSE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Door Channel No.
	 * \else
	 * ��ͨ����
	 * \endif
	 */
	public int             nDoor;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Name
	 * \else
	 * �Ž�����
	 * \endif
	 */
	public byte            szDoorName[] = new byte[FinalVar.SDK_MAX_DOORNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * �����¼�������ʱ��
	 * \endif
	 */
	public NET_TIME        stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:��ʼ 1:ֹͣ
	 * \endif
	 */
	public int             nAction;
}
