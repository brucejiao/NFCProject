package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_POINT_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Read-only parameter, shall return to sdk when set, it means supported pre-set number
	 * \else
	 * ֻ�����������õ�ʱ����Ҫ���ظ�sdk����ʾ֧�ֵ�Ԥ�Ƶ���
	 * \endif
	 */
	public int              nSupportNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * 2D config means point info.
	 * \else
	 * ��ά�±��ʾͨ���š�Ҫ���õĵ���ֵ����ǰnSupportNum���±����档
	 * \endif
	 */
	public POINTCFG         stuPointCfg[] = new POINTCFG[16]; 
	
	public SDKDEV_POINT_CFG() {
		for (int i = 0; i < 16; i++) {
			stuPointCfg[i] = new POINTCFG();
		}
	}
}
