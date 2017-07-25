package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video phone status informations
 * \else
 * ��Ƶ�绰״̬��Ϣ
 * \endif
 */
public class NET_VTP_CALL_STATE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Call number
	 * \else
	 * ���к���
	 * \endif
	 */
    public byte                        szNumber[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * Intercom unique identifier
     * \else
     * �Խ�Ψһ��ʶ
     * \endif
     */
    public byte                        szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * Call status
     * \else
     * ����״̬, EM_NET_VTP_CALL_STATE_TYPE
     * \endif
     */
    public int                         emCallState; 
}
