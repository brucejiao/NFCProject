package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extended COM configuration structure 
 * \else
 * ��չ�������ýṹ��
 * \endif
 */
public class SDKDEV_COMM_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Decoder protocol amount
	 * \else
	 * ������Э�����
	 * \endif
	 */
	public int               dwDecProListNum;

	/**
	 * \if ENGLISH_LANG
	 * Protocol name list
	 * \else
	 * Э�����б�
	 * \endif
	 */
    public byte                DecProName[][] = new byte[FinalVar.SDK_MAX_DECPRO_LIST_SIZE][FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Each decoder current property
	 * \else
	 * ����������ǰ����
	 * \endif
	 */
	public SDK_485_CFG          stDecoder[] = new SDK_485_CFG[FinalVar.SDK_MAX_DECODER_NUM];

	/**
	 * \if ENGLISH_LANG
	 * 232 function amount
	 * \else
	 * 232���ܸ���
	 * \endif
	 */
	public int               dw232FuncNameNum;

	/**
	 * \if ENGLISH_LANG
	 * Function name list
	 * \else
	 * �������б�
	 * \endif
	 */
    public byte                s232FuncName[][] = new byte[FinalVar.SDK_MAX_232FUNCS][FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * 232 com amount
	 * \else
	 * 232���ڸ���
	 * \endif
	 */
	public int               dw232ComNum;

	/**
	 * \if ENGLISH_LANG
	 * Current 232 COM property
	 * \else
	 * ��232���ڵ�ǰ����
	 * \endif
	 */
	public SDK_RS232_CFG        st232[] = new SDK_RS232_CFG[FinalVar.SDK_MAX_232_NUM_EX];
    
    public SDKDEV_COMM_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_MAX_DECODER_NUM; i++) {
    		stDecoder[i] = new SDK_485_CFG();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_232_NUM_EX; i++) {
    		st232[i] = new SDK_RS232_CFG();
    	}
    }
}
