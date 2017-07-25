package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * �������طſ�������
 * \endif
 */
public class DEC_CTRL_PLAYBACK_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Drag
	 * \else
	 * �϶�
	 * \endif
	 */
	public static final int     Dec_Playback_Seek = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Play
	 * \else
	 * ����
	 * \endif
	 */
	public static final int     Dec_Playback_Play = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Pause
	 * \else
	 * ��ͣ
	 * \endif
	 */
	public static final int     Dec_Playback_Pause = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop
	 * \else
	 * ֹͣ
	 * \endif
	 */
	public static final int     Dec_Playback_Stop = 3;
}
