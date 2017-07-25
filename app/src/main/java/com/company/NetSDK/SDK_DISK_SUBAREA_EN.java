package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Net Disk Partition ability Structure
 * \else
 * ����Ӳ�̷��������ṹ��
 * \endif
 */
public class SDK_DISK_SUBAREA_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Support NAS Partition or not 
	 * \else
	 * �Ƿ�֧������Ӳ�̷���
	 * \endif
	 */
	public boolean		bSupported;				

	/**
	 * \if ENGLISH_LANG
	 * Supported Partition Number 
	 * \else
	 * ֧�ַ�������Ŀ
	 * \endif
	 */
	public int			nSupportNum;			
}
