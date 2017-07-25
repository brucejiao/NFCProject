package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RenameMonitorWallCollection's interface input param(plan rename)
 * \else
 * RenameMonitorWallCollection�ӿ��������(Ԥ��������)
 * \endif
 */
public class SDK_IN_WM_RENAME_COLLECTION implements Serializable {
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
	 * Old name
	 * \else
	 * ԭ����
	 * \endif
	 */
	public String				pszOldName;
	
	/**
	 * \if ENGLISH_LANG
	 * New name
	 * \else
	 * ������
	 * \endif
	 */
	public String				pszNewName;
}
