package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GetMonitorWallCollections's interface output param(get plan infomation of monitor wall)
 * \else
 * GetMonitorWallCollections�ӿ��������(��ȡ����ǽԤ����Ϣ)
 * \endif
 */
public class SDK_OUT_WM_GET_COLLECTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Plan of monitor wall array
	 * \else
	 * ����ǽԤ������
	 * \endif
	 */
	public SDK_MONITORWALL_COLLECTION pCollections[];
	
	/**
	 * \if ENGLISH_LANG
	 * Array size
	 * \else
	 * ����ǽԤ�������С
	 * \endif
	 */
	public int					nMaxCollectionsCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Max count of plan
	 * \else
	 * ����ǽԤ������
	 * \endif
	 */
	public int					nCollectionsCount;
	
	public SDK_OUT_WM_GET_COLLECTIONS(int nMax) {
		nMaxCollectionsCount = nMax;
		pCollections = new SDK_MONITORWALL_COLLECTION[nMax];
		for (int i = 0; i < nMaxCollectionsCount; i++) {
			pCollections[i] = new SDK_MONITORWALL_COLLECTION();
		}
	}
}
