package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Card Type
 * \else
 * ������
 * \endif
 */
public class NET_ACCESSCTLCARD_TYPE implements Serializable {
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
	public static final int NET_ACCESSCTLCARD_TYPE_UNKNOWN = -1;
	
	/**
	 * \if ENGLISH_LANG
	 * Normal Card
	 * \else
	 * һ�㿨
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_GENERAL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * VIP
	 * \else
	 * VIP��
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_VIP = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Guest Card
	 * \else
	 * ������
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_GUEST = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Patrol Card
	 * \else
	 * Ѳ�߿�
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_PATROL = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Black List Card
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_BLACKLIST = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Threat Card
	 * \else
	 * в�ȿ�
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_CORCE = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Master Card
	 * \else
	 * ĸ��
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_MOTHERCARD = 0xff;
}
