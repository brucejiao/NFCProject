package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter about getting channel of preview 
 * \else
 * ��ȡ����Ԥ��ͨ���� ����
 * \endif
 */
public class NET_OUT_GET_COMPOSITE_PREVIEW_CHANNEL implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * the amount of using channel  
	 * \else
	 * ͨ������
	 * \endif
	 */
	public int                      nChannelNum;                       
    
	/**
	 * \if ENGLISH_LANG
	 * the using channel
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int[]                    nChannel = new int[FinalVar.MAX_PREVIEW_CHANNEL_NUM]; 
}
