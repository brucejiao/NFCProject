package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GetMonitorWallCollections's interface input param(get plan infomation of monitor wall)
 * \else
 * GetMonitorWallCollections�ӿ��������(��ȡ����ǽԤ����Ϣ)
 * \endif
 */
public class SDK_IN_WM_GET_COLLECTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor wall ID
	 * \else
	 * ����ǽID
	 * \endif
	 */
	public int					nMonitorWallID;				
}
