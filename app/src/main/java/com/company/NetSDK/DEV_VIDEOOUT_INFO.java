package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device TV display info
 * \else
 * �豸TV���������Ϣ
 * \endif
 */
public class DEV_VIDEOOUT_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP,video standard mask,according to the bit which shows video format(not support now)
	 * \else
	 * NSP,��Ƶ��ʽ���룬��λ��ʾ�豸�ܹ�֧�ֵ���Ƶ��ʽ(�ݲ�֧��)
	 * \endif
	 */
	public int           dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP,current format(not support now,please use DHDEV_SYSTEM_ATTR_CFG by VideoStandard to read and config the video format)
	 * \else
	 * NSP,��ǰ����ʽ(�ݲ�֧�֣���ʹ��DHDEV_SYSTEM_ATTR_CFG��byVideoStandard����ʽ��ȡ������)
	 * \endif
	 */
	public int             nVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask,according the bit which shows video resolution
	 * \else
	 * �ֱ������룬��λ��ʾ�豸�ܹ�֧�ֵķֱ���
	 * \endif
	 */
	public int           dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Current resolution
	 * \else
	 * ��ǰ�ķֱ���
	 * \endif
	 */
	public int             nImageSize;
}
