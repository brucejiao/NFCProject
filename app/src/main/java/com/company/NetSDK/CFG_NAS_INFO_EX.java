package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NVS config
 * \else
 * ����洢����������
 * \endif
 */
public class CFG_NAS_INFO_EX implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 0, 1, based on capacity, read-only
	 * \else
	 * 0, 1, ��������ȷ��, ֻ��
	 * \endif
	 */
	public int				nVersion;
	
 	/**
	 * \if ENGLISH_LANG
	 * nVersion == 0 valid, for single server only
	 * \else
	 * nVersion == 0ʱ��Ч, ��֧�ֵ�������
	 * \endif
	 */
	public CFG_NAS_INFO		stuNasOld = new CFG_NAS_INFO();
	
 	/**
	 * \if ENGLISH_LANG
	 * nVersion == 1 valid, for multiple servers
	 * \else
	 * nVersion == 1ʱ��Ч, ֧�ֶ��������
	 * \endif
	 */
	public CFG_NAS_GROUP_INFO stuNasGroup = new CFG_NAS_GROUP_INFO();
}
