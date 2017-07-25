package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SIP Status Changes Alarm
 * \else
 * SIP״̬�ı䱨��
 * \endif
 */
public class ALARM_SIP_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No. 
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int     nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Registration Succeed,1:Not Registered,2:Invalid,3:Registering,4:Communicating 
	 * \else
	 * 0:ע��ɹ�,1:δע��,2:��Ч,3:ע����,4:ͨ����
	 * \endif
	 */
	public byte    byStatus;                         
}
