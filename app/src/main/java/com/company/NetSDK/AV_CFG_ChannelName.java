package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel Name Structure
 * \else
 * ͨ������
 * \endif
 */
public class AV_CFG_ChannelName implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Camera Unique Number 
	 * \else
	 * ����ͷΨһ��� 
	 * \endif
	 */
	public int				nSerial;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel
	 * \else
	 * ͨ����
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.AV_CFG_Channel_Name_Len];
}
