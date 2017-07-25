package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Monitor disconnect callback function
 * \else
 * ��Ƶ���ӶϿ��ص�����
 * \endif
 */
public interface CB_fRealPlayDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * Monitor disconnect callback function
	 * @param lOperateHandle handle, return from {@link com.company.NetSDK.INetSDK#StartRealPlay() StartRealPlay}
	 * @param dwEventType event type��EM_REALPLAY_DISCONNECT_EVENT_TYPE,as: 
	 * <pre>
	 * <tr><td>enumerated type</td><td>meaning</td></tr>
	 * <tr><td>DISCONNECT_EVENT_REAVE</td><td>means advanced user occupy resource of low-level user</td></tr>
	 * <tr><td>DISCONNECT_EVENT_NETFORBID</td><td>net in prohibit </td></tr>
	 * <tr><td>DISCONNECT_EVENT_SUBCONNECT</td><td>dynamic sub connection disconnect</td></tr>
	 * </pre>
	 * \else
	 * ��Ƶ���ӶϿ��ص�����
	 * @param lOperateHandle ��ؾ�� ,{@link com.company.NetSDK.INetSDK#StartRealPlay() StartRealPlay}����ֵ
	 * @param dwEventType �¼�����,EM_REALPLAY_DISCONNECT_EVENT_TYPE�����±� ö������ ���� 
	 * <pre>
	 * <tr><td>ö������</td><td>����</td></tr>
	 * <tr><td>DISCONNECT_EVENT_REAVE</td><td>��ʾ�߼��û���ռ�ͼ��û���Դ </td></tr>
	 * <tr><td>DISCONNECT_EVENT_NETFORBID</td><td>��ֹ���� </td></tr>
	 * <tr><td>DISCONNECT_EVENT_SUBCONNECT</td><td>��̬�����ӶϿ� </td></tr>
	 * </pre>
	 * \endif
	 */
	public void invoke(long lOperateHandle, int dwEventType);
}
