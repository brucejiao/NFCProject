package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The media file information searched by SDK_MEDIA_QUERY_TRAFFICCAR
 * \else
 * SDK_MEDIA_QUERY_TRAFFICCAR��ѯ������media�ļ���Ϣ
 * \endif
 */
public class MEDIAFILE_TRAFFICCAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel number
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int        ch;
	
	/**
	 * \if ENGLISH_LANG
	 * File path
	 * \else
	 * �ļ�·��
	 * \endif
	 */
	public char			szFilePath[] 		= new char[128];
	
	/**
	 * \if ENGLISH_LANG
	 * File length
	 * \else
	 * �ļ�����
	 * \endif
	 */
	public int        size;

	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public NET_TIME            starttime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * End time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME            endtime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Working directory serial number
	 * \else
	 * ����Ŀ¼���
	 * \endif
	 */
	public int        nWorkDirSN;

	/**
	 * \if ENGLISH_LANG
	 * File type.  1:jpg file
	 * \else
	 * �ļ�����  1��jpgͼƬ
	 * \endif
	 */
	public byte                nFileType;

	/**
	 * \if ENGLISH_LANG
	 * File location index
	 * \else
	 * �ļ���λ����
	 * \endif
	 */
	public byte                bHint;

	/**
	 * \if ENGLISH_LANG
	 * drive number
	 * \else
	 * ���̺�
	 * \endif
	 */
	public byte                bDriveNo;

	/**
	 * \if ENGLISH_LANG
	 * cluster number
	 * \else
	 * �غ�
	 * \endif
	 */
	public int        nCluster;

	/**
	 * \if ENGLISH_LANG
	 * flags
	 * \else
	 * ͼƬ����, 0-��ͨ, 1-�ϳ�, 2-��ͼ
	 * \endif
	 */
	public byte                byPictureType;

	//�����ǽ�ͨ������Ϣ
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle plate number
	 * \else
	 * ���ƺ���
	 * \endif
	 */
	public char			szPlateNumber[] 	= new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Plate type: "Unknown" =Unknown; "Normal"=Blue and black plate. "Yellow"=Yellow plate. "DoubleYellow"=Double-layer yellow plate
	 * "Police"=Police plate ; "Armed"= =Military police plate; "Military"=Army plate; "DoubleMilitary"=Army double-layer 
	 * "SAR" =HK SAR or Macao SAR plate; "Trainning" =rehearsal plate; "Personal"=Personal plate; "Agri"=Agricultural plate
	 * "Embassy"=Embassy plate; "Moto"=Moto plate ; "Tractor"=Tractor plate; "Other"=Other plate 
	 * \else
	 * ��������"Unknown" δ֪; "Normal" ���ƺ���; "Yellow" ����; "DoubleYellow" ˫���β��
	 * "Police" ����; "Armed" �侯��; "Military" ���Ӻ���; "DoubleMilitary" ����˫��
	 * "SAR" �۰���������; "Trainning" ����������; "Personal" ���Ժ���; "Agri" ũ����
	 * "Embassy" ʹ�ݺ���; "Moto" Ħ�г�����; "Tractor" ����������; "Other" ��������
	 * \endif
	 */
	public char			szPlateType[] 		= new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Plate color:"Blue","Yellow", "White","Black"
	 * \else
	 * ������ɫ:"Blue","Yellow", "White","Black"
	 * \endif
	 */
	public char			szPlateColor[] 		= new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle color:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \else
	 * ������ɫ:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \endif
	 */
	public char			szVehicleColor[] 	= new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Speed. The unit is Km/H
	 * \else
	 * ����,��λKm/H
	 * \endif
	 */
	public int                 nSpeed;

	/**
	 * \if ENGLISH_LANG
	 * Activation event amount
	 * \else
	 * �������¼�����
	 * \endif
	 */
	public int                 nEventsNum;

	/**
	 * \if ENGLISH_LANG
	 * Activation event list. The number refers to the corresponding event. Please refer to Intelligent Analytics Event Type.
	 * \else
	 * �������¼��б�,����ֵ��ʾ��Ӧ���¼������"���ܷ����¼�����"
	 * \endif
	 */
	public int                 nEvents[] = new int[32];

	/**
	 * \if ENGLISH_LANG
	 * Detailed offense type subnet mask. The first bit means redlight offense, the second bit is illegal straight/left-turn/right-turn driving.
	 * The third bit is the wrong way driving; the four bit is illegal U-turn. Otherwise default value is intersection accident. 
	 * \else
	 * ����Υ����������,��һλ:�����; �ڶ�λ:�����涨������ʻ;
	 * ����λ:����; ����λ��Υ�µ�ͷ;����Ĭ��Ϊ:��ͨ·���¼�
	 * \endif
	 */	
	public long			dwBreakingRule;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle type:"Light-duty"=small;"Medium"=medium; "Oversize"=large
	 * \else
	 * ������С����:"Light-duty":С�ͳ�;"Medium":���ͳ�; "Oversize":���ͳ�
	 * \endif
	 */
	public char			szVehicleSize[] 	= new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Local or remote channel name
	 * \else
	 * ���ػ�Զ�̵�ͨ������
	 * \endif
	 */
	public char			szChannelName[]		= new char[FinalVar.SDK_CHAN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Local or remote device name
	 * \else
	 * ���ػ�Զ���豸����
	 * \endif
	 */
	public char			szMachineName[] 	= new char[FinalVar.SDK_MAX_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * up limit of speed, km/h
	 * \else
	 * �ٶ����� ��λ: km/h
	 * \endif
	 */
	public int                 nSpeedUpperLimit;

	/**
	 * \if ENGLISH_LANG
	 * lower limit of speed km/h
	 * \else
	 * �ٶ����� ��λ: km/h
	 * \endif
	 */
	public int                 nSpeedLowerLimit;

	/**
	 * \if ENGLISH_LANG
	 * id of event group
	 * \else
	 * �¼��������
	 * \endif
	 */
	public int                 nGroupID;

	/**
	 * \if ENGLISH_LANG
	 * total count of the event group
	 * \else
	 * һ���¼����ڵ�ץ������
	 * \endif
	 */
	public byte                byCountInGroup;

	/**
	 * \if ENGLISH_LANG
	 * the index of this event
	 * \else
	 * һ���¼����ڵ�ץ�����
	 * \endif
	 */
	public byte                byIndexInGroup;

	/**
	 * \if ENGLISH_LANG
	 * lane number
	 * \else
	 * ����,�μ�MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \endif
	 */
	public byte                byLane;
	
	/**
	 * \if ENGLISH_LANG
	 * direction,MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \else
	 * ��������,�μ�MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \endif
	 */
	public int			nDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * machine address
	 * \else
	 * ��������ص�
	 * \endif
	 */
	public char      	szMachineAddress[] 	= new char[FinalVar.MAX_PATH];
}
