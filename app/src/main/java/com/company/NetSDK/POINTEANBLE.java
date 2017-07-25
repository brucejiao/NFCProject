package com.company.NetSDK;

import java.io.Serializable;

public class POINTEANBLE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset range[1,80], invalid setting is 0.
	 * \else
	 * Ԥ�Ƶ����Ч��Χ������[1,80]����Ч����Ϊ0��
	 * \endif
	 */
	public byte             bPoint;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid or not,0 invalid,1 valid
	 * \else
	 * �Ƿ���Ч,0��Ч��1��Ч
	 * \endif
	 */
	public byte             bEnable;
}
