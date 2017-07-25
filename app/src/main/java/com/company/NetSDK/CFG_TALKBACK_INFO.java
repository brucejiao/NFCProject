package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice Call Linkage Information
 * \else
 * ��������������Ϣ
 * \endif
 */
public class CFG_TALKBACK_INFO implements Serializable{
	
	private static final long 	serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Enable
	 * \else
	 * ��������ʹ��
	 * \endif
	 */
	public boolean		bCallEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Calls Originating
	 * \else
	 * �������з���
	 * \endif
	 * @see EM_CALLER_TYPE
	 */
	public int		emCallerType;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Protocol
	 * \else
	 * ��������Э��
	 * \endif
	 * @see EM_CALLER_PROTOCOL_TYPE
	 */
	public int		emCallerProtocol;
}
