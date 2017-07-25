package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Hang up video phone(Corresponding SDK_CTRL_VTP_DISCONNECT)  
 * \else
 * �Ҷ���Ƶ�绰(��Ӧ SDK_CTRL_VTP_DISCONNECT ����)
 * \endif
 */
public class NET_CTRL_VTP_DISCONNECT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The device ID to be forward , NULL means don��t forward
	 * \else
	 * ת��Ŀ���豸ID,ΪNULL��ʾ��ת��
	 * \endif
	 */
	public String                   szTargetID; 
	
	/**
	 * \if ENGLISH_LANG
	 * Call type, EM_NET_VTP_CALL_TYPE
	 * \else
	 * ��������, EM_NET_VTP_CALL_TYPE
	 * \endif
	 */
	public int                      emCallType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Intercom unique identifier}NET_CTRL_VTP_DISCONNECT;
	 * \else
	 * �Խ�Ψһ��ʶ
	 * \endif
	 */
	public byte                     szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128];
}
