package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the output channesl which should to be silenced
 * \else
 *  ��Ƶ�����Ͽ��ƾ��������ͨ��
 * \endif
 */
public class NET_SILENCE_CHANNEL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the index of matrix
	 * \else
	 *  ��Ҫ�����ľ����
	 * \endif
	 */
	public int				nMatrix;
	
	/**
	 * \if ENGLISH_LANG
	 * the counts of  output channels which should to be  silenced
	 * \else
	 *  ��Ҫ���������ͨ����
	 * \endif
	 */
	public int 				nOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * the output channels which should to be  silenced
	 * \else
	 *  �þ�������Ҫ���������ͨ��
	 * \endif
	 */
	public int				nOutPutChannel[] = new int[FinalVar.SDK_MAX_AUDIO_MATRIX_OUTPUT];

}