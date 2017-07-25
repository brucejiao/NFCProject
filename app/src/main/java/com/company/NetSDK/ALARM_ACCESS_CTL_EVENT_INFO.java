package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control Event
 * \else
 * �Ž��¼�
 * \endif
 */
public class ALARM_ACCESS_CTL_EVENT_INFO implements Serializable {
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
	public int                         nDoor;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Name
	 * \else
	 * �Ž�����
	 * \endif
	 */
	public byte                        szDoorName[] = new byte[FinalVar.SDK_MAX_DOORNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * �����¼�������ʱ��
	 * \endif
	 */
	public NET_TIME                    stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Event Type
	 * \else
	 * �Ž��¼�����
	 * \endif
	 */
	public int                         emEventType;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Event Type
	 * \else
	 * ˢ�������TRUE��ʾ�ɹ���FALSE��ʾʧ��
	 * \endif
	 */
	public boolean                     bStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Type
	 * \else
	 * ������
	 * \endif
	 */
	public int                         emCardType;
	
	/**
	 * \if ENGLISH_LANG
	 * Unlock Method
	 * \else
	 * ���ŷ�ʽ
	 * \endif
	 */
	public int                         emOpenMethod;
	
	/**
	 * \if ENGLISH_LANG
	 * Card No.
	 * \else
	 * ����
	 * \endif
	 */
	public byte                        szCardNo[] = new byte[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
	public byte                        szPwd[] = new byte[FinalVar.SDK_MAX_CARDPWD_LEN];
}
