package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input nigh special configuration, automatically switch to night configuration when dark
 * \else
 * ��Ƶ����ҹ����������ѡ������Ϲ��߽ϰ�ʱ�Զ��л���ҹ������ò���
 * \endif
 */
public class CFG_VIDEO_IN_NIGHT_OPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0- do not switch, 1- switch by brightness, 2- switch by time
	 * \else
	 * �ѷ���,ʹ��CFG_VIDEO_IN_OPTIONS�����bySwitchMode
	 * 0-���л�������ʹ�ð������ã�1-���������л���2-����ʱ���л���3-���л�������ʹ��ҹ�����ã�4-ʹ����ͨ����
	 * \endif
	 */
	public byte				bySwitchMode;
	
	/**
	 * \if ENGLISH_LANG
	 * The current use of configuration files. 
	 * 0 - day
	 * 1 - night
	 * 2-Normal
	 * 0,1,2 are temporary configuration,make the image effect, easy to debug view image effect, do not click ok to leave the page is not saved to the device.
	 * 3 - Non-temporary configuration, and click OK to save to your device, used in conjunction with SwitchMode, decided to configure the final effect under SwitchMode.
	 * SwitchMode=0��?Profile=3��?Set the configuration to the device during the day;
	 * SwitchMode=1��?Profile=3��?Set the night configuration to the device 
	 * SwitchMode=2��?Profile=3��?According to sunrise and sunset time switch, use during the day time configuration during the day and night time use night configuration, save to equipment; 
	 * SwitchMode=4��?Profile=3��?Use common configuration ,saved to the device 
	 * \else
	 * ��ǰʹ�õ������ļ�.
	 * 0-����
	 * 1-����
	 * 2-Normal
	 * 0��1,2��Ϊ��ʱ���ã�ʹͼ����Ч�����ڲ鿴ͼ�����Ч���������ȷ�����뿪ҳ�治�������豸��
	 * 3-����ʱ���ã����ȷ���󱣴����豸����SwitchMode���ʹ�ã�����SwitchMode����������Ч�����á�
	 * SwitchMode=0��Profile=3�����ð������õ��豸��
	 * SwitchMode=1��Profile=3��������ҹ�����õ��豸
	 * SwitchMode=2��Profile=3�������ճ�����ʱ����л�������ʱ���ʹ�ð������ã�ҹ��ʱ���ʹ��ҹ�����ã��������豸��
	 * SwitchMode=4��Profile=3��ʹ����ͨ���ã��������豸
	 * \endif
	 */
	public byte				byProfile;
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness Threshold	 0~100
	 * \else
	 * ������ֵ 0~100
	 * \endif
	 */
	public byte				byBrightnessThreshold;	
	
	/**
	 * \if ENGLISH_LANG
	 * Sunrise and sunset time, night mode is on before sunrise and after sunset 
	 * \else
	 * �����ճ�������ʱ�䣬����֮���ճ�֮ǰ��������ҹ����������á�
	 * \endif
	 */
	public byte				bySunriseHour;
	
	/**
	 * \if ENGLISH_LANG
	 * 00:00:00 ~ 23:59:59
	 * \else
	 * 00:00:00 ~ 23:59:59
	 * \endif
	 */
	public byte				bySunriseMinute;
	public byte				bySunriseSecond;
	public byte				bySunsetHour;
	public byte				bySunsetMinute;
	public byte				bySunsetSecond;  
	
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
	 * Green gain. Valid when WB is "Custom" mode  (0~100)
	 * \else
	 * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
	 * \endif
	 */
	public byte				byGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue gain setup. Valid when WB is "Custom" mode (0~100)
	 * \else
	 * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
	 * \endif
	 */
	public byte				byGainGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * Exposure mode; range value depends on device capacity set; 0-automatic, 1- exposure level1,2-exposure level 2.  Mn-1:Max exposure level  n auto exposure of max and min time. n+1 custom exposure time (n==byExposureEn)
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
	 * WB. White 0-"Disable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \else
	 * ��ƽ��, 0-"Disable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \endif
	 */
	public byte				byWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * When gainAuto is true, it is max auto gain limit, otherwise, it is fixed value gain.
	 * \else
	 * 0~100, GainAutoΪtrueʱ��ʾ�Զ���������ޣ������ʾ�̶�������ֵ
	 * \endif
	 */
	public byte				byGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Gain 
	 * \else
	 * �Զ�����
	 * \endif
	 */
	public boolean				bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Iris 
	 * \else
	 * �Զ���Ȧ
	 * \endif
	 */
	public boolean				bIrisAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * 0~360 LL Phase
	 * \else
	 * ��ͬ������λ���� 0~360
	 * \endif
	 */
	public float               fExternalSyncPhase;
	
	/**
	 * \if ENGLISH_LANG
	 * gain min
	 * \else
	 * ��������
	 * \endif
	 */
	public byte				byGainMin;
	
	/**
	 * \if ENGLISH_LANG
	 * gain max
	 * \else
	 * ��������
	 * \endif
	 */
	public byte				byGainMax;
	
	/**
	 * \if ENGLISH_LANG
	 * backlight:ability to set value range depends on the device,0-close 1-open 2-backlingt compensation specified area
	 * \else
	 * ���ⲹ����ȡֵ��Χȡ�����豸��������0-�ر�1-����2-ָ�����򱳹ⲹ��
	 * \endif
	 */
	public byte				byBacklight;
	
	/**
	 * \if ENGLISH_LANG
	 * prevent flashing mode,0- out door, 1-50HZ prevent flashing,2-60HZ prevent flashing
	 * \else
	 * ����˸ģʽ 0-Outdoor 1-50Hz����˸ 2-60Hz����˸
	 * \endif
	 */
	public byte				byAntiFlicker;
	
	/**
	 * \if ENGLISH_LANG
	 * day or night,0-colour,1-according to the brightness auromatically switches,2-black and white
	 * \else
	 * ��/ҹģʽ��0-���ǲ�ɫ��1-���������Զ��л���2-���Ǻڰ�
	 * \endif
	 */
	public byte				byDayNightColor;
	
	/**
	 * \if ENGLISH_LANG
	 * exposure mode, effective exposure levels for automatic exposure,1-auto,2-plus,2-shutter
	 * \else
	 * �ع�ģʽ���� �ع�ȼ�Ϊ�Զ��ع�ʱ��Ч��ȡֵ��0-Ĭ���Զ���1-�������ȣ�2-��������
	 * \endif
	 */
	public byte				byExposureMode;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-not rotate,1-deasil 90,2-deasil 90
	 * \else
	 * 0-����ת��1-˳ʱ��90�㣬2-��ʱ��90��
	 * \endif
	 */
	public byte				byRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * mirror
	 * \else
	 * ����
	 * \endif
	 */
	public boolean				bMirror;
	
	/**
	 * \if ENGLISH_LANG
	 * wide dynamic range[1~100],0-close
	 * \else
	 * ��ֵ̬ 0-�رգ�1~100-Ϊ��ʵ��Χֵ
	 * \endif
	 */
	public byte                byWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * glare inhibition,0-close,[1-100]
	 * \else
	 * ǿ������ 0-�رգ� 1~100Ϊ��Χֵ
	 * \endif
	 */
	public byte                byGlareInhibition;
	
	/**
	 * \if ENGLISH_LANG
	 * backlight region
	 * \else
	 * ���ⲹ������
	 * \endif
	 */
	public CFG_RECT			stuBacklightRegion = new CFG_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-close��?1-aux focus��?2-auto focus
	 * \else
	 * 0-�رգ�1-�����۽���2-�Զ��۽�
	 * \endif
	 */
	public byte                byFocusMode;
}
