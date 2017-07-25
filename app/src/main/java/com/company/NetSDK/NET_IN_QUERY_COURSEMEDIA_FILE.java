package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record in parameter
 * \else
 * ��ѯ�γ���Ƶ��Ϣ���
 * \endif
 */
public class NET_IN_QUERY_COURSEMEDIA_FILE implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * find ID
	 * \else
	 * ��ѯID��
	 * \endif
	 * @see The nfindID field of NET_OUT_QUERY_COURSEMEDIA_FILEOPEN 
	 */
	public int                     nfindID;
	
	/**
	 * \if ENGLISH_LANG
	 * start find offset
	 * \else
	 * ��ʼ��ѯƫ��
	 * \endif
	 */
    public int                     nOffset;
    
	/**
	 * \if ENGLISH_LANG
	 * find count
	 * \else
	 * ��Ҫ��ѯ�ĸ���
	 * \endif
	 */
    public int                     nCount; 
}
