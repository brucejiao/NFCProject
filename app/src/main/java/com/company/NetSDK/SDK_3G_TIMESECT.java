package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Time structure
 * \else
 * ʱ��νṹ 
 * \endif
 */
public class SDK_3G_TIMESECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Time period enable,1 shows this time period valid,0 shows invalid.
	 * \else
	 * ʱ���ʹ�ܣ�1��ʾ��ʱ�����Ч��0��ʾ��ʱ�����Ч��
	 * \endif
	 */
	public byte                bEnable; 
	public byte                bBeginHour;
	public byte                bBeginMin;
    public byte                bBeginSec;
    public byte                bEndHour;
    public byte                bEndMin;
    public byte                bEndSec;
}
