package com.company.NetSDK;

import java.io.Serializable;

public class NET_WM_SET_FISHEYE_INIT_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public boolean                         bUseRegion;         // ΪTRUEʱ,ʹ�����³�Ա���г�ʼ��,ΪFALSEʱ���³�Ա��Ч
    public int                             nCircular;          // ����ƫ��(������ʾģʽ�д�ԭʼͼʱ�����塣��1+3��1+8��ģʽ��1����)
    public int                             nPanorama;          // ȫ��ƫ��(������ʾģʽ��ȫ��ʱ������,��1P��2P��ģʽ)
	public int                             nFishEyeRegionNum;  // ���۽������������������(�����������ʵ�ʵĽ���ģʽ.��1+3,����4��Ԫ��)
    public NET_WM_FISH_EYE_REGION_PARAM[]    stFishEyeRegions = new NET_WM_FISH_EYE_REGION_PARAM[FinalVar.MAX_FISH_EYE_REGION_NUM];    // ���۽����������������Ϣ
	public NET_WM_SET_FISHEYE_INIT_PARAM(int fishEyeRegionNum) {
		this.nFishEyeRegionNum = fishEyeRegionNum;
		for(int i = 0; i< fishEyeRegionNum; ++i) {
			stFishEyeRegions[i] = new NET_WM_FISH_EYE_REGION_PARAM();
		}
	}  
}
