package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarming Decoder Alarm
 * \else
 * ��������������
 * \endif
 */
public class ALARM_ATM_INFO_UPLOAD_CHNL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * ��������������
	 * \endif
	 */
	public int                 nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * ATM id
	 * \else
	 * ATM�ն˺�
	 * \endif
	 */
	public byte                szATMID[] = new byte[32];
	
 	/**
	 * \if ENGLISH_LANG
	 * card number, 6222421541208230456
	 * \else
	 * ����    ����6222421541208230456 
	 * \endif
	 */
    public byte                szCardNo[] = new byte[32];
    
 	/**
	 * \if ENGLISH_LANG
	 * trade time, 20111118112200 means 2011-11-18 11:22:00	
	 * \else
	 * ����ʱ��    ����20111118112200��ʾ2011-11-18 11:22:00
	 * \endif
	 */
    public byte                szTradetime[] = new byte[32];
    
 	/**
	 * \if ENGLISH_LANG
	 * trade type
	 * \else
	 * ��������    ��Χ: SDK_eATMTradeTypes
	 * \endif
	 */
    public int                 emTradeType;
    
 	/**
	 * \if ENGLISH_LANG
	 * trade mount	0-4294967296
	 * \else
	 * ���׽��    0-4294967296
	 * \endif
	 */
    public int                 nAmount;                    
}
