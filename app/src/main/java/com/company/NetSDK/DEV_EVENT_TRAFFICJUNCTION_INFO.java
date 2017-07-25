package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of EVENT_IVS_TRAFFICJUNCTION's data
 * \else
 * �¼�����EVENT_IVS_TRAFFICJUNCTION(��ͨ·���¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_TRAFFICJUNCTION_INFO implements Serializable {
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
	 * Have being detected object
	 * \else
	 * ��⵽������
	 * \endif
	 */
	public SDK_MSG_OBJECT	stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Road number
	 * \else
	 * ��Ӧ������
	 * \endif
	 */
	public int				nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * BreakingRule's mask,first byte: crash red light; 
	 * secend byte:break the rule of driving road number; 
	 * the third byte:converse; the forth byte:break rule to turn around;
	 * the five byte:traffic jam; the six byte:traffic vacancy; 
	 * the seven byte: Overline; defalt:trafficJunction    
	 * </pre>
	 * \else
	 * <pre>
  	 * Υ����������,��һλ:�����; 
     * �ڶ�λ:�����涨������ʻ;
     * ����λ:����; ����λ��Υ�µ�ͷ;
	 * ����λ:��ͨ����; ����λ:��ͨ�쳣����
     * ����λ:ѹ����ʻ; ����Ĭ��Ϊ:��ͨ·���¼�
     * </pre>
	 * \endif
	 */
	public int				dwBreakingRule;
	
	/**
	 * \if ENGLISH_LANG
	 * The begin time of red light
	 * \else
	 * ��ƿ�ʼUTCʱ��
	 * \endif
	 */
	public NET_TIME_EX			RedLightUTC = new NET_TIME_EX();
	
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
	 * Snap index,such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * ��ʾץ����ţ���3,2,1,1��ʾץ�Ľ���,0��ʾ�쳣����
	 * \endif
	 */
	public int                 	nSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Car's speed (km/h)
	 * \else
	 * �˳���ʵ���ٶ�Km/h  
	 * \endif
	 */
	public int                 	nSpeed;
	
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
	 * Picture no.,, within same time(second)may have multiple pictures, from 0 to
	 * \else
	 * ͼƬ�����, ͬһʱ����(��ȷ����)�����ж���ͼƬ, ��0��ʼ
	 * \endif
	 */
	public byte					byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle info
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public SDK_MSG_OBJECT       	stuVehicle = new SDK_MSG_OBJECT();
	
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
	public SDK_RESOLUTION_INFO 	stuResolution = new SDK_RESOLUTION_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ������Ӧ��ԭʼ¼���ļ���Ϣ
	 * \endif
	 */
	public byte                	szRecordFile[] = new byte[FinalVar.SDK_COMMON_STRING_128];
	
	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle info
	 * \else
	 * ��ͨ������Ϣ
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Card quantity
	 * \else
	 * ��Ƭ����
	 * \endif
	 */
	public int               	dwRetCardNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * ��Ƭ��Ϣ
	 * \endif
	 */
    public EVENT_CARD_INFO     	stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];
    
    public byte 				byDirection;
    public byte					byLightState;
    
    public DEV_EVENT_TRAFFICJUNCTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_EVENT_MAX_CARD_NUM; i++) {
    		stuCardInfo[i] = new EVENT_CARD_INFO();
    	}
    }
}
