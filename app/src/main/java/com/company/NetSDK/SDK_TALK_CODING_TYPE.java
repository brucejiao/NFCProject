package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio encode type 
 * \else
 * ��������
 * \endif
 */
public class SDK_TALK_CODING_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * No-head PCM
	 * \else
	 * ��ͷPCM
	 * \endif
	 */
	public static final int 	SDK_TALK_DEFAULT = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * With head PCM
	 * \else
	 * ��ͷPCM
	 * \endif
	 */
	public static final int 	SDK_TALK_PCM = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * G711a
	 * \else
	 * G711a
	 * \endif
	 */
	public static final int 	SDK_TALK_G711a = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * AMR
	 * \else
	 * AMR
	 * \endif
	 */
	public static final int 	SDK_TALK_AMR = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * G711u
	 * \else
	 * G711u
	 * \endif
	 */
	public static final int 	SDK_TALK_G711u = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * G726
	 * \else
	 * G726
	 * \endif
	 */
	public static final int		SDK_TALK_G726 = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * G723_53
	 * \else
	 * G723_53
	 * \endif
	 */
	public static final int 	SDK_TALK_G723_53 = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * G723_63
	 * \else
	 * G723_63
	 * \endif
	 */
	public static final int 	SDK_TALK_G723_63 = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * AAC
	 * \else
	 * AAC
	 * \endif
	 */
	public static final int 	SDK_TALK_AAC = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * OGG
	 * \else
	 * OGG
	 * \endif
	 */
	public static final int 	SDK_TALK_OGG = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * ADPCM
	 * \else
	 * ADPCM
	 * \endif
	 */
	public static final int 	SDK_TALK_ADPCM = 21;
	
	/**
	 * \if ENGLISH_LANG
	 * MP3
	 * \else
	 * MP3
	 * \endif
	 */
	public static final int 	SDK_TALK_MP3   = 22;
}
