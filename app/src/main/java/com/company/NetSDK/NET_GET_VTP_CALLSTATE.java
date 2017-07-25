package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Obtain the calling state of video phone (Corresponding to SDK_DEVSTATE_VTP_CALLSTATE)
 * \else
 * ��ȡ��Ƶ�绰����״̬ (��Ӧ SDK_DEVSTATE_VTP_CALLSTATE)
 * \endif
 */
public class NET_GET_VTP_CALLSTATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the call type to be queried, input parameter
	 * \else
	 * ����ѯ�ĺ�������, EM_NET_VTP_CALL_TYPE, �������
	 * \endif
	 */
	public int      emCallType; 
	
	/**
	 * \if ENGLISH_LANG
	 * the unique identification to be queried, input parameter
	 * \else
	 * ����ѯ�ĶԽ�Ψһ��ʶ, �������
	 * \endif
	 */
	public byte                        szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128]; 
	
	/**
	 * \if ENGLISH_LANG
	 * the device to be transmit,  ID= NULL equals to no transmitting,  input parameter
	 * \else
	 * ��ת�����豸ID, ΪNULL��ʾ��ת��, �������
	 * \endif
	 */
	public String   szTargetID; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling
	 * \else
	 * ����״̬, EM_NET_VTP_CALL_STATE_TYPE, �������
	 * \endif
	 */
	public int      emCallState; 
}
