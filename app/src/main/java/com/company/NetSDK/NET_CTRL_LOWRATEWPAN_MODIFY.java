package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * modify device info
 * \else
 * �޸������豸��Ϣ
 * \endif
 */
public class NET_CTRL_LOWRATEWPAN_MODIFY implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Can only Modify the szName or bEnable of NET_CODEID_INFO.
	 * \else
	 * �����޸� NET_CODEID_INFO �е� szName ��  bEnable �ֶ�
	 * \endif
	 */
	public NET_CODEID_INFO stuCodeIDInfo = new NET_CODEID_INFO();    
}
