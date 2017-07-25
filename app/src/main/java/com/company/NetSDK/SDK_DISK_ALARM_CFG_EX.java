package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * HDD info(alarm)
 * \else
 * Ӳ����Ϣ(�ڲ�����)
 * \endif
 */
public class SDK_DISK_ALARM_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * No HDD alarm
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
	 * Handle method
	 * \else
	 * ����ʽ
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX    struNDHandle = new SDK_MSG_HANDLE_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Low capacity alarm
	 * \else
	 * Ӳ�̵�����ʱ����
	 * \endif
	 */
    public byte                byLowCapEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Lower limit,0-99
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
	 * Handle method
	 * \else
	 * ����ʽ
	 * \endif
	 */
    public SDK_MSG_HANDLE_EX    struLCHandle = new SDK_MSG_HANDLE_EX();
    
    /**
	 * \if ENGLISH_LANG
	 * HDD error alarm
	 * \else
	 * Ӳ�̹��ϱ���
	 * \endif
	 */
    public byte                byDiskErrEn;
    
    /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
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
	 * Handle method
	 * \else
	 * ����ʽ
	 * \endif
	 */
    public SDK_MSG_HANDLE_EX    struEDHandle = new SDK_MSG_HANDLE_EX();
    
    public SDK_DISK_ALARM_CFG_EX() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stNDSect[i][j] = new SDK_TSECT();
				stLCSect[i][j] = new SDK_TSECT();
				stEDSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
