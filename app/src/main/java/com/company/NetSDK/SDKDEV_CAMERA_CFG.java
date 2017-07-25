package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Properties of the camera configuration
 * \else
 * ����ͷ��������
 * \endif
 */
public class SDKDEV_CAMERA_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Exposure mode; range depends on the device capability set: 0 - auto exposure, 1 - exposure level 1,2 - exposure level 2 ... n-maximum exposure level number
	 * \else
	 * �ع�ģʽ��ȡֵ��Χȡ�����豸��������0-�Զ��ع⣬1-�ع�ȼ�1��2-�ع�ȼ�2��n-����ع�ȼ���
	 * \endif
	 */
	public byte                bExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Backlight compensation: BLC Level range depends on the device capability set, 0 - off, 1 - backlight compensation intensity 1,2 - backlight compensation strength ... n-backlight compensation level number
	 * \else
	 * ���ⲹ�������ⲹ���ȼ�ȡֵ��Χȡ�����豸��������0-�رգ�1-���ⲹ��ǿ��1��2-���ⲹ��ǿ��2��n-��󱳹ⲹ���ȼ���
	 * \endif
	 */
    public byte                bBacklight;
    
    /**
     * \if ENGLISH_LANG
     * Day / Night mode (color); 2: open (black and white), 1: Auto: Off
     * \else
     * ��/ҹģʽ��2����(�ڰ�)��1���Զ���0����(��ɫ) 
     * \endif
     */
    public byte                bAutoColor2BW;
    
    /**
     * \if ENGLISH_LANG
     * Mirror; 1: open, 0: Off
     * \else
     * ����1������0����
     * \endif
     */
    public byte                bMirror;
    
    /**
     * \if ENGLISH_LANG
     * Flip; 1: ON, 0: OFF
     * \else
     * ��ת��1������0����
     * \endif
     */
    public byte                bFlip;
    
    /**
     * \if ENGLISH_LANG
     * Auto iris function capability: 1: support; 0: does not support
     * \else
     * �Զ���Ȧ��������: 1��֧�֣�0 ����֧��
     * \endif
     */
    public byte                bLensEn;
    
    /**
     * \if ENGLISH_LANG
     * Auto iris function: 1: Open the auto iris; 0: Turn off auto iris
     * \else
     * �Զ���Ȧ����: 1:�����Զ���Ȧ��0: �ر��Զ���Ȧ
     * \endif
     */
    public byte                bLensFunction;
    
    /**
     * \if ENGLISH_LANG
     * White Balance 0:Disabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night
     * \else
     * ��ƽ�� 0:Disabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night
     * \endif
     */
    public byte                bWhiteBalance;
    
    /**
     * \if ENGLISH_LANG
     * Signal format0-Inside(Internal input) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF
     * \else
     * �źŸ�ʽ0-Inside(�ڲ�����) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF
     * \endif
     */
    public byte                bSignalFormat;
    
    /**
     * \if ENGLISH_LANG
     * 0 - does not rotate, 1 - clockwise 90 ��, 2 - counterclockwise 90 ��
     * \else
     * 0-����ת��1-˳ʱ��90�㣬2-��ʱ��90��
     * \endif
     */
    public byte                bRotate90;
    
    /**
     * \if ENGLISH_LANG
     * Level reference value 0~100
     * \else
     * ��ƽ�ο�ֵ 0~100
     * \endif
     */
    public byte                bReferenceLevel;
    
    /**
     * \if ENGLISH_LANG
     * Automatic exposure to the lower limit of custom or manual exposure time, in milliseconds, the value 0.1ms ~ 80ms
     * \else
     * �Զ��ع�ʱ�����޻����ֶ��ع��Զ���ʱ��,����Ϊ��λ��ȡֵ0.1ms~80ms
     * \endif
     */
    public float               ExposureValue1;
    
    /**
     * \if ENGLISH_LANG
     * Automatic exposure time limit milliseconds, the value of 0.1ms ~ 80ms
     * \else
     * �Զ��ع�ʱ������,����Ϊ��λ��ȡֵ0.1ms~80ms
     * \endif
     */
    public float               ExposureValue2;
    
    /**
     * \if ENGLISH_LANG
     * The night configuration parameter options
     * \else
     * ҹ�����ò���ѡ��
     * \endif
     */
    public SDKDEV_NIGHTOPTIONS  stuNightOptions = new SDKDEV_NIGHTOPTIONS();
    
    /**
     * \if ENGLISH_LANG
     * Red gain adjustment, white balance "Custom" mode effectively 0 to 100
     * \else
     * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
     * \endif
     */
    public byte                bGainRed;
    
    /**
     * \if ENGLISH_LANG
     * Blue gain adjustment,White balance "Custom" mode effective 0~100
     * \else
     * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
     * \endif
     */
    public byte                bGainBlue;
    
    /**
     * \if ENGLISH_LANG
     * Green gain adjustment,White balance "Custom" mode effective 0~100
     * \else
     * ��ɫ������ڣ���ƽ��Ϊ"Custom"ģʽ����Ч 0~100
     * \endif
     */
    public byte                bGainGreen;
    
    /**
     * \if ENGLISH_LANG
     * Flash mode, 0 - Close, 1 - always, 2 - Automatic 
     * \else
     * ����ƹ���ģʽ��0-�رգ�1-ʼ�գ�2-�Զ�
     * \endif
     */
    public byte                bFlashMode;
    
    /**
     * \if ENGLISH_LANG
     * The the flash work values, 0-0us 1-64us-128us, ... 15-960us
     * \else
     * ����ƹ���ֵ, 0-0us, 1-64us, 2-128us,...15-960us
     * \endif
     */
    public byte                bFlashValue;
    
    /**
     * \if ENGLISH_LANG
     * Flash trigger mode 0 - low level - high level
     * \else
     * ����ƴ���ģʽ0-�͵�ƽ 1-�ߵ�ƽ
     * \endif
     */
    public byte                bFlashPole;
    
    /**
     * \if ENGLISH_LANG
     * External sync signal input, 0 - internal sync - external synchronization
     * \else
     * �ⲿͬ���ź�����,0-�ڲ�ͬ�� 1-�ⲿͬ��
     * \endif
     */
    public byte                bExternalSyncPhase;
    
    /**
     * \if ENGLISH_LANG
     * Flash brightness default values ??range from 0 to 100
     * \else
     * ���������Ԥ��ֵ ����0~100
     * \endif
     */
    public byte                bFlashInitValue;
    
    /**
     * \if ENGLISH_LANG
     * Outside the synchronization phase set 0~360
     * \else
     * ��ͬ������λ���� 0~360
     * \endif
     */
    public short                wExternalSyncValue ;
    
    /**
     * \if ENGLISH_LANG
     * 0 to 999 external synchronization phase (thousandth of a degree), and wExternalSyncValue combination constitute the external synchronization phase value
     * \else
     * ��ͬ������λ����0~999(ǧ��֮һ��),��wExternalSyncValue��Ϲ�����ͬ������λֵ
     * \endif
     */
    public short                wExternalSyncValueMillValue;
    
    /**
     * \if ENGLISH_LANG
     * Wide dynamic value Range is determined by the ability
     * \else
     * ��ֵ̬ ȡֵ��Χ����������
     * \endif
     */
    public byte                bWideDynamicRange;
    
    /**
     * \if ENGLISH_LANG
     * exposure compensation value,default is 7,range0~14
     * \else
     * �عⲹ��ֵ��Ĭ��Ϊ7����Χ0~14
     * \endif
     */
    public byte                byExposureCompensation;
}
