package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Status Changes Alarm Info
 * \else
 * ¼��״̬�仯������Ϣ
 * \endif
 */
public class ALARM_RECORDING_CHANGED implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Record Channel No.
	 * \else
	 * ¼��ͨ����
	 * \endif
	 */
	public int                 nChannel;                
}
