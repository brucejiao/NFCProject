package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback process callback function original shape 
 * \else
 * ���������ػص�����ԭ��
 * \endif
 */
public interface CB_fDownLoadPosCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback process callback function original shape 
	 * @param lPlayHandle handle, return from {@link com.company.NetSDK.INetSDK#DownloadMediaFile() DownloadMediaFile}
	 * @param dwTotalSize means total size of the play,unit KB
	 * @param dwDownLoadSize means played part size,unit KB,when its value is-1 means play ends
	 * \else
	 * ���������ػص�����
	 * @param lPlayHandle ���, {@link com.company.NetSDK.INetSDK#DownloadMediaFile() DownloadMediaFile}�ķ���ֵ
	 * @param dwTotalSize ָ���������ܴ�С����λΪKB
	 * @param dwDownLoadSize ָ�Ѿ����صĴ�С����λΪKB������ֵΪ-1ʱ��ʾ�������ؽ��� 
	 * \endif
	 */
	public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize);
}
