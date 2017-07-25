package com.company.NetSDK;

import java.io.Serializable;

public class NET_WM_SET_FISHEYE_EPTZ_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int 							nOptWayType;		// ��������(��ʾ������̨����ʱ��arg1,��ʾ���ƶ����ǷŴ�)
	public int 							nOptWinNum; 		// С���ں�(��ǰ���ڲ�����С���ں�)
	public int 							nOptWayData;		// ��������(��ʾ������̨����ʱ�����ݴ�С����OptWayType���ʹ��)
}
