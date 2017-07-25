package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Motion detection alarm
 * \else
 * ��̬��ⱨ��
 * \endif
 */
public class SDK_MOTION_DETECT_CFG_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection alarm enabling
	 * \else
	 * ��̬��ⱨ��ʹ��
	 * \endif
	 */
	public byte                byMotionEn;

	/**
	 * \if ENGLISH_LANG
	 * Sensitivity
	 * \else
	 * ������
	 * \endif
	 */
	public short                wSenseLevel;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection area rows
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public short                wMotionRow;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection area lines
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public short                wMotionCol;
	
	/**
	 * \if ENGLISH_LANG
	 * Motion detection area,most 32*32
	 * \else
	 * ����������32*32������
	 * \endif
	 */
    public byte                byDetected[][] = new byte[FinalVar.SDK_MOTION_ROW][FinalVar.SDK_MOTION_COL];
    
    /**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
    public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
    
    /**
	 * \if ENGLISH_LANG
	 * Handle method
	 * \else
	 * ����ʽ
	 * \endif
	 */
    public SDK_MSG_HANDLE_EX        struHandle = new SDK_MSG_HANDLE_EX();
    
    public SDK_MOTION_DETECT_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
    			stSect[i][j] = new SDK_TSECT();
    		}
    	}
    }
}
