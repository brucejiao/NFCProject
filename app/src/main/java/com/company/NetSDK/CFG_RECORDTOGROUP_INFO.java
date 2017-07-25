package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record-storage group corresponding info
 * \else
 * ¼��-�洢�� ��Ӧ��Ϣ
 * \endif
 */
public class CFG_RECORDTOGROUP_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Id 
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int				nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ��  
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage Group Name, Read-only 
	 * \else
	 * �洢������, ֻ��
	 * \endif
	 */
	public byte[]			szGroupName = new byte[FinalVar.MAX_STORAGEGROUPNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage GroupIndex(1~max group, 0 no group) 
	 * \else
	 * �洢�����(1~�������, 0���ʾ�޶�Ӧ����)��ͨ���˲�����CFG_STORAGE_GROUP_INFO����
	 * \endif
	 */
	public int				nGroupIndex;
}
