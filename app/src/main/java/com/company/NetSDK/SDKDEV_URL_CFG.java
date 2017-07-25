package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WEB path configuration
 * \else
 * WEB·������
 * \endif
 */
public class SDKDEV_URL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Snap or not
	 * \else
	 * �Ƿ�ץͼ
	 * \endif
	 */
	public boolean                bSnapEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap interval
	 * \else
	 * ץͼ����
	 * \endif
	 */
	public int                 iSnapInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * HTTP host IP
	 * \else
	 * HTTP����IP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Host port
	 * \else
	 * ����port
	 * \endif
	 */
    public short                wHostPort;
    
    /**
	 * \if ENGLISH_LANG
	 * Status message send out interval
	 * \else
	 * ״̬��Ϣ���ͼ��
	 * \endif
	 */
    public int                 iMsgInterval;
    
    /**
	 * \if ENGLISH_LANG
	 * Message status upload URL
	 * \else
	 * ״̬��Ϣ�ϴ�URL
	 * \endif
	 */
    public byte                szUrlState[] = new byte[FinalVar.SDK_MAX_URL_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Picture upload Url 
	 * \else
	 * ͼƬ�ϴ�Url 
	 * \endif
	 */
    public byte                szUrlImage[] = new byte[FinalVar.SDK_MAX_URL_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Device web SN
	 * \else
	 * ������web���
	 * \endif
	 */
    public byte                szDevId[] = new byte[FinalVar.SDK_MAX_DEV_ID_LEN];
}
