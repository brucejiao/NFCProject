package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback progress recall function 
 * \else
 * �طŽ��Ȼص�
 * \endif
 */
public interface CB_fDecPlayBackPosCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback progress recall function 
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nEncoderID encoder NO.
	 * @param dwTotalSize playback data total size
	 * @param dwPlaySize played data size
	 * \else
	 * �طŽ��Ȼص�
	 * @param lLoginID ��¼���, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}����{@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param nEncoderID ���������
	 * @param dwTotalSize �ط����ݵ��ܴ�С 
	 * @param dwPlaySize �ѻط����ݵĴ�С 
	 * \endif
	 */
	public void invoke(long lLoginID, int nEncoderID, int dwTotalSize, int dwPlaySize);
}
