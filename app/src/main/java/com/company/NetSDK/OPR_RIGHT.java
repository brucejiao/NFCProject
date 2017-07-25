package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Support the device with max 8 bits user name. Corresponding to the  QueryUserInfo and  OperateUserInfo .Right information 
 * \else
 * Ȩ����Ϣ, ֧���û�����󳤶�Ϊ8λ���豸����Ӧ  QueryUserInfo �� OperateUserInfo �ӿ�
 * \endif
 */
public class OPR_RIGHT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right ID
	 * \else
	 * Ȩ��ID
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * Ȩ������
	 * \endif
	 */
	public char			name[] = new char[FinalVar.SDK_RIGHT_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Memo
	 * \else
	 * ��ע
	 * \endif
	 */
	public char			memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}
