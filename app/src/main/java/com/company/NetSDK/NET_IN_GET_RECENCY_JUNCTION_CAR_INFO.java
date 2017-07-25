package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.QueryDevInfo , NET_QUERY_RECENCY_JNNCTION_CAR_INFO port input parameter
 * \else
 * INetSDK.QueryDevInfo , NET_QUERY_RECENCY_JNNCTION_CAR_INFO�ӿ��������
 * \endif
 */
public class NET_IN_GET_RECENCY_JUNCTION_CAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * snapshot channel no.
	 * \else
	 * ץ��ͨ����
	 * \endif
	 */
    public int                  nChannel;
    
    /**
	 * \if ENGLISH_LANG
	 * get vehicle info type��newest or latest, NET_RECENCY_CAR_INFO
	 * \else
	 * ��ȡ������Ϣ�����ͣ����µĻ�����ɵ�, NET_RECENCY_CAR_INFO
	 * \endif
	 */
    public int    				emRecencyType;
    
    /**
	 * \if ENGLISH_LANG
	 * no. vehicle info, from 1��if it is 0, it alsomeans no. 1
	 * \else
	 * �ڼ���������Ϣ,��1��ʼ�����Ϊ0Ҳ��ʾ��1��
	 * \endif
	 */
    public int                  nIndex;
}
