package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter about getting mode of course record 
 * \else
 * ��ȡ¼��ģʽ����
 * \endif
 */

public class NET_OUT_GET_COURSE_RECORD_MODE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * record mode
	 * \else
	 * ¼��ģʽ
	 * \endif
	 * @see NET_EM_RECORD_MODE
	 */
	public int	emRecordMode;       
}
