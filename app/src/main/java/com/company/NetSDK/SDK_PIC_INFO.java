package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture info
 * \else
 * �����ӦͼƬ�ļ���Ϣ
 * \endif
 */
public class SDK_PIC_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current picture file's offset in the binary file, byte
	 * \else
	 * �ļ��ڶ��������ݿ��е�ƫ��λ��, ��λ:�ֽ�
	 * \endif
	 */
	public int                dwOffSet;
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture file's size, byte
	 * \else
	 * �ļ���С, ��λ:�ֽ�
	 * \endif
	 */
	public int                dwFileLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture width, pixel
	 * \else
	 * ͼƬ���, ��λ:����
	 * \endif
	 */
	public int                wWidth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture high, pixel
	 * \else
	 * ͼƬ�߶�, ��λ:����          
	 * \endif
	 */
	public int                wHeight;
}
