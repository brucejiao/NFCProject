package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_RADIOMETRY_GETPOINTTEMPER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

    public int                 nChannel;                           // ͨ����
    public SDK_POINT           stCoordinate = new SDK_POINT();     // ���µ������,����ֵ 0~8192
}
