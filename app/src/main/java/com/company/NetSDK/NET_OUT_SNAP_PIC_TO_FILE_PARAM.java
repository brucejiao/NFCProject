package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SNAP_PIC_TO_FILE_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte      szPicBuf[];               // ͼƬ����,�û������ڴ�
	public int       dwPicBufLen;            // ͼƬ�����ڴ��С, ��λ:�ֽ�
	public int       dwPicBufRetLen;         // ���ص�ͼƬ��С, ��λ:�ֽ�
	
	public NET_OUT_SNAP_PIC_TO_FILE_PARAM(int nBufMax) {
		dwPicBufLen = nBufMax;
		szPicBuf = new byte[dwPicBufLen];
	}
}
