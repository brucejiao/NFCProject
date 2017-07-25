package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Burning device callback function
 * \else
 * ��¼�豸�ص�����ԭ��
 * \endif
 */
public interface CB_fBurnFileCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Burning device callback function
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lUploadHandle return from {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned}
	 * @param nTotalSize file total size
	 * @param nSendSize	sent file length
	 * \else
	 * ��¼�豸�ص�����ԭ��
	 * @param lLoginID ��¼���, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}����{@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned}�ķ���ֵ
	 * @param nTotalSize �ļ��ܹ���С
	 * @param nSendSize	�ѷ����ļ���С
	 * \endif
	 */
	public void invoke(long lLoginID, long lUploadHandle, int nTotalSize, int nSendSize);
}
