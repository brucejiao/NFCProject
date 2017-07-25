package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Night special configuration
 * \else
 * ҹ����������
 * \endif
 */
public class SDKDEV_NIGHTOPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0 - switch 1- Switch
	 * \else
	 * 0-���л���1-�л�
	 * \endif
	 */
	public byte  bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Approximate sunrise and sunset times, after sunset and before sunrise, the night special configuration.00:00:00 ~23:59:59
	 * \else
	 * �����ճ�������ʱ�䣬����֮���ճ�֮ǰ��������ҹ����������á�00:00:00 ~23:59:59
	 * \endif
	 */
	public byte  bSunriseHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * ͬ��
	 * \endif
	 */
	public byte  bSunriseMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * ͬ��
	 * \endif
	 */
	public byte  bSunriseSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * ͬ��
	 * \endif
	 */
	public byte  bSunsetHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * ͬ��
	 * \endif
	 */
	public byte  bSunsetMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * ͬ��
	 * \endif
	 */
	public byte  bSunsetSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * White Balance 0:Disabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night 7: Custom
	 * \else
	 * ��ƽ�� 0:Disabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night 7: Custom
	 * \endif
	 */
	public byte  bWhiteBalance ;
	
	/**
	 * \if ENGLISH_LANG
	 * Red gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
	 * \endif
	 */
	public byte  bGainRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
	 * \endif
	 */
	public byte  bGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Green gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
	 * \endif
	 */
	public byte  bGainGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * 0~100
	 * \else
	 * 0~100
	 * \endif
	 */
	public byte  bGain;
	
	/**
	 * \if ENGLISH_LANG
	 * 0 -Dose not automatic gain 1 - automatic gain
	 * \else
	 * 0-���Զ����� 1-�Զ�����
	 * \endif
	 */
	public byte  bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness values 0~100
	 * \else
	 * ����ֵ 0~100
	 * \endif
	 */
	public byte  bBrightnessThreshold ;
	
	/**
	 * \if ENGLISH_LANG
	 * Level reference value 0~100
	 * \else
	 * ��ƽ�ο�ֵ 0~100
	 * \endif
	 */
	public byte  ReferenceLevel;
	
	/**
	 * \if ENGLISH_LANG
	 * The range depends on the device capability set: 0 - AE 1 ~ n-1-manual exposure and lower limits on the level n-band time automatic exposure n +1- custom time manual exposure (n represents the number of exposure level support) 
	 * \else
	 * ȡֵ��Χȡ�����豸��������0-�Զ��ع� 1~n-1-�ֶ��ع�ȼ� n-��ʱ�������޵��Զ��ع� n+1-�Զ���ʱ���ֶ��ع� (n��ʾ֧�ֵ��ع�ȼ���) 
	 * \endif
	 */
	public byte  bExposureSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatic exposure to the lower limit of custom or manual exposure time, in milliseconds, the value 0.1ms ~ 80ms
	 * \else
	 * �Զ��ع�ʱ�����޻����ֶ��ع��Զ���ʱ��,����Ϊ��λ��ȡֵ0.1ms~80ms
	 * \endif
	 */
	public float ExposureValue1;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatic exposure time limit milliseconds, the value of 0.1ms ~ 80ms
	 * \else
	 * �Զ��ع�ʱ������,����Ϊ��λ��ȡֵ0.1ms~80ms
	 * \endif
	 */
	public float ExposureValue2;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable auto iris, 1 Open, 0 Close
	 * \else
	 * �Զ���Ȧʹ��,1����,0�ر�
	 * \endif
	 */
	public byte  bAutoApertureEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Wide dynamic value Range is determined by the ability
	 * \else
	 * ��ֵ̬ ȡֵ��Χ����������
	 * \endif
	 */
	public byte  bWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * Night phase 0~360 
	 * \else
	 * ҹ����λ 0~360
	 * \endif
	 */
	public short  wNightSyncValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Night phase of 0 to 999 (thousandth of a degree), in combination with wNightSyncValue constituting the phase values ??in the evening
	 * \else
	 * ҹ����λ0~999(ǧ��֮һ��),��wNightSyncValue��Ϲ���ҹ����λֵ
	 * \endif
	 */
	public short  wNightSyncValueMillValue;
}
