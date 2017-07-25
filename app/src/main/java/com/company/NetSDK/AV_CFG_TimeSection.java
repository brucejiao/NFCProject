package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Period
 * \else
 * ʱ���
 * \endif
 */
public class AV_CFG_TimeSection implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Sub Mask
	 * \else
	 * ����
	 * \endif
	 */
	public int			nMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin hour
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public int			nBeginHour;
	
	public int			nBeginMinute;
	
	public int			nBeginSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * End hour
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public int			nEndHour;
	
	public int			nEndMinute;
	
	public int			nEndSecond;
}
