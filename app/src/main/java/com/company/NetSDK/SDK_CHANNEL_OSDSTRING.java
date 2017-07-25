package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Data structure of channel video title overlay 
 * \else
 * ͨ��������Ļ���ӵ����ݽṹ
 * \endif
 */
public class SDK_CHANNEL_OSDSTRING implements Serializable {
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
	 * Character position in each line. The value ranges from 1 to 9.Corresponding to the small keyboard. \n 
	 * 7upper left 	8upper		9upper right  \n 
	 * 4left			5middle 	6right  \n 
	 * 1down left		2down	    3down right  \n 
	 * \else
	 * �����ַ���λ�á���1-9������ʾ����С����λ�ö�Ӧ \n 
	 * 7����	8��		9���� \n 
	 * 4��		5��		6�� \n 
	 * 1����	2��		3���� \n 
	 * \endif
	 */
	public int					dwPosition[] = new int[FinalVar.MAX_STRING_LINE_LEN];	 
	
	/**
	 * \if ENGLISH_LANG
	 * Max 6 lines. Each line max 20 bytes.
	 * \else
	 * ��������ַ���ÿ�����20���ֽ�
	 * \endif
	 */
	public char				szStrings[][] = new char[FinalVar.MAX_STRING_LINE_LEN][FinalVar.MAX_PER_STRING_LEN];	 
}
