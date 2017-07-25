package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Areas collection
 * \else
 * �����ղ�
 * \endif
 */
public class SDK_BLOCK_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Split mode
	 * \else
	 * �ָ�ģʽ
	 * \endif
	 */
	public int					emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Window info array
	 * \else
	 * ������Ϣ����
	 * \endif
	 */
	public SDK_WINDOW_COLLECTION stuWnds[] = new SDK_WINDOW_COLLECTION[FinalVar.SDK_MAX_SPLIT_WINDOW];
	
	/**
	 * \if ENGLISH_LANG
	 * Count of window
	 * \else
	 * ��������
	 * \endif
	 */
	public int					nWndsCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Favorites name
	 * \else
	 * �ղؼ�����
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���ͨ����, ����ƴ����
	 * \endif
	 */
	public int					nScreen;					 
	
	public SDK_BLOCK_COLLECTION() {
		for (int i=0 ; i<FinalVar.SDK_MAX_SPLIT_WINDOW; i++) {
			stuWnds[i] = new SDK_WINDOW_COLLECTION();
		}
	}
}
