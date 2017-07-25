package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The corresponding search criteria of  SDK_MEDIA_QUERY_TRAFFICCAR
 * \else
 * SDK_MEDIA_QUERY_TRAFFICCAR��Ӧ�Ĳ�ѯ����
 * \endif
 */
public class MEDIA_QUERY_TRAFFICCAR_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The channel number begins with 0. -1 is to search information of all channels .
	 * \else
	 * ͨ���Ŵ�0��ʼ��-1��ʾ��ѯ����ͨ��
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Start time 	
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public NET_TIME			StartTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End time 
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME			EndTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * File type:0=search any type.1=search jpg file
	 * \else
	 * �ļ����ͣ�0:��������, 1:jpgͼƬ, 2:dav�ļ�
	 * \endif
	 */
	public int					nMediaTyp;
	
	/**
	 * \if ENGLISH_LANG
	 * Event type,please refer to Intelligent Analytics Event Type. 0 means search any event. 
	 * \else
	 * �¼����ͣ����"���ܷ����¼�����", 0:��ʾ��ѯ�����¼����˲�����������ʹ��pEventTypes
	 * \endif
	 */
	public int					nEventType;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle plate. "\0" is to search any plate number.
	 * \else
	 * ���ƺ�, "\0"���ʾ��ѯ���⳵�ƺ�
	 * \endif
	 */
	public char				szPlateNumber[] = new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * The searched vehicle speed range. Max speed unit is km/h
	 * \else
	 * ��ѯ�ĳ��ٷ�Χ; �ٶ����� ��λ: km/h
	 * \endif
	 */
	public int					nSpeedUpperLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * The searched vehicle speed range. Min speed unit is km/h
	 * \else
	 * ��ѯ�ĳ��ٷ�Χ; �ٶ����� ��λ: km/h 
	 * \endif
	 */
	public int					nSpeedLowerLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * Search according to the speed or not.  TRUE: search according to the speed.nSpeedUpperLimit and nSpeedLowerLimit is valid.
	 * \else
	 * �Ƿ��ٶȲ�ѯ; TRUE:���ٶȲ�ѯ,nSpeedUpperLimit��nSpeedLowerLimit��Ч��
	 * \endif
	 */
	public boolean				bSpeedLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * Illegal type:
	 * When event type is EVENT_IVS_TRAFFICGATE
	 * bit1: Retrograde;   bit2: Overline; 
	 * bit3: Overspend; 	bit4:Under speed; 
	 * bit5: RunRedLight;
	 * When event type is EVENT_IVS_TRAFFICJUNCTION
	 * bit1: RunRedLight;  bit2: WrongLan;  
	 * bit3: Retrograde; 	bit4:UTurn;
	 * bit5: Overline;
	 * </pre>
	 * \else
	 * Υ�����ͣ�
	 * <pre>
	 * ���¼�����Ϊ EVENT_IVS_TRAFFICGATEʱ
	 * ��һλ:����;  �ڶ�λ:ѹ����ʻ; ����λ:������ʻ; 
	 * ����λ��Ƿ����ʻ; ����λ:�����;
	 * ���¼�����Ϊ EVENT_IVS_TRAFFICJUNCTION
	 * ��һλ:�����;  �ڶ�λ:�����涨������ʻ;  
	 * ����λ:����; ����λ��Υ�µ�ͷ;
	 * ����λ:ѹ����ʻ;
	 * </pre>
	 * \endif
	 */
	public int					dwBreakingRule;
	
	/**
	 * \if ENGLISH_LANG
	 * Plate type,"Unknown" ,"Normal" ,"Yellow" ,"DoubleYellow" ,"Police" ,"Armed","Military","DoubleMilitary"
	 * ,"SAR", "Trainning", "Personal", "Agri", "Embassy", "Moto", "Tractor", "Other"
	 * \else
 	 * �������ͣ�"Unknown" δ֪,"Normal" ���ƺ���,"Yellow" ����,"DoubleYellow" ˫���β��,"Police" ����"Armed" �侯��,
     * "Military" ���Ӻ���,"DoubleMilitary" ����˫��,"SAR" �۰���������,"Trainning" ����������
	 * "Personal" ���Ժ���,"Agri" ũ����,"Embassy" ʹ�ݺ���,"Moto" Ħ�г�����,"Tractor" ����������,"Other" ��������
	 * \endif
	 */
	public char                szPlateType[] = new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Plate color, "Blue","Yellow", "White","Black"
	 * \else
	 * ������ɫ, "Blue"��ɫ,"Yellow"��ɫ, "White"��ɫ,"Black"��ɫ
	 * \endif
	 */
	public char                szPlateColor[] = new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle color:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \else
	 * ������ɫ:"White"��ɫ, "Black"��ɫ, "Red"��ɫ, "Yellow"��ɫ, "Gray"��ɫ, "Blue"��ɫ,"Green"��ɫ
	 * \endif
	 */
	public char				szVehicleColor[] = new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle type:"Light-duty";"Medium"; "Oversize";"Unknown"
	 * \else
	 * ������С����:"Light-duty":С�ͳ�;"Medium":���ͳ�; "Oversize":���ͳ�; "Unknown": δ֪
	 * \endif
	 */
	public char				szVehicleSize[] = new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Id of event group(it works when >= 0)
	 * \else
	 * �¼�����(��ֵ>=0ʱ��Ч)
	 * \endif
	 */
	public int                 nGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * Lane number(it works when >= 0)
	 * \else
	 * ������(��ֵ>=0ʱ��ʾ���峵����-1��ʾ���г����������·����ֶ�)
	 * \endif
	 */
	public short               byLane;
	
	/**
	 * \if ENGLISH_LANG
	 * File flag, 0xFF-use nFileFlagEx, 0-all record, 1-timing file, 2-manual, 3-event, 4-important, 5-mosaic
	 * \else
	 * �ļ���־, 0xFF-ʹ��nFileFlagEx, 0-��ʾ����¼��, 1-��ʱ�ļ�, 2-�ֶ��ļ�, 3-�¼��ļ�, 4-��Ҫ�ļ�, 5-�ϳ��ļ�
	 * \endif
	 */
	public byte				byFileFlag;
	
	/**
	 * \if ENGLISH_LANG
	 * During search, it goes to other page��0-No��1-Yes
	 * \else
	 * �Ƿ���Ҫ�ڲ�ѯ������������ת��0-����Ҫ��1-��Ҫ
	 * \endif
	 */
	public byte				byRandomAccess;
	
	/**
	 * \if ENGLISH_LANG
	 * File flag, bit0-timing, bit1-manual, bit2-event, bit3-important, bit4-mosaic, 0xFFFFFFFF-all
	 * \else
	 * �ļ���־, ��λ��ʾ: bit0-��ʱ�ļ�, bit1-�ֶ��ļ�, bit2-�¼��ļ�, bit3-��Ҫ�ļ�, bit4-�ϳ��ļ�, bit5-������ͼƬ 0xFFFFFFFF-����¼��
	 * \endif
	 */
	public int					nFileFlagEx;
	
	/**
	 * \if ENGLISH_LANG
	 * Direction(to the direction of car)	0-north 1-northeast 2-east 3-southeast 4-south 5-southwest 6-west 7-northwest 8-unknown -1-all directions
	 * \else
	 * �������򣨳������ķ���	0-�� 1-���� 2-�� 3-���� 4-�� 5-���� 6-�� 7-���� 8-δ֪ -1-���з���
	 * \endif
	 */
	public int					nDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * Working directory list,can inquire multiple directory at a atime,separated by ";",example "/mnt/dvr/sda0;/mnt/dvr/sda1",if szDirs==null or szDirs == "" ,means search all
	 * \else
	 * ����Ŀ¼�б�,һ�οɲ�ѯ���Ŀ¼,Ϊ�ձ�ʾ��ѯ����Ŀ¼��Ŀ¼֮���Էֺŷָ����硰/mnt/dvr/sda0;/mnt/dvr/sda1��,szDirs==null ��"" ��ʾ��ѯ����
	 * \endif
	 */
	public String              szDirs;
	
	/**
	 * \if ENGLISH_LANG
	 * Event type to search group indicator,event type, see"IVS analysis event type"��if as NULL then search all events��buffer shall be applied by user��
	 * \else
	 * ����ѯ���¼���������ָ��,�¼�����,���"���ܷ����¼�����"����ΪNULL����Ϊ��ѯ�����¼������������û����룩
	 * \endif
	 */
	public int                 pEventTypes[];
	
	/**
	 * \if ENGLISH_LANG
	 * Event type group size
	 * \else
	 * �¼����������С
	 * \endif
	 */
	public int                 nEventTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Device address, NULL means field no use
	 * \else
	 * �豸��ַ, NULL��ʾ���ֶβ�������
	 * \endif
	 */
	public String				pszDeviceAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Device deploy location, NULL means field no use
	 * \else
	 * ��������ص�, NULL��ʾ���ֶβ�������
	 * \endif
	 */
	public String				pszMachineAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle mark, such as "Unknown"-unknown, "Audi"-Audi, "Honda"-Honda... NULL means field no use
	 * \else
	 * ������ʶ, ���� "Unknown"-δ֪, "Audi"-�µ�, "Honda"-����... NULL��ʾ���ֶβ�������
	 * \endif
	 */
	public String				pszVehicleSign;
	
	public MEDIA_QUERY_TRAFFICCAR_PARAM(int nEventNum) {
		nEventTypeNum = nEventNum;
		pEventTypes = new int[nEventTypeNum];
	}
}
