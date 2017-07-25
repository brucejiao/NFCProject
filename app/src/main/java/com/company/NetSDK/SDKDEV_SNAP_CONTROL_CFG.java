package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * snap control configuration
 * \else
 * ץͼ��������
 * \endif
 */
public class SDKDEV_SNAP_CONTROL_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * every channel's snap on-off: 0 Autumn(other configuration and event will control whether snap picture ); 1: turn on snap; 2: turn off snap
	 * \else
	 * ÿ��ͨ����Ӧץͼ���� 0:�Զ�(���ʾ�Ƿ�ץͼ�����������ú��¼�����); 1:ץͼ����; 2:ץͼ�ر�
	 * \endif
	 */
	public byte                bySnapState[] = new byte[32]; 
}
