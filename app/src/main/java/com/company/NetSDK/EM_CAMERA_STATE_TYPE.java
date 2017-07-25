package com.company.NetSDK;

import java.io.Serializable;

public class EM_CAMERA_STATE_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int EM_CAMERA_STATE_TYPE_UNKNOWN = 0;       // δ֪
	public static final int EM_CAMERA_STATE_TYPE_CONNECTING = 1;    // ��������
	public static final int EM_CAMERA_STATE_TYPE_CONNECTED = 2;     // ������
	public static final int EM_CAMERA_STATE_TYPE_UNCONNECT = 3;     // δ����
	public static final int EM_CAMERA_STATE_TYPE_EMPTY = 4;         // ͨ��δ����,����Ϣ
	public static final int EM_CAMERA_STATE_TYPE_DISABLE = 5;       // ͨ��������,��������
}
