package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device support function list 
 * \else
 * �豸֧�ֹ����б�
 * \endif
 */
public class SDK_DEV_FUNC implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * FTP ��1��send record file 2��send snapshot file
	 * \else
	 * FTP ��λ��1������¼���ļ� 2������ץͼ�ļ�
	 * \endif
	 */
	public static int EN_FTP = 0;							

	/**
	 * \if ENGLISH_LANG
	 * SMTP ��1��alarm send text mail 2��alarm send picture 3: support health mail
	 * \else
	 * SMTP ��λ��1�����������ı��ʼ� 2����������ͼƬ 3:֧�ֽ����ʼ�����
	 * \endif
	 */
	public static int EN_SMTP = 1;					

	/**
	 * \if ENGLISH_LANG
	 * NTP ��1��adjust system time
	 * \else
	 * NTP	��λ��1������ϵͳʱ��
	 * \endif
	 */
	public static int EN_NTP = 2;						

	/**
	 * \if ENGLISH_LANG
	 * Auto maintenance ��1��reboot 2��off 3:delete file
	 * \else
	 * �Զ�ά�� ��λ��1������ 2���ر� 3:ɾ���ļ�
	 * \endif
	 */
	public static int EN_AUTO_MAINTAIN = 3;			

	/**
	 * \if ENGLISH_LANG
	 * Mask ��1��multi-area mask
	 * \else
	 * �����ڵ� ��λ��1���������ڵ�
	 * \endif
	 */
	public static int EN_VIDEO_COVER = 4;				

	/**
	 * \if ENGLISH_LANG
	 * Auto registration��1��after registration sdk auto register
	 * \else
	 * ����ע��	��λ��1��ע���sdk������½
	 * \endif
	 */
	public static int EN_AUTO_REGISTER = 5;			

	/**
	 * \if ENGLISH_LANG
	 * DHCP��1��DHCP
	 * \else
	 * DHCP	��λ��1��DHCP
	 * \endif
	 */
	public static int EN_DHCP = 6;					

	/**
	 * \if ENGLISH_LANG
	 * UPNP��1��UPNP
	 * \else
	 * UPNP	��λ��1��UPNP
	 * \endif
	 */
	public static int EN_UPNP = 7;					

	/**
	 * \if ENGLISH_LANG
	 * Serial snap��1:CommATM
	 * \else
	 * ����ץ�� ��λ��1:CommATM
	 * \endif
	 */
	public static int EN_COMM_SNIFFER = 8;			

	/**
	 * \if ENGLISH_LANG
	 * Net snap �� 1��NetSniffer
	 * \else
	 * ����ץ�� ��λ�� 1��NetSniffer
	 * \endif
	 */
	public static int EN_NET_SNIFFER = 9;				

	/**
	 * \if ENGLISH_LANG
	 * Writing function��1��Search writing status
	 * \else
	 * ��¼���� ��λ��1����ѯ��¼״̬
	 * \endif
	 */
	public static int EN_BURN = 10;					

	/**
	 * \if ENGLISH_LANG
	 * Video matrix ��1��support video matrix 2: support SPOT video matrix 3: support HDMI video matrix
	 * \else
	 * ��Ƶ���� ��λ��1���Ƿ�֧����Ƶ���� 2:�Ƿ�֧��SPOT��Ƶ���� 3:�Ƿ�֧��HDMI��Ƶ����
	 * \endif
	 */
	public static int EN_VIDEO_MATRIX = 11;			

	/**
	 * \if ENGLISH_LANG
	 * Audio detect��1��support audio detect
	 * \else
	 * ��Ƶ��� ��λ��1���Ƿ�֧����Ƶ���
	 * \endif
	 */
	public static int EN_AUDIO_DETECT = 12;			

	/**
	 * \if ENGLISH_LANG
	 * Storage position��1��Ftp server(Ips) 2��SMB 3��NFS 4��ISCSI 16��DISK 17��USB
	 * \else
	 * �洢λ�� ��λ��1��Ftp������(Ips) 2��SMB 3��NFS 4��ISCSI 16��DISK 17��U��
	 * \endif
	 */
	public static int EN_STORAGE_STATION = 13;			

	/**
	 * \if ENGLISH_LANG
	 * IPS storage search��1��IPS storage search 
	 * \else
	 * IPS�洢��ѯ ��λ��1��IPS�洢��ѯ	
	 * \endif
	 */
	public static int EN_IPSSEARCH = 14;				

	/**
	 * \if ENGLISH_LANG
	 * Snap  ��1��resolution2��frame rate3��snapshot4��snap file format5��quanlity
	 * \else
	 * ץͼ  ��λ��1���ֱ���2��֡��3��ץͼ��ʽ4��ץͼ�ļ���ʽ5��ͼ������
	 * \endif
	 */
	public static int EN_SNAP = 15;					

	/**
	 * \if ENGLISH_LANG
	 * Support default net card search 1��support
	 * \else
	 * ֧��Ĭ��������ѯ ��λ 1��֧��
	 * \endif
	 */
	public static int EN_DEFAULTNIC = 16;				

	/**
	 * \if ENGLISH_LANG
	 * CBR mode display quality config item 1: support
	 * \else
	 * CBRģʽ����ʾ���������� ��λ 1:֧��
	 * \endif
	 */
	public static int EN_SHOWQUALITY = 17;				

	/**
	 * \if ENGLISH_LANG
	 * Config import/export function 1: support
	 * \else
	 * ���õ��뵼���������� ��λ 1:֧��
	 * \endif
	 */
	public static int EN_CONFIG_IMEXPORT = 18;			

	/**
	 * \if ENGLISH_LANG
	 * Support page mode log search 1��support
	 * \else
	 * �Ƿ�֧�ַ�ҳ��ʽ����־��ѯ ��λ 1��֧��
	 * \endif
	 */
	public static int EN_LOG = 19;						

	/**
	 * \if ENGLISH_LANG
	 * Record setup some capacities 1:redundant 2:prerecord 3:record period
	 * \else
	 * ¼�����õ�һЩ���� ��λ 1:���� 2:Ԥ¼ 3:¼��ʱ���
	 * \endif
	 */
	public static int EN_SCHEDULE = 20;				

	/**
	 * \if ENGLISH_LANG
	 * Net type 1: Ethernet 2: Wireless 3:CDMA/GPRS 4:CDMA/GPRS multi net card config
	 * \else
	 * �������Ͱ�λ��ʾ 1:��̬�� 2:���߾��� 3:CDMA/GPRS 4:CDMA/GPRS����������
	 * \endif
	 */
	public static int EN_NETWORK_TYPE = 21;			

	/**
	 * \if ENGLISH_LANG
	 * Mark important record:1�� set important record mark
	 * \else
	 * ��ʶ��Ҫ¼�� ��λ:1��������Ҫ¼���ʶ
	 * \endif
	 */
	public static int EN_MARK_IMPORTANTRECORD = 22;	

	/**
	 * \if ENGLISH_LANG
	 * Active frame control��1��support active frame control, 2: support schedule alarm type frame control(not support motion detect), this capability and ACF are mutually exclusive
	 * \else
	 * �֡�ʿ��� ��λ��1��֧�ֻ֡�ʿ���, 2:֧�ֶ�ʱ�������ͻ֡�ʿ���(��֧�ֶ���),��������ACF��������
	 * \endif
	 */
	public static int EN_ACFCONTROL = 23;				

	/**
	 * \if ENGLISH_LANG
	 * Multi-channel sub stream��1��support 3 channel sub stream, 2:support sub stream encode compression standalone setup
	 * \else
	 * ��·������ ��λ��1��֧����·������, 2:֧�ָ���������ѹ����ʽ��������
	 * \endif
	 */
	public static int EN_MULTIASSIOPTION = 24;			

	/**
	 * \if ENGLISH_LANG
	 * Component module��1��time schedule separate  2: standard I frame interval setup
	 * \else
	 * �����ģ�� ��λ��1��ʱ���ֿ����� 2:��׼I֡�������
	 * \endif
	 */
	public static int EN_DAVINCIMODULE = 25;			

	/**
	 * \if ENGLISH_LANG
	 * GPS��1��Gps
	 * \else
	 * GPS���� ��λ��1��Gps��λ����
	 * \endif
	 */
	public static int EN_GPS = 26;                           

	/**
	 * \if ENGLISH_LANG
	 * Support multi-net card search 1��support
	 * \else
	 * ֧�ֶ�������ѯ ��λ 1��֧��
	 * \endif
	 */
	public static int EN_MULTIETHERNET = 27;			

	/**
	 * \if ENGLISH_LANG
	 * Login property ��1��support Login property search
	 * \else
	 * Login���� ��λ��1��֧��Login���Բ�ѯ
	 * \endif
	 */
	public static int EN_LOGIN_ATTRIBUTE = 28;               

	/**
	 * \if ENGLISH_LANG
	 * Record related��1��general��2��alarm��3��motion detect record��4��local storage��5��remote storage��6��redundant storage��7��local emergency storage��8��support main/sub stream remote storage
	 * \else
	 * ¼����� ��λ��1����ͨ¼��2������¼��3����̬���¼��4�����ش洢��5��Զ�̴洢��6������洢��7�����ؽ����洢��8��֧����������������Զ�̴洢
	 * \endif
	 */
	public static int EN_RECORD_GENERAL = 29;			

	/**
	 * \if ENGLISH_LANG
	 * Json format config:1 support Json format, 2: use F6 NAS config, 3: use F6 Raid config, 4��use F6 MotionDetect config, 5��completely support 3 generations config(V3)��via F6 command access
	 * \else
	 * Json��ʽ����:��λ��1֧��Json��ʽ, 2: ʹ��F6��NAS����, 3: ʹ��F6��Raid����, 4��ʹ��F6��MotionDetect����, 5������֧����������(V3)��ͨ��F6�������
	 * \endif
	 */
	public static int EN_JSON_CONFIG = 30;				

	/**
	 * \if ENGLISH_LANG
	 * shield function��1��shield PTZ , 2: shield 3G alive period
	 * \else
	 * ���ι��ܣ���λ��1������PTZ��̨����, 2: ����3G�ı���ʱ�ι���
	 * \endif
	 */
	public static int EN_HIDE_FUNCTION = 31;			

	/**
	 * \if ENGLISH_LANG
	 * harddisk bad channel info support capacity:1��hard disk bad channel info search support capacity
	 * \else
	 * Ӳ�̻�����Ϣ֧������: ��λ��1��Ӳ�̻�����Ϣ��ѯ֧������
	 * \endif
	 */
	public static int EN_DISK_DAMAGE = 32;                   

	/**
	 * \if ENGLISH_LANG
	 * Support playback net sending speed control:1��support playback speed up
	 * \else
	 * ֧�ֻط������ٶȿ���:��λ:1��֧�ֻطż���
	 * \endif
	 */
	public static int EN_PLAYBACK_SPEED_CTRL = 33;		

	/**
	 * \if ENGLISH_LANG
	 * Support holiday period config:1��support holiday time period config
	 * \else
	 * ֧�ּ���ʱ�������:��λ:1��֧�ּ���ʱ�������
	 * \endif
	 */
	public static int EN_HOLIDAYSCHEDULE = 34;			

	/**
	 * \if ENGLISH_LANG
	 * ATM takeout time out
	 * \else
	 * ATMȡǮ��ʱ
	 * \endif
	 */
	public static int EN_FETCH_MONEY_TIMEOUT = 35;		

	/**
	 * \if ENGLISH_LANG
	 * Backup supported format��1:DAV, 2:ASF
	 * \else
	 * ����֧�ֵĸ�ʽ����λ��1:DAV, 2:ASF
	 * \endif
	 */
	public static int EN_BACKUP_VIDEO_FORMAT = 36;		

	/**
	 * \if ENGLISH_LANG
	 * Support hard disk type search
	 * \else
	 * ֧��Ӳ�����Ͳ�ѯ
	 * \endif
	 */
	public static int EN_QUERY_DISK_TYPE = 37;               

	/**
	 * \if ENGLISH_LANG
	 * Support device display output (VGA and etc.) config, 1:split tour config
	 * \else
	 * ֧���豸��ʾ�����VGA�ȣ�����,��λ: 1:����ָ���Ѳ����
	 * \endif
	 */
	public static int EN_CONFIG_DISPLAY_OUTPUT = 38;         

	/**
	 * \if ENGLISH_LANG
	 * Support extension stream record control setup,1-sub stream control setup
	 * \else
	 * ֧����չ����¼���������, ��λ��1-������¼���������
	 * \endif
	 */
	public static int EN_SUBBITRATE_RECORD_CTRL = 39;        

	/**
	 * \if ENGLISH_LANG
	 * Support IPV6 setup,1-IPV6 config
	 * \else
	 * ֧��IPV6����, ��λ��1-IPV6����
	 * \endif
	 */
	public static int EN_IPV6 = 40;                          

	/**
	 * \if ENGLISH_LANG
	 * SNMP
	 * \else
	 * SNMP�����������Э�飩
	 * \endif
	 */
	public static int EN_SNMP = 41;                          

	/**
	 * \if ENGLISH_LANG
	 * Support to get device URL address, : 1-search config URL address
	 * \else
	 * ֧�ֻ�ȡ�豸URL��ַ, ��λ: 1-��ѯ����URL��ַ
	 * \endif
	 */
	public static int EN_QUERY_URL = 42;                     

	/**
	 * \if ENGLISH_LANG
	 * ISCSI
	 * \else
	 * ISCSI��InternetС�ͼ����ϵͳ�ӿ����ã�
	 * \endif
	 */
	public static int EN_ISCSI = 43;					

	/**
	 * \if ENGLISH_LANG
	 * Support Raid
	 * \else
	 * ֧��Raid����
	 * \endif
	 */
	public static int EN_RAID = 44;					

	/**
	 * \if ENGLISH_LANG
	 * Support disk infoF5 search
	 * \else
	 * ֧�ִ�����ϢF5��ѯ
	 * \endif
	 */
	public static int EN_HARDDISK_INFO = 45;			

	/**
	 * \if ENGLISH_LANG
	 * Support PIP function :1,PIP setup; 2,PIP preview, record storage, search, download;3, support PIP encode config and channel search
	 * \else
	 * ֧�ֻ��л����� ��λ:1,���л�����; 2,���л�Ԥ����¼��洢����ѯ������;3,֧�ֻ��л��������ã�ͬʱ֧�ֻ��л�ͨ����ѯ
	 * \endif
	 */
	public static int EN_PICINPIC = 46;                      

	/**
	 * \if ENGLISH_LANG
	 * EN_PLAYBACK_SPEED_CTRL ��for compatible protocol
	 * \else
	 * ͬ EN_PLAYBACK_SPEED_CTRL ��ֻΪ�˼���Э��
	 * \endif
	 */
	public static int EN_PLAYBACK_SPEED_CTRL_SUPPORT = 47;   

	/**
	 * \if ENGLISH_LANG
	 * Support 24, 32, 64-ch LF-X series��mark this type of device special encode capacity
	 * \else
	 * ֧��24��32��64·LF-Xϵ�У���ע�����豸����ı����������㷽ʽ
	 * \endif
	 */
	public static int EN_LF_XDEV = 48;					

	/**
	 * \if ENGLISH_LANG
	 * F5 DSP encode capacity search
	 * \else
	 * F5 DSP����������ѯ
	 * \endif
	 */
	public static int EN_DSP_ENCODE_CAP = 49;			

	/**
	 * \if ENGLISH_LANG
	 * Multicast capacity search
	 * \else
	 * �鲥������ѯ
	 * \endif
	 */
	public static int EN_MULTICAST = 50;                     

	/**
	 * \if ENGLISH_LANG
	 * Net limit capacity search��1-net send stream size limit
	 * \else
	 * ��������������ѯ����λ��1-���緢��������С��          
	 * \endif
	 */
	public static int EM_NET_LIMIT = 51;                                     

	/**
	 * \if ENGLISH_LANG
	 * Serial 422
	 * \else
	 * ����422
	 * \endif
	 */
	public static int EM_COM422 = 52;                        

	/**
	 * \if ENGLISH_LANG
	 * Support three generations protocol frame��needlistMethod(),listService()����via F6 command access
	 * \else
	 * �Ƿ�֧������Э���ܣ���Ҫʵ��listMethod(),listService()����ͨ��F6�������
	 * \endif
	 */
	public static int EM_PROTOCAL_FRAMEWORK = 53;		

	/**
	 * \if ENGLISH_LANG
	 * Write OSD overlay,  1- write OSD overlay config
	 * \else
	 * ��¼OSD����, ��λ, 1-��¼OSD��������
	 * \endif
	 */
	public static int EM_WRITE_DISK_OSD = 54;			

	/**
	 * \if ENGLISH_LANG
	 * Dynamic multi link, 1-request video data response
	 * \else
	 * ��̬������, ��λ, 1-������Ƶ����Ӧ��
	 * \endif
	 */
	public static int EM_DYNAMIC_MULTI_CONNECT = 55;	

	/**
	 * \if ENGLISH_LANG
	 * Cloud service,1-support private cloud service
	 * \else
	 * �Ʒ���,��λ��1-֧��˽���Ʒ���
	 * \endif
	 */
	public static int EM_CLOUDSERVICE = 56;                  

	/**
	 * \if ENGLISH_LANG
	 * Record info report, 1-record info auto report, 2-support record frame search
	 * \else
	 * ¼����Ϣ�ϱ�, ��λ, 1-¼����Ϣ�����ϱ�, 2-֧��¼��֡����ѯ
	 * \endif
	 */
	public static int EM_RECORD_INFO = 57;				

	/**
	 * \if ENGLISH_LANG
	 * Auto registration capacity��1-support dynamic auto registration
	 * \else
	 * ����ע����������λ��1-֧�ֶ�̬����ע��
	 * \endif
	 */
	public static int EN_DYNAMIC_REG = 58;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-channel preview playback��1-support multi-channel preview playback
	 * \else
	 * ��ͨ��Ԥ���طţ���Ϊ,1-֧�ֶ�ͨ��Ԥ���ط�
	 * \endif
	 */
	public static int EM_MULTI_PLAYBACK = 59;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode channel, 1-support audio only channel
	 * \else
	 * ����ͨ��, ��λ, 1-֧�ִ���Ƶͨ��
	 * \endif
	 */
	public static int EN_ENCODE_CHN = 60;
}

