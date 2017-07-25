package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Vehicle detector redundancy info
 * \else
 * ������������Ϣ
 * \endif
 */
public class SDK_SIG_CARWAY_INFO_EX implements Serializable {	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The vehicle detector generates the snap signal redundancy info
	 * \else
	 * �ɳ���������ץ���ź�������Ϣ
	 * \endif
	 */
	public byte                byRedundance[] = new byte[8];                
}
