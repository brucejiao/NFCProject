package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage Position Group Information
 * \else
 * �洢����Ϣ
 * \endif
 */
public class CFG_STORAGEGROUP_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage Pool Name 
	 * \else
	 * �洢������
	 * \endif
	 */
	public byte[]				szGroupName = new byte[FinalVar.MAX_STORAGEGROUPNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Disks Buffer 
	 * \else
	 * ���������Ż�����
	 * \endif
	 */
	public int					nBufSize;
	
 	/**
	 * \if ENGLISH_LANG
	 * Buffer Length 
	 * \else
	 * ������byDisks�ĳ���
	 * \endif
	 */
	public byte[]				byDisks;
	
 	/**
	 * \if ENGLISH_LANG
	 * Disk Number 
	 * \else
	 * �洢���еĴ�����
	 * \endif
	 */
	public int					nDiskNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage Group INdex (1~Maximum Number of Disks) 
	 * \else
	 * �洢�����(1~���Ӳ����)
	 * \endif
	 */
	public int					nGoupIndex;
	
	public CFG_STORAGEGROUP_INFO(int nBufSize) {
		this.nBufSize = nBufSize;
		this.byDisks = new byte[nBufSize];
	}
}