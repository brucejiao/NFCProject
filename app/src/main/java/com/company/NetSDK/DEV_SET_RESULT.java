package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Returned Information for Modify device configuration
 * \else
 * �޸��豸���÷�����Ϣ
 * \endif
 */
public class DEV_SET_RESULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Type(GetDevConfig and SetDevConfig type)
	 * \else
	 * ����(��GetDevConfig��SetDevConfig������)
	 * \endif
	 */
	public int               dwType;
	
	/**
	 * \if ENGLISH_LANG
	 * Result code:
	 * <table>
	 * <tr><td>0</td><td>Success</td></tr>
	 * <tr><td>1</td><td>Failure</td></tr>
	 * <tr><td>2</td><td>Data Illegal</td></tr>
	 * <tr><td>3</td><td>Temporarily unable to set</td></tr>
	 * <tr><td>4</td><td>Without Permission</td></tr>
	 * </table>
	 * \else
	 * ������:
	 * <table>
	 * <tr><td>0</td><td>�ɹ�</td></tr>
	 * <tr><td>1</td><td>ʧ��</td></tr>
	 * <tr><td>2</td><td>���ݲ��Ϸ�</td></tr>
	 * <tr><td>3</td><td>��ʱ�޷�����</td></tr>
	 * <tr><td>4</td><td>û��Ȩ��</td></tr>
	 * </table>
	 * \endif
	 */
	public int                wResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Reboot Sign
	 * <table>
	 * <tr><td>0</td><td>No need to reboot</td></tr>
	 * <tr><td>1</td><td>Effective after reboot</td></tr>
	 * </table>
	 * \else
	 * ������־
	 * <table>
	 * <tr><td>0</td><td>����Ҫ����</td></tr>
	 * <tr><td>1</td><td>��Ҫ��������Ч</td></tr>
	 * </table>
	 * \endif
	 */
	public int                wRebootSign;
}
