package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK_FILE_QUERY_FACE Corresponding face recognition service search parameter
 * \else
 * SDK_FILE_QUERY_FACE��Ӧ������ʶ������ѯ����
 * \endif
 */
public class MEDIAFILE_FACERECOGNITION_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public NET_TIME            stStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * closing time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME            stEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Place to support fuzzy matching
	 * \else
	 * �ص㣬֧��ģ��ƥ��
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * To query the type of alarm, see EM_FACERECOGNITION_ALARM_TYPE
	 * \else
	 * ����ѯ�������ͣ���� EM_FACERECOGNITION_ALARM_TYPE
	 * \endif
	 */
	public int                 nAlarmType;

	/**
	 * \if ENGLISH_LANG
	 * staff info is valid or not
	 * \else
	 * ��Ա��Ϣ�Ƿ���Ч
	 * \endif
	 */
	public boolean                abPersonInfo;

	/**
	 * \if ENGLISH_LANG
	 * staff info
	 * \else
	 * ��Ա��Ϣ
	 * \endif
	 */
	public FACERECOGNITION_PERSON_INFO stPersonInfo = new FACERECOGNITION_PERSON_INFO();

	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                 nChannelId;

	/**
	 * \if ENGLISH_LANG
	 * staff group
	 * \else
	 * ��Ա����
	 * \endif
	 */
	public int                 nGroupIdNum;

	/**
	 * \if ENGLISH_LANG
	 * staff group ID
	 * \else
	 * ��Ա��ID
	 * \endif
	 */
	public byte                szGroupId[][] = new byte[FinalVar.MAX_GOURP_NUM][FinalVar.SDK_COMMON_STRING_64];
}
