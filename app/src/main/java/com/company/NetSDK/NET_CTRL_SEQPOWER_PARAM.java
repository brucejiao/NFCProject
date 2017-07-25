package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * power sequence control parameter
 * \else
 * ��Դʱ�������Ʋ���
 * \endif
 */
public class NET_CTRL_SEQPOWER_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * device ID
	 * \else
	 * �豸ID
	 * \endif
	 */
	public String				pszDeviceID; 
	
	/**
	 * \if ENGLISH_LANG
	 * output or output sequence
	 * \else
	 * ����ڻ���������
	 * \endif
	 */
	public int					nChannel; 
}
