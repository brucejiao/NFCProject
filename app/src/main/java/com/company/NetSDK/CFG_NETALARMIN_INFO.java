package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Output Network Alarm Configuration
 * \else
 * ���籨������
 * \endif
 */
public class CFG_NETALARMIN_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Id(from 0) 
	 * \else
	 * ����ͨ����(0��ʼ)
	 * \endif
	 */
	public int					nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ�ܿ���
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Name 
	 * \else
	 * ����ͨ������
	 * \endif
	 */
	public byte[]				szChnName = new byte[FinalVar.MAX_CHANNELNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Type,1:"NO",0: "NC" 
	 * \else
	 * ���������ͣ�0�����գ�1������
	 * \endif
	 */
	public int					nAlarmType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Handler
	 * \else
	 * ��������
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Respind Time
	 * \else
	 * �¼���Ӧʱ���
	 * \endif
	 */
	public CFG_TIME_SECTION[][]		stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];
	
	public CFG_NETALARMIN_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
