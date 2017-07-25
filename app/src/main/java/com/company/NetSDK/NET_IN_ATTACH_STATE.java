package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_ATTACH_STATE implements Serializable {

	/**
	 * AttachBurnState input param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * disk name, as "/dev/sda"
	 * \else
	 *  �������ƣ���"/dev/sda"
	 * \endif
	 */
	public 	String szDeviceName;
	
	/**
	 * \if ENGLISH_LANG
	 * burning session handle, CLIENT_StartBurnSession retuen value. This value is 0, szDeviceName is valid, by burning device subscribe burning status
	 * \else
	 * ��¼�Ự���,CLIENT_StartBurnSession�ķ���ֵ. ��ֵΪ0ʱ, szDeviceName��Ч, ��ʱ����¼�豸���Ŀ�¼״̬
	 * \endif
	 */
	public 	long    lBurnSession;
	
	/**
	 * \if ENGLISH_LANG
	 * burning listening callback
	 * \else
	 *  ��¼�����ص�
	 * \endif
	 */
	public  CB_fAttachBurnStateCB cbAttachState;
}

