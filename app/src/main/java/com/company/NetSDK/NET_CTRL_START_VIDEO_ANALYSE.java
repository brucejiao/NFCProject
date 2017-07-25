package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param: SDK_CTRL_START_VIDEO_ANALYSE
 * \else
 * INetSDK.ControlDevice�ӿڵ� SDK_CTRL_START_VIDEO_ANALYSE �������
 * \endif
 */
public class NET_CTRL_START_VIDEO_ANALYSE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID  
	 * \else
	 * ͨ����  
	 * \endif
	 */
	public int                 nChannelId; 
}
