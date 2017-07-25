package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback process by time callback function original shape
 * \else
 * ��ʱ�����ػص�����ԭ��
 * \endif
 */
public interface CB_fTimeDownLoadPosCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback process by time callback function original shape
	 * @param lPlayHandle handle, return from {@link com.company.NetSDK.INetSDK#PlayBackByTime() PlayBackByTime}
	 * @param dwTotalSize Means total size of the play,unit KB 
	 * @param dwDownLoadSize Means played part size,unit KB,when its value is-1 means play ends 
	 * @param index 
	 * @param recordfileinfo Record info
	 * \else
	 * ��ʱ�����ػص�����
	 * @param lPlayHandle {@link com.company.NetSDK.INetSDK#PlayBackByTime() PlayBackByTime} �ķ���ֵ
	 * @param dwTotalSize ָ���β����ܴ�С����λΪKB 
	 * @param dwDownLoadSize ָ�Ѿ����ŵĴ�С����λΪKB������ֵΪ-1ʱ��ʾ���λطŽ�����-2��ʾд�ļ�ʧ�� 
	 * @param index ���
	 * @param recordfileinfo ¼��������Ϣ
	 * \endif
	 */
	public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo);
}
