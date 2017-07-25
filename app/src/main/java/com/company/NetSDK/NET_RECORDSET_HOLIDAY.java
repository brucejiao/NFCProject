package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Holiday Record Iinformation
 * \else
 * ���ռ�¼����Ϣ
 * \endif
 */
public class NET_RECORDSET_HOLIDAY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number,Read-Only
	 * \else
	 * ��¼����ţ�ֻ��
	 * \endif
	 */
	public int             nRecNo;

	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * ��Ч�ĵ�����Ŀ
	 * \endif
	 */
	public int             nDoorNum;

	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript
	 * \else
	 * ��Ȩ�޵�����ţ���CFG_CMD_ACCESS_EVENT����CFG_ACCESS_EVENT_INFO�������±�
	 * \endif
	 */
	public int             sznDoors[] = new int[FinalVar.SDK_MAX_DOOR_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Start Time
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public NET_TIME        stuStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * End Time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME        stuEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Holiday Ennable
	 * \else
	 * ����ʹ��
	 * \endif
	 */
	public boolean            bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Holiday No
	 * \else
	 * ���ڱ��
	 * \endif
	 */
	public byte            szHolidayNo[] = new byte[FinalVar.SDK_COMMON_STRING_32];
}
