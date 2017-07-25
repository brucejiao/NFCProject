package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of ivs
 * \else
 * ���ܱ����¼�
 * \endif
 */
public class ALARM_IVS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * �¼�����ʱ��    
	 * \endif
	 */
	public NET_TIME   stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel ID,from 0
	 * \else
	 * ͨ���ţ���0��ʼ
	 * \endif
	 */
	public int        nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * type
	 * \else
	 * ��������
	 * \endif
	 */
	public byte       szType[] = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * state,0-reset,1-setting,2-pulse
	 * \else
	 * ����״̬��0-������λ��1-������λ, 2-����ʽ����
	 * \endif
	 */
	public int        nState;
}
