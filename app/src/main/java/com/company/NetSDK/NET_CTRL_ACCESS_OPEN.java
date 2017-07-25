package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param: SDK_CTRL_ACCESS_OPEN
 * \else
 * INetSDK.ControlDevice�ӿڵ� SDK_CTRL_ACCESS_OPEN �������
 * \endif
 */
public class NET_CTRL_ACCESS_OPEN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID (start from 0) 
	 * \else
	 * ͨ����(0��ʼ)
	 * \endif
	 */
	public int					nChannelID; 
	
	/**
	 * \if ENGLISH_LANG
	 * Target ID, NULL equals to not transmit
	 * \else
	 * ת��Ŀ���豸ID,ΪNULL��ʾ��ת��
	 * \endif
	 */
    public String               szTargetID;
}
