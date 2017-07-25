package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_GET_DEVICE_INFO_ALL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                         nDevMax;        // �豸��Ϣ��������, ָ��pstuInfo�ڴ�ռ�
	public int                         nDevNum;        // ʵ�ʷ��ص��豸��Ϣ�ĸ���
	public SDK_REMOTE_DEVICE            pstuInfo[];       // �豸��Ϣָ�룬�ýṹ���ڲ���Ա dwSize ���û���ֵ
	
	public NET_OUT_GET_DEVICE_INFO_ALL(int nDevMax) {
		this.nDevMax = nDevMax;
		pstuInfo = new SDK_REMOTE_DEVICE[this.nDevMax];
		for (int i = 0; i < this.nDevMax; i++) {
			pstuInfo[i] = new SDK_REMOTE_DEVICE();
		}
	}
}
