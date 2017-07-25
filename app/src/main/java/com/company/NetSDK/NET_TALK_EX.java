package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Three generations of equipment parameters of voice intercom, corresponding to the INetSDK.SetDeviceMode SDK_TALK_MODE3 command
 * \else
 * �����豸�������Խ���������ӦINetSDK.SetDeviceMode()��SDK_TALK_MODE3����
 * \endif
 */
public class NET_TALK_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel number 
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int					nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * Audio transmission listener ports
	 * \else
	 * ��Ƶ���������˿�
	 * \endif
	 */
	public int                 	nAudioPort; 
	
	/**
	 * \if ENGLISH_LANG
	 * Ms wait time, unit, use the default value is 0
	 * \else
	 * �ȴ�ʱ��, ��λms,Ϊ0��ʹ��Ĭ��ֵ
	 * \endif
	 */
	public int					nWaitTime; 
}
