package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of EVENT_TRAFFICSNAPSHOT's data
 * \else
 * �¼�����EVENT_TRAFFICSNAPSHOT(��ͨץ���¼�)��Ӧ����
 * \endif
 */
public class DEV_EVENT_TRAFFICSNAPSHOT_INFO implements Serializable {
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
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * �¼�����
	 * \endif
	 */
	public byte					szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)t
	 * \else
	 * ʱ���(��λ�Ǻ���)
	 * \endif
	 */
	public double				PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * The event happen time
	 * \else
	 * �¼�������ʱ��
	 * \endif
	 */
	public NET_TIME_EX			UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * �¼�ID
	 * \endif
	 */
	public int					nEventID;
	
	/**
	 * \if ENGLISH_LANG
	 * Car way number being snapshotting
	 * \else
	 * ����ץ�ĵĳ�������
	 * \endif
	 */
	public byte                	bCarWayCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Car way info being snapshotting
	 * \else
	 * �˴���ץ�ĵĳ��������Ϣ
	 * \endif
	 */
	public SDK_CARWAY_INFO      	stuCarWayInfo[] = new SDK_CARWAY_INFO[FinalVar.SDK_MAX_CARWAY_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Event file info
	 * \else
	 * �¼���Ӧ�ļ���Ϣ
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  	stuFileInfo = new SDK_EVENT_FILE_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * �¼�������0��ʾ�����¼�,1��ʾ�������¼���ʼ,2��ʾ�������¼�����;
	 * \endif
	 */
	public byte                	bEventAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture no., within same time(second) may have multiple pictures, from 0 to
	 * \else
	 * ͼƬ�����, ͬһʱ����(��ȷ����)�����ж���ͼƬ, ��0��ʼ
	 * \endif
	 */
	public byte					byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Flag(by bit),see NET_RESERVED_COMMON
	 * \else
	 * ץͼ��־(��λ)�������NET_RESERVED_COMMON	
	 * \endif
	 */
	public int               	dwSnapFlagMask;
    
    public DEV_EVENT_TRAFFICSNAPSHOT_INFO() {
    	for(int i=0 ; i<FinalVar.SDK_MAX_CARWAY_NUM ; i++) {
    		stuCarWayInfo[i] = new SDK_CARWAY_INFO();
    	}
    }
}
