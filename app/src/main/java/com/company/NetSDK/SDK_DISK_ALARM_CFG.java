package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Disk Alarm Information
 * \else
 * Ӳ����Ϣ(�ڲ�����)
 * \endif
 */
public class SDK_DISK_ALARM_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * No Disck Alarm
	 * \else
	 * ��Ӳ��ʱ����
	 * \endif
	 */
	public byte                byNoDiskEn;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public SDK_TSECT            stNDSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Process Mode
	 * \else
	 * ����ʽ
	 * \endif
	 */
	public SDK_MSG_HANDLE       struNDHandle = new SDK_MSG_HANDLE();
	
	/**
	 * \if ENGLISH_LANG
	 * Low space Alarm
	 * \else
	 * Ӳ�̵�����ʱ����
	 * \endif
	 */
    public byte                byLowCapEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Lower Limit,0-99
	 * \else
	 * ������ֵ��0-99
	 * \endif
	 */
    public byte                byLowerLimit;
    
    /**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
    public SDK_TSECT            stLCSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
    
    /**
	 * \if ENGLISH_LANG
	 * Process Mode
	 * \else
	 * ����ʽ
	 * \endif
	 */
    public SDK_MSG_HANDLE       struLCHandle = new SDK_MSG_HANDLE();
    
    /**
	 * \if ENGLISH_LANG
	 * Disk Error Alarm
	 * \else
	 * Ӳ�̹��ϱ���
	 * \endif
	 */
    public byte                byDiskErrEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Disk number
	 * \else
	 * Ӳ�̸���
	 * \endif
	 */
    public byte                bDiskNum;
    
    /**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
    public SDK_TSECT            stEDSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
    
    /**
	 * \if ENGLISH_LANG
	 * Process Mode
	 * \else
	 * ����ʽ
	 * \endif
	 */
    public SDK_MSG_HANDLE       struEDHandle = new SDK_MSG_HANDLE();
    
    public SDK_DISK_ALARM_CFG() {
    	for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stNDSect[i][j] = new SDK_TSECT();
				stLCSect[i][j] = new SDK_TSECT();
				stEDSect[i][j] = new SDK_TSECT();
			}
		}
    }
}
