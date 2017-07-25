package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Tour Information
 * \else
 * ��������Ѳ��Ϣ
 * \endif
 */
public class DEC_TOUR_COMBIN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Tour Interval(s)
	 * \else
	 * ��Ѳ���(��)
	 * \endif
	 */
	public int				nTourTime;
	
	/**
	 * \if ENGLISH_LANG
	 * the number of combination
	 * \else
	 * ��ϸ���
	 * \endif
	 */
	public int				nCombinNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Combination Table
	 * \else
	 * ��ϱ�
	 * \endif
	 */
	public byte			bCombinID[]		= new byte[FinalVar.DEC_COMBIN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Combination option state,0:close;1:open
	 * \else
	 * ������ʹ��״̬��0���أ�1����
	 * \endif
	 */
	public byte			bCombinState[] 	= new byte[FinalVar.DEC_COMBIN_NUM];
}
