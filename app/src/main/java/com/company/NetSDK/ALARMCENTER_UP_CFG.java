package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The setup of alarm upload
 * \else
 * �����ϴ�������
 * \endif
 */
public class ALARMCENTER_UP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable upload
	 * \else
	 * �ϴ�ʹ��
	 * \endif
	 */
	public byte                byEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm center listening port 
	 * \else
	 * �������������˿�
	 * \endif
	 */
	public short                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm center IP
	 * \else
	 * ��������IP
	 * \endif
	 */
    public byte                sHostIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
    
    /**
     * \if ENGLISH_LANG
     * Enable scheduled upload.Use it to upload IP or domain name to the centre.
     * \else
     * ��ʱ�ϴ�ʹ�ܣ����������������ϴ�IP��������
     * \endif
     */
    public int                 nByTimeEn;
    
    /**
     * \if ENGLISH_LANG
     * Set upload date 
     * "Never = 0", "Everyday = 1", "Sunday = 2", 
     * "Monday = 3", Tuesday = 4", "Wednesday = 5",
     * "Thursday = 6", "Friday = 7", "Saturday = 8"
     * \else
     * �����ϴ�����  
     * "Never = 0", "Everyday = 1", "Sunday = 2", 
     * "Monday = 3", Tuesday = 4", "Wednesday = 5",
     * "Thursday = 6", "Friday = 7", "Saturday = 8"
     * \endif
     */
    public int                 nUploadDay;
    
    /**
     * \if ENGLISH_LANG
     * Set upload time ,[0~23]o'clock
     * \else
     * �����ϴ�ʱ�� ,[0~23]��
     * \endif
     */
    public int                 nUploadHour;
}
