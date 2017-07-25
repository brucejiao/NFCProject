package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Abnormal record alarm
 * \else
 * ¼���쳣����
 * \endif
 */
public class ALARM_RECORD_FAILED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:��ʼ 1:ֹͣ
	 * \endif
	 */
	public int                  nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel no
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                  nIndex;
}
