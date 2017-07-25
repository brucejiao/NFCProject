package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Device HDD informaiton 
 * \else
 * �豸Ӳ����Ϣ
 * \endif
 */
public class SDK_HARDDISK_STATE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Amount
	 * \else
	 * ����
	 * \endif
	 */
	public int					dwDiskNum;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD or subarea information 
	 * \else
	 * Ӳ�̻������Ϣ
	 * \endif
	 */
	public NET_DEV_DISKSTATE	stDisks[] = new NET_DEV_DISKSTATE[FinalVar.SDK_MAX_DISKNUM];
	
	public SDK_HARDDISK_STATE() {
		for (int i = 0; i < FinalVar.SDK_MAX_DISKNUM; i++) {
			stDisks[i] = new NET_DEV_DISKSTATE();
		}
	}
}
