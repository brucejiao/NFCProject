package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User info list
 * \else
 * �û���Ϣ��
 * \endif
 */
public class USER_MANAGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right amount 
	 * \else
	 * Ȩ���б���
	 * \endif
	 */
	public int				dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right info 
	 * \else
	 * Ȩ���б�
	 * \endif
	 */
	public OPR_RIGHT		rightList[] = new OPR_RIGHT[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User group amount 
	 * \else
	 * �û����б���
	 * \endif
	 */
	public int				dwGroupNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * �û����б�
	 * \endif
	 */
	public USER_GROUP_INFO	groupList[] = new USER_GROUP_INFO[FinalVar.SDK_MAX_GROUP_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User amount 
	 * \else
	 * �û��б���
	 * \endif
	 */
	public int				dwUserNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User info 
	 * \else
	 * �û��б�
	 * \endif
	 */
	public USER_INFO		userList[] = new USER_INFO[FinalVar.SDK_MAX_USER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User reusable capability. 1��Support��0��Does not support. 
	 * \else
	 * �û�����������1��֧���û����ã�0����֧���û�����
	 * \endif
	 */
	public int				dwSpecial;
	
	public USER_MANAGE_INFO() {
		for(int i=0 ; i<FinalVar.SDK_MAX_RIGHT_NUM ; i++) {
			rightList[i] = new OPR_RIGHT();
		}
		
		for(int i=0 ; i<FinalVar.SDK_MAX_GROUP_NUM ; i++) {
			groupList[i] = new USER_GROUP_INFO();
		}
		
		for(int i=0 ; i<FinalVar.SDK_MAX_USER_NUM ; i++) {
			userList[i] = new USER_INFO();
		}
	}
}
