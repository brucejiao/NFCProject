package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tv wall config 
 * \else
 * ����ǽ����
 * \endif
 */
public class SDK_MONITORWALL implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name  
	 * \else
	 *  ����
	 * \endif
	 */
	public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];       
    
	/**
	 * \if ENGLISH_LANG
	 * grid row
	 * \else
	 * ��������
	 * \endif
	 */
	public int                     nGridLine;                
    
	/**
	 * \if ENGLISH_LANG
	 * grid column 
	 * \else
	 * ��������
	 * \endif
	 */
	public int                     nGridColume; 
    
	/**
	 * \if ENGLISH_LANG
	 * display block group, user allocation nmemory
	 * \else
	 * ��ʾ��������, �û������ڴ�
	 * \endif
	 */
	public SDK_MONITORWALL_BLOCK[] pstuBlocks;
    
	/**
	 * \if ENGLISH_LANG
	 * display zone group size, user fill in
	 * \else
	 * ��ʾ���������С, �û���д
	 * \endif
	 */
	public int                     nMaxBlockCount; 
    
	/**
	 * \if ENGLISH_LANG
	 * return display block quantity
	 * \else
	 * ���ص���ʾ��������
	 * \endif
	 */
	public int                     nRetBlockCount; 
    
	/**
	 * \if ENGLISH_LANG
	 * disable or not, 0-tv wall is valid , 1-tv wall is invalid
	 * \else
	 * �Ƿ����, 0-�õ���ǽ��Ч, 1-�õ���ǽ��Ч
	 * \endif
	 */
	public boolean                 bDisable; 
    
	/**
	 * \if ENGLISH_LANG
	 * tv wall description information
	 * \else
	 * ����ǽ������Ϣ
	 * \endif
	 */
	public byte[]                  szDesc = new byte[FinalVar.SDK_COMMON_STRING_256];

    public SDK_MONITORWALL(int blockCount, int OutputCount) {
    	this.nMaxBlockCount = blockCount;
    	pstuBlocks = new SDK_MONITORWALL_BLOCK[blockCount];
    	
    	for (int i = 0; i < blockCount; ++i) {
    		pstuBlocks[i] =  new SDK_MONITORWALL_BLOCK(OutputCount);
    	}
    }
}
