package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP Ability Structure
 * \else
 * ����DSP�����ṹ��
 * \endif
 */
public class SDK_DSP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Number of SDK_DSP_CFG_ITEM 
	 * \else
	 * SDK_DSP_CFG_ITEM����Ч����,����ͨ����
	 * \endif
	 */
	public int				nItemNum;				

	/**
	 * \if ENGLISH_LANG
	 * Main Stream Information 
	 * \else
	 * ����������Ϣ
	 * \endif
	 */
	public SDK_DSP_CFG_ITEM	stuDspCfgItem[] = new SDK_DSP_CFG_ITEM[32];	
	
	public SDK_DSP_CFG() {
		for (int i = 0; i < 32; i++) {
			stuDspCfgItem[i] = new SDK_DSP_CFG_ITEM();
		}
	}
}
