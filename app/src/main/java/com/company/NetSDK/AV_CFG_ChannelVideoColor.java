package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel video input color config 
 * \else
 * ͨ����Ƶ������ɫ����
 * \endif
 */
public class AV_CFG_ChannelVideoColor implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel color config amount
	 * \else
	 * ͨ����ɫ������
	 * \endif
	 */
	public int			nColorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel color config. Each input video has several corresponding color setups.
	 * \else
	 * ͨ����ɫ����, ÿ��ͨ����Ӧ�����ɫ����
	 * \endif
	 */
	public AV_CFG_VideoColor	stuColor[] = new AV_CFG_VideoColor[FinalVar.AV_CFG_Max_VideoColor];
	
	public AV_CFG_ChannelVideoColor() {
		for (int i = 0; i < FinalVar.AV_CFG_Max_VideoColor; i++) {
			stuColor[i] = new AV_CFG_VideoColor();
		}
	}
}
