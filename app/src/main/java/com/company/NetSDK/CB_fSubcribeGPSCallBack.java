package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * GPS subscription callback
 * \else
 * GPS���Ļص�
 * \endif
 */
public interface CB_fSubcribeGPSCallBack {
	
	/**
	 * \if ENGLISH_LANG
	 * GPS subscription callback
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param gpsInfo GPS info

	 * \else
	 * GPS���Ļص�����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param gpsInfo GPS��Ϣ
	 */

	public void invoke(long lLoginID, GPS_Info gpsInfo);
}
