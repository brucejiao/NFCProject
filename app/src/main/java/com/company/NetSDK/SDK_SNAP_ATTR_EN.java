package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ץͼ�������Խṹ��
 * \else
 * Capture functional attributes structure
 * \endif
 */
public class SDK_SNAP_ATTR_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * ͨ������
	 * \endif
	 */
	public int					nChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Capture properties 
	 * \else
	 * ץͼ����
	 * \endif
	 */
	public SDK_QUERY_SNAP_INFO  stuSnap[] = new SDK_QUERY_SNAP_INFO[FinalVar.SDK_MAX_CHANNUM];
	
	public SDK_SNAP_ATTR_EN() {
		for (int i = 0; i < FinalVar.SDK_MAX_CHANNUM; i++) {
			stuSnap[i] = new SDK_QUERY_SNAP_INFO();
		}
	}
}
