package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * record mode
 * \else
 * ¼��ģʽ
 * \endif
 */
public class NET_EM_RECORD_MODE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * mode unknown
	 * \else
	 * δ֪����
	 * \endif
	 */
	public static final int	NET_EM_RECORD_MODE_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * transcribe record mode
	 * \else
	 * ����ģʽ
	 * \endif
	 */
	public static final int	NET_EM_RECORD_MODE_TRANSCRIBE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * normal record mode
	 * \else
	 * ��ͨģʽ
	 * \endif
	 */
	public static final int	NET_EM_RECORD_MODE_NORMAL = 2;

}
