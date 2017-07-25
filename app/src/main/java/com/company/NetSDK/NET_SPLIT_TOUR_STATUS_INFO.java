package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * split tour status info
 * \else
 * �ָ���Ѳ״̬��Ϣ
 * \endif
 */
public class NET_SPLIT_TOUR_STATUS_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * window no
	 * \else
	 *  ���ں�
	 * \endif
	 */
    public int                 nWindow;                   
    
    /**
     * \if ENGLISH_LANG
     * status
     * \else
     * ״̬
     * \endif
     * @see NET_TOUR_STATUS
     */
    public int    emStatus;                  
    
    /**
     * \if ENGLISH_LANG
     * split tour status info
     * \else
     * ��ǰ��ʾԴ��Ϣ
     * \endif
     */
    public SDK_SPLIT_WND_SOURCE stuSource = new SDK_SPLIT_WND_SOURCE();
}
