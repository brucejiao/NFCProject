package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record output parameter
 * \else
 * ��ѯ�γ���Ƶ��Ϣ����
 * \endif
 */
public class NET_OUT_QUERY_COURSEMEDIA_FILE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * result number
	 * \else
	 * ��ѯ���ĸ���
	 * \endif
	 */
    public int                         nCountResult;                                   
    
	/**
	 * \if ENGLISH_LANG
	 *  record file info
	 * \else
	 * ��Ƶ��Ϣ
	 * \endif
	 */
    public NET_COURSEMEDIA_FILE_INFO[]   stuCourseMediaFile = new NET_COURSEMEDIA_FILE_INFO[64];
    
    public NET_OUT_QUERY_COURSEMEDIA_FILE() {
    	for(int i = 0; i < 64; ++i) {
    		stuCourseMediaFile[i] = new NET_COURSEMEDIA_FILE_INFO();
    	}
    }
}
