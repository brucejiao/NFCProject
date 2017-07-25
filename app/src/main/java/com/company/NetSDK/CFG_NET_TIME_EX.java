package com.company.NetSDK;

import java.io.Serializable;

public class CFG_NET_TIME_EX implements Serializable {
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
	public int				dwYear;
	
 	/**
	 * \if ENGLISH_LANG
	 * Month 
	 * \else
	 * ��
	 * \endif
	 */
	public int				dwMonth;
	
 	/**
	 * \if ENGLISH_LANG
	 * Day 
	 * \else
	 * ��
	 * \endif
	 */
	public int				dwDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * Hour
	 * \else
	 * ʱ
	 * \endif
	 */
	public int				dwHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * Minute 
	 * \else
	 * ��
	 * \endif
	 */
	public int				dwMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * Second 
	 * \else
	 * ��
	 * \endif
	 */
	public int				dwSecond;
	
 	/**
	 * \if ENGLISH_LANG
	 * Millisecond
	 * \else
	 * ����
	 * \endif
	 */
	public int             dwMillisecond;
}