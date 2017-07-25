package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record state of everyday in one month
 * \else
 * ĳ�µĸ����Ƿ����¼���״̬��Ϣ
 * \endif
 */
public class NET_RECORD_STATUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Has record this day 0-no, 1-yes
	 * \else
	 * ĳ���ڵĸ����Ƿ����¼���״̬���룬0��ʾû�У�1��ʾ�С�
	 * \endif
	 */
	public byte 	 		   flag[] = new byte[32];
}
