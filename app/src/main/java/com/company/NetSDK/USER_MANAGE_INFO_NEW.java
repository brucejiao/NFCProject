package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User information list 
 * \else
 * �û���Ϣ��
 * \endif
 */
public class USER_MANAGE_INFO_NEW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right information 
	 * \else
	 * Ȩ���б���
	 * \endif
	 */
	public int					dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right list
	 * \else
	 * Ȩ���б�
	 * \endif
	 */
	public OPR_RIGHT_NEW		rightList[] = new OPR_RIGHT_NEW[FinalVar.SDK_NEW_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * �û����б���
	 * \endif
	 */
	public int					dwGroupNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * �û����б�
	 * \endif
	 */
	public USER_GROUP_INFO_EX2 groupListEx[] = new USER_GROUP_INFO_EX2[FinalVar.SDK_MAX_GROUP_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User info 
	 * \else
	 * �û��б���
	 * \endif
	 */
	public int					dwUserNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User list 
	 * \else
	 * �û��б�
	 * \endif
	 */
	public USER_INFO_NEW		userList[] = new USER_INFO_NEW[FinalVar.SDK_MAX_USER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Submask��0x00000001 - Support account reuse��0x00000002 - Need verification when change password 
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

	public USER_MANAGE_INFO_NEW() {
		for(int i=0 ; i<FinalVar.SDK_NEW_MAX_RIGHT_NUM ; i++) {
			rightList[i] = new OPR_RIGHT_NEW();
		}
		
		for(int i =0 ; i<FinalVar.SDK_MAX_USER_NUM ; i++) {
			userList[i] = new USER_INFO_NEW();
		}
		
		for(int i =0 ; i<FinalVar.SDK_MAX_GROUP_NUM ; i++) {
			groupListEx[i] = new USER_GROUP_INFO_EX2();
		}
	}
}
