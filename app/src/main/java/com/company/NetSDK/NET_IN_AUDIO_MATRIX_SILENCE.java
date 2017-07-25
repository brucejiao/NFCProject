package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio matrix silence input parameter
 * \else
 *  ��Ƶ����һ�����������������
 * \endif
 */
public class NET_IN_AUDIO_MATRIX_SILENCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enbale(true:close voice     false:open voice)
	 * \else
	 *  һ������ʹ�ܿ�����ر�(true:���� false:��������)
	 * \endif
	 */
	public boolean					bEnable;
	
	
	/**
	 * \if ENGLISH_LANG
	 * the counts of  output channels lists which should to be  silenced
	 * \else
	 *  ��Ҫ���ƾ��������ͨ����
	 * \endif
	 */
	public int						nListCount;
	
	
	/**
	 * \if ENGLISH_LANG
	 * the output channels lists which should to be silenced
	 * \else
	 *  ��Ҫ���ƾ��������ͨ����Ϣ���û������ڴ�
	 * \endif
	 */
	public NET_SILENCE_CHANNEL stSlienceChannel[];
	
	public NET_IN_AUDIO_MATRIX_SILENCE(int nListCount)
	{
		this.nListCount = nListCount;
		
		if(this.nListCount > 0)
		{
			stSlienceChannel = new NET_SILENCE_CHANNEL[this.nListCount];
			for(int i = 0; i < this.nListCount; i++)
			{
				stSlienceChannel[i] = new NET_SILENCE_CHANNEL();
			}
		}
	}
	
	
}