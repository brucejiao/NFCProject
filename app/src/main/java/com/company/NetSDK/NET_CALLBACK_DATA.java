package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Callback data(Asynchronous interface)
 * \else
 * �ص�����(�첽�ӿ�)
 * \endif
 */
public class NET_CALLBACK_DATA implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Result code;0:Success
	 * \else
	 * �����룻0���ɹ�
	 * \endif
	 */
	public int					nResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Receive data,buffer is opened by the user,from the interface parameters
	 * \else
	 * ��������
	 * \endif
	 */
	public char[]				pBuf;
	
	/**
	 * \if ENGLISH_LANG
	 * The length of receive data
	 * \else
	 * ���ճ���
	 * \endif
	 */
	public int					nRetLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Operating handle
	 * \else
	 * �������
	 * \endif
	 */
	public long				lOperateHandle;
	
	/**
	 * \if ENGLISH_LANG
	 * User parameters
	 * \else
	 * ������Ӧ�û�����
	 * \endif
	 */
	public long				userdata;
}
