package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_LOST_FOCUS_CFG implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of alarm channels
	 * \else
	 * ����ͨ������
	 * \endif
	 */
	public int                 nAlarmChnNum;
	
    public SDK_LOST_FOCUS_CFG   stuLostFocus[] = new SDK_LOST_FOCUS_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    public ALARM_LOST_FOCUS_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM; i++) {
    		stuLostFocus[i] = new SDK_LOST_FOCUS_CFG();
    	}
    }
}
