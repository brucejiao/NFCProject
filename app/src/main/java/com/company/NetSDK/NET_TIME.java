package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * class of time
 * \else
 * ʱ����
 * \endif
 */
public class NET_TIME implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * ��
	 * \endif
	 */
	public long				dwYear;
	
	/**
	 * \if ENGLISH_LANG
	 * Month
	 * \else
	 * ��
	 * \endif
	 */
	public long				dwMonth;
	
	/**
	 * \if ENGLISH_LANG
	 * Day
	 * \else
	 * ��
	 * \endif
	 */
	public long				dwDay;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour
	 * \else
	 * ʱ
	 * \endif
	 */
	public long				dwHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute
	 * \else
	 * ��
	 * \endif
	 */
	public long				dwMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Second
	 * \else
	 * ��
	 * \endif
	 */
	public long				dwSecond;
	
	public String toString() {
		 String time = String.format("%04d-%02d-%02d %02d:%02d:%02d", 
				 dwYear,dwMonth,dwDay,
				dwHour,dwMinute,dwSecond);
		 return time;
	 }
}
