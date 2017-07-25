package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Watermark Congiguration
 * \else
 * ˮӡ����
 * \endif
 */
public class CFG_WATERMARK_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * ChannelID(from 0) 
	 * \else
	 * ͨ����(0��ʼ)
	 * \endif
	 */
	public int 					nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ�ܿ���
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Type(1��n)0-all 
	 * \else
	 * ��������(1��n)��0����������
	 * \endif
	 */
	public int					nStreamType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Data Type1-Character��2-Picture 
	 * \else
	 * �������ͣ�1�����֣�2��ͼƬ
	 * \endif
	 */
	public int					nDataType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Character Watermark Data 
	 * \else
	 * �ַ���ˮӡ����
	 * \endif
	 */
	public byte[]				pData = new byte[FinalVar.SDK_MAX_WATERMAKE_DATA];
}

