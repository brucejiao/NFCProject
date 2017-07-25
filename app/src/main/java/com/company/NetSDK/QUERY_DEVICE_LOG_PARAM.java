package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Search log parameter
 * \else
 * ��ѯ��־����
 * \endif
 */
public class QUERY_DEVICE_LOG_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Searched log type ,enumeration value, as: SDK_LOG_QUERY_TYPE
	 * \else
	 * ��ѯ��־����, ö��ֵ����SDK_LOG_QUERY_TYPE
	 * \endif
	 */
	public int					emLogType;
	
	/**
	 * \if ENGLISH_LANG
	 * The searched log start time
	 * \else
	 * ��ѯ��־�Ŀ�ʼʱ��
	 * \endif
	 */
	public NET_TIME			stuStartTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * The searched log end time.
	 * \else
	 * ��ѯ��־�Ľ���ʱ��
	 * \endif
	 */
	public NET_TIME			stuEndTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * The search begins from which log in one period. It shall begin with 0 if it is the first time search.
	 * \else
	 * ��ʱ����дӵڼ�����־��ʼ��ѯ����ʼ��һ�β�ѯ����Ϊ0
	 * \endif
	 */
	public int					nStartNum;
	
	/**
	 * \if ENGLISH_LANG
	 * The ended log serial number in one search,the max returning number is 1024 
	 * \else
	 * һ�β�ѯ�е��ڼ�����־����,��־�������������ֵΪ1024
	 * \endif
	 */
	public int					nEndNum;
	
	/**
	 * \if ENGLISH_LANG
	 * log struct type,0:SDK_DEVICE_LOG_ITEM;1: SDK_DEVICE_LOG_ITEM_EX
	 * \else
	 * ��־���ݽṹ������,0:��ʾDH_DEVICE_LOG_ITEM��1:��ʾ SDK_DEVICE_LOG_ITEM_EX
	 * \endif
	 */
	public byte                nLogStuType;
            
	/**
	 * \if ENGLISH_LANG
	 * Channel no. 0:Compatible with previous all channel numbers. The channel No. begins with 1.1: The first channel.
	 * \else
	 * ͨ����,0:����֮ǰ��ʾ����ͨ���ţ�����ͨ���Ŵ�1��ʼ; 1:��һ��ͨ��
	 * \endif
	 */
	public int        			nChannelID;
}
