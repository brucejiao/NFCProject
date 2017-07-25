package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Source Structure
 * \else
 * ¼��Դ
 * \endif
 */
public class AV_CFG_RecordSource implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device ID 
	 * \else
	 * �豸ID
	 * \endif
	 */
	public byte[]			szDeviceID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Video Channel No. 
	 * \else
	 * ��Ƶͨ����
	 * \endif
	 */
	public int				nVideoChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Video Stream 	
	 * \else
	 * ��Ƶ����
	 * \endif
	 */
	public int				nVideoStream;
	
 	/**
	 * \if ENGLISH_LANG
	 * Audio Channle No. 
	 * \else
	 * ��Ƶͨ����
	 * \endif
	 */
	public int				nAudioChannle;
	
 	/**
	 * \if ENGLISH_LANG
	 * AudioStream 
	 * \else
	 * ��Ƶ����
	 * \endif
	 */
	public int				nAudioStream;
}

