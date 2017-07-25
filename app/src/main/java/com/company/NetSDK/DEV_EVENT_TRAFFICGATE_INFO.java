package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of EVENT_IVS_TRAFFICGATE's data
 * \else
 * �¼�����EVENT_IVS_TRAFFICGATE(��ͨ�����¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_TRAFFICGATE_INFO implements Serializable {
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
	 * PTS(ms)
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
	 * Have being detected object
	 * \else
	 * ��⵽������
	 * \endif
	 */
	public SDK_MSG_OBJECT		stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Road number
	 * \else
	 * ��Ӧ������
	 * \endif
	 */
	public int					nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * The car's actual rate(Km/h)
	 * \else
	 * ����ʵ���ٶ�Km/h
	 * \endif
	 */
	public int					nSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Rate upper limit(km/h)
	 * \else
	 * �ٶ����� ��λ��km/h
	 * \endif
	 */
	public int					nSpeedUpperLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * Rate lower limit(km/h) 
	 * \else
	 * �ٶ����� ��λ��km/h 
	 * \endif
	 */
	public int					nSpeedLowerLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * BreakingRule's mask,first byte: Retrograde; 
	 * Second byte:Overline; the third byte:Overspeed; 
	 * The forth byte:UnderSpeed;the five byte: crash red light;the six byte:passing(trafficgate)
	 * The seven byte: OverYellowLine; the eight byte: WrongRunningRoute; the nine byte: YellowVehicleInRoute; default: trafficgate
	 * </pre>
	 * \else
	 * <pre>
	 * Υ����������,��һλ:����; 
	 * �ڶ�λ:ѹ����ʻ; ����λ:������ʻ; 
	 * ����λ��Ƿ����ʻ; ����λ:�����;����λ:����·��(�����¼�)
	 * ����λ: ѹ����; �ڰ�λ: �г�ռ��; �ھ�λ: ����ռ��;����Ĭ��Ϊ:��ͨ�����¼�
	 * </pre>
	 * \endif
	 */
	public int					dwBreakingRule;
	
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
	 * Vehicle info
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Manual snap sequence string  
	 * \else
	 * �ֶ�ץ�����            
	 * \endif
	 */
	public byte                szManualSnapNo[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Snap index,such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * ��ʾץ����ţ���3,2,1,1��ʾץ�Ľ���,0��ʾ�쳣����
	 * \endif
	 */
	public int                 nSequence;
	
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
	 * Snap flag from device
	 * \else
	 * �豸������ץ�ı�ʶ
	 * \endif
	 */
	public byte                bSnapFlag[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Snap mode,0-normal 1-globle 2-near 4-snap on the same side 8-snap on the reverse side 16-plant picture
	 * \else
	 * ץ�ķ�ʽ��0-δ���� 1-ȫ�� 2-���� 4-ͬ��ץ�� 8-����ץ�� 16-����ͼ��
	 * \endif
	 */
	public byte                bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed percentage
	 * \else
	 * ���ٰٷֱ�
	 * \endif
	 */
	public byte                byOverSpeedPercentage;
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed percentage
	 * \else
	 * Ƿ�ٰٷֱ�
	 * \endif
	 */
	public byte                byUnderSpeedingPercentage;
	
	/**
	 * \if ENGLISH_LANG
	 * Red light margin, sr
	 * \else
	 * ���������ʱ��,��λ����
	 * \endif
	 */
	public byte                byRedLightMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * Drive direction,0-"Approach",where the car is more near,1-"Leave",means where if mor far to the car
	 * \else
	 * ��ʻ����0-����(���������豸�����Խ��Խ��)��1-����(���������豸�����Խ��ԽԶ)
	 * \endif
	 */
	public byte                byDriveDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * Road way number
	 * \else
	 * ��·���
	 * \endif
	 */
	public byte                szRoadwayNo[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * Υ�´���
	 * \endif
	 */
	public byte                szViolationCode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Violation desc
	 * \else
	 * Υ������
	 * \endif
	 */
	public byte                szViolationDesc[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture resolution
	 * \else
	 * ��ӦͼƬ�ķֱ���
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Car type,"Motor", "Light-duty", "Medium", "Oversize", "Huge", "Other" 
	 * \else
	 * ������С���ͣ�"Motor" Ħ�г��� "Light-duty" С�ͳ� "Medium" ���ͳ� "Oversize" ���ͳ� "Huge" ���� "Other" ��������
	 * \endif
	 */
	public byte                szVehicleType[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Car length, m
	 * \else
	 * ��������, ��λ��
	 * \endif
	 */
	public byte                byVehicleLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture no.,  within same time(second)may have multiple pictures, from 0 to
	 * \else
	 * ͼƬ�����, ͬһʱ����(��ȷ����)�����ж���ͼƬ, ��0��ʼ
	 * \endif
	 */
	public byte				byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed margin, km/h 
	 * \else
	 * �޸��ٿ���ֵ	��λ��km/h 
	 * \endif
	 */
	public int                 nOverSpeedMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed margin, km/h 
	 * \else
	 * �޵��ٿ���ֵ	��λ��km/h 
	 * \endif
	 */
	public int                 nUnderSpeedMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * "DrivingDirection" : ["Approach", "Shanghai", "Hangzhou"],
	 * "Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car
	 * the second and third param means the location of the driving direction
	 * </pre>
	 * \else
	 * <pre>
	 * "DrivingDirection" : ["Approach", "�Ϻ�", "����"],��ʻ����
	 * "Approach"-���У����������豸�����Խ��Խ����"Leave"-���У�
	 * ���������豸�����Խ��ԽԶ���ڶ��͵����������ֱ�������к�
	 * ���е������ص㣬UTF-8����
	 * </pre>
	 * \endif
	 */
	public byte                szDrivingDirection[][] = new byte[3][FinalVar.SDK_MAX_DRIVINGDIRECTION];

	/**
	 * \if ENGLISH_LANG
	 * Machine name
	 * \else
	 * ���ػ�Զ���豸����
	 * \endif
	 */
	public byte                szMachineName[] = new byte[256];
	
	/**
	 * \if ENGLISH_LANG
	 * Machine address
	 * \else
	 * ��������ص㡢��·����
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[256];
	
	/**
	 * \if ENGLISH_LANG
	 * Machine group
	 * \else
	 * �������顢�豸������λ
	 * \endif
	 */
	public byte                szMachineGroup[] = new byte[256];
	
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
	 * The vehicle detector generates the snap signal redundancy info
	 * \else
	 * �ɳ���������ץ���ź�������Ϣ
	 * \endif
	 */
	public SDK_SIG_CARWAY_INFO_EX stuSigInfo = new SDK_SIG_CARWAY_INFO_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * File path
	 * \else
	 * �ļ�·��
	 * \endif
	 */
	public byte                szFilePath[] = new byte[FinalVar.MAX_PATH];
	
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
	 * Device address,OSD superimposed onto the image,from TrafficSnapshot.DeviceAddress,'\0'means end.
	 * \else
	 * �豸��ַ,OSD���ӵ�ͼƬ�ϵ�,��Դ������TrafficSnapshot.DeviceAddress,'\0'����
	 * \endif
	 */
	public byte[]              szDeviceAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture exposure time��unit is ms
	 * \else
	 * ��ǰͼƬ�ع�ʱ�䣬��λΪ����
	 * \endif
	 */
	public float               fActualShutter;
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture gain��range 0~100
	 * \else
	 * ��ǰͼƬ���棬��ΧΪ0~100
	 * \endif
	 */
	public byte                byActualGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Card quantity
	 * \else
	 * ��Ƭ����
	 * \endif
	 */
	public byte                bRetCardNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * ��Ƭ��Ϣ
	 * \endif
	 */
	public EVENT_CARD_INFO     stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];   
    
    public DEV_EVENT_TRAFFICGATE_INFO() {
    	for (int i=0 ; i<FinalVar.SDK_EVENT_MAX_CARD_NUM ; i++) {
    		stuCardInfo[i] = new EVENT_CARD_INFO();
    	}
    }
}
