package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * CLIENT_AttachBurnCheckState �ӿڵ��������(������¼У��״̬)
 * \endif
 */
public class NET_IN_ATTACH_BURN_CHECK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��¼У��ص�
	 * \endif
	 */
	public CB_fBurnCheckCallBack  cbBurnCheck;					 
}
