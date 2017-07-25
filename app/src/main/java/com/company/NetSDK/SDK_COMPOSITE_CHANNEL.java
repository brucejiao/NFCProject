package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device composite channel information 
 * \else
 * �ں���ͨ����Ϣ    
 * \endif
 */
public class SDK_COMPOSITE_CHANNEL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
    
    /**
	 * \if ENGLISH_LANG
	 * Monitor wall name
	 * \else
	 * ����ǽ����
	 * \endif
	 */
    public byte[]           szMonitorWallName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];  
    
    /**
	 * \if ENGLISH_LANG
	 * Composite ID
	 * \else
	 * �ں���ID
	 * \endif
	 */
    public byte[]           szCompositeID = new byte[FinalVar.SDK_DEV_ID_LEN_EX]; 
    
    /**
	 * \if ENGLISH_LANG
	 * Virtual channel
	 * \else
	 * ����ͨ����
	 * \endif
	 */
    public int              nVirtualChannel;                     

}
