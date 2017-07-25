package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Schedule record
 * \else
 * ��ʱ¼��
 * \endif
 */
public class SDKDEV_RECORD_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Schedule
	 * \else
	 * ʱ���
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Pre-record time. Unit is second. 0=Disable pre-record
	 * \else
	 * Ԥ¼ʱ�䣬��λ��s��0��ʾ��Ԥ¼
	 * \endif
	 */
	public byte                byPreRecordLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Record redundancy enable/disable
	 * \else
	 * ¼�����࿪��
	 * \endif
	 */
	public byte                byRedundancyEn;
	
	/**
	 * \if ENGLISH_LANG
	 * <table>
	 * <tr><td>Number</td><td>Record bit stream type</td></tr>
	 * <tr><td>0</td><td>Main bit stream</td></tr>
	 * <tr><td>1</td><td>Extra stream1</td></tr>
	 * <tr><td>2</td><td>Extra stream2</td></tr>
	 * <tr><td>3</td><td>Extra stream3</td></tr>
	 * </table>
	 * \else
	 * <table>
	 * <tr><td>��ֵ</td><td>¼����������</td></tr>
	 * <tr><td>0</td><td>������ </td></tr>
	 * <tr><td>1</td><td>������1</td></tr>
	 * <tr><td>2</td><td>������2</td></tr>
	 * <tr><td>3</td><td>������3</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byRecordType;                       // ¼���������ͣ�0-������ 1-������1 2-������2 3-������3
	
	public SDKDEV_RECORD_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
