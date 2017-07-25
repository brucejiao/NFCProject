package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Unlock Method(Access control event,entry/exit record, actual unlock method)
 * \else
 * ���ŷ�ʽ(�Ž��¼�,�Ž������¼,ʵ�ʵĿ��ŷ�ʽ)
 * \endif
 */
public class NET_ACCESS_DOOROPEN_METHOD implements Serializable {
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
	public static final int NET_ACCESS_DOOROPEN_METHOD_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Password Unlock
	 * \else
	 * ���뿪��
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_PWD_ONLY = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Swipe Unlock
	 * \else
	 * ˢ������
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_CARD = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * SwipeCard and Unlock with Password
	 * \else
	 * ��ˢ�������뿪��
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_FIRST = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * InputPassword and Swipe Card to Unlock
	 * \else
	 * �������ˢ������
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_PWD_FIRST = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Remotely Unlock��such as unlock VTO via VTH or platform
	 * \else
	 * Զ�̿�������ͨ�����ڻ�����ƽ̨���ſڻ�����
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_REMOTE = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Unlock via Button
	 * \else
	 * ������ť���п���
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_BUTTON = 6;
}
