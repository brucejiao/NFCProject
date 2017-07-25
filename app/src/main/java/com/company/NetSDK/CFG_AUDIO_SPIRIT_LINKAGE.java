package com.company.NetSDK;


import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Voice incentive linkage
 * \else
 * ��������������
 * \endif
 */
public class CFG_AUDIO_SPIRIT_LINKAGE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Number of matrix output port
	 * \else
	 * �������������
	 * \endif
	 */
	public int				nOutputNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Number of matrix output port
	 * \else
	 * �������������
	 * \endif
	 */
	public int 			  szOutputChanel[] = new int[FinalVar.CFG_MAX_LOWER_MATRIX_OUTPUT];
}