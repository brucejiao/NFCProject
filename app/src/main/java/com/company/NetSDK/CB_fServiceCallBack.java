package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Listening server callback function original shape
 * \else
 * �����ص�
 * \endif
 */
public interface CB_fServiceCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Listening server callback function original shape
	 * @param lHandle recall info servier handle , return from {@link com.company.NetSDK.INetSDK#StartService() StartService}
	 * @param pIp upload info device Ip 
	 * @param wPort upload info device Port 
	 * @param lCommand alarm type��as SetDVRMessCallBack 
	 * @param pParam alarm info buffering area
	 * \else
	 * �����������ص�����
	 * @param lHandle ������ ,{@link com.company.NetSDK.INetSDK#StartService() StartService}����ֵ
	 * @param pIp ���ӵ�������豸��ip 
	 * @param wPort ���ӵ�������豸��port 
	 * @param lCommand �豸��������, ���  SetDVRMessCallBack
	 * @param pParam �豸��������Ĳ������豸���к� 
	 * \endif
	 */
	public int invoke(long lHandle, String pIp, short wPort, int lCommand, Object pParam);
}
