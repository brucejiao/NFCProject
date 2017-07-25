package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice interface SDK_CTRL_CLOSE_BURNER 
 * \else
 * INetSDK.ControlDevice�ӿڵ� SDK_CTRL_CLOSE_BURNER �� �������
 * \endif
 */
public class NET_CTRL_BURNERDOOR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * cd name,like "/dev/sda"
	 * \else
	 * �������ƣ��硰/dev/sda��
	 * \endif
	 */
	public String       szBurnerName; 
	
	/**
	 * \if ENGLISH_LANG
	 * operate result
	 * \else
	 * �������
	 * \endif
	 */
	public boolean      bResult; 
	
	/**
	 * \if ENGLISH_LANG
	 * Whether The Security Pop-up Drive, Data Save TRUE- pop Up Before, FALSE- Display)
	 * \else
	 * �Ƿ�ȫ��������, TRUE-����ǰ�����ݱ���, FALSE-ֱ�ӵ���
	 * \endif
	 */
	public boolean		bSafeEject; 
}
