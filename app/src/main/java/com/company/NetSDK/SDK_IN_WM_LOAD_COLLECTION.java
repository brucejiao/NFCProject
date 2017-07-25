package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * LoadMonitorWallCollection's interface input param(load monitor wall plans)
 * \else
 * LoadMonitorWallCollection�ӿ��������(�������ǽԤ��)
 * \endif
 */
public class SDK_IN_WM_LOAD_COLLECTION implements Serializable {
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
	 * Name of plan
	 * \else
	 * Ԥ������
	 * \endif
	 */
	public String				pszName;
}
