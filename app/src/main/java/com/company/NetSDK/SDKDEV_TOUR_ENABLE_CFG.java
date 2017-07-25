package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tour enable configuration
 * \else
 * ��Ѳʹ������
 * \endif
 */
public class SDKDEV_TOUR_ENABLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * ��Ѳʹ��
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * is touring or not(read only). bStart=FALSE when tour is able but doesn't set
	 * \else
	 * �Ƿ�������Ѳ(ֻ��). ��Ѳʹ�ܴ򿪵�û��������Ѳ����Դʱ, bStart=FALSE
	 * \endif
	 */
	public boolean                bStart; 
}
