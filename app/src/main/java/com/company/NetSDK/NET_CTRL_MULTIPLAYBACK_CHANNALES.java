package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param SDK_CTRL_MULTIPLAYBACK_CHANNALES 
 * \else
 * INetSDK.ControlDevice�ӿڵ� SDK_CTRL_MULTIPLAYBACK_CHANNALES ������� 
 * \endif
 */
public class NET_CTRL_MULTIPLAYBACK_CHANNALES implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Playback Handle��CLIENT_MultiPlayBack Returns the Value
	 * \else
	 * �طž����CLIENT_MultiPlayBack�ӿڷ���ֵ
	 * \endif
	 */
	public long     	lPlayBackHandle; 
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Channel ID
	 * \else
	 * Ԥ��ͨ����
	 * \endif
	 */
	public int        	nChannels[] = new int[FinalVar.SDK_MAX_MULTIPLAYBACK_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Channel Number 
	 * \else
	 * Ԥ��ͨ���� 
	 * \endif
	 */
	public int      	nChannelNum; 
}
