package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TrafficSnapByNetwork's input param
 * \else
 * �ӿ�(TrafficSnapByNetwork)�������
 * \endif
 */
public class NET_IN_SNAPSHOT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Trigger type	0-unknown 1-zhongmeng net trigger
	 * \else
	 * ��������	0-δ֪	1-�������紥�� 2-�ͻ��˴���������NET_CLIENT_SNAP_INFO��Ķ���
	 * \endif
	 */
	public int					nTriggerType;			

	public Object				objType;				
}
