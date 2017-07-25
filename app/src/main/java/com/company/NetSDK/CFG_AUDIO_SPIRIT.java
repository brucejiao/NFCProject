package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice incentive
 * \else
 * ��������
 * \endif
 */
public class CFG_AUDIO_SPIRIT implements Serializable {

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
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Excitation volume threshold, 0 ~ 100
	 * \else
	 * ����������ֵ, 0~100
	 * \endif
	 */
	public int					nAudioLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * Incentive delay time, unit: seconds
	 * \else
	 * ������ʱʱ��, ��λ: ��
	 * \endif
	 */
	public int					nDelayTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Speech excitation audio channel properties 
	 * \else
	 * ����������Ƶͨ������
	 * \endif
	 */
	public CFG_AUDIO_SPIRIT_CHANNEL stuChannels[];
	
	/**
	 * \if ENGLISH_LANG
	 * Number of audio channels��stuChannels valiad number
	 * \else
	 * ��Ƶͨ������stuChannels��Ч����
	 * \endif
	 */
	public int					    nChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Encourage collaboration entry
	 * \else
	 * ����������
	 * \endif
	 */
	public CFG_AUDIO_SPIRIT_LINKAGE stuLinkage = new CFG_AUDIO_SPIRIT_LINKAGE();
	
	
	public CFG_AUDIO_SPIRIT(int nCount)
	{
		this.nChannelCount = nCount;
		
		stuChannels = new CFG_AUDIO_SPIRIT_CHANNEL[nChannelCount];
		for(int i = 0; i < nChannelCount; i++)
		{
			stuChannels[i] = new CFG_AUDIO_SPIRIT_CHANNEL();
		}
	}
}