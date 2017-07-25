package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * The prototype of dynamic sub connection offline call function 
 * \else
 * ��̬�����ӶϿ��ص�����ԭ��
 * \endif
 */
public interface CB_fSubDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * The prototype of dynamic sub connection offline call function 
	 * @param emInterfaceType interrace type
	 * <table>
	 * <tr><td>enumeration value</td><td>meaning</td></tr>
	 * <tr><td>SDK_INTERFACE_OTHER</td><td>unknown interface</td></tr>
	 * <tr><td>SDK_INTERFACE_REALPLAY</td><td>real time monitoring interface</td></tr>
	 * <tr><td>SDK_INTERFACE_PREVIEW</td><td>multi-image preview interface</td></tr>
	 * <tr><td>SDK_INTERFACE_PLAYBACK</td><td>playback interface</td></tr>
	 * <tr><td>SDK_INTERFACE_DOWNLOAD</td><td>download interface</td></tr>
	 * <tr><td>SDK_INTERFACE_REALLOADPIC</td><td>download intelligent image interface</td></tr>
	 * </table>
	 * @param bOnline Online or not 
	 * @param lOperateHandle interface returned operation handle,{@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param lLoginID login handle, return from{@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * \else
	 * ��̬�����ӶϿ��ص�����ԭ��
	 * @param emInterfaceType �ӿ�����
	 * <table>
	 * <tr><td>ö��ֵ </td><td>���� </td></tr>
	 * <tr><td>SDK_INTERFACE_OTHER</td><td>δ֪�ӿ� </td></tr>
	 * <tr><td>SDK_INTERFACE_REALPLAY</td><td>ʵʱ���ӽӿ� </td></tr>
	 * <tr><td>SDK_INTERFACE_PREVIEW</td><td>�໭��Ԥ���ӿ� </td></tr>
	 * <tr><td>SDK_INTERFACE_PLAYBACK</td><td>�طŽӿ� </td></tr>
	 * <tr><td>SDK_INTERFACE_DOWNLOAD</td><td>���ؽӿ� </td></tr>
	 * <tr><td>SDK_INTERFACE_REALLOADPIC</td><td>��������ͼƬ�ӿ� </td></tr>
	 * </table>
	 * @param bOnline �Ƿ����� 
	 * @param lOperateHandle �ӿڷ��صĲ������,{@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param lLoginID ��½���, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}����ֵ
	 * \endif
	 */
	public void invoke(int emInterfaceType, boolean bOnline, long lOperateHandle, long lLoginID);
}
