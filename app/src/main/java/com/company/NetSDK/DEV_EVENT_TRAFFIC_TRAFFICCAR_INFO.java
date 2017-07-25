package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TrafficCar
 * \else
 * ��ͨ������Ϣ
 * \endif
 */
public class DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Plate number
	 * \else
	 * ���ƺ���
	 * \endif
	 */
	public byte               szPlateNumber[] 	= new byte[32];          
	/**
	 * \if ENGLISH_LANG
	 * Plate type
	 * \else
	 * ��������	�μ�VideoAnalyseRule�г������Ͷ���
	 * \endif
	 */
	public byte               szPlateType[] 	= new byte[32];          
	/**
	 * \if ENGLISH_LANG
	 * plate color, "Blue","Yellow", "White","Black"
	 * \else
	 * ������ɫ	"Blue","Yellow", "White","Black"
	 * \endif
	 */
	public byte               szPlateColor[] 	= new byte[32];          
	/**
	 * \if ENGLISH_LANG
	 * vehicle color, "White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \else
	 * ������ɫ	"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \endif
	 */
	public byte               szVehicleColor[] = new byte[32];          
	/**
	 * \if ENGLISH_LANG
	 * speed, Km/H
	 * \else
	 * �ٶ�	��λKm/H
	 * \endif
	 */
	public int                nSpeed;                          		 
	/**
	 * \if ENGLISH_LANG
	 * trigger event type
	 * \else
	 * ����������¼�	�μ��¼��б�Event List��ֻ������ͨ����¼���
	 * \endif
	 */
	public byte               szEvent[] = new byte[64];                 
	/**
	 * \if ENGLISH_LANG
	 * violation code, see TrafficGlobal.ViolationCode
	 * \else
	 * Υ�´���	���TrafficGlobal.ViolationCode
	 * \endif
	 */
	public byte               szViolationCode[] = new byte[32];         
	/**
	 * \if ENGLISH_LANG
	 * violation describe
	 * \else
	 * Υ������
	 * \endif
	 */
	public byte               szViolationDesc[] = new byte[64];         
	/**
	 * \if ENGLISH_LANG
	 * lower speed limit
	 * \else
	 * �ٶ�����
	 * \endif
	 */
	public int                nLowerSpeedLimit;                
	/**
	 * \if ENGLISH_LANG
	 * upper speed limit
	 * \else
	 * �ٶ�����
	 * \endif
	 */
	public int                nUpperSpeedLimit;                
	/**
	 * \if ENGLISH_LANG
	 * over speed margin, km/h 
	 * \else
	 * �޸��ٿ���ֵ	��λ��km/h
	 * \endif
	 */
	public int                nOverSpeedMargin;                 
	/**
	 * \if ENGLISH_LANG
	 * under speed margin, km/h 
	 * \else
	 * �޵��ٿ���ֵ	��λ��km/h 
	 * \endif
	 */
	public int                nUnderSpeedMargin;               
	/**
	 * \if ENGLISH_LANG
	 * lane
	 * \else
	 * ����	�μ��¼��б�Event List�п��ں�·���¼���
	 * \endif
	 */
	public int                nLane;                           
	/**
	 * \if ENGLISH_LANG
	 * vehicle size, see VideoAnalyseRule's describe
	 * \else
	 * ������С,-1��ʾδ֪������λ
	 * ��0λ:"Light-duty", С�ͳ�
	 * ��1λ:"Medium", ���ͳ�
	 * ��2λ:"Oversize", ���ͳ�
	 * ��3λ:"Minisize", ΢�ͳ�
	 * ��4λ:"Largesize", ����
	 * \endif
	 */
	public int                nVehicleSize;                    

	/**
	 * \if ENGLISH_LANG
	 * vehicle length, (m)
	 * \else
	 * ��������	��λ��
	 * \endif
	 */
	public float             fVehicleLength;                  
	/**
	 * \if ENGLISH_LANG
	 * snap mode 0-normal,1-globle,2-near,4-snap on the same side,8-snap on the reverse side,16-plant picture
	 * \else
	 * ץ�ķ�ʽ	0-δ���࣬1-ȫ����2-������4-ͬ��ץ�ģ�8-����ץ�ģ�16-����ͼ��
	 * \endif
	 */
	public int                nSnapshotMode;                   
	/**
	 * \if ENGLISH_LANG
	 * channel name
	 * \else
	 * ���ػ�Զ�̵�ͨ�����ƣ������ǵص���Ϣ	��Դ��ͨ����������ChannelTitle.Name 
	 * \endif
	 */
	public byte               szChannelName[] = new byte[32];               
	/**
	 * \if ENGLISH_LANG
	 * Machine name
	 * \else
	 * ���ػ�Զ���豸����	��Դ����ͨ����General.MachineName
	 * \endif
	 */
	public byte               szMachineName[] = new byte[256];              
	/**
	 * \if ENGLISH_LANG
	 * machine group
	 * \else
	 * �����������豸������λ	Ĭ��Ϊ�գ��û����Խ���ͬ���豸��Ϊһ�飬���ڹ������ظ���
	 * \endif
	 */
	public byte               szMachineGroup[] = new byte[256];             
	/**
	 * \if ENGLISH_LANG
	 * road way number	
	 * \else
	 * ��·���
	 * \endif
	 */
	public byte               szRoadwayNo[] = new byte[64];                 
	/**
	 * \if ENGLISH_LANG
	 * DrivingDirection: for example ["Approach", "Shanghai", "Hangzhou"]
	 * "Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car
	 * the second and third param means the location of the driving direction
	 * \else
     * "DrivingDirection" : ["Approach", "�Ϻ�", "����"],��ʻ����
     * "Approach"-���У����������豸�����Խ��Խ����"Leave"-���У�
     * ���������豸�����Խ��ԽԶ���ڶ��͵����������ֱ�������к�
     * ���е������ص�
	 * \endif
	 */
	public byte               szDrivingDirection[][] = new byte[3][FinalVar.SDK_MAX_DRIVINGDIRECTION];    
	/**
	 * \if ENGLISH_LANG
	 * device address,OSD superimposed onto the image,from TrafficSnapshot.DeviceAddress,'\0'means end.
	 * \else
	 * �豸��ַ,OSD���ӵ�ͼƬ�ϵ�,��Դ������TrafficSnapshot.DeviceAddress,'\0'����
	 * \endif
	 */
	public byte[]             szDeviceAddress;                 
	/**
	 * \if ENGLISH_LANG
	 * Vehicle mark, such as "Unknown"-unknown, "Audi"-Audi, "Honda"-Honda ...
	 * \else
	 * ������ʶ, ���� "Unknown"-δ֪, "Audi"-�µ�, "Honda"-���� ...
	 * \endif
	 */
	public byte			   szVehicleSign[] = new byte[32];				
	/**
	 * \if ENGLISH_LANG
	 * Vehicle detector generated snapshot signal redundant info
	 * \else
	 * �ɳ���������ץ���ź�������Ϣ
	 * \endif
	 */
	public SDK_SIG_CARWAY_INFO_EX stuSigInfo = new SDK_SIG_CARWAY_INFO_EX();                   
	/**
	 * \if ENGLISH_LANG
	 * Device allocation location
	 * \else
	 * �豸����ص�
	 * \endif
	 */
	public byte[]			   szMachineAddr;					
	/**
	 * \if ENGLISH_LANG
	 * Current picture exposure time��unit is ms
	 * \else
	 * ��ǰͼƬ�ع�ʱ�䣬��λΪ����
	 * \endif
	 */
	public float              fActualShutter;                  
	/**
	 * \if ENGLISH_LANG
	 * Current picture gain��range is 0~100
	 * \else
	 * ��ǰͼƬ���棬��ΧΪ0~100
	 * \endif
	 */
	public byte               byActualGain;                    
	/**
	 * \if ENGLISH_LANG
	 * 0-S to N 1-SW to NE 2-W to E 3-NW to SE 4-N to S 5-NE to SW 6-E to W 7-SE to NW 8-Unknown
	 * \else
	 * 0-���� 1-�����򶫱� 2-���� 3-�������� 4-������ 5-���������� 6-������ 7-���������� 8-δ֪
	 * \endif
	 */
	public byte			   byDirection;						
	/**
	 * \if ENGLISH_LANG
	 * Detailed addreaa, as szDeviceAddress compensation
	 * \else
	 * ��ϸ��ַ, ��ΪszDeviceAddress�Ĳ���
	 * \endif
	 */
	public byte[]			   szDetailedAddress;				
}
