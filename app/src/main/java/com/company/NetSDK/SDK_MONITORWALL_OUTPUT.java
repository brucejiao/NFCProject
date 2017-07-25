package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  TV wall display unit
 * \else
 * ����ǽ��ʾ��Ԫ
 * \endif
 */
public class SDK_MONITORWALL_OUTPUT implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device ID, local time is""
	 * \else
	 * �豸ID, ����ʱΪ""
	 * \endif
	 */
    public byte[]              szDeviceID = new byte[FinalVar.SDK_DEV_ID_LEN];         
    
    /**
     * \if ENGLISH_LANG
     * channel no.
     * \else
     * ͨ����
     * \endif
     */
    public int                 nChannel;                          
    
    /**
     * \if ENGLISH_LANG
     * screen name 
     * \else
     * ��Ļ����
     * \endif
     */
    public byte[]              szName = new byte[FinalVar.SDK_DEV_NAME_LEN];            
}
