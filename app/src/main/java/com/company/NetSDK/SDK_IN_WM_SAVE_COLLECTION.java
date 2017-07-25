package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SaveMonitorWallCollection's interface input param(save monitor wall plans)
 * \else
 * SaveMonitorWallCollection�ӿ��������(�������ǽԤ��)
 * \endif
 */
public class SDK_IN_WM_SAVE_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor wall ID
	 * \else
	 * ����ǽ���
	 * \endif
	 */
	public int					nMonitorWallID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name pf plan
	 * \else
	 * Ԥ������
	 * \endif
	 */
	public String				pszName;
}
