package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input options
 * \else
 * ��Ƶ����ǰ��ѡ��
 * \endif
 */
public class CFG_VIDEO_IN_OPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * BLC:Range value depends on device capacity set, 0-off, 1-BLC level 1, 2- BLC level 2...n-max BLC level
	 * \else
	 * ���ⲹ����ȡֵ��Χȡ�����豸��������0-�ر�1-����2-ָ�����򱳹ⲹ��
	 * \endif
	 */
	public byte				byBacklight;
	
	/**
	 * \if ENGLISH_LANG
	 * Day/night mode; 0-color.1-automatic switch according to the brightness.2- black/white
	 * \else
	 * ��/ҹģʽ��0-���ǲ�ɫ��1-���������Զ��л���2-���Ǻڰ�
	 * \endif
	 */
	public byte				byDayNightColor;
	
	/**
	 * \if ENGLISH_LANG
	 * WB. 0-"Disable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \else
	 * ��ƽ��, 0-"Disable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \endif
	 */
	public byte				byWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * Color temperature level. valid when WB is "CustomColorTemperature" .
	 * \else
	 * ɫ�µȼ�, ��ƽ��Ϊ"CustomColorTemperature"ģʽ����Ч
	 * \endif
	 */
	public byte				byColorTemperature;
	
	/**
	 * \if ENGLISH_LANG
	 * Mirror
	 * \else
	 * ����
	 * \endif
	 */
	public boolean				bMirror;
	
	/**
	 * \if ENGLISH_LANG
	 * Flip
	 * \else
	 * ��ת
	 * \endif
	 */
	public boolean				bFlip;
	
	/**
	 * \if ENGLISH_LANG
	 * Iris automatic
	 * \else
	 * �Զ���Ȧ
	 * \endif
	 */
	public boolean				bIrisAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto enable IR compensation light according to the environment.
	 * \else
	 * ���ݻ������Զ��������ⲹ����
	 * \endif
	 */
	public boolean				bInfraRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Red gain red. Valid when WB is "Custom" mode (0~100)
	 * \else
	 * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
	 * \endif
	 */
	public byte				byGainRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue gain setup. Valid when WB is "Custom" mode (0~100)
	 * \else
	 * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
	 * \endif
	 */
	public byte				byGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Green gain. Valid when WB is "Custom" mode  (0~100)
	 * \else
	 * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
	 * \endif
	 */
	public byte				byGainGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * Exposure mode; range value depends on device capacity set; 0-automatic, 1- exposure level1, 2-exposure level 2.  Mn-1:Max exposure level  n auto exposure of max and min time. n+1 custom exposure time (n==byExposureEn)
	 * \else
	 * �ع�ģʽ��ȡֵ��Χȡ�����豸��������0-�Զ��ع⣬1-�ع�ȼ�1��2-�ع�ȼ�2��n-1����ع�ȼ��� n��ʱ�������޵��Զ��ع� n+1�Զ���ʱ���ֶ��ع� (n==byExposureEn��
	 * \endif
	 */
	public byte				byExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto exposure value min limit or manual axposure custom, unit is millisecond (0.1ms~80ms).
	 * \else
	 * �Զ��ع�ʱ�����޻����ֶ��ع��Զ���ʱ��,����Ϊ��λ��ȡֵ0.1ms~80ms
	 * \endif
	 */
	public float				fExposureValue1;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto exposure time max limit, unit is millisecond (0.1ms~80ms)
	 * \else
	 * �Զ��ع�ʱ������,����Ϊ��λ��ȡֵ0.1ms~80ms
	 * \endif
	 */
	public float				fExposureValue2;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto gain 
	 * \else
	 * �Զ�����
	 * \endif
	 */
	public boolean				bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * When gainAuto is true, it is max gain automatic limit, otherwise, it is fixed value gain
	 * \else
	 * �������, GainAutoΪtrueʱ��ʾ�Զ���������ޣ������ʾ�̶�������ֵ
	 * \endif
	 */
	public byte				byGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal format, 0-Inside (internal input).1-BT656 2-720p 3-1080p  4-1080i  5-1080sF 
	 * \else
	 * �źŸ�ʽ, 0-Inside(�ڲ�����) 1-BT656 2-720p 3-1080p  4-1080i  5-1080sF
	 * \endif
	 */
	public byte				bySignalFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-non-rotate, 1- rotate 90 clockwise, 2-rotate 90 counterclockwise
	 * \else
	 * 0-����ת��1-˳ʱ��90�㣬2-��ʱ��90��
	 * \endif
	 */
	public byte				byRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * External sych phase set up.0~360	
	 * \else
	 * ��ͬ������λ���� 0~360
	 * \endif
	 */
	public float               fExternalSyncPhase;
	
	/**
	 * \if ENGLISH_LANG
	 * External sync signal input, 0-INT. 1- LL
	 * \else
	 * �ⲿͬ���ź�����,0-�ڲ�ͬ�� 1-�ⲿͬ��
	 * \endif
	 */
	public byte                byExternalSync;
	
	/**
	 * \if ENGLISH_LANG
	 * Double exposure, 0-not use, 1-double exposure with full frame, as image and video differentiated only in parameter  2- double  exposure with half frame, as image and and video differentiated completely
	 * \else
	 * ˫����, 0-�����ã�1-˫����ȫ֡�ʣ���ͼ�����Ƶֻ�п��Ų�����ͬ��2-˫���Ű�֡�ʣ���ͼ�����Ƶ���ż���ƽ���������ͬ
	 * \endif
	 */
	public byte				byDoubleExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * WDR value
	 * \else
	 * ��ֵ̬
	 * \endif
	 */
	public byte                byWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * Night config
	 * \else
	 * ҹ�����
	 * \endif
	 */
	public CFG_VIDEO_IN_NIGHT_OPTIONS stuNightOptions = new CFG_VIDEO_IN_NIGHT_OPTIONS();
	
	/**
	 * \if ENGLISH_LANG
	 * Flashling config 
	 * \else
	 * ���������
	 * \endif
	 */
	public CFG_FLASH_CONTROL	stuFlash = new CFG_FLASH_CONTROL();
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot option, doule exposure only
	 * \else
	 * ץ�Ĳ���, ˫����ʱ��Ч
	 * \endif
	 */
	public CFG_VIDEO_IN_SNAPSHOT_OPTIONS stuSnapshot = new CFG_VIDEO_IN_SNAPSHOT_OPTIONS();
	
	/**
	 * \if ENGLISH_LANG
	 * fish eye
	 * \else
	 * ���۾�ͷ
	 * \endif
	 */
	public CFG_FISH_EYE        stuFishEye = new CFG_FISH_EYE();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-off��?1-easy focus��?2-auto focus
	 * \else
	 * 0-�رգ�1-�����۽���2-�Զ��۽�
	 * \endif
	 */
	public byte                byFocusMode;
	
	/**
	 * \if ENGLISH_LANG
	 * min gain
	 * \else
	 * ��������
	 * \endif
	 */
	public byte				byGainMin;
	
	/**
	 * \if ENGLISH_LANG
	 * max gain
	 * \else
	 * ��������
	 * \endif
	 */
	public byte				byGainMax;
	
	/**
	 * \if ENGLISH_LANG
	 * prevent flashing mode 0-Outdoor 1-50Hz prevent flashing 2-60Hz prevent flashing
	 * \else
	 * ����˸ģʽ 0-Outdoor 1-50Hz����˸ 2-60Hz����˸
	 * \endif
	 */
	public byte				byAntiFlicker;
	
	/**
	 * \if ENGLISH_LANG
	 * exposure mode, effective exposure levels for automatic exposure,0-auto,1-plus,4-manual
	 * \else
	 * �ع�ģʽ���� �ع�ȼ�Ϊ�Զ��ع�ʱ��Ч��ȡֵ��0-Ĭ���Զ���1-�������ȣ�2-��������,4-�ֶ�
	 * \endif
	 */
	public byte				byExposureMode;
	
	/**
	 * \if ENGLISH_LANG
	 * glare inhibition[1~100] 0-close
	 * \else
	 * ǿ������ 0-�رգ� 1~100Ϊ��Χֵ
	 * \endif
	 */
	public byte                byGlareInhibition;
	
	/**
	 * \if ENGLISH_LANG
	 * back light region       
	 * \else
	 * ���ⲹ������
	 * \endif
	 */
	public CFG_RECT			stuBacklightRegion = new CFG_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * normal option
	 * \else
	 * ��ͨ����
	 * \endif
	 */
	public CFG_VIDEO_IN_NORMAL_OPTIONS stuNormalOptions = new CFG_VIDEO_IN_NORMAL_OPTIONS();
}
