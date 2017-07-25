package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * representation channel file info
 * \else
 *  ӳ��ͨ���ļ���Ϣ
 * \endif
 */
public class NET_CHANNEL_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * real channel ID
	 * \else
	 * ��ʵͨ����
	 * \endif
	 */
	public int                      nRealChannel;                    
	
	/**
	 * \if ENGLISH_LANG
	 * record file length
	 * \else
	 * ͨ��¼���ļ��ܳ��� 
	 * \endif
	 */
	public int                      nFileLen;                         
}
