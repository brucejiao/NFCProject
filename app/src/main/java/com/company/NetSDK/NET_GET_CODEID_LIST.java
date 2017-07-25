package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get code info
 * \else
 * ��ȡ������Ϣ
 * \endif
 */
public class NET_GET_CODEID_LIST implements Serializable{
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
     * The gotten code items, this value issmaller than or equal to capacity set nMaxPageSize field valud
     * \else
     * ���λ�ȡ�Ķ�������,��ֵС�ڵ�����������nMaxPageSize�ֶε�ֵ
     * \endif
     * @see CFG_CAP_LOWRATEWPAN
     */
    public int	nQueryNum;              
    
    /**
     * \if ENGLISH_LANG
     * Actual returned code items
     * \else
     * ʵ�ʷ��صĶ�������
     * \endif
     */
    public int	nRetCodeIDNum;        
    
    /**
     * \if ENGLISH_LANG
     * Get code content, allocated by user, cannot be lower than nQueryNum
     * \else
     * ��ȡ���������, ��������С�� nQueryNum
     * \endif
     */
    public NET_CODEID_INFO[]    pstuCodeIDInfo; 
    
    public NET_GET_CODEID_LIST(int QueryNumber) {
    	this.nQueryNum = QueryNumber;
    	pstuCodeIDInfo = new NET_CODEID_INFO[QueryNumber];
    	for (int i = 0; i < QueryNumber; ++i){
    		pstuCodeIDInfo[i] = new  NET_CODEID_INFO();
    	}
    }
}
