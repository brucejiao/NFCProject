package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * File Transfer callback
 * \else
 * �ļ�����ص�
 * \endif
 */
public interface CB_fTransFileCallBack {
	/**
	 * \if ENGLISH_LANG
	 * File Transfer callback
	 * @param lHandle handle, return from {@link com.company.NetSDK.INetSDK#FileTransmit() FileTransmit}
	 * @param nTransType File transfer type��currently only DH_DEV_FILETRANS_BURN 
	 * @param nState File transfer status 
	 * @param nSendSize Length of file sent 
	 * @param nTotalSize Total file size 
	 * \else
	 * �ļ�����ص�����
	 * @param lHandle �ļ������� {@link com.company.NetSDK.INetSDK#FileTransmit() FileTransmit}
	 * @param nTransType �ļ��������ͣ�����ֻ�� SDK_DEV_FILETRANS_BURN 
	 * @param nState �ļ�����״̬ 
	 * @param nSendSize ���͵��ļ�����
	 * @param nTotalSize �ļ��ܵĴ�С
	 * \endif
	 */
	public void invoke(long lHandle, int nTransType, int nState, int nSendSize, int nTotalSize);
}
