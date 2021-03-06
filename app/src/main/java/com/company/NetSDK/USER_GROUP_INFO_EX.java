package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User group info
 * \else
 * �û�����Ϣ
 * \endif
 */
public class USER_GROUP_INFO_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * id�� 
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * ���� 
	 * \endif
	 */
	public char			name[] = new char[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Right info 
	 * \else
	 * Ȩ���б���
	 * \endif
	 */
	public int				dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * Ȩ���б� 
	 * \endif
	 */
	public int				rights[] = new int[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Note
	 * \else
	 * ��ע 
	 * \endif
	 */
	public char			memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}
