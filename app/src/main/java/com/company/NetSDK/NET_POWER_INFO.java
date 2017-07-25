package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ���������⣬������ʹ��
 * \else
 * ���������⣬������ʹ��
 * \endif
 */
public class NET_POWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 public boolean                bPowerOn;                       				// ��Դ״̬, 0-�ر�, 1-��, 2-�򿪵��й���
	 //��Դ����״̬ EM_CURRENT_STATE_TYPE
	 public int  emCurrentState ;            
}
