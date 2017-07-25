package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SetSplitSourceEx Port output parameter
 * \else
 * SetSplitSourceEx �ӿڵ��������
 * \endif
 */
public class NET_OUT_SET_SPLIT_SOURCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Successfully set return value, corresponding NET_IN_SET_SPLIT_SOURCE window group, user allocated memory, if no need it can be NULL
	 * \else
	 * ���óɹ���ķ���ֵ, ��ӦNET_IN_SET_SPLIT_SOURCE�еĴ�������, �û������ڴ�, �������Ҫ����ΪNULL
	 * \endif
	 */
	public NET_SET_SPLIT_SOURCE_RESULT pstuResults[];
	
	/**
	 * \if ENGLISH_LANG
	 * pstuResults group size
	 * \else
	 * pstuResults����Ĵ�С
	 * \endif
	 */
	public int						nMaxResultCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Return quantity
	 * \else
	 * ���ص�����
	 * \endif
	 */
	public int						nRetCount;
	
	public NET_OUT_SET_SPLIT_SOURCE(int nMaxResultCount) {
		this.nMaxResultCount = nMaxResultCount;
		pstuResults = new NET_SET_SPLIT_SOURCE_RESULT[nMaxResultCount];
		for (int i = 0; i < nMaxResultCount; i++) {
			pstuResults[i] = new NET_SET_SPLIT_SOURCE_RESULT();
		}
	}
}
