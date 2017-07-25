package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_GET_CAMERA_STATEINFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                         nValidNum;              // ��ѯ���������ͨ��״̬��Ч����,��sdk����
    public int                         nMaxNum;                // pCameraStateInfo ����������,���û���д
    public NET_CAMERA_STATE_INFO       pCameraStateInfo[];       // �����ͨ����Ϣ����,���û�����
    
    public NET_OUT_GET_CAMERA_STATEINFO(int nMaxNum) {
    	this.nMaxNum = nMaxNum;
    	pCameraStateInfo = new NET_CAMERA_STATE_INFO[nMaxNum];
    	for (int i = 0; i < nMaxNum; i++) {
    		pCameraStateInfo[i] = new NET_CAMERA_STATE_INFO();
    	}
    }
}
