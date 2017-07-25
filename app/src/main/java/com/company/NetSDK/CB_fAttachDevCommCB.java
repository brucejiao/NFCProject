package com.company.NetSDK;

//����͸���������ݻص�����ԭ�Σ�lAttachHandle��CLIENT_AttachDevComm����ֵ
public interface CB_fAttachDevCommCB {
	public void invoke(long lLoginID, long lAttachHandle, NET_CB_DEVCOMMDATA pBuf);
}
