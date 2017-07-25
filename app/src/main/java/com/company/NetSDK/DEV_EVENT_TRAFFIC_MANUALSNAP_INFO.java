package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of EVENT_IVS_TRAFFIC_MANUALSNAP's data
 * \else
 * �¼�����EVENT_IVS_TRAFFIC_MANUALSNAP(��ͨ�ֶ�ץ���¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_TRAFFIC_MANUALSNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int				nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * �¼�����
	 * \endif
	 */
	public byte				szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * ʱ���(��λ�Ǻ���)
	 * \endif
	 */
	public double			PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * The event happen time
	 * \else
	 * �¼�������ʱ��
	 * \endif
	 */
	public NET_TIME_EX		UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * �¼�ID
	 * \endif
	 */
	public int				nEventID;
	
	/**
	 * \if ENGLISH_LANG
	 * Lane number
	 * \else
	 * ��Ӧ������
	 * \endif
	 */
	public int				nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * Manual snap number
	 * \else
	 * �ֶ�ץ����� 
	 * \endif
	 */
	public byte            	szManualSnapNo[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Have being detected object
	 * \else
	 * ��⵽������
	 * \endif
	 */
	public SDK_MSG_OBJECT	stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Have being detected vehicle
	 * \else
	 * ��⵽�ĳ�����Ϣ
	 * \endif
	 */
	public SDK_MSG_OBJECT    stuVehicle = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * TrafficCar info
	 * \else
	 * ��ʾ��ͨ���������ݿ��¼
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Event file info
	 * \else
	 * �¼���Ӧ�ļ���Ϣ
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * �¼�������0��ʾ�����¼�,1��ʾ�������¼���ʼ,2��ʾ�������¼�����;
	 * \endif
	 */
	public byte                bEventAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture no. from 0,at the smae time may havemultiple pictures
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
    
	/**
	 * \if ENGLISH_LANG
	 * Picture resolution
	 * \else
	 * ��ӦͼƬ�ķֱ���
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();
}
