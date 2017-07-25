package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback data callback function original shape 
 * \else
 * �ط����ݻص�����ԭ��
 * \endif
 */
public interface CB_fDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback data callback function original shape 
	 * @param lRealHandle handle, return from {@link com.company.NetSDK.INetSDK#PlayBackByRecordFileEx() PlayBackByRecordFileEx}
	 * @param dwDataType here as 0(original data) 
	 * @param buffer data buffering 
	 * @param dwBufferSize buffering length(unit byte)
	 * \else
	 * �ط����ݻص�����
	 * @param lRealHandle ���, {@link com.company.NetSDK.INetSDK#PlayBackByRecordFileEx() PlayBackByRecordFileEx}�ķ���ֵ
	 * @param dwDataType ����Ϊ0(ԭʼ����) 
	 * @param buffer ���ݻ���
	 * @param dwBufferSize ���峤��(��λ�ֽ�) 
	 * \endif
	 */
	public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize);
}
