package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User information list. Support 16-bit user name and password length
 * \else
 * �û���Ϣ��
 * \endif
 */
public class USER_MANAGE_INFO_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right list length 
	 * \else
	 * Ȩ����Ϣ
	 * \endif
	 */
	public int					dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right info 
	 * \else
	 * Ȩ����Ϣ 
	 * \endif
	 */
	public OPR_RIGHT_EX		rightList[] = new OPR_RIGHT_EX[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Group list length 
	 * \else
	 * ���б��� 
	 * \endif
	 */
	public int					dwGroupNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * �û�����Ϣ
	 * \endif
	 */
	public USER_GROUP_INFO_EX  groupList[] = new USER_GROUP_INFO_EX[FinalVar.SDK_MAX_GROUP_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User list length 
	 * \else
	 * �û��б���
	 * \endif
	 */
	public int					dwUserNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User info 
	 * \else
	 * �û���Ϣ
	 * \endif
	 */
	public USER_INFO_EX		userList[] = new USER_INFO_EX[FinalVar.SDK_MAX_USER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Submask��0x00000001 - support account reuse��0x00000002 - Need verification when change password 
	 * \else
	 * ���룻0x00000001 - ֧���û����ã�0x00000002 - �����޸���ҪУ��
	 * \endif
	 */
	public int					dwFouctionMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Need verification when change password
	 * \else
	 * ֧�ֵ��û�����󳤶�
	 * \endif
	 */
	public byte				byNameMaxLength;
	
	/**
	 * \if ENGLISH_LANG
	 * The max password length supported 
	 * \else
	 * ֧�ֵ�������󳤶�
	 * \endif
	 */
	public byte				byPSWMaxLength;
	
	public USER_MANAGE_INFO_EX() {
		for (int i = 0; i < FinalVar.SDK_MAX_RIGHT_NUM; i++) {
			rightList[i] = new OPR_RIGHT_EX();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_GROUP_NUM; i++) {
			groupList[i] = new USER_GROUP_INFO_EX();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_USER_NUM; i++) {
			userList[i] = new USER_INFO_EX();
		}
	}
}
