package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP extend capacity description. Corresponding to INetSDK.QueryDevState
 * \else
 * DSP��չ������������ӦINetSDK.QueryDevState�ӿ�
 * \endif
 */
public class SDKDEV_DSP_ENCODECAP_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video format mask. Bit stands for the video format device supported.
	 * \else
	 * ��Ƶ��ʽ���룬��λ��ʾ�豸�ܹ�֧�ֵ���Ƶ��ʽ
	 * \endif
	 */
	public int               dwVideoStandardMask;

	/**
	 * \if ENGLISH_LANG
	 * Resolution mask bit. Bit stands for the resolution setup devices supported.
	 * \else
	 * �ֱ������룬��λ��ʾ�豸�ܹ�֧�ֵķֱ���
	 * \endif
	 */
	public int               dwImageSizeMask;

	/**
	 * \if ENGLISH_LANG
	 * Encode mode mask bit. Bit stands for the encode mode devices supported.
	 * \else
	 * ����ģʽ���룬��λ��ʾ�豸�ܹ�֧�ֵı���ģʽ
	 * \endif
	 */
	public int               dwEncodeModeMask;

	/**
	 * \if ENGLISH_LANG
	 * The multiple-media function the devices supported.
	 * The first bit:main stream
	 * The second bit:extra stream 1
	 * The third bit:extra stream 2
	 * The forth bit:extra stream 3
	 * The fifth bit: snapshot in .jpg format
	 * \else
	 * ��λ��ʾ�豸֧�ֵĶ�ý�幦�ܣ�
	 * ��һλ��ʾ֧��������
	 *  �ڶ�λ��ʾ֧�ָ�����1
	 *  ����λ��ʾ֧�ָ�����2
	 *  ����λ��ʾ֧�ָ�����3
	 *  ����λ��ʾ֧��jpgץͼ
	 * \endif
	 */
	public int               dwStreamCap;

	/**
	 * \if ENGLISH_LANG
	 * When the main stream is the corresponding resolution, the supported extra stream resolution mask, the 0,1,2 member in the group correspond extra stream1,2,3
	 * \else
	 * ��ʾ������Ϊ���ֱ���ʱ��֧�ֵĸ������ֱ�������, �����е�0,1,2Ԫ�طֱ��������1,2,3
	 * \endif
	 */
	public int               dwImageSizeMask_Assi[][] = new int[3][64];
	/**
	 * \if ENGLISH_LANG
	 * The highest encode capacity DSP supported
	 * \else
	 * DSP֧�ֵ���߱�������
	 * \endif
	 */
	public int               dwMaxEncodePower;

	/**
	 * \if ENGLISH_LANG
	 * The max video channel amount each DSP supported.
	 * \else
	 * ÿ��DSP֧�����������Ƶͨ����
	 * \endif
	 */
	public short                wMaxSupportChannel;

	/**
	 * \if ENGLISH_LANG
	 * Max encode bit setup in each DSP channel  are synchronized or not;0:do not synchronized,1:synchronized
	 * \else
	 * DSPÿͨ���������������Ƿ�ͬ����0����ͬ����1��ͬ��
	 * \endif
	 */
	public short                wChannelMaxSetSync;

	/**
	 * \if ENGLISH_LANG
	 * The max sampling frame rate in different resolution. Bit corresponding to the dwVideoStandardMask.
	 * \else
	 * ��ͬ�ֱ����µ����ɼ�֡�ʣ���dwVideoStandardMask��λ��Ӧ
	 * \endif
	 */
	public byte                bMaxFrameOfImageSize[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. The configuration shall meet the following requirements, otherwise the configuration is invalid.
	 * 0:main stream encode capacity+extra stream encode capacity<= device encode capacity 
	 * 1:main stream encode capacity +extra stream encode capacity<= device encode capacity 
	 * Extra stream encode capacity <=main stream encode capacity 
	 * Extra stream resolution<=main stream resolution 
	 * Main stream resolution and extra stream resolution <=front-end video collection frame rate
	 * 2:N5 Device
	 * Extra stream encode capacity <=main stream encode capacity
	 * Query  the supported resolution and the corresponding maximum frame rate
	 * \else
	 * ��־������ʱҪ����������������������ò�����Ч��
	 * 0���������ı�������+�������ı������� <= �豸�ı���������
	 *  1���������ı�������+�������ı������� <= �豸�ı���������
	 *  �������ı������� <= �������ı���������
	 *  �������ķֱ��� <= �������ķֱ��ʣ�
	 *  �������͸�������֡�� <= ǰ����Ƶ�ɼ�֡��
	 *  2��N5�ļ��㷽��
	 *  �������ķֱ��� <= �������ķֱ���
	 *  ��ѯ֧�ֵķֱ��ʺ���Ӧ���֡��
	 * \endif
	 */
	public byte                bEncodeCap;

	/**
	 * \if ENGLISH_LANG
	 * bit0-main stream, bit1-extra stream1, bit2-extra stream2
	 * \else
	 * ��0λ��ʾ������, ������λ���α�ʾ������, ���һλ��ʾ������1,�ڶ��Ǳ�ʾ������2
	 * \endif
	 */
	public int               dwExtraStream;

	/**
	 * \if ENGLISH_LANG
	 * extra stream compression
	 * \else
	 * ÿһ��ֵ��ʾ��Ӧ�������ı����ʽ֧��
	 * \endif
	 */
	public int               dwCompression[] = new int[3];
}
