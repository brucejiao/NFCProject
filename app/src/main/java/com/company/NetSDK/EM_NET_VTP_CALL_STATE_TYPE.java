package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of video phone call
 * \else
 * ��Ƶ�绰����״̬����
 * \endif
 */
public class EM_NET_VTP_CALL_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * δ֪
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Initial State
	 * \else
	 * ��ʼ״̬
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_IDLE = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling(the opposite side not response)
	 * \else
	 * ���к���״̬(�Է�δ��Ӧ)
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CALLING = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of called
	 * \else
	 * ���к���״̬
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CALLED = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling back (the opposite side responsed but no answer)
	 * \else
	 * ���л���״̬(�Է���Ӧ, ��û�н���)
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_RINGING = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of answering 
	 * \else
	 * ͨ����״̬
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CONNECTING = 5; 
	
	/**
	 * \if ENGLISH_LANG
	 * 2 states in the call 
	 * \else
	 * ͨ����2״̬(ͨ��ý�������ͨ����״̬)
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CONNECTING2 = 6; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of call off
	 * \else
	 * ͨ���Ҷ�״̬
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_DISCONNECT = 7; 
}
