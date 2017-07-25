package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Open the forwarding mode of intercom or not 
 * \else
 * �Ƿ��������Խ���ת��ģʽ
 * \endif
 */
public class NET_TALK_TRANSFER_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Open the forwarding mode of intercom or not, TRUE: yes, FALSE: no
	 * \else
	 * �Ƿ��������Խ�ת��ģʽ, TRUE: ����ת��, FALSE: �ر�ת��
	 * \endif
	 */
	public boolean            bTransfer; 
}
