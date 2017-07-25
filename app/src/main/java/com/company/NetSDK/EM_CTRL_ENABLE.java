package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm enable control. 
 * \else
 * ����ʹ�ܿ��Ʒ�ʽö������
 * \endif
 */
public class EM_CTRL_ENABLE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * no control enable
	 * \else
	 * ������ʹ��
	 * \endif
	 */
	public static final int EM_CTRL_NORMAL = 0;   

	/**
	 * \if ENGLISH_LANG
	 * always enable
	 * \else
	 * ����ʹ��
	 * \endif
	 */
	public static final int EM_CTRL_ALWAYS_EN = 1;  

	/**
	 * \if ENGLISH_LANG
	 * bypass
	 * \else
	 * ��·
	 * \endif
	 */
	public static final int EM_CTRL_ONCE_DIS = 2;   

	/**
	 * \if ENGLISH_LANG
	 * remove
	 * \else
	 * �Ƴ�
	 * \endif
	 */
	public static final int EM_CTRL_ALWAYS_DIS = 3; 

	/**
	 * \if ENGLISH_LANG
	 * enumeration type total
	 * \else
	 * ö����������
	 * \endif
	 */
	public static final int EM_CTRL_NUM = 4;         
}
