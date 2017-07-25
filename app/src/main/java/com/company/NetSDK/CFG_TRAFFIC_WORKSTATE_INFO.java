package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device Working State
 * \else
 * �豸����״̬��Ϣ
 * \endif
 */
public class CFG_TRAFFIC_WORKSTATE_INFO implements Serializable {
	
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
	public int						nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Snapshot Mode Types, CFG_TRAFFIC_SNAP_MODE
	 * \else
	 * ץ��ģʽ, CFG_TRAFFIC_SNAP_MODE
	 * \endif
	 */
	public int                  	emSnapMode;
	
 	/**
	 * \if ENGLISH_LANG
	 * Match Mode: 0-Non-realtime��; 1-Realtime
	 * \else
	 * ץ��ƥ��ģʽ: 0-��ʵʱƥ�䷽ʽ���ȱ�����ץ�ģ�ץ��֡���Ǳ���֡;  1-ʵʱƥ��ģʽ������֡��ץ��֡��ͬһ֡ 
	 * \endif
	 */
	public int						nMatchMode;
}
