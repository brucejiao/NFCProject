package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronism register device call
 * \else
 * �첽ע���豸�ص�����
 * \endif
 */
public interface CB_fHaveLogin {
	/**
	 * \if ENGLISH_LANG
	 * Asynchronism register device call
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pchDVRIP device ip
	 * @param nDVRPort device port
	 * @param bOnline on line or not
	 * @param stuDeviceInfo device info
	 * @param nError error info
	 * \else
	 * ������߻ص�����
	 * @param lLoginID ��¼���, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}����{@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param pchDVRIP �豸IP
	 * @param nDVRPort �豸�˿�
	 * @param bOnline �Ƿ�����
	 * @param stuDeviceInfo �豸��Ϣ
	 * @param nError ������Ϣ
	 * \endif
	 */
	public void invoke(long lLoginID, String pchDVRIP, int nDVRPort, boolean bOnline, NET_DEVICEINFO_Ex stuDeviceInfo, int nError);
}
