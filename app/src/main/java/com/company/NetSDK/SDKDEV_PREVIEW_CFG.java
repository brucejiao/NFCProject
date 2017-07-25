package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Preview video parameter
 * \else
 * Ԥ��ͼ�����
 * \endif
 */
public class SDKDEV_PREVIEW_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel audio/video property
	 * \else
	 * ͨ������Ƶ����
	 * \endif
	 */
	public SDK_VIDEOENC_OPT     stPreView = new SDK_VIDEOENC_OPT();
	
	/**
	 * \if ENGLISH_LANG
	 * Video color property
	 * \else
	 * ������ɫ����
	 * \endif
	 */
	public SDK_COLOR_CFG        stColorCfg[] = new SDK_COLOR_CFG[FinalVar.SDK_N_COL_TSECT];
	
	public SDKDEV_PREVIEW_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_COL_TSECT; i++) {
			stColorCfg[i] = new SDK_COLOR_CFG();
		}
	}
}
