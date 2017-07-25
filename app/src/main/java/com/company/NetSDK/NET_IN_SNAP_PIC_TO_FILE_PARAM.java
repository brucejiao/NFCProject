package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SNAP_PIC_TO_FILE_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SNAP_PARAMS stuParam = new SNAP_PARAMS();               // ץͼ����, ����mode�ֶν�һ����ץͼ, ��֧�ֶ�ʱ�����ץͼ; ���˳���DVR, �����豸��֧��ÿ��һ�ŵ�ץͼƵ��
	public byte        szFilePath[] = new byte[FinalVar.MAX_PATH];   // д���ļ��ĵ�ַ
}
