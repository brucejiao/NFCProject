package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * External Alarm
 * \else
 * �ⲿ����
 * \endif
 */
public class SDK_ALARMIN_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm Type��
	 * <table>
	 * <tr><td>0</td><td>Normal Close</td></tr>
	 * <tr><td>1</td><td>Normal Open</td></tr>
	 * </table>
	 * \else
	 * ���������ͣ�
	 * <table>
	 * <tr><td>0</td><td>����</td></tr>
	 * <tr><td>1</td><td>����</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
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
	 * Process Mode
	 * \else
	 * ����ʽ
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
	
	public SDK_ALARMIN_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
