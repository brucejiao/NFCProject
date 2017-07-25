package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Backup device type
 * \else
 * �����豸��������
 * \endif
 */
public class SDKDEV_BACKUP_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	 /**
  	 * \if ENGLISH_LANG
  	 * Private file system
  	 * \else
  	 * ˽���ļ�ϵͳ
  	 * \endif
  	 */
    public static final int                 BT_DHFS = 0;    
    /**
  	 * \if ENGLISH_LANG
  	 * Mobile hard disk drive 
  	 * \else
  	 * �ƶ�Ӳ��
  	 * \endif
  	 */
   	public static final int                BT_DISK = 1;      
   	/**
  	 * \if ENGLISH_LANG
  	 * CD record 
  	 * \else
  	 * ���̿�¼
  	 * \endif
  	 */
    public static final int                BT_CDRW = 2;                                 
}
