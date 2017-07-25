package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Network disconnect deal interface
 * \else
 * ����CAN�������ݻص�����ԭ��
 * \endif
 */
public interface CB_fAttachCANCB {
	/**
	 * \if ENGLISH_LANG
	 * Callback function when network disconnect
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lAttachHandle return from {@link com.company.NetSDK.INetSDK#AttachCAN() AttachCAN}
	 * @param pBuf data info {@link com.company.NetSDK.NET_CB_CANDATA NET_CB_CANDATA}
	 * \else
	 * ����CAN�������ݻص�����
	 * @param lLoginID ��¼���, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}����{@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param lAttachHandle {@link com.company.NetSDK.INetSDK#AttachCAN() AttachCAN}����ֵ
	 * @param pBuf ������Ϣ��{@link com.company.NetSDK.NET_CB_CANDATA NET_CB_CANDATA}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_CB_CANDATA pBuf);
}
