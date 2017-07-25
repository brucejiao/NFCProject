package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power Type
 * \else
 * ��Դ����
 * \endif
 */
public class EM_POWER_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Main Power
	 * \else
	 * ����Դ
	 * \endif
	 */
	public static final int EM_POWER_TYPE_MAIN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Backup Power
	 * \else
	 * ���õ�Դ
	 * \endif
	 */
	public static final int EM_POWER_TYPE_BACKUP = 1;
}
