package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record output parameter
 * \else
 * ��ʼ��ѯ�γ���Ƶ��Ϣ����
 * \endif
 */
public class NET_OUT_QUERY_COURSEMEDIA_FILEOPEN implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * total number of result
	 * \else
	 *  ��ѯ�����ܸ���
	 * \endif
	 */
	public int                   ntotalNum; 
    
	/**
	 * \if ENGLISH_LANG
	 * find id
	 * \else
	 * ��ѯID��
	 * \endif
	 */
	public int                   nfindID;

}
