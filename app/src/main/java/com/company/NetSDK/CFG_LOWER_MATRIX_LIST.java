package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Lower matrix configurations
 * \else
 * ��λ��������
 * \endif
 */
public class CFG_LOWER_MATRIX_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The number of lower matrix
	 * \else
	 * ��λ��������
	 * \endif
	 */
	public int						nMatrixCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Lower matrix array
	 * \else
	 * ��λ��������
	 * \endif
	 */
	public CFG_LOWER_MATRIX_INFO	stuMatrix[] = new CFG_LOWER_MATRIX_INFO[FinalVar.CFG_MAX_LOWER_MATRIX_NUM];
	
	public CFG_LOWER_MATRIX_LIST()
	{
		for(int i = 0; i < FinalVar.CFG_MAX_LOWER_MATRIX_NUM; i++)
		{
			stuMatrix[i] = new CFG_LOWER_MATRIX_INFO();
		}
	}
	
}