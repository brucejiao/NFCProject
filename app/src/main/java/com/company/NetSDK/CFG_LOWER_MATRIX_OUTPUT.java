package com.company.NetSDK;


import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Lower matrix information
 * \else
 * ��λ������Ϣ
 * \endif
 */
public class CFG_LOWER_MATRIX_OUTPUT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * Output Channel Name
	 * \else
	 * ���ͨ������
	 * \endif
	 */
	public  byte szName[] = new byte[FinalVar.CFG_COMMON_STRING_128];
	
	/**
	 * \if ENGLISH_LANG
	 * Split mode��as CFG_SPLITMODE
	 * \else
	 * �ָ�ģʽ, ȡֵ��Ӧ��CFG_SPLITMODE
	 * \endif
	 */
	public int			emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Input Channel Group 
	 * \else
	 * ����ͨ����
	 * \endif
	 */
	public int						szInputs[] = new  int[FinalVar.CFG_MAX_LOWER_MATRIX_INPUT];
	
	/**
	 * \if ENGLISH_LANG
	 * Input Channel Number
	 * \else
	 * ����ͨ����
	 * \endif
	 */
	public int						nInputCount;
	
} 