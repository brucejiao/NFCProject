package com.company.NetSDK;

import java.io.Serializable;


public class SDK_FTP_UPLOAD_CFG_INNER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable invalid
	 * \else
	 * ��ʱ����ڵġ�ʹ�ܡ���Ч���ɺ���
	 * \endif
	 */
	public SDK_TSECT        struSect = new SDK_TSECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Motion Detect Record
	 * \else
	 * �ϴ���̬���¼��
	 * \endif
	 */
	public boolean            bMdEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Alarm Record
	 * \else
	 * �ϴ��ⲿ����¼��
	 * \endif
	 */
	public boolean            bAlarmEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Normal Record
	 * \else
	 * �ϴ���ͨ��ʱ¼��
	 * \endif
	 */
	public boolean            bTimerEn;
}
