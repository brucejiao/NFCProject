package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * External alarm expansion
 * \else
 * �ⲿ������չ
 * \endif
 */
public class SDK_ALARMIN_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm type,0:normal closed,1:normal open
	 * \else
	 * ���������ͣ�0�����գ�1������
	 * \endif
	 */
	public byte                byAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm enable
	 * \else
	 * ����ʹ��
	 * \endif
	 */
	public byte                byAlarmEn;
	
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
	public SDK_MSG_HANDLE_EX       struHandle = new SDK_MSG_HANDLE_EX();
	
	public SDK_ALARMIN_CFG_EX() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
