package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get wireless devices info
 * \else
 * ��ȡ�����豸״̬
 * \endif
 */
public class NET_GET_WIRELESS_DEVICE_STATE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Start index symbol, start first search may set to 0
	 * \else
	 * ��ʼ��������,��ʼ��һ�β�ѯ����Ϊ0
	 * \endif
	 */
    public int	nStartIndex;            
    
    /**
     * \if ENGLISH_LANG
     * The gotten state items, this value is smaller than or equal to capacity set nMaxPageSize field valud
     * \else
     * ���λ�ȡ���豸״̬����,��ֵС�ڵ�����������nMaxPageSize�ֶε�ֵ
     * \endif
     * @see CFG_CAP_LOWRATEWPAN
     */
    public int	nQueryNum;              
    
    /**
     * \if ENGLISH_LANG
     * Actually returned items
     * \else
     * ʵ�ʷ��ص��豸״̬����
     * \endif
     */
    public int	nRetQueryNum;        
    
    /**
     * \if ENGLISH_LANG
     * Get state content, allocated by user, cannot be lower than nQueryNum
     * \else
     * ��ȡ�豸״̬������, ��������С�� nQueryNum
     * \endif
     */
    public NET_WIRELESS_DEVICE_INFO[]    pstuDeviceInfo; 
    
    public NET_GET_WIRELESS_DEVICE_STATE(int QueryNumber) {
    	this.nQueryNum = QueryNumber;
    	pstuDeviceInfo = new NET_WIRELESS_DEVICE_INFO[QueryNumber];
    	for (int i = 0; i < QueryNumber; ++i){
    		pstuDeviceInfo[i] = new  NET_WIRELESS_DEVICE_INFO();
    	}
    }
}
