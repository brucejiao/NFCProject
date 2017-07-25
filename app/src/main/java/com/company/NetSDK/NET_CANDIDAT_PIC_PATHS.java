package com.company.NetSDK;

import java.io.Serializable;

public class NET_CANDIDAT_PIC_PATHS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * actual file amount
	 * \else
	 * ʵ���ļ�����
	 * \endif
	 */
	public int                  nFileCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * file information
	 * \else
	 * �ļ���Ϣ
	 * \endif
	 */
	public SDK_PIC_INFO_EX       stFiles[] = new SDK_PIC_INFO_EX[FinalVar.SDK_MAX_PERSON_IMAGE_NUM];
	
	public NET_CANDIDAT_PIC_PATHS() {
		for (int i = 0; i < FinalVar.SDK_MAX_PERSON_IMAGE_NUM; i++) {
			stFiles[i] = new SDK_PIC_INFO_EX();
		}
	}
}
