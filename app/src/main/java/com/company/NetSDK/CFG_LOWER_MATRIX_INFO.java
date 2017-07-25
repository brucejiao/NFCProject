package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Lower matrix information
 * \else
 * ��λ������Ϣ
 * \endif
 */
public class CFG_LOWER_MATRIX_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Output Channel Number
	 * \else
	 * ���ͨ����
	 * \endif
	 */
	public int						nOutputCount;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Output Channel Number
	 * \else
	 * ���ͨ����
	 * \endif
	 */
	public CFG_LOWER_MATRIX_OUTPUT	stuOutputs[] = new CFG_LOWER_MATRIX_OUTPUT[FinalVar.CFG_MAX_LOWER_MATRIX_OUTPUT];
	
	public CFG_LOWER_MATRIX_INFO()
	{
		for(int i = 0; i < FinalVar.CFG_MAX_LOWER_MATRIX_OUTPUT; i++)
		{
			stuOutputs[i] = new CFG_LOWER_MATRIX_OUTPUT();
		}
	}

}