package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power info
 * \else
 * ��Դ״̬
 * \endif
 */
public class SDK_POWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Power is on or not
	 * \else
	 * ��Դ״̬, 0-�ر�, 1-��, 2-�򿪵��й���
	 * \endif
	 */
	 public boolean                bPowerOn; 
	 
	 /**
	 * \if ENGLISH_LANG
	 * power current status
	 * \else
	 * ��Դ����״̬ , EM_CURRENT_STATE_TYPE
	 * \endif
	 */
	 public int  emCurrentState;            
}
