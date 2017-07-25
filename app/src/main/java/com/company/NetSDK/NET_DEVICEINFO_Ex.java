package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device extension info 
 * \else
 * �豸��Ϣ��չ
 * \endif
 */
public class NET_DEVICEINFO_Ex implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial number
	 * \else
	 * ���к�
	 * \endif
	 */
	public byte				sSerialNumber[] = new byte[FinalVar.SDK_SERIALNO_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Count of DVR alarm input
	 * \else
	 * DVR�����������
	 * \endif
	 */
	public int					nAlarmInPortNum;

	/**
	 * \if ENGLISH_LANG
	 * Count of DVR alarm output
	 * \else
	 * DVR�����������
	 * \endif
	 */
	public int					nAlarmOutPortNum;

	/**
	 * \if ENGLISH_LANG
	 * Number of DVR disk
	 * \else
	 * DVRӲ�̸���
	 * \endif
	 */
	public int					nDiskNum;

	/**
	 * \if ENGLISH_LANG
	 * DVR type, refer to DHDEV_DEVICE_TYPE
	 * \else
	 * DVR����, ��ö��NET_DEVICE_TYPE
	 * \endif
	 */
	public int					nDVRType;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of DVR channel
	 * \else
	 * DVRͨ������
	 * \endif
	 */
	public int					nChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * When online time out, it is 0 means no limit on login, non-o- means 0 limit
	 * \else
	 * ���߳�ʱʱ��,Ϊ0��ʾ�����Ƶ�½,��0��ʾ���Ƶķ�����
	 * \endif
	 */
	public byte                byLimitLoginTime;
	
	/**
	 * \if ENGLISH_LANG
	 * When login failed due to wrong password, it notify user via this parameter, remaining login times, as 0 means parameter invalid
	 * \else
	 * ����½ʧ��ԭ��Ϊ�������ʱ��ͨ���˲���֪ͨ�û���ʣ���½������Ϊ0ʱ��ʾ�˲�����Ч
	 * \endif
	 */
	public byte                byLeftLogTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * when log in failed��the left time for users to unlock (seconds), -1 indicate the device haven��t set the parameter 
	 * \else
	 * ����½ʧ�ܣ��û�����ʣ��ʱ�䣨������, -1��ʾ�豸δ���øò���
	 * \endif
	 */
	public int                 nLockLeftTime; 
}
