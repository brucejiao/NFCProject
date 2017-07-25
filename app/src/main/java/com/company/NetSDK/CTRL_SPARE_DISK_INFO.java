package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * spake disk info
 * \else
 * �ȱ�����
 * \endif
 */
public class CTRL_SPARE_DISK_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * Enable��ʹ�ܣ�Disable����ʹ��
	 * \endif
	 */
	public byte		szAction[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Global,Local
	 * \else
	 * Global��ȫ���ȱ���Local����ȫ���ȱ�
	 * \endif
	 */
	public byte		szScope[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * �ȱ����֣���ScopeΪGlobal����Ϊ�ȱ��ص����ƣ������ʾRaid�������
	 * \endif
	 */
	public byte		szName[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * disk index
	 * \else
	 * �������
	 * \endif
	 */
	public int      nIndex;
}
