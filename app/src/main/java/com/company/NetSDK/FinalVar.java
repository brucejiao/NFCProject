package com.company.NetSDK;

import java.io.Serializable;


public class FinalVar implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * MAX length of path
	 * \else
	 * ͨ���ַ�������
	 * \endif
	 */
	public static final int MAX_PATH              = 260;   
	/**
	 * \if ENGLISH_LANG
	 * Device SN string length
	 * \else
	 * �豸���к��ַ�����
	 * \endif
	 */
	public static final int SDK_SERIALNO_LEN= 48;			  
	/**
	 * \if ENGLISH_LANG
	 * Max HDD number
	 * \else
	 * ���Ӳ�̸���
	 * \endif
	 */
	public static final int SDK_MAX_DISKNUM= 256;			  
	/**
	 * \if ENGLISH_LANG
	 * Max SD card number
	 * \else
	 * ���SD������
	 * \endif
	 */
	public static final int SDK_MAX_SDCARDNUM= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Max buner amount
	 * \else
	 * ����¼�豸����
	 * \endif
	 */
	public static final int SDK_MAX_BURNING_DEV_NUM= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Burner name max length
	 * \else
	 * ��¼�豸������󳤶�
	 * \endif
	 */
	public static final int SDK_BURNING_DEV_NAMELEN= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * The max connnect count of SDK
	 * \else
	 * SDK���������
	 * \endif
	 */
	public static final int SDK_MAX_LINK = 6;
	/**
	 * \if ENGLISH_LANG
	 * Max channel amount
	 * \else
	 * ���ͨ������
	 * \endif
	 */
	public static final int SDK_MAX_CHANNUM= 16;			  
	/**
	 * \if ENGLISH_LANG
	 * decoder device max channel number
	 * \else
	 * ���������ͨ����
	 * \endif
	 */
	public static final int SDK_MAX_DECODER_CHANNUM= 64;			  
	/**
	 * \if ENGLISH_LANG
	 * Max alarm input amount
	 * \else
	 * ��󱨾��������
	 * \endif
	 */
	public static final int SDK_MAX_ALARMIN= 128;			  
	/**
	 * \if ENGLISH_LANG
	 * Max alarm output amount
	 * \else
	 * ��󱨾��������
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT= 64;			  
	/**
	 * \if ENGLISH_LANG
	 * Max user right amount
	 * \else
	 * �û�Ȩ�޸�������
	 * \endif
	 */
	public static final int SDK_MAX_RIGHT_NUM= 100;			  
	/**
	 * \if ENGLISH_LANG
	 * Max user group amount
	 * \else
	 * �û����������
	 * \endif
	 */
	public static final int SDK_MAX_GROUP_NUM= 20;			  
	/**
	 * \if ENGLISH_LANG
	 * Max user account amount
	 * \else
	 * �û���������
	 * \endif
	 */
	public static final int SDK_MAX_USER_NUM= 200;			  
	/**
	 * \if ENGLISH_LANG
	 * Right name length
	 * \else
	 * Ȩ��������
	 * \endif
	 */
	public static final int SDK_RIGHT_NAME_LENGTH= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * �û�������
	 * \endif
	 */
	public static final int SDK_USER_NAME_LENGTH= 8;			  
	/**
	 * \if ENGLISH_LANG
	 * User password length
	 * \else
	 * �û����볤��
	 * \endif
	 */
	public static final int SDK_USER_PSW_LENGTH= 8;			  
	/**
	 * \if ENGLISH_LANG
	 * Note length 
	 * \else
	 * ��ע����
	 * \endif
	 */
	public static final int SDK_MEMO_LENGTH= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Max string length
	 * \else
	 * �ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_STRING_LEN= 128;
	/**
	 * \if ENGLISH_LANG
	 * Max six rows
	 * \else
	 * �������
	 * \endif
	 */
	public static final int MAX_STRING_LINE_LEN= 6;			  
	/**
	 * \if ENGLISH_LANG
	 * Line max length
	 * \else
	 * ÿ����󳤶�
	 * \endif
	 */
	public static final int MAX_PER_STRING_LEN= 20;			  
	/**
	 * \if ENGLISH_LANG
	 * The user name length the new mail structure supported
	 * \else
	 * �µ��ʼ��ṹ��֧�ֵ��û�������
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_NAME_LEN= 64;			  
	/**
	 * \if ENGLISH_LANG
	 * Password length the new mail structhre supported
	 * \else
	 * �µ��ʼ��ṹ��֧�ֵ����볤��
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_PSW_LEN= 64;			  
	/**
	 * \if ENGLISH_LANG
	 * Speed limit string max length
	 * \else
	 * ���������ַ�������
	 * \endif
	 */
	public static final int SDK_SPEEDLIMIT_TYPE_LEN= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Vehicle info type max length
	 * \else
	 * �����Զ�����Ϣ�����ַ�������
	 * \endif
	 */
	public static final int SDK_VEHICLE_TYPE_LEN= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Vehicle info string max length
	 * \else
	 * �����Զ�����Ϣ�ַ�������
	 * \endif
	 */
	public static final int SDK_VEHICLE_INFO_LEN= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Driver no string max length
	 * \else
	 * �����Զ�����Ϣ˾�������ַ�������
	 * \endif
	 */
	public static final int SDK_VEHICLE_DRIVERNO_LEN= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Max supported crossing num 
	 * \else
	 * ����λ
	 * \endif
	 */
	public static final int SDK_MAX_CROSSING_NUM= 128;           
	/**
	 * \if ENGLISH_LANG
	 * Max crossing ID length
	 * \else
	 * ·�����к���󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_CROSSING_ID= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Max card info length
	 * \else
	 * ������Ϣ��󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_CARD_INFO_LEN= 256;			  
	/**
	 * \if ENGLISH_LANG
	 * Extended max channel number
	 * \else
	 * ���ͨ������չ  
	 * \endif
	 */
	public static final int SDK_MAX_CHANNUM_EX= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Max number of IP for saerch
	 * \else
	 * �������IP����
	 * \endif
	 */
	public static final int SDK_MAX_SAERCH_IP_NUM= 256;           
	/**
	 * \if ENGLISH_LANG
	 * Hard disk type maximum length
	 * \else
	 * Ӳ���ͺ���󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_HARDDISK_TYPE_LEN= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Hard disk serial maximum length
	 * \else
	 * Ӳ�����к���󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_HARDDISK_SERIAL_LEN= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Value of SIM maximum length
	 * \else
	 * SIM����ֵ����󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_SIM_LEN= 16;			  
	/**
	 * \if ENGLISH_LANG
	 * Pick up SIM maximum number
	 * \else
	 * ����SIM��������
	 * \endif
	 */
	public static final int SDK_MAX_SIM_NUM= 10;			  
	/**
	 * \if ENGLISH_LANG
	 * Version maximum length
	 * \else
	 * ����汾����󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_VERSION_LEN= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Value of MDN maximum length
	 * \else
	 * MDN��ֵ����󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_MDN_LEN= 36;			  
	/**
	 * \if ENGLISH_LANG
	 * Support the card number
	 * \else
	 * ֧�ֵ���������
	 * \endif
	 */
	public static final int SDK_MAX_NETINTERFACE_NUM= 64;            
	/**
	 * \if ENGLISH_LANG
	 * Length of event name
	 * \else
	 * �¼����Ƴ���
	 * \endif
	 */
	public static final int SDK_EVENT_NAME_LEN= 128;			  
	/**
	 * \if ENGLISH_LANG
	 * Length of storage name
	 * \else
	 * �洢�豸���Ƴ���
	 * \endif
	 */
	public static final int SDK_STORAGE_NAME_LEN= 128;			  
	/**
	 * \if ENGLISH_LANG
	 * Carport liht maximum number
	 * \else
	 * ���λ�Ƹ���
	 * \endif
	 */
	public static final int SDK_MAX_CARPORTLIGHT_NUM= 4;             
	/**
	 * \if ENGLISH_LANG
	 * Length of station name
	 * \else
	 * ��վվ�����Ƴ���   
	 * \endif
	 */
	public static final int SDK_STATION_NAME_LEN= 32;
	/**
	 * \if ENGLISH_LANG
	 * Version string max length
	 * \else
	 * �汾�ַ�����󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_VERSION_STR= 64;
	/**
	 * \if ENGLISH_LANG
	 * General string length 16
	 * \else
	 * ͨ���ַ�������16
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_16= 16;            
	/**
	 * \if ENGLISH_LANG
	 * General string length 32
	 * \else
	 * ͨ���ַ�������32
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_32= 32;            
	/**
	 * \if ENGLISH_LANG
	 * General string length 64
	 * \else
	 * ͨ���ַ�������64
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_64= 64;            
	/**
	 * \if ENGLISH_LANG
	 * General string length 128
	 * \else
	 * ͨ���ַ�������128
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_128= 128;           
	/**
	 * \if ENGLISH_LANG
	 * General string length 256
	 * \else
	 * ͨ���ַ�������256
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_256= 256;           
	/**
	 * \if ENGLISH_LANG
	 * General string length 512
	 * \else
	 * ͨ���ַ�������512
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_512= 512;           
	/**
	 * \if ENGLISH_LANG
	 * General string length 1024
	 * \else
	 * ͨ���ַ�������===1024
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_1024= 1024;       
	
	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix number
	 * \else
	 * �����λ������
	 * \endif
	 */
	public static final int SDK_MAX_LOWER_MITRIX_NUM             =         16 ;    
	/**
	 * \if ENGLISH_LANG
	 * Max writing channel number
	 * \else
	 * ����¼ͨ����
	 * \endif
	 */
	public static final int SDK_MAX_BURN_CHANNEL_NUM             =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max remote storage area quantity
	 * \else
	 * ���Զ�̴洢��������
	 * \endif
	 */
	public static final int SDK_MAX_NET_STRORAGE_BLOCK_NUM       =         64 ;  
	
	/**
	 * \if ENGLISH_LANG
	 * Case staff max quantity
	 * \else
	 * ������Ա�������
	 * \endif
	 */
	public static final int SDK_MAX_CASE_PERSON_NUM              =         32 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max channel preview playback channel number
	 * \else
	 * ����ͨ��Ԥ���ط�ͨ����
	 * \endif
	 */
	public static final int SDK_MAX_MULTIPLAYBACK_CHANNEL_NUM    =         64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max channel preview playback split mode number
	 * \else
	 * ����ͨ��Ԥ���طŷָ�ģʽ��
	 * \endif
	 */
	public static final int SDK_MAX_MULTIPLAYBACK_SPLIT_NUM      =         32 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max audio encode type number
	 * \else
	 * ��������������͸���
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_ENCODE_TYPE             =         64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Access control name length
	 * \else
	 * �Ž����Ƴ���
	 * \endif
	 */
	public static final int SDK_MAX_ACCESS_NAME_LEN               =         64  ;
	
	/**
	 * \if ENGLISH_LANG
	 * Extension module alarm channel name length
	 * \else
	 * ��չģ�鱨��ͨ�����Ƴ���
	 * \endif
	 */
	public static final int SDK_MAX_EXALARMCHANNEL_NAME_LEN       =         128 ;
  
	/**
	 * \if ENGLISH_LANG
	 * Search general alarm status(including external alarm,video loss, motion detection)
	 * \else
	 * ��ѯ��ͨ����״̬(�����ⲿ��������Ƶ��ʧ����̬���)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_COMM_ALARM	            =     0x0001 ;  
	/**
	 * \if ENGLISH_LANG
	 * Search camera masking alarm status
	 * \else
	 * ��ѯ�ڵ�����״̬
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SHELTER_ALARM           =     0x0002 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search record status 
	 * \else
	 * ��ѯ¼��״̬
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RECORDING               =     0x0003 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search HDD information 
	 * \else
	 * ��ѯӲ����Ϣ
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISK                    =     0x0004 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search system resources status 
	 * \else
	 * ��ѯϵͳ��Դ״̬
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RESOURCE                =     0x0005 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search channel bit stream 
	 * \else
	 * ��ѯͨ������
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BITRATE                 =     0x0006 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search device connection status 
	 * \else
	 * ��ѯ�豸����״̬
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CONN                    =     0x0007 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search network protocol version number , pBuf = int*
	 * \else
	 * ��ѯ����Э��汾�ţ�pBuf = int*
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PROTOCAL_VER            =     0x0008 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search the audio talk format the device supported. Please refer to structure SDKDEV_TALKFORMAT_LIST
	 * \else
	 * ��ѯ�豸֧�ֵ������Խ���ʽ�б����ṹ�� SDKDEV_TALKFORMAT_LIST
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TALK_ECTYPE             =     0x0009 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search SD card information(FOR IPC series)
	 * \else
	 * ��ѯSD����Ϣ(IPC���Ʒ)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SD_CARD                 =     0x000A ;   
	/**
	 * \if ENGLISH_LANG
	 * Search burner information
	 * \else
	 * ��ѯ��¼����Ϣ
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_DEV             =     0x000B ;   
	/**
	 * \if ENGLISH_LANG
	 * Search burning information
	 * \else
	 * ��ѯ��¼����
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_PROGRESS        =     0x000C ;   
	/**
	 * \if ENGLISH_LANG
	 * Search the embedded platform the device supported
	 * \else
	 * ��ѯ�豸֧�ֵĽ���ƽ̨
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PLATFORM                =     0x000D ;   
	/**
	 * \if ENGLISH_LANG
	 * Search camera property information ( for IPC series),pBuf = SDKDEV_CAMERA_INFO *,there can be several structure.
	 * \else
	 * ��ѯ����ͷ������Ϣ(IPC���Ʒ)��pBuf = SDKDEV_CAMERA_INFO *�������ж���ṹ��
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CAMERA                  =     0x000E ;   
	/**
	 * \if ENGLISH_LANG
	 * Search device software version information
	 * \else
	 * ��ѯ�豸����汾��Ϣ
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SOFTWARE                =     0x000F ;   
	/**
	 * \if ENGLISH_LANG
	 * Search the audio type the device supported 
	 * \else
	 * ��ѯ�豸֧�ֵ���������
	 * \endif
	 */
	public static final int SDK_DEVSTATE_LANGUAGE                =     0x0010 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search DSP capacity description 
	 * \else
	 * ��ѯDSP��������(��Ӧ�ṹ��SDKDEV_DSP_ENCODECAP)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DSP                     =     0x0011 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search OEM information
	 * \else
	 * ��ѯOEM��Ϣ
	 * \endif
	 */
	public static final int SDK_DEVSTATE_OEM                     =     0x0012 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search network running status information 
	 * \else
	 * ��ѯ��������״̬��Ϣ
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NET                     =     0x0013 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search function attributes(for IPC serirs)
	 * \else
	 * ��ѯ�豸����
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TYPE                    =     0x0014 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search snapshot function attribute(For IPC series)
	 * \else
	 * ��ѯ��������(IPC���Ʒ)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SNAP                    =     0x0015 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query the first time and the recent video time
	 * \else
	 * ��ѯ����¼��ʱ������¼��ʱ��
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RECORD_TIME             =     0x0016 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query the wireless network signal strength,Please refer to structure SDKDEV_WIRELESS_RSS_INFO
	 * \else
	 * ��ѯ���������ź�ǿ�ȣ����ṹ�� SDKDEV_WIRELESS_RSS_INFO
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NET_RSSI                =     0x0017 ;   
	/**
	 * \if ENGLISH_LANG
	 * Burning options inquiry
	 * \else
	 * ��ѯ������¼ѡ��
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_ATTACH          =     0x0018 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query the list of backup device
	 * \else
	 * ��ѯ�����豸�б�
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_DEV              =     0x0019 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query the backup device information
	 * \else
	 * ��ѯ�����豸��ϸ��Ϣ
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_DEV_INFO         =     0x001a ;   
	/**
	 * \if ENGLISH_LANG
	 * Backup rate of progress
	 * \else
	 * ���ݽ��ȷ���
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_FEEDBACK         =     0x001b ;   
	/**
	 * \if ENGLISH_LANG
	 * Query ATM trade type
	 * \else
	 * ��ѯATM��������
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ATM_QUERY_TRADE         =     0x001c ;   
	/**
	 * \if ENGLISH_LANG
	 * Query sip state
	 * \else
	 * ��ѯsip״̬
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SIP                     =     0x001d ;   
	/**
	 * \if ENGLISH_LANG
	 * Query wifi state of mobile DVR
	 * \else
	 * ��ѯ����wifi״̬
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VICHILE_STATE           =     0x001e ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Email Function
	 * \else
	 * ��ѯ�ʼ������Ƿ�ɹ�
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_EMAIL              =     0x001f ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Hard Disk Information
	 * \else
	 * ��ѯӲ��smart��Ϣ
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SMART_HARD_DISK         =     0x0020 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Snap Picture Function
	 * \else
	 * ��ѯץͼ�����Ƿ�ɹ�
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_SNAPPICTURE        =     0x0021 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query static alarm state
	 * \else
	 * ��ѯ��̬����״̬
	 * \endif
	 */
	public static final int SDK_DEVSTATE_STATIC_ALARM            =     0x0022 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query submodule information
	 * \else
	 * ��ѯ�豸��ģ����Ϣ
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SUBMODULE_INFO          =     0x0023 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query harddisk damage ability
	 * \else
	 * ��ѯӲ�̻������� 
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISKDAMAGE              =     0x0024 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query device supported IPC ability,see struct SDK_DEV_IPC_INFO 
	 * \else
	 * ��ѯ�豸֧�ֵ�IPC����, ���ṹ�� SDK_DEV_IPC_INFO
	 * \endif
	 */
	public static final int SDK_DEVSTATE_IPC                     =     0x0025 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query alarm arm disarm state
	 * \else
	 * ��ѯ����������״̬
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_ARM_DISARM        =     0x0026 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query ACC power off state(return a DWORD type value, 1 means power off,0 means power on)
	 * \else
	 * ��ѯACC�ϵ籨��״̬(����һ��DWORD, 1��ʾ�ϵ磬0��ʾͨ��)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ACC_POWEROFF_ALARM      =     0x0027 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP server connect test
	 * \else
	 * ����FTP����������
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_FTP_SERVER         =     0x0028 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query 3G Flow exceed state info(see struct SDKDEV_3GFLOW_EXCEED_STATE_INFO)
	 * \else
	 * ��ѯ3G����������ֵ״̬,(���ṹ��SDKDEV_3GFLOW_EXCEED_STATE_INFO)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GFLOW_EXCEED           =     0x0029 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query 3G Flow info(see struct SDK_DEV_3GFLOW_INFO )
	 * \else
	 * �˲�ѯ3G����������Ϣ,���ṹ�� SDK_DEV_3GFLOW_INFO
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GFLOW_INFO             =     0x002a ;   
	/**
	 * \if ENGLISH_LANG
	 * Vihicle information uploading, ALARM_VEHICLE_INFO_UPLOAD
	 * \else
	 * �����Զ�����Ϣ�ϴ�(���ṹ��ALARM_VEHICLE_INFO_UPLOAD)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIHICLE_INFO_UPLOAD     =     0x002b ;   
	/**
	 * \if ENGLISH_LANG
	 * QSpeed limit alarm, ALARM_SPEED_LIMIT
	 * \else
	 * ��ѯ���ٱ���״̬(���ṹ��ALARM_SPEED_LIMIT)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SPEED_LIMIT             =     0x002c ;   
	/**
	 * \if ENGLISH_LANG
	 * Query DSP expended cap(struct SDKDEV_DSP_ENCODECAP_EX )
	 * \else
	 * ��ѯDSP��չ��������(��Ӧ�ṹ��SDKDEV_DSP_ENCODECAP_EX)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DSP_EX                  =     0x002d ;   
	/**
	 * \if ENGLISH_LANG
	 * Query 3G module info(struct SDK_DEV_3GMODLE_INFO )
	 * \else
	 * ��ѯ3Gģ����Ϣ(��Ӧ�ṹ�� SDK_DEV_3GMODULE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GMODULE_INFO           =     0x002e ;   
	/**
	 * \if ENGLISH_LANG
	 * Query multi DDNS status(struct SDK_DEV_MULTI_DDNS_INFO )
	 * \else
	 * ��ѯ��DDNS״̬��Ϣ(��Ӧ�ṹ�� SDK_DEV_MULTI_DDNS_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MULTI_DDNS              =     0x002f ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Device URL info(struct SDK_DEV_URL_INFO )
	 * \else
	 * ��ѯ�豸����URL��Ϣ(��Ӧ�ṹ�� SDK_DEV_URL_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CONFIG_URL              =     0x0030 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Hard key state(struct SDKDEV_HARDKEY_STATE )
	 * \else
	 * ��ѯHardKey״̬����Ӧ�ṹ�� SDKDEV_HARDKEY_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_HARDKEY                 =     0x0031 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query ISCSI path(struct SDKDEV_ISCSI_PATHLIST )
	 * \else
	 * ��ѯISCSI·���б�(��Ӧ�ṹ�� SDKDEV_ISCSI_PATHLIST )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ISCSI_PATH              =     0x0032 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query local preview split capability(struct DEVICE_LOCALPREVIEW_SLIPT_CAP )
	 * \else
	 * ��ѯ�豸����Ԥ��֧�ֵķָ�ģʽ(��Ӧ�ṹ��DEVICE_LOCALPREVIEW_SLIPT_CAP)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DLPREVIEW_SLIPT_CAP     =     0x0033 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query wifi capablity(struct SDKDEV_WIFI_ROUTE_CAP )
	 * \else
	 * ��ѯ����·��������Ϣ(��Ӧ�ṹ�� SDKDEV_WIFI_ROUTE_CAP )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WIFI_ROUTE_CAP          =     0x0034 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query device online state(return a DWORD value, 1-online, 0-offline)
	 * \else
	 * ��ѯ�豸������״̬(����һ��DWORD, 1��ʾ����, 0��ʾ����)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ONLINE                  =     0x0035 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query ptz state(struct SDK_PTZ_LOCATION_INFO )
	 * \else
	 * ��ѯ��̨״̬��Ϣ(��Ӧ�ṹ�� SDK_PTZ_LOCATION_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PTZ_LOCATION            =     0x0036 ;   
	/**
	 * \if ENGLISH_LANG
	 * PQuery monitor state(state SDKDEV_MONITOR_INFO )
	 * \else
	 * �����ظ�����Ϣ(��Ӧ�ṹ�� SDKDEV_MONITOR_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MONITOR_INFO            =     0x0037 ;   
	/**
	 * \if ENGLISH_LANG
	 * PQuery subdevcie(fan,cpu...) state(struct CFG_DEVICESTATUS_INFO )
	 * \else
	 * ��ѯ���豸(��Դ, ���ȵ�)״̬(��Ӧ�ṹ�� CFG_DEVICESTATUS_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SUBDEVICE               =     0x0300 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query RAID state(struct ALARM_RAID_INFO ) 
	 * \else
	 * ��ѯRAID״̬(��Ӧ�ṹ�� ALARM_RAID_INFO )  
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RAID_INFO               =     0x0038 ;   
	/**
	 * \if ENGLISH_LANG
	 * Test DDNS domain enable
	 * \else
	 * ����DDNS�����Ƿ����
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_DDNSDOMAIN         =     0x0039 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query virtual camera state(struct SDKDEV_VIRTUALCAMERA_STATE_INFO )
	 * \else
	 * ��ѯ��������ͷ״̬(��Ӧ SDKDEV_VIRTUALCAMERA_STATE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIRTUALCAMERA           =     0x003a ;   
	/**\
	 * \if ENGLISH_LANG
	 * Get device's state of video/coil module(struct SDKDEV_TRAFFICWORKSTATE_INFO )
	 * \else
	 * ��ȡ�豸������Ƶ/��Ȧģʽ״̬��(��Ӧ SDKDEV_TRAFFICWORKSTATE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TRAFFICWORKSTATE        =     0x003b ;   
	/**
	 * \if ENGLISH_LANG
	 * Get camera move alarm state(struct ALARM_CAMERA_MOVE_INFO )
	 * \else
	 * ��ȡ�������λ�����¼�״̬(��Ӧ ALARM_CAMERA_MOVE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_CAMERA_MOVE       =     0x003c ;   
	/**
	 * \if ENGLISH_LANG
	 * Get external alarm(struct NET_CLIENT_ALARM_STATE ) 
	 * \else
	 * ��ȡ�ⲿ����״̬(��Ӧ NET_CLIENT_ALARM_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM                   =     0x003e ;   
	/**
	 * \if ENGLISH_LANG
	 * Get video loss alarm(struct NET_CLIENT_VIDEOLOST_STATE ) 
	 * \else
	 * ��ȡ��Ƶ��ʧ����״̬(��Ӧ  NET_CLIENT_VIDEOLOST_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIDEOLOST               =     0x003f ;   
	/**
	 * \if ENGLISH_LANG
	 * Get motion alarm(struct NET_CLIENT_MOTIONDETECT_STATE )
	 * \else
	 * ��ȡ��̬��ⱨ��״̬(��Ӧ  NET_CLIENT_MOTIONDETECT_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MOTIONDETECT            =     0x0040 ;   
	/**
	 * \if ENGLISH_LANG
	 * Get detailed motion alarm(struct NET_CLIENT_DETAILEDMOTION_STATE )
	 * \else
	 * ��ȡ��ϸ�Ķ�̬��ⱨ��״̬(��Ӧ  NET_CLIENT_DETAILEDMOTION_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DETAILEDMOTION          =     0x0041 ;   
	/**
	 * \if ENGLISH_LANG
	 * Get vehicle device state(struct SDKDEV_VEHICLE_INFO )
	 * \else
	 * ��ȡ�����������Ӳ����Ϣ(��Ӧ  SDKDEV_VEHICLE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VEHICLE_INFO            =     0x0042 ;   
	/**
	 * \if ENGLISH_LANG
	 * Get blind alarm(struct NET_CLIENT_VIDEOBLIND_STATE )
	 * \else
	 * ��ȡ��Ƶ�ڵ�����״̬(��Ӧ  NET_CLIENT_VIDEOBLIND_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIDEOBLIND              =     0x0043 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query 3G state(struct SDKDEV_VEHICLE_3GMODULE )
	 * \else
	 * ��ѯ3Gģ�������Ϣ(��Ӧ�ṹ�� SDKDEV_VEHICLE_3GMODULE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GSTATE_INFO            =     0x0044 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query net interface(struct SDKDEV_NETINTERFACE_INFO )
	 * \else
	 * ��ѯ����ӿ���Ϣ(��Ӧ  SDKDEV_NETINTERFACE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NETINTERFACE            =     0x0045 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query picinpic channel(struct DWORD)
	 * \else
	 * ��ѯ���л�ͨ����(��ӦDWORD����)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PICINPIC_CHN            =     0x0046 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query splice screen(struct SDK_COMPOSITE_CHANNEL )
	 * \else
	 * ��ѯ�ں���ͨ����Ϣ(��Ӧ SDK_COMPOSITE_CHANNEL ����)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_COMPOSITE_CHN           =     0x0047 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query whole recording status(struct BOOL),as long as ther is a channel running,it indicates that the overall state
	 * \else
	 * ��ѯ�豸����¼��״̬(��ӦBOOL), ֻҪ��һ��ͨ����¼�񣬼�Ϊ�豸����״̬Ϊ¼��
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WHOLE_RECORDING         =     0x0048 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query whole encoding(struct BOOL),as long as ther is a channel running,it indicates that the overall state
	 * \else
	 * ��ѯ�豸�������״̬(��ӦBOOL), ֻҪ��һ��ͨ���ڱ��룬��Ϊ�豸����״̬Ϊ����
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WHOLE_ENCODING          =     0x0049 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query disk record time(pBuf = DEV_DISK_RECORD_TIME *)
	 * \else
	 * ��ѯ�豸Ӳ��¼��ʱ����Ϣ(pBuf = DEV_DISK_RECORD_TIME *�������ж���ṹ��)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISK_RECORDE_TIME       =     0x004a ;   
	/**
	 * \if ENGLISH_LANG
	 * Whether have pop-up optical dirve(struct NET_DEVSTATE_BURNERDOOR )
	 * \else
	 * �Ƿ��ѵ�����¼��������(��Ӧ�ṹ��  NET_DEVSTATE_BURNERDOOR )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNER_DOOR             =     0x004b ;   
	/**
	 * \if ENGLISH_LANG
	 * Get data validation process(struct NET_DEVSTATE_DATA_CHECK )
	 * \else
	 * ��ѯ��������У�����(��Ӧ NET_DEVSTATE_DATA_CHECK )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_DATA_CHECK          =     0x004c ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ѯ��������ͨ����Ϣ(��ӦNET_ALARM_IN_CHANNEL����)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_IN_CHANNEL        =     0x004f ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ѯ����ͨ����(��ӦNET_ALARM_CHANNEL_COUNT)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_CHN_COUNT         =     0x0050 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ѯ��̨������״̬(��ӦSDK_OUT_PTZ_VIEW_RANGE_STATUS)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PTZ_VIEW_RANGE          =     0x0051 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ѯ�豸ͨ����Ϣ(��ӦNET_DEV_CHN_COUNT_INFO)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DEV_CHN_COUNT           =     0x0052 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ѯ�豸֧�ֵ�RTSP URL�б����ṹ��DEV_RTSPURL_LIST
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RTSP_URL                =     0x0053 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ѯ�豸��¼�����߳�ʱʱ��,����һ��BTYE,����λ�����ӣ� ,0��ʾ������,������������ʾ���Ƶķ�����
	 * \endif
	 */
	public static final int SDK_DEVSTATE_LIMIT_LOGIN_TIME        =     0x0054 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ȡ������ ���ṹ��NET_GET_COMM_COUNT
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_COMM_COUNT          =     0x0055 ;   
	
	public static final int SDK_DEVSTATE_RECORDING_DETAIL      = 0x0056;           // ��ѯ¼��״̬��ϸ��Ϣ(pBuf = NET_RECORD_STATE_DETAIL*)
	public static final int SDK_DEVSTATE_PTZ_PRESET_LIST       = 0x0057;           // ��ȡ��ǰ��̨��Ԥ�õ��б�(��Ӧ�ṹNET_PTZ_PRESET_LIST)
	public static final int SDK_DEVSTATE_EXTERNAL_DEVICE       = 0x0058;           // ����豸��Ϣ(pBuf = NET_EXTERNAL_DEVICE*)
	public static final int SDK_DEVSTATE_GET_UPGRADE_STATE     = 0x0059;           // ��ȡ�豸����״̬(��Ӧ�ṹDHDEV_UPGRADE_STATE_INFO)
	public static final int SDK_DEVSTATE_MULTIPLAYBACK_SPLIT_CAP = 0x005a;         // ��ȡ��ͨ��Ԥ���ָ�����( ��Ӧ�ṹ�� NET_MULTIPLAYBACK_SPLIT_CAP )
	public static final int SDK_DEVSTATE_BURN_SESSION_NUM      = 0x005b;           // ��ȡ��¼�Ự����(pBuf = int*)
	public static final int SDK_DEVSTATE_PROTECTIVE_CAPSULE    = 0x005c;           // ��ѯ������״̬(��Ӧ�ṹ��ALARM_PROTECTIVE_CAPSULE_INFO)


	public static final int SDK_DEVSTATE_POWER_STATE           = 0x0152;           // ��ѯ��Դ״̬(��Ӧ�ṹ��NET_POWER_STATUS)
	public static final int SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE  = 0x153;        // ��ѯ����ͨ��״̬(��Ӧ�ṹ�� NET_CLIENT_ALARM_CHANNELS_STATE)
	public static final int SDK_DEVSTATE_ALARMKEYBOARD_COUNT   = 0x0154;           // ��ѯ���������ӵı���������(��Ӧ�ṹ��NET_ALARMKEYBOARD_COUNT)
	public static final int SDK_DEVSTATE_EXALARMCHANNELS       = 0x0155;           // ��ѯ��չ����ģ��ͨ��ӳ���ϵ(��Ӧ�ṹ�� NET_EXALARMCHANNELS)
	public static final int SDK_DEVSTATE_GET_BYPASS            = 0x0156;           // ��ѯͨ����·״̬(��Ӧ�ṹ�� NET_DEVSTATE_GET_BYPASS)
	public static final int SDK_DEVSTATE_ACTIVATEDDEFENCEAREA  = 0x0157;           // ��ȡ����ķ�����Ϣ(��Ӧ�ṹ�� NET_ACTIVATEDDEFENCEAREA)
	public static final int SDK_DEVSTATE_DEV_RECORDSET         = 0x0158;           // ��ѯ�豸��¼����Ϣ(��ӦNET_CTRL_RECORDSET_PARAM)
	public static final int SDK_DEVSTATE_DOOR_STATE            = 0x0159;           // ��ѯ�Ž�״̬(��ӦNET_DOOR_STATUS_INFO)
	public static final int SDK_DEVSTATE_ANALOGALARM_CHANNELS  = 0x1560;           // ģ������������ͨ��ӳ���ϵ(��ӦNET_ANALOGALARM_CHANNELS)
	public static final int SDK_DEVSTATE_GET_SENSORLIST        = 0x1561;           // ��ȡ�豸֧�ֵĴ������б�(��Ӧ NET_SENSOR_LIST)
	public static final int SDK_DEVSTATE_ALARM_CHANNELS	= 0x1562;		// ��ѯ����������ģ��ͨ��ӳ���ϵ(��Ӧ�ṹ�� NET_ALARM_CHANNELS)
													// ����豸��֧�ֲ�ѯ��չ����ģ��ͨ��,�����øù��ܲ�ѯ��չͨ�����߼�ͨ���ţ����������ر���ͨ��ʹ��
	public static final int SDK_DEVSTATE_GET_ALARM_SUBSYSTEM_ACTIVATESTATUS	= 0x1563;	// ��ȡ��ǰ��ϵͳ����״̬( ��Ӧ NET_GET_ALARM_SUBSYSTEM_ACTIVATE_STATUES)
	public static final int SDK_DEVSTATE_ALARMSUBSYSTEM_STATE  = 0x1565;            // ��ȡ��ϵͳ״̬(��ӦNET_ALARM_SUBSYSTEM_STATE)
	public static final int SDK_DEVSTATE_ALARM_FAULT_STATE     = 0x1566;            // ��ȡ����״̬(��ӦNET_ALARM_FAULT_STATE)
	public static final int SDK_DEVSTATE_ARM_MODE_GET          = 0x1567;           // ��ȡ��ǰ��������ģʽ(��ӦNET_ARM_MODE_INFO)
	public static final int SDK_DEVSTATE_DEFENCE_STATE         = 0x1567;           // ��ȡ����״̬(��ӦNET_DEFENCE_STATE_INFO, ����·״̬�仯�¼������ر����¼��������ź�Դ�¼���״̬���������𣬲��ܻ��ã��������豸ʹ��)
	public static final int SDK_DEVSTATE_SCADA_POINT_LIST      = 0x1569;           // ��ȡ��λ��·����Ϣ(��Ӧ NET_SCADA_POINT_LIST_INFO)
	public static final int SDK_DEVSTATE_SCADA_INFO            = 0x156a;           // ��ȡ����λ��Ϣ(��Ӧ NET_SCADA_INFO)
	public static final int SDK_DEVSTATE_SCADA_CAPS            = 0x156b;           // ��ȡSCADA������(��Ӧ NET_SCADA_CAPS)
	public static final int SDK_DEVSTATE_GET_CODEID_COUNT      = 0x156c;           // ��ȡ����ɹ���������(��Ӧ NET_GET_CODEID_COUNT)
	public static final int SDK_DEVSTATE_GET_CODEID_LIST       = 0x156d;           // ��ѯ������Ϣ(��Ӧ NET_GET_CODEID_LIST)
	public static final int SDK_DEVSTATE_ANALOGALARM_DATA      = 0x156e;           // ��ѯģ����ͨ������(��Ӧ NET_GET_ANALOGALARM_DATA)
	public static final int SDK_DEVSTATE_VTP_CALLSTATE         = 0x156f;           // ��ȡ��Ƶ�绰����״̬(��Ӧ NET_GET_VTP_CALLSTATE)
	public static final int SDK_DEVSTATE_SCADA_INFO_BY_ID      = 0x1570;           // ͨ���豸����ȡ����λ��Ϣ(��Ӧ NET_SCADA_INFO_BY_ID)
	public static final int SDK_DEVSTATE_SCADA_DEVICE_LIST     = 0x1571;           // ��ȡ��ǰ������������ⲿ�豸ID(��Ӧ NET_SCADA_DEVICE_LIST)
	public static final int SDK_DEVSTATE_DEV_RECORDSET_EX      = 0x1572;           // ��ѯ�豸��¼����Ϣ(������������)(��ӦNET_CTRL_RECORDSET_PARAM)
	public static final int SDK_DEVSTATE_ACCESS_LOCK_VER       = 0x1573;           // ��ȡ��������汾��(��Ӧ NET_ACCESS_LOCK_VER)
	public static final int SDK_DEVSTATE_MONITORWALL_TVINFO    = 0x1574;           // ��ȡ����ǽ��ʾ��Ϣ(��Ӧ NET_CTRL_MONITORWALL_TVINFO)
	public static final int SDK_DEVSTATE_GET_ALL_POS           = 0x1575;           // ��ȡ�����û�����Pos�豸������Ϣ(��Ӧ NET_POS_ALL_INFO)
	public static final int SDK_DEVSTATE_GET_ROAD_LIST         = 0x1576;           // ��ȡ���м�·�α�����Ϣ�����ױ�����Ŀר��(��Ӧ NET_ROAD_LIST_INFO)
	public static final int SDK_DEVSTATE_GET_WIRESSLESS_STATE  = 0x1579;           // ��ȡ�����豸״̬��Ϣ(��Ӧ NET_GET_WIRELESS_DEVICE_STATE)

	
	
	/**
	 * \if ENGLISH_LANG
	 * Mail address max length
	 * \else
	 * �ʼ���(��)��ַ��󳤶�
	 * \endif
	 */
	
	public static final int SDK_MAX_MAIL_ADDR_LEN                =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Mail subject max length
	 * \else
	 * �ʼ�������󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_SUBJECT_LEN             =         64 ;   
	
	public static final int SDK_IPIFILTER_NUM                    =         200;
	public static final int SDK_IPIFILTER_NUM_EX                 =         512;
	
	/**
	 * \if ENGLISH_LANG
	 * IP address string length 
	 * \else
	 * IP��ַ�ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_LEN                   =         16 ;   
	
	/**
	 * \if ENGLISH_LANG
	 * MACE address string length
	 * \else
	 * MAC��ַ�ַ�������
	 * \endif
	 */

	public static final int SDK_MAX_IPADDR_LEN_EX                =         40 ; // ��չIP��ַ�ַ�������, ֧��IPV6
		
	public static final int SDK_MACADDR_LEN                      =         40 ;  
	/**
	 * \if ENGLISH_LANG
	 * URL string length
	 * \else
	 * URL�ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_URL_LEN                      =        128 ;      
	/**
	 * \if ENGLISH_LANG
	 * Device serial number max length 
	 * \else
	 * ���������󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_DEV_ID_LEN                   =         48 ;   
	/**
	 * \if ENGLISH_LANG
	 * Host name length
	 * \else
	 * ����������
	 * \endif
	 */
	public static final int SDK_MAX_HOST_NAMELEN                 =         64 ;       
	/**
	 * \if ENGLISH_LANG
	 * Password length 
	 * \else
	 * ���볤��
	 * \endif
	 */
	public static final int SDK_MAX_HOST_PSWLEN                  =         32 ;           
	/**
	 * \if ENGLISH_LANG
	 * Universal name string length 
	 * \else
	 * ͨ�������ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_NAME_LEN                     =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ethernet max amount 
	 * \else
	 * ��̫����������
	 * \endif
	 */
	public static final int SDK_MAX_ETHERNET_NUM                 =          2 ;   
	/**
	 * \if ENGLISH_LANG
	 * Extended ethernet max amout
	 * \else
	 * ��չ��̫����������
	 * \endif
	 */
	public static final int SDK_MAX_ETHERNET_NUM_EX              =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Serial number string length
	 * \else
	 * ���к��ַ�������
	 * \endif
	 */
	public static final int SDK_DEV_SERIALNO_LEN                 =         48 ;   
	/**
	 * \if ENGLISH_LANG
	 * Device type string length 
	 * \else
	 * �豸�����ַ�������
	 * \endif
	 */
	public static final int SDK_DEV_TYPE_LEN                     =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * The days in one week 
	 * \else
	 * һ�ܵ�����
	 * \endif
	 */
	public static final int SDK_N_WEEKS                          =          7 ;          
	/**
	 * \if ENGLISH_LANG
	 * Time period amount
	 * \else
	 * ͨ��ʱ��θ���
	 * \endif
	 */
	public static final int SDK_N_TSECT                          =          6 ;     
	/**
	 * \if ENGLISH_LANG
	 * Record period amount 
	 * \else
	 * ¼��ʱ��θ���
	 * \endif
	 */
	public static final int SDK_N_REC_TSECT                      =          6 ;     
	/**
	 * \if ENGLISH_LANG
	 * Color period amount 
	 * \else
	 * ��ɫʱ��θ���
	 * \endif
	 */
	public static final int SDK_N_COL_TSECT                      =          2 ;      
	/**
	 * \if ENGLISH_LANG
	 * Channel name lengh. DVR DSP capacity limit. Max 32 bytes.
	 * \else
	 * ͨ�������ȣ�DVR DSP�������ƣ����32�ֽ�
	 * \endif
	 */
	public static final int SDK_CHAN_NAME_LEN                    =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Extra stream amount 
	 * \else
	 * ��չ��������
	 * \endif
	 */
	public static final int SDK_N_ENCODE_AUX                     =          3 ;        
	/**
	 * \if ENGLISH_LANG
	 * Max audio talk channel amount 
	 * \else
	 * ���Խ�ͨ������
	 * \endif
	 */
	public static final int SDK_N_TALK                           =          1 ;   
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone amount 
	 * \else
	 * �ڵ��������
	 * \endif
	 */
	public static final int SDK_N_COVERS                         =          1 ;        
	/**
	 * \if ENGLISH_LANG
	 * Max channel amount 
	 * \else
	 * ���ͨ������
	 * \endif
	 */
	public static final int SDK_N_CHANNEL                        =         16 ;        
	/**
	 * \if ENGLISH_LANG
	 * Alarm prompt period amount 
	 * \else
	 * ������ʾʱ��θ���
	 * \endif
	 */
	public static final int SDK_N_ALARM_TSECT                    =          2 ;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm output ports max amount 
	 * \else
	 * ��������ڸ�������
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT_NUM                 =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Audio input ports max amount 
	 * \else
	 * ��Ƶ����ڸ�������
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_IN_NUM                 =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Video input ports max amount 
	 * \else
	 * ��Ƶ����ڸ�������
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_IN_NUM                 =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm input ports max amount 
	 * \else
	 * ��������ڸ�������
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_IN_NUM                 =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * HDD max amount. Now the value is 16.
	 * \else
	 * Ӳ�̸������ޣ��ݶ�Ϊ16
	 * \endif
	 */
	public static final int SDK_MAX_DISK_NUM                     =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Decoder(485) max amount 
	 * \else
	 * ������(485)��������
	 * \endif
	 */
	public static final int SDK_MAX_DECODER_NUM                  =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * 232 COM function max amount 
	 * \else
	 * 232���ڹ��ܸ�������
	 * \endif
	 */
	public static final int SDK_MAX_232FUNCS                     =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * 232 COM port max amount 
	 * \else
	 * 232���ڸ�������
	 * \endif
	 */
	public static final int SDK_MAX_232_NUM                      =          2 ;    
	/**
	 * \if ENGLISH_LANG
	 * Extended 232 COM port max amount 
	 * \else
	 * ��չ�������ø�������  
	 * \endif
	 */
	public static final int SDK_MAX_232_NUM_EX                   =         16 ;           
	/**
	 * \if ENGLISH_LANG
	 * Decoder protocol list max amount
	 * \else
	 * ������Э���б��������
	 * \endif
	 */
	public static final int SDK_MAX_DECPRO_LIST_SIZE             =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP file folder max length 
	 * \else
	 * FTP�ļ�Ŀ¼��󳤶�
	 * \endif
	 */
	public static final int SDK_FTP_MAXDIRLEN                    =        240 ;   
	/**
	 * \if ENGLISH_LANG
	 * Matrix output ports max amount
	 * \else
	 * ���������������
	 * \endif
	 */
	public static final int SDK_MATRIX_MAXOUT                    =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Matrix output ports max amount 
	 * \else
	 * ���������������
	 * \endif
	 */
	public static final int SDK_TOUR_GROUP_NUM                   =          6 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns max amount the device supported 
	 * \else
	 * �豸֧�ֵ�ddns������������
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_NUM                     =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns type and max string length 
	 * \else
	 * ddns���������ͣ�����ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_SERVER_TYPE_LEN              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns domain name and max string length 
	 * \else
	 * ddns����������ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_DOMAIN_NAME_LEN              =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns alias and max string length
	 * \else
	 * ddns����������������ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_ALIAS_LEN               =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns default domain, max sring length
	 * \else
	 * dnsĬ������������ַ������� 
	 * \endif
	 */
	public static final int SDK_MAX_DEFAULT_DOMAIN_LEN           =         60 ;   
	/**
	 * \if ENGLISH_LANG
	 * Motion detection zone row amount
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public static final int SDK_MOTION_ROW                       =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Motion detection zone column amount 
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public static final int SDK_MOTION_COL                       =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Static detection zone row amount 
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public static final int SDK_STATIC_ROW                       =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Static detection zone column amount
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public static final int SDK_STATIC_COL                       =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:user name max lengh 
	 * \else
	 * FTP���ã��û�����󳤶�
	 * \endif
	 */
	public static final int SDK_FTP_USERNAME_LEN                 =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:password max length 
	 * \else
	 * FTP���ã�������󳤶�
	 * \endif
	 */
	public static final int SDK_FTP_PASSWORD_LEN                 =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:time periods in each day.
	 * \else
	 * FTP���ã�ÿ��ʱ��θ���
	 * \endif
	 */
	public static final int SDK_TIME_SECTION                     =          2 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:file path max length
	 * \else
	 * FTP���ã��ļ�·������󳤶�
	 * \endif
	 */
	public static final int SDK_FTP_MAX_PATH                     =        240 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:sub path max lenth
	 * \else
	 * FTP���ã��ļ�·������󳤶�
	 * \endif
	 */
	public static final int SDK_FTP_MAX_SUB_PATH                 =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:U China Net Communication (CNC)channel ID
	 * \else
	 * ƽ̨�������ã�U��ͨͨ��ID
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_CHANID           =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:UCNC device ID
	 * \else
	 * ƽ̨�������ã�U��ͨ�豸ID
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_DEVID            =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:UCNC registration password
	 * \else
	 * ƽ̨�������ã�U��ͨע������
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_REGPSW           =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:UCNC user name 
	 * \else
	 * ƽ̨�������ã�U��ͨ�û���
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_USERNAME         =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup: UCNC password 
	 * \else
	 * ƽ̨�������ã�U��ͨ����
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_USERPSW          =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:ZTE Netview IP
	 * \else
	 * ƽ̨�������ã�������άIP
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_IP                =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Serial Platform embedded setup:ZTE Netview  serial
	 * \else
	 * ƽ̨�������ã�������άserial
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_SERIAL            =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * User Platform embedded setup:ZTE Netview user
	 * \else
	 * ƽ̨�������ã�������άuser
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_USER              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Password Platform embedded setup:ZTE Netview password
	 * \else
	 * ƽ̨�������ã�������άpassword
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_PWD               =         50 ;   
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zones max amount
	 * \else
	 * �ڵ�����������
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_COVER_NUM              =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Watermark data max length 
	 * \else
	 * ˮӡͼƬ������󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_WATERMAKE_DATA               =       4096 ;   
	/**
	 * \if ENGLISH_LANG
	 * Watermark text max length
	 * \else
	 * ˮӡ������󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_WATERMAKE_LETTER             =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max searched wireless device amount 
	 * \else
	 * ����������������豸����
	 * \endif
	 */
	public static final int SDK_MAX_WLANDEVICE_NUM               =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max searched wireless device amount
	 * \else
	 * ����������������豸����
	 * \endif
	 */
	public static final int SDK_MAX_WLANDEVICE_NUM_EX            =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Address length
	 * \else
	 * ��ַ����
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_NAME                   =         64 ;           
	/**
	 * \if ENGLISH_LANG
	 * Auto registration server amount
	 * \else
	 * ����ע�����������
	 * \endif
	 */
	public static final int SDK_MAX_REGISTER_SERVER_NUM          =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * 6 FRAME ID options
	 * \else
	 * 6��FRAME ID ѡ��
	 * \endif
	 */
	public static final int SDK_SNIFFER_FRAMEID_NUM              =          6 ;   
	/**
	 * \if ENGLISH_LANG
	 * 4 sniffer in each FRAME
	 * \else
	 * ÿ��FRAME��Ӧ��4��ץ������
	 * \endif
	 */
	public static final int SDK_SNIFFER_CONTENT_NUM              =          4 ;   
	/**
	 * \if ENGLISH_LANG
	 * 8 sniffer in each FRAME
	 * \else
	 * ÿ��FRAME��Ӧ��8��ץ������
	 * \endif
	 */
	public static final int SDK_SNIFFER_CONTENT_NUM_EX           =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Protocol length
	 * \else
	 * Э�����ֳ���
	 * \endif
	 */
	public static final int SDK_SNIFFER_PROTOCOL_SIZE            =         20 ;       
	/**
	 * \if ENGLISH_LANG
	 * 4 group sniffer setup 
	 * \else
	 * �˿����
	 * \endif
	 */
	public static final int SDK_MAX_PROTOCOL_NAME_LENGTH         =         20 ;           
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 4��ץ������
	 * \endif
	 */
	public static final int SDK_SNIFFER_GROUP_NUM                =          4 ;        
	/**
	 * \if ENGLISH_LANG
	 * Remote folder length
	 * \else
	 * Զ��Ŀ¼�ĳ���
	 * \endif
	 */
	public static final int MAX_PATH_STOR                       =        240 ;     
	/**
	 * \if ENGLISH_LANG
	 * New alarm upload time length
	 * \else
	 * �µı����ϴ�ʱ��ĳ���
	 * \endif
	 */
	public static final int SDK_ALARM_OCCUR_TIME_LEN             =         40 ;   
	/**
	 * \if ENGLISH_LANG
	 * Overlay name length. Now it supports 32-digit English and 16-digit Chinese
	 * \else
	 * ���ӵ����Ƴ��ȣ�Ŀǰ֧��32��Ӣ�ģ�16������
	 * \endif
	 */
	public static final int SDK_VIDEO_OSD_NAME_NUM               =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * The self-defined amount supported excluding time and channel
	 * \else
	 * ֧�ֵ��Զ�����ӵ���Ŀ��������ʱ���ͨ��
	 * \endif
	 */
	public static final int SDK_VIDEO_CUSTOM_OSD_NUM             =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Targeted initiatives to support the number of registration servers
	 * \else
	 * ֧�ֶ�������ע��������ĸ���
	 * \endif
	 */
	public static final int SDK_CONTROL_AUTO_REGISTER_NUM        =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Support the number of messages the recipient
	 * \else
	 * ֧�ֶ��Ž����ߵĸ���
	 * \endif
	 */
	public static final int SDK_MMS_RECEIVER_NUM                 =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Support the number of SMS sender
	 * \else
	 * ֧�ֶ��ŷ����ߵĸ���
	 * \endif
	 */
	public static final int SDK_MMS_SMSACTIVATION_NUM            =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Support for dial-up number of the sender
	 * \else
	 * ֧�ֲ��ŷ����ߵĸ���
	 * \endif
	 */
	public static final int SDK_MMS_DIALINACTIVATION_NUM         =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm output amount max limit
	 * \else
	 * ��������ڸ���������չ
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT_NUM_EX              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Video input amount max limit
	 * \else
	 * ��Ƶ����ڸ���������չ
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_IN_NUM_EX              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm input amount max limit
	 * \else
	 * ��������ڸ�������
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_IN_NUM_EX              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * IP or domain name length
	 * \else
	 * IP��ַ�ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_OR_DOMAIN_LEN         =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * The upper limit number of object id that detected by device in intelligent analysis
	 * \else
	 * ���ܷ����豸��⵽������ID��������
	 * \endif
	 */
	public static final int SDK_MAX_OBJECT_LIST                  =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * The upper limit number of device rule in intelligent analysis 
	 * \else
	 * ���ܷ����豸�����������
	 * \endif
	 */
	public static final int SDK_MAX_RULE_LIST                    =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * The max number of polygon's culmination
	 * \else
	 * �������󶥵����
	 * \endif
	 */
	public static final int SDK_MAX_POLYGON_NUM                  =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Rule detect line's max point number
	 * \else
	 * ����������󶥵���
	 * \endif
	 */
	public static final int SDK_MAX_DETECT_LINE_NUM              =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Rule detect region's max point number
	 * \else
	 * ������������󶥵���
	 * \endif
	 */
	public static final int SDK_MAX_DETECT_REGION_NUM            =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Object moving track's max point number
	 * \else
	 * �����˶��켣��󶥵���
	 * \endif
	 */
	public static final int SDK_MAX_TRACK_LINE_NUM               =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max candidate number
	 * \else
	 * ����ʶ�����ƥ����
	 * \endif
	 */
	public static final int SDK_MAX_CANDIDATE_NUM                =         50 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max image of ervery person
	 * \else
	 * ÿ����Ա��Ӧ���������ͼƬ��
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_IMAGE_NUM             =         48 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max fance line number
	 * \else
	 * Χ�����������
	 * \endif
	 */
	public static final int SDK_MAX_FENCE_LINE_NUM               =          2 ;     
	/**
	 * \if ENGLISH_LANG
	 * The max number of smart disk information
	 * \else
	 * ����smart��Ϣ����
	 * \endif
	 */
	public static final int MAX_SMART_VALUE_NUM                 =         30 ;   
	/**
	 * \if ENGLISH_LANG
	 * Device name length
	 * \else
	 * �������Ƴ���
	 * \endif
	 */
	public static final int SDK_MACHINE_NAME_NUM                 =         64 ;       
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,Device serial num length
	 * \else
	 * ƽ̨�������ã�������� �豸���к��ַ�������
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_DEVICESERIAL      =         48 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,Device Name length
	 * \else
	 * ƽ̨�������ã�������� �豸�����ַ�������
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_DEVICENAME        =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,User Name Length
	 * \else
	 * ƽ̨�������ã�������� ע���û����ַ�������
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_USER              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,password length
	 * \else
	 * ƽ̨�������ã�������� ע�������ַ�������
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_PWD               =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max number of submodule infomation
	 * \else
	 * �����ģ����Ϣ����
	 * \endif
	 */
	public static final int MAX_SUBMODULE_NUM                   =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic snapshot,the max car way number
	 * \else
	 * ��ͨץ�ģ���󳵵���
	 * \endif
	 */
	public static final int SDK_MAX_CARWAY_NUM                   =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * One car way max time for snapshot
	 * \else
	 * һ�����������ץ������
	 * \endif
	 */
	public static final int SDK_MAX_SNAP_SIGNAL_NUM              =          3 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max number of card
	 * \else
	 * ���ŵ�������
	 * \endif
	 */
	public static final int SDK_MAX_CARD_NUM                     =        128 ;     
	/**
	 * \if ENGLISH_LANG
	 * Max lenth of card infomation
	 * \else
	 * ÿ��������ַ���
	 * \endif
	 */
	public static final int SDK_MAX_CARDINFO_LEN                 =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max supported controller number
	 * \else
	 * ���֧�ֿ�������Ŀ
	 * \endif
	 */
	public static final int SDK_MAX_CONTROLER_NUM                =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max control light group number
	 * \else
	 * �����Ƶ�����
	 * \endif
	 */
	public static final int SDK_MAX_LIGHT_NUM                    =         32 ;     
	/**
	 * \if ENGLISH_LANG
	 * Max Snmp read or write buffer
	 * \else
	 * snmp ��д���ݳ���
	 * \endif
	 */
	public static final int SDK_MAX_SNMP_COMMON_LEN              =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max DDNS state buffer
	 * \else
	 * DDNS ״̬��Ϣ����
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_STATE_LEN               =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max phone len
	 * \else
	 * �绰���볤��
	 * \endif
	 */
	public static final int SDK_MAX_PHONE_NO_LEN                 =         16 ;       
	/**
	 * \if ENGLISH_LANG
	 * Max type len
	 * \else
	 * �������ͻ����Ϣ���ͳ���
	 * \endif
	 */
	public static final int SDK_MAX_MSGTYPE_LEN                  =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max message len
	 * \else
	 * �����Ͷ���Ϣ����
	 * \endif
	 */
	public static final int SDK_MAX_MSG_LEN                      =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max drivingdirection len
	 * \else
	 * ��ʻ�����ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_DRIVINGDIRECTION             =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max snapshot count
	 * \else
	 * ����ͼƬץ�ĸ���
	 * \endif
	 */
	public static final int SDK_MAX_GRAB_INTERVAL_NUM            =          4 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max flash count
	 * \else
	 * ���֧������Ƹ���
	 * \endif
	 */
	public static final int SDK_MAX_FLASH_NUM                    =          5 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max number of road in every channel
	 * \else
	 * ��Ƶ�����豸ÿ��ͨ����Ӧ����������
	 * \endif
	 */
	public static final int SDK_MAX_LANE_NUM                     =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max ISCSI remote path number
	 * \else
	 * ISCSIԶ��Ŀ¼�������
	 * \endif
	 */
	public static final int SDK_MAX_ISCSI_PATH_NUM               =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max wireless channel number
	 * \else
	 * ����·������ŵ���
	 * \endif
	 */
	public static final int SDK_MAX_WIRELESS_CHN_NUM             =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * Protocol 3 base value
	 * \else
	 * ����Э��汾����
	 * \endif
	 */
	public static final int SDK_PROTOCOL3_BASE                   =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Prococol 3 support
	 * \else
	 * ֻ֧��3��Э��
	 * \endif
	 */
	public static final int SDK_PROTOCOL3_SUPPORT                =         11 ;      
	/**
	 * \if ENGLISH_LANG
	 * Max channel mask
	 * \else
	 * ͨ���������ֵ
	 * \endif
	 */
	public static final int SDK_MAX_CHANMASK                     =         64 ;     
	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration staff number
	 * \else
	 * Ũ����Ƶ������Ϣ�б��������
	 * \endif
	 */
	public static final int SDK_MAX_STAFF_NUM                    =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration calibrate region
	 * \else
	 * Ũ����Ƶ������Ϣ�б궨����������
	 * \endif
	 */
	public static final int SDK_MAX_CALIBRATEBOX_NUM             =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration exclude region
	 * \else
	 * Ũ����Ƶ������Ϣ���ų�����������
	 * \endif
	 */
	public static final int SDK_MAX_EXCLUDEREGION_NUM            =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Number of compressed video configuration poly line
	 * \else
	 * Ũ����Ƶ������Ϣ�б������
	 * \endif
	 */
	public static final int SDK_MAX_POLYLINE_NUM                 =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Color maximum number
	 * \else
	 * �����ɫ��Ŀ
	 * \endif
	 */
	public static final int SDK_MAX_COLOR_NUM                    =         16 ;       
	/**
	 * \if ENGLISH_LANG
	 * Max number of  filter type 
	 * \else
	 * �������������
	 * \endif
	 */
	public static final int MAX_OBJFILTER_NUM                   =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * String state length of compressed video 
	 * \else
	 * ��ƵŨ��״̬�ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_SYNOPSIS_STATE_NAME          =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * The file number limit
	 * \else
	 * ��ƵŨ�����ԭʼ�ļ�����·������ʱ�ļ���������
	 * \endif
	 */
	public static final int SDK_MAX_SYNOPSIS_QUERY_FILE_COUNT    =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Length of SSID
	 * \else
	 * SSID����
	 * \endif
	 */
	public static final int SDK_MAX_SSID_LEN                     =         36 ;           
	/**
	 * \if ENGLISH_LANG
	 * Length of PIN
	 * \else
	 * PIN�볤��
	 * \endif
	 */
	public static final int SDK_MAX_APPIN_LEN                    =         16 ;          
	/**
	 * \if ENGLISH_LANG
	 * Length of net port
	 * \else
	 * �������Ƴ���
	 * \endif
	 */
	public static final int SDK_NETINTERFACE_NAME_LEN            =        260 ;       
	/**
	 * \if ENGLISH_LANG
	 * Length of net type
	 * \else
	 * �������ͳ���
	 * \endif
	 */
	public static final int SDK_NETINTERFACE_TYPE_LEN            =        260 ;       
	/**
	 * \if ENGLISH_LANG
	 * Length of connect status
	 * \else
	 * ����״̬�ַ�������
	 * \endif
	 */
	public static final int SDK_MAX_CONNECT_STATUS_LEN           =        260 ;   
	/**
	 * \if ENGLISH_LANG
	 * Length of 3G mode support
	 * \else
	 * 3G֧�ֵ�����ģʽ����
	 * \endif
	 */
	public static final int SDK_MAX_MODE_LEN                     =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Number of 3G mode support
	 * \else
	 * 3G֧�ֵ�����ģʽ����
	 * \endif
	 */
	public static final int SDK_MAX_MODE_NUM                     =         64 ;   
	
	public static final int SDK_MAX_COMPRESSION_TYPES_NUM        =         16 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of video resolution 
	 * \else
	 * ��Ƶ�ֱ��ʸ���
	 * \endif
	 */
	public static final int SDK_MAX_CAPTURE_SIZE_NUM             =         64 ;     
	/**
	 * \if ENGLISH_LANG
	 * Length of node name
	 * \else
	 * ��֯�ṹ�ڵ����Ƴ���
	 * \endif
	 */
	public static final int SDK_NODE_NAME_LEN                    =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max number of point support
	 * \else
	 * ֧�����궨����
	 * \endif
	 */
	public static final int MAX_CALIBPOINTS_NUM                 =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * The maximum number display element attributes
	 * \else
	 * ��ʾ��Ԫ�����������
	 * \endif
	 */
	public static final int SDK_MAX_ATTR_NUM                     =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Length of cloud connect state
	 * \else
	 * ��ע������״̬��Ϣ����
	 * \endif
	 */
	public static final int SDK_MAX_CLOUDCONNECT_STATE_LEN       =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * IP entended maximum length
	 * \else
	 * ��չIP��ַ��󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_EX_LEN                =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Plate character length
	 * \else
	 * �����ַ�������  
	 * \endif
	 */
	public static final int SDK_MAX_PLATE_NUMBER_LEN             =         32 ;    
	/**
	 * \if ENGLISH_LANG
	 * Right list max number
	 * \else
	 * Ȩ���б�������   
	 * \endif
	 */
	public static final int SDK_MAX_AUTHORITY_LIST_NUM           =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * City name max length
	 * \else
	 * ����������󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_CITY_NAME_LEN                =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Province name max length
	 * \else
	 * ʡ��������󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_PROVINCE_NAME_LEN            =         64 ;  
	/**
	 * \if ENGLISH_LANG
	 * Staff ID max length
	 * \else
	 * ��Աid��󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_ID_LEN                =         32 ;     
	/**
	 * \if ENGLISH_LANG
	 * Max face area number
	 * \else
	 * �������������� 
	 * \endif
	 */
	public static final int MAX_FACE_AREA_NUM                   =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max face database number
	 * \else
	 * ����������ݿ����
	 * \endif
	 */
	public static final int MAX_FACE_DB_NUM                     =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max event name
	 * \else
	 * ��¼���
	 * \endif
	 */
	public static final int MAX_EVENT_NAME                      =        128 ;         
	/**
	 * \if ENGLISH_LANG
	 * Max net card name
	 * \else
	 * ���������
	 * \endif
	 */
	public static final int SDK_MAX_ETH_NAME                     =         64 ;         
	/**
	 * \if ENGLISH_LANG
	 * Staff name max length
	 * \else
	 * ��Ա������󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_NAME_LEN              =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Time table element number 
	 * \else
	 * ʱ���Ԫ�ظ���
	 * \endif
	 */
	public static final int SDK_N_SCHEDULE_TSECT                 =          8 ;      
	/**
	 * \if ENGLISH_LANG
	 * URL max number
	 * \else
	 * URL������
	 * \endif
	 */
	public static final int SDK_MAX_URL_NUM                      =          8 ;       
	
	/**
	 * \if ENGLISH_LANG
	 * Max battery quantity
	 * \else
	 * ���������
	 * \endif
	 */
	public static final int SDK_BATTERY_NUM_MAX                  =          16;
	
	/**
	 * \if ENGLISH_LANG
	 * Max power quantity
	 * \else
	 * ����Դ����
	 * \endif
	 */
	public static final int SDK_POWER_NUM_MAX                    =          16;
	
	/**
	 * \if ENGLISH_LANG
	 * Max audio file path length
	 * \else
	 * �����Ƶ�ļ�·����
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_PATH                   =          260;
	
	/**
	 * \if ENGLISH_LANG
	 * Max access control name length
	 * \else
	 * ����Ž����Ƴ���
	 * \endif
	 */
	public static final int SDK_MAX_DOORNAME_LEN                 =          128;
	
	/**
	 * \if ENGLISH_LANG
	 * Max access control name length
	 * \else
	 * ����Ž����볤��
	 * \endif
	 */
	public static final int SDK_MAX_CARDPWD_LEN                  =          64;
	
	/**
	 * \if ENGLISH_LANG
	 * The max length of wireless device SN
	 * \else
	 * �����豸���к���󳤶�
	 * \endif
	 */
	public static final int NET_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN = 32;
	
	public static final int  NET_MAX_FISHEYE_MOUNTMODE_NUM      = 4;                // ������۰�װģʽ����
	public static final int  NET_MAX_FISHEYE_CALIBRATEMODE_NUM  = 16;               // ������۽���ģʽ����
	public static final int  NET_MAX_FISHEYE_EPTZCMD_NUM        = 64;               // ������۵�����̨��������   
	public static final int  POINT_NUM_IN_PAIR                  = 2;                // �궨����еĵ�����
	public static final int  MAX_POINT_PAIR_NUM                 = 128;              // �궨���������
	public static final int  CHANNEL_NUM_IN_POINT_GROUP         = 2;                // �궨���е���Ƶͨ����
	public static final int  MAX_POINT_GROUP_NUM                = 32;               // �궨�����������, ÿ����ͨ������ƴ����Ҫһ��궨��
	public static final int  MAX_LANE_INFO_NUM                  = 32;               // ��󳵵���Ϣ��
	public static final int  MAX_LANE_DIRECTION_NUM             = 8;                // ������������
	public static final int  SDK_MAX_MONITORWALL_NUM             = 32;               // ����ǽ�������
	public static final int  SDK_MAX_OPTIONAL_URL_NUM            = 8;                // ����url�������
	public static final int  SDK_MAX_CAMERA_CHANNEL_NUM         = 1024;             // ��������ͨ����
	public static final int  MAX_FILE_SUMMARY_NUM               = 32;               // ����ļ�ժҪ��
	public static final int  MAX_AUDIO_ENCODE_NUM               = 64;               // ���֧����Ƶ�������
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �����Ȩ���Ž���Ŀ
	 * \endif
	 */
	public static final int SDK_MAX_DOOR_NUM                     =          32;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �����Чʱ�����Ŀ
	 * \endif
	 */
	public static final int SDK_MAX_TIMESECTION_NUM              =          32;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �Ž�������󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_CARDNO_LEN                   =          32;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �Ž����û�ID��󳤶�
	 * \endif
	 */
	public static final int SDK_MAX_USERID_LEN                   =          32;

	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * �û�������
	 * \endif
	 */
	public static final int     SDK_USER_NAME_LENGTH_EX = 16;			  
	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * ����
	 * \endif
	 */
	public static final int     SDK_USER_PSW_LENGTH_EX = 16;			
	
	/**
	 * \if ENGLISH_LANG
	 * Max bell number
	 * \else
	 *  ��󾯺Ÿ���
	 * \endif
	 */
	public static final int     SDK_MAX_BELL_NUM = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Max keyboard num
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int     SDK_MAX_KEYBOARD_NUM  =  256;       

	/**
	 * \if ENGLISH_LANG
	 * Max user right amount
	 * \else
	 * �û�Ȩ�޸�������
	 * \endif
	 */
	public static final int     SDK_NEW_MAX_RIGHT_NUM     = 1024;

	
	public static final int 	SDK_MAX_ALARM_SUBSYSTEM_NUM = 8;
	/**
	 * \if ENGLISH_LANG
	 * Device property setup 
	 * \else
	 * �豸��������
	 * \endif
	 */
	public static final int SDK_DEV_DEVICECFG			 = 0x0001	;   
	/**
	 * \if ENGLISH_LANG
	 * Network setup
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int SDK_DEV_NETCFG				 = 0x0002	;   
	/**
	 * \if ENGLISH_LANG
	 * Video channel setup
	 * \else
	 * ͼ��ͨ������
	 * \endif
	 */
	public static final int SDK_DEV_CHANNELCFG			 = 0x0003	;   
	/**
	 * \if ENGLISH_LANG
	 * Preview parameter setup
	 * \else
	 * Ԥ����������
	 * \endif
	 */
	public static final int SDK_DEV_PREVIEWCFG 			 = 0x0004	;   
	/**
	 * \if ENGLISH_LANG
	 * Record setup
	 * \else
	 * ¼������
	 * \endif
	 */
	public static final int SDK_DEV_RECORDCFG			 = 0x0005	;   
	/**
	 * \if ENGLISH_LANG
	 * COM property setup
	 * \else
	 * ������������
	 * \endif
	 */
	public static final int SDK_DEV_COMMCFG				 = 0x0006	;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm property setup
	 * \else
	 * ������������
	 * \endif
	 */
	public static final int SDK_DEV_ALARMCFG 			 = 0x0007	;   
	/**
	 * \if ENGLISH_LANG
	 * DVR time setup
	 * \else
	 * DVRʱ������
	 * \endif
	 */
	public static final int SDK_DEV_TIMECFG 				 = 0x0008	;   
	/**
	 * \if ENGLISH_LANG
	 * Audio talk parameter setup
	 * \else
	 * �Խ���������
	 * \endif
	 */
	public static final int SDK_DEV_TALKCFG				 = 0x0009	;   
	/**
	 * \if ENGLISH_LANG
	 * Auto matrix setup
	 * \else
	 * �Զ�ά������
	 * \endif
	 */
	public static final int SDK_DEV_AUTOMTCFG			 = 0x000A	;   		
	/**
	 * \if ENGLISH_LANG
	 * Local matrix control strategy setup
	 * \else
	 * ����������Ʋ�������	
	 * \endif
	 */
	public static final int SDK_DEV_VEDIO_MARTIX			 = 0x000B	;   
	/**
	 * \if ENGLISH_LANG
	 * Multiple ddns setup 
	 * \else
	 * ��ddns����������
	 * \endif
	 */
	public static final int SDK_DEV_MULTI_DDNS			 = 0x000C	;   
	/**
	 * \if ENGLISH_LANG
	 * Snapshot corresponding setup 
	 * \else
	 * ץͼ�������
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CFG				 = 0x000D	;   
	/**
	 * \if ENGLISH_LANG
	 * HTTP path setup 
	 * \else
	 * HTTP·������
	 * \endif
	 */
	public static final int SDK_DEV_WEB_URL_CFG			 = 0x000E	;   
	/**
	 * \if ENGLISH_LANG
	 * FTP upload setup
	 * \else
	 * FTP�ϴ�����
	 * \endif
	 */
	public static final int SDK_DEV_FTP_PROTO_CFG		 = 0x000F	;   
	/**
	 * \if ENGLISH_LANG
	 * Plaform embedded setup. Now the channel parameter represents the platform type.\n
	 * channel=4:Bell alcatel;channel=10:ZTE Netview;channel=11:U CNC  channel = 51 AMP
	 * \else
	 * ƽ̨�������ã���ʱchannel��������ƽ̨���ͣ�
	 * channel=4�� �������������أ�channel=10������������ά��channel=11������U��ͨ��channel=51�������������\n
	 * \endif
	 */
	public static final int SDK_DEV_INTERVIDEO_CFG		 = 0x0010	;   
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask setup
	 * \else
	 * �����ڵ�����
	 * \endif
	 */
	public static final int SDK_DEV_VIDEO_COVER			 = 0x0011	;   
	/**
	 * \if ENGLISH_LANG
	 * Transmission strategy. Video quality \ Fluency
	 * \else
	 * ����������ã��������� \ ����������
	 * \endif
	 */
	public static final int SDK_DEV_TRANS_STRATEGY		 = 0x0012	;   
	/**
	 * \if ENGLISH_LANG
	 * Record download strategy setup:high-speed \ general download
	 * \else
	 * ¼�����ز������ã��������� \ ��ͨ����
	 * \endif
	 */
	public static final int SDK_DEV_DOWNLOAD_STRATEGY	 = 0x0013	;   
	/**
	 * \if ENGLISH_LANG
	 * Video watermark setup
	 * \else
	 * ͼ��ˮӡ����
	 * \endif
	 */
	public static final int SDK_DEV_WATERMAKE_CFG		 = 0x0014	;   
	/**
	 * \if ENGLISH_LANG
	 * Wireless network setup
	 * \else
	 * ������������
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_CFG				 = 0x0015	;   
	/**
	 * \if ENGLISH_LANG
	 * Search wireless device setup 
	 * \else
	 * ���������豸����
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_DEVICE_CFG		 = 0x0016	;   
	/**
	 * \if ENGLISH_LANG
	 * Auto register parameter setup 
	 * \else
	 * ����ע���������
	 * \endif
	 */
	public static final int SDK_DEV_REGISTER_CFG			 = 0x0017	;   
	/**
	 * \if ENGLISH_LANG
	 * Camera property setup
	 * \else
	 * ����ͷ��������
	 * \endif
	 */
	public static final int SDK_DEV_CAMERA_CFG			 = 0x0018	;   
	/**
	 * \if ENGLISH_LANG
	 * IR alarm setup 
	 * \else
	 * ���ⱨ������
	 * \endif
	 */
	public static final int SDK_DEV_INFRARED_CFG 		 = 0x0019	;   
	/**
	 * \if ENGLISH_LANG
	 * Sniffer setup 
	 * \else
	 * Snifferץ������
	 * \endif
	 */
	public static final int SDK_DEV_SNIFFER_CFG			 = 0x001A	;   
	/**
	 * \if ENGLISH_LANG
	 * Mail setup 
	 * \else
	 * �ʼ�����
	 * \endif
	 */
	public static final int SDK_DEV_MAIL_CFG				 = 0x001B	;   
	/**
	 * \if ENGLISH_LANG
	 * DNS setup 
	 * \else
	 * DNS����������
	 * \endif
	 */
	public static final int SDK_DEV_DNS_CFG				 = 0x001C	;   
	/**
	 * \if ENGLISH_LANG
	 * NTP setup
	 * \else
	 * NTP����
	 * \endif
	 */
	public static final int SDK_DEV_NTP_CFG				 = 0x001D	;   
	/**
	 * \if ENGLISH_LANG
	 * Audio detection setup 
	 * \else
	 * ��Ƶ�������
	 * \endif
	 */
	public static final int SDK_DEV_AUDIO_DETECT_CFG		 = 0x001E	;   
	/**
	 * \if ENGLISH_LANG
	 * Storage position setup
	 * \else
	 * �洢λ������
	 * \endif
	 */
	public static final int SDK_DEV_STORAGE_STATION_CFG   = 0x001F      ; 
	/**
	 * \if ENGLISH_LANG
	 * PTZ operation property(It is invalid now. Please use CLIENT_GetPtzOptAttr to get PTZ operation property.)
	 * \else
	 * ��̨��������(�Ѿ��ϳ�����ʹ�� GetPtzOptAttr ��ȡ��̨��������)
	 * \endif
	 */
	public static final int SDK_DEV_PTZ_OPT_CFG			 = 0x0020	;   
	/**
	 * \if ENGLISH_LANG
	 * Daylight Saving Time (DST)setup
	 * \else
	 * ����ʱ����
	 * \endif
	 */
	public static final int SDK_DEV_DST_CFG				 = 0x0021      ; 
	/**
	 * \if ENGLISH_LANG
	 * Alarm centre setup
	 * \else
	 * ������������
	 * \endif
	 */
	public static final int SDK_DEV_ALARM_CENTER_CFG		 = 0x0022	;   
	/**
	 * \if ENGLISH_LANG
	 * VIdeo OSD setup
	 * \else
	 * ��ƵOSD��������
	 * \endif
	 */
	public static final int SDK_DEV_VIDEO_OSD_CFG         = 0x0023	;   
	/**
	 * \if ENGLISH_LANG
	 * CDMA \ GPRS configuration
	 * \else
	 * CDMA \ GPRS��������
	 * \endif
	 */
	public static final int SDK_DEV_CDMAGPRS_CFG          = 0x0024	;   
	/**
	 * \if ENGLISH_LANG
	 * IP Filter configuration
	 * \else
	 * IP��������
	 * \endif
	 */
	
	public static final int SDK_DEV_IPFILTER_CFG          = 0x0025	;   
	/**
	 * \if ENGLISH_LANG
	 * Talk encode configuration
	 * \else
	 * �����Խ���������
	 * \endif
	 */
	public static final int SDK_DEV_TALK_ENCODE_CFG       = 0x0026      ; 
	/**
	 * \if ENGLISH_LANG
	 * The length of the video package configuration
	 * \else
	 * ¼������������
	 * \endif
	 */
	public static final int SDK_DEV_RECORD_PACKET_CFG     = 0x0027      ; 
	/**
	 * \if ENGLISH_LANG
	 * SMS MMS configuration 
	 * \else
	 * ����MMS���� 
	 * \endif
	 */
	public static final int SDK_DEV_MMS_CFG               = 0x0028	;   
	/**
	 * \if ENGLISH_LANG
	 * SMS to activate the wireless connection configuration
	 * \else
	 * ���ż���������������
	 * \endif
	 */
	public static final int SDK_DEV_SMSACTIVATION_CFG	 = 0x0029	;   
	/**
	 * \if ENGLISH_LANG
	 * Dial-up activation of a wireless connection configuration
	 * \else
	 * ���ż���������������
	 * \endif
	 */
	public static final int SDK_DEV_DIALINACTIVATION_CFG	 = 0x002A	;   
	/**
	 * \if ENGLISH_LANG
	 * Capture network configuration
	 * \else
	 * ����ץ������
	 * \endif
	 */
	public static final int SDK_DEV_SNIFFER_CFG_EX		 = 0x0030	;   
	/**
	 * \if ENGLISH_LANG
	 * Download speed limit
	 * \else
	 * �����ٶ�����
	 * \endif
	 */
	public static final int SDK_DEV_DOWNLOAD_RATE_CFG	 = 0x0031	;   
	/**
	 * \if ENGLISH_LANG
	 * Panorama switch alarm configuration
	 * \else
	 * ȫ���л���������
	 * \endif
	 */
	public static final int SDK_DEV_PANORAMA_SWITCH_CFG	 = 0x0032	;   
	/**
	 * \if ENGLISH_LANG
	 * Lose focus alarm configuration
	 * \else
	 * ʧȥ���㱨������
	 * \endif
	 */
	public static final int SDK_DEV_LOST_FOCUS_CFG		 = 0x0033	;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder configuration
	 * \else
	 * ��������������
	 * \endif
	 */
	public static final int SDK_DEV_ALARM_DECODE_CFG		 = 0x0034	;   
	/**
	 * \if ENGLISH_LANG
	 * Video output configuration
	 * \else
	 * ��Ƶ�����������
	 * \endif
	 */
	public static final int SDK_DEV_VIDEOOUT_CFG          = 0x0035      ; 
	/**
	 * \if ENGLISH_LANG
	 * Preset enable configuration
	 * \else
	 * Ԥ�Ƶ�ʹ������
	 * \endif
	 */
	public static final int SDK_DEV_POINT_CFG			 = 0x0036	;   
	/**
	 * \if ENGLISH_LANG
	 * IP conflication configurationIp
	 * \else
	 * Ip��ͻ��ⱨ������
	 * \endif
	 */
	public static final int SDK_DEV_IP_COLLISION_CFG      = 0x0037      ; 
	/**
	 * \if ENGLISH_LANG
	 * OSD overlay enable configuration
	 * \else
	 * OSD����ʹ������
	 * \endif
	 */
	public static final int SDK_DEV_OSD_ENABLE_CFG		 = 0x0038	;   
	/**
	 * \if ENGLISH_LANG
	 * Local alarm configuration(Structure DH_ALARMIN_CFG_EX)
	 * \else
	 * ���ر�������(�ṹ��SDK_ALARMIN_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_LOCALALARM_CFG 		 = 0x0039	;   
	/**
	 * \if ENGLISH_LANG
	 * Network alarm configuration(Structure DH_ALARMIN_CFG_EX)
	 * \else
	 * ���籨������(�ṹ��SDK_ALARMIN_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_NETALARM_CFG 		 = 0x003A	;   
	/**
	 * \if ENGLISH_LANG
	 * Motion detection configuration(Structure DH_MOTION_DETECT_CFG_EX)
	 * \else
	 * ���챨������(�ṹ��SDK_MOTION_DETECT_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_MOTIONALARM_CFG 		 = 0x003B	;   
	/**
	 * \if ENGLISH_LANG
	 * Video loss configuration(Structure DH_VIDEO_LOST_CFG_EX)
	 * \else
	 * ��Ƶ��ʧ��������(�ṹ��SDK_VIDEO_LOST_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_VIDEOLOSTALARM_CFG 	 = 0x003C	;   
	/**
	 * \if ENGLISH_LANG
	 * Camera masking configuration(Structure DH_BLIND_CFG_EX)
	 * \else
	 * ��Ƶ�ڵ���������(�ṹ��SDK_BLIND_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_BLINDALARM_CFG 		 = 0x003D	;   
	/**
	 * \if ENGLISH_LANG
	 * HDD alarm configuration(Structure DH_DISK_ALARM_CFG_EX)
	 * \else
	 * Ӳ�̱�������(�ṹ��SDK_DISK_ALARM_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_DISKALARM_CFG 		 = 0x003E	;   
	/**
	 * \if ENGLISH_LANG
	 * Network disconnection alarm configuration(Structure DH_NETBROKEN_ALARM_CFG_EX)
	 * \else
	 * �����жϱ�������(�ṹ��SDK_NETBROKEN_ALARM_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_NETBROKENALARM_CFG 	 = 0x003F	;   
	/**
	 * \if ENGLISH_LANG
	 * Digital channel info of front encoders(Hybrid DVR use,Structure DEV_ENCODER_CFG)
	 * \else
	 * ����ͨ����ǰ�˱�������Ϣ(���DVRʹ�ã��ṹ��DEV_ENCODER_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ENCODER_CFG           = 0x0040      ; 
	/**
	 * \if ENGLISH_LANG
	 * TV adjust configuration(Now the channel parameter represents the TV numble(from 0), Structure SDKDEV_TVADJUST_CFG)
	 * \else
	 * TV�������ã�channel����TV��(0��ʼ)�����ͽṹ�壩
	 * \endif
	 */
	public static final int SDK_DEV_TV_ADJUST_CFG         = 0x0041      ; 
	/**
	 * \if ENGLISH_LANG
	 * about vehicle configuration
	 * \else
	 * ����������ã���������ʹ��
	 * \endif
	 */
	public static final int SDK_DEV_ABOUT_VEHICLE_CFG	 = 0x0042	;   
	/**
	 * \if ENGLISH_LANG
	 * ATM ability information
	 * \else
	 * ��ȡatm����֧��������Ϣ
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_ABILITY	 = 0x0043	;   
	/**
	 * \if ENGLISH_LANG
	 * ATM overlay configuration
	 * \else
	 * atm�������ã���atm����
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_CFG		 = 0x0044	;   
	/**
	 * \if ENGLISH_LANG
	 * Decoder tour configuration
	 * \else
	 * ������������Ѳ����
	 * \endif
	 */
	public static final int SDK_DEV_DECODER_TOUR_CFG		 = 0x0045	;   
	/**
	 * \if ENGLISH_LANG
	 * SIP configuration
	 * \else
	 * SIP����
	 * \endif
	 */
	public static final int SDK_DEV_SIP_CFG				 = 0x0046	;   
	/**
	 * \if ENGLISH_LANG
	 * wifi ap configuration
	 * \else
	 * wifi ap����
	 * \endif
	 */
	public static final int SDK_DEV_VICHILE_WIFI_AP_CFG	 = 0x0047	;   
	/**
	 * \if ENGLISH_LANG
	 * Static
	 * \else
	 * ��̬�������� 
	 * \endif
	 */
	public static final int SDK_DEV_STATICALARM_CFG       = 0x0048      ; 
	/**
	 * \if ENGLISH_LANG
	 * decode policy configuration(Structure SDKDEV_DECODEPOLICY_CFG,channel start with 0) 
	 * \else
	 * �豸�Ľ����������(�ṹ��SDKDEV_DECODEPOLICY_CFG��channelΪ����ͨ��0��ʼ)
	 * \endif
	 */
	public static final int SDK_DEV_DECODE_POLICY_CFG     = 0x0049      ;  
	/**
	 * \if ENGLISH_LANG
	 * Device relative config (Structure SDKDEV_MACHINE_CFG)
	 * \else
	 * ������ص�����(�ṹ��SDKDEV_MACHINE_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_MACHINE_CFG			 = 0x004A	;   
	/**
	 * \if ENGLISH_LANG
	 * MACconflication configuration(Structure ALARM_MAC_COLLISION_CFG)
	 * \else
	 * MAC��ͻ�������(�ṹ��ALARM_MAC_COLLISION_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_MAC_COLLISION_CFG     = 0x004B      ; 
	/**
	 * \if ENGLISH_LANG
	 * RTSP configuration(structure SDKDEV_RTSP_CFG)
	 * \else
	 * RTSP����(��Ӧ�ṹ��SDKDEV_RTSP_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_RTSP_CFG              = 0x004C      ; 
	/**
	 * \if ENGLISH_LANG
	 * 232 com card signal event configuration(structure COM_CARD_SIGNAL_LINK_CFG)
	 * \else
	 * 232���ڿ����ź��¼�����(��Ӧ�ṹ��COM_CARD_SIGNAL_LINK_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_232_COM_CARD_CFG      = 0x004E      ; 
	/**
	 * \if ENGLISH_LANG
	 * 485 com card signal event configuration(structure COM_CARD_SIGNAL_LINK_CFG)
	 * \else
	 * 485���ڿ����ź��¼�����(��Ӧ�ṹ��COM_CARD_SIGNAL_LINK_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_485_COM_CARD_CFG      = 0x004F      ; 
	/**
	 * \if ENGLISH_LANG
	 * extend FTP upload setup(Structure SDKDEV_FTP_PROTO_CFG_EX)
	 * \else
	 * FTP�ϴ���չ����(��Ӧ�ṹ��SDKDEV_FTP_PROTO_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_FTP_PROTO_CFG_EX		 = 0x0050	;   
	/**
	 * \if ENGLISH_LANG
	 * SYSLOG remote server config (Structure SDKDEV_SYSLOG_REMOTE_SERVER)
	 * \else
	 * SYSLOG Զ�̷���������(��Ӧ�ṹ��SDKDEV_SYSLOG_REMOTE_SERVER)
	 * \endif
	 */
	public static final int SDK_DEV_SYSLOG_REMOTE_SERVER	 = 0x0051	;   
	/**
	 * \if ENGLISH_LANG
	 * Extended com configuration(structure SDKDEV_COMM_CFG_EX)
	 * \else
	 * ��չ������������(��Ӧ�ṹ��SDKDEV_COMM_CFG_EX) 
	 * \endif
	 */
	public static final int SDK_DEV_COMMCFG_EX            = 0x0052      ;            
	/**
	 * \if ENGLISH_LANG
	 * net card configuration(structure SDKDEV_NETCARD_CFG)
	 * \else
	 * ������Ϣ����(��Ӧ�ṹ��SDKDEV_NETCARD_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_NETCARD_CFG           = 0x0053      ; 
	/**
	 * \if ENGLISH_LANG
	 * Video backup format(structure SDKDEV_BACKUP_VIDEO_FORMAT)
	 * \else
	 * ��Ƶ���ݸ�ʽ����(��Ӧ�ṹ��SDKDEV_BACKUP_VIDEO_FORMAT)
	 * \endif
	 */
	public static final int SDK_DEV_BACKUP_VIDEO_FORMAT   = 0x0054	;   
	/**
	 * \if ENGLISH_LANG
	 * stream encrypt configuration(structure DHEDV_STREAM_ENCRYPT)
	 * \else
	 * ������������(��Ӧ�ṹ��DHEDV_STREAM_ENCRYPT)
	 * \endif
	 */
	public static final int SDK_DEV_STREAM_ENCRYPT_CFG    = 0x0055      ; 
	/**
	 * \if ENGLISH_LANG
	 * IP filter extended configuration(structure SDKDEV_IPIFILTER_CFG_EX)
	 * \else
	 * IP����������չ(��Ӧ�ṹ��SDKDEV_IPIFILTER_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_IPFILTER_CFG_EX       = 0x0056	;   
	/**
	 * \if ENGLISH_LANG
	 * custom configuration(structure SDKDEV_CUSTOM_CFG)
	 * \else
	 * �û��Զ�������(��Ӧ�ṹ��SDKDEV_CUSTOM_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_CUSTOM_CFG            = 0x0057      ; 
	/**
	 * \if ENGLISH_LANG
	 * Search wireless device extended setup(structure SDKDEV_WLAN_DEVICE_LIST_EX)
	 * \else
	 * ���������豸��չ����(��Ӧ�ṹ��SDKDEV_WLAN_DEVICE_LIST_EX)
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_DEVICE_CFG_EX    = 0x0058      ; 
	/**
	 * \if ENGLISH_LANG
	 * ACC power off configuration(structure SDKDEV_ACC_POWEROFF_CFG)
	 * \else
	 * ACC�����¼�����(��Ӧ�ṹ��SDKDEV_ACC_POWEROFF_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ACC_POWEROFF_CFG      = 0x0059      ; 
	/**
	 * \if ENGLISH_LANG
	 * explosion proof alarm configuration(structure SDKDEV_EXPLOSION_PROOF_CFG)
	 * \else
	 * �����б����¼�����(��Ӧ�ṹ��SDKDEV_EXPLOSION_PROOF_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_EXPLOSION_PROOF_CFG   = 0x005a      ; 
	/**
	 * \if ENGLISH_LANG
	 * Network extended setup(struct SDKDEV_NET_CFG_EX)
	 * \else
	 * ������չ����(��Ӧ�ṹ��SDKDEV_NET_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_NETCFG_EX			 = 0x005b	;   
	/**
	 * \if ENGLISH_LANG
	 * light control config(struct SDKDEV_LIGHTCONTROL_CFG)
	 * \else
	 * �ƹ��������(��Ӧ�ṹ��SDKDEV_LIGHTCONTROL_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_LIGHTCONTROL_CFG      = 0x005c      ; 
	/**
	 * \if ENGLISH_LANG
	 * 3G flow info config(struct SDKDEV_3GFLOW_INFO_CFG)
	 * \else
	 * 3G������Ϣ����(��Ӧ�ṹ��SDKDEV_3GFLOW_INFO_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_3GFLOW_CFG            = 0x005d      ; 
	/**
	 * \if ENGLISH_LANG
	 * IPv6 config(struct SDKDEV_IPV6_CFG)
	 * \else
	 * IPv6����(��Ӧ�ṹ��SDKDEV_IPV6_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_IPV6_CFG              = 0x005e      ; 
	/**
	 * \if ENGLISH_LANG
	 * Snmp config(struct SDKDEV_NET_SNMP_CFG)
	 * \else
	 * Snmp����(��Ӧ�ṹ��SDKDEV_NET_SNMP_CFG), ������ɺ���Ҫ�����豸
	 * \endif
	 */
	public static final int SDK_DEV_SNMP_CFG              = 0x005f      ; 
	/**
	 * \if ENGLISH_LANG
	 * snap control config(struct SDKDEV_SNAP_CONTROL_CFG)
	 * \else
	 * ץͼ��������(��Ӧ�ṹ��SDKDEV_SNAP_CONTROL_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CONTROL_CFG      = 0x0060      ; 
	/**
	 * \if ENGLISH_LANG
	 * GPS mode config(struct SDKDEV_GPS_MODE_CFG)
	 * \else
	 * GPS��λģʽ����(��Ӧ�ṹ��SDKDEV_GPS_MODE_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_GPS_MODE_CFG          = 0x0061      ; 
	/**
	 * \if ENGLISH_LANG
	 * Snap upload config(struct SDKDEV_SNAP_UPLOAD_CFG)
	 * \else
	 * ͼƬ�ϴ�������Ϣ(��Ӧ�ṹ�� SDKDEV_SNAP_UPLOAD_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_UPLOAD_CFG       = 0x0062      ; 
	/**
	 * \if ENGLISH_LANG
	 * Speed limit config(struct SDKDEV_SPEED_LIMIT_CFG)
	 * \else
	 * ����������Ϣ(��Ӧ�ṹ��SDKDEV_SPEED_LIMIT_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_SPEED_LIMIT_CFG       = 0x0063      ; 
	/**
	 * \if ENGLISH_LANG
	 * iSCSI config(struct SDKDEV_ISCSI_CFG), need reboot
	 * \else
	 * iSCSI����(��Ӧ�ṹ��SDKDEV_ISCSI_CFG), ������ɺ���Ҫ�����豸
	 * \endif
	 */
	public static final int SDK_DEV_ISCSI_CFG			 = 0x0064	;   
	/**
	 * \if ENGLISH_LANG
	 * wifi config(struc SDKDEV_WIRELESS_ROUTING_CFG)
	 * \else
	 * ����·������(��Ӧ�ṹ��SDKDEV_WIRELESS_ROUTING_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_WIRELESS_ROUTING_CFG	 = 0x0065	;   
	/**
	 * \if ENGLISH_LANG
	 * enclosure config(stuct SDKDEV_ENCLOSURE_CFG)
	 * \else
	 * ����Χ������(��Ӧ�ṹ��SDKDEV_ENCLOSURE_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ENCLOSURE_CFG         = 0x0066      ; 
	/**
	 * \if ENGLISH_LANG
	 * enclosure version config(struct SDKDEV_ENCLOSURE_VERSION_CFG)
	 * \else
	 * ����Χ���汾������(��Ӧ�ṹ��SDKDEV_ENCLOSURE_VERSION_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ENCLOSURE_VERSION_CFG  = 0x0067     ; 
	/**
	 * \if ENGLISH_LANG
	 * Raid event config(struct SDKDEV_RAID_EVENT_CFG)
	 * \else
	 * Raid�¼�����(��Ӧ�ṹ��SDKDEV_RAID_EVENT_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_RIAD_EVENT_CFG         = 0x0068     ; 
	/**
	 * \if ENGLISH_LANG
	 * fire alarm config(struct SDKDEV_FIRE_ALARM_CFG)
	 * \else
	 * �𾯱�������(��Ӧ�ṹ��SDKDEV_FIRE_ALARM_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_FIRE_ALARM_CFG         = 0x0069     ; 
	/**
	 * \if ENGLISH_LANG
	 * local alarm name config(string like "Name1&&name2&&name3...")
	 * \else
	 * �������Ʊ�������(��ӦName1&&name2&&name3...��ʽ�ַ���)
	 * \endif
	 */
	public static final int SDK_DEV_LOCALALARM_NAME_CFG    = 0x006a     ; 
	/**
	 * \if ENGLISH_LANG
	 * urgency storage config(struct SDKDEV_URGENCY_RECORD_CFG)
	 * \else
	 * �����洢����(��Ӧ�ṹ��SDKDEV_URGENCY_RECORD_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_URGENCY_RECORD_CFG     = 0x0070     ; 
	/**
	 * \if ENGLISH_LANG
	 * elevator parameter config(struct SDKDEV_ELEVATOR_ATTRI_CFG)
	 * \else
	 * �������в�������(��Ӧ�ṹ��SDKDEV_ELEVATOR_ATTRI_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ELEVATOR_ATTRI_CFG     = 0x0071     ; 
	/**
	 * \if ENGLISH_LANG
	 * TM overlay function. For latest ATM series product only. 
	 * \else
	 * atm�������ã���atm����,֧�ִ���32ͨ�����豸(��Ӧ�ṹ��SDKDEV_ATM_OVERLAY_CONFIG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_CFG_EX	  = 0x0072	;   
	/**
	 * \if ENGLISH_LANG
	 * Support devices of 32-channel or higher.( struct SDKDEV_ATM_OVERLAY_CONFIG_EX)
	 * \else
	 * MAC��������(��Ӧ�ṹ��SDKDEV_MACFILTER_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_MACFILTER_CFG		  = 0x0073	;   
	/**
	 * \if ENGLISH_LANG
	 * MAC filter config(struct SDKDEV_MACFILTER_CFG)
	 * \else
	 * MAC,IP����(Ҫ��ip,mac��һһ��Ӧ��)����(��Ӧ�ṹ��SDKDEV_MACIPFILTER_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_MACIPFILTER_CFG		  = 0x0074	;   
	/**
	 * \if ENGLISH_LANG
	 * MAC,IP filter config(need ip,mac one to one corresponding)(struct SDKDEV_MACIPFILTER_CFG)
	 * \else
	 * ��������(���ܼƻ�)����(��Ӧ�ṹ��DHEDV_STREAM_ENCRYPT)
	 * \endif
	 */
	public static final int SDK_DEV_STREAM_ENCRYPT_TIME_CFG  = 0x0075   ; 
	/**
	 * \if ENGLISH_LANG
	 * stream encrypt(encryot plan)(struct DHEDV_STREAM_ENCRYPT)
	 * \else
	 * ����������(��Ӧ�ṹ�� SDKDEV_LIMIT_BIT_RATE) 
	 * \endif
	 */
	public static final int SDK_DEV_LIMIT_BIT_RATE_CFG     = 0x0076     ; 
	/**
	 * \if ENGLISH_LANG
	 * limit bit rate config(struct SDKDEV_LIMIT_BIT_RATE)
	 * \else
	 * ץͼ���������չ(��Ӧ�ṹ�� SDKDEV_SNAP_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CFG_EX			  = 0x0077	;   
	/**
	 * \if ENGLISH_LANG
	 * snap extern config(struct SDKDEV_SNAP_CFG_EX)
	 * \else
	 * ������url����(��Ӧ�ṹ��SDKDEV_DECODER_URL_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_DECODER_URL_CFG		 = 0x0078	;   
	/**
	 * \if ENGLISH_LANG
	 * decoder url config(struct SDKDEV_DECODER_URL_CFG)
	 * \else
	 * ��Ѳʹ������(��Ӧ�ṹ��SDKDEV_TOUR_ENABLE_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_TOUR_ENABLE_CFG		 = 0x0079	;   
	/**
	 * \if ENGLISH_LANG
	 * toyr enable config(struct SDKDEV_TOUR_ENABLE_CFG)
	 * \else
	 * wifi ap������չ(��Ӧ�ṹ��SDKDEV_VEHICLE_WIFI_AP_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_VICHILE_WIFI_AP_CFG_EX  = 0x007a    ; 
	/**
	 * \if ENGLISH_LANG
	 * wifi ap extern config(struct SDKDEV_VEHICLE_WIFI_AP_CFG_EX)
	 * \else
	 * ����ͨ����ǰ�˱�������Ϣ��չ��(��Ӧ�ṹ��DEV_ENCODER_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_ENCODER_CFG_EX          = 0x007b    ; 

	public static final int SDK_DEV_USER_END_CFG			 = 1000;
	 
	
	// ��չ�������ͣ���ӦCLIENT_StartListenEx�ӿ�
	public static final int SDK_ALARM_ALARM_EX                 = 0x2101;           // �ⲿ����
	public static final int SDK_MOTION_ALARM_EX                = 0x2102;           // ��̬��ⱨ��
	public static final int SDK_VIDEOLOST_ALARM_EX             = 0x2103;           // ��Ƶ��ʧ����
	public static final int SDK_SHELTER_ALARM_EX               = 0x2104;           // ��Ƶ�ڵ�����
	public static final int SDK_SOUND_DETECT_ALARM_EX          = 0x2105;           // ��Ƶ��ⱨ��
	public static final int SDK_DISKFULL_ALARM_EX              = 0x2106;           // Ӳ��������
	public static final int SDK_DISKERROR_ALARM_EX             = 0x2107;           // ��Ӳ�̱���
	public static final int SDK_ENCODER_ALARM_EX               = 0x210A;           // ����������
	public static final int SDK_URGENCY_ALARM_EX               = 0x210B;           // ��������
	public static final int SDK_WIRELESS_ALARM_EX              = 0x210C;           // ���߱���
	public static final int SDK_NEW_SOUND_DETECT_ALARM_EX      = 0x210D;           // ����Ƶ��ⱨ����������Ϣ�Ľṹ���DH_NEW_SOUND_ALARM_STATE��
	public static final int SDK_ALARM_DECODER_ALARM_EX         = 0x210E;           // ��������������
	public static final int SDK_DECODER_DECODE_ABILITY         = 0x210F;           // ��������������������
	public static final int SDK_FDDI_DECODER_ABILITY           = 0x2110;           // ���˱�����״̬����
	public static final int SDK_PANORAMA_SWITCH_ALARM_EX       = 0x2111;           // �л���������
	public static final int SDK_LOSTFOCUS_ALARM_EX             = 0x2112;           // ʧȥ���㱨��
	public static final int SDK_OEMSTATE_EX                    = 0x2113;           // oem��ͣ״̬
	public static final int SDK_DSP_ALARM_EX                   = 0x2114;           // DSP����
	public static final int SDK_ATMPOS_BROKEN_EX               = 0x2115;           // atm��pos���Ͽ������� 0�����ӶϿ� 1����������
	public static final int SDK_RECORD_CHANGED_EX              = 0x2116;           // ¼��״̬�仯����
	public static final int SDK_CONFIG_CHANGED_EX              = 0x2117;           // ���÷����仯����
	public static final int SDK_DEVICE_REBOOT_EX               = 0x2118;           // �豸��������
	public static final int SDK_WINGDING_ALARM_EX              = 0x2119;           // ��Ȧ/���������ϱ���
	public static final int SDK_TRAF_CONGESTION_ALARM_EX       = 0x211A;           // ��ͨ��������(���������쳣ֹͣ�����Ŷ�)
	public static final int SDK_TRAF_EXCEPTION_ALARM_EX        = 0x211B;           // ��ͨ�쳣����(��ͨ��������0���쳣����)
	public static final int SDK_EQUIPMENT_FILL_ALARM_EX        = 0x211C;           // �����豸���ϱ���
	public static final int SDK_ALARM_ARM_DISARM_STATE         = 0x211D;           // ����������״̬
	public static final int SDK_ALARM_ACC_POWEROFF             = 0x211E;           // ACC�ϵ籨��
	public static final int SDK_ALARM_3GFLOW_EXCEED            = 0x211F;           // 3G����������ֵ����(������Ϣ�Ľṹ����ṹ��DHDEV_3GFLOW_EXCEED_STATE_INFO)
	public static final int SDK_ALARM_SPEED_LIMIT              = 0x2120;           // ���ٱ���
	public static final int SDK_ALARM_VEHICLE_INFO_UPLOAD      = 0x2121;           // �����Զ�����Ϣ�ϴ� 
	public static final int SDK_STATIC_ALARM_EX                = 0x2122;           // ��̬��ⱨ��
	public static final int SDK_PTZ_LOCATION_EX                = 0x2123;           // ��̨��λ��Ϣ
	public static final int SDK_ALARM_CARD_RECORD_UPLOAD       = 0x2124;           // ����¼����Ϣ�ϴ�(��Ӧ�ṹ�� ALARM_CARD_RECORD_INFO_UPLOAD)
	public static final int SDK_ALARM_ATM_INFO_UPLOAD          = 0x2125;           // ATM������Ϣ�ϴ�(��Ӧ�ṹ�� ALARM_ATM_INFO_UPLOAD)
	public static final int SDK_ALARM_ENCLOSURE                = 0x2126;           // ����Χ������(��Ӧ�ṹ��ALARM_ENCLOSURE_INFO)
	public static final int SDK_ALARM_SIP_STATE                = 0x2127;           // SIP״̬����(��Ӧ�ṹ��ALARM_SIP_STATE)
	public static final int SDK_ALARM_RAID_STATE               = 0x2128;           // RAID�쳣����(��Ӧ�ṹ��ALARM_RAID_INFO)
	public static final int SDK_ALARM_CROSSING_SPEED_LIMIT     = 0x2129;           // ·�����ٱ���(��Ӧ�ṹ��ALARM_SPEED_LIMIT)
	public static final int SDK_ALARM_OVER_LOADING             = 0x212A;           // ���ر���(��Ӧ�ṹ��ALARM_OVER_LOADING)
	public static final int SDK_ALARM_HARD_BRAKING             = 0x212B;           // ��ɲ������(��Ӧ������ALARM_HARD_BRAKING)
	public static final int SDK_ALARM_SMOKE_SENSOR             = 0x212C;           // �̸б���(��Ӧ�ṹ��ALARM_SMOKE_SENSOR)
	public static final int SDK_ALARM_TRAFFIC_LIGHT_FAULT      = 0x212D;           // ��ͨ�ƹ��ϱ���(��Ӧ�ṹ��ALARM_TRAFFIC_LIGHT_FAULT) 
	public static final int SDK_ALARM_TRAFFIC_FLUX_STAT        = 0x212E;           // ��ͨ����ͳ�Ʊ���(��Ӧ�ṹ��ALARM_TRAFFIC_FLUX_LANE_INFO)
	public static final int SDK_ALARM_CAMERA_MOVE              = 0x212F;           // �������λ�����¼�(��Ӧ�ṹ��ALARM_CAMERA_MOVE_INFO)
	public static final int SDK_ALARM_DETAILEDMOTION           = 0x2130;           // ��ϸ���챨���ϱ���Ϣ(��Ӧ�ṹ��ALARM_DETAILEDMOTION_CHNL_INFO)
	public static final int SDK_ALARM_STORAGE_FAILURE          = 0x2131;           // �洢�쳣����(��Ӧ�ṹ��ALARM_STORAGE_FAILURE����)
	public static final int SDK_ALARM_FRONTDISCONNECT          = 0x2132;           // ǰ��IPC��������(��Ӧ�ṹ��ALARM_FRONTDISCONNET_INFO)
	public static final int SDK_ALARM_ALARM_EX_REMOTE          = 0x2133;           // Զ���ⲿ����(��Ӧ�ṹ�� ALARM_REMOTE_ALARM_INFO)
	public static final int SDK_ALARM_BATTERYLOWPOWER          = 0x2134;           // ��ص����ͱ���(��Ӧ�ṹ��ALARM_BATTERYLOWPOWER_INFO)
	public static final int SDK_ALARM_TEMPERATURE              = 0x2135;           // �¶ȹ��߱���(��Ӧ�ṹ��ALARM_TEMPERATURE_INFO)
	public static final int SDK_ALARM_TIREDDRIVE               = 0x2136;           // ƣ�ͼ�ʻ����(��Ӧ�ṹ��ALARM_TIREDDRIVE_INFO)
	public static final int SDK_ALARM_LOST_RECORD              = 0x2137;           // ��¼���¼�����(��Ӧ�ṹ��ALARM_LOST_RECORD)
	public static final int SDK_ALARM_HIGH_CPU                 = 0x2138;           // CPUռ���ʹ����¼�����(��Ӧ�ṹ��ALARM_HIGH_CPU)
	public static final int SDK_ALARM_LOST_NETPACKET           = 0x2139;           // ���緢�����ݶ����¼�����(��Ӧ�ṹ��ALARM_LOST_NETPACKET)
	public static final int SDK_ALARM_HIGH_MEMORY              = 0x213A;           // �ڴ�ռ���ʹ����¼�����(��Ӧ�ṹ��ALARM_HIGH_MEMORY)
	public static final int SDK_LONG_TIME_NO_OPERATION         = 0x213B;           // WEB�û���ʱ���޲����¼�������չ��Ϣ��
	public static final int SDK_BLACKLIST_SNAP                 = 0x213C;           // ����������ץ���¼�(��Ӧ�ṹ��DH_BLACKLIST_SNAP_INFO)         
	public static final int SDK_ALARM_DISK                     = 0x213E;           // Ӳ�̱���(��ӦALARM_DISK_INFO����)
	public static final int SDK_ALARM_FILE_SYSTEM              = 0x213F;           // �ļ�ϵͳ����(��ӦALARM_FILE_SYSTEM_INFO����)
	public static final int SDK_ALARM_IVS                      = 0x2140;           // ���ܱ����¼�(��Ӧ�ṹ��ALARM_IVS_INFO)
	public static final int SDK_ALARM_GOODS_WEIGHT_UPLOAD      = 0x2141;           // ������Ϣ�ϱ�(��ӦALARM_GOODS_WEIGHT_UPLOAD_INFO)
	public static final int SDK_ALARM_GOODS_WEIGHT             = 0x2142;           // ������Ϣ����(��ӦALARM_GOODS_WEIGHT_INFO)
	public static final int SDK_GPS_STATUS                     = 0x2143;           // GPS��λ��Ϣ(��Ӧ NET_GPS_STATUS_INFO)
	public static final int SDK_ALARM_DISKBURNED_FULL          = 0x2144;           // Ӳ�̿�¼������(��Ӧ ALARM_DISKBURNED_FULL_INFO)
	public static final int SDK_ALARM_STORAGE_LOW_SPACE        = 0x2145;           // �洢���������¼�(��ӦALARM_STORAGE_LOW_SPACE_INFO)
	public static final int SDK_ALARM_DISK_FLUX                = 0x2160;           // Ӳ�������쳣�¼�(��ӦALARM_DISK_FLUX)
	public static final int SDK_ALARM_NET_FLUX                 = 0x2161;           // ���������쳣�¼�(��ӦALARM_NET_FLUX)
	public static final int SDK_ALARM_FAN_SPEED                = 0x2162;           // ����ת���쳣�¼�(��ӦALARM_FAN_SPEED)
	public static final int SDK_ALARM_STORAGE_FAILURE_EX       = 0x2163;           // �洢���󱨾�(��Ӧ�ṹ��ALARM_STORAGE_FAILURE_EX)
	public static final int SDK_ALARM_RECORD_FAILED            = 0x2164;           // ¼���쳣����(��Ӧ�ṹ��ALARM_RECORD_FAILED_INFO)
	public static final int SDK_ALARM_STORAGE_BREAK_DOWN       = 0x2165;           // �洢�����¼�(��Ӧ�ṹ��ALARM_STORAGE_BREAK_DOWN_INFO)
	public static final int SDK_ALARM_VIDEO_ININVALID          = 0x2166;           // ��Ƶ����ͨ��ʧЧ�¼����������õ���Ƶ����ͨ�������������豸����������ALARM_VIDEO_ININVALID_INFO
	public static final int SDK_ALARM_VEHICLE_TURNOVER         = 0x2167;           // �����෭�����¼�(��Ӧ�ṹ��ALARM_VEHICEL_TURNOVER_EVENT_INFO)
	public static final int SDK_ALARM_VEHICLE_COLLISION        = 0x2168;           // ����ײ�������¼�(��Ӧ�ṹ��ALARM_VEHICEL_COLLISION_EVENT_INFO)
	public static final int SDK_ALARM_VEHICLE_CONFIRM          = 0x2169;           // �����ϴ���Ϣ�¼�(��Ӧ�ṹ��ALARM_VEHICEL_CONFIRM_INFO)
	public static final int SDK_ALARM_VEHICLE_LARGE_ANGLE      = 0x2170;           // ��������ͷ��Ƕ�Ťת�¼�(��Ӧ�ṹ��ALARM_VEHICEL_LARGE_ANGLE)
	public static final int SDK_ALARM_TALKING_INVITE           = 0x2171;           // �豸����Է�����Խ��¼�(��Ӧ�ṹ��ALARM_TALKING_INVITE_INFO)
	public static final int SDK_ALARM_ALARM_EX2                = 0x2175;           // ���ر����¼�(��Ӧ�ṹ��ALARM_ALARM_INFO_EX2����DH_ALARM_ALARM_EX����)
	public static final int SDK_ALARM_VIDEO_TIMING             = 0x2176;           // ��Ƶ��ʱ����¼�(��Ӧ�ṹ��ALARM_VIDEO_TIMING)
	public static final int SDK_ALARM_COMM_PORT                = 0x2177;           // �����¼�(��Ӧ�ṹ��ALARM_COMM_PORT_EVENT_INFO)
	public static final int SDK_ALARM_AUDIO_ANOMALY            = 0x2178;           // ��Ƶ�쳣�¼�(��Ӧ�ṹ��ALARM_AUDIO_ANOMALY)
	public static final int SDK_ALARM_AUDIO_MUTATION           = 0x2179;           // ��ǿͻ���¼�(��Ӧ�ṹ��ALARM_AUDIO_MUTATION)
	public static final int SDK_EVENT_TYREINFO                 = 0x2180;           // ��̥��Ϣ�ϱ��¼�(��Ӧ�ṹ��EVENT_TYRE_INFO)
	public static final int SDK_ALARM_POWER_ABNORMAL           = 0x2181;           // �����Դ�쳣����(��Ӧ�ṹ��ALARM_POWER_ABNORMAL_INFO)
	public static final int SDK_EVENT_REGISTER_OFF             = 0x2182;           // �����豸���������¼�(��Ӧ�ṹ�� EVENT_REGISTER_OFF_INFO)
	public static final int SDK_ALARM_NO_DISK                  = 0x2183;           // ��Ӳ�̱���(��Ӧ�ṹ��ALARM_NO_DISK_INFO)
	public static final int SDK_ALARM_FALLING                  = 0x2184;           // �����¼�����(��Ӧ�ṹ��ALARM_FALLING_INFO)
	public static final int SDK_ALARM_PROTECTIVE_CAPSULE       = 0x2185;           // �������¼�(��Ӧ�ṹ��ALARM_PROTECTIVE_CAPSULE_INFO)
	public static final int SDK_ALARM_NO_RESPONSE              = 0x2186;           // ����δӦ�𾯱�(��Ӧ�ṹ��ALARM_NO_RESPONSE_INFO)
	public static final int SDK_ALARM_CONFIG_ENABLE_CHANGE     = 0x2187;           // ����ʹ�ܸı��ϱ��¼�(��Ӧ�ṹ�� ALARM_CONFIG_ENABLE_CHANGE_INFO)

	public static final int SDK_ALARM_STORAGE_NOT_EXIST        = 0x3167;           // �洢�鲻�����¼�(��Ӧ�ṹ��ALARM_STORAGE_NOT_EXIST_INFO)
	public static final int SDK_ALARM_NET_ABORT                = 0x3169;           // ��������¼�(��Ӧ�ṹ��ALARM_NETABORT_INFO)
	public static final int SDK_ALARM_IP_CONFLICT              = 0x3170;           // IP��ͻ�¼�(��Ӧ�ṹ��ALARM_IP_CONFLICT_INFO)
	public static final int SDK_ALARM_MAC_CONFLICT             = 0x3171;           // MAC��ͻ�¼�(��Ӧ�ṹ��ALARM_MAC_CONFLICT_INFO)
	public static final int SDK_ALARM_POWERFAULT               = 0x3172;           // ��Դ�����¼�(��Ӧ�ṹ��ALARM_POWERFAULT_INFO)
	public static final int SDK_ALARM_CHASSISINTRUDED          = 0x3173;           // ��������(����)�����¼�(��Ӧ�ṹ��ALARM_CHASSISINTRUDED_INFO)
	public static final int SDK_ALARM_ALARMEXTENDED            = 0x3174;           // ������չ�����¼�(��Ӧ�ṹ�� ALARM_ALARMEXTENDED_INFO)
	public static final int SDK_ALARM_ARMMODE_CHANGE_EVENT     = 0x3175;           // ������״̬�仯�¼�(��Ӧ�ṹ��ALARM_ARMMODE_CHANGE_INFO)
	public static final int SDK_ALARM_BYPASSMODE_CHANGE_EVENT  = 0x3176;           // ��·״̬�仯�¼�(��Ӧ�ṹ��ALARM_BYPASSMODE_CHANGE_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_NOT_CLOSE     = 0x3177;           // �Ž�δ���¼�(��Ӧ�ṹ��ALARM_ACCESS_CTL_NOT_CLOSE_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_BREAK_IN      = 0x3178;           // �����¼�(��Ӧ�ṹ��ALARM_ACCESS_CTL_BREAK_IN_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_REPEAT_ENTER  = 0x3179;           // ���������¼�(��Ӧ�ṹ��ALARM_ACCESS_CTL_REPEAT_ENTER_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_DURESS        = 0x3180;           // в�ȿ�ˢ���¼�(��Ӧ�ṹ��ALARM_ACCESS_CTL_DURESS_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_EVENT         = 0x3181;           // �Ž��¼�(��Ӧ�ṹ��ALARM_ACCESS_CTL_EVENT_INFO)
	public static final int SDK_URGENCY_ALARM_EX2              = 0x3182;           // ��������EX2(��DH_URGENCY_ALARM_EX������,��Ӧ�ṹ��ALARM_URGENCY_ALARM_EX2, ��Ϊ�����Ľ����¼�, һ�㴦���������ⲿͨѶ�����������
	public static final int SDK_ALARM_INPUT_SOURCE_SIGNAL      = 0x3183;           // ��������Դ�ź��¼�(ֻҪ������ͻ�������¼�, ���۷�����ǰ��ģʽ���޷�����, ��ӦALARM_INPUT_SOURCE_SIGNAL_INFO)
	public static final int SDK_ALARM_ANALOGALARM_EVENT        = 0x3184;           // ģ������������ͨ���¼�(��Ӧ�ṹ��ALARM_ANALOGALARM_EVENT_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_STATUS        = 0x3185;           // �Ž�״̬�¼�(��Ӧ�ṹ��ALARM_ACCESS_CTL_STATUS_INFO)
	public static final int SDK_ALARM_ACCESS_SNAP              = 0x3186;           // �Ž�ץͼ�¼�(��Ӧ�ṹ��ALARM_ACCESS_SNAP_INFO)
	public static final int SDK_ALARM_ALARMCLEAR               = 0x3187;           // �����¼�(��Ӧ�ṹ��ALARM_ALARMCLEAR_INFO)
	public static final int SDK_ALARM_CIDEVENT                 = 0x3188;           // CID�¼�(��Ӧ�ṹ��ALARM_CIDEVENT_INFO)
	public static final int SDK_ALARM_TALKING_HANGUP           = 0x3189;           // �豸�����Ҷ϶Խ��¼�(��Ӧ�ṹ��ALARM_TALKING_HANGUP_INFO)
	public static final int SDK_ALARM_BANKCARDINSERT           = 0x318a;           // ���п��忨�¼�(��Ӧ�ṹ��ALARM_BANKCARDINSERT_INFO)
	public static final int SDK_ALARM_RCEMERGENCY_CALL         = 0x318b;           // �������б����¼�(��Ӧ�ṹ�� ALARM_RCEMERGENCY_CALL_INFO)
	public static final int SDK_ALARM_OPENDOORGROUP            = 0x318c;           // ������Ͽ����¼�(��Ӧ�ṹ��ALARM_OPEN_DOOR_GROUP_INFO)
	public static final int SDK_ALARM_FINGER_PRINT             = 0x318d;           // ��ȡָ���¼�(��Ӧ�ṹ��ALARM_CAPTURE_FINGER_PRINT_INFO)
	public static final int SDK_ALARM_CARD_RECORD              = 0x318e;           // ����¼���¼�(��Ӧ�ṹ�� ALARM_CARD_RECORD_INFO)
	public static final int SDK_ALARM_SUBSYSTEM_STATE_CHANGE   = 0x318f;           // ��ϵͳ״̬�ı��¼�(��Ӧ�ṹ��ALARM_SUBSYSTEM_STATE_CHANGE_INFO)
	public static final int SDK_ALARM_BATTERYPOWER_EVENT       = 0x3190;           // ��ص�����ʱ֪ͨ�¼�(��Ӧ�ṹ��ALARM_BATTERYPOWER_INFO)
	public static final int SDK_ALARM_BELLSTATUS_EVENT         = 0x3191;           // ����״̬�¼�(��Ӧ�ṹ��ALARM_BELLSTATUS_INFO)
	public static final int SDK_ALARM_DEFENCE_STATE_CHANGE_EVENT = 0x3192;         // ����״̬�仯�¼�(��Ӧ�ṹ��ALARM_DEFENCE_STATUS_CHANGE_INFO), 
	                                                           // �������󣬺Ͳ��������仯�¼�����·״̬�仯�¼��е�״̬���岻ͬ��
	                                                           // ��״̬ͨ��CLIENT_QueryDevState()�ӿڵ�DH_DEVSTATE_DEFENCE_STATE�����ȡ


	public static final int SDK_ALARM_TICKET_STATISTIC         = 0x3193;           // ��Ʊͳ����Ϣ�¼�(��Ӧ�ṹ�� ALARM_TICKET_STATISTIC)
	public static final int SDK_ALARM_LOGIN_FAILIUR            = 0x3194;           // ��½ʧ���¼�(��Ӧ�ṹ��ALARM_LOGIN_FAILIUR_INFO)
	public static final int SDK_ALARM_MODULE_LOST              = 0x3195;           // ��չģ������¼�(��Ӧ�ṹ�� ALARM_MODULE_LOST_INFO)
	public static final int SDK_ALARM_PSTN_BREAK_LINE          = 0x3196;           // PSTN�����¼�(��Ӧ�ṹ��ALARM_PSTN_BREAK_LINE_INFO)
	public static final int SDK_ALARM_ANALOG_PULSE             = 0x3197;           // ģ���������¼�(˲ʱ���¼�), �ض�����������ʱ�Ŵ���(��Ӧ�ṹ��ALARM_ANALOGPULSE_INFO)
	public static final int SDK_ALARM_MISSION_CONFIRM          = 0x3198;           // ����ȷ���¼�(��Ӧ�ṹ�� ALARM_MISSION_CONFIRM_INFO)
	public static final int SDK_ALARM_DEVICE_MSG_NOTIFY        = 0x3199;           // �豸��ƽ̨��֪ͨ���¼�(��Ӧ�ṹ�� ALARM_DEVICE_MSG_NOTIFY_INFO)
	public static final int SDK_ALARM_VEHICLE_STANDING_OVER_TIME = 0x319A;         // ͣ����ʱ����(��Ӧ�ṹ�� ALARM_VEHICLE_STANDING_OVER_TIME_INFO)
	public static final int SDK_ALARM_ENCLOSURE_ALARM          = 0x319B;           // ����Χ���¼�(��Ӧ�ṹ�� ALARM_ENCLOSURE_ALARM_INFO)
	public static final int SDK_ALARM_GUARD_DETECT			  = 0x319C;		   // ��ͤ����¼�,���¼���ͤ�е�һ����ʱ�ϱ�start�¼�����ͤ���һ�����뿪ʱ�ϱ�stop �¼�(��Ӧ�ṹ��ALARM_GUARD_DETECT_INFO)
	public static final int SDK_ALARM_GUARD_INFO_UPDATE		  = 0x319D;		   // ��ͤ��Ϣ�����¼���ֻҪ��ͤ����Ա������ϱ�(��Ӧ�ṹ��ALARM_GUARD_UPDATE_INFO)  
	public static final int SDK_ALARM_NODE_ACTIVE              = 0x319e;           // �ڵ㼤���¼�(��Ӧ�ṹ��ALARM_NODE_ACTIVE_INFO)
	public static final int SDK_ALARM_VIDEO_STATIC             = 0x319F;           // ��Ƶ��̬����¼�(��Ӧ�ṹ�� ALARM_VIDEO_STATIC_INFO)
	public static final int SDK_ALARM_REGISTER_REONLINE        = 0x31a0;           // ����ע���豸���µ�½�¼�(��Ӧ�ṹ��ALARM_REGISTER_REONLINE_INFO)
	public static final int SDK_ALARM_ISCSI_STATUS             = 0x31a1;           // ISCSI�澯�¼�(��Ӧ�ṹ�� ALARM_ISCSI_STATUS_INFO)
	public static final int SDK_ALARM_SCADA_DEV_ALARM          = 0x31a2;           // ���ɼ��豸�����¼�(��Ӧ�ṹ�� ALARM_SCADA_DEV_INFO)
	public static final int SDK_ALARM_AUXILIARY_DEV_STATE      = 0x31a3;           // �����豸״̬(��Ӧ�ṹ��ALARM_AUXILIARY_DEV_STATE)
	public static final int SDK_ALARM_PARKING_CARD             = 0x31a4;           // ͣ��ˢ���¼�(��Ӧ�ṹ��ALARM_PARKING_CARD)
	public static final int SDK_ALARM_PROFILE_ALARM_TRANSMIT   = 0x31a5;           // ���������¼�(��Ӧ�ṹ��ALARM_PROFILE_ALARM_TRANSMIT_INFO)
	public static final int SDK_ALARM_VEHICLE_ACC              = 0x31a6;           // ����ACC�����¼�(��Ӧ�ṹ�� ALARM_VEHICLE_ACC_INFO)
	public static final int SDK_ALARM_TRAFFIC_SUSPICIOUSCAR    = 0x31a7;           // ���ɳ����ϱ��¼�(��Ӧ�ṹ�� ALARM_TRAFFIC_SUSPICIOUSCAR_INFO)
	public static final int SDK_ALARM_ACCESS_LOCK_STATUS       = 0x31a8;           // ����״̬�¼�(��Ӧ�ṹ�� ALARM_ACCESS_LOCK_STATUS_INFO)
	public static final int SDK_ALARM_FINACE_SCHEME            = 0x31a9;           // ��ƾ����¼�(��Ӧ�ṹ�� ALARM_FINACE_SCHEME_INFO)
	public static final int SDK_ALARM_HEATIMG_TEMPER           = 0x31aa;           // �ȳ�����µ��¶��쳣�����¼�(��Ӧ�ṹ�� ALARM_HEATIMG_TEMPER_INFO)
	public static final int SDK_ALARM_TALKING_IGNORE_INVITE    = 0x31ab;           // �豸ȡ���Խ������¼�(��Ӧ�ṹ��ALARM_TALKING_IGNORE_INVITE_INFO)
	public static final int SDK_ALARM_BUS_SHARP_TURN           = 0x31ac;           // ������ת�¼�(��Ӧ�ṹ��ALARM_BUS_SHARP_TURN_INFO)
	public static final int SDK_ALARM_BUS_SCRAM                = 0x31ad;           // ������ͣ�¼�(��Ӧ�ṹ��ALARM_BUS_SCRAM_INFO)
	public static final int SDK_ALARM_BUS_SHARP_ACCELERATE     = 0x31ae;           // �����������¼�(��Ӧ�ṹ��ALARM_BUS_SHARP_ACCELERATE_INFO)
	public static final int SDK_ALARM_BUS_SHARP_DECELERATE     = 0x31af;           // �����������¼�(��Ӧ�ṹ��ALARM_BUS_SHARP_DECELERATE_INFO)
	public static final int SDK_ALARM_ACCESS_CARD_OPERATE      = 0x31b0;		   // �Ž������ݲ����¼�(��Ӧ�ṹ��ALARM_ACCESS_CARD_OPERATE_INFO)
	public static final int SDK_ALARM_POLICE_CHECK             = 0x31b1;           // ��Աǩ���¼�(��Ӧ�ṹ��ALARM_POLICE_CHECK_INFO)
	public static final int SDK_ALARM_NET                      = 0x31b2;           // ���籨���¼�(��Ӧ�ṹ�� ALARM_NET_INFO)
	public static final int SDK_ALARM_NEW_FILE                 = 0x31b3;           // ���ļ��¼�(��Ӧ�ṹ��ALARM_NEW_FILE_INFO)
	public static final int SDK_ALARM_FIREWARNING              = 0x31b5;           // �ȳ����Ż���¼� (��Ӧ�ṹ�� ALARM_FIREWARNING_INFO)
	public static final int SDK_ALARM_RECORD_LOSS              = 0x31b6;           // ¼��ʧ�¼�,ָӲ����õ������,������ɾ��ԭ������(��Ӧ�ṹ��ALARM_RECORD_LOSS_INFO)
	public static final int SDK_ALARM_VIDEO_FRAME_LOSS         = 0x31b7;           // ��Ƶ��֡�¼�,�������粻�û����������������Ķ�֡(��Ӧ�ṹ��ALARM_VIDEO_FRAME_LOSS_INFO)
	public static final int SDK_ALARM_RECORD_VOLUME_FAILURE    = 0x31b8;           // �ɱ���¼��Ĵ��̾����쳣,�����¼���쳣(��Ӧ�ṹ��ALARM_RECORD_VOLUME_FAILURE_INFO)
	public static final int SDK_EVENT_SNAP_UPLOAD              = 0x31b9;           // ͼ�ϴ�����¼�(��Ӧ�ṹ��EVENT_SNAP_UPLOAD_INFO)
	public static final int SDK_ALARM_AUDIO_DETECT             = 0x31ba;           // ��Ƶ����¼�(��Ӧ�ṹ�� ALARM_AUDIO_DETECT )
	public static final int SDK_ALARM_UPLOADPIC_FAILCOUNT      = 0x31bb;           // �ϴ�����ʧ�����ݸ�������Ӧ�ṹ��ALARM_UPLOADPIC_FAILCOUNT_INFO��
	public static final int SDK_ALARM_POS_MANAGE               = 0x31bc;           // POS�����¼��¼�(��Ӧ�ṹ�� ALARM_POS_MANAGE_INFO )
	public static final int SDK_ALARM_REMOTE_CTRL_STATUS       = 0x31bd;           // ����ң����״̬�¼�(��Ӧ�ṹ�� ALARM_REMOTE_CTRL_STATUS )
	public static final int SDK_ALARM_PASSENGER_CARD_CHECK     = 0x31be;           // ����, �˿�ˢ���¼�(��Ӧ�ṹ�� ALARM_PASSENGER_CARD_CHECK )
	public static final int SDK_ALARM_SOUND                    = 0x31bf;           // �����¼�(��Ӧ�ṹ�� ALARM_SOUND )
	public static final int SDK_ALARM_LOCK_BREAK               = 0x31c0;           // �����¼�(��Ӧ�ṹ�� ALARM_LOCK_BREAK_INFO )
	public static final int SDK_ALARM_HUMAN_INSIDE             = 0x31c1;           // ���������¼�(��Ӧ�ṹ��ALARM_HUMAN_INSIDE_INFO)
	public static final int SDK_ALARM_HUMAN_TUMBLE_INSIDE      = 0x31c2;           // ��������ˤ���¼�(��Ӧ�ṹ��ALARM_HUMAN_TUMBLE_INSIDE_INFO)
	public static final int SDK_ALARM_DISABLE_LOCKIN           = 0x31c3;           // �������Ű�ť�����¼�(��ӦALARM_DISABLE_LOCKIN_INFO)
	public static final int SDK_ALARM_DISABLE_LOCKOUT          = 0x31c4;           // �������Ű�ť�����¼�(��Ӧ�ṹ��ALARM_DISABLE_LOCKOUT_INFO)
	public static final int SDK_ALARM_UPLOAD_PIC_FAILED        = 0x31c5;           // Υ�������ϴ�ʧ���¼�(��Ӧ�ṹ�� ALARM_UPLOAD_PIC_FAILED_INFO )
	public static final int SDK_ALARM_FLOW_METER               = 0x31c6;           // ˮ��������Ϣ�ϱ�ʱ�䣨��Ӧ�ṹ�� ALARM_FLOW_METER_INFO��
	public static final int SDK_ALARM_WIFI_SEARCH              = 0x31c7;           // ��ȡ����Χ������WIFI�豸�ϱ��¼�(��Ӧ�ṹ�� ALARM_WIFI_SEARCH_INFO)
	public static final int SDK_ALARM_WIRELESSDEV_LOWPOWER     = 0x31C8;           // ��ȡ�����豸�͵����ϱ��¼�(��Ӧ�ṹ��ALARM_WIRELESSDEV_LOWPOWER_INFO)
	public static final int SDK_ALARM_PTZ_DIAGNOSES			       = 0x31c9;		   // ��̨����¼�(��Ӧ�ṹ��ALARM_PTZ_DIAGNOSES_INFO)
	public static final int SDK_ALARM_FLASH_LIGHT_FAULT        = 0x31ca;           // ������(�����)�����¼� (��Ӧ�ṹ�� ALARM_FLASH_LIGHT_FAULT_INFO)
	public static final int SDK_ALARM_STROBOSCOPIC_LIGTHT_FAULT = 0x31cb;          // Ƶ���Ʊ����¼� (��Ӧ�ṹ�� ALARM_STROBOSCOPIC_LIGTHT_FAULT_INFO)
	public static final int SDK_ALARM_HUMAM_NUMBER_STATISTIC   = 0x31cc;           // ������/������ͳ���¼� (��Ӧ�ṹ�� ALARM_HUMAN_NUMBER_STATISTIC_INFO)
	public static final int SDK_ALARM_VIDEOUNFOCUS             = 0x31ce;           // ��Ƶ�齹����(��Ӧ�ṹ�� ALARM_VIDEOUNFOCUS_INFO)
	public static final int SDK_ALARM_BUF_DROP_FRAME           = 0x31cd;           // ¼�񻺳�����֡�¼�(��Ӧ�ṹ�� ALARM_BUF_DROP_FRAME_INFO)
	public static final int SDK_ALARM_DOUBLE_DEV_VERSION_ABNORMAL = 0x31cf;        // ˫���豸�����뱸��֮��汾��Ϣ��һ���쳣�¼� (��Ӧ�ṹ�� ALARM_DOUBLE_DEV_VERSION_ABNORMAL_INFO)
	public static final int SDK_ALARM_DCSSWITCH                 = 0x31d0;           // �����л��¼� ��Ⱥ�л����� (��Ӧ�ṹ�� ALARM_DCSSWITCH_INFO)
	public static final int SDK_ALARM_RADAR_CONNECT_STATE       = 0x31d1;           // �״�״̬�¼�(��Ӧ�ṹ�� ALARM_RADAR_CONNECT_STATE_INFO)
	public static final int SDK_ALARM_DEFENCE_ARMMODE_CHANGE    = 0x31d2;           // ����������״̬�ı��¼�(��Ӧ�ṹ�� ALARM_DEFENCE_ARMMODECHANGE_INFO)
	public static final int SDK_ALARM_SUBSYSTEM_ARMMODE_CHANGE  = 0x31d3;           // ��ϵͳ������״̬�ı��¼�(��Ӧ�ṹ�� ALARM_SUBSYSTEM_ARMMODECHANGE_INFO)
	public static final int SDK_ALARM_RFID_INFO                 = 0x31d4;           // �����߼����Ϣ�¼�(��Ӧ�ṹ�� ALARM_RFID_INFO)
	public static final int SDK_ALARM_SMOKE_DETECTION           = 0x31d5;           // �������¼�(��Ӧ�ṹ�� ALARM_SMOKE_DETECTION)
	public static final int SDK_ALARM_BETWEENRULE_TEMP_DIFF     = 0x31d6;           // �ȳ��������²��쳣����(��Ӧ�ṹ�� ALARM_BETWEENRULE_DIFFTEMPER_INFO)
	public static final int SDK_ALARM_TRAFFIC_PIC_ANALYSE	      = 0x31d7;			// ͼƬ���η����¼�(��Ӧ ALARM_PIC_ANALYSE_INFO)
	public static final int SDK_ALARM_HOTSPOT_WARNING           = 0x31d8;           // �ȳ����ȵ��쳣����(��Ӧ�ṹ�� ALARM_HOTSPOT_WARNING_INFO)
	public static final int SDK_ALARM_COLDSPOT_WARNING          = 0x31d9;           // �ȳ�������쳣����(��Ӧ�ṹ�� ALARM_COLDSPOT_WARNING_INFO)
	public static final int SDK_ALARM_FIREWARNING_INFO			= 0x31da;			// �ȳ�����鱨����Ϣ�ϱ�(��Ӧ�ṹ�� ALARM_FIREWARNING_INFO_DETAIL)
	public static final int SDK_ALARM_FACE_OVERHEATING  	    = 0x31db;			// �ȳ������巢��Ԥ��(��Ӧ�ṹ�� ALARM_FACE_OVERHEATING_INFO)
		
	
	// �¼�����
	public static final int SDK_CONFIG_RESULT_EVENT_EX         = 0x3000;           // �޸����õķ����룻���ؽṹ��DEV_SET_RESULT
	public static final int SDK_REBOOT_EVENT_EX                = 0x3001;           // �豸�����¼������δ�������������ǰ�޸ĵ����ò���������Ч
	public static final int SDK_AUTO_TALK_START_EX             = 0x3002;           // �豸�������뿪ʼ�����Խ�
	public static final int SDK_AUTO_TALK_STOP_EX              = 0x3003;           // �豸����ֹͣ�����Խ�
	public static final int SDK_CONFIG_CHANGE_EX               = 0x3004;           // �豸���÷����ı�
	public static final int SDK_IPSEARCH_EVENT_EX              = 0x3005;           // IP�����¼�, �����ַ�����ʽ����:DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&&DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay &&��
	public static final int SDK_AUTO_RECONNECT_FAILD           = 0x3006;           // �Զ�����ʧ���¼�
	public static final int SDK_REALPLAY_FAILD_EVENT           = 0x3007;           // ����ʧ���¼�,���ؽṹ��DEV_PLAY_RESULT
	public static final int SDK_PLAYBACK_FAILD_EVENT           = 0x3008;           // �ط�ʧ���¼�,���ؽṹ��DEV_PLAY_RESULT   
	public static final int SDK_IVS_TRAFFIC_REALFLOWINFO       = 0x3009;           // ��ͨʵʱ������Ϣ�¼�ALARM_IVS_TRAFFIC_REALFLOW_INFO
	public static final int SDK_DEVICE_ABORT_EVENT             = 0x300a;           // �ͻ��˱��߳�, ��Ӧ�ṹ�� DEV_CLIENT_ABORT_INFO
	public static final int SDK_TALK_FAILD_EVENT               = 0x300b;           // ���������Խ�ʧ��, ��Ӧ�ṹ�� DEV_TALK_RESULT
	
	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * �û�������
	 * \endif
	 */
	public static final int     SDK_NEW_USER_NAME_LENGTH	 = 128;			  
	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * ����
	 * \endif
	 */
	public static final int     SDK_NEW_USER_PSW_LENGTH	 = 128;			  


	/**
	 * \if ENGLISH_LANG
	 * Signal interface name length
	 * \else
	 * �źŽӿ����Ƴ���
	 * \endif
	 */
	public static final int     SDK_MATRIX_INTERFACE_LEN		= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * Matrix sub card max amount
	 * \else
	 * �����ӿ��������
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CARDS			= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * The basic value of the PIP split mode
	 * \else
	 * �ָ�ģʽ���л��Ļ���ֵ
	 * \endif
	 */
	public static final int     SDK_SPLIT_PIP_BASE			= 1000;	  
	/**
	 * \if ENGLISH_LANG
	 * Max split matrix amount
	 * \else
	 * ���ָ�ģʽ��
	 * \endif
	 */
	public static final int     SDK_MAX_SPLIT_MODE_NUM		= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * Matrix max input channel amount
	 * \else
	 * �����������ͨ����
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CHANNEL_IN	= 1500;	  
	/**
	 * \if ENGLISH_LANG
	 * Matrix max output channel amount
	 * \else
	 * ����������ͨ����
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CHANNEL_OUT	= 256;		  
	/**
	 * \if ENGLISH_LANG
	 * Device name length
	 * \else
	 * �豸���Ƴ���
	 * \endif
	 */
	public static final int     SDK_DEVICE_NAME_LEN			= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * Max CPU amount
	 * \else
	 * ���CPU����
	 * \endif
	 */
	public static final int     SDK_MAX_CPU_NUM				= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * Max fan amount
	 * \else
	 * ����������
	 * \endif
	 */
	public static final int     SDK_MAX_FAN_NUM				= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * Max power amount
	 * \else
	 * ����Դ����
	 * \endif
	 */
	public static final int     SDK_MAX_POWER_NUM			= 16;		 
	
	/**
	 * \if ENGLISH_LANG
	 * Max battery amount
	 * \else
	 * ���������
	 * \endif
	 */
	public static final int 		SDK_MAX_BATTERY_NUM		= 16;
	
	/**
	 * \if ENGLISH_LANG
	 * Max temperature sensor amount
	 * \else
	 * ����¶ȴ���������
	 * \endif
	 */
	public static final int     SDK_MAX_TEMPERATURE_NUM		= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * ISCSI Name length
	 * \else
	 * ISCSI���Ƴ���
	 * \endif
	 */
	public static final int     SDK_MAX_ISCSI_NAME_LEN		= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Version info length
	 * \else
	 * �汾��Ϣ����
	 * \endif
	 */
	public static final int     SDK_VERSION_LEN				= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * Storage partition max number
	 * \else
	 * �洢�����������
	 * \endif
	 */
	public static final int     SDK_MAX_STORAGE_PARTITION_NUM = 32;		  
	/**
	 * \if ENGLISH_LANG
	 * Mount length
	 * \else
	 * ���ص㳤��
	 * \endif
	 */
	public static final int     SDK_STORAGE_MOUNT_LEN		= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * File system name length
	 * \else
	 * �ļ�ϵͳ���Ƴ���
	 * \endif
	 */
	public static final int     SDK_STORAGE_FILE_SYSTEM_LEN	= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * RAID max members
	 * \else
	 * RAID��Ա�������
	 * \endif
	 */
	public static final int     SDK_MAX_MEMBER_PER_RAID		= 32;		  
	/**
	 * \if ENGLISH_LANG
	 * Device ID max length
	 * \else
	 * �豸ID��󳤶�
	 * \endif
	 */
	public static final int     SDK_DEV_ID_LEN_EX			= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Max number of block
	 * \else
	 * �����������
	 * \endif
	 */
	public static final int     SDK_MAX_BLOCK_NUM			= 32;		  
	/**
	 * \if ENGLISH_LANG
	 * Max number of split window
	 * \else
	 * ���ָ������
	 * \endif
	 */
	public static final int     SDK_MAX_SPLIT_WINDOW			= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Length of file type
	 * \else
	 * �ļ����ͳ���
	 * \endif
	 */
	public static final int     SDK_FILE_TYPE_LEN			= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * Length of device ID
	 * \else
	 * �豸ID��󳤶�
	 * \endif
	 */
	public static final int     SDK_DEV_ID_LEN				= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Max length of device name  
	 * \else
	 * �豸������󳤶�
	 * \endif
	 */
	public static final int     SDK_DEV_NAME_LEN				= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Schedule the first dimension size, means days
	 * \else
	 * ʱ����һά��С, ��ʾ����
	 * \endif
	 */
	public static final int     SDK_TSCHE_DAY_NUM			= 8;		  
	/**
	 * \if ENGLISH_LANG
	 * Schedule the second dimension size, means time
	 * \else
	 * ʱ���ڶ�ά��С, ��ʾʱ����
	 * \endif
	 */
	public static final int     SDK_TSCHE_SEC_NUM			= 6;		  
	/**
	 * \if ENGLISH_LANG
	 * Event report info including max card number
	 * \else
	 * �¼��ϱ���Ϣ�������Ƭ��
	 * \endif
	 */
	public static final int SDK_EVENT_MAX_CARD_NUM   = 16;      
	/**
	 * \if ENGLISH_LANG
	 * Card name length
	 * \else
	 * ��Ƭ���Ƴ���
	 * \endif
	 */
	public static final int SDK_EVENT_CARD_LEN   	= 36;      

	/**
	 * \if ENGLISH_LANG
	 * Subscription all event
	 * \else
	 * ���������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_ALL                       = 0x00000001 ;    
	/**
	 * \if ENGLISH_LANG
	 * Cross line event
	 * \else
	 * �������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSLINEDETECTION        = 0x00000002 ; 	  
	/**
	 * \if ENGLISH_LANG
	 * Cross region event
	 * \else
	 * �������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSREGIONDETECTION      = 0x00000003 ;    
	/**
	 * \if ENGLISH_LANG
	 * Past event
	 * \else
	 * �����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_PASTEDETECTION            = 0x00000004 ;    
	/**
	 * \if ENGLISH_LANG
	 * Left event
	 * \else
	 * ��Ʒ�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_LEFTDETECTION             = 0x00000005 ;    
	/**
	 * \if ENGLISH_LANG
	 * Stay event
	 * \else
	 * ͣ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_STAYDETECTION             = 0x00000006 ;    
	/**
	 * \if ENGLISH_LANG
	 * Wander event
	 * \else
	 * �ǻ��¼�
	 * \endif
	 */
	public static final int EVENT_IVS_WANDERDETECTION           = 0x00000007 ;    
	/**
	 * \if ENGLISH_LANG
	 * Reservation event
	 * \else
	 * ��Ʒ��ȫ�¼�
	 * \endif
	 */
	public static final int EVENT_IVS_PRESERVATION              = 0x00000008 ;   
	/**
	 * \if ENGLISH_LANG
	 * Move event
	 * \else
	 * �ƶ��¼�
	 * \endif
	 */
	public static final int EVENT_IVS_MOVEDETECTION             = 0x00000009 ;    
	/**
	 * \if ENGLISH_LANG
	 * Tail event
	 * \else
	 * β���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TAILDETECTION             = 0x0000000A ;    
	/**
	 * \if ENGLISH_LANG
	 * Rioter event
	 * \else
	 * �����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_RIOTERDETECTION           = 0x0000000B ;    
	/**
	 * \if ENGLISH_LANG
	 * Fire event
	 * \else
	 * ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_FIREDETECTION             = 0x0000000C ;    
	/**
	 * \if ENGLISH_LANG
	 * Smoke event
	 * \else
	 * �������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_SMOKEDETECTION            = 0x0000000D ;    
	/**
	 * \if ENGLISH_LANG
	 * Fight event
	 * \else
	 * ��Ź�¼�
	 * \endif
	 */
	public static final int EVENT_IVS_FIGHTDETECTION            = 0x0000000E ;    
	/**
	 * \if ENGLISH_LANG
	 * Flow stat event
	 * \else
	 * ����ͳ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_FLOWSTAT                  = 0x0000000F ;    
	/**
	 * \if ENGLISH_LANG
	 * Number stat event
	 * \else
	 * ����ͳ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_NUMBERSTAT                = 0x00000010 ;     
	/**
	 * \if ENGLISH_LANG
	 * Camera cover event
	 * \else
	 * ����ͷ�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_CAMERACOVERDDETECTION     = 0x00000011 ;     
	/**
	 * \if ENGLISH_LANG
	 * Camera move event
	 * \else
	 * ����ͷ�ƶ��¼�
	 * \endif
	 */
	public static final int EVENT_IVS_CAMERAMOVEDDETECTION      = 0x00000012 ;     
	/**
	 * \if ENGLISH_LANG
	 * Video abnormal event
	 * \else
	 * ��Ƶ�쳣�¼�
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEOABNORMALDETECTION    = 0x00000013 ;       
	/**
	 * \if ENGLISH_LANG
	 * Video bad event
	 * \else
	 * ��Ƶ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEOBADDETECTION         = 0x00000014 ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic control event
	 * \else
	 * ��ͨ�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICCONTROL            = 0x00000015 ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic accident event
	 * \else
	 * ��ͨ�¹��¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICACCIDENT           = 0x00000016 ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic junction event
	 * \else
	 * ��ͨ·���¼�----�Ϲ���
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICJUNCTION           = 0x00000017 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic gate event
	 * \else
	 * ��ͨ�����¼�----�Ϲ���
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICGATE               = 0x00000018 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic snapshot
	 * \else
	 * �˽�ͨץ���¼�
	 * \endif
	 */
	public static final int EVENT_TRAFFICSNAPSHOT               = 0x00000019 ;       
	/**
	 * \if ENGLISH_LANG
	 * Face detection
	 * \else
	 * ��������¼� 
	 * \endif
	 */
	public static final int EVENT_IVS_FACEDETECT                = 0x0000001A ;      
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Jam
	 * \else
	 * ��ͨӵ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICJAM                = 0x0000001B ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic-RunRedLight
	 * \else
	 * ��ͨΥ��-������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RUNREDLIGHT       = 0x00000100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Overline
	 * \else
	 * ��ͨΥ��-ѹ�������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERLINE          = 0x00000101 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Retrograde
	 * \else
	 * ��ͨΥ��-�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RETROGRADE        = 0x00000102 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-TurnLeft
	 * \else
	 * ��ͨΥ��-Υ����ת
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TURNLEFT          = 0x00000103 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-TurnRight
	 * \else
	 * ��ͨΥ��-Υ����ת
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TURNRIGHT         = 0x00000104 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Uturn
	 * \else
	 * ��ͨΥ��-Υ�µ�ͷ
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_UTURN             = 0x00000105 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Overspeed
	 * \else
	 * ��ͨΥ��-����
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERSPEED         = 0x00000106 ;      
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Underspeed
	 * \else
	 * ��ͨΥ��-����
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_UNDERSPEED        = 0x00000107 ;      
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Parking
	 * \else
	 * ��ͨΥ��-Υ��ͣ��
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKING           = 0x00000108 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-WrongRoute
	 * \else
	 * ��ͨΥ��-����������ʻ
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_WRONGROUTE        = 0x00000109 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-CrossLane
	 * \else
	 * ��ͨΥ��-Υ�±��
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_CROSSLANE         = 0x0000010A ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-OverYellowLine
	 * \else
	 * ��ͨΥ��-ѹ���� 
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERYELLOWLINE    = 0x0000010B ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-DrivingOnShoulder   
	 * \else
	 * ��ͨΥ��-·����ʻ�¼� 
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_DRIVINGONSHOULDER = 0x0000010C ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-YellowPlateInLane
	 * \else
	 * ��ͨΥ��-���Ƴ�ռ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_YELLOWPLATEINLANE = 0x0000010E ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic offense-Pedestral has higher priority at the  crosswalk
	 * \else
	 * ��ͨΥ��-���������������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PEDESTRAINPRIORITY = 0x0000010F ;   
	/**
	 * \if ENGLISH_LANG
	 * Cross fence 
	 * \else
	 * ��ԽΧ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSFENCEDETECTION       = 0x0000011F ;       
	/**
	 * \if ENGLISH_LANG
	 * ElectroSpark event 
	 * \else
	 * ����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_ELECTROSPARKDETECTION     = 0X00000110 ;         
	/**
	 * \if ENGLISH_LANG
	 * No passing
	 * \else
	 * ��ͨΥ��-��ֹͨ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_NOPASSING         = 0x00000111 ;   
	/**
	 * \if ENGLISH_LANG
	 * Abnormal run
	 * \else
	 * �쳣�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_ABNORMALRUNDETECTION      = 0x00000112 ;       
	/**
	 * \if ENGLISH_LANG
	 * Retrograde
	 * \else
	 * ��Ա�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_RETROGRADEDETECTION       = 0x00000113 ;       
	/**
	 * \if ENGLISH_LANG
	 * In region detection
	 * \else
	 * �����ڼ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_INREGIONDETECTION         = 0x00000114 ;     
	/**
	 * \if ENGLISH_LANG
	 * Taking away things
	 * \else
	 * ��Ʒ�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TAKENAWAYDETECTION        = 0x00000115 ;       
	/**
	 * \if ENGLISH_LANG
	 * Parking
	 * \else
	 * �Ƿ�ͣ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_PARKINGDETECTION          = 0x00000116 ;       
	/**
	 * \if ENGLISH_LANG
	 * Face recognition
	 * \else
	 * ����ʶ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_FACERECOGNITION           = 0x00000117 ;       
	/**
	 * \if ENGLISH_LANG
	 * Manual snap
	 * \else
	 * ��ͨ�ֶ�ץ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_MANUALSNAP        = 0x00000118 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic flow state
	 * \else
	 * ��ͨ����ͳ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_FLOWSTATE         = 0x00000119 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic stay
	 * \else
	 * ��ͨ�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_STAY              = 0x0000011A ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle route
	 * \else
	 * �г�ռ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_VEHICLEINROUTE    = 0x0000011B ;       
	/**
	 * \if ENGLISH_LANG
	 * Motion detect
	 * \else
	 * ��Ƶ�ƶ�����¼�
	 * \endif
	 */
	public static final int EVENT_ALARM_MOTIONDETECT            = 0x0000011C ;   
	/**
	 * \if ENGLISH_LANG
	 * Local alarm
	 * \else
	 * �ⲿ�����¼�
	 * \endif
	 */
	public static final int EVENT_ALARM_LOCALALARM              = 0x0000011D ;       
	/**
	 * \if ENGLISH_LANG
	 * Prisoner rise detect
	 * \else
	 * ���������������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_PRISONERRISEDETECTION     = 0X0000011E ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic tollgate
	 * \else
	 * ��ͨΥ��-�����¼�----�¹���
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TOLLGATE          = 0X00000120 ;   
	/**
	 * \if ENGLISH_LANG
	 * Density detection of persons
	 * \else
	 * ��Ա�ܼ��ȼ��
	 * \endif
	 */
	public static final int EVENT_IVS_DENSITYDETECTION          = 0x00000121 ;     
	/**
	 * \if ENGLISH_LANG
	 * Video diagnosis result
	 * \else
	 * ��Ƶ��Ͻ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEODIAGNOSIS            = 0X00000122 ;   
	/**
	 * \if ENGLISH_LANG
	 * Queue detection
	 * \else
	 * �ŶӼ�ⱨ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_QUEUEDETECTION            = 0x00000123 ;   
	/**
	 * \if ENGLISH_LANG
	 * Take up in bus route
	 * \else
	 * ռ�ù��������¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_VEHICLEINBUSROUTE = 0x00000124 ;   
	/**
	 * \if ENGLISH_LANG
	 * Illegal astern 
	 * \else
	 * Υ�µ����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_BACKING           = 0x00000125 ;       
	/**
	 * \if ENGLISH_LANG
	 * Audio abnormity
	 * \else
	 * �����쳣���
	 * \endif
	 */
	public static final int EVENT_IVS_AUDIO_ABNORMALDETECTION   = 0x00000126 ;       
	/**
	 * \if ENGLISH_LANG
	 * Run yellow light
	 * \else
	 * ��ͨΥ��-���Ƶ��¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RUNYELLOWLIGHT    = 0x00000127 ;   
	/**
	 * \if ENGLISH_LANG
	 * Climb detection 
	 * \else
	 * �ʸ߼���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_CLIMBDETECTION            = 0x00000128 ;       
	/**
	 * \if ENGLISH_LANG
	 * Leave detection
	 * \else
	 * ��ڼ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_LEAVEDETECTION            = 0x00000129 ;       
	/**
	 * \if ENGLISH_LANG
	 * Parking on yellow box
	 * \else
	 * ��������ץ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGONYELLOWBOX = 0x0000012A ;   
	/**
	 * \if ENGLISH_LANG
	 * Parking space parking
	 * \else
	 * ��λ�г��¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING = 0x0000012B ;       
	/**
	 * \if ENGLISH_LANG
	 * Parking space no parking
	 * \else
	 * ��λ�޳��¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING = 0x0000012C ;        
	/**
	 * \if ENGLISH_LANG
	 * Passerby
	 * \else
	 * ��ͨ�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PEDESTRAIN        = 0x0000012D ;       
	/**
	 * \if ENGLISH_LANG
	 * Throw
	 * \else
	 * ��ͨ������Ʒ�¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_THROW             = 0x0000012E ;   
	/**
	 * \if ENGLISH_LANG
	 * Idle
	 * \else
	 * ��ͨ�����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_IDLE              = 0x0000012F ;       
	/**
	 * \if ENGLISH_LANG
	 * Mobile ACC outage alarm event
	 * \else
	 * ����ACC�ϵ籨���¼�
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLEACC              = 0x00000130 ;   
	/**
	 * \if ENGLISH_LANG
	 * Vehicle side turn alarm event
	 * \else
	 * �����෭�����¼�
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_TURNOVER        = 0x00000131 ;   
	/**
	 * \if ENGLISH_LANG
	 * Vehicle collision alarm event
	 * \else
	 * ����ײ�������¼�
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_COLLISION       = 0x00000132 ;   
	/**
	 * \if ENGLISH_LANG
	 * Mobile camera rotate event
	 * \else
	 * ��������ͷ��Ƕ�Ťת�¼�
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_LARGE_ANGLE     = 0x00000133 ;   
	/**
	 * \if ENGLISH_LANG
	 * Spot cross line event
	 * \else
	 * ��λѹ���¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACEOVERLINE = 0x00000134 ;       
	/**
	 * \if ENGLISH_LANG
	 * Multi scene switch event
	 * \else
	 * �ೡ���л��¼�
	 * \endif
	 */
	public static final int EVENT_IVS_MULTISCENESWITCH          = 0x00000135 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Plate limit event
	 * \else
	 * ���޳����¼�
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RESTRICTED_PLATE   =  0X00000136 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Cross stop line event
	 * \else
	 * ѹֹͣ���¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_OVERSTOPLINE          = 0x00000137 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Traffic unfasten seat belt event 
	 * \else
	 * ��ͨδϵ��ȫ���¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_WITHOUT_SAFEBELT      = 0x00000138 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Driver smoking event 
	 * \else
	 * ��ʻԱ�����¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_SMOKING        = 0x00000139 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Driver call event 
	 * \else
	 * ��ʻԱ��绰�¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_CALLING        = 0x0000013A ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Object feature detection event 
	 * \else
	 * ������������¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_OBJECT_DETECTION              = 0x00000141 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Analog alarm channel event(corresponding to DEV_EVENT_ALARM_ANALOGALRM_INFO)
	 * \else
	 * ģ��������ͨ���ı����¼�(��ӦDEV_EVENT_ALARM_ANALOGALRM_INFO)
	 * \endif
	 */
	public static final int EVENT_ALARM_ANALOGALARM               =  0x00000150 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Warning lineexpansion event
	 * \else
	 * ��������չ�¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_CROSSLINEDETECTION_EX			= 0x00000151 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Normal Record
	 * \else
	 * ��ͨ¼��
	 * \endif
	 */
	public static final int  EVENT_ALARM_COMMON                      = 0x00000152 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Video tampering event
	 * \else
	 * ��Ƶ�ڵ��¼�
	 * \endif
	 */
	public static final int  EVENT_ALARM_VIDEOBLIND                  = 0x00000153 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss event
	 * \else
	 * ��Ƶ��ʧ�¼�
	 * \endif
	 */
	public static final int  EVENT_ALARM_VIDEOLOSS                   = 0x00000154 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Event of getting out bed detection
	 * \else
	 * �������´��¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_GETOUTBEDDETECTION			= 0x00000155 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Event of patrol detection
	 * \else
	 * Ѳ�߼���¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_PATROLDETECTION			    = 0x00000156 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Event of on duty detection
	 * \else
	 * վ�ڼ���¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_ONDUTYDETECTION			    = 0x00000157 ;
	
	/**
	 * \if ENGLISH_LANG
	 *  Event of VTO do not answer calling request
	 * \else
	 * �ſڻ�����δ��Ӧ�¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_NOANSWERCALL			        = 0x00000158 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of storage do not exist
	 * \else
	 * �洢�鲻�����¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGENOTEXIST              = 0x00000159 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of storage space low
	 * \else
	 * Ӳ�̿ռ�ͱ����¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGELOWSPACE              = 0x0000015A ;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of storage failure
	 * \else
	 * �洢�����¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGEFAILURE               = 0x0000015B ;
	
	/**
	 * \if ENGLISH_LANG
	 *  Event of profile alarm transmit
	 * \else
	 * ���������¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_PROFILEALARMTRANSMIT         = 0x0000015C ;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of picture info for alarm
	 * \else
	 * ͼƬ��Ϣ�¼�
	 * \endif
	 */
	public static final int EVENT_IVS_PICINFO                       = 0x00000161 ;
	
	/**
	 * \if ENGLISH_LANG
	 * All event start with [TRAFFIC]
	 * EVENT_IVS_TRAFFICCONTROL -> EVENT_TRAFFICSNAPSHOT
	 * EVENT_IVS_TRAFFIC_RUNREDLIGHT -> EVENT_IVS_TRAFFIC_UNDERSPEED
	 * \else
	 * ������traffic��ͷ���¼���Ŀǰָ����
	 * EVENT_IVS_TRAFFICCONTROL -> EVENT_TRAFFICSNAPSHOT
	 * EVENT_IVS_TRAFFIC_RUNREDLIGHT -> EVENT_IVS_TRAFFIC_UNDERSPEED
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_ALL                   = 0x000001FF ; 
	
	/**
	 * \if ENGLISH_LANG
	 * All IVS events 
	 * \else
	 * �������ܷ����¼�
	 * \endif
	 */
	public static final int  EVENT_IVS_VIDEOANALYSE                  = 0x00000200 ;  
	
	public static final int DECODER_OUT_SLOTS_MAX_NUM            = 16;
	public static final int DECODER_IN_SLOTS_MAX_NUM             = 16;
	
	/**
	 * \if ENGLISH_LANG
	 * No error 
	 * \else
	 * û�д���
	 * \endif
	 */
	public static final int NET_NOERROR= 0;			  
	/**
	 * \if ENGLISH_LANG
	 * Unknown error
	 * \else
	 * δ֪����
	 * \endif
	 */
	public static final int NET_ERROR= -1;			  
	/**
	 * \if ENGLISH_LANG
	 * Windows system error
	 * \else
	 * Windowsϵͳ����
	 * \endif
	 */
	public static final int NET_SYSTEM_ERROR= (0x80000000|1);		  
	/**
	 * \if ENGLISH_LANG
	 * Protocol error it may result from network timeout
	 * \else
	 * ������󣬿�������Ϊ���糬ʱ
	 * \endif
	 */
	public static final int NET_NETWORK_ERROR= (0x80000000|2);		  
	/**
	 * \if ENGLISH_LANG
	 * Device protocol does not match 
	 * \else
	 * �豸Э�鲻ƥ��
	 * \endif
	 */
	public static final int NET_DEV_VER_NOMATCH= (0x80000000|3);		  
	/**
	 * \if ENGLISH_LANG
	 * Handle is invalid
	 * \else
	 * �����Ч
	 * \endif
	 */
	public static final int NET_INVALID_HANDLE= (0x80000000|4);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to open channel 
	 * \else
	 * ��ͨ��ʧ��
	 * \endif
	 */
	public static final int NET_OPEN_CHANNEL_ERROR= (0x80000000|5);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to close channel
	 * \else
	 * �ر�ͨ��ʧ��
	 * \endif
	 */
	public static final int NET_CLOSE_CHANNEL_ERROR= (0x80000000|6);		  
	/**
	 * \if ENGLISH_LANG
	 * User parameter is illegal 
	 * \else
	 * �û��������Ϸ�
	 * \endif
	 */
	public static final int NET_ILLEGAL_PARAM= (0x80000000|7);		  
	/**
	 * \if ENGLISH_LANG
	 * SDK initialization error
	 * \else
	 * SDK��ʼ������
	 * \endif
	 */
	public static final int NET_SDK_INIT_ERROR= (0x80000000|8);		  
	/**
	 * \if ENGLISH_LANG
	 * SDK clear error
	 * \else
	 * SDK�������
	 * \endif
	 */
	public static final int NET_SDK_UNINIT_ERROR= (0x80000000|9);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when apply for render resources.
	 * \else
	 * ����render��Դ����
	 * \endif
	 */
	public static final int NET_RENDER_OPEN_ERROR= (0x80000000|10);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when opening the decoder library 
	 * \else
	 * �򿪽�������
	 * \endif
	 */
	public static final int NET_DEC_OPEN_ERROR= (0x80000000|11);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when closing the decoder library
	 * \else
	 * �رս�������
	 * \endif
	 */
	public static final int NET_DEC_CLOSE_ERROR= (0x80000000|12);		  
	/**
	 * \if ENGLISH_LANG
	 * The detected channel number is 0 in multiple-channel preview. 
	 * \else
	 * �໭��Ԥ���м�⵽ͨ����Ϊ0
	 * \endif
	 */
	public static final int NET_MULTIPLAY_NOCHANNEL= (0x80000000|13);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to initialize record library 
	 * \else
	 * ¼�����ʼ��ʧ��
	 * \endif
	 */
	public static final int NET_TALK_INIT_ERROR= (0x80000000|14);		  
	/**
	 * \if ENGLISH_LANG
	 * The record library has not been initialized
	 * \else
	 * ¼����δ����ʼ��
	 * \endif
	 */
	public static final int NET_TALK_NOT_INIT= (0x80000000|15);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when sending out audio data 
	 * \else
	 * ������Ƶ���ݳ���
	 * \endif
	 */
	public static final int	NET_TALK_SENDDATA_ERROR= (0x80000000|16);		  
	/**
	 * \if ENGLISH_LANG
	 * The real-time has been protected.
	 * \else
	 * ʵʱ�����Ѿ����ڱ���״̬
	 * \endif
	 */
	public static final int NET_REAL_ALREADY_SAVING= (0x80000000|17);		  
	/**
	 * \if ENGLISH_LANG
	 * The real-time data has not been save.
	 * \else
	 * δ����ʵʱ����
	 * \endif
	 */
	public static final int NET_NOT_SAVING= (0x80000000|18);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when opening the file.
	 * \else
	 * ���ļ�����
	 * \endif
	 */
	public static final int NET_OPEN_FILE_ERROR= (0x80000000|19);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to enable PTZ to control timer.
	 * \else
	 * ������̨���ƶ�ʱ��ʧ��
	 * \endif
	 */
	public static final int NET_PTZ_SET_TIMER_ERROR= (0x80000000|20);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when verify returned data.
	 * \else
	 * �Է������ݵ�У�����
	 * \endif
	 */
	public static final int NET_RETURN_DATA_ERROR= (0x80000000|21);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no sufficient buffer.
	 * \else
	 * û���㹻�Ļ���
	 * \endif
	 */
	public static final int NET_INSUFFICIENT_BUFFER= (0x80000000|22);		  
	/**
	 * \if ENGLISH_LANG
	 * The current SDK does not support this fucntion.
	 * \else
	 * ��ǰSDKδ֧�ָù���
	 * \endif
	 */
	public static final int NET_NOT_SUPPORTED= (0x80000000|23);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no searched result.
	 * \else
	 * ��ѯ����¼��
	 * \endif
	 */
	public static final int NET_NO_RECORD_FOUND= (0x80000000|24);		  
	/**
	 * \if ENGLISH_LANG
	 * You have no operation right.
	 * \else
	 * �޲���Ȩ��
	 * \endif
	 */
	public static final int NET_NOT_AUTHORIZED= (0x80000000|25);		  
	/**
	 * \if ENGLISH_LANG
	 * Can not operate right now. 
	 * \else
	 * ��ʱ�޷�ִ��
	 * \endif
	 */
	public static final int NET_NOT_NOW= (0x80000000|26);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no audio talk channel.
	 * \else
	 * δ���ֶԽ�ͨ��
	 * \endif
	 */
	public static final int NET_NO_TALK_CHANNEL= (0x80000000|27);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no audio.
	 * \else
	 * δ������Ƶ
	 * \endif
	 */
	public static final int NET_NO_AUDIO= (0x80000000|28);		  
	/**
	 * \if ENGLISH_LANG
	 * The network SDK has not been initialized.
	 * \else
	 * ����SDKδ����ʼ��
	 * \endif
	 */
	public static final int NET_NO_INIT= (0x80000000|29);		  
	/**
	 * \if ENGLISH_LANG
	 * The download completed.
	 * \else
	 * �����ѽ���
	 * \endif
	 */
	public static final int NET_DOWNLOAD_END= (0x80000000|30);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no searched result.
	 * \else
	 * ��ѯ���Ϊ��
	 * \endif
	 */
	public static final int NET_EMPTY_LIST= (0x80000000|31);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get system property setup.
	 * \else
	 * ��ȡϵͳ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SYSATTR= (0x80000000|32);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get SN.
	 * \else
	 * ��ȡ���к�ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SERIAL= (0x80000000|33);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get general property.
	 * \else
	 * ��ȡ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_GENERAL= (0x80000000|34);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get DSP capacity description.
	 * \else
	 * ��ȡDSP��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DSPCAP= (0x80000000|35);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get network channel setup.
	 * \else
	 * ��ȡ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_NETCFG= (0x80000000|36);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get channel name.
	 * \else
	 * ��ȡͨ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_CHANNAME= (0x80000000|37);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get video property.
	 * \else
	 * ��ȡ��Ƶ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEO= (0x80000000|38);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get record setup
	 * \else
	 * ��ȡ¼������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_RECORD= (0x80000000|39);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder protocol name 
	 * \else
	 * ��ȡ������Э������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_PRONAME= (0x80000000|40);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get 232 COM function name.
	 * \else
	 * ��ȡ232���ڹ�������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_FUNCNAME= (0x80000000|41);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder property
	 * \else
	 * ��ȡ����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_485DECODER= (0x80000000|42);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get 232 COM setup
	 * \else
	 * ��ȡ232��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_232COM= (0x80000000|43);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get external alarm input setup
	 * \else
	 * ��ȡ�ⲿ������������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ALARMIN= (0x80000000|44);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get motion detection alarm
	 * \else
	 * ��ȡ��̬��ⱨ��ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ALARMDET= (0x80000000|45);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get device time
	 * \else
	 * ��ȡ�豸ʱ��ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SYSTIME= (0x80000000|46);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get preview parameter
	 * \else
	 * ��ȡԤ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_PREVIEW= (0x80000000|47);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get audio maintenance setup
	 * \else
	 * ��ȡ�Զ�ά������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_AUTOMT= (0x80000000|48);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get video matrix setup
	 * \else
	 * ��ȡ��Ƶ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEOMTRX= (0x80000000|49);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get privacy mask zone setup
	 * \else
	 * ��ȡ�����ڵ�����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_COVER= (0x80000000|50);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get video watermark setup
	 * \else
	 * ��ȡͼ��ˮӡ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WATERMAKE= (0x80000000|51);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify general property
	 * \else
	 * �޸ĳ�������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_GENERAL= (0x80000000|55);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify channel setup
	 * \else
	 * �޸���������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_NETCFG= (0x80000000|56);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify channel name
	 * \else
	 * �޸�ͨ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_CHANNAME= (0x80000000|57);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video channel 
	 * \else
	 * �޸���Ƶ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEO= (0x80000000|58);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify record setup 
	 * \else
	 * ���޸�¼������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_RECORD= (0x80000000|59);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify decoder property 
	 * \else
	 * �޸Ľ���������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_485DECODER= (0x80000000|60);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify 232 COM setup 
	 * \else
	 * �޸�232��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_232COM= (0x80000000|61);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify external input alarm setup
	 * \else
	 * �޸��ⲿ���뱨������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ALARMIN= (0x80000000|62);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify motion detection alarm setup 
	 * \else
	 * �޸Ķ�̬��ⱨ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ALARMDET= (0x80000000|63);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify device time 
	 * \else
	 * �޸��豸ʱ��ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SYSTIME= (0x80000000|64);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify preview parameter
	 * \else
	 * �޸�Ԥ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_PREVIEW= (0x80000000|65);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify auto maintenance setup 
	 * \else
	 * �޸��Զ�ά������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_AUTOMT= (0x80000000|66);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video matrix setup 
	 * \else
	 * �޸���Ƶ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEOMTRX= (0x80000000|67);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify privacy mask zone
	 * \else
	 * �޸������ڵ�����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_COVER= (0x80000000|68);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video watermark setu
	 * \else
	 * �޸�ͼ��ˮӡ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WATERMAKE= (0x80000000|69);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify wireless network information
	 * \else
	 * �޸�����������Ϣʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WLAN= (0x80000000|70);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to select wireless network device
	 * \else
	 * ѡ�����������豸ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WLANDEV= (0x80000000|71);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify the actively registration parameter setup.
	 * \else
	 * �޸�����ע���������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_REGISTER= (0x80000000|72);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify camera property
	 * \else
	 * �޸�����ͷ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_CAMERA= (0x80000000|73);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify IR alarm setup
	 * \else
	 * �޸ĺ��ⱨ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_INFRARED= (0x80000000|74);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify audio alarm setup
	 * \else
	 * �޸���Ƶ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SOUNDALARM= (0x80000000|75);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify storage position setup
	 * \else
	 * �޸Ĵ洢λ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_STORAGE= (0x80000000|76);		  
	/**
	 * \if ENGLISH_LANG
	 * The audio encode port has not been successfully initialized.
	 * \else
	 * ��Ƶ����ӿ�û�гɹ���ʼ��
	 * \endif
	 */
	public static final int NET_AUDIOENCODE_NOTINIT= (0x80000000|77);		  
	/**
	 * \if ENGLISH_LANG
	 * The data are too long.
	 * \else
	 *  ���ݹ���
	 * \endif
	 */
	public static final int NET_DATA_TOOLONGH= (0x80000000|78);		 
	/**
	 * \if ENGLISH_LANG
	 * The device does not support current operation. 
	 * \else
	 * �豸��֧�ָò���
	 * \endif
	 */
	public static final int NET_UNSUPPORTED= (0x80000000|79);		  
	/**
	 * \if ENGLISH_LANG
	 * Device resources is not sufficient.
	 * \else
	 * �豸��Դ����
	 * \endif
	 */
	public static final int NET_DEVICE_BUSY= (0x80000000|80);		  
	/**
	 * \if ENGLISH_LANG
	 * The server has boot up 
	 * \else
	 * �������Ѿ�����
	 * \endif
	 */
	public static final int NET_SERVER_STARTED= (0x80000000|81);		  
	/**
	 * \if ENGLISH_LANG
	 * The server has not fully boot up 
	 * \else
	 * ��������δ�ɹ�����
	 * \endif
	 */
	public static final int NET_SERVER_STOPPED= (0x80000000|82);		  
	/**
	 * \if ENGLISH_LANG
	 * Input serial number is not correct.
	 * \else
	 * �������к�����
	 * \endif
	 */
	public static final int NET_LISTER_INCORRECT_SERIAL= (0x80000000|83);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get HDD information.
	 * \else
	 * ��ȡӲ����Ϣʧ��
	 * \endif
	 */
	public static final int NET_QUERY_DISKINFO_FAILED= (0x80000000|84);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get connect session information.
	 * \else
	 * ��ȡ����Session��Ϣ
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SESSION= (0x80000000|85);		  
	/**
	 * \if ENGLISH_LANG
	 * The password you typed is incorrect. You have exceeded the maximum number of retries.
	 * \else
	 * ����������󳬹����ƴ���
	 * \endif
	 */
	public static final int NET_USER_FLASEPWD_TRYTIME= (0x80000000|86);		  
	/**
	 * \if ENGLISH_LANG
	 * Password is not correct
	 * \else
	 * ���벻��ȷ
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_PASSWORD= (0x80000000|100);	  
	/**
	 * \if ENGLISH_LANG
	 * The account does not exist
	 * \else
	 * �ʻ�������
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_USER= (0x80000000|101);	  
	/**
	 * \if ENGLISH_LANG
	 * Time out for log in returned value.
	 * \else
	 * �ȴ���¼���س�ʱ
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_TIMEOUT= (0x80000000|102);	  
	/**
	 * \if ENGLISH_LANG
	 * The account has logged in 
	 * \else
	 * �ʺ��ѵ�¼
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_RELOGGIN= (0x80000000|103);	  
	/**
	 * \if ENGLISH_LANG
	 * The account has been locked
	 * \else
	 *�ʺ��ѱ�����
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_LOCKED= (0x80000000|104);	  
	/**
	 * \if ENGLISH_LANG
	 * The account bas been in the black list
	 * \else
	 * �ʺ��ѱ���Ϊ������
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_BLACKLIST= (0x80000000|105);	  
	/**
	 * \if ENGLISH_LANG
	 * Resources are not sufficient. System is busy now.
	 * \else
	 * ��Դ���㣬ϵͳæ
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_BUSY= (0x80000000|106);	  
	/**
	 * \if ENGLISH_LANG
	 * Time out. Please check network and try again.
	 * \else
	 * ��¼�豸��ʱ���������粢����
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_CONNECT= (0x80000000|107);	  
	/**
	 * \if ENGLISH_LANG
	 * Network connection failed.
	 * \else
	 * ��������ʧ��
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_NETWORK= (0x80000000|108);	  
	/**
	 * \if ENGLISH_LANG
	 * Successfully logged in the device but can not create video channel. Please check network connection.
	 * \else
	 * ��¼�豸�ɹ������޷�������Ƶͨ������������״��
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_SUBCONNECT= (0x80000000|109);	  
	/**
	 * \if ENGLISH_LANG
	 * Exceed the max connect number
	 * \else
	 * �������������
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_MAXCONNECT= (0x80000000|110);      
	/**
	 * \if ENGLISH_LANG
	 * Protocol 3 support
	 * \else
	 * ֻ֧��3��Э��
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_PROTOCOL3_ONLY= (0x80000000|111);	  
	/**
	 * \if ENGLISH_LANG
	 * There is no USB or USB info error
	 * \else
	 * δ����U�ܻ�U����Ϣ����
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_UKEY_LOST= (0x80000000|112);	  
	/**
	 * \if ENGLISH_LANG
	 * Client-end IP address has no right to login
	 * \else
	 * �ͻ���IP��ַû�е�¼Ȩ��  
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_NO_AUTHORIZED= (0x80000000|113);    
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library open audio.
	 * \else
	 * Render�����Ƶ����
	 * \endif
	 */
	public static final int NET_RENDER_SOUND_ON_ERROR= (0x80000000|120);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library close audio 
	 * \else
	 * Render��ر���Ƶ����
	 * \endif
	 */
	public static final int NET_RENDER_SOUND_OFF_ERROR= (0x80000000|121);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library control volume
	 * \else
	 * ��Render�������������
	 * \endif
	 */
	public static final int NET_RENDER_SET_VOLUME_ERROR= (0x80000000|122);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library set video parameter
	 * \else
	 * Render�����û����������
	 * \endif
	 */
	public static final int NET_RENDER_ADJUST_ERROR= (0x80000000|123);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library pause play
	 * \else
	 * Render����ͣ���ų���
	 * \endif
	 */
	public static final int NET_RENDER_PAUSE_ERROR= (0x80000000|124);	  
	/**
	 * \if ENGLISH_LANG
	 * Render library snapshot error
	 * \else
	 * Render��ץͼ����
	 * \endif
	 */
	public static final int NET_RENDER_SNAP_ERROR= (0x80000000|125);	  
	/**
	 * \if ENGLISH_LANG
	 * Render library stepper error
	 * \else
	 * Render�ⲽ������
	 * \endif
	 */
	public static final int NET_RENDER_STEP_ERROR= (0x80000000|126);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library set frame rate.
	 * \else
	 * Render������֡�ʳ���
	 * \endif
	 */
	public static final int NET_RENDER_FRAMERATE_ERROR= (0x80000000|127);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render lib setting show region
	 * \else
	 * Render��������ʾ�������
	 * \endif
	 */
	public static final int NET_RENDER_DISPLAYREGION_ERROR= (0x80000000|128);  
	/**
	 * \if ENGLISH_LANG
	 * Group name has been existed.
	 * \else
	 * �����Ѵ���
	 * \endif
	 */
	public static final int NET_GROUP_EXIST= (0x80000000|140);	  
	/**
	 * \if ENGLISH_LANG
	 * The group name does not exist. 
	 * \else
	 * ����������
	 * \endif
	 */
	public static final int	NET_GROUP_NOEXIST= (0x80000000|141);	  
	/**
	 * \if ENGLISH_LANG
	 * The group right exceeds the right list!
	 * \else
	 * ���Ȩ�޳���Ȩ���б�Χ
	 * \endif
	 */
	public static final int NET_GROUP_RIGHTOVER= (0x80000000|142);	  
	/**
	 * \if ENGLISH_LANG
	 * The group can not be removed since there is user in it!
	 * \else
	 * �������û�������ɾ��
	 * \endif
	 */
	public static final int NET_GROUP_HAVEUSER= (0x80000000|143);	  
	/**
	 * \if ENGLISH_LANG
	 * The user has used one of the group right. It can not be removed. 
	 * \else
	 * ���ĳ��Ȩ�ޱ��û�ʹ�ã����ܳ���
	 * \endif
	 */
	public static final int NET_GROUP_RIGHTUSE= (0x80000000|144);	  
	/**
	 * \if ENGLISH_LANG
	 * New group name has been existed
	 * \else
	 * ������ͬ���������ظ�
	 * \endif
	 */
	public static final int NET_GROUP_SAMENAME= (0x80000000|145);	  
	/**
	 * \if ENGLISH_LANG
	 * The user name has been existed
	 * \else
	 * �û��Ѵ���
	 * \endif
	 */
	public static final int	NET_USER_EXIST= (0x80000000|146);	  
	/**
	 * \if ENGLISH_LANG
	 * The account does not exist.
	 * \else
	 * �û�������
	 * \endif
	 */
	public static final int NET_USER_NOEXIST= (0x80000000|147);	  
	/**
	 * \if ENGLISH_LANG
	 * User right exceeds the group right. 
	 * \else
	 * �û�Ȩ�޳�����Ȩ��
	 * \endif
	 */
	public static final int NET_USER_RIGHTOVER= (0x80000000|148);	  
	/**
	 * \if ENGLISH_LANG
	 * Reserved account. It does not allow to be modified.
	 * \else
	 * �����ʺţ��������޸�����
	 * \endif
	 */
	public static final int NET_USER_PWD= (0x80000000|149);	  
	/**
	 * \if ENGLISH_LANG
	 * password is not correct
	 * \else
	 * ���벻��ȷ
	 * \endif
	 */
	public static final int NET_USER_FLASEPWD= (0x80000000|150);	  
	/**
	 * \if ENGLISH_LANG
	 * Password is invalid
	 * \else
	 * ���벻ƥ��
	 * \endif
	 */
	public static final int NET_USER_NOMATCHING= (0x80000000|151);	  
	/**
	 * \if ENGLISH_LANG
	 * Account in use
	 * \else
	 *  �˺�����ʹ����
	 * \endif
	 */
	public static final int NET_USER_INUSE= (0x80000000|152);	 
	/**
	 * \if ENGLISH_LANG
	 * Failed to get network card setup.
	 * \else
	 * ��ȡ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ETHERNET= (0x80000000|300);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get wireless network information.
	 * \else
	 * ��ȡ����������Ϣʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WLAN= (0x80000000|301);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get wireless network device.
	 * \else
	 * ��ȡ���������豸ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WLANDEV= (0x80000000|302);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get actively registration parameter.
	 * \else
	 * ��ȡ����ע�����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_REGISTER= (0x80000000|303);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get camera property 
	 * \else
	 * ��ȡ����ͷ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_CAMERA= (0x80000000|304);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get IR alarm setup
	 * \else
	 * ��ȡ���ⱨ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_INFRARED= (0x80000000|305);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get audio alarm setup
	 * \else
	 * ��ȡ��Ƶ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SOUNDALARM= (0x80000000|306);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get storage position 
	 * \else
	 * ��ȡ�洢λ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_STORAGE= (0x80000000|307);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get mail setup.
	 * \else
	 * ��ȡ�ʼ�����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MAIL= (0x80000000|308);	  
	/**
	 * \if ENGLISH_LANG
	 * Can not set right now. 
	 * \else
	 * ��ʱ�޷�����
	 * \endif
	 */
	public static final int NET_CONFIG_DEVBUSY= (0x80000000|309);	  
	/**
	 * \if ENGLISH_LANG
	 * The configuration setup data are illegal.
	 * \else
	 * �������ݲ��Ϸ�
	 * \endif
	 */
	public static final int NET_CONFIG_DATAILLEGAL= (0x80000000|310);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get DST setup
	 * \else
	 * ��ȡ����ʱ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DST= (0x80000000|311);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set DST 
	 * \else
	 * ��������ʱ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_DST= (0x80000000|312);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get video osd setup.
	 * \else
	 * ��ȡ��ƵOSD��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEO_OSD= (0x80000000|313);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set video osd 
	 * \else
	 * ������ƵOSD��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEO_OSD= (0x80000000|314);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get CDMA \ GPRS configuration
	 * \else
	 * ��ȡCDMA��GPRS��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_GPRSCDMA= (0x80000000|315);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set CDMA \ GPRS configuration
	 * \else
	 * ����CDMA��GPRS��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_GPRSCDMA= (0x80000000|316);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get IP Filter configuration
	 * \else
	 * ��ȡIP��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_IPFILTER= (0x80000000|317);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set IP Filter configuration
	 * \else
	 * ����IP��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_IPFILTER= (0x80000000|318);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get Talk Encode configuration
	 * \else
	 * ��ȡ�����Խ���������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_TALKENCODE= (0x80000000|319);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set Talk Encode configuration
	 * \else
	 * ���������Խ���������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_TALKENCODE= (0x80000000|320);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get The length of the video package configuration
	 * \else
	 * ��ȡ¼������������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_RECORDLEN= (0x80000000|321);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set The length of the video package configuration
	 * \else
	 * ����¼������������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_RECORDLEN= (0x80000000|322);      
	/**
	 * \if ENGLISH_LANG
	 * Not support Network hard disk partitionr
	 * \else
	 * ��֧������Ӳ�̷���
	 * \endif
	 */
	public static final int	NET_DONT_SUPPORT_SUBAREA= (0x80000000|323);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get the register server information
	 * \else
	 * ��ȡ�豸������ע���������Ϣʧ��
	 * \endif
	 */
	public static final int	NET_ERROR_GET_AUTOREGSERVER= (0x80000000|324);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to control actively registration
	 * \else
	 * ����ע���ض���ע�����
	 * \endif
	 */
	public static final int	NET_ERROR_CONTROL_AUTOREGISTER= (0x80000000|325);	
	/**
	 * \if ENGLISH_LANG
	 * Failed to disconnect actively registration
	 * \else
	 * �Ͽ�����ע�����������
	 * \endif
	 */
	public static final int	NET_ERROR_DISCONNECT_AUTOREGISTER= (0x80000000|326);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get mms configuration
	 * \else
	 * ��ȡmms����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MMS= (0x80000000|327);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set mms configuration
	 * \else
	 * ����mms����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_MMS= (0x80000000|328);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get SMS configuration
	 * \else
	 * ��ȡ���ż���������������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SMSACTIVATION= (0x80000000|329);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set SMS configuration
	 * \else
	 * ���ö��ż���������������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SMSACTIVATION= (0x80000000|330);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get activation of a wireless connection
	 * \else
	 * ��ȡ���ż���������������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DIALINACTIVATION= (0x80000000|331);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set activation of a wireless connection
	 * \else
	 * ���ò��ż���������������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_DIALINACTIVATION= (0x80000000|332);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get the parameter of video output
	 * \else
	 * ��ѯ��Ƶ�����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEOOUT= (0x80000000|333);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set the configuration of video output
	 * \else
	 * ������Ƶ�����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEOOUT= (0x80000000|334);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get osd overlay enabling
	 * \else
	 * ��ȡosd����ʹ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_OSDENABLE= (0x80000000|335);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set OSD overlay enabling
	 * \else
	 * ����osd����ʹ������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_OSDENABLE= (0x80000000|336);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set digital input configuration of front encoders
	 * \else
	 * ��������ͨ��ǰ�˱����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ENCODERINFO= (0x80000000|337);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get TV adjust configuration
	 * \else
	 * ��ȡTV��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_TVADJUST= (0x80000000|338);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set TV adjust configuration
	 * \else
	 * ����TV��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_TVADJUST= (0x80000000|339);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to request to establish a connection
	 * \else
	 * ����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_CONNECT_FAILED= (0x80000000|340);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to request to upload burn files
	 * \else
	 * �����¼�ļ��ϴ�ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_BURNFILE= (0x80000000|341);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get capture configuration information
	 * \else
	 * ��ȡץ��������Ϣʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SNIFFER_GETCFG= (0x80000000|342);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set capture configuration information
	 * \else
	 * ����ץ��������Ϣʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SNIFFER_SETCFG= (0x80000000|343);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get download restrictions information
	 * \else
	 * ��ѯ����������Ϣʧ��
	 * \endif
	 */
	public static final int NET_ERROR_DOWNLOADRATE_GETCFG= (0x80000000|344);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set download restrictions information
	 * \else
	 * ��������������Ϣʧ��
	 * \endif
	 */
	public static final int NET_ERROR_DOWNLOADRATE_SETCFG= (0x80000000|345);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to query serial port parameters
	 * \else
	 * ��ѯ���ڲ���ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SEARCH_TRANSCOM= (0x80000000|346);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get the preset info
	 * \else
	 * ��ȡԤ�Ƶ���Ϣ����
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_POINT= (0x80000000|347);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set the preset info
	 * \else
	 * ����Ԥ�Ƶ���Ϣ����
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_POINT= (0x80000000|348);	  
	/**
	 * \if ENGLISH_LANG
	 * SDK log out the device abnormally
	 * \else
	 * SDKû�������ǳ��豸
	 * \endif
	 */
	public static final int NET_SDK_LOGOUT_ERROR= (0x80000000|349);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get vehicle configuration
	 * \else
	 * ��ȡ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_VEHICLE_CFG= (0x80000000|350);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set vehicle configuration
	 * \else
	 * ���ó�������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SET_VEHICLE_CFG= (0x80000000|351);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get ATM overlay configuration
	 * \else
	 * ��ȡatm��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_ATM_OVERLAY_CFG= (0x80000000|352);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set ATM overlay configuration
	 * \else
	 * ����atm��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SET_ATM_OVERLAY_CFG= (0x80000000|353);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get ATM overlay ability
	 * \else
	 * ��ȡatm��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_ATM_OVERLAY_ABILITY= (0x80000000|354);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder tour configuration
	 * \else
	 * ��ȡ������������Ѳ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_DECODER_TOUR_CFG= (0x80000000|355);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set decoder tour configuration
	 * \else
	 * ���ý�����������Ѳ����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SET_DECODER_TOUR_CFG= (0x80000000|356);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to control decoder tour
	 * \else
	 * ���ƽ�����������Ѳʧ��
	 * \endif
	 */
	public static final int NET_ERROR_CTRL_DECODER_TOUR= (0x80000000|357);	  
	/**
	 * \if ENGLISH_LANG
	 * Beyond the device supports for the largest number of user groups
	 * \else
	 * �����豸֧������û�����Ŀ
	 * \endif
	 */
	public static final int NET_GROUP_OVERSUPPORTNUM= (0x80000000|358);	  
	/**
	 * \if ENGLISH_LANG
	 * Beyond the device supports for the largest number of users 
	 * \else
	 * �����豸֧������û���Ŀ
	 * \endif
	 */
	public static final int NET_USER_OVERSUPPORTNUM= (0x80000000|359);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get SIP configuration
	 * \else
	 * ��ȡSIP����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_SIP_CFG= (0x80000000|368);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set SIP configuration
	 * \else
	 * ����SIP����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SET_SIP_CFG= (0x80000000|369);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get SIP capability
	 * \else
	 * ��ȡSIP����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_SIP_ABILITY= (0x80000000|370);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get "WIFI ap' configuration 
	 * \else
	 * ��ȡWIFI ap����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_WIFI_AP_CFG= (0x80000000|371);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set "WIFI ap" configuration  
	 * \else
	 * ����WIFI ap����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SET_WIFI_AP_CFG= (0x80000000|372);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get decode policy 
	 * \else
	 * ��ȡ�����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_DECODE_POLICY= (0x80000000|373);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set decode policy 
	 * \else
	 * ���ý����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SET_DECODE_POLICY= (0x80000000|374);	  
	/**
	 * \if ENGLISH_LANG
	 * Refuse talk
	 * \else
	 * �ܾ��Խ�
	 * \endif
	 */
	public static final int NET_ERROR_TALK_REJECT= (0x80000000|375);	  
	/**
	 * \if ENGLISH_LANG
	 * Talk has opened by other client
	 * \else
	 * �Խ��������ͻ��˴�
	 * \endif
	 */
	public static final int NET_ERROR_TALK_OPENED= (0x80000000|376);	  
	/**
	 * \if ENGLISH_LANG
	 * Resource conflict
	 * \else
	 * ��Դ��ͻ
	 * \endif
	 */
	public static final int NET_ERROR_TALK_RESOURCE_CONFLICIT= (0x80000000|377);	  
	/**
	 * \if ENGLISH_LANG
	 * Unsupported encode type
	 * \else
	 * ��֧�ֵ����������ʽ
	 * \endif
	 */
	public static final int NET_ERROR_TALK_UNSUPPORTED_ENCODE= (0x80000000|378);	  
	/**
	 * \if ENGLISH_LANG
	 * No right
	 * \else
	 * ��Ȩ��
	 * \endif
	 */
	public static final int NET_ERROR_TALK_RIGHTLESS= (0x80000000|379);	  
	/**
	 * \if ENGLISH_LANG
	 * Request failed
	 * \else
	 * ����Խ�ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_TALK_FAILED= (0x80000000|380);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get device relative config
	 * \else
	 * ��ȡ�����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_MACHINE_CFG= (0x80000000|381);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set device relative config
	 * \else
	 * ���û����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SET_MACHINE_CFG= (0x80000000|382);	  
	/**
	 * \if ENGLISH_LANG
	 * Get data failed
	 * \else
	 * �豸�޷���ȡ��ǰ��������
	 * \endif
	 */
	public static final int NET_ERROR_GET_DATA_FAILED= (0x80000000|383);	  
	/**
	 * \if ENGLISH_LANG
	 * MAC validate failed
	 * \else
	 * MAC��ַ��֤ʧ�� 
	 * \endif
	 */
	public static final int NET_ERROR_MAC_VALIDATE_FAILED= (0x80000000|384);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get server instance 
	 * \else
	 * ��ȡ������ʵ��ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GET_INSTANCE= (0x80000000|385);      
	/**
	 * \if ENGLISH_LANG
	 * Generated json string is error
	 * \else
	 * ���ɵ�jason�ַ�������
	 * \endif
	 */
	public static final int NET_ERROR_JSON_REQUEST= (0x80000000|386);      
	/**
	 * \if ENGLISH_LANG
	 * The responding json string is error
	 * \else
	 * ��Ӧ��jason�ַ�������
	 * \endif
	 */
	public static final int NET_ERROR_JSON_RESPONSE= (0x80000000|387);      
	/**
	 * \if ENGLISH_LANG
	 * The protocol version is lower than current version
	 * \else
	 * Э��汾���ڵ�ǰʹ�õİ汾
	 * \endif
	 */
	public static final int NET_ERROR_VERSION_HIGHER= (0x80000000|388);      
	/**
	 * \if ENGLISH_LANG
	 * Hotspare disk operation failed. The capacity is low
	 * \else
	 * �ȱ�����ʧ��, ��������
	 * \endif
	 */
	public static final int NET_SPARE_NO_CAPACITY= (0x80000000|389);	  
	/**
	 * \if ENGLISH_LANG
	 * Display source is used by other output
	 * \else
	 * ��ʾԴ���������ռ��
	 * \endif
	 */
	public static final int NET_ERROR_SOURCE_IN_USE= (0x80000000|390);	  
	/**
	 * \if ENGLISH_LANG
	 * Advanced users grab low-level user resource
	 * \else
	 * �߼��û���ռ�ͼ��û���Դ
	 * \endif
	 */
	public static final int NET_ERROR_REAVE= (0x80000000|391);      
	/**
	 * \if ENGLISH_LANG
	 * Net forbid
	 * \else
	 * ��ֹ���� 
	 * \endif
	 */
	public static final int NET_ERROR_NETFORBID= (0x80000000|392);      
	/**
	 * \if ENGLISH_LANG
	 * Get MAC filter configuration error
	 * \else
	 * ��ȡMAC��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MACFILTER= (0x80000000|393);      
	/**
	 * \if ENGLISH_LANG
	 * Set MAC filter configuration error
	 * \else
	 * ����MAC��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_MACFILTER= (0x80000000|394);      
	/**
	 * \if ENGLISH_LANG
	 * Get IP/MAC filter configuration error
	 * \else
	 *  ��ȡIP/MAC��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_IPMACFILTER= (0x80000000|395);     
	/**
	 * \if ENGLISH_LANG
	 * Set IP/MAC filter configuration error
	 * \else
	 * ����IP/MAC��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_IPMACFILTER= (0x80000000|396);      
	/**
	 * \if ENGLISH_LANG
	 * Operation over time 
	 * \else
	 * ��ǰ������ʱ 
	 * \endif
	 */
	public static final int NET_ERROR_OPERATION_OVERTIME= (0x80000000|397);      
	/**
	 * \if ENGLISH_LANG
	 * Senior validation failure
	 * \else
	 * �߼�У��ʧ�� 
	 * \endif
	 */
	public static final int NET_ERROR_SENIOR_VALIDATE_FAILED= (0x80000000|398);      
	/**
	 * \if ENGLISH_LANG
	 * Device ID is not exist
	 * \else
	 * �豸ID������
	 * \endif
	 */
	public static final int NET_ERROR_DEVICE_ID_NOT_EXIST= (0x80000000|399);	  
	/**
	 * \if ENGLISH_LANG
	 * Unsupport operation
	 * \else
	 * ��֧�ֵ�ǰ����
	 * \endif
	 */
	public static final int NET_ERROR_UNSUPPORTED= (0x80000000|400);      
	/**
	 * \if ENGLISH_LANG
	 * Proxy dll load error
	 * \else
	 * ��������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_DLLLOAD= (0x80000000|401);	  
	/**
	 * \if ENGLISH_LANG
	 * Proxy user parameter is not legal
	 * \else
	 * �����û��������Ϸ�
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_ILLEGAL_PARAM= (0x80000000|402);	  
	/**
	 * \if ENGLISH_LANG
	 * Handle invalid
	 * \else
	 * ��������Ч
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_INVALID_HANDLE= (0x80000000|403);	  
	/**
	 * \if ENGLISH_LANG
	 * Login device error
	 * \else
	 * �������ǰ���豸ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_LOGIN_DEVICE_ERROR= (0x80000000|404);	  
	/**
	 * \if ENGLISH_LANG
	 * Start proxy server error
	 * \else
	 * �����������ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_START_SERVER_ERROR= (0x80000000|405);	  
	/**
	 * \if ENGLISH_LANG
	 * Request speak failed
	 * \else
	 * ���󺰻�ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_SPEAK_FAILED= (0x80000000|406);	  
	/**
	 * \if ENGLISH_LANG
	 * Unsupport F6
	 * \else
	 * �豸��֧�ִ�F6�ӿڵ���
	 * \endif
	 */
	public static final int NET_ERROR_NOT_SUPPORT_F6= (0x80000000|407);      
	/**
	 * \if ENGLISH_LANG
	 * Disk not ready
	 * \else
	 * ����δ����
	 * \endif
	 */
	public static final int NET_ERROR_CD_UNREADY= (0x80000000|408);	  
	/**
	 * \if ENGLISH_LANG
	 * Directory inexists
	 * \else
	 * Ŀ¼������
	 * \endif
	 */
	public static final int NET_ERROR_DIR_NOT_EXIST= (0x80000000|409);	  
	/**
	 * \if ENGLISH_LANG
	 * Device does not support split mode
	 * \else
	 * �豸��֧�ֵķָ�ģʽ
	 * \endif
	 */
	public static final int NET_ERROR_UNSUPPORTED_SPLIT_MODE= (0x80000000|410);	  
	/**
	 * \if ENGLISH_LANG
	 * Open window parameter invalid
	 * \else
	 * �����������Ϸ�
	 * \endif
	 */
	public static final int NET_ERROR_OPEN_WND_PARAM= (0x80000000|411);	  
	/**
	 * \if ENGLISH_LANG
	 * Open window quantity over limit
	 * \else
	 * ����������������
	 * \endif
	 */
	public static final int NET_ERROR_LIMITED_WND_COUNT= (0x80000000|412);	  
	/**
	 * \if ENGLISH_LANG
	 * Request command and current mode not matched
	 * \else
	 * ���������뵱ǰģʽ��ƥ��
	 * \endif
	 */
	public static final int NET_ERROR_UNMATCHED_REQUEST= (0x80000000|413);
	
	/**
	 * \if ENGLISH_LANG
	 * Render base enable HD image internal adjustment strategy error
	 * \else
	 * Render�����ø���ͼ���ڲ��������Գ���
	 * \endif
	 */
	public static final int NET_RENDER_ENABLELARGEPICADJUSTMENT_ERROR = (0x80000000|414);
	
	/**
	 * \if ENGLISH_LANG
	 * Device fasiled to upgrade
	 * \else
	 * �豸����ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_UPGRADE_FAILED                = (0x80000000|415);
	
	/**
	 * \if ENGLISH_LANG
	 * Target device not found
	 * \else
	 * �Ҳ���Ŀ���豸
	 * \endif
	 */
	public static final int NET_ERROR_NO_TARGET_DEVICE              = (0x80000000|416);
	
	/**
	 * \if ENGLISH_LANG
	 * Target device not found
	 * \else
	 * �Ҳ���Ŀ���豸
	 * \endif
	 */
	public static final int NET_ERROR_NO_VERIFY_DEVICE              = (0x80000000|417);
	
	/**
	 * \if ENGLISH_LANG
	 * No cascading right
	 * \else
	 * �޼���Ȩ��
	 * \endif
	 */
	public static final int NET_ERROR_CASCADE_RIGHTLESS             = (0x80000000|418);
	
	/**
	 * \if ENGLISH_LANG
	 * Low priority
	 * \else
	 * �����ȼ�
	 * \endif
	 */
	public static final int NET_ERROR_LOW_PRIORITY                  = (0x80000000|419);
	
	/**
	 * \if ENGLISH_LANG
	 * Remote device request time out
	 * \else
	 * Զ���豸����ʱ
	 * \endif
	 */
	public static final int NET_ERROR_REMOTE_REQUEST_TIMEOUT        = (0x80000000|420);
	
	/**
	 * \if ENGLISH_LANG
	 * Input source over max channel limit
	 * \else
	 * ����Դ�������·������
	 * \endif
	 */
	public static final int NET_ERROR_LIMITED_INPUT_SOURCE          = (0x80000000|421);
	
	/**
	 * \if ENGLISH_LANG
	 * Failed to access folder
	 * \else
	 * �����ļ�ʧ��
	 * \endif
	 */
	public static final int NET_ERROR_VISITE_FILE                   = (0x80000000|510);
	
	/**
	 * \if ENGLISH_LANG
	 * Device is busy
	 * \else
	 * �豸æ
	 * \endif
	 */
	public static final int NET_ERROR_DEVICE_STATUS_BUSY            = (0x80000000|511);
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �޸�������Ȩ��
	 * \endif
	 */
	public static final int NET_USER_PWD_NOT_AUTHORIZED             = (0x80000000|512);
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ����ǿ�Ȳ���
	 * \endif
	 */
	public static final int NET_USER_PWD_NOT_STRONG                 = (0x80000000|513);
	
	/**
	 * \if ENGLISH_LANG
	 * the number of tour combination
	 * \else
	 * ��Ѳ��ϸ���
	 * \endif
	 */
	public static final int  DEC_COMBIN_NUM 	= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * length of name 
	 * \else
	 * ���Ƴ���
	 * \endif
	 */
	public static final int  NAME_MAX_LEN  = 16;
	

	public static final int MAX_ALARM_DECODER_NUM = 16;
	
	public static final int SDK_MAX_RAID_NUM = 16;
	
	public static final int SDK_MAX_USER_DEFINE_INFO	= 1024;
	
	public static final int ALARM_MAX_NAME = 64;
	
	// defined in c++ configsdk.h
	public static final int  MAX_CHANNEL_COUNT=16;
	/**
	 * \if ENGLISH_LANG
	 * Max channel number 256
	 * \else
	 * ���ͨ����256
	 * \endif
	 */
	public static final int  MAX_VIDEO_CHANNEL_NUM=256;					  
	/**
	 * \if ENGLISH_LANG
	 * Max channel name length
	 * \else
	 * ���ͨ�����Ƴ���
	 * \endif
	 */
	public static final int  MAX_CHANNELNAME_LEN=64;					  
	/**
	 * \if ENGLISH_LANG
	 * Max bit stream quantity
	 * \else
	 * �����������
	 * \endif
	 */
	public static final int  MAX_VIDEOSTREAM_NUM=3;					  
	/**
	 * \if ENGLISH_LANG
	 * Max masked area quantity
	 * \else
	 * ����ڵ��������
	 * \endif
	 */
	public static final int  MAX_VIDEO_COVER_NUM=16;					  
	/**
	 * \if ENGLISH_LANG
	 * Day in a week
	 * \else
	 * һ�ܵ�����
	 * \endif
	 */
	public static final int  WEEK_DAY_NUM=7;					  
	/**
	 * \if ENGLISH_LANG
	 * Record period quantity
	 * \else
	 * ¼��ʱ��θ���
	 * \endif
	 */
	public static final int  MAX_REC_TSECT=6;					  
	/**
	 * \if ENGLISH_LANG
	 * Record time extension quantity
	 * \else
	 * ¼��ʱ�����չ����
	 * \endif
	 */
	public static final int  MAX_REC_TSECT_EX= 10;					  
	/**
	 * \if ENGLISH_LANG
	 * Number watermark data max langth
	 * \else
	 * ����ˮӡ������󳤶�
	 * \endif
	 */
	public static final int  MAX_WATERMARK_LEN= 4096;				  
	/**
	 * \if ENGLISH_LANG
	 * Motion detect rows
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public static final int  MAX_MOTION_ROW= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Motion detect columns
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public static final int  MAX_MOTION_COL= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max supported resolution quantity
	 * \else
	 * ���֧�ֵķֱ��ʸ���
	 * \endif
	 */
	public static final int  MAX_IMAGESIZE_NUM= 256;					  
	/**
	 * \if ENGLISH_LANG
	 * Max supported frame quantity
	 * \else
	 * ���֧�ֵ�֡�ʸ���
	 * \endif
	 */
	public static final int  MAX_FPS_NUM= 1024;				  
	/**
	 * \if ENGLISH_LANG
	 * Max supported quality quantity
	 * \else
	 * ���֧�ֵĻ��ʸ���
	 * \endif
	 */
	public static final int  MAX_QUALITY_NUM= 32;		
	
	public static final int  MAX_QUALITY_REGION_NUM = 8;
	/**
	 * \if ENGLISH_LANG
	 * Max address length
	 * \else
	 * ���ĵ�ַ����
	 * \endif
	 */
	public static final int  MAX_ADDRESS_LEN= 256;					  
	/**
	 * \if ENGLISH_LANG
	 * Max username length
	 * \else
	 * ����û�������
	 * \endif
	 */
	public static final int  MAX_USERNAME_LEN= 64;					  
	/**
	 * \if ENGLISH_LANG
	 * Max password length
	 * \else
	 * ������볤��
	 * \endif
	 */
	public static final int  MAX_PASSWORD_LEN= 64;					  
	/**
	 * \if ENGLISH_LANG
	 * Folder name string length
	 * \else
	 * �ļ��������ַ�������
	 * \endif
	 */
	public static final int  MAX_DIRECTORY_LEN= 256;					  
	/**
	 * \if ENGLISH_LANG
	 * Net storage period quantity
	 * \else
	 * ����洢ʱ��θ���
	 * \endif
	 */
	public static final int  MAX_NAS_TIME_SECTION= 2;					  
	/**
	 * \if ENGLISH_LANG
	 * General name string length
	 * \else
	 * ͨ�������ַ�������
	 * \endif
	 */
	public static final int  MAX_NAME_LEN= 128;					  
	/**
	 * \if ENGLISH_LANG
	 * Decoder protocol list limit
	 * \else
	 * ������Э���б��������
	 * \endif
	 */
	public static final int  MAX_DECPRO_LIST_SIZE= 100;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported scene type limit
	 * \else
	 * ��Ƶ�����豸֧�ֵĳ��������б��������
	 * \endif
	 */
	public static final int  MAX_SCENE_LIST_SIZE= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported detection object type list limit
	 * \else
	 * ��Ƶ�����豸֧�ֵļ�����������б��������
	 * \endif
	 */
	public static final int  MAX_OBJECT_LIST_SIZE= 16;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported rule list quantity limit
	 * \else
	 * ��Ƶ�����豸֧�ֵĹ����б��������
	 * \endif
	 */
	public static final int  MAX_RULE_LIST_SIZE= 128;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device max detection module number
	 * \else
	 * ��Ƶ�����豸�����ģ�����
	 * \endif
	 */
	public static final int  MAX_ANALYSE_MODULE_NUM= 16;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device max rule number
	 * \else
	 *  ��Ƶ�����豸���������
	 * \endif
	 */
	public static final int  MAX_ANALYSE_RULE_NUM= 32;					 
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device area top limit
	 * \else
	 * ��Ƶ�����豸���򶥵��������
	 * \endif
	 */
	public static final int  MAX_POLYGON_NUM= 20;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device broken line top limit
	 * \else
	 * ��Ƶ�����豸���߶����������
	 * \endif
	 */
	public static final int  MAX_POLYLINE_NUM= 20;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device vehicle size quantity limit
	 * \else
	 * ��Ƶ�����豸������С��������
	 * \endif
	 */
	public static final int  MAX_VEHICLE_SIZE_LIST= 4;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device vehicle type quantity limit
	 * \else
	 * ��Ƶ�����豸�������͸�������
	 * \endif
	 */
	public static final int  MAX_VEHICLE_TYPE_LIST= 4;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device plate type quantity limit
	 * \else
	 * ��Ƶ�����豸�������͸�������
	 * \endif
	 */
	public static final int  MAX_PLATE_TYPE_LIST= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device each channel corresponding lane limit
	 * \else
	 * ��Ƶ�����豸ÿ��ͨ����Ӧ����������
	 * \endif
	 */
	public static final int  MAX_LANE_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device each channel corresponding rule limit
	 * \else
	 * ��Ƶ�����豸ÿ��ͨ����Ӧ�ı��������
	 * \endif
	 */
	public static final int  MAX_STAFF_NUM= 20;                    
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device mark area limit
	 * \else
	 * ��Ƶ�����豸�궨���������
	 * \endif
	 */
	public static final int  MAX_CALIBRATEAREA_NUM= 20;					  
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis detection area need to exclude area quantity limit
	 * \else
	 * ���ܷ��������������Ҫ�ų��������������
	 * \endif
	 */
	public static final int  MAX_EXCLUDEREGION_NUM= 10;                    
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis calibration frame limit
	 * \else
	 *  ���ܷ���У׼���������
	 * \endif
	 */
	public static final int  MAX_CALIBRATEBOX_NUM= 10;                   
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis special detection area limit
	 * \else
	 * ���ܷ�����������������
	 * \endif
	 */
	public static final int  MAX_SPECIALDETECT_NUM= 10;                    
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported face recognition type list limit
	 * \else
	 * ��Ƶ�����豸֧�ֵ�������������б��������
	 * \endif
	 */
	public static final int  MAX_HUMANFACE_LIST_SIZE= 8;					  
	/**
	 * \if ENGLISH_LANG
	 * Server type limit
	 * \else
	 * ������������
	 * \endif
	 */
	public static final int  MAX_SEVER_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Server name string size
	 * \else
	 * ���������ַ�����С
	 * \endif
	 */
	public static final int  MAX_SERVER_NAME_LEN= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Power quantity limit
	 * \else
	 * ��Դ��������
	 * \endif
	 */
	public static final int  MAX_POWER_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Fan quantity limit
	 * \else
	 * ���ȸ�������
	 * \endif
	 */
	public static final int  MAX_FUN_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * cpu quantity limit
	 * \else
	 * cpu��������
	 * \endif
	 */
	public static final int  MAX_CPU_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * HDD limit
	 * \else
	 * Ӳ������
	 * \endif
	 */
	public static final int  MAX_HARDDISK_NUM= 32;                    
	/**
	 * \if ENGLISH_LANG
	 * Max storage cabinet limit
	 * \else
	 * ���洢������
	 * \endif
	 */
	public static final int  MAX_TANK_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Max channel limit
	 * \else
	 * ���ͨ��������
	 * \endif
	 */
	public static final int  MAX_CHAN_NUM= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * Max disk array limit
	 * \else
	 * ��������������
	 * \endif
	 */
	public static final int  MAX_RAID_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Max device limit
	 * \else
	 * ����豸����
	 * \endif
	 */
	public static final int  MAX_DEV_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Max storage pool limit
	 * \else
	 * ���洢������
	 * \endif
	 */
	public static final int  MAX_STORAGEPOOL_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Max storage position limit
	 * \else
	 * ���洢λ������
	 * \endif
	 */
	public static final int  MAX_STRORAGEPOS_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Front device limit
	 * \else
	 * ǰ���豸����
	 * \endif
	 */
	public static final int	 MAX_VIDEODEV_NUM= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * Max remote device name length
	 * \else
	 * ���Զ���豸���ֳ���
	 * \endif
	 */
	public static final int  MAX_REMOTEDEVICENAME_LEN= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max remote device quantity
	 * \else
	 * ���Զ���豸����
	 * \endif
	 */
	public static final int	 MAX_REMOTE_DEV_NUM= 64;                   
	/**
	 * \if ENGLISH_LANG
	 * Plate string suggested quantity limit
	 * \else
	 * �����ַ���ʾ��������
	 * \endif
	 */
	public static final int  MAX_PLATEHINT_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic light quantity limit
	 * \else
	 * ��ͨ�Ƹ�������
	 * \endif
	 */
	public static final int  MAX_LIGHT_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic light group limit
	 * \else
	 * ��ͨ�����������
	 * \endif
	 */
	public static final int  MAX_LIGHTGROUP_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic light type limit
	 * \else
	 * ��ͨ����������
	 * \endif
	 */
	public static final int  MAX_LIGHT_TYPE= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic light direction limit
	 * \else
	 * ��ͨ��ָʾ����������
	 * \endif
	 */
	public static final int  MAX_LIGHT_DIRECTION= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic intersection rule trigger mode limit
	 * \else
	 * ��ͨ·�ڹ��򴥷�ģʽ����
	 * \endif
	 */
	public static final int  MAX_TRIGGERMODE_NUM= 32;                    
	/**
	 * \if ENGLISH_LANG
	 * ITC violation code length limit
	 * \else
	 * ���ܽ�ͨΥ�´��볤������
	 * \endif
	 */
	public static final int  MAX_VIOLATIONCODE= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * ITC vehicle detector config limit
	 * \else
	 * ���ܽ�ͨ��������������
	 * \endif
	 */
	public static final int  MAX_DETECTOR= 6;                     
	/**
	 * \if ENGLISH_LANG
	 * ITC vehicle detector coil config limit
	 * \else
	 * ���ܽ�ͨ��������Ȧ��������
	 * \endif
	 */
	public static final int  MAX_COILCONFIG= 3;                     
	/**
	 * \if ENGLISH_LANG
	 * TrafficSnapshot ITC device address
	 * \else
	 * TrafficSnapshot���ܽ�ͨ�豸��ַ
	 * \endif
	 */
	public static final int  MAX_DEVICE_ADDRESS= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * DepartmentITC device organization
	 * \else
	 * Department���ܽ�ͨ�豸������λ
	 * \endif
	 */
	public static final int  MAX_DEPARTMENT= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * Road no. has 32 characters of number and letter. 
	 * \else
	 * ��·���	��32�����ֺ���ĸ����
	 * \endif
	 */
	public static final int  MAX_ROADWAYNO= 128;                   
	/**
	 * \if ENGLISH_LANG
	 * ITC violation code length limit
	 * \else
	 * ���ܽ�ͨΥ�´��볤������
	 * \endif
	 */
	public static final int  MAX_VIOLATIONCODE_DESCRIPT= 64;              
	/**
	 * \if ENGLISH_LANG
	 * Direction string length
	 * \else
	 *  ��ʻ�����ַ�������
	 * \endif
	 */
	public static final int  MAX_DRIVINGDIRECTION= 256;            
	/**
	 * \if ENGLISH_LANG
	 * Max alive user info
	 * \else
	 * ����û���Ϣ��
	 * \endif
	 */
	public static final int  MAX_ACTIVEUSER_NUM= 64;              
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device area top quantity limit
	 * \else
	 * ��Ƶ�����豸���򶥵��������
	 * \endif
	 */
	public static final int  MAX_POLYGON_NUM10=10;				  
	/**
	 * \if ENGLISH_LANG
	 * Video diagnosis type quantity limit
	 * \else
	 * ��Ƶ������͸�������
	 * \endif
	 */
	public static final int  MAX_VIDEODIAGNOSIS_DETECT_TYPE= 11;          
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported rule type list quantity limit
	 * \else
	 * ��Ƶ�����豸֧�ֵĹ���Ķ��������б��������
	 * \endif
	 */
	public static final int  MAX_ACTION_LIST_SIZE=16;					  
	/**
	 * \if ENGLISH_LANG
	 * Storage group buffer limit
	 * \else
	 * �洢�����ƻ���������
	 * \endif
	 */
	public static final int  MAX_STORAGEGROUPNAME_LEN= 32;                   
	/**
	 * \if ENGLISH_LANG
	 * Mark area type limit
	 * \else
	 * �궨������������
	 * \endif
	 */
	public static final int  MAX_CALIBRATEAREA_TYPE_NUM= 4;                  
	/**
	 * \if ENGLISH_LANG
	 * Protocol name length
	 * \else
	 * Э�����Ƴ���
	 * \endif
	 */
	public static final int  MAX_PROTOCOL_NAME_LEN= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max serial quantity
	 * \else
	 * ��󴮿�����
	 * \endif
	 */
	public static final int	 MAX_COMM_NUM= 16;					  
	/**
	 * \if ENGLISH_LANG
	 * DNS max quantity
	 * \else
	 * DNS�������
	 * \endif
	 */
	public static final int  MAX_DNS_SERVER_NUM= 2;					  
	/**
	 * \if ENGLISH_LANG
	 * Max network quantity
	 * \else
	 * �����������
	 * \endif
	 */
	public static final int  MAX_NETWORK_INTERFACE_NUM= 32;				  
	/**
	 * \if ENGLISH_LANG
	 * NVS max quantity
	 * \else
	 * ����洢�������������
	 * \endif
	 */
	public static final int	 MAX_NAS_NUM= 16;				
	/**
	 * \if ENGLISH_LANG
	 * Record storage mapping max quantity
	 * \else
	 * ¼��洢��ӳ���������
	 * \endif
	 */
	public static final int  MAX_STORAGEPOINT_NUM= 32;                
	/**
	 * \if ENGLISH_LANG
	 * Intelligent tracking scene max quantity
	 * \else
	 * ���ܸ��ٳ����������
	 * \endif
	 */
	public static final int  MAX_TRACKSCENE_NUM= 10;                
	/**
	 * \if ENGLISH_LANG
	 * Traffic device status max quantity
	 * \else
	 * ��ͨ�豸״̬������
	 * \endif
	 */
	public static final int  MAX_STATUS_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Server supported max services
	 * \else
	 * ������֧�ֵ���������
	 * \endif
	 */
	public static final int  MAX_SERVICE_NUM= 128;                   
	/**
	 * \if ENGLISH_LANG
	 * Database keyword max value
	 * \else
	 * ���ݿ�ؼ������ֵ
	 * \endif
	 */
	public static final int  MAX_DBKEY_NUM= 64;                    
	/**
	 * \if ENGLISH_LANG
	 * Overlay to JPEG summary info max length
	 * \else
	 * ���ӵ�JPEGͼƬ��ժҪ��Ϣ��󳤶�
	 * \endif
	 */
	public static final int  MAX_SUMMARY_LEN= 1024;                  
	/**
	 * \if ENGLISH_LANG
	 * Motion detection supported video window value
	 * \else
	 * ����֧�ֵ���Ƶ����ֵ
	 * \endif
	 */
	public static final int  MAX_MOTION_WINDOW= 10;                    
	/**
	 * \if ENGLISH_LANG
	 * osd overlay content max length
	 * \else
	 * osd����������󳤶�
	 * \endif
	 */
	public static final int  MAX_OSD_SUMMARY_LEN= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * osd overlay title max length
	 * \else
	 * osd���ӱ�����󳤶�
	 * \endif
	 */
	public static final int  MAX_OSD_TITLE_LEN= 128;                   
	/**
	 * \if ENGLISH_LANG
	 * Custom judicial case max quantity
	 * \else
	 * �Զ���˾������������
	 * \endif
	 */
	public static final int  MAX_CUSTOMCASE_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Master/slave tracking max global config number
	 * \else
	 * ����ʽ���������ȫ��������
	 * \endif
	 */
	public static final int  MAX_GLOBAL_MSTERSLAVE_NUM= 64;               
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported detection object property type list quantity limit
	 * \else
	 * ��Ƶ�����豸֧�ֵļ���������������б��������
	 * \endif
	 */
	public static final int  MAX_OBJECT_ATTRIBUTES_SIZE= 16;				  
	/**
	 * \if ENGLISH_LANG
	 * Device model length
	 * \else
	 * �豸�ͺų���
	 * \endif
	 */
	public static final int  MAX_MODEL_LEN= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max writing device quantity
	 * \else
	 * ����¼�豸����
	 * \endif
	 */
	public static final int  MAX_BURNING_DEV_NUM= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max net type quantity
	 * \else
	 * ����������͸���
	 * \endif
	 */
	public static final int  MAX_NET_TYPE_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Net type string length 
	 * \else
	 * ���������ַ�������
	 * \endif
	 */
	public static final int  MAX_NET_TYPE_LEN = 64;                    
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int  MAX_DEVICE_NAME_LEN = 64;					  
	/**
	 * \if ENGLISH_LANG
	 * Device ID max length
	 * \else
	 * �豸ID��󳤶�
	 * \endif
	 */
	public static final int  MAX_DEV_ID_LEN_EX = 128;					  
	/**
	 * \if ENGLISH_LANG
	 * Month in a year
	 * \else
	 * һ�����·���
	 * \endif
	 */
	public static final int  MONTH_OF_YEAR = 12;					  
	/**
	 * \if ENGLISH_LANG
	 * Server max quantity
	 * \else
	 * ������������
	 * \endif
	 */
	public static final int  MAX_SERVER_NUM = 10;                    
	/**
	 * \if ENGLISH_LANG
	 * Auto registration config max quantity 
	 * \else
	 * ����ע������������
	 * \endif
	 */
	public static final int  MAX_REGISTER_NUM = 10;                    
	/**
	 * \if ENGLISH_LANG
	 * Single channel max speed change config quantity
	 * \else
	 * ��ͨ�����������ø���
	 * \endif
	 */
	public static final int  MAX_VIDEO_IN_ZOOM = 32;                    
	/**
	 * \if ENGLISH_LANG
	 * Video analysis global config scene max quantity
	 * \else
	 * ��Ƶ����ȫ�����ó����������
	 * \endif
	 */
	public static final int	 MAX_ANALYSE_SCENE_NUM = 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Each PTZ max config quantity
	 * \else
	 * ÿ����̨�����������
	 * \endif
	 */
	public static final int	 MAX_CONFIG_NUM	= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * General string length 16
	 * \else
	 * ͨ���ַ�������16
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_16 = 16;                    
	/**
	 * \if ENGLISH_LANG
	 * General string length 32
	 * \else
	 * ͨ���ַ�������32
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_32 = 32;                    
	/**
	 * \if ENGLISH_LANG
	 * General string length 64
	 * \else
	 * ͨ���ַ�������64
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_64 = 64;                    
	/**
	 * \if ENGLISH_LANG
	 * General string length 128
	 * \else
	 * ͨ���ַ�������128
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_128 = 128;                   
	/**
	 * \if ENGLISH_LANG
	 * General string length 256
	 * \else
	 * ͨ���ַ�������256
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_256 = 256;                   
	/**
	 * \if ENGLISH_LANG
	 * General string length 512
	 * \else
	 * ͨ���ַ�������512
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_512 = 512;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel name length
	 * \else
	 * ͨ�����Ƴ���
	 * \endif
	 */
	public static final int  AV_CFG_Channel_Name_Len = 64;		
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor wall name length
	 * \else
	 * ����ǽ���Ƴ���
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Name_Len = 64;	
	
	/**
	 * \if ENGLISH_LANG
	 * A week day
	 * \else
	 * һ������
	 * \endif
	 */
	public static final int  AV_CFG_Weekday_Num	= 7;			  
	/**
	 * \if ENGLISH_LANG
	 * Period quantity
	 * \else
	 * ʱ�������
	 * \endif
	 */
	public static final int  AV_CFG_Max_TimeSection = 6;			  
	/**
	 * \if ENGLISH_LANG
	 * Device ID length
	 * \else
	 * �豸ID����
	 * \endif
	 */
	public static final int  AV_CFG_Device_ID_Len = 64;			
	/**
	 * \if ENGLISH_LANG
	 * ip length
	 * \else
	 * ip����
	 * \endif
	 */
	public static final int  AV_CFG_IP_Address_Len = 32;
	
	public static final int  AV_CFG_IP_Address_Len_EX = 40;
	
	/**
	 * \if ENGLISH_LANG
	 * Username length
	 * \else
	 * �û�������
	 * \endif
	 */
	public static final int  AV_CFG_User_Name_Len = 64;			
	/**
	 * \if ENGLISH_LANG
	 * Password length
	 * \else
	 * ���볤��
	 * \endif
	 */
	public static final int  AV_CFG_Password_Len= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Protocol name length
	 * \else
	 * Э��������
	 * \endif
	 */
	public static final int  AV_CFG_Protocol_Len= 32;			 
	/**
	 * \if ENGLISH_LANG
	 * SN length
	 * \else
	 * ���кų���
	 * \endif
	 */
	public static final int  AV_CFG_Serial_Len= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Device type length
	 * \else
	 * �豸���ͳ���
	 * \endif
	 */
	public static final int  AV_CFG_Device_Class_Len= 16;			 
	/**
	 * \if ENGLISH_LANG
	 * Device detailed model length
	 * \else
	 * �豸�����ͺų���
	 * \endif
	 */
	public static final int  AV_CFG_Device_Type_Len= 32;			 
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int  AV_CFG_Device_Name_Len= 128;			 
	/**
	 * \if ENGLISH_LANG
	 * Device deploy location
	 * \else
	 * ��������ص�
	 * \endif
	 */
	public static final int  AV_CFG_Address_Len= 128;			 
	/**
	 * \if ENGLISH_LANG
	 * Group name length
	 * \else
	 * ��������
	 * \endif
	 */
	public static final int  AV_CFG_Group_Name_Len= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Path length
	 * \else
	 * ·������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Path= 260;			
	/**
	 * \if ENGLISH_LANG
	 * Max split window quantity
	 * \else
	 * ���ָ������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Window= 128;			
	/**
	 * \if ENGLISH_LANG
	 * Each output channel max tour image favorite quantity
	 * \else
	 * ÿ�����ͨ���������ѵ�����ղ�����
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Favorite_In_Channel= 64;			 
	/**
	 * \if ENGLISH_LANG
	 * Image favorite name length
	 * \else
	 * �����ղ����Ƴ���
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Favorite_Name_Len= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Image favorite max window quantity
	 * \else
	 * �����ղص���󴰿�����
	 * \endif
	 */
	public static final int  AV_CFG_Max_Monitor_Favorite_Window= 64;			 
	/**
	 * \if ENGLISH_LANG
	 * Split max group quantity
	 * \else
	 * �ָ�����������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Group= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Split mode max quantity
	 * \else
	 * �ָ�ģʽ�������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Mode= 32;			
	/**
	 * \if ENGLISH_LANG
	 * RAID name length
	 * \else
	 * RAID���Ƴ���
	 * \endif
	 */
	public static final int  AV_CFG_Raid_Name_Len= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Single RAID included disk quantity
	 * \else
	 * ����RAID����������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Rail_Member= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Main stream encode type quantity
	 * \else
	 * ����������������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Encode_Main_Format= 3;			
	/**
	 * \if ENGLISH_LANG
	 * Sub stream encode type
	 * \else
	 * ����������������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Encode_Extra_Format= 3;			
	/**
	 * \if ENGLISH_LANG
	 * Snapshot encode type
	 * \else
	 * ץͼ����������
	 * \endif
	 */
	public static final int	 AV_CFG_Max_Encode_Snap_Format= 3;			
	/**
	 * \if ENGLISH_LANG
	 * Each channel max video input color config quantity
	 * \else
	 * ÿ��ͨ�������Ƶ������ɫ��������
	 * \endif
	 */
	public static final int  AV_CFG_Max_VideoColor= 24;			
	/**
	 * \if ENGLISH_LANG
	 * Custom title name length
	 * \else
	 * �Զ���������Ƴ���
	 * \endif
	 */
	public static final int  AV_CFG_Custom_Title_Len= 1024;			
	/**
	 * \if ENGLISH_LANG
	 * Custom title type length
	 * \else
	 * �Զ���������ͳ���
	 * \endif
	 */
	public static final int  AV_CFG_Custom_TitleType_Len= 32;         
	/**
	 * \if ENGLISH_LANG
	 * Encode area coverage max quantity
	 * \else
	 *  �������򸲸��������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Video_Widget_Cover= 16;			
	/**
	 * \if ENGLISH_LANG
	 * Encode object custom title max quantity
	 * \else
	 * ��������Զ�������������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Video_Widget_Custom_Title= 8;	
	/**
	 * \if ENGLISH_LANG
	 * Encode object max number of sensor info
	 * \else
	 * ����������Ӵ�������Ϣ�������Ŀ
	 * \endif
	 */
	public static final int AV_CFG_Max_Video_Widget_Sensor_Info  = 2;
	/**
	 * \if ENGLISH_LANG
	 * max description number
	 * \else
	 * ��������������Ϣ��������
	 * \endif
	 */
	public static final int AV_CFG_Max_Description_Num = 4;
	/**
	 * \if ENGLISH_LANG
	 * Group note length
	 * \else
	 * ����˵������
	 * \endif
	 */
	public static final int  AV_CFG_Group_Memo_Len= 128;			
	/**
	 * \if ENGLISH_LANG
	 * Max channel quantity
	 * \else
	 * ���ͨ������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Channel_Num= 1024;		
	/**
	 * \if ENGLISH_LANG
	 * Time format length
	 * \else
	 * ʱ���ʽ����
	 * \endif
	 */
	public static final int  AV_CFG_Time_Format_Len= 32;			 
	/**
	 * \if ENGLISH_LANG
	 * White list quantity
	 * \else
	 * ����������
	 * \endif
	 */
	public static final int  AV_CFG_Max_White_List= 1024;		
	/**
	 * \if ENGLISH_LANG
	 * Black list quantity
	 * \else
	 * ����������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Black_List= 1024;		
	/**
	 * \if ENGLISH_LANG
	 * Filter IP max length
	 * \else
	 * ����IP��󳤶�
	 * \endif
	 */
	public static final int  AV_CFG_Filter_IP_Len= 96;			
	/**
	 * \if ENGLISH_LANG
	 * Channel storage rule max length, only channel part
	 * \else
	 * ͨ���洢������󳤶�, ��ͨ������
	 * \endif
	 */
	public static final int  AV_CFG_Max_ChannelRule= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Event keyword quantity
	 * \else
	 * �¼��ؼ�������
	 * \endif
	 */
	public static final int  AV_CFG_Max_DBKey_Num= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Event keyword length
	 * \else
	 * �¼��ؼ��ֳ���
	 * \endif
	 */
	public static final int  AV_CFG_DBKey_Len= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Summary length
	 * \else
	 * ժҪ����
	 * \endif
	 */
	public static final int  AV_CFG_Max_Summary_Len= 1024;		
	/**
	 * \if ENGLISH_LANG
	 * Event title max length
	 * \else
	 * �¼������������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Event_Title_Num= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Activation tour max quantity
	 * \else
	 * ������Ѳ�������
	 * \endif
	 */
	public static final int  AV_CFG_Max_Tour_Link_Num= 128;			
	/**
	 * \if ENGLISH_LANG
	 * PIP split mode basic value
	 * \else
	 * ���л��ָ�ģʽ����ֵ
	 * \endif
	 */
	public static final int  AV_CFG_PIP_BASE= 1000;		
	/**
	 * \if ENGLISH_LANG
	 * DES key byte length
	 * \else
	 * DES��Կ���ֽڳ���
	 * \endif
	 */
	public static final int  DES_KEY_LEN= 8;			
	/**
	 * \if ENGLISH_LANG
	 * 3DES key byte length
	 * \else
	 * 3DES��Կ�ĸ���
	 * \endif
	 */
	public static final int  DES_KEY_NUM= 3;			
	/**
	 * \if ENGLISH_LANG
	 * AES key byte length
	 * \else
	 * AES��Կ���ֽڳ���
	 * \endif
	 */
	public static final int  AES_KEY_LEN= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Time table element quantity
	 * \else
	 * ʱ���Ԫ�ظ���
	 * \endif
	 */
	public static final int  MAX_TIME_SCHEDULE_NUM= 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Scene sub type string length
	 * \else
	 * �����������ַ�������
	 * \endif
	 */
	public static final int MAX_SCENE_SUBTYPE_LEN               = 64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Scene sub type max quantity
	 * \else
	 * ����������������
	 * \endif
	 */
	public static final int MAX_SCENE_SUBTYPE_NUM               = 32 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Single channel max focus config quantity
	 * \else
	 * ��ͨ�����۽����ø���
	 * \endif
	 */
	public static final int MAX_VIDEO_IN_FOCUS                  = 32 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max time period speed config quantity
	 * \else
	 * ���ʱ����������ø���
	 * \endif
	 */
	public static final int MAX_TIMESPEEDLIMIT_NUM				= 16 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max audio prompt config quantity
	 * \else
	 * ���������ʾ���ø���
	 * \endif
	 */
	public static final int MAX_VOICEALERT_NUM					= 64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix quantity
	 * \else
	 * �����λ��������
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_NUM			= 16 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix input channel quantity
	 * \else
	 * �����λ��������ͨ����
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_INPUT			= 64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix output channel quantity
	 * \else
	 * �����λ�������ͨ����
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_OUTPUT			= 32 ;
	
	public static final int CFG_MAX_FISHEYE_WINDOW_NUM          =     8;         // ������۴�����
	public static final int CFG_MAX_FISHEYE_MODE_NUM            =     8;         // �������ģʽ��   
	
	/**
	 * \if ENGLISH_LANG
	 * Max IR panel template quantity
	 * \else
	 * ���������ģ������
	 * \endif
	 */
	public static final int CFG_MAX_INFRARED_BOARD_TEMPLATE_NUM = 16 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max IR panel button quantity
	 * \else
	 * ��������尴������
	 * \endif
	 */
	public static final int	CFG_MAX_INFRARED_KEY_NUM			= 128;
	
	/**
	 * \if ENGLISH_LANG
	 * Max IR panel quantity
	 * \else
	 * �������������
	 * \endif
	 */
	public static final int	CFG_MAX_INFRARED_BOARD_NUM			= 16 ;
	
	public static final int	MAX_ALARM_CHANNEL_NUM				= 32;			// ��󱨾�ͨ����
	public static final int	MAX_ALARM_DEFENCE_TYPE_NUM		    = 8;			// ��󱨾�����������
	public static final int	MAX_ALARM_SENSE_METHOD_NUM			= 16;			// ��󱨾���Ӧ����ʽ��
	
	public static final int	MAX_EXALARMBOX_PROTOCOL_NUM             = 8;               // ���֧����չ������Э����
	public static final int	MAX_EXALARM_CHANNEL_NUM                 = 256;             // ��󱨾�ͨ����
	public static final int	MAX_EXALARMBOX_NUM                      = 8;               // ��󱨾�������
	public static final int	MAX_MAILTITLE_LEN                       = 256;             // ����ʼ����ⳤ��
	public static final int	MAX_DEVICE_ID_LEN                       = 48;              // ����豸���볤��
	public static final int	MAX_DEVICE_MARK_LEN                     = 64;              // ����豸��������
	public static final int	MAX_BRAND_NAME_LEN                      = 64;              // ����豸Ʒ�Ƴ���
	public static final int	MAX_ADDRESS_NUM                         = 16;              // ��󴮿ڵ�ַ����
	public static final int	MAX_AIRCONDITION_NUM                    = 16;              // ���յ��豸����
	public static final int	CFG_MAX_COLLECTION_NUM                  = 64;              // ���Ԥ����
	public static final int	MAX_FLOOR_NUM                           = 128;             // ���¥����
	public static final int	MAX_SEAT_NUM                            = 8;               // �����λ��
	
	
	/**
	 * \if ENGLISH_LANG
	 * Local device ID
	 * \else
	 * �����豸ID
	 * \endif
	 */
	public static final String  AV_CFG_Local_Device_ID= "Local";		
	/**
	 * \if ENGLISH_LANG
	 * Remote device ID
	 * \else
	 * Զ���豸ID
	 * \endif
	 */
	public static final String  AV_CFG_Remote_Devce_ID= "Remote";	 
	
	public static final int	MAX_LANE_CONFIG_NUMBER                  = 32;              // ����������
	public static final int	MAX_PRIORITY_NUMBER                     = 256;             // Υ�����ȼ�����Υ��������
	public static final int	MAX_CATEGORY_TYPE_NUMBER                = 128;             // �����������
	public static final int	MAX_TRIGGER_MODE_NUMBER                 = 64;              // ����ģʽ����
	public static final int	MAX_ABNORMAL_DETECT_TYPE                = 32;              // �쳣���������
	public static final int	MAX_ABNORMAL_THRESHOLD_LEN				      = 32;				// �쳣�����ֵ������
	public static final int	TS_POINT_NUM                            = 3;               // ������У׼����
	public static final int	CFG_FILTER_IP_LEN				                = 96;			    // ����IP��󳤶�
	public static final int	CFG_MAX_TRUST_LIST				              = 1024;		    // ����������
	public static final int	CFG_MAX_BANNED_LIST				              = 1024;		    // ����������
	public static final int	VIDEOIN_TSEC_NUM                        = 3;               // VideoIn ϵ��Э��ʱ��θ�����Ŀǰ����ͨ�����졢��ҹ����
	public static final int	MAX_RECT_COUNT							            = 4;				// ����ͨ��֧�ֵ�����������������
	public static final int	CFG_MAX_SSID_LEN                        = 36;              // SSID��󳤶�
	
	/**
	 * \if ENGLISH_LANG
	 * COM configuration (Corresponding of CFG_COMMGROUP_INFO)
	 * \else
	 * ��������(��ӦCFG_COMMGROUP_INFO)
	 * \endif
	 */
	public static final String  CFG_CMD_COMM= "Comm";				
	/**
	 * \if ENGLISH_LANG
	 * CAN config(corresponding to  CFG_CANFILTER_LIST)
	 * \else
	 * CAN͸������(��Ӧ CFG_CANFILTER_LIST)
	 * \endif
	 */
	public static final String  CFG_CMD_CANFILTER= "CANFilter";			
	/**
	 * \if ENGLISH_LANG
	 * Device alive config(corresponding to structure CFG_DEVICEKEEPALIVELIST)
	 * \else
	 * �豸��������(��Ӧ�ṹ�� CFG_DEVICEKEEPALIVELIST)
	 * \endif
	 */
	public static final String  CFG_CMD_DEVICEKEEPALIVE = "DeviceKeepAlive"; 
	
	/**
	 * \if ENGLISH_LANG
	 * Call analysis video info summary type�� corresponding structure as CFG_VIDEOSATA_SUMMARY_INFO 
	 * \else
	 * �ص�������Ƶ��ϢժҪ���ͣ���Ӧ�ṹ��ΪCFG_VIDEOSATA_SUMMARY_INFO
	 * \endif
	 */
	public static final int     TYPE_CB_VIDEOSTAT=       0x1000000;      
	/**
	 * \if ENGLISH_LANG
	 * Call analysis video input channel corresponding all event rule types, corresponding to structure CFG_ANALYSERULES_INFO
	 * \else
	 * �ص�������Ƶ����ͨ����Ӧ�������¼��������ͣ���Ӧ�ṹ��ΪCFG_ANALYSERULES_INFO
	 * \endif
	 */
	public static final int     TYPE_CB_ANARULES=        0x1000001;     
	/**
	 * \if ENGLISH_LANG
	 * Call analysis compressed video intelligent frame, corresponding to structure DH_MSG_OBJECT
	 * \else
	 * �ص�����Ũ����Ƶ������֡����Ӧ�ṹ��SDK_MSG_OBJECT
	 * \endif
	 */
	public static final int     TYPE_CB_VIDEOSYNOPSIS=   0x1000002;	 
	/**
	 * \if ENGLISH_LANG
	 * Call analysis traffic info, corresponding to structure DEV_EVENT_TRAFFIC_FLOWSTAT_INFO 
	 * \else
	 * �ص�������ͨ������Ϣ����Ӧ�ṹ��DEV_EVENT_TRAFFIC_FLOWSTAT_INFO
	 * \endif
	 */
	public static final int     TYPE_CB_TRAFFICFLOWINFO= 0x1000003;

	/**
	 * \if ENGLISH_LANG
	 * Call analysis traffic flow rule info��corresponding to structure CFG_TRAFFIC_FLOWSTAT_INFO
	 * \else
	 * �ص�������ͨ����������Ϣ����Ӧ�ṹ�� CFG_TRAFFIC_FLOWSTAT_INFO
	 * \endif
	 */
	public static final int    TYPE_CB_TRAFFICFLOWRULE = 0x1000004; 
	

	/************************************************************************
	 ** �������� ��Ӧ GetNewDevConfig�� SetNewDevConfig�ӿ�
	 ***********************************************************************/
	
	/**
	 * \if ENGLISH_LANG
	 * image channel property config,structure CFG_ENCODE_INFO
	 * \else
	 * ͼ��ͨ����������(��ӦCFG_ENCODE_INFO)
	 * \endif
	 */
	public static final String  CFG_CMD_ENCODE = "Encode";
	
	/**
	 * \if ENGLISH_LANG
	 * timed recordconfig,structure CFG_RECORD_INFO 
	 * \else
	 * ��ʱ¼������(��ӦCFG_RECORD_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RECORD		    = "Record";    		
	/**
	 * \if ENGLISH_LANG
	 * external inputalarmconfig,structure CFG_ALARMIN_INFO 
	 * \else
	 * �ⲿ���뱨������(��ӦCFG_ALARMIN_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ALARMINPUT	    = "Alarm";    			
	/**
	 * \if ENGLISH_LANG
	 * network alarmconfig,structure CFG_NETALARMIN_INFO 
	 * \else
	 * ���籨������(��ӦCFG_NETALARMIN_INFO)
	 * \endif
	 */
	public static String CFG_CMD_NETALARMINPUT    = "NetAlarm";    		
	/**
	 * \if ENGLISH_LANG
	 * dynamic detectionalarmconfig,structure CFG_MOTION_INFO 
	 * \else
	 * ��̬��ⱨ������(��ӦCFG_MOTION_INFO)
	 * \endif
	 */
	public static String CFG_CMD_MOTIONDETECT    = "MotionDetect";    	
	/**
	 * \if ENGLISH_LANG
	 * video loss alarmconfig,structure CFG_VIDEOLOST_INFO 
	 * \else
	 * ��Ƶ��ʧ��������(��ӦCFG_VIDEOLOST_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOLOST	    = "LossDetect";    	
	/**
	 * \if ENGLISH_LANG
	 * video mask alarmconfig,structure CFG_SHELTER_INFO 
	 * \else
	 * ��Ƶ�ڵ���������(��ӦCFG_SHELTER_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOBLIND	    = "BlindDetect";    	
	/**
	 * \if ENGLISH_LANG
	 * no storage device config,structure CFG_STORAGENOEXIST_INFO 
	 * \else
	 * �޴洢�豸��������(��ӦCFG_STORAGENOEXIST_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGENOEXIST    = "StorageNotExist";    
	/**
	 * \if ENGLISH_LANG
	 * storage device access mistake config,structure CFG_STORAGEFAILURE_INFO 
	 * \else
	 * �洢�豸���ʳ���������(��ӦCFG_STORAGEFAILURE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEFAILURE    = "StorageFailure";    
	/**
	 * \if ENGLISH_LANG
	 * storage device low volume config,structure CFG_STORAGELOWSAPCE_INFO 
	 * \else
	 * �洢�豸�ռ䲻�㱨������(��ӦCFG_STORAGELOWSAPCE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGELOWSAPCE    = "StorageLowSpace";    
	/**
	 * \if ENGLISH_LANG
	 * disconnected config,structure CFG_NETABORT_INFO 
	 * \else
	 * ����Ͽ���������(��ӦCFG_NETABORT_INFO)	
	 * \endif
	 */
	public static String CFG_CMD_NETABORT	    = "NetAbort";    		
	/**
	 * \if ENGLISH_LANG
	 * IP conflict setting,structure CFG_IPCONFLICT_INFO 
	 * \else
	 * IP��ͻ��������(��ӦCFG_IPCONFLICT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_IPCONFLICT	    = "IPConflict";    	
	/**
	 * \if ENGLISH_LANG
	 * snapshot ,structure CFG_SNAPCAPINFO_INFO 
	 * \else
	 * ץͼ������ѯ(��ӦCFG_SNAPCAPINFO_INFO)
	 * \endif
	 */
	public static String CFG_CMD_SNAPCAPINFO	    = "SnapInfo";    		
	/**
	 * \if ENGLISH_LANG
	 * network storage serverconfig,structure CFG_NAS_INFO 
	 * \else
	 * ����洢����������(��ӦCFG_NAS_INFO)
	 * \endif
	 */
	public static String CFG_CMD_NAS			    = "NAS";    			
	/**
	 * \if ENGLISH_LANG
	 * PTZ config,structure CFG_PTZ_INFO
	 * \else
	 * ��̨����(��ӦCFG_PTZ_INFO)
	 * \endif
	 */
	public static String CFG_CMD_PTZ			    = "Ptz";    			
	/**
	 * \if ENGLISH_LANG
	 * PTZ schedule action config(corresponding to CFG_PTZ_AUTOMOVE_INFO)
	 * \else
	 * ��̨��ʱ��������(��ӦCFG_PTZ_AUTOMOVE_INFO)
	 * \endif
	 */
	public static String	CFG_CMD_PTZ_AUTO_MOVEMENT   = "PtzAutoMovement";    
	/**
	 * \if ENGLISH_LANG
	 * video water mark config,structure CFG_WATERMARK_INFO 
	 * \else
	 * ��Ƶˮӡ����(��ӦCFG_WATERMARK_INFO)
	 * \endif
	 */
	public static String CFG_CMD_WATERMARK	    = "WaterMark";    		
	/**
	 * \if ENGLISH_LANG
	 * video full analysis config,structure CFG_ANALYSEGLOBAL_INFO
	 * \else
	 * ��Ƶ����ȫ������(��ӦCFG_ANALYSEGLOBAL_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSEGLOBAL    = "VideoAnalyseGlobal";    
	/**
	 * \if ENGLISH_LANG
	 * object's detection module config,structure CFG_ANALYSEMODULES_INFO 
	 * \else
	 * ����ļ��ģ������(��ӦCFG_ANALYSEMODULES_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSEMODULE    = "VideoAnalyseModule";    
	/**
	 * \if ENGLISH_LANG
	 * video analyzing rule config,structure CFG_ANALYSERULES_INFO 
	 * \else
	 * ��Ƶ������������(��ӦCFG_ANALYSERULES_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSERULE	    = "VideoAnalyseRule";    
	/**
	 * \if ENGLISH_LANG
	 * video analyzing resource config,structure CFG_ANALYSESOURCE_INFO 
	 * \else
	 * ��Ƶ������Դ����(��ӦCFG_ANALYSESOURCE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSESOURCE    = "VideoAnalyseSource";    
	/**
	 * \if ENGLISH_LANG
	 * wiper config CFG_RAINBRUSH_INFO 
	 * \else
	 * ��ˢ����(��ӦCFG_RAINBRUSH_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RAINBRUSH         = "RainBrush";            
	/**
	 * \if ENGLISH_LANG
	 * ITC CFG_TRAFFICSNAPSHOT_INFO for compatible with old protocol��please use CFG_CMD_TRAFFICSNAPSHOT_MULTI)
	 * \else
	 * ���ܽ�ͨץ��(CFG_TRAFFICSNAPSHOT_INFOֻΪ������Э�飻��ʹ��CFG_CMD_TRAFFICSNAPSHOT_MULTI)
	 * \endif
	 */
	public static String CFG_CMD_INTELLECTIVETRAFFIC   = "TrafficSnapshot";    
	/**
	 * \if ENGLISH_LANG
	 * full intellifent traffic config CFG_TRAFFICGLOBAL_INFO 
	 * \else
	 * ���ܽ�ͨȫ������(CFG_TRAFFICGLOBAL_INFO)
	 * \endif
	 */
	public static String CFG_CMD_TRAFFICGLOBAL     = "TrafficGlobal";        
	/**
	 * \if ENGLISH_LANG
	 * normal config CFG_DEV_DISPOSITION_INFO
	 * \else
	 * ��ͨ���� (CFG_DEV_DISPOSITION_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DEV_GENERRAL      = "General";              
	/**
	 * \if ENGLISH_LANG
	 * ATM expired config CFG_ATMMOTION_INFO
	 * \else
	 * ATMȡ�ʱ����(��ӦCFG_ATMMOTION_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ATMMOTION	    = "FetchMoneyOverTime";    
	/**
	 * \if ENGLISH_LANG
	 * device status info CFG_DEVICESTATUS_INFO 
	 * \else
	 * �豸״̬��Ϣ(��ӦCFG_DEVICESTATUS_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DEVICESTATUS      = "DeviceStatus";         
	/**
	 * \if ENGLISH_LANG
	 * extension info,structure CFG_HARDISKTANKGROUP_INFO 
	 * \else
	 * ��չ����Ϣ(��ӦCFG_HARDISKTANKGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_HARDDISKTANK      = "HardDiskTank";         
	/**
	 * \if ENGLISH_LANG
	 * Raid froup info,structure CFG_RAIDGROUP_INFO 
	 * \else
	 * Raid����Ϣ(��ӦCFG_RAIDGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RAIDGROUP         = "RaidGroup";            
	/**
	 * \if ENGLISH_LANG
	 * storage pool info,structure CFG_STORAGEPOOLGROUP_INFO
	 * \else
	 * �洢������Ϣ(��ӦCFG_STORAGEPOOLGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEPOOLGROUP   = "StoragePoolGroup";    
	/**
	 * \if ENGLISH_LANG
	 * file system group info,structure CFG_STORAGEPOSITIONGROUP_INFO 
	 * \else
	 * �ļ�ϵͳ����Ϣ(��ӦCFG_STORAGEPOSITIONGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEPOSITIONGROUP    = "StoragePositionGroup";     
	/**
	 * \if ENGLISH_LANG
	 * frong-end device group info CFG_VIDEOINDEVGROUP_INFO
	 * \else
	 * ǰ���豸����Ϣ(��ӦCFG_VIDEOINDEVGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOINDEVGROUP   = "VideoInDevGroup";      
	/**
	 * \if ENGLISH_LANG
	 * channelrecord group status,structure CFG_DEVRECORDGROUP_INFO
	 * \else
	 * ͨ��¼����״̬(��ӦCFG_DEVRECORDGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DEVRECORDGROUP    = "DevRecordGroup";       
	/**
	 * \if ENGLISH_LANG
	 * service status,structure CFG_IPSERVER_STATUS
	 * \else
	 * ����״̬(��ӦCFG_IPSERVER_STATUS)
	 * \endif
	 */
	public static String CFG_CMD_IPSSERVER         = "IpsServer";            
	/**
	 * \if ENGLISH_LANG
	 * Spot vide matrix,structure CFG_VIDEO_MATRIX
	 * \else
	 * ץͼԴ����(��ӦCFG_SNAPSOURCE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_SNAPSOURCE	    = "SnapSource";    	
	/**
	 * \if ENGLISH_LANG
	 * Dahua rador
	 * \else
	 * ���״�����
	 * \endif
	 */
	public static String CFG_CMD_DHRADER           = "DahuaRadar";           
	/**
	 * \if ENGLISH_LANG
	 * Chuansu radar
	 * \else
	 * �����״�����
	 * \endif
	 */
	public static String CFG_CMD_TRANSRADER         = "TransRadar";          
	/**
	 * \if ENGLISH_LANG
	 * Landun radar
	 * \else
	 * �����״�����
	 * \endif
	 */
	public static String CFG_CMD_LANDUNRADER        = "LanDunRadar";         //
	/**
	 * \if ENGLISH_LANG
	 * Landun coil
	 * \else
	 * ������Ȧ����
	 * \endif
	 */
	public static String CFG_CMD_LANDUNCOILS        = "LanDunCoils";         
	/**
	 * \if ENGLISH_LANG
	 * Spot vide matrix,structure CFG_VIDEO_MATRIX 
	 * \else
	 * Spot��������(��ӦCFG_VIDEO_MATRIX)
	 * \endif
	 */
	public static String CFG_CMD_MATRIX_SPOT        = "SpotMatrix";          
	/**
	 * \if ENGLISH_LANG
	 * every number channel dsp info,structure CFG_DSPENCODECAP_INFO
	 * \else
	 * HDVR��ÿ������ͨ����dsp��Ϣ ����ͨ��������IPC��DVR Ҳ����IPC��DVR������(��ӦCFG_DSPENCODECAP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_HDVR_DSP           = "DspEncodeCap";        
	/**
	 * \if ENGLISH_LANG
	 * HDVR each digital channel connected device info
	 * \else
	 * HDVR��ÿ������ͨ���������豸����Ϣ
	 * \endif
	 */
	public static String CFG_CMD_HDVR_ATTR_CFG      = "SystemAttr";          
	/**
	 * \if ENGLISH_LANG
	 * Holiday record plan(correspondting to strcture CFG_HOLIDAY_SCHEDULE group)
	 * \else
	 * ����¼��ƻ�(��Ӧ�ṹ��CFG_HOLIDAY_SCHEDULE����)
	 * \endif
	 */
	public static String CFG_CMD_CHANNEL_HOLIDAY    = "HolidaySchedule";     
	/**
	 * \if ENGLISH_LANG
	 * Health mail
	 * \else
	 * �����ʼ�
	 * \endif
	 */
	public static String CFG_CMD_HEALTH_MAIL        = "HealthMail";          
	/**
	 * \if ENGLISH_LANG
	 * Camera move detect activation 
	 * \else
	 * �������λ������� 
	 * \endif
	 */
	public static String CFG_CMD_CAMERAMOVE         = "IntelliMoveDetect";         
	/**
	 * \if ENGLISH_LANG
	 * video splicing tour config,structure CFG_VIDEO_MATRIX
	 * \else
	 * ��Ƶ�ָ���Ѳ����(��ӦCFG_VIDEO_MATRIX)
	 * \endif
	 */
	public static String CFG_CMD_SPLITTOUR          = "SplitTour";           
	/**
	 * \if ENGLISH_LANG
	 * video encode ROI(Region of Intrest)config,structure
	 * \else
	 * ��Ƶ����ROI(Region of Intrest)����
	 * \endif
	 */
	public static String CFG_CMD_VIDEOENCODEROI     = "VideoEncodeROI";      
	/**
	 * \if ENGLISH_LANG
	 * light inspection config,structure CFG_VIDEO_INMETERING_INFO
	 * \else
	 * �������(��ӦCFG_VIDEO_INMETERING_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEO_INMETERING   = "VideoInMetering";     
	/**
	 * \if ENGLISH_LANG
	 * traffic flow statistics config,structure CFG_TRAFFIC_FLOWSTAT_INFO
	 * \else
	 * ��ͨ����ͳ������(��ӦCFG_TRAFFIC_FLOWSTAT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_TRAFFIC_FLOWSTAT   = "TrafficFlowStat";     
	/**
	 * \if ENGLISH_LANG
	 * HDMI video matrix config
	 * \else
	 * HDMI��Ƶ��������
	 * \endif
	 */
	public static String CFG_CMD_HDMIMATRIX          = "HDMIMatrix";         
	/**
	 * \if ENGLISH_LANG
	 * videoinput front-end option,structure CFG_VIDEO_IN_OPTIONS 
	 * \else
	 * ��Ƶ����ǰ��ѡ��(��ӦCFG_VIDEO_IN_OPTIONS)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOINOPTIONS	   = "VideoInOptions";    
	/**
	 * \if ENGLISH_LANG
	 * RTSP��config,structure CFG_RTSP_INFO_IN , CFG_RTSP_INFO_OUT
	 * \else
	 * RTSP������( ��ӦCFG_RTSP_INFO_IN��CFG_RTSP_INFO_OUT )
	 * \endif
	 */
	public static String CFG_CMD_RTSP               = "RTSP";                

	public static String CFG_CMD_TRAFFICSNAPSHOT    = "TrafficSnapshotNew";    
	/**
	 * \if ENGLISH_LANG
	 * intelligent traffic snapshot CFG_TRAFFICSNAPSHOT_NEW_INFO
	 * \else
	 * ���ܽ�ͨץ��(CFG_TRAFFICSNAPSHOT_NEW_INFO)
	 * \endif
	 */
	public static String CFG_CMD_TRAFFICSNAPSHOT_MULTI    = "TrafficSnapshotNew";    
	/**
	 * \if ENGLISH_LANG
	 * multicast related config,structure CFG_MULTICASTS_INFO_IN , CFG_MULTICASTS_INFO_OUT
	 * \else
	 * �鲥���������(��ӦCFG_MULTICASTS_INFO_IN��CFG_MULTICASTS_INFO_OUT)
	 * \endif
	 */
	public static String CFG_CMD_MULTICAST          = "Multicast";            
	/**
	 * \if ENGLISH_LANG
	 * video diagnosis parameter list,structure CFG_VIDEODIAGNOSIS_PROFILE 
	 * \else
	 * ��Ƶ��ϲ�����(CFG_VIDEODIAGNOSIS_PROFILE)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_PROFILE     = "VideoDiagnosisProfile";    	
	/**
	 * \if ENGLISH_LANG
	 * video diagnosis task list,structure CFG_VIDEODIAGNOSIS_TASK 
	 * \else
	 * ��Ƶ��������(CFG_VIDEODIAGNOSIS_TASK)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_TASK	        = "VideoDiagnosisTask";    		
	/**
	 * \if ENGLISH_LANG
	 * video diagnosis plan list CFG_VIDEODIAGNOSIS_PROJECT
	 * \else
	 * ��Ƶ��ϼƻ���(CFG_VIDEODIAGNOSIS_PROJECT)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_PROJECT      = "VideoDiagnosisProject";    	
	/**
	 * \if ENGLISH_LANG
	 * 1111
	 * \else
	 * ��Ƶ���ʵʱ�ƻ���(CFG_VIDEODIAGNOSIS_REALPROJECT)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_REALPROJECT      = "VideoDiagnosisRealProject";    
	/**
	 * \if ENGLISH_LANG
	 * video full diagnosis list CFG_VIDEODIAGNOSIS_GLOBAL 
	 * \else
	 * ��Ƶ���ȫ�ֱ�(CFG_VIDEODIAGNOSIS_GLOBAL)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_GLOBAL       = "VideoDiagnosisGlobal";    	
	/**
	 * \if ENGLISH_LANG
	 * video diagnosis task list CFG_VIDEODIAGNOSIS_TASK
	 * \else
	 * ��Ƶ��������(CFG_VIDEODIAGNOSIS_TASK)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_TASK_ONE     = "VideoDiagnosisTask.x";        
	/**
	 * \if ENGLISH_LANG
	 * device working status relatedconfig,structure CFG_TRAFFIC_WORKSTATE_INFO
	 * \else
	 * �豸����״̬�������(��ӦCFG_TRAFFIC_WORKSTATE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_TRAFFIC_WORKSTATE           = "WorkState";                      
	/**
	 * \if ENGLISH_LANG
	 * disk storage group config,structure CFG_STORAGEGROUP_INFO
	 * \else
	 * ���̴洢������(��ӦCFG_STORAGEGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEDEVGROUP             = "StorageDevGroup";                
	/**
	 * \if ENGLISH_LANG
	 * record stored storage group config,structure CFG_RECORDTOGROUP_INFO
	 * \else
	 * ¼���ŵĴ洢������(��ӦCFG_RECORDTOGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RECORDTOGROUP               = "RecordToGroup";                  
	/**
	 * \if ENGLISH_LANG
	 * intelligent tracking scene config,structure CFG_INTELLITRACKSCENE_INFO
	 * \else
	 * ���ܸ��ٳ�������(CFG_INTELLITRACKSCENE_INFO) 
	 * \endif
	 */
	public static String CFG_CMD_INTELLITRACKSCENE           = "IntelliTrackScene";              
	/**
	 * \if ENGLISH_LANG
	 * intelligent frame rule config,structure CFG_ANALYSERULES_INFO 
	 * \else
	 * ����֡��������(��ӦCFG_ANALYSERULES_INFO)
	 * \endif
	 */
	public static String CFG_CMD_IVSFRAM_RULE                = "IVSFramRule";                    
	/**
	 * \if ENGLISH_LANG
	 * record storage point mapping config,structure CFG_RECORDTOSTORAGEPOINT_INFO
	 * \else
	 * ¼��洢��ӳ������(��ӦCFG_RECORDTOSTORAGEPOINT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RECORD_STORAGEPOINT         = "RecordStoragePoint";             
	/**
	 * \if ENGLISH_LANG
	 * source data serverconfig,structure CFG_METADATA_SERVER
	 * \else
	 * Ԫ���ݷ���������(��ӦCFG_METADATA_SERVER�ṹ��)
	 * \endif
	 */
	public static String CFG_CMD_MD_SERVER		            = "MetaDataServer";                
	/**
	 * \if ENGLISH_LANG
	 * channel name AV_CFG_ChannelName 
	 * \else
	 * ͨ������(��ӦAV_CFG_ChannelName)
	 * \endif
	 */
	public static String CFG_CMD_CHANNELTITLE    = "ChannelTitle";    	
	/**
	 * \if ENGLISH_LANG
	 * record mode AV_CFG_RecordMode 
	 * \else
	 * ¼��ģʽ(��ӦAV_CFG_RecordMode)
	 * \endif
	 */
	public static String	CFG_CMD_RECORDMODE	    = "RecordMode";    	
	/**
	 * \if ENGLISH_LANG
	 * videooutput property AV_CFG_VideoOutAttr 
	 * \else
	 * ��Ƶ�������(��ӦAV_CFG_VideoOutAttr)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOOUT	    = "VideoOut";    		
	/**
	 * \if ENGLISH_LANG
	 * remote device info AV_CFG_RemoteDevice
	 * \else
	 * Զ���豸��Ϣ(��ӦAV_CFG_RemoteDevice����, ͨ���޹�)
	 * \endif
	 */
	public static String CFG_CMD_REMOTEDEVICE      = "RemoteDevice";    	
	/**
	 * \if ENGLISH_LANG
	 * remote channel AV_CFG_RemoteChannel
	 * \else
	 * Զ��ͨ��(��ӦAV_CFG_RemoteChannel)
	 * \endif
	 */
	public static String CFG_CMD_REMOTECHANNEL    = "RemoteChannel";    	
	/**
	 * \if ENGLISH_LANG
	 * image tour config AV_CFG_MonitorTour 
	 * \else
	 * ������ѵ����(��ӦAV_CFG_MonitorTour)
	 * \endif
	 */
	public static String CFG_CMD_MONITORTOUR	    = "MonitorTour";    	
	/**
	 * \if ENGLISH_LANG
	 * image favorite config AV_CFG_MonitorCollection 
	 * \else
	 * �����ղ�����(��ӦAV_CFG_MonitorCollection)
	 * \endif
	 */
	public static String CFG_CMD_MONITORCOLLECTION    = "MonitorCollection";    
	/**
	 * \if ENGLISH_LANG
	 * image splicing display source config AV_CFG_ChannelDisplaySource
	 * \else
	 * ����ָ���ʾԴ����(��ӦAV_CFG_ChannelDisplaySource)(�ϳ���������ʹ��)
	 * \endif
	 */
	public static String CFG_CMD_DISPLAYSOURCE    = "DisplaySource";    	
	/**
	 * \if ENGLISH_LANG
	 * storage group config AV_CFG_Raid 
	 * \else
	 * �洢��������(��ӦAV_CFG_Raid����, ͨ���޹�)
	 * \endif
	 */
	public static String CFG_CMD_RAID		    = "Raid";    			
	/**
	 * \if ENGLISH_LANG
	 * record source config AV_CFG_RecordSource
	 * \else
	 * ¼��Դ����(��ӦAV_CFG_RecordSource)
	 * \endif
	 */
	public static String CFG_CMD_RECORDSOURCE    = "RecordSource";    	
	/**
	 * \if ENGLISH_LANG
	 * videoinput color config AV_CFG_ChannelVideoColor 
	 * \else
	 * ��Ƶ������ɫ����(��ӦAV_CFG_ChannelVideoColor)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOCOLOR	    = "VideoColor";    	
	/**
	 * \if ENGLISH_LANG
	 * video encoding object config AV_CFG_VideoWidget
	 * \else
	 * ��Ƶ�����������(��ӦAV_CFG_VideoWidget)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOWIDGET	    = "VideoWidget";    	
	/**
	 * \if ENGLISH_LANG
	 * storage group info AV_CFG_StorageGroup
	 * \else
	 * �洢����Ϣ(��ӦAV_CFG_StorageGroup����, ͨ���޹�)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEGROUP    = "StorageGroup";    	
	/**
	 * \if ENGLISH_LANG
	 * area config AV_CFG_Locales
	 * \else
	 * ��������(��ӦAV_CFG_Locales)
	 * \endif
	 */
	public static String CFG_CMD_LOCALS		    = "Locales";    		
	/**
	 * \if ENGLISH_LANG
	 * language selection AV_CFG_Language 
	 * \else
	 * ����ѡ��(��ӦAV_CFG_Language)
	 * \endif
	 */
	public static String CFG_CMD_LANGUAGE	    = "Language";    		
	/**
	 * \if ENGLISH_LANG
	 * visit address filter AV_CFG_AccessFilter 
	 * \else
	 * ���ʵ�ַ����(��ӦAV_CFG_AccessFilter)
	 * \endif
	 */
	public static String CFG_CMD_ACCESSFILTER    = "AccessFilter";    	
	/**
	 * \if ENGLISH_LANG
	 * auto maintenance AV_CFG_AutoMaintain 
	 * \else
	 * �Զ�ά��(��ӦAV_CFG_AutoMaintain)
	 * \endif
	 */
	public static String CFG_CMD_AUTOMAINTAIN    = "AutoMaintain";    	
	/**
	 * \if ENGLISH_LANG
	 * remote device event process AV_CFG_RemoteEvent
	 * \else
	 * Զ���豸�¼�����(��ӦAV_CFG_RemoteEvent����)
	 * \endif
	 */
	public static String CFG_CMD_REMOTEEVENT	    = "RemoteEvent";    	
	/**
	 * \if ENGLISH_LANG
	 * display wall config AV_CFG_MonitorWall
	 * \else
	 * ����ǽ����(��ӦAV_CFG_MonitorWall����, ͨ���޹�)
	 * \endif
	 */
	public static String CFG_CMD_MONITORWALL	    = "MonitorWall";    	
	/**
	 * \if ENGLISH_LANG
	 * mixing screen config AV_CFG_SpliceScreen
	 * \else
	 * �ں�������(��ӦAV_CFG_SpliceScreen����, ͨ���޹�)
	 * \endif
	 */
	public static String	CFG_CMD_SPLICESCREEN    = "VideoOutputComposite";    	
	/**
	 * \if ENGLISH_LANG
	 * temperature alarmconfig AV_CFG_TemperatureAlarm
	 * \else
	 * �¶ȱ�������(��ӦAV_CFG_TemperatureAlarm, ͨ���޹�)
	 * \endif
	 */
	public static String CFG_CMD_TEMPERATUREALARM    = "TemperatureAlarm";    	
	/**
	 * \if ENGLISH_LANG
	 * fan speed alarmconfig AV_CFG_FanSpeedAlarm 
	 * \else
	 * ����ת�ٱ�������(��ӦAV_CFG_FanSpeedAlarm, ͨ���޹�)
	 * \endif
	 */
	public static String	CFG_CMD_FANSPEEDALARM	    = "FanSpeedAlarm";    		
	/**
	 * \if ENGLISH_LANG
	 * record rotate config AV_CFG_RecordBackup
	 * \else
	 * ¼��ش�����(��ӦAV_CFG_RecordBackup, ͨ���޹�)
	 * \endif
	 */
	public static String CFG_CMD_RECORDBACKUP	    = "RecordBackupRestore";    
	/**
	 * \if ENGLISH_LANG
	 * network config CFG_NETWORK_INFO 
	 * \else
	 * ��������(��ӦCFG_NETWORK_INFO)
	 * \endif
	 */
	public static String	CFG_CMD_NETWORK			      = "Network";    		
	/**
	 * \if ENGLISH_LANG
	 * network storage serverconfig, multi-server CFG_NAS_GROUP_INFO_EX
	 * \else
	 * ����洢����������, �������(��ӦCFG_NAS_INFO_EX)
	 * \endif
	 */
	public static String CFG_CMD_NASEX			      = "NAS";    			
	/**
	 * \if ENGLISH_LANG
	 * LDAP config
	 * \else
	 * LDAP����
	 * \endif
	 */
	public static String CFG_CMD_LDAP                  = "LDAP";                 
	/**
	 * \if ENGLISH_LANG
	 * active directory config
	 * \else
	 * �Ŀ¼����
	 * \endif
	 */
	public static String CFG_CMD_ACTIVE_DIR            = "ActiveDirectory";      
	/**
	 * \if ENGLISH_LANG
	 * Compensation light config(corresponding CFG_FLASH_LIGHT)
	 * \else
	 * ���������(��Ӧ CFG_FLASH_LIGHT)
	 * \endif
	 */
	public static String CFG_CMD_FLASH                 = "FlashLight";           
	/**
	 * \if ENGLISH_LANG
	 * Audio analysis rule config(corresponding CFG_ANALYSERULES_INFO)
	 * \else
	 * ��Ƶ������������(��Ӧ CFG_ANALYSERULES_INFO)
	 * \endif
	 */
	public static String CFG_CMD_AUDIO_ANALYSERULE     = "AudioAnalyseRule";     
	/**
	 * \if ENGLISH_LANG
	 * Judicial config(corresponding to CFG_JUDICATURE_INFO)
	 * \else
	 * ˾����¼����(��Ӧ CFG_JUDICATURE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_JUDICATURE            = "Judicature";           
	/**
	 * \if ENGLISH_LANG
	 * Mobile load config(corresponding to CFG_GOOD_WEIGHT_INFO)
	 * \else
	 * ���ػ�������(��ӦCFG_GOOD_WEIGHT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_GOODS_WEIGHT	    = "CQDTSet";    		
	/**
	 * \if ENGLISH_LANG
	 * Input channel config(corresponding CFG_VIDEO_IN_INFO)
	 * \else
	 * ����ͨ������(��ӦCFG_VIDEO_IN_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOIN			    = "VideoIn";    		
	/**
	 * \if ENGLISH_LANG
	 * Write dick encode plan(corresponding CFG_ENCODE_PLAN_INFO)
	 * \else
	 * ��¼���̱���ƻ�(��Ӧ CFG_ENCODE_PLAN_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ENCODEPLAN            = "EncodePlan";           
	/**
	 * \if ENGLISH_LANG
	 * Judicial PIP(corresponding to CFG_PICINPIC_INFO) as group��compatible with single config according to length
	 * \else
	 * ˾����Ѷ���л�(��Ӧ CFG_PICINPIC_INFO)��Ϊ���鷽ʽ��������ǰ�������ã����ݳ�������
	 * \endif
	 */
	public static String CFG_CMD_PICINPIC              = "PicInPic";             
	/**
	 * \if ENGLISH_LANG
	 * Write full event config(corresponding CFG_BURNFULL_INFO)
	 * \else
	 * ��¼���¼�����(��Ӧ CFG_BURNFULL_INFO)
	 * \endif
	 */
	public static String CFG_CMD_BURNFULL              = "BurnFull";             
	/**
	 * \if ENGLISH_LANG
	 * Master/slave global config��correspinding��
	 * \else
	 * ����ʽȫ�����ã���Ӧ��
	 * \endif
	 */
	public static String CFG_CMD_MASTERSLAVE_GLOBAL    = "MasterSlaveTrackerGlobal";      
	/**
	 * \if ENGLISH_LANG
	 * Video analysis global config(corresponding to CFG_ANALYSEWHOLE_INFO)
	 * \else
	 * ��Ƶ������������(��ӦCFG_ANALYSEWHOLE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSEWHOLE    = "VideoAnalyseWhole";     
	/**
	 * \if ENGLISH_LANG
	 * Video input border config(corresponding CFG_VIDEO_IN_BOUNDARY)
	 * \else
	 * ��Ƶ����߽�����(��ӦCFG_VIDEO_IN_BOUNDARY)
	 * \endif
	 */
	public static String CFG_CMD_VIDEO_IN_BOUNDARY    = "VideoInBoundary";    
	/**
	 * \if ENGLISH_LANG
	 * TV wall scheme (corresponding CFG_MONITORWALL_COLLECTION group)
	 * \else
	 * ����ǽԤ��(��ӦCFG_MONITORWALL_COLLECTION����)
	 * \endif
	 */
	public static String	CFG_CMD_MONITORWALL_COLLECTION    = "MonitorWallCollection";    
	/**
	 * \if ENGLISH_LANG
	 * Analog matrix(corresponding to CFG_ANALOG_MATRIX_INFO)
	 * \else
	 * ģ�����(��ӦCFG_ANALOG_MATRIX_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALOGMATRIX	    = "AnalogMatrix";    	
	/**
	 * \if ENGLISH_LANG
	 * Analog matrix protocol config(Corresponding CFG_ANALOG_MATRIX_PROTOCOL group)
	 * \else
	 * ģ�����Э������(��ӦCFG_ANALOG_MATRIX_PROTOCOL����)
	 * \endif
	 */
	public static String CFG_CMD_ANALOG_MATRIX_PROTOCOL    = "AnalogMatrixProtocol";    
	/**
	 * \if ENGLISH_LANG
	 * Video output title(corresponding to CFG_VIDEO_OUT_TITLE)
	 * \else
	 * ��Ƶ�������(��ӦCFG_VIDEO_OUT_TITLE)
	 * \endif
	 */
	public static String	CFG_CMD_VIDEO_OUT_TITLE	    = "VideoOutputTitle";    	
	/**
	 * \if ENGLISH_LANG
	 * Hark disk data flow alarm config(corresponding to CFG_DISK_FLUX_INFO)
	 * \else
	 * Ӳ������������������(��ӦCFG_DISK_FLUX_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DISK_FLUX_ALARM	    = "DiskFluxAlarm";    	
	/**
	 * \if ENGLISH_LANG
	 * Net data flow alarm config(corresponding to CFG_NET_FLUX_INFO)
	 * \else
	 * ��������������������(��ӦCFG_NET_FLUX_INFO)
	 * \endif
	 */
	public static String CFG_CMD_NET_FLUX_ALARM	    = "NetFluxAlarm";    	
	/**
	 * \if ENGLISH_LANG
	 * Net protocol config(corresponding to CFG_DVRIP_INFO)
	 * \else
	 * ����Э������(��ӦCFG_DVRIP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DVRIP                 = "DVRIP";                
	/**
	 * \if ENGLISH_LANG
	 * and camera corresponding area config(corresponding to  CFG_PARKINGSPACE_SCREEN_INFO ,group��element max value is DH_PRODUCTION_DEFNITION.nMaxParkingSpaceScreen)
	 * \else 
	 * ������Խӵ�����������(��Ӧ CFG_PARKINGSPACE_SCREEN_INFO ,�����飬Ԫ�����ֵ��SDK_PRODUCTION_DEFNITION.nMaxParkingSpaceScreen)
	 * \endif
	 */
	public static String CFG_CMD_PARKINGSPACE_SCREEN   = "ParkingSpaceScreen";    
	/**
	 * \if ENGLISH_LANG
	 * Spot setup(special spot and general spot setup)(corresponding to  CFG_PARKINGSPACE_STATUS_INFO ��is group��element max value is DH_PRODUCTION_DEFNITION.nMaxRoadWays)
	 * \else
	 * ��λ����(ר�г�λ����ͨ��λ����)(��Ӧ CFG_PARKINGSPACE_STATUS_INFO �������飬Ԫ�����ֵ��SDK_PRODUCTION_DEFNITION.nMaxRoadWays)
	 * \endif
	 */
	public static String CFG_CMD_PARKINGSPACE_STATUS   = "ParkingSpaceCellStatus";    
	/**
	 * \if ENGLISH_LANG
	 * Platform custom info(corresponding to  CFG_CLIENT_CUSTOM_INFO)
	 * \else
	 * ƽ̨�Զ�����Ϣ(��Ӧ CFG_CLIENT_CUSTOM_INFO)
	 * \endif
	 */
	public static String CFG_CMD_CLIENT_CUSTOM_DATA    = "ClientCustomData";     
	/**
	 * \if ENGLISH_LANG
	 * Writing format config(corresponding to  CFG_BURN_RECORD_FORMAT)
	 * \else
	 * ��¼��ʽ����(��Ӧ CFG_BURN_RECORD_FORMAT)
	 * \endif
	 */
	public static String CFG_CMD_BURN_RECORD_FORMAT    = "BurnRecordFormat";     
	/**
	 * \if ENGLISH_LANG
	 * Multi disk sync write(corresponding to  CFG_MULTIBURN_INFO)group, each element means one group multi-disk sync writing and calibration
	 * \else
	 * �����ͬ����¼(��Ӧ CFG_MULTIBURN_INFO)��һ�����飬ÿһ��Ԫ�ر�ʾһ������ͬ����¼��У��
	 * \endif
	 */
	public static String CFG_CMD_MULTIBURN             = "MultiBurn";            
	/**
	 * \if ENGLISH_LANG
	 * Encode encryption config info( CFG_ENCODE_ENCRYPT_CHN_INFO )
	 * \else
	 * �������������Ϣ( CFG_ENCODE_ENCRYPT_CHN_INFO )
	 * \endif
	 */
	public static String	CFG_CMD_ENCODE_ENCRYPT	    = "EncodeEncrypt";    	
	/**
	 * \if ENGLISH_LANG
	 * PTZ channel zoom config(corresponding to  CFG_VIDEO_IN_ZOOM)
	 * \else
	 * ��̨ͨ���䱶����(��Ӧ CFG_VIDEO_IN_ZOOM)
	 * \endif
	 */
	public static String CFG_CMD_VIDEO_IN_ZOOM         = "VideoInZoom";          
	/**
	 * \if ENGLISH_LANG
	 * Snapshot config(corresponding to  CFG_SNAP_INFO)
	 * \else
	 * ץͼ����(��Ӧ CFG_SNAP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_SNAP			    = "Snap";    			
	/**
	 * \if ENGLISH_LANG
	 * Net storage server limit config(corresponding to  CFG_REMOTE_STORAGELIMIT_GROUP)
	 * \else
	 * ����洢��������������(��Ӧ CFG_REMOTE_STORAGELIMIT_GROUP)
	 * \endif
	 */
	public static String CFG_CMD_REMOTE_STORAGE_LIMIT      = "RemoteStorageLimit";       
	/**
	 * \if ENGLISH_LANG
	 * Special usage directory custom(corresponding to  CFG_SPECIAL_DIR_INFO)
	 * \else
	 * ������;Ŀ¼����(��Ӧ CFG_SPECIAL_DIR_INFO)
	 * \endif
	 */
	public static String CFG_CMD_SPECIAL_DIR		    = "SpecialDirectoryDefine";    
	/**
	 * \if ENGLISH_LANG
	 * After shut down delay auto boot up config(corresponding to  CFG_AUTO_STARTUP_DELAY_INFO)
	 * \else
	 * �ػ�����ʱ�Զ���������(��Ӧ CFG_AUTO_STARTUP_DELAY_INFO)
	 * \endif
	 */
	public static String CFG_CMD_AUTO_STARTUP_DELAY    = "AutoStartupDelay";    		
	/**
	 * \if ENGLISH_LANG
	 * focus setup(corresponding to  CFG_VIDEO_IN_FOCUS)
	 * \else
	 * �۽�����(��Ӧ CFG_VIDEO_IN_FOCUS)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOIN_FOCUS         = "VideoInFocus";         
	/**
	 * \if ENGLISH_LANG
	 * Encode self-adaptive config(corresponding to  CFG_ENCODE_ADAPT_INFO)
	 * \else
	 * ��������Ӧ����(��Ӧ CFG_ENCODE_ADAPT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ENCODE_ADAPT	    = "EncodeAdapt";    	
	/**
	 * \if ENGLISH_LANG
	 * Video analysis config(corresponding to CFG_VIDEO_ANALYSE_CALIBRATEAREA)
	 * \else
	 * ��Ƶ�����궨����(��ӦCFG_VIDEO_ANALYSE_CALIBRATEAREA)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOANALYSE_CALIBRATE    = "VideoAnalyseCalibrate";     
	/**
	 * \if ENGLISH_LANG
	 * PTZ preset config (corresponding to structure PTZ_PRESET_INFO)
	 * \else
	 * ��̨Ԥ�õ�����(��Ӧ�ṹPTZ_PRESET_INFO)
	 * \endif
	 */
	public static String CFG_CMD_PTZ_PRESET             = "PtzPreset";           
	/**
	 * \if ENGLISH_LANG
	 * Period speed limit config(corresponding to structure CFG_TIMESPEEDLIMIT_LIST)
	 * \else
	 * ʱ�������ֵ����(��Ӧ�ṹ�� CFG_TIMESPEEDLIMIT_LIST)
	 * \endif
	 */
	public static String CFG_CMD_TIMESPEEDLIMIT	    = "TimeSpeedLimit";    
	/**
	 * \if ENGLISH_LANG
	 * Prompt config(corresponding to structure CFG_VOICEALERT_LIST)
	 * \else
	 * ������ʾ����(��Ӧ�ṹ�� CFG_VOICEALERT_LIST)
	 * \endif
	 */
	public static String CFG_CMD_VOICEALERT		    = "VoiceAlert";    	
	/**
	 * \if ENGLISH_LANG
	 * Audio spirit(corresponding to  CFG_AUDIO_SPIRIT)
	 * \else
	 * ��������(��Ӧ CFG_AUDIO_SPIRIT)
	 * \endif
	 */
	public static String CFG_CMD_AUDIO_SPIRIT	    = "AudioSpirit";
	
	public static String CFG_CMD_AUDIO_MATRIX_SILENCE = "AudioMatrixSilence"; // ������������(��Ӧ CFG_AUDIO_MATRIX_SILENCE)
	
	public static String CFG_CMD_AUDIO_MATRIX                = "AudioMatrixConfig";         // ��Ƶ��������(��Ӧ CFG_AUDIO_MATRIX)
	
	/**
	 * \if ENGLISH_LANG
	 * Combine channel config (corresponding to  CFG_COMPOSE_CHANNEL)
	 * \else
	 * �ϳ�ͨ������(��Ӧ CFG_COMPOSE_CHANNEL)
	 * \endif
	 */
	public static String CFG_CMD_COMPOSE_CHANNEL	    = "ComposeChannel";    
	
	public static String CFG_CMD_COMPOSE_LINKAGE         = "ComposeLinkage";            // �ϳ�ͨ������  ͥ������ʹ�ã�֤���л�����(��Ӧ CFG_COMPOSE_CHANNEL)
	/**
	 * \if ENGLISH_LANG
	 * Lower matrix config(corresponding to  CFG_LOWER_MATRIX_LIST) 
	 * \else
	 * ��λ��������(��Ӧ CFG_LOWER_MATRIX_LIST)  	
	 * \endif
	 */
	public static String CFG_CMD_LOWER_MATRIX	    = "LowerMatrix";    
	
	public static String CFG_CMD_INFRARED_BOARD_TEMPLATE	 = "InfraredBoardTemplate";	// �������ģ��(��Ӧ CFG_INFRARED_BOARD_TEMPLATE_GROUP)
	public static String CFG_CMD_INFRARED_BOARD		 = "InfraredBoard";	// �������ģ��(��Ӧ CFG_INFRARED_BOARD_GROUP)
	public static String CFG_CMD_VIDEOIN_EXPOSURE     = "VideoInExposure";   // �ع�����(��ӦCFG_VIDEOIN_EXPOSURE_INFO)
	
	public static String CFG_CMD_ACCESS_GENERAL       = "AccessControlGeneral"; // �Ž���������(��Ӧ CFG_ACCESS_GENERAL_INFO)
	public static String CFG_CMD_ACCESS_EVENT         = "AccessControl";        // �Ž��¼�����(��Ӧ CFG_ACCESS_EVENT_INFO ����)     
	public static String CFG_CMD_WIRELESS			 = "Wireless";			// ����������������(��Ӧ CFG_WIRELESS_INFO)
	public static String CFG_CMD_ALARMSERVER			 = "AlarmServer";		// ��������������(��ӦCFG_ALARMCENTER_INFO)
	public static String CFG_CMD_COMMGLOBAL			 = "CommGlobal";		// ����ȫ������(��Ӧ CFG_COMMGLOBAL_INFO)
	public static String CFG_CMD_ANALOGALARM			 = "AnalogAlarm";		// ģ��������ͨ������(��ӦCFG_ANALOGALARM_INFO)
	public static String CFG_CMD_ALARMOUT			 = "AlarmOut";			// �������ͨ������(��ӦCFG_ALARMOUT_INFO)
	public static String CFG_CMD_NTP					 = "NTP";				// ʱ��ͬ��������(��ӦCFG_NTP_INFO)
	public static String CFG_CMD_ALARMBELL			 = "AlarmBell";			// ��������(��ӦCFG_ALARMBELL_INFO)
	public static String CFG_CMD_MOBILE				 = "Mobile";			// �ƶ����ҵ������(��ӦCFG_MOBILE_INFO)
	public static String CFG_CMD_PHONEEVENTNOTIFY	 = "PhoneEventNotify";	// (��ӦCFG_PHONEEVENTNOTIFY_INFO)
	public static String CFG_CMD_PSTN_ALARM_SERVER	 = "PSTNAlarmServer";	// �绰������������(CFG_PSTN_ALARM_CENTER_INFO)
	public static String CFG_CMD_AUDIO_OUTPUT_VOLUME	 = "AudioOutputVolume";	// ��Ƶ�������(CFG_AUDIO_OUTPUT_VOLUME)
	public static String CFG_CMD_ALARMKEYBOARD		 = "AlarmKeyboard";		// ������������(CFG_ALARMKEYBOARD_INFO)
	public static String CFG_CMD_POWERFAULT			 = "PowerFault";		// ��Դ��������(CFG_POWERFAULT_INFO)
	public static String CFG_CMD_CHASSISINTRUSION	 = "ChassisIntrusion";	// �������ֱ���(���𱨾�)����(CFG_CHASSISINTRUSION_INFO)
	public static String CFG_CMD_EXALARMBOX			 = "ExAlarmBox";		// ��չ���������� (CFG_EXALARMBOX_INFO)
	public static String CFG_CMD_EXALARMOUTPUT		 = "ExAlarmOut";		// ��չ�����������(CFG_EXALARMOUTPUT_INFO)
	public static String CFG_CMD_EXALARMINPUT		 = "ExAlarm";			// ��չ������������(CFG_EXALARMINPUT_INFO)
	public static String CFG_CMD_ACCESSTIMESCHEDULE	 = "AccessTimeSchedule"; // �Ž�ˢ��ʱ���(CFG_ACCESS_TIMESCHEDULE_INFO)
	public static String CFG_CMD_URGENCY				 = "Emergency";			// �����¼�����(CFG_URGENCY_INFO)
	public static String CFG_CMD_SENSORSAMPLING		 = "SensorSampling";	// ����������(CFG_SENSORSAMPLING_INFO)
	public static String CFG_CMD_STP					 = "STP";				// ��������(CFG_STP_INFO)
	public static String CFG_CMD_ALARM_SUBSYSTEM		 = "AlarmSubSystem";	// ������ϵͳ����(CFG_ALARM_SUBSYSTEM_INFO)
	public static String CFG_CMD_BATTERY_LOW_POWER	 = "BatteryLowPowerAlarm";	// ��ص���������(CFG_BATTERY_LOW_POWER_INFO)
	public static String CFG_CMD_SNAPLIKAGE           = "SnapLinkage";       // ץͼͨ��������������(CFG_SNAPLINKAGE_INFO)
	public static String CFG_CMD_AUDIOINPUT           = "AudioInput";        // ��Ƶ��������(CFG_AUDIO_INPUT)
	public static String CFG_CMD_EMAIL				 = "Email";				// �ʼ���������(CFG_EMAIL_INFO)
	public static String CFG_CMD_TRAFFIC_TRANSFER_OFFLINE  = "TrafficTransferOffline";    // ���������ļ�����(TRAFFIC_TRANSFER_OFFLINE_INFO)
	public static String CFG_CMD_COMMSUBSCRIBE		 = "CommSubscribe";		// ���Ĵ�����������(CFG_DEVCOMM_SUBSCRIBE)
	public static String CFG_CMD_PARKINGSPACE_LIGHT_STATE  = "ParkingSpaceLightState";    // ��λ״̬��Ӧ�ĳ�λָʾ��(CFG_PARKINGSPACE_LIGHT_STATE)
	public static String CFG_CMD_AIRCONDITION		 = "AirCondition";		// �յ��豸����(CFG_AIRCONDITION_INFO)
	public static String CFG_CMD_COMPRESS_PLAY        = "CompressPlay";      //ѹ���ط�����(CFG_COMPRESS_PLAY_INFO)
	public static String CFG_CMD_BUILDING             = "Building";          // VTO¥������(CFG_BUILDING_INFO)
	public static String CFG_CMD_BUILDING_EXTERNAL    = "BuildingExternal";  // VTO¥����չ����(CFG_BUILDING_EXTERNAL_INFO)
	public static String CFG_CMD_DIALRULE             = "DialRule";          // ���Ź���(CFG_DIALRULE_INFO)
	public static String CFG_CMD_OIL_MASS_INFO        = "OilMassInfo";       // ������������(CFG_OIL_MASS_INFO)
	public static String CFG_CMD_FISHEYE_INFO         = "FishEye";           // ������ϸ��Ϣ����(CFG_FISHEYE_DETAIL_INFO)
	public static String CFG_CMD_VTNOANSWER_FORWARD   = "VTNoAnswerForward"; // ƽ̨�·�������Ӧ��ת�������б�(CFG_VT_NOANSWER_FORWARD_INFO)
	public static String CFG_CMD_VTO_CALL             = "VTOCall";           // VTO��������(CFG_VTO_CALL_INFO)
	public static String CFG_CMD_MACCONFLICT          = "MacConflict";       // MAC��ͻ��������(CFG_MACCONFLICT_INFO)
	public static String CFG_CMD_IDLEMOTION_INFO      = "IdleMotion";        // ���ж�������(CFG_IDLE_MOTION_INFO)
	public static String CFG_CMD_MONITORWALL_COLL_TOUR  = "MonitorWallCollectionTour";   // ����ǽԤ����Ѳ����(CFG_MONITORWALL_COLLECTION_TOUR_INFO)
	public static String CFG_CMD_PSTN_BREAK_LINE      = "PSTNBreakLine";     // PSTN�����¼�����(CFG_PSTN_BREAK_LINE_INFO)
	public static String CFG_CMD_NET_COLLECTION       = "NetCollection";	    // ����ɼ��豸����(CFG_NET_COLLECTION_INFO)
	public static String CFG_CMD_ALARM_SLOT_BOND      = "AlarmSlotBond";     // ����Slot�ڵ�����������豸�Ķ�Ӧ��ϵ(CFG_ALARM_SLOT_BOND_INFO)
	public static String CFG_CMD_TRAFFICSTROBE        = "TrafficStrobe";     // ��բ����(CFG_TRAFFICSTROBE_INFO)
	public static String CFG_CMD_TRAFFICVOICE         = "TrafficVoiceBroadcast";         // ���ܽ�ͨ������������(CFG_TRAFFICVOICE_BROADCAST)
	public static String CFG_CMD_STANDING_TIME        = "StandingTime";      // ͣ��ʱ������(CFG_STANDING_TIME_INFO)
	public static String CFG_CMD_ENCLOSURE_TIME_SCHEDULE   = "EnclosureTimeSchedule";     // ����Χ������ʱ�������(CFG_ENCLOSURE_TIME_SCHEDULE_INFO)
	public static String CFG_CMD_ECKCONFIG			 = "ECKConfig";			// ͣ��������ڿ���������(CFG_ECKCONFIG_INFO)
	public static String CFG_CMD_PARKING_CARD         = "ParkingCard";       // ͣ���������ˢ�������¼�����(CFG_PARKING_CARD_INFO)
	public static String CFG_CMD_RCEMERGENCY_CALL      = "RCEmergencyCall";  // �������б����¼�����(CFG_RCEMERGENCY_CALL_INFO)
	public static String CFG_CMD_LANES_STATE_REPORT    = "LanesStateReport"; // ������Ϣ�ϱ�����(CFG_LANES_STATE_REPORT)
	public static String CFG_CMD_OPEN_DOOR_GROUP      = "OpenDoorGroup";     // ���˶࿪�ŷ�ʽ�������(CFG_OPEN_DOOR_GROUP_INFO)
	public static String CFG_CMD_OPEN_DOOR_ROUTE      = "OpenDoorRoute";     // ����·�߼��ϣ���Ʒ���Ǳ·������(CFG_OPEN_DOOR_ROUTE_INFO)
	public static String CFG_CMD_BURNPLAN             = "BurnPlan";          // ��¼�ƻ�����(��ӦCFG_BURNPLAN_INFO)
	public static String CFG_CMD_SCADA_DEV            = "SCADADev";          // ���ɼ��豸����(CFG_SCADA_DEV_INFO)
	public static String CFG_CMD_VSP_GAYS             = "VSP_GAYS";          // ����һ��ƽ̨��������(CFG_VSP_GAYS_INFO)
	public static String CFG_CMD_AUDIODETECT          = "AudioDetect";       // ��Ƶ��ⱨ������(CFG_AUDIO_DETECT_INFO����)
	public static String CFG_CMD_GUIDESCREEN          = "GuideScreen";       // �յ���ϵͳ����(CFG_GUIDESCREEN_INFO)
	public static String CFG_CMD_VTS_CALL_INFO        = "VTSCallInfo";       // VTS��������(CFG_VTS_CALL_INFO)
	public static String CFG_CMD_DEV_LIST             = "DevList";           // �豸�б�����(CFG_DEV_LIST_INFO)
	public static String CFG_CMD_CALIBRATE_MATRIX     = "CalibrateMatrix";   // ����ʽ�������궨��������(CFG_CALIBRATE_MATRIX_INFO)
	public static String CFG_CMD_DEFENCE_AREA_DELAY   = "DefenceAreaDelay";  // ������ʱ����(CFG_DEFENCE_AREA_DELAY_INFO)
	
	public static String CFG_CMD_THERMO_GRAPHY		        = "ThermographyOptions";       // �ȳ�������ͷ��������(CFG_THERMOGRAPHY_INFO)
	public static String CFG_CMD_THERMOMETRY_RULE	        = "ThermometryRule";           // �ȳ�����¹�������(CFG_RADIOMETRY_RULE_INFO)
	public static String CFG_CMD_TEMP_STATISTICS		        = "TemperatureStatistics";     // �¶�ͳ������(CFG_TEMP_STATISTICS_INFO)
	public static String CFG_CMD_THERMOMETRY			        = "HeatImagingThermometry";    // �ȳ������ȫ������(CFG_THERMOMETRY_INFO)
	public static String CFG_CMD_LIGHTING                    = "Lighting";                  // �ƹ�����(CFG_LIGHTING_INFO)
	public static String CFG_CMD_RAINBRUSHMODE               = "RainBrushMode";             // ��ˢģʽ�������(��Ӧ CFG_RAINBRUSHMODE_INFO����)
	public static String CFG_CMD_LIGHTINGSCHEDULE            = "LightingSchedule";			// �ƹ�ƻ�����(��Ӧ CFG_LIGHTINGSCHEDULE_INFO)
	public static String CFG_CMD_EMERGENCY_RECORD_FOR_PULL   = "EmergencyRecordForPull";    // ����¼��洢���ã����ڿͻ����������ķ�ʽ���ڿͻ��������洢�쳣֮�󣬽��н���¼��洢(CFG_EMERGENCY_RECORD_FOR_PULL_INFO)
	public static String CFG_CMD_ALARM_SHIELD_RULE           = "AlarmShieldRule";           // �澯���ι���(CFG_ALARM_SHIELD_RULE_INFO)
	public static String CFG_CMD_VIDEOIN_ANALYSERULE         = "VideoInAnalyseRule";        // ��Ƶͨ�����ܹ�������(CFG_VIDEOIN_ANALYSE_RULE_INFO)
	public static String CFG_CMD_ACCESS_WORK_MODE            = "AccessWorkMode";            // ��������ģʽ(��Ӧ CFG_ACCESS_WORK_MODE_INFO ����)
	public static String CFG_CMD_VIDEO_TALK_PHONE_GENERAL    = "VideoTalkPhoneGeneral";     // ��Ƶ�Խ��绰ͨ������(CFG_VIDEO_TALK_PHONE_GENERAL)
	public static String CFG_CMD_TRAFFIC_SNAP_MOSAIC         = "TrafficSnapMosaic";         // ץͼ�ϳ�����(��Ӧ CFG_TRAFFIC_SNAP_MOSAIC_INFO)
	public static String CFG_CMD_SCENE_SNAP_RULE             = "SceneSnapShotWithRule";     // ����ץ������(��Ӧ CFG_SCENE_SNAPSHOT_RULE_INFO)
	public static String CFG_CMD_PTZTOUR                     = "PtzTour";                   // ��̨Ѳ��·������(��Ӧ CFG_PTZTOUR_INFO)
	public static String CFG_CMD_VTO_INFO		            = "VTOInfo";		            // �ſڻ�����(��Ӧ CFG_VTO_LIST)
	public static String CFG_CMD_TS_POINT                    = "TSPoint";                   // ������У׼����(��Ӧ CFG_TSPOINT_INFO)
	public static String CFG_CMD_VTH_NUMBER_INFO             = "VTHNumberInfo";             // ���ڻ�������Ϣ(��Ӧ CFG_VTH_NUMBER_INFO)
	public static String CFG_CMD_GPS                         = "GPS";                       // GPS����(��Ӧ CFG_GPS_INFO_ALL)
	public static String CFG_CMD_VTO_BASIC_INFO		        = "VTOBasicInfo";		        // VTO������Ϣ (��Ӧ CFG_VTO_BASIC_INFO)
	public static String CFG_CMD_SHORTCUT_CALL		        = "ShortcutCall";		        // ��ݺ����� (��Ӧ CFG_SHORTCUT_CALL_INFO)
	public static String CFG_CMD_GPS_LOCATION_VER            = "GPSLocationVersion";        // ��¼��GPSLocation�İ汾��(��Ӧ CFG_LOCATION_VER_INFO)
	public static String CFG_CMD_PARKING_SPACE_ACCESS_FILTER = "ParkingSpaceAccessFilter";  // �豸�ɷ��ʵ�ַ��������(��Ӧ CFG_PARKING_SPACE_ACCESS_FILTER_INFO)
	public static String CFG_CMD_WORK_TIME                   = "WorkTime";                  // ����ʱ������(��Ӧ CFG_WORK_TIME_INFO)
	public static String CFG_CMD_PARKING_SPACE_LIGHT_GROUP   = "ParkingSpaceLightGroup";    // ��λָʾ�Ʊ�������(��Ӧ CFG_PARKING_SPACE_LIGHT_GROUP_INFO_ALL)
	public static String CFG_CMD_CUSTOM_AUDIO                = "CustomAudio";               // �Զ�����Ƶ����(CFG_CUSTOM_AUDIO)
	public static String CFG_CMD_WIFI_SEARCH                 = "AroudWifiSearch";           // �豸ͨ��wifiģ��ɨ����Χ�����豸����(��Ӧ CFG_WIFI_SEARCH_INFO)
	public static String CFG_CMD_G3G4AUTOCHANGE              = "G3G4AutoChange";            // �����豸ͨ��ģ��3G 4G�Զ��л�(CFG_G3G4AUTOCHANGE)
	public static String CFG_CMD_CHECKCODE                   = "CheckCode";                 // ˢ����У����У������(��Ӧ CFG_CHECKCODE_INFO)
	public static String CFG_CMD_VSP_SCYDKD                  = "VSP_SCYDKD";                // �Ĵ��ƶ���������ƽ̨��������(��Ӧ CFG_VSP_SCYDKD_INFO)
	public static String CFG_CMD_VIDEOIN_DAYNIGHT           = "VideoInDayNight";           // �����о��ҹ����(��Ӧ CFG_VIDEOIN_DAYNIGHT_INFO)
	public static String CFG_CMD_PTZ_POWERUP                = "PowerUp";                   // ��̨������������(��Ӧ CFG_PTZ_POWERUP_INFO)
	public static String CFG_CMD_AUDIO_MIX_CHANNEL          = "AudioMixChannel";           // ���ö���ÿ������Ƶͨ�������(��Ӧ CFG_AUDIO_MIX_CHANNEL_INFO_ALL)
	public static String CFG_CMD_AUDIO_TOUCH                = "AudioTouch";                // ���������������б仯(��Ӧ CFG_AUDIO_TOUCH_INFO_ALL)
	public static String CFG_CMD_VIDEO_MOSAIC				= "VideoMosaic";				// �����˵�������(��ӦCFG_VIDEO_MOSAIC_INFO)
	public static String CFG_CMD_VTH_REMOTE_IPC_INFO        = "VTHRemoteIPCInfo";          // VTH��Զ��IPC����(��Ӧ CFG_VTH_REMOTE_IPC_INFO)����������ȫ�ֵģ�������ͨ��
	public static String CFG_CMD_UNFOCUSDETECT              = "UnFocusDetect";             // �齹�������(��ӦCFG_UNFOCUSDETECT_INFO)
	public static String CFG_CMD_MOVE_DETECT				= "MovedDetect";				// ��������������(��ӦCFG_MOVE_DETECT_INFO)
	public static String CFG_CMD_FLOODLIGHT                 = "Floodlight";                // �����������ƿ�������(��ӦCFG_FLOODLIGHT_CONTROLMODE_INFO)
	public static String CFG_CMD_AIRFAN                     = "AirFan";                    // �����շ��ȿ�������(��ӦCFG_AIRFAN_CONTROLMODE_INFO)
	public static String CFG_CMD_WLAN                       = "WLan";                      // WLAN����(��Ӧ CFG_NETAPP_WLAN)
	public static String CFG_CMD_SMART_ENCODE				= "SmartEncode";               // Smart H264���뷽ʽ(��Ӧ CFG_SMART_ENCODE_INFO)
	public static String CFG_CMD_COURSE_CHANNELBIND         = "CourseChannelBind";		   // ¼������ͨ���󶨹�ϵ����(��Ӧ�ṹ��  CFG_COURSE_CHANNELBIND_INFO) 
		
	
	/************************************************************************
	 ** ����������  ��ӦCLIENT_QueryNewSystemInfo
	 ***********************************************************************/
	public static String CFG_CAP_CMD_VIDEOANALYSE   =   "devVideoAnalyse.getCaps"   ;   		// ��Ƶ����������(��ӦCFG_CAP_ANALYSE_INFO)
	public static String CFG_NETAPP_REMOTEDEVICE	   =   "netApp.getRemoteDeviceStatus"   ;   	// ��ȡ����豸�ĵ�����״̬(��ӦCFG_REMOTE_DEVICE_STATUS)
	public static String CFG_CAP_CMD_PRODUCTDEFINITION   =   "magicBox.getProductDefinition"   ;   // �����豸��Ϣ
	public static String CFG_DEVICE_CAP_CMD_VIDEOANALYSE   =   "intelli.getVideoAnalyseDeviceChannels"   ;     // �豸���ܷ�������(��ӦCFG_CAP_DEVICE_ANALYSE_INFO)�������豸
	public static String CFG_DEVICE_CAP_NEW_CMD_VIDEOANALYSE   =   "devVideoAnalyse.factory.getCollect"   ;    // �豸���ܷ�������(��ӦCFG_CAP_DEVICE_ANALYSE_INFO)
	public static String CFG_CAP_CMD_CPU_COUNT    =   "magicBox.getCPUCount"   ;                 // ���CPU����
	public static String CFG_CAP_CMD_CPU_USAGE    =   "magicBox.getCPUUsage"   ;                 // ��ȡCPUռ����
	public static String CFG_CAP_CMD_MEMORY_INFO    =   "magicBox.getMemoryInfo"   ;             // ����ڴ�����
	public static String CFG_CAP_CMD_DEVICE_STATE   =   "trafficSnap.getDeviceStatus"   ;        // ��ȡ�豸״̬��Ϣ (��ӦCFG_CAP_TRAFFIC_DEVICE_STATUS)
	public static String CFG_CAP_CMD_VIDEOINPUT   =   "devVideoInput.getCaps"   ;                // ��Ƶ����������(��ӦCFG_CAP_VIDEOINPUT_INFO)
	public static String CFG_USERMANAGER_ACTIVEUSER      =   "userManager.getActiveUserInfoAll"   ;        // �õ����л���û���Ϣ(��ӦCFG_ACTIVEUSER_INFO)
	public static String CFG_CAP_VIDEOSTAT_SUMMARY       =   "videoStatServer.getSummary"   ;              // ��ȡ��Ƶͳ��ժҪ��Ϣ(��ӦCFG_VIDEOSATA_SUMMARY_INFO)
	public static String CFG_CAP_CMD_VIDEODIAGNOSIS_SERVER   =   "videoDiagnosisServer.getCaps"   ;   		// ��ȡ��Ƶ��Ϸ�������(CFG_VIDEODIAGNOSIS_CAPS_INFO)
	public static String CFG_CMD_VIDEODIAGNOSIS_GETCOLLECT            =   "videoDiagnosisServer.factory.getCollect"   ;               // ��ȡ��Ƶ���ͨ����Ŀ(CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO)
	public static String CFG_CMD_VIDEODIAGNOSIS_GETSTATE              =   "videoDiagnosisServer.getState"   ;                         // ��ȡ��Ƶ��Ͻ���״̬(CFG_VIDEODIAGNOSIS_STATE_INFO)
	public static String CFG_CAP_CMD_SERVICE_LIST                     =   "system.listService"   ;          //��ȡ��������֧�ֵķ����б�(CFG_DEV_SERVICE_LIST)
	public static String CFG_CAP_CMD_EVENTHANDLER      =   "capsManager.get&EventManagerEventHandler"   ;         // ��ȡ��������������������(CFG_CAP_EVENTHANDLER_INFO)
	public static String CFG_CAP_ALARM                 =   "alarm.getAlarmCaps"   ;                               // ��ȡ����������(CFG_CAP_ALARM_INFO)
	public static String CFG_CAP_CMD_AUDIO_ANALYSE     =   "devAudioAnalyse.getCaps"   ;                          // ��ȡ��Ƶ����������(CFG_CAP_AUDIO_ANALYSE_INFO)
	public static String CFG_CMD_MASTERSLAVE_GETCOLLECT          =   "masterSlaveTracker.factory.getCollect"   ;      // ��ȡ����ʽ������ͨ����Ŀ(��Ӧ�ṹ��CFG_MASTERSLAVETRACKER_INFO)
	public static String CFG_CAP_CMD_MASTERSLAVE                 =   "capsManager.get&MasterSlaveTracker"   ;         // ��ȡ����ʽ�豸������(CFG_CAP_MASTERSLAVE_INFO)
	public static String CFG_CAP_CMD_FOCUS_STATE	   =   "devVideoInput.getFocusStatus"   ;   					// ��ȡ��ͷ�۽�״̬��Ϣ (��ӦCFG_CAP_FOCUS_STATUS)
	public static String CFG_CAP_CMD_NETAPP            =   "netApp.getCaps"   ;                                      // ��ȡ����Ӧ��������(��ӦCFG_CAP_NETAPP)
	public static String CFG_CAP_CMD_PTZ_ENABLE     =   "ptz.factory.instance"   ;   				// ��ȡ��̨֧����Ϣ(CFG_CAP_PTZ_ENABLEINFO )
	public static String CFG_CAP_CMD_RECORD		   =   "recordManager.getCaps"   ;                   // ��ȡ¼��������(CFG_CAP_RECORD_INFO)
	public static String CFG_CAP_CMD_BURN_MANAGER      =   "BurnManager.getCaps"   ;                     // ��ȡ��¼����������( CFG_CAP_BURN_MANAGER)
	public static String CFG_CAP_CMD_PTZ     	   =   "ptz.getCurrentProtocolCaps"   ;   		// ��ȡ��̨������(CFG_PTZ_PROTOCOL_CAPS_INFO)
	public static String CFG_CMD_ENCODE_GETCAPS        =   "encode.getCaps"   ;                          // ��ȡ����������(CFG_ENCODECAP)
	public static String CFG_CAP_CMD_VIDEOINPUT_EX     =   "devVideoInput.getCapsEx"   ;                 // ��Ƶ������������չ(��ӦCFG_CAP_VIDEOINPUT_INFO_EX)
	public static String CFG_CAP_CMD_ANALYSE_MODE      =   "intelli.getCaps.AnalyseMode"   ;             // ��ȡ�豸���ܷ���ģʽ(��Ӧ CFG_ANALYSE_MODE)
	public static String CFG_CAP_CMD_EVENTMANAGER      =   "eventManager.getCaps"   ;   		// ��ȡ�豸������������,��Э���ѷϳ�,�¿�����ʹ�ø��ֶ�(CFG_CAP_EVENTMANAGER_INFO)
	public static String CFG_CAP_CMD_FILEMANAGER	   =   "FileManager.getCaps"   ;   		// ��ȡ�ļ�����(CFG_CAP_FILEMANAGER)
	public static String	CFG_CAP_CMD_LOG			   =   "log.getCaps"   ;   				// ��ȡ��־��������(CFG_CAP_LOG)
	public static String CFG_CAP_CMD_SPEAK		   =   "speak.getCaps"   ;   				// ��������������(CFG_CAP_SPEAK)
	public static String CFG_CAP_CMD_ACCESSCONTROLMANAGER   =   "accessControlManager.getCaps"   ;   // �Ž�����(CFG_CAP_ACCESSCONTROL)
	public static String CFG_CAP_CMD_EXALARM		   =   "alarm.getExAlarmCaps"   ;   				// ��ȡ��չ����������, (��Ӧ�ṹ�� CFG_CAP_EXALARM_INFO)
	public static String CFG_CAP_CMD_EXALARMBOX	   =   "alarm.getExAlarmBoxCaps"   ;   			// ��ȡ��չ������������, (��Ӧ�ṹ�� CFG_CAP_EXALARMBOX_INFO)
	public static String CFG_CAP_CMD_RECORDFINDER   =   "RecordFinder.getCaps"   ;   				// ��ȡ��ѯ��¼������, (��Ӧ�ṹ�� CFG_CAP_RECORDFINDER_INFO)
	public static String CFG_CAP_CMD_ANALOGALARM	   =   "AnalogAlarm.getCaps"   ;   		// ģ������������ͨ������(��Ӧ�ṹ�� CFG_CAP_ANALOGALARM)
	public static String CFG_CAP_CMD_LOWRATEWPAN	   =   "LowRateWPAN.getCaps"   ;   		// ��ȡLowRateWPAN����(��Ӧ�Ľṹ�� CFG_CAP_LOWRATEWPAN)	
	
  	/**
	 * \if ENGLISH_LANG
	 * Max length of backup file name
	 * \else
	 * ��󱸷����Ƴ���	
	 * \endif
	 */
	public static final int SDK_MAX_BACKUP_NAME = 32;			
	/**
	 * \if ENGLISH_LANG
	 * Max number of backup device
	 * \else
	 * ��󱸷��豸����	
	 * \endif
	 */
	public static final int SDK_MAX_BACKUPDEV_NUM = 16;
	/**
	 * \if ENGLISH_LANG
	 * Max number of backup file 
	 * \else
	 * ��󱸷��ļ�����	
	 * \endif
	 */
	public static final int SDK_MAX_BACKUPRECORD_NUM = 1024;	
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���CAN����
	 * \endif
	 */
	public static final int MAX_CAN_COUNT = 16;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Max length of audio file path 
	 * \else
	 * �����Ƶ�ļ�·����	
	 * \endif
	 */	
	public static final int SDK_MAX_AUDIO_PATH_1 = 260;			//�����Ƶ�ļ�·����
	
	public static final int NET_MAX_FRAMESEQUENCE_NUM     = 2;
	public static final int NET_MAX_TIMESTAMP_NUM         = 2;
	
	/* MAC�������� */
	public static final int SDK_MACFILTER_NUM             = 512;             // MAC
	
	/* MAC,IP�������� */
	public static final int SDK_MACIPFILTER_NUM           = 512;            // MAC,IP
	
	public static final int ARM_DISARM_ZONE_MAX           = 256;            // ����������
	
	public static final int NET_DEV_CAP_SEQPOWER            = 0x01;                // ��Դʱ��������, pInBuf=NET_IN_CAP_SEQPOWER*, pOutBuf=NET_OUT_CAP_SEQPOWER*
	public static final int NET_ENCODE_CFG_CAPS             = 0x02;                // �豸�������ö�Ӧ����, pInBuf=NET_IN_ENCODE_CFG_CAPS*, pOutBuf= NET_OUT_ENCODE_CFG_CAPS*
	public static final int NET_VIDEOIN_FISHEYE_CAPS        = 0x03;                // ��������, pInBuf=NET_IN_VIDEOIN_FISHEYE_CAPS*, pOutBuf=NET_OUT_VIDEOIN_FISHEYE_CAPS*
	
	// �豸��Ϣ���ͣ���ӦCLIENT_QueryDevInfo�ӿ�
	public static final int  NET_QUERY_DEV_STORAGE_NAMES            = 0x01;                // ��ѯ�豸�Ĵ洢ģ�����б� , pInBuf=NET_IN_STORAGE_DEV_NAMES *, pOutBuf=NET_OUT_STORAGE_DEV_NAMES *
	public static final int  NET_QUERY_DEV_STORAGE_INFOS            = 0x02;                // ��ѯ�豸�Ĵ洢ģ����Ϣ�б�, pInBuf=NET_IN_STORAGE_DEV_INFOS*, pOutBuf= NET_OUT_STORAGE_DEV_INFOS *
	public static final int  NET_QUERY_RECENCY_JNNCTION_CAR_INFO    = 0x03;                // ��ѯ����Ŀ��ڳ�����Ϣ�ӿ�, pInBuf=NET_IN_GET_RECENCY_JUNCTION_CAR_INFO*, pOutBuf=NET_OUT_GET_RECENCY_JUNCTION_CAR_INFO*
	public static final int  NET_QUERY_LANES_STATE                  = 0x04;                // ��ѯ������Ϣ,pInBuf = NET_IN_GET_LANES_STATE , pOutBuf = NET_OUT_GET_LANES_STATE
	public static final int  NET_QUERY_DEV_FISHEYE_WININFO          = 0x05;                // ��ѯ���۴�����Ϣ , pInBuf= NET_IN_FISHEYE_WININFO*, pOutBuf=NET_OUT_FISHEYE_WININFO *
	public static final int  NET_QUERY_DEV_REMOTE_DEVICE_INFO       = 0x06;                // ��ѯԶ���豸��Ϣ , pInBuf= NET_IN_GET_DEVICE_INFO*, pOutBuf= NET_OUT_GET_DEVICE_INFO *
	public static final int  NET_QUERY_DEV_REMOTE_DEVICE_INFO_ALL   = 0x07;                // ��ѯ����Զ���豸��Ϣ , pInBuf= NET_IN_GET_DEVICE_INFO_ALL*, pOutBuf= NET_OUT_GET_DEVICE_INFO_ALL *
	public static final int NET_QUERY_REG_DEVICE_NET_INFO               = 0x08;                // ��ѯ����ע���豸���������� , pInBuf=NET_IN_REGDEV_NET_INFO * , pOutBuf=NET_OUT_REGDEV_NET_INFO *
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_PRESET          = 0x09;                // ��ѯ�ȳ���Ԥ����Ϣ , pInBuf= NET_IN_THERMO_GET_PRESETINFO*, pOutBuf= NET_OUT_THERMO_GET_PRESETINFO *
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_OPTREGION       = 0x0a;                // ��ѯ�ȳ������Ȥ������Ϣ,pInBuf= NET_IN_THERMO_GET_OPTREGION*, pOutBuf= NET_OUT_THERMO_GET_OPTREGION *
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_EXTSYSINFO      = 0x0b;                // ��ѯ�ȳ����ⲿϵͳ��Ϣ, pInBuf= NET_IN_THERMO_GET_EXTSYSINFO*, pOutBuf= NET_OUT_THERMO_GET_EXTSYSINFO *
	public static final int NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER       = 0x0c;                // ��ѯ���µ�Ĳ���ֵ, pInBuf= NET_IN_RADIOMETRY_GETPOINTTEMPER*, pOutBuf= NET_OUT_RADIOMETRY_GETPOINTTEMPER *
	public static final int NET_QUERY_DEV_RADIOMETRY_TEMPER             = 0x0d;                // ��ѯ������Ĳ���ֵ, pInBuf= NET_IN_RADIOMETRY_GETTEMPER*, pOutBuf= NET_OUT_RADIOMETRY_GETTEMPER *
	public static final int NET_QUERY_GET_CAMERA_STATE                  = 0x0e;                // ��ȡ�����״̬, pInBuf= NET_IN_GET_CAMERA_STATEINFO*, pOutBuf= NET_OUT_GET_CAMERA_STATEINFO *
	public static final int NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE   = 0x0f;                // ��ȡԶ��ͨ����Ƶ���뷽ʽ, pInBuf= NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO*, pOutBuf= NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO *
	public static final int NET_QUERY_GET_COMM_PORT_INFO                = 0x10;                // ��ȡ�豸������Ϣ, pInBuf=NET_IN_GET_COMM_PORT_INFO* , pOutBuf=NET_OUT_GET_COMM_PORT_INFO* 
	public static final int NET_QUERY_GET_LINKCHANNELS                  = 0x11;                // ��ѯĳ��Ƶͨ���Ĺ���ͨ���б�,pInBuf=NET_IN_GET_LINKCHANNELS* , pOutBuf=NET_OUT_GET_LINKCHANNELS*
	public static final int NET_QUERY_GET_VIDEOOUTPUTCHANNELS           = 0x12;                // ��ȡ����ͨ������ͳ����Ϣ, pInBuf=NET_IN_GET_VIDEOOUTPUTCHANNELS*, pOutBuf=NET_OUT_GET_VIDEOOUTPUTCHANNELS*
	public static final int NET_QUERY_GET_VIDEOINFO                     = 0x13;                // ��ȡ����ͨ����Ϣ, pInBuf=NET_IN_GET_VIDEOINFO*, pOutBuf=NET_OUT_GET_VIDEOINFO*
	public static final int NET_QUERY_GET_ALLLINKCHANNELS               = 0x14;                // ��ѯȫ����Ƶ����ͨ���б�,pInBuf=NET_IN_GET_ALLLINKCHANNELS* , pOutBuf=NET_OUT_GET_ALLLINKCHANNELS*
	public static final int NET_QUERY_VIDEOCHANNELSINFO                 = 0x15;                // ��ѯ��Ƶͨ����Ϣ,pInBuf=NET_IN_GET_VIDEOCHANNELSINFO* , pOutBuf=NET_OUT_GET_VIDEOCHANNELSINFO*
	public static final int NET_QUERY_TRAFFICRADAR_VERSION              = 0x16;                // ��ѯ�״��豸�汾,pInBuf=NET_IN_TRAFFICRADAR_VERSION* , pOutBuf=NET_OUT_TRAFFICRADAR_VERSION*
	public static final int NET_QUERY_WORKGROUP_NAMES                   = 0x17;                // ��ѯ���еĹ���Ŀ¼����,pInBuf=NET_IN_WORKGROUP_NAMES* , pOutBuf=NET_OUT_WORKGROUP_NAMES*
	public static final int NET_QUERY_WORKGROUP_INFO                    = 0x18;                // ��ѯ��������Ϣ,pInBuf=NET_IN_WORKGROUP_INFO* , pOutBuf=NET_OUT_WORKGROUP_INFO*
	public static final int NET_QUERY_WLAN_ACCESSPOINT                  = 0x19;                // ��ѯ��������������Ϣ,pInBuf=NET_IN_WLAN_ACCESSPOINT* , pOutBuf=NET_OUT_WLAN_ACCESSPOINT*

	public static final int  MAX_LOG_PATH_LEN             = 260;                // ��־·������󳤶�
	
	public static final int   MAX_REGISTER_ID_LEN        = (256);
	public static final int   MAX_APP_ID_LEN             = (256);
	public static final int   MAX_URL_LEN                = (1024);
	public static final int   MAX_IOS_CERTIFICATE_LEN     = (1024 * 14);
	public static final int   MAX_IOS_SECRET_KEY_LEN      = (512);
	public static final int   MAX_MOBILE_CHANNEL_NUM      = (256);
	
	public static final int  MAX_GOURP_NUM               =  128 ;             //������������
	
	// ����ģʽ�б����������ģʽ��������롢�����
	public static final int SDK_CAPTURE_COMP_DIVX_MPEG4        = 0x00000001;
	public static final int SDK_CAPTURE_COMP_MS_MPEG4          = 0x00000002;
	public static final int SDK_CAPTURE_COMP_MPEG2             = 0x00000004;
	public static final int SDK_CAPTURE_COMP_MPEG1             = 0x00000008;
	public static final int SDK_CAPTURE_COMP_H263              = 0x00000010;
	public static final int SDK_CAPTURE_COMP_MJPG              = 0x00000020;
	public static final int SDK_CAPTURE_COMP_FCC_MPEG4         = 0x00000040;
	public static final int SDK_CAPTURE_COMP_H264              = 0x00000080;
	public static final int SDK_CAPTURE_COMP_H265              = 0x00000100;
	
	public static final int MAX_SCENE_COUNT                    = 8;
	
	
	public static final int UPDATE_VERSION_LEN = 64;
	
	/**
	 * \if ENGLISH_LANG
	 * max dev comm number
	 * \else
	 * ��󴮿ڸ�
	 * \endif
	 */
	public static final int MAX_DEVCOMM_NUM = 16;
	
	/**
	 * \if ENGLISH_LANG
	 * Judicial device level 2 switch level 1 split supported input channel
	 * \else
	 * ˾���豸�����л�ʱ��һ��split֧�ֵ�����ͨ����
	 * \endif
	 * 
	 */
	public static final int SDK_SPLIT_INPUT_NUM = 256;
	
	
	/**
	 * \if ENGLISH_LANG
	 * The Maximum Audio Matrix Input Channels
	 * \else
	 * ��Ƶ�����������ͨ����
	 * \endif
	 * 
	 */
	public static final int CFG_MAX_AUDIO_MATRIX_INPUT = 32;
	
	
	/**
	 * \if ENGLISH_LANG
	 * TThe Maximum OutPut Channels Of Each Audio Matrix
	 * \else
	 * ÿ����Ƶ����֧�ֵ�������ͨ����
	 * \endif
	 * 
	 */
	public static final int SDK_MAX_AUDIO_MATRIX_OUTPUT = 8;
	
	// ����Bus״̬��Ӧ�¼��ϱ�(INetSDK.AttachBusState)
	public static final int SDK_ALARM_BUS_DRIVER_CHECK         = 0x0001;           // ˾��ǩ���¼�(��Ӧ�ṹ�� ALARM_BUS_DRIVER_CHECK_INFO)
	public static final int SDK_ALARM_BUS_IMPORT_SITE          = 0x0002;           // ��վ�¼�(��Ӧ�ṹ�� ALARM_BUS_IMPORT_SITE_INFO)
	public static final int SDK_ALARM_BUS_EXPORT_SITE          = 0x0003;           // ��վ�¼�(��Ӧ�ṹ�� ALARM_BUS_EXPORT_SITE_INFO)
	public static final int SDK_ALARM_BUS_ABNORMAL             = 0x0004;           // �����쳣�¼�(��Ӧ�ṹ�� ALARM_BUS_ABNORMAL_INFO)
	public static final int SDK_ALARM_BUS_DOOR_OPEN            = 0x0005;           // ���Ŵ��¼�(��Ӧ�ṹ�� ALARM_VEHICLE_DOOR_OPEN_INFO)
	public static final int SDK_ALARM_BUS_CUR_MILEAGE          = 0x0006;           // ��ǰ����¼�(��Ӧ�ṹ�� ALARM_BUS_CUR_MILEAGE_INFO)
	public static final int SDK_ALARM_BUS_CUR_OIL              = 0x0007;           // ��ǰ�ͺ�����¼�(��Ӧ�ṹ�� ALARM_BUS_CUR_OIL_INFO)
	public static final int SDK_ALARM_BUS_LOW_OIL              = 0x0008;           // �����������¼�(��Ӧ�ṹ�� ALARM_BUS_LOW_OIL_INFO)
	public static final int SDK_ALARM_BUS_PASSENGER_CARD_CHECK = 0x0009;           // �˿�ˢ���¼�(��Ӧ�ṹ�� ALARM_PASSENGER_CARD_CHECK )
	public static final int SDK_ALARM_BUS_VEHICLE_STANDING_OVER_TIME = 0x000a;     // ͣ����ʱ�¼�(��Ӧ�ṹ�� ALARM_VEHICLE_STANDING_OVER_TIME_INFO )
	public static final int SDK_ALARM_BUS_DRIVE_AFTER_WORK     = 0x000b;           // �ǹ���ʱ���¼�(��Ӧ�ṹ�� ALARM_DVRIVE_AFTER_WORK )
	public static final int SDK_ALARM_BUS_PAD_SHUTDOWN         = 0x000c;           // PAD�ػ��¼�, DVR�ϱ�PadShutdown��Ϣ, PAD�յ����Զ���ʱ�ػ�(��Ӧ�ṹ�� ALARM_BUS_PAD_SHUTDOWN_INFO)
	
	public static final int MAX_EVENT_TO_CONFIRM_NUM           = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * TThe Max Length of device ID
	 * \else
	 * �豸ID��󳤶�
	 * \endif
	 * 
	 */
	public static final int DH_DEV_ID_LEN_EX = 128;
	
	/**
	 * \if ENGLISH_LANG
	 * TThe Max fire waring information
	 * \else
	 * ����ȳ����Ż�㱨����Ϣ����
	 * \endif
	 * 
	 */
	public static final int MAX_FIREWARNING_INFO_NUM = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * TThe Max number of costomer, receive message
	 * \else
	 * ���ն����û��������Ŀ
	 * \endif
	 */
	public static final int MAX_RECEIVER_NUM = 100;
	
	 /**
	 * \if ENGLISH_LANG
	 * The max number of preview channel
	 * \else
	 * ��󵼲�Ԥ����ͨ������ 
	 * \endif
	 */
	public static final int MAX_PREVIEW_CHANNEL_NUM = 8; 
	
	 /**
	 * \if ENGLISH_LANG
	 *  Maximum Number of Combination of Entrance Guard Operationl
	 * \else
	 * 	����Ž������������ 
	 * \endif
	 */
	public static final int MAX_ACCESSCONTROL_NUM = 8;
	
	 /**
	 * \if ENGLISH_LANG
	 *  The Maximum Number of  Alarm Call Servers
	 * \else
	 * 	��󱨾��绰��������
	 * \endif
	 */
	public static final int MAX_PSTN_SERVER_NUM = 8;
	
	 /**
	 * \if ENGLISH_LANG
	 *  The Maximum Number of NTP Server
	 * \else
	 * 	�����NTP��������ַ
	 * \endif
	 */
	public static final int MAX_NTP_SERVER = 4;  
	
	 /**
	 * \if ENGLISH_LANG
	 *  TV max amount in the zone
	 * \else
	 * 	������TV���������
	 * \endif
	 */
	public static final int AV_CFG_Max_TV_In_Block = 128; 
	
	 /**
	 * \if ENGLISH_LANG
	 *  The zone max amount in the video wall.
	 * \else
	 * 	����ǽ��������������
	 * \endif
	 */
	public static final int AV_CFG_Max_Block_In_Wall = 128;		
	
	public static final int SDK_MAX_COLLECTION_NUM  = 64;      // ���Ԥ����
	
	public static final  int MAX_FISH_EYE_REGION_NUM = 9;
	
	public static final int NET_RADIOMETRY_DOFIND_MAX = 32;
}

