package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Input parameter about the status informations of subscribe to video phone
 * \else
 * ������Ƶ�绰״̬��Ϣ �������
 * \endif
 */
public class NET_IN_VTP_CALL_STATE_ATTACH implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The call type for checking, EM_NET_VTP_CALL_TYPE
	 * \else
	 * ����ѯ�ĺ�������, EM_NET_VTP_CALL_TYPE
	 * \endif
	 */
    public int        emCallType; 
    
    /**
     * \if ENGLISH_LANG
     * The device ID for forward, NULL means not formard
     * \else
     * ת��Ŀ���豸ID,ΪNULL��ʾ��ת��
     * \endif
     */
    public String     szTargetID; 
}
