package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Matrix control
 * \else
 * �������
 * \endif
 */
public class MATRIXCTRL_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video input number. It begins from  0.
	 * \else
	 * ��Ƶ����ţ���0��ʼ
	 * \endif
	 */
	public 	int					nChannelNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Matrix output number. It begins from 0
	 * \else
	 * ��������ţ���0��ʼ
	 * \endif
	 */
	public  int					nMatrixNo; 
}


