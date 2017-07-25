package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NVS config, including multiple servers
 * \else
 * ����洢����������, �������������
 * \endif
 */
public class CFG_NAS_GROUP_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage server quantity
	 * \else
	 * �洢����������
	 * \endif
	 */
	public int				nNasNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage server group
	 * \else
	 * �洢����������	
	 * \endif
	 */
	public CFG_NAS_INFO_NEW[]			stuNasInfo = new CFG_NAS_INFO_NEW[FinalVar.MAX_NAS_NUM];
	
	public CFG_NAS_GROUP_INFO() {
		for (int i = 0; i < FinalVar.MAX_NAS_NUM; ++i) {
			this.stuNasInfo[i] = new CFG_NAS_INFO_NEW();
		}
	}
}
