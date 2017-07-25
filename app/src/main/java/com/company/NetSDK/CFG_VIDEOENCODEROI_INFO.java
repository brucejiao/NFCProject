package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Encoding ROI(Region of Intrest)Configuration
 * \else
 * ��Ƶ����ROI(Region of Intrest)����
 * \endif
 */
public class CFG_VIDEOENCODEROI_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Region Number
	 * \else
	 * �Ż��������
	 * \endif
	 */
	public int				nRegionNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimization Regions Coordinate System[0~8191]
	 * \else
	 * �Ż����� ֧�ֶ���Ż�����ʹ�����������ϵ��ȡֵ��Ϊ0~8191
	 * \endif
	 */
	public CFG_RECT[]		stRegions = new CFG_RECT[FinalVar.MAX_QUALITY_REGION_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Image Quality Value1~6 1:the lowes 6:the highest 
	 * \else
	 * ͼ������ ȡֵ1~6��ֵԽ��ͼ������Խ��
	 * \endif
	 */
	public byte				byQuality;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Main Stream1 Enable 
	 * \else
	 * �Ż���������Ƶ����
	 * \endif
	 */
	public boolean			bMain;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream1 Enable 
	 * \else
	 * �Ż�������1��Ƶ����
	 * \endif
	 */
	public boolean			bExtra1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream2 Enable 
	 * \else
	 * �Ż�������2��Ƶ����
	 * \endif
	 */
	public boolean			bExtra2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream3 Enable 
	 * \else
	 * �Ż�������3��Ƶ����
	 * \endif
	 */
	public boolean			bExtra3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Snapshot Enable 
	 * \else
	 * �Ż�ץͼ����
	 * \endif
	 */
	public boolean			bSnapshot;
	
	public CFG_VIDEOENCODEROI_INFO() {
		for (int i = 0; i < FinalVar.MAX_QUALITY_REGION_NUM; ++i) {
			stRegions[i] = new CFG_RECT();
		}
	}
}
