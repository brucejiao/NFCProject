package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV wall display block
 * \else
 * ����ǽ��ʾ����
 * \endif
 */
public class SDK_MONITORWALL_BLOCK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * block name 
	 * \else
	 * ��������
	 * \endif
	 */
    public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];      
    
    /**
     * \if ENGLISH_LANG
     *  splicing video wall ID
     * \else
     * ƴ����ID
     * \endif
     */
    public byte[]                  szCompositeID = new byte[FinalVar.SDK_DEV_ID_LEN];   
    
    /**
     * \if ENGLISH_LANG
     * control ID
     * \else
     * ����ID
     * \endif
     */
    public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];    
    
    /**
     * \if ENGLISH_LANG
     * single display unit occupied grid column number
     * \else
     * ������ʾ��Ԫ��ռ����������
     * \endif
     */
    public int                     nSingleOutputWidth;
    
    /**
     * \if ENGLISH_LANG
     *  single display unit occupied grid row number
     * \else
     * ������ʾ��Ԫ��ռ����������
     * \endif
     */
    public int                     nSingleOutputHeight;            
    
    /**
     * \if ENGLISH_LANG
     * zone coordinate
     * \else
     * ��������
     * \endif
     */
    public SDK_RECT                stuRect = new SDK_RECT();                        
    
    /**
     * \if ENGLISH_LANG
     * switch on time chart, first-dimension each element means sunday~saturday and holiday
     * \else
     * ����ʱ���, ��һά��Ԫ�ر�ʾ����~�����ͽڼ���
     * \endif
     */
    public SDK_TSECT[][]           stuPowerSchedule = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM]; 
    
    /**
     * \if ENGLISH_LANG
     * display unit data,  user allocation memory
     * \else
     * ��ʾ��Ԫ����, �û������ڴ�
     * \endif
     */
    public SDK_MONITORWALL_OUTPUT[] pstuOutputs;
    
    /**
     * \if ENGLISH_LANG
     * display unit group size,user fill in
     * \else
     * ��ʾ��Ԫ�����С, �û���д
     * \endif
     */
    public int                     nMaxOutputCount; 
    
    /**
     * \if ENGLISH_LANG
     *  return display unit quantity
     * \else
     * ���ص���ʾ��Ԫ����
     * \endif
     */
    public int                     nRetOutputCount;                

    public SDK_MONITORWALL_BLOCK(int OutputCount) {
    	for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; ++i) {
    		for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; ++j) {	
    			stuPowerSchedule[i][j] = new SDK_TSECT();
    		}
    	}
    	
    	this.nMaxOutputCount = OutputCount;
    	pstuOutputs = new SDK_MONITORWALL_OUTPUT[nMaxOutputCount];
    	for(int k = 0; k < nMaxOutputCount; ++k) {
    		pstuOutputs[k] = new SDK_MONITORWALL_OUTPUT();
    	}
    }
}
