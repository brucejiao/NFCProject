package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * storage error
 * \else
 * �洢��������
 * \endif
 */
public class EM_STORAGE_ERROR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * no error
	 * \else
	 * ��
	 * \endif
	 */
	public static final int STORAGE_ERROR_NONE = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * patition error 
	 * \else
	 * ��������          
	 * \endif
	 */
	public static final int STORAGE_ERROR_PATITION = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * init system file error	
	 * \else
	 * ��ʼ���ļ�ϵͳ����    
	 * \endif
	 */
	public static final int STORAGE_ERROR_INIT_FS = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * read data error
	 * \else
	 * ������ʧ��
	 * \endif
	 */
	public static final int STORAGE_ERROR_READ_DATA = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * write data error
	 * \else
	 * д����ʧ��
	 * \endif
	 */
	public static final int STORAGE_ERROR_WRITE_DATA = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * RAID error
	 * \else
	 * RAID����
	 * \endif
	 */
	public static final int STORAGE_ERROR_RAID_FAILED = 5;
	
 	/**
	 * \if ENGLISH_LANG
	 * RAID degranded 
	 * \else
	 * RAID����
	 * \endif
	 */
	public static final int STORAGE_ERROR_RAID_DEGRADED = 6;
	
 	/**
	 * \if ENGLISH_LANG
	 * iSCSI error
	 * \else
	 * iSCSI����
	 * \endif
	 */
	public static final int STORAGE_ERROR_ISCSI_FAILED = 7;
}
