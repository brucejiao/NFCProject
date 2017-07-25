package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP ability to describe��the type of expansion��the corresponding CLIENT_QueryDevState interface
 * \else
 * DSP������������չ���ͣ���ӦQueryDevState�ӿ�
 * \endif
 */
public class SDKDEV_DSP_ENCODECAP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video format mask bit device can support video format 
	 * \else
	 * ��Ƶ��ʽ���룬��λ��ʾ�豸�ܹ�֧�ֵ���Ƶ��ʽ
	 * \endif
	 */
	public int				dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask��the device can support the resolution represented by bit 
	 * \else
	 * �ֱ������룬��λ��ʾ�豸�ܹ�֧�ֵķֱ���
	 * \endif
	 */
	public int				dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Encoding mode mask, the device can support the resolution represented by bit
	 * \else
	 * ����ģʽ���룬��λ��ʾ�豸�ܹ�֧�ֵı���ģʽ
	 * \endif
	 */
	public int				dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit indicates the device supports multimedia features\n
	 * First expressed support for the main stream,\n
	 * Expressed support for auxiliary stream1,\n
	 * Expressed support for third place auxiliary stream2,\n
	 * Fifth expressed support for jpg shots
	 * \else
	 * ��λ��ʾ�豸֧�ֵĶ�ý�幦��\n
	 * ��һλ��ʾ֧��������\n
	 * �ڶ�λ��ʾ֧�ָ�����1\n
	 * ����λ��ʾ֧�ָ�����2\n
	 * ����λ��ʾ֧��jpgץͼ
	 * \endif
	 */
	public int				dwStreamCap;			

	/**
	 * \if ENGLISH_LANG
	 * Said that the main stream for each resolution,the auxiliary stream resolution mask support
	 * \else
	 * ��ʾ������Ϊ���ֱ���ʱ��֧�ֵĸ������ֱ������롣
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[32];
	
	/**
	 * \if ENGLISH_LANG
	 * DSP support the highest coding capacity 
	 * \else
	 * DSP֧�ֵ���߱������� 
	 * \endif
	 */
	public int				dwMaxEncodePower;
	
	/**
	 * \if ENGLISH_LANG
	 * Each DSP supports up to enter the number of video channels 
	 * \else
	 * ÿ��DSP֧�����������Ƶͨ���� 
	 * \endif
	 */
	public short				wMaxSupportChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * DSP per channel encoding settings synchronization; 0: no sync, 1: Synchronous 
	 * \else
	 * DSPÿͨ���������������Ƿ�ͬ����0����ͬ����1��ͬ��
	 * \endif
	 */
	public short				wChannelMaxSetSync;
	
	/**
	 * \if ENGLISH_LANG
	 * The largest acquisition frame rate, resolution and dwVideoStandardMask corresponding bitwise
	 * \else
	 * ��ͬ�ֱ����µ����ɼ�֡�ʣ���dwVideoStandardMask��λ��Ӧ.
	 * \endif
	 */
	public byte				bMaxFrameOfImageSize[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. The configuration shall meet the following requirements, otherwise the configuration is invalid.
	 * 0 Main stream encoding + auxiliary stream encoding capability <= encoding 
	 * 1 Main stream encoding + auxiliary stream encoding capability <= encoding 
	 * 2 The auxiliary stream coding capacity <= main-stream encoding capabilities 
	 * 3 Resolution <= resolution of the main stream of the auxiliary stream 
	 * 4 Framerate <= front-end video capture frame rate of the main stream and secondary stream 
	 * \else
	 * ��־������ʱҪ����������������������ò�����Ч��
	 * 0 �������ı�������+�������ı������� <= �豸�ı������� 
	 * 1 �������ı�������+�������ı������� <= �豸�ı������� 
	 * 2 �������ı������� <= �������ı������� 
	 * 3 �������ķֱ��� <= �������ķֱ��� 
	 * 4 �������͸�������֡�� <= ǰ����Ƶ�ɼ�֡�� 
	 * \endif
	 */
	public byte				bEncodeCap;
}
