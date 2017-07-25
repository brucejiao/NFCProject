package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * snap function extern configuration
 * \else
 * ץͼ����������չ
 * \endif
 */
public class SDKDEV_SNAP_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * timing diagram switch(in tach of the alarm configuration)
	 * \else
	 * ��ʱץͼ����(����ץͼ�����ڸ�������������������)
	 * \endif
	 */
	public byte             bTimingEnable;

	/**
	 * \if ENGLISH_LANG
	 * the number of hours interval
	 * \else
	 * ��ʱץͼʱ����Сʱ��
	 * \endif
	 */
	public byte             bPicIntervalHour;

	/**
	 * \if ENGLISH_LANG
	 * time interval(s),the biggest capture device support interval 30min now
	 * \else
	 * ��ʱץͼʱ��������λΪ��,Ŀǰ�豸֧������ץͼʱ����Ϊ30����
	 * \endif
	 */
	public short            PicTimeInterval;

	/**
	 * \if ENGLISH_LANG
	 * snap encode configuration,support resolution ,image quality and frame rate setting,frame rate is negative,say for a second to grasp figure number
	 * \else
	 * ץͼ�������ã���֧�����еķֱ��ʡ����ʡ�֡�����ã�֡���������Ǹ�������ʾһ��ץͼ�Ĵ�����
	 * \endif
	 */
	public SDK_VIDEOENC_OPT  struSnapEnc[] = new SDK_VIDEOENC_OPT[SNAP_TYPE.SNAP_TYP_NUM];

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ����������ÿ��ץͼʱ����ʱ�� ��λ��
	 * \endif
	 */
	public int            dwTrigPicIntervalSecond;
    
    public SDKDEV_SNAP_CFG_EX() {
    	for (int i = 0; i < SNAP_TYPE.SNAP_TYP_NUM; i++) {
    		struSnapEnc[i] = new SDK_VIDEOENC_OPT();
    	}
    }
}
