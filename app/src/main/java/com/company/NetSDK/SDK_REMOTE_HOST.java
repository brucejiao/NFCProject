package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Host Configuration
 * \else
 * Զ����������
 * \endif
 */
public class SDK_REMOTE_HOST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Connection enabled
	 * \else
	 * ����ʹ��
	 * \endif
	 */
	public byte                byEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Currently only useful for PPPoE server
	 * <table>
	 * <tr><td>0</td><td>In the wired network card dialing</td></tr>
	 * <tr><td>1</td><td>In the wired Wireless card dialing</td></tr>
	 * </table>
	 * \else
	 * Ŀǰֻ����PPPoE����������
	 * <table>
	 * <tr><td>0</td><td>��������������</td></tr>
	 * <tr><td>1</td><td>�����������ϲ���</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byAssistant;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote host port
	 * \else
	 * Զ�������˿�
	 * \endif
	 */
	public short                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * IP address of the remote host
	 * \else
	 * Զ������IP��ַ
	 * \endif
	 */
	public byte                sHostIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * The user name of the remote host
	 * \else
	 * Զ�������û���
	 * \endif
	 */
	public byte                sHostUser[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];
	
	/**
	 * \if ENGLISH_LANG
	 * The user password of the remote host
	 * \else
	 * Զ����������
	 * \endif
	 */
	public byte                sHostPassword[] = new byte[FinalVar.SDK_MAX_HOST_PSWLEN];
}
