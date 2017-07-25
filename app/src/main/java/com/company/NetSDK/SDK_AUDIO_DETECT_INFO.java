package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New audio detection alarm setup 
 * \else
 * ����Ƶ��ⱨ������
 * \endif
 */
public class SDK_AUDIO_DETECT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable alarm input 
	 * \else
	 * ��������ʹ��
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * Min volume
	 * \else
	 * ��������Сֵ
	 * \endif
	 */
	public int                 Volume_min; 
	
	/**
	 * \if ENGLISH_LANG
	 * Max volume
	 * \else
	 * ���������ֵ
	 * \endif
	 */
	public int                 Volume_max; 
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Process way 
	 * \else
	 * ����ʽ
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE(); 
	
	public SDK_AUDIO_DETECT_INFO() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
