package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_GET_TOUR_STATUS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public NET_WINDOW_TOUR_STATUS_INFO[] pstuStatus;            // ״̬��Ϣָ��,  �û������ڴ�. ��ѯ���ں�Ϊ-1ʱ��ʾ������ڵ���Ϣ����.
    public int                 nMaxStatusCount;                // ״̬��Ϣ�������, �û�����
    public int                 nRetStatusCount;					// ״̬��Ϣʵ������, ��ѯ�õ�
    
	public NET_OUT_SPLIT_GET_TOUR_STATUS(int nMaxStatusCount) {
		this.nMaxStatusCount = nMaxStatusCount;
		
		pstuStatus = new NET_WINDOW_TOUR_STATUS_INFO[nMaxStatusCount];
		for(int i = 0; i < nMaxStatusCount; ++i) {
			pstuStatus[i] =  new NET_WINDOW_TOUR_STATUS_INFO();
		}
	}                
}
