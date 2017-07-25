package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Log search type 
 * \else
 * ��־��ѯ����
 * \endif
 */
public class DH_NEWLOG_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device reboot 
	 * \else
	 * �豸����
	 * \endif
	 */
	
	public static final int     DH_NEWLOG_REBOOT = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Shut down device
	 * \else
	 * �豸�ػ�
	 * \endif
	 */
	
  	public static final int     DH_NEWLOG_SHUT = 1;
  	
    public static final int     DH_NEWLOG_REPORTSTOP = 2;
    public static final int     DH_NEWLOG_REPORTSTART = 3;
    
	/**
	 * \if ENGLISH_LANG
	 * Device upgrade
	 * \else
	 *  �豸����
	 * \endif
	 */
    public static final int     DH_NEWLOG_UPGRADE = 4;
    
	/**
	 * \if ENGLISH_LANG
	 * system time update
	 * \else
	 *  ϵͳʱ�����
	 * \endif
	 */
    public static final int     DH_NEWLOG_SYSTIME_UPDATE = 5;
    
	/**
	 * \if ENGLISH_LANG
	 *  GPS time update
	 * \else
	 *  GPSʱ�����
	 * \endif
	 */
    public static final int     DH_NEWLOG_GPS_TIME_UPDATE = 6;

	/**
	 * \if ENGLISH_LANG
	 *  Voice intercom, true representative open, false on behalf of the closed
	 * \else
	 * �����Խ��� true��������false����ر�    
	 * \endif
	 */
    public static final int     DH_NEWLOG_AUDIO_TALKBACK = 7;
    
	/**
	 * \if ENGLISH_LANG
	 *  Transparent transmission, true representative open, false on behalf of the closed
	 * \else
	 * ͸�����䣬 true��������false����ر�    
	 * \endif
	 */
    public static final int     DH_NEWLOG_COMM_ADAPTER = 8;
    
	/**
	 * \if ENGLISH_LANG
	 *  NTP
	 * \else
	 * ����Уʱ 
	 * \endif
	 */
    public static final int     DH_NEWLOG_NET_TIMING = 9;

	/**
	 * \if ENGLISH_LANG
	 *  Save configuration 
	 * \else
	 * ��������
	 * \endif
	 */
    public static final int     DH_NEWLOG_CONFSAVE = 256; 
    
	/**
	 * \if ENGLISH_LANG
	 *  Read configuration 
	 * \else
	 * ��ȡ����
	 * \endif
	 */
    public static final int     DH_NEWLOG_CONFLOAD = 257;
    
	/**
	 * \if ENGLISH_LANG
	 * File system error
	 * \else
	 * �ļ�ϵͳ����
	 * \endif
	 */
    public static final int     DH_NEWLOG_FSERROR = 512;
    
	/**
	 * \if ENGLISH_LANG
	 * HDD write error 
	 * \else
	 *  Ӳ��д����
	 * \endif
	 */
    public static final int     DH_NEWLOG_HDD_WERR = 513;
    
    
    /**
	 * \if ENGLISH_LANG
	 * HDD write error 
	 * \else
	 *  HDD read error
	 * \endif
	 */
    public static final int     DH_NEWLOG_HDD_RERR = 514;
    
    /**
	 * \if ENGLISH_LANG
	 *  Set HDD type 
	 * \else
	 *  ����Ӳ������
	 * \endif
	 */
    public static final int     DH_NEWLOG_HDD_TYPE = 515;                          // ����Ӳ������
    
    /**
  	 * \if ENGLISH_LANG
  	 * Format HDD 
  	 * \else
  	 *   ��ʽ��Ӳ��
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_FORMAT = 516;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Current working HDD space is not sufficient
  	 * \else
  	 *   ��ǰ�����̿ռ䲻��
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_NOSPACE = 517;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set HDD type as read-write
  	 * \else
  	 *  ����Ӳ������Ϊ��д��
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_TYPE_RW = 518;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set HDD type as read-only
  	 * \else
  	 * ����Ӳ������Ϊֻ����    
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_TYPE_RO = 519;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set HDD type as redundant 
  	 * \else
  	 * ����Ӳ������Ϊ������  
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_TYPE_RE = 520;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set HDD type as snapshot
  	 * \else
  	 *����Ӳ������Ϊ������
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_TYPE_SS = 521;
    
    /**
   	 * \if ENGLISH_LANG
   	 * No HDD
   	 * \else
   	 *��Ӳ�̼�¼��־
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_NONE = 522;
    
    /**
   	 * \if ENGLISH_LANG
   	 * No work HDD
   	 * \else
   	 *�޹�����(û�ж�д��)
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_NOWORKHDD = 523;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Set HDD type to backup HDD
   	 * \else
   	 *����Ӳ������Ϊ������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_TYPE_BK = 524;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Set HDD type to reserve subareas
   	 * \else
   	 *����Ӳ������Ϊ��������
   	 * \endif
   	 */
    
    public static final int     DH_NEWLOG_HDD_TYPE_REVERSE = 525;
    
    
    /**
   	 * \if ENGLISH_LANG
   	 *  note the boot-strap's hard disk info
   	 * \else
   	 *��¼����ʱ��Ӳ����Ϣ
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_START_INFO = 526;
    
    /**
   	 * \if ENGLISH_LANG
   	 * note the disk number after the disk change
   	 * \else
   	 *��¼���̺�Ĺ����̺�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_WORKING_DISK = 527;
    
    /**
   	 * \if ENGLISH_LANG
   	 * note other errors of disk
   	 * \else
   	 *��¼Ӳ����������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_OTHER_ERROR = 528;
    
    /**
   	 * \if ENGLISH_LANG
   	 * there has some little errors on disk
   	 * \else
   	 *Ӳ�̴�����΢����
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_SLIGHT_ERR = 529;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  there has some serious errors on disk
   	 * \else
   	 * Ӳ�̴�����������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_SERIOUS_ERR = 530;
    
    /**
   	 * \if ENGLISH_LANG
   	 * e end of the alarm that current disk has no space left 
   	 * \else
   	 *��ǰ�����̿ռ䲻�㱨������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_NOSPACE_END = 531;
    
    
    /**
   	 * \if ENGLISH_LANG
   	 * Raid operation
   	 * \else
   	 * Raid����
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_TYPE_RAID_CONTROL = 532;
    
    
    /**
   	 * \if ENGLISH_LANG
   	 * excess temperature
   	 * \else
   	 *�¶ȹ���
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_TEMPERATURE_HIGH = 533;
    
    /**
   	 * \if ENGLISH_LANG
   	 * lower die temperature
   	 * \else
   	 *�¶ȹ���
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_TEMPERATURE_LOW = 534;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  remove eSATA
   	 * \else
   	 *�Ƴ�eSATA
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_ESATA_REMOVE = 535;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  External alarm begin 
   	 * \else
   	 * �ⲿ���뱨����ʼ
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_ALM_IN = 768;
    /**
   	 * \if ENGLISH_LANG
   	 * Network alarm input
   	 * \else
   	 *���籨��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NETALM_IN = 769; 
    
    /**
   	 * \if ENGLISH_LANG
   	 * External input alarm stop 
   	 * \else
   	 * �ⲿ���뱨��ֹͣ
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_END = 770; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Video loss alarm begin 
   	 * \else
   	 *��Ƶ��ʧ������ʼ
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOSS_IN = 771;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Video loss alarm stop
   	 * \else
   	 * ��Ƶ��ʧ��������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOSS_END = 772; 
    
    /**
   	 * \if ENGLISH_LANG
   	 * Motion detection alarm begin
   	 * \else
   	 *��̬��ⱨ����ʼ
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MOTION_IN = 773; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Motion detection alarm stop
   	 * \else
   	 *��̬��ⱨ������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MOTION_END = 774;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Annunciator alarm input 
   	 * \else
   	 *��������������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_BOSHI = 775;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Network disconnected 
   	 * \else
   	 * ����Ͽ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NET_ABORT = 776; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Network connection restore 
   	 * \else
   	 * ����ָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NET_ABORT_RESUME = 777; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Encoder error
   	 * \else
   	 * ����������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_CODER_BREAKDOWN  = 778; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Encoder error restore 
   	 * \else
   	 *���������ϻָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_CODER_BREAKDOWN_RESUME = 779;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Camera masking
   	 * \else
   	 *��Ƶ�ڵ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BLIND_IN = 780;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Restore camera masking 
   	 * \else
   	 * ��Ƶ�ڵ��ָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BLIND_END = 781;
    
    /**
   	 * \if ENGLISH_LANG
   	 * High temperature
   	 * \else
   	 *�¶ȹ���
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_TEMP_HIGH = 782; 
    
    
    /**
   	 * \if ENGLISH_LANG
   	 * Low voltage
   	 * \else
   	 *��ѹ����
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_VOLTAGE_LOW = 783;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Battery capacity is not sufficient 
   	 * \else
   	 *�����������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_BATTERY_LOW = 784;
    
    /**
   	 * \if ENGLISH_LANG
   	 * ACC power off 
   	 * \else
   	 *ACC�ϵ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_ACC_BREAK = 785;
    
  
   	
    public static final int     DH_NEWLOG_ALM_ACC_RES = 786;
    
    /**
   	 * \if ENGLISH_LANG
   	 *GPS signal lost
   	 * \else
   	 *GPS���ź�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_GPS_SIGNAL_LOST = 787;                    // 
    
    /**
   	 * \if ENGLISH_LANG
   	 * GPS signal resume
   	 * \else
   	 *GPS�źŻָ�
   	 * \endif
   	 */
    
    public static final int     DH_NEWLOG_GPS_SIGNAL_RESUME = 788; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  3G signal lost
   	 * \else
   	 * 3G���ź�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_3G_SIGNAL_LOST = 789;
    
    /**
   	 * \if ENGLISH_LANG
   	 * 3G signal resume
   	 * \else
   	 *3G�źŻָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_3G_SIGNAL_RESUME = 790;
    
    /**
   	 * \if ENGLISH_LANG
   	 * IPC external alarm
   	 * \else
   	 *IPC�ⲿ����
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_ALM_IPC_IN = 791;
    
    /**
   	 * \if ENGLISH_LANG
   	 * IPC external alarms recovery 
   	 * \else
   	 * IPC�ⲿ�����ָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_IPC_END = 792;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Broken network alarm
   	 * \else
   	 *��������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_DIS_IN = 793;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Broken network alarm recovery
   	 * \else
   	 *���������ָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_DIS_END = 794; 
    
    /**
   	 * \if ENGLISH_LANG
   	 * Wireless alarm begin 
   	 * \else
   	 *���߱�����ʼ
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_INFRAREDALM_IN = 928;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Wireless alarm end 
   	 * \else
   	 *���߱�������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_INFRAREDALM_END = 929;
    
    /**
   	 * \if ENGLISH_LANG
   	 *IP conflict 
   	 * \else
   	 *IP��ͻ
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_IPCONFLICT = 930;                  
    
    /**
   	 * \if ENGLISH_LANG
   	 * IP restore
   	 * \else
   	 * IP�ָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_IPCONFLICT_RESUME = 931;
    
    /**
   	 * \if ENGLISH_LANG
   	 * SD Card insert
   	 * \else
   	 *SD������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_SDPLUG_IN = 932; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  SD Card Pull-out
   	 * \else
   	 *SD���γ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_SDPLUG_OUT = 933;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Failed to bind port
   	 * \else
   	 *����˿ڰ�ʧ��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NET_PORT_BIND_FAILED = 934;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Hard disk error beep reset
   	 * \else
   	 *Ӳ�̴��󱨾���������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_BEEP_RESET = 935;
    
    /**
   	 * \if ENGLISH_LANG
   	 * MAC conflict
   	 * \else
   	 *MAC��ͻ
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MAC_CONFLICT = 936;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  MAC conflict resume
   	 * \else
   	 *MAC��ͻ�ָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MAC_CONFLICT_RESUME = 937;
    
    /**
   	 * \if ENGLISH_LANG
   	 * alarm of output state
   	 * \else
   	 *�������״̬
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALARM_OUT = 938;
    
    /**
   	 * \if ENGLISH_LANG
   	 * RAID state change
   	 * \else
   	 * RAID״̬�仯�¼�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_RAID_STAT_EVENT = 939;
    
    /**
   	 * \if ENGLISH_LANG
   	 *fire alarm, smoke or temperature
   	 * \else
   	 *�𾯱������̸л��¶�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ABLAZE_ON = 940;
    
    /**
   	 * \if ENGLISH_LANG
   	 * fire alarm resume
   	 * \else
   	 *�𾯱��� �ָ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ABLAZE_OFF = 941;
    
    /**
   	 * \if ENGLISH_LANG
   	 * alarm of pulse type
   	 * \else
   	 *���������ͱ���
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_INTELLI_ALARM_PLUSE = 942;
    
    /**
   	 * \if ENGLISH_LANG
   	 *begin of alarm
   	 * \else
   	 *���ܱ�����ʼ
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_INTELLI_ALARM_IN = 943;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  end of alarm
   	 * \else
   	 *���ܱ�������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_INTELLI_ALARM_END = 944; 
    
    /**
   	 * \if ENGLISH_LANG
   	 * 3G signal scan
   	 * \else
   	 *3G�źż��
   	 * \endif
   	 */
    
    public static final int     DH_NEWLOG_3G_SIGNAL_SCAN = 945; 
    /**
   	 * \if ENGLISH_LANG
   	 * GPS signal scan
   	 * \else
   	 *GPS�źż��
   	 * \endif
   	 */
    
    public static final int     DH_NEWLOG_GPS_SIGNAL_SCAN = 946;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Auto record
   	 * \else
   	 * �Զ�¼��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_AUTOMATIC_RECORD = 947;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Manual record
   	 * \else
   	 *�ֶ�¼��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MANUAL_RECORD = 948;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Stop record 
   	 * \else
   	 *ֹͣ¼��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_CLOSED_RECORD = 949;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Log in 
   	 * \else
   	 *��¼
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOGIN = 1280;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Log off 
   	 * \else
   	 *ע��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOGOUT = 1281;
    
    /**
   	 * \if ENGLISH_LANG
   	 *add user
   	 * \else
   	 * Delete user
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ADD_USER = 1282;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Delete user
   	 * \else
   	 *ɾ���û�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_DELETE_USER  = 1283;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Modify user 
   	 * \else
   	 *�޸��û�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MODIFY_USER = 1284;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Add user group 
   	 * \else
   	 *����û���
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ADD_GROUP = 1285;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Delete user group 
   	 * \else
   	 * ɾ���û���
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_DELETE_GROUP = 1286;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Modify user group
   	 * \else
   	 * �޸��û���
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MODIFY_GROUP = 1287;
    
    /**
   	 * \if ENGLISH_LANG
   	 *   Network user login
   	 * \else
   	 * �����û���¼
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NET_LOGIN = 1288;
    
    /**
   	 * \if ENGLISH_LANG
   	 * clear log
   	 * \else
   	 *�����־
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_CLEAR = 1536;
    
    /**
   	 * \if ENGLISH_LANG
   	 *Search log 
   	 * \else
   	 *��ѯ��־
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_SEARCHLOG = 1537;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Search record 
   	 * \else
   	 *¼���ѯ
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_SEARCH = 1792;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Record download
   	 * \else
   	 *¼������
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_DOWNLOAD = 1793;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Record playback
   	 * \else
   	 * ¼��ط�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_PLAYBACK = 1794;
    
    /**
   	 * \if ENGLISH_LANG
   	 *Backup recorded file 
   	 * \else
   	 * ����¼���ļ�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BACKUP = 1795;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Failed to backup recorded file
   	 * \else
   	 * ����¼���ļ�ʧ��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BACKUPERROR = 1796;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Real-time backup, that is, copy CD
   	 * \else
   	 *ʵʱ���ݣ������̿�¼
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_BACK_UPRT = 1797;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  CD copy
   	 * \else
   	 *���̸���
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BACKUPCLONE = 1798;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Manual  changed
   	 * \else
   	 *�ֶ�����
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_DISK_CHANGED = 1799;
    
    /**
   	 * \if ENGLISH_LANG
   	 * image palyback
   	 * \else
   	 *ͼƬ�ط�
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_IMAGEPLAYBACK = 1800;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Lock the video
   	 * \else
   	 *����¼��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOCKFILE = 1801;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Unlock the video
   	 * \else
   	 * ����¼��
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_UNLOCKFILE = 1802;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Add log superposition of ATM card number
   	 * \else
   	 *ATM���ŵ��������־
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ATMPOS = 1803;
    
    /**
   	 * \if ENGLISH_LANG
   	 *Time update
   	 * \else
   	 *ʱ�����
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_TIME_UPDATE  = 2048;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  remote diary 
   	 * \else
   	 * Զ����־ 
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_REMOTE_STATE = 2128;
    
    public static final int     DH_NEWLOG_USER_DEFINE = 2304;
    
    public static final int     DH_NEWLOG_TYPE_NR = 10;      

	
}