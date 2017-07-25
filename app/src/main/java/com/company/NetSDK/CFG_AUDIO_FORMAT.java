package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio Format
 * \else
 * ��Ƶ����ģʽ
 * \endif
 */
public class CFG_AUDIO_FORMAT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * G711a
	 * \else
	 * G711a
	 * \endif
	 */
	public static final int AUDIO_FORMAT_G711A = 0;                              

	/**
	 * \if ENGLISH_LANG
	 * PCM
	 * \else
	 * PCM
	 * \endif
	 */
	public static final int AUDIO_FORMAT_PCM = 1;                                

	/**
	 * \if ENGLISH_LANG
	 * G711u
	 * \else
	 * G711u
	 * \endif
	 */
	public static final int AUDIO_FORMAT_G711U = 2;                              

	/**
	 * \if ENGLISH_LANG
	 * AMR
	 * \else
	 * AMR
	 * \endif
	 */
	public static final int AUDIO_FORMAT_AMR = 3;                                

	/**
	 * \if ENGLISH_LANG
	 * AAC
	 * \else
	 * AAC
	 * \endif
	 */
	public static final int AUDIO_FORMAT_AAC = 4;                                
}
