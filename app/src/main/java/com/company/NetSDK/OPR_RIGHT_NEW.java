package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rights info
 * \else
 * Ȩ����Ϣ
 * \endif
 */
public class OPR_RIGHT_NEW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ID
	 * \else
	 * Ȩ��ID
	 * \endif
	 */
	public int			dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * Ȩ������
	 * \endif
	 */
	public char		name[] = new char[FinalVar.SDK_RIGHT_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Memo
	 * \else
	 * ��ע
	 * \endif
	 */
	public char		memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}
