package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the configuration of audio matrix silence
 * \else
 * ��������������Ϣ
 * \endif
 */
public class CFG_AUDIO_MATRIX_SILENCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the max numbers of input channels lists
	 * \else
	 *  ��Ҫ��ȡ/���õľ��������ͨ������
	 * \endif
	 */
	public int 						    nMaxInputListCount;
	
	/**
	 * \if ENGLISH_LANG
	 * the numbers of  effective input channels lists
	 * \else
	 *   ʵ�ʻ�ȡ�������ͨ����������������ʱ�˳�Ա������
	 * \endif
	 */
	public int							nRetInputListCountOut;
	
	
	/**
	 * \if ENGLISH_LANG
	 *  the input channels lists which is need to set silence
	 * \else
	 *   ������Ƶ���ͨ����Ӧ�ľ�������ͨ�����û�����
	 * \endif
	 */
	public CFG_AUDIO_SILENCE_INPUT_CHN  pstSilenceInputChn[];
	
	
	public CFG_AUDIO_MATRIX_SILENCE(int nMaxInputListCount)
	{
		this.nMaxInputListCount = nMaxInputListCount;
		
		pstSilenceInputChn = new CFG_AUDIO_SILENCE_INPUT_CHN[this.nMaxInputListCount];
		for(int i = 0; i < this.nMaxInputListCount; i++)
		{
			pstSilenceInputChn[i] = new CFG_AUDIO_SILENCE_INPUT_CHN();
		}
	} 
}
