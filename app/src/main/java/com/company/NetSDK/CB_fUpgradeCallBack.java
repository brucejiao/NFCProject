package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Upgrade device callback function original shape
 * \else
 * �����豸����ص�
 * \endif
 */
public interface CB_fUpgradeCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Upgrade device callback function original shape
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lUpgradeChannel handle, return from{@link com.company.NetSDK.INetSDK#StartUpgrade() StartUpgrade}
	 * @param nTotalSize update file total length(unit:byte) 
	 * @param nSendSize Sent file length(unit:byte)��when it is-1��meand update file sending ends 
	 * \else
	 * �����豸����ص�����
	 * @param lLoginID ��¼���, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}����{@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param lUpgradeChannel {@link com.company.NetSDK.INetSDK#StartUpgrade() StartUpgrade}���ص��������ID 
	 * @param nTotalSize �����ļ����ܳ���(��λ:�ֽ�) 
	 * @param nSendSize �ѷ��͵��ļ�����(��λ:�ֽ�)��Ϊ-1ʱ����ʾ���������ļ����� 
	 * \endif
	 */
	public void invoke(long lLoginID, long lUpgradeChannel, int nTotalSize, int nSendSize);
}
