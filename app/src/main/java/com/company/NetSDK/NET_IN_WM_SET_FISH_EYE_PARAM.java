package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_WM_SET_FISH_EYE_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                             nChannel;            // ���ͨ���Ż��ں�������ͨ����, pszCompositeIDΪNULLʱ��Ч
    public String                     	   pszCompositeID;      // �ں���ID
    public int                             nWindowID;           // ��Ӧ������Ĵ��ں�

    public int           					emMount;            // ���۰�װģʽ NET_FISHEYE_MOUNT_MODE
    public int    							emCalibrate;        // ���۽���ģʽ NET_WM_FISHEYE_CALIBRATE_MODE
    public NET_WM_SET_FISHEYE_INIT_PARAM   stInitParam;         // ģʽ��ʼ����������Ϣ   
    public NET_WM_SET_FISHEYE_EPTZ_PARAM	stEPtzParam;		// ������̨�����ƶ�����
	public NET_IN_WM_SET_FISH_EYE_PARAM(int fishEyeRegionNum) {
		stInitParam = new NET_WM_SET_FISHEYE_INIT_PARAM(fishEyeRegionNum);
		stEPtzParam = new NET_WM_SET_FISHEYE_EPTZ_PARAM();		
	}
}
