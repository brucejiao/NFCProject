package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ activation
 * \else
 * ��̨����
 * \endif
 */
public class SDK_PTZ_LINK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Type
	 * <table>
	 * <tr><td>iType</td><td>Type</td></tr>
	 * <tr><td>1</td><td>Preset point</td></tr>
	 * <tr><td>2</td><td>Point between cruise</td></tr>
	 * <tr><td>3</td><td>Mode</td></tr>
	 * </table>
	 * \else
	 * ����
	 * <table>
	 * <tr><td>iType</td><td>����</td></tr>
	 * <tr><td>1</td><td>Ԥ�õ�</td></tr>
	 * <tr><td>2</td><td>���Ѳ��</td></tr>
	 * <tr><td>3</td><td>ģʽ</td></tr>
	 * </table>
	 * \endif
	 */
	public int                 iType;
	
	/**
	 * \if ENGLISH_LANG
	 * Value
	 * \else
	 * ֵ
	 * \endif
	 */
	public int                 iValue;
}
