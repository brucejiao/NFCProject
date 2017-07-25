package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * activate zone info
 * \else
 * ����ķ�����Ϣ
 * \endif
 */
public class NET_ACTIVATEDDEFENCEAREA_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * zone channel no.
	 * \else
	 * ����ͨ����
	 * \endif
	 */
	public int nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * zone activation time 
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
	public NET_TIME stuActivationTime = new NET_TIME();

}
