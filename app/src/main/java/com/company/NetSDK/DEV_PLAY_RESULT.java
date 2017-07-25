package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Request monitoring or playback's return information
 * \else
 * ������ӻ�طŴ���ķ�����Ϣ
 * \endif
 */
public class DEV_PLAY_RESULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Result Code:
	 * <table>
	 * <tr><td>1</td><td>Without permission</td></tr>
	 * <tr><td>2</td><td>This operation is not supported</td></tr>
	 * <tr><td>3</td><td>No enough Resource</td></tr>
	 * <tr><td>4</td><td>Device can't obtain the requested data</td></tr>
	 * <tr><td>11</td><td>Senior user take over junior user's resource</td></tr>
	 * <tr><td>12</td><td>Prohibit access</td></tr>
	 * </table>
	 * \else
	 * ���󷵻���:
	 * <table>
	 * <tr><td>1</td><td>��Ȩ��</td></tr>
	 * <tr><td>2</td><td>�豸��֧�ִ˲���</td></tr>
	 * <tr><td>3</td><td>��Դ����</td></tr>
	 * <tr><td>4</td><td>�豸�޷���ȡ��ǰ��������</td></tr>
	 * <tr><td>11</td><td>��ʾ�߼��û���ռ�ͼ��û���Դ</td></tr>
	 * <tr><td>12</td><td>��ֹ����</td></tr>
	 * </table>
	 * \endif
	 */
	public int               dwResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Handle value returned from Monitoring or playback monitor or playback handle
	 * \else
	 * ���ӻ�طŽӿڷ��صľ��ֵ
	 * \endif
	 */
	public long              lPlayHandle;
}
