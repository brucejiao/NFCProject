package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get LowRateWPAN caps
 * \else
 * ��ȡ LowRateWPAN ����
 * \endif
 * @see FinalVar.CFG_CAP_CMD_LOWRATEWPAN
 */
public class CFG_CAP_LOWRATEWPAN implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Max page search code items
	 * \else
	 * ����ҳ��ѯ�Ķ�������
	 * \endif
	 */
	public int nMaxPageSize;			
}
