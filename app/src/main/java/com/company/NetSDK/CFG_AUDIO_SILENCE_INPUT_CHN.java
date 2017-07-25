package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the info of inputchannels
 * \else
 * һ����Ƶ���ͨ����Ӧ�ľ�������ͨ��
 * \endif
 */
public class CFG_AUDIO_SILENCE_INPUT_CHN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the index of matrix, start from 0s
	 * \else
	 * ����Ƶ���ͨ�������ľ���ţ���0��ʼ
	 * \endif
	 */
	public int 						    nMatrix;
	
	/**
	 * \if ENGLISH_LANG
	 * the output channel, start from 0
	 * \else
	 * ����Ƶ���ͨ���ţ���0��ʼ
	 * \endif
	 */
     public int 					   nOutChannel;
     
 	/**
 	 * \if ENGLISH_LANG
 	 * the counts of input channels
 	 * \else
 	 * ������������ͨ���ĸ���
 	 * \endif
 	 */
     public int 						nInputChnConut;
     
 	/**
  	 * \if ENGLISH_LANG
  	 * the counts of input channels
  	 * \else
  	 * ������������ͨ��
  	 * \endif
  	 */
     public short							snInputChannel[] = new short[FinalVar.CFG_MAX_AUDIO_MATRIX_INPUT];
}