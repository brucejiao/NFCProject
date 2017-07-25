package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record in parameter
 * \else
 * ��ʼ��ѯ�γ���Ƶ��Ϣ���
 * \endif
 */
public class NET_IN_QUERY_COURSEMEDIA_FILEOPEN implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * start time 
	 * \else
	 *  ��ѯ��ʼʱ��
	 * \endif
	 */
	public NET_TIME	stuStartTime = new NET_TIME();                     
   
	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * ��ѯ����ʱ��
	 * \endif
	 */
	public NET_TIME stuEndTime = new NET_TIME();
    
	/**
	 * \if ENGLISH_LANG
	 * key word
	 * \else
	 * ��ѯ�ؼ���
	 * \endif
	 */
	public byte[] szKeyWord = new byte[FinalVar.SDK_COMMON_STRING_128]; 
}
