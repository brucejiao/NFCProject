package com.company.NetSDK;

import java.io.Serializable;

public class EM_NET_WM_TOUR_STATUS implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int EM_NET_WM_TOUR_STATUS_UNKNOWN = 0;          // unknown 
	public static final int EM_NET_WM_TOUR_STATUS_START = 1;            // touring
	public static final int EM_NET_WM_TOUR_STATUS_STOP = 2;             // tour stop
}
