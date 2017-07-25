package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Transparent COM callback function original shape
 * \else
 * ͸�����ڻص� 
 * \endif
 */
public interface CB_fTransComCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Transparent COM callback function original shape
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lTransComChannel handle, return from{@link com.company.NetSDK.INetSDK#CreateTransComChannel() CreateTransComChannel}
	 * @param pBuffer Transparent data buffer 
	 * @param dwBufSize Transparent data buffer length 
	 * \else
	 * ͸�����ڻص�����
	 * @param lLoginID ��¼���, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}����{@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param lTransComChannel {@link com.company.NetSDK.INetSDK#CreateTransComChannel() CreateTransComChannel}�ķ���ֵ 
	 * @param pBuffer ͸�����ݻ��� 
	 * @param dwBufSize ͸�����ݻ��峤��
	 * \endif
	 */
	public void invoke(long lLoginID, long lTransComChannel, byte pBuffer[], int dwBufSize);
}
