package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Time period structure 
 * \else
 * ʱ��νṹ	
 * \endif
 */
public class SDK_TSECT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Current record period . Bit means the four Enable functions. From the low bit to the high bit:Motion detection record, alarm record and general record, when Motion detection and alarm happened at the same time can record.
	 * \else
	 * ����ʾ¼��ʱ���ʱ����λ��ʾ�ĸ�ʹ�ܣ��ӵ�λ����λ�ֱ��ʾ����¼�󡢱���¼����ͨ¼�󡢶���ͱ���ͬʱ������¼��
	 * \endif
	 */
	public int     				bEnable;				
	public int					iBeginHour;
	public int					iBeginMin;
	public int					iBeginSec;
	public int					iEndHour;
	public int					iEndMin;
	public int					iEndSec;
}
