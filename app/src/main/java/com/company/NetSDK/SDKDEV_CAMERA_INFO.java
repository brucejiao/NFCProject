package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Camera properties
 * \else
 * ����ͷ����
 * \endif
 */
public class SDKDEV_CAMERA_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Adjustable brightness 1��Can��0��No 
	 * \else
	 * ���ȿɵ���1���ɣ�0������
	 * \endif
	 */
	public byte				bBrightnessEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable contrast 
	 * \else
	 * �Աȶȿɵ�
	 * \endif
	 */
	public byte				bContrastEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Color adjustable 
	 * \else
	 * ɫ�ȿɵ�
	 * \endif
	 */
	public byte				bColorEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable Gain 
	 * \else
	 * ����ɵ�
	 * \endif
	 */
	public byte				bGainEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Saturation adjustable 
	 * \else
	 * ���Ͷȿɵ�
	 * \endif
	 */
	public byte				bSaturationEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Backlight compensation,0 means no backlight compensation,1 expressed support for a compensation (on, off) 
	 * \else
	 * ���ⲹ�� 0��ʾ��֧�ֱ��ⲹ��,1��ʾ֧��һ����������,�أ���2��ʾ֧��������������,��,�ͣ���3��ʾ֧��������������,��,��,�ͣ�
	 * \endif
	 */
	public byte				bBacklightEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Exposure select 0 indicates no support Exposure Control��1 indicates that only support automatic exposure��Number of other expressed support for the exposure speed rating��+1 Level of manual control 
	 * \else
	 * �ع�ѡ��: 0:��ʾ��֧���ع���� 1:��ʾֻ֧���Զ��ع� n:�ع�ĵȼ���(1��ʾ֧���Զ��ع� 2~n��ʾ֧�ֵ��ֶ������ع�ĵȼ�)
	 * \endif
	 */
	public byte				bExposureEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable automatic color black conversion 
	 * \else
	 * �Զ��ʺ�ת���ɵ�
	 * \endif
	 */
	public byte				bColorConvEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Attribute options; 1: can 0: not 
	 * \else
	 * ����ѡ�1���ɣ�0������
	 * \endif
	 */
	public byte				bAttrEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Mirror; 1: Support,0: does not support 
	 * \else
	 * ����1��֧�֣�0����֧��
	 * \endif
	 */
	public byte				bMirrorEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Turn��1: Support,0: does not support 
	 * \else
	 * ��ת��1��֧�֣�0����֧��
	 * \endif
	 */
	public byte				bFlipEn;
	
	/**
	 * \if ENGLISH_LANG
	 * White Balance 2 Support Profile�� 1 Support for white balance ��0 does not support 
	 * \else
	 * ��ƽ�� 0-��֧�ְ�ƽ�⣬1-֧���Զ���ƽ�⣬2-֧��Ԥ�ð�ƽ�⣨���龰ģʽ�� 3-֧���Զ����ƽ��
	 * \endif
	 */
	public byte				iWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal format mask��Bitwise respectively, from low to high��0-Inside(Inside) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF 
	 * \else
	 * �źŸ�ʽ���룬��λ�ӵ͵���λ�ֱ�Ϊ��0-Inside(�ڲ�����) 1- BT656 2-720p 3-1080i  4-1080p  5-1080sF
	 * \endif
	 */
	public byte				iSignalFormatMask;
	
	/**
	 * \if ENGLISH_LANG
	 * 90 degree rotation 0 - do not support, 1 - Support 
	 * \else
	 * 90����ת 0-��֧�� 1-֧��
	 * \endif
	 */
	public byte				bRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the auto exposure with time the upper and lower limits 
	 * \else
	 * �Ƿ�֧�ִ�ʱ�������޵��Զ��ع�
	 * \endif
	 */
	public byte				bLimitedAutoExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support user-defined manual exposure time 
	 * \else
	 * �Ƿ�֧���û��Զ����ֶ��ع�ʱ��
	 * \endif
	 */
	public byte				bCustomManualExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the flash adjustment 
	 * \else
	 * �Ƿ�֧������Ƶ���
	 * \endif
	 */
	public byte				bFlashAdjustEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support night options 
	 * \else
	 * �Ƿ�֧��ҹ��ѡ��
	 * \endif
	 */
	public byte				bNightOptions;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the reference level set 
	 * \else
	 * �Ƿ�֧�ֲο���ƽ����
	 * \endif
	 */
	public byte             iReferenceLevel;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support external sync signal input, 0 - not support, 1 - Support 
	 * \else
	 * �Ƿ�֧���ⲿͬ���ź����룬0-��֧�֣�1-֧��
	 * \endif
	 */
	public byte             bExternalSyncInput;
	
	/**
	 * \if ENGLISH_LANG
	 * Custom exposure the interval maximum exposure time, in milliseconds 
	 * \else
	 * �Զ����ع���������ع�ʱ�䣬��λ����         
	 * \endif
	 */
	public short      		usMaxExposureTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Custom exposure the interval mainimum exposure time, in milliseconds
	 * \else
	 * �Զ����ع�������С�ع�ʱ�䣬��λ����
	 * \endif
	 */
	public short      		usMinExposureTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Ability to wide dynamic range, 0 - indicates no support, 2 ~ n represents the maximum range values 
	 * \else
	 * ��̬������Χ,0-��ʾ��֧��,2~n��ʾ���ķ�Χֵ
	 * \endif
	 */
	public byte             bWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * The double shutter 0 does not support 1 - full frame rate supports dual shutter images and video only shutter parameter - Supports dual shutter half frame rate, image and video shutter 
	 * and white balance parameters are different - Supports dual shutter Full frame rate and half of the frame rate  
	 * \else
	 * ˫����0��֧��,1-֧��˫����ȫ֡�ʣ���ͼ�����Ƶֻ�п��Ų�����ͬ��2-֧��˫���Ű�֡�ʣ���ͼ�����Ƶ���ż���ƽ���������ͬ��3-֧��˫����ȫ֡�ʺͰ�֡��
	 * \endif
	 */
	public byte             bDoubleShutter;
	
	/**
	 * \if ENGLISH_LANG
	 * 1 yes�� 0 no 
	 * \else
	 * 1֧�֣� 0 ��֧��
	 * \endif
	 */
	public byte				byExposureCompensation;
}
