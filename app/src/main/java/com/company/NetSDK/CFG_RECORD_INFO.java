package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Configuration
 * \else
 * ��ʱ¼��������Ϣ
 * \endif
 */
public class CFG_RECORD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID(from 0) 
	 * \else
	 * ͨ����(0��ʼ)
	 * \endif
	 */
	public int                 	nChannelID;					

	/**
	 * \if ENGLISH_LANG
	 * Time Section 
	 * \else
	 * ʱ���
	 * \endif
	 */
	public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT]; 

	/**
	 * \if ENGLISH_LANG
	 * Prerecord Time��(0~300) 0 means closed
	 * \else
	 * Ԥ¼ʱ�䣬Ϊ��ʱ��ʾ�ر�(0~300)
	 * \endif
	 */
	public int					nPreRecTime;				

	/**
	 * \if ENGLISH_LANG
	 * Prerecord Time��(0~300) 0 means closed 
	 * \else
	 * ¼�����࿪��
	 * \endif
	 */
	public boolean				bRedundancyEn;				

	/**
	 * \if ENGLISH_LANG
	 * Stream Types;
	 * <pre>
	 * Value Stream Type 
	 * 0 Main Stream 
	 * 1 Auxiliary Stream 1 
	 * 2 Auxiliary Stream 2 
	 * 3 Auxiliary Stream 3 
	 * </pre>
	 * \else
	 * 0����������1��������1��2��������2��3��������3
	 * \endif
	 */
	public int					nStreamType;				

	/**
	 * \if ENGLISH_LANG
	 * Protocol Version, Read-Only 
	 * \else
	 * Э��汾��, ֻ��
	 * \endif
	 */
	public int					nProtocolVer;				

	/**
	 * \if ENGLISH_LANG
	 * as true, holiday config info��bHolidayEn, only stuHolTimeSection valid;
	 * \else
	 * Ϊtrueʱ�м���������Ϣ��bHolidayEn��stuHolTimeSection����Ч;
	 * \endif
	 */
	public boolean				abHolidaySchedule;          
	/**
	 * \if ENGLISH_LANG
	 * Holiday record enable TRUE: enable,FALSE:disable
	 * \else
	 * ����¼��ʹ��TRUE:ʹ��,FALSE:δʹ��
	 * \endif
	 */
	public boolean              bHolidayEn;                 

	/**
	 * \if ENGLISH_LANG
	 * Holiday record schedule
	 * \else
	 * ����¼��ʱ���
	 * \endif
	 */
	public CFG_TIME_SECTION    	stuHolTimeSection[] = new CFG_TIME_SECTION[FinalVar.MAX_REC_TSECT];          
	
	public CFG_RECORD_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
		
		for (int i = 0; i < FinalVar.MAX_REC_TSECT; i++) {
			stuHolTimeSection[i] = new CFG_TIME_SECTION();
		}
	}
}
