package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 
 * \else
 * 
 * \endif
 */
public class NET_CB_CAMERASTATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * ͨ��
	 * \endif
	 */
	public int                 nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * connect state, see CONNECT_STATE
	 * \else
	 * ����״̬���鿴CONNECT_STATE
	 * \endif
	 */
    public int                 emConnectState;
}
