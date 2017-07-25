package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Schedule Information
 * \else
 * ʱ�����Ϣ
 * \endif
 */
public class CFG_TIME_SCHEDULE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * whether holiday config is enabled, default value is FALSE, DO NOT enable it unless you get TRUE after get config
	 * \else
	 * �Ƿ�֧�ֽڼ������ã�Ĭ��Ϊ��֧�֣����ǻ�ȡ���ú󷵻�ΪTRUE����Ҫʹ�ܼ�������
	 * \endif
	 */
    public boolean                bEnableHoliday;
    
    /**
     * \if ENGLISH_LANG
     * The First Dimension Before the 7 Elements Corresponding 7 Days a week?��?Eighth Elements Corresponding Holiday Up to Six Time Periods Per Day
     * \else
     * ��һάǰ7��Ԫ�ض�Ӧÿ��7�죬��8��Ԫ�ض�Ӧ�ڼ��գ�ÿ�����6��ʱ���
     * \endif
     */
	public CFG_TIME_SECTION[][]	  stuTimeSection = new CFG_TIME_SECTION[FinalVar.MAX_TIME_SCHEDULE_NUM][FinalVar.MAX_REC_TSECT]; 

	public CFG_TIME_SCHEDULE() {
		for(int i = 0 ; i < FinalVar.MAX_TIME_SCHEDULE_NUM; i ++) {
			for(int j = 0; j < FinalVar.MAX_REC_TSECT; j ++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
