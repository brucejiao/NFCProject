package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP capacity description. Correspondign to GetDevConfig
 * \else
 * DSP������������Ӧ GetDevConfig �ӿ�
 * \endif
 */
public class SDK_DSP_ENCODECAP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video format mask. Bit stands for the video format device supported.
	 * \else
	 * ��Ƶ��ʽ���룬��λ��ʾ�豸�ܹ�֧�ֵ���Ƶ��ʽ
	 * \endif
	 */
	public int				dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask bit. Bit stands for the resolution setup devices supported.
	 * \else
	 * �ֱ������룬��λ��ʾ�豸�ܹ�֧�ֵķֱ�������
	 * \endif
	 */
	public int				dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode mode mask bit. Bit stands for the encode mode devices supported.
	 * \else
	 * ����ģʽ���룬��λ��ʾ�豸�ܹ�֧�ֵı���ģʽ����	
	 * \endif
	 */
	public int				dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * The multiple-media function the devices supported \n
	 * The first bit:main stream \n
	 * The second bit:extra stream 1 \n
	 * The third bit:extra stream 2 \n
	 * The fifth bit: snapshot in .jpg format
	 * \else
	 * ��λ��ʾ�豸֧�ֵĶ�ý�幦�ܣ� \n
	 * ��һλ��ʾ֧�������� \n
	 * �ڶ�λ��ʾ֧�ָ�����1 \n
	 * ����λ��ʾ֧�ָ�����2 \n
	 * ����λ��ʾ֧��jpgץͼ
	 * \endif
	 */
	public int				dwStreamCap;
												
	/**
	 * \if ENGLISH_LANG
	 * When the main stream is the corresponding resolution, the supported extra stream resolution mask.
	 * \else
	 * ��ʾ������Ϊ���ֱ���ʱ��֧�ֵĸ������ֱ������롣
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[8];
	
	/**
	 * \if ENGLISH_LANG
	 * The highest encode capacity DSP supported
	 * \else
	 * DSP֧�ֵ���߱������� 
	 * \endif
	 */
	public int				dwMaxEncodePower;
	
	/**
	 * \if ENGLISH_LANG
	 * The max video channel amount each DSP supported.
	 * \else
	 * ÿ��DSP֧�����������Ƶͨ���� 
	 * \endif
	 */
	public int				wMaxSupportChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max encode bit setup in each DSP channel  are synchronized or not ;0:does not synchronized,1:synchronized
	 * \else
	 * DSPÿͨ���������������Ƿ�ͬ����0����ͬ����1��ͬ��
	 * \endif
	 */
	public int				wChannelMaxSetSync;
}
