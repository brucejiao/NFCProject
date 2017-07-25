package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snap function configuration
 * \else
 * ץͼ��������
 * \endif
 */
public class SDKDEV_SNAP_CFG implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * \if ENGLISH_LANG
	 * Schedule snap button. (Go to alarm activation setup interface to enable alarm snap function.)
	 * \else
	 * ��ʱץͼ����(����ץͼ�����ڸ�������������������)
	 * \endif
	 */
	public byte             bTimingEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * timing snapshot interval hour
	 * \else
	 * ��ʱץͼʱ����Сʱ��
	 * \endif
	 */
	public byte             bPicIntervalHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Schedule snap interval. Unit is second. Now device max supports 30 minutes interval. 
	 * \else
	 * ��ʱץͼʱ��������λΪ��,Ŀǰ�豸֧������ץͼʱ����Ϊ30����
	 * \endif
	 */
	public short            PicTimeInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap encode setup. Now supports resolution, video quality, frame rate setup. The frame rate here is negative number. It stands for the snap amount in one second.
	 * \else
	 * ץͼ�������ã���֧�����еķֱ��ʡ����ʡ�֡�����ã�֡���������Ǹ�������ʾһ��ץͼ�Ĵ�����
	 * \endif
	 */
	public SDK_VIDEOENC_OPT  struSnapEnc[] = new SDK_VIDEOENC_OPT[SNAP_TYPE.SNAP_TYP_NUM];     // ץͼ�������ã���֧�����еķֱ��ʡ����ʡ�֡�����ã�֡���������Ǹ�������ʾһ��ץͼ�Ĵ�����
	
	public SDKDEV_SNAP_CFG() {
		for (int i = 0; i < SNAP_TYPE.SNAP_TYP_NUM; i++) {
			struSnapEnc[i] = new SDK_VIDEOENC_OPT();
		}
	}
}
