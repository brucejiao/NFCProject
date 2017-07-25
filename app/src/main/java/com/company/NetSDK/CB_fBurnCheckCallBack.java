package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Writing calibration call function
 * \else
 * ��¼У��ص�����ԭ��
 * \endif
 */
public interface CB_fBurnCheckCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Writing calibration call function
	 * @param lLoginID  login handle, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or{@link com.company.NetSDK.INetSDK#Login() Login} return value 
	 * @param lAttachHandle writing handle, {@link com.company.NetSDK.INetSDK#AttachBurnCheckState() AttachBurnCheckState} return value 
	 * @param pstState writing status info��see {@link com.company.NetSDK.NET_CB_BURN_CHECK_STATE NET_CB_BURN_CHECK_STATE}
	 * \else
	 * ��¼У��ص�����
	 * @param lLoginID ��¼���, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}����{@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param lAttachHandle ��¼���, {@link com.company.NetSDK.INetSDK#AttachBurnCheckState() AttachBurnCheckState}�ķ���ֵ
	 * @param pstState ��¼״̬��Ϣ����� {@link com.company.NetSDK.NET_CB_BURN_CHECK_STATE NET_CB_BURN_CHECK_STATE}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_CB_BURN_CHECK_STATE pstState);

}
