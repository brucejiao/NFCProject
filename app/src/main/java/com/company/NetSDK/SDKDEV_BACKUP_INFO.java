package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device backup list 
 * \else
 * �����豸��ϸ��Ϣ  
 * \endif
 */
public class SDKDEV_BACKUP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * �豸��
	 * \endif
	 */ 
    public byte[]             szName = new byte[32];  
	/**
	 * \if ENGLISH_LANG
	 * Backup device type
	 * \else
	 * �����豸�Ľ�������(ö��ֵ��SDKDEV_BACKUP_TYPE)
	 * \endif
	 */ 
    public byte               byType; 
	/**
	 * \if ENGLISH_LANG
	 * Interface type of backup device 
	 * \else
	 * �����豸�Ľӿ�����(ö��ֵ��SDKDEV_BACKUP_BUS)
	 * \endif
	 */
    public byte               byBus;    
    /**
	 * \if ENGLISH_LANG
	 * Capability 
	 * \else
	 * ������, ��kBytesΪ��λ
	 * \endif
	 */
    public int              nCapability;   
    /**
  	 * \if ENGLISH_LANG
  	 * Remain capability 
  	 * \else
  	 * ʣ������,��kBytesΪ��λ
  	 * \endif
  	 */
    public int              nRemain;                    
    /**
  	 * \if ENGLISH_LANG
  	 * Remote backup directory
  	 * \else
  	 * Զ�̱��ݵ�Ŀ¼
  	 * \endif
  	 */
    public byte[]          szDirectory = new byte[128];               
}
