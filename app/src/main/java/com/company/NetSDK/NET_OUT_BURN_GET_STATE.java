package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_BURN_GET_STATE implements Serializable {

	/**
	 * BurnGetState output param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * burning status, corresponding to Class NET_BURN_STATE
	 * \else
	 *  ��¼״̬, ��Ӧ��NET_BURN_STATE
	 * \endif
	 */
	public 	int emState;
	
	/**
	 * \if ENGLISH_LANG
	 *  burning error code, corresponding to  NET_BURN_ERROR_CODE
	 * \else
	 *  ��¼������, ��ӦNET_BURN_ERROR_CODE
	 * \endif
	 */
	public int  emErrorCode;       
	
	/**
	 * \if ENGLISH_LANG
	 *  burning device mask, by bit means multiple device group
	 * \else
	 *  ��¼�豸����, ��λ��ʾ�����¼�豸���
	 * \endif
	 */
	public int  nDevMask;       
	      
	/**
	 * \if ENGLISH_LANG
	 *  burning error code
	 * \else
	 *  ��¼ͨ������
	 * \endif
	 */
	 public int              nChannels[] = new int[FinalVar.SDK_MAX_BURN_CHANNEL_NUM];
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning channel number
	 * \else
	 *  ��¼ͨ����
	 * \endif
	 */
	 public int                  nChannelCount; 
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning mode�� corresponding to NET_BURN_MODE
	 * \else
	 * ��¼ģʽ, ��Ӣ��NET_BURN_MODE
	 * \endif
	 */
	 public int 				 emMode;     
	  
	 /**
	 * \if ENGLISH_LANG
	 * urning stream format�� corresponding to NET_BURN_RECORD_PACK
	 * \else
	 * ��¼����ʽ, ��Ӣ��NET_BURN_RECORD_PACK
	 * \endif
	 */
	 public int					 emPack;        

	 /**
	 * \if ENGLISH_LANG
	 * current burning file no
	 * \else
	 * ��ǰ��¼�ļ����
	 * \endif
	 */
	 public int                  nFileIndex;        
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning start time
	 * \else
	 * ��¼��ʼʱ��
	 * \endif
	 */
	 public NET_TIME             stuStartTime = new NET_TIME();
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning device status
	 * \else
	 *  ��¼�豸״̬
	 * \endif
	 */
	 public NET_BURN_DEV_STATE          stuDevState[] = new NET_BURN_DEV_STATE[FinalVar.SDK_MAX_BURNING_DEV_NUM]; 
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning remain time, unit second, -1 means invalid
	 * \else
	 *  ��¼ʣ��ʱ��, ��λ��, -1������Ч
	 * \endif
	 */
	 public int                  nRemainTime;
	 
	 public NET_OUT_BURN_GET_STATE()
	 {
		 for(int i = 0; i < FinalVar.SDK_MAX_BURNING_DEV_NUM; i++)
		 {
			 stuDevState[i] = new NET_BURN_DEV_STATE();
		 }
	 }
	 
}
