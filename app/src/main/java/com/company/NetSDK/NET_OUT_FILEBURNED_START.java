package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * StartUploadFileBurned output parameter
 * \else
 * StartUploadFileBurned �������
 * \endif
 */
public class NET_OUT_FILEBURNED_START implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * "start"��system is ready, may start to upload; "busy"��system is busy, please try again later. "error"��system is not writing, return error request failed
	 * \else
	 * "start"��ϵͳ׼������,���Կ�ʼ�ϴ�; "busy"��ϵͳæ,�Ժ����ԡ�"error"��ϵͳδ�ڿ�¼��,���س���,����ʧ��
	 * \endif
	 */
	public char                szState[] = new char[FinalVar.SDK_MAX_NAME_LEN];          
}
