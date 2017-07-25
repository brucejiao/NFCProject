package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Annex burn, INetSDK.ControlDevice(SDK_BURNING_ATTACH)
 * \else
 *  ������¼, INetSDK.ControlDevice(SDK_BURNING_ATTACH)
 * \endif
 */
public class BURNING_PARM_ATTACH implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether,0:Not; 1:Yes
	 * \else
	 * �Ƿ�Ϊ������¼��0:����; 1:��
	 * \endif
	 */
	public int				bAttachBurn;
}
