package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * enable/disable designated channel video input parameter
 * \else
 * ����/�ر�ָ��ͨ��¼�����
 * \endif
 */
public class NET_IN_SET_COURSE_RECORD_STATE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                      nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:enable 1:disable
	 * \else
	 * 0:����, 1:�ر�
	 * \endif
	 */
	public int                      nAction;	
}
