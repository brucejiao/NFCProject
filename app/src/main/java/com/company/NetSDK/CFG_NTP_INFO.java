package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Time Synchronization Server Configuration
 * \else
 * ʱ��ͬ������������
 * \endif
 */
public class CFG_NTP_INFO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable switch 
	 * \else
	 * ʹ�ܿ���
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * NTP IP address or network name of NTP Server
	 * \else
	 * NTP������  IP��ַ��������
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port number of NTP Server
	 * \else
	 * �˿ں�
	 * \endif
	 */
	public int					nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Update cycle, in minutes.
	 * \else
	 * �������ڣ���λΪ����. 0��ʾ��Уʱ
	 * \endif
	 */
	public int					nUpdatePeriod; 
	
	/**
	 * \if ENGLISH_LANG
	 * Time zone
	 * \else
	 * ʱ��
	 * \endif
	 * @see ʱ������(TimeZone Type) EM_CFG_TIME_ZONE_TYPE
	 */
	public int					emTimeZoneType;
	
	/**
	 * \if ENGLISH_LANG
	 * Time zone description
	 * \else
	 * ʱ������
	 * \endif
	 */
	public byte[]				szTimeZoneDesc = new byte[FinalVar.MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * The number of standby NTP servers
	 * \else
	 * ʵ�ʱ���NTP����������
	 * \endif
	 */
	public int                 nSandbyServerNum;   
	
	/**
	 * \if ENGLISH_LANG
	 * Standby NTP Servers
	 * \else
	 * ��ѡNTP��������ַ
	 * \endif
	 */
    public CFG_NTP_SERVER[]      stuStandbyServer = new CFG_NTP_SERVER[FinalVar.MAX_NTP_SERVER];   
    
    public CFG_NTP_INFO() {
    	for (int i = 0; i < FinalVar.MAX_NTP_SERVER; ++i) {
    		stuStandbyServer[i] = new CFG_NTP_SERVER();
    	}
    }
}
