package com.company.NetSDK;

public interface CB_fCameraStateCallBack {
	public void invoke(long lLoginID, long lAttachHandle, final NET_CB_CAMERASTATE pBuf);
}
