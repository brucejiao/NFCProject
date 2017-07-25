package com.company.NetSDK;

public interface CB_fMonitorWallTourStatusCallBack {
	public void invoke(long lLoginID, long lAttachHandle, NET_WM_TOUR_STATUS_INFO pstStatus);
}
