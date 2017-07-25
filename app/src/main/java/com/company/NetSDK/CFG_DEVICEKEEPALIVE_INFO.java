package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * �豸��������
 * \endif
 */
public class CFG_DEVICEKEEPALIVE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * ��������ʹ��
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * ����ʱ������������>=10��ֵ����λ����
	 * \endif
	 */
	public int					nInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * ����ʧ�ܴ���������ʧ�ܴ��������ֵ��Ϊ�豸����
	 * \endif
	 */
	public int					nFailTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * �ȴ�����ӵ���������Ᵽ����������λ����
	 * \endif
	 */
	public int					nWaitBootTime;
}
