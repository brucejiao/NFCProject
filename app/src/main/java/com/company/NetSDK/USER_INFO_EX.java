package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User info
 * \else
 * �û���Ϣ
 * \endif
 */
public class USER_INFO_EX implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * ID 
	 * \else
	 * ID��
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Group ID 
	 * \else
	 * ��ID��
	 * \endif
	 */
	public int				dwGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * User name 
	 * \else
	 * �û���
	 * \endif
	 */
	public char			name[] = new char[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * ����
	 * \endif
	 */
	public char			passWord[] = new char[FinalVar.SDK_USER_PSW_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Right list length
	 * \else
	 * Ȩ���б���
	 * \endif
	 */
	public int				dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right list 
	 * \else
	 * Ȩ���б�
	 * \endif
	 */
	public int				rights[] = new int[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Note: One Chinese character stands for 3-bit. One English character stands for 1-bit. The total length shall be less than 31. Add end symbol at the end. 
	 * \else
	 * ��ע
	 * \endif
	 */
	public char			memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Submask��0x00000001 - support account reusable 
	 * \else
	 * ���룬0x00000001 - ֧���û�����
	 * \endif
	 */
	public int				dwFouctionMask;
}
