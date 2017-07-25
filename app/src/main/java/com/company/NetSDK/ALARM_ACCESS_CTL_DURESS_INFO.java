package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Threat Card Swiping Event Detail
 * \else
 * в�ȿ�ˢ���¼���ϸ��Ϣ
 * \endif
 */
public class ALARM_ACCESS_CTL_DURESS_INFO implements Serializable {
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
	 * Threat Card No.
	 * \else
	 * в�ȿ���
	 * \endif
	 */
	public byte            szCardNo[] = new byte[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * �����¼�������ʱ��
	 * \endif
	 */
	public NET_TIME        stuTime = new NET_TIME();
}
