package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of DEV_EVENT_ALARM_PIC_INFO data
 * \else
 * �¼�����DEV_EVENT_ALARM_PIC_INFO(ͼƬ��Ϣ�¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_ALARM_PIC_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * �¼�����
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * ʱ���(��λ�Ǻ���)
	 * \endif
	 */
    public double              PTS;
    
    /**
     * \if ENGLISH_LANG
     * the event happen time
     * \else
     * �¼�������ʱ��
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();
    
    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * �¼�ID
     * \endif
     */
    public int                 nEventID;
    
    /**
     * \if ENGLISH_LANG
     * stuTime, not in UTC
     * \else
     * �¼�������ʱ��, (�豸ʱ��, ��һ����utcʱ��)
     * \endif    
     */
    public NET_TIME_EX         stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * nEventType
     * \else
     * �¼�����
     * \endif    
     */
    public int                 nEventType;

    /**
     * \if ENGLISH_LANG
     * nSpeed, km/h
     * \else
     * ���٣���λkm/h
     * \endif    
     */
    public int                 nSpeed;

    /**
     * \if ENGLISH_LANG
     * nSpeedHighLine, km/h
     * \else
     * �������ޱ���ֵ, ��λkm/h
     * \endif    
     */
    public int                 nSpeedHighLine;

    /**
     * \if ENGLISH_LANG
     * nDisk
     * \else
     * ���̺�
     * \endif    
     */
    public int                 nDisk;

    /**
     * \if ENGLISH_LANG
     * nCluster
     * \else
     * �غ�
     * \endif    
     */
    public int                 nCluster;

    /**
     * \if ENGLISH_LANG
     * nPartition
     * \else
     * ������
     * \endif    
     */
    public int                 nPartition;

    /**
     * \if ENGLISH_LANG
     * szSnapAddr
     * \else
     * ץͼ�ص�, ��Ч64�ֽ�
     * \endif    
     */
    public byte                szSnapAddr[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * ID of picture
     * \else
     * ͼƬΨһID
     * \endif    
     */
    public byte                szPicID[] = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Plate
     * \else
     * ����
     * \endif    
     */
    public byte                szPlate[] = new byte[FinalVar.SDK_COMMON_STRING_16];
}
