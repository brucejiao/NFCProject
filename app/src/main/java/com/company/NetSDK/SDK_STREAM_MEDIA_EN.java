package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SIP,RTSP Ability
 * \else
 * SIP,RTSP����
 * \endif
 */
public class SDK_STREAM_MEDIA_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Stream type capability set 
	 * 0 �� ;1 SIP;2 RTSP 
	 * \else
	 * ��������������  0,�� 1,SIP 2,RTSP
	 * \endif
	 */
	public int			nStreamType;			
}
