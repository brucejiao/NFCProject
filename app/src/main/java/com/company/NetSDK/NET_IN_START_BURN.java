package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_START_BURN implements Serializable{
	/**
	 * StartBurn input param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  burning device mask, by bit means multiple burning device group
	 * \else
	 * ��¼�豸����, ��λ��ʾ�����¼�豸���
	 * \endif
	 */
    public int                  nDevMask;           
    
    /**
	 * \if ENGLISH_LANG
	 *  burning channel group
	 * \else
	 *  ��¼ͨ������
	 * \endif
	 */
    public int                  szChannels[] = new int[FinalVar.SDK_MAX_BURN_CHANNEL_NUM]; 
    
    /**
	 * \if ENGLISH_LANG
	 *  burning channel group
	 * \else
	 * ��¼ͨ����
	 * \endif
	 */
    public int                  nChannelCount;                          
    
    /**
  	 * \if ENGLISH_LANG
  	 *   burning mode��value corresponding to NET_BURN_MODE
  	 * \else
  	 * ��¼ģʽ, ֵ��ӦNET_BURN_MODE
  	 * \endif
  	 */
    public int        			emMode;          
    
    /**
  	 * \if ENGLISH_LANG
  	 *  burning stream format��value corresponding to NET_BURN_RECORD_PACK
  	 * \else
  	 * ��¼����ʽ, ֵ��ӦNET_BURN_RECORD_PACK
  	 * \endif
  	 */
    public int 				    emPack;                                 
}
