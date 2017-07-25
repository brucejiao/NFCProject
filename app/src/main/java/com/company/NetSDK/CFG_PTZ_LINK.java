package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ Activation Configuration
 * \else
 * ������̨��Ϣ
 * \endif
 */
public class CFG_PTZ_LINK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Activation Type , CFG_LINK_TYPE
	 * \else
	 * ��������, CFG_LINK_TYPE
	 * \endif
	 */
	public int					emType;						

	/**
	 * \if ENGLISH_LANG
	 * Value reffered to Preset Number,Tour Pattern Number and etc 
	 * \else
	 * ����ȡֵ�ֱ��ӦԤ�õ�ţ�Ѳ���ŵȵ�
	 * \endif
	 */
	public int					nValue;						
}
