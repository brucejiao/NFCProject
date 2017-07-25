package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Control type, Corresponding to ControlDevice
 * \else
 * �������ͣ���ӦControlDevice�ӿ�
 * \endif
 */
public class CtrlType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Reboot device
	 * \else
	 * �����豸
	 * \endif
	 */
	public static final int     SDK_CTRL_REBOOT = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Shut down device
	 * \else
	 * �ر��豸
	 * \endif
	 */
	public static final int     SDK_CTRL_SHUTDOWN = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD management
	 * \else
	 * Ӳ�̹���
	 * \endif
	 */
	public static final int     SDK_CTRL_DISK = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Network keyboard
	 * \else
	 * �������
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_POWER = 3;						
	public static final int     SDK_KEYBOARD_ENTER = 4;
	public static final int     SDK_KEYBOARD_ESC = 5;
	public static final int     SDK_KEYBOARD_UP = 6;
	public static final int     SDK_KEYBOARD_DOWN = 7;
	public static final int     SDK_KEYBOARD_LEFT = 8;
	public static final int     SDK_KEYBOARD_RIGHT = 9;
	public static final int     SDK_KEYBOARD_BTN0 = 10;
	public static final int     SDK_KEYBOARD_BTN1 = 11;
	public static final int     SDK_KEYBOARD_BTN2 = 12;
	public static final int     SDK_KEYBOARD_BTN3 = 13;
	public static final int     SDK_KEYBOARD_BTN4 = 14;
	public static final int     SDK_KEYBOARD_BTN5 = 15;
	public static final int     SDK_KEYBOARD_BTN6 = 16;
	public static final int     SDK_KEYBOARD_BTN7 = 17;
	public static final int     SDK_KEYBOARD_BTN8 = 18;
	public static final int     SDK_KEYBOARD_BTN9 = 19;
	public static final int     SDK_KEYBOARD_BTN10 = 20;
	public static final int     SDK_KEYBOARD_BTN11 = 21;
	public static final int     SDK_KEYBOARD_BTN12 = 22;
	public static final int     SDK_KEYBOARD_BTN13 = 23;
	public static final int     SDK_KEYBOARD_BTN14 = 24;
	public static final int     SDK_KEYBOARD_BTN15 = 25;
	public static final int     SDK_KEYBOARD_BTN16 = 26;
	public static final int     SDK_KEYBOARD_SPLIT = 27;
	public static final int     SDK_KEYBOARD_ONE = 28;
	public static final int     SDK_KEYBOARD_NINE = 29;
	public static final int     SDK_KEYBOARD_ADDR = 30;
	public static final int     SDK_KEYBOARD_INFO = 31;
	public static final int     SDK_KEYBOARD_REC = 32;
	public static final int     SDK_KEYBOARD_FN1 = 33;
	public static final int     SDK_KEYBOARD_FN2 = 34;
	public static final int     SDK_KEYBOARD_PLAY = 35;
	public static final int     SDK_KEYBOARD_STOP = 36;
	public static final int     SDK_KEYBOARD_SLOW = 37;
	public static final int     SDK_KEYBOARD_FAST = 38;
	public static final int     SDK_KEYBOARD_PREW = 39;
	public static final int     SDK_KEYBOARD_NEXT = 40;
	public static final int     SDK_KEYBOARD_JMPDOWN = 41;
	public static final int     SDK_KEYBOARD_JMPUP = 42;
	public static final int     SDK_KEYBOARD_10PLUS = 43;
	public static final int     SDK_KEYBOARD_SHIFT = 44;
	public static final int     SDK_KEYBOARD_BACK = 45;
	
	/**
	 * \if ENGLISH_LANG
	 * new network keyboard function
	 * \else
	 * ��������̹���
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_LOGIN = 46; 
	
	/**
	 * \if ENGLISH_LANG
	 * switch video channel
	 * \else
	 * �л���Ƶͨ��
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_CHNNEL = 47; 
    
	/**
	 * \if ENGLISH_LANG
	 * Activate alarm input
	 * \else
	 * ������������
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_IN = 100;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate alarm output
	 * \else
	 * �����������
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_OUT = 101;
	
	/**
	 * \if ENGLISH_LANG
	 * Matrix control
	 * \else
	 * �������
	 * \endif
	 */
	public static final int     SDK_CTRL_MATRIX = 102;
	
	/**
	 * \if ENGLISH_LANG
	 * SD card control(for IPC series). Please refer to HDD control
	 * \else
	 * SD������(IPC��Ʒ)����ͬӲ�̿���
	 * \endif
	 */
	public static final int     SDK_CTRL_SDCARD = 103;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:begin burning 
	 * \else
	 * ��¼�����ƣ���ʼ��¼
	 * \endif
	 */
	public static final int     SDK_BURNING_START = 104;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:stop burning
	 * \else
	 * ��¼�����ƣ�������¼
	 * \endif
	 */
	public static final int     SDK_BURNING_STOP = 105;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay password(The string ended with '\0'. Max length is 8 bits. )
	 * \else
	 * ��¼�����ƣ���������(��'\0'Ϊ��β���ַ�������󳤶�8λ)
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDPWD = 106;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay head title(The string ended with '\0'. Max length is 1024 bytes. Use '\n' to Enter.)
	 * \else
	 * ��¼�����ƣ�����Ƭͷ(��'\0'Ϊ��β���ַ�������󳤶�1024�ֽڣ�֧�ַ��У��зָ���'\n')
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDHEAD = 107;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay dot to the burned information(No parameter)
	 * \else
	 * ��¼�����ƣ����Ӵ�㵽��¼��Ϣ(������)
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDSIGN = 108;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:self-defined overlay (The string ended with '\0'. Max length is 1024 bytes. Use '\n' to Enter)
	 * \else
	 * ��¼�����ƣ��Զ������(��'\0'Ϊ��β���ַ�������󳤶�1024�ֽڣ�֧�ַ��У��зָ���'\n')
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDCURSTOMINFO = 109;
	
	/**
	 * \if ENGLISH_LANG
	 * restore device default setup 
	 * \else
	 * �ָ��豸��Ĭ������
	 * \endif
	 */
	public static final int     SDK_CTRL_RESTOREDEFAULT = 110;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate device snapshot
	 * \else
	 * �����豸ץͼ
	 * \endif
	 */
	public static final int     SDK_CTRL_CAPTURE_START = 111;
	
	/**
	 * \if ENGLISH_LANG
	 * Clear log
	 * \else
	 * �����־
	 * \endif
	 */
	public static final int     SDK_CTRL_CLEARLOG = 112;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate wireless alarm (IPC series)
	 * \else
	 * �������߱���(IPC��Ʒ)
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_WIRELESS = 200;
	
	/**
	 * \if ENGLISH_LANG
	 * Mark important record
	 * \else
	 * ��ʶ��Ҫ¼���ļ�
	 * \endif
	 */
	public static final int     SDK_MARK_IMPORTANT_RECORD = 201;
	
	/**
	 * \if ENGLISH_LANG
	 * Network hard disk partition
	 * \else
	 * ����Ӳ�̷���
	 * \endif
	 */
	public static final int     SDK_CTRL_DISK_SUBAREA = 202;
	
	/**
	 * \if ENGLISH_LANG
	 * Annex burning
	 * \else
	 * ��¼�����ƣ�������¼.
	 * \endif
	 */
	public static final int     SDK_BURNING_ATTACH = 203;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Pause
	 * \else
	 * ��¼��ͣ
	 * \endif
	 */
	public static final int     SDK_BURNING_PAUSE = 204;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Resume
	 * \else
	 * ��¼����
	 * \endif
	 */
	public static final int     SDK_BURNING_CONTINUE = 205;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Postponed
	 * \else
	 * ��¼˳��
	 * \endif
	 */
	public static final int     SDK_BURNING_POSTPONE = 206;
	
	/**
	 * \if ENGLISH_LANG
	 * OEM control
	 * \else
	 * ��ͣ����
	 * \endif
	 */
	public static final int     SDK_CTRL_OEMCTRL = 207;
	
	/**
	 * \if ENGLISH_LANG
	 * Start to device backup
	 * \else
	 * �豸���ݿ�ʼ
	 * \endif
	 */
	public static final int     SDK_BACKUP_START = 208;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop to device backup
	 * \else
	 * �豸����ֹͣ
	 * \endif
	 */
	public static final int     SDK_BACKUP_STOP = 209;
	
	/**
	 * \if ENGLISH_LANG
	 * Add WIFI configuration manually for car device
	 * \else
	 * �����ֶ�����WIFI����
	 * \endif
	 */
	public static final int     SDK_VIHICLE_WIFI_ADD = 210;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete WIFI configuration manually for car device
	 * \else
	 * �����ֶ�ɾ��WIFI����
	 * \endif
	 */
	public static final int     SDK_VIHICLE_WIFI_DEC = 211;
	
	/**
	 * \if ENGLISH_LANG
	 * Start to buzzer control 
	 * \else
	 * ���������ƿ�ʼ
	 * \endif
	 */
	public static final int     SDK_BUZZER_START = 212;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop to buzzer control
	 * \else
	 * ���������ƽ���
	 * \endif
	 */
	public static final int     SDK_BUZZER_STOP = 213;
	
	/**
	 * \if ENGLISH_LANG
	 * Reject User
	 * \else
	 * �޳��û�
	 * \endif
	 */
	public static final int     SDK_REJECT_USER = 214;
	
	/**
	 * \if ENGLISH_LANG
	 * Shield User
	 * \else
	 * �����û�
	 * \endif
	 */
	public static final int     SDK_SHIELD_USER = 215;
	
	/**
	 * \if ENGLISH_LANG
	 * Rain Brush 
	 * \else
	 * ���ܽ�ͨ, ��ˢ���� 
	 * \endif
	 */
	public static final int     SDK_RAINBRUSH = 216;
	
	/**
	 * \if ENGLISH_LANG
	 * manual snap (struct MANUAL_SNAP_PARAMETER)
	 * \else
	 * �����ܽ�ͨ, �ֶ�ץ�� (��Ӧ�ṹ��MANUAL_SNAP_PARAMETER)
	 * \endif
	 */
	public static final int     SDK_MANUAL_SNAP = 217;
	
	/**
	 * \if ENGLISH_LANG
	 * manual ntp time adjust
	 * \else
	 * �ֶ�NTPУʱ
	 * \endif
	 */
	public static final int     SDK_MANUAL_NTP_TIMEADJUST = 218;
	
	/**
	 * \if ENGLISH_LANG
	 * navigation info and note
	 * \else
	 * ������Ϣ�Ͷ���Ϣ
	 * \endif
	 */
	public static final int     SDK_NAVIGATION_SMS = 219;
	
	/**
	 * \if ENGLISH_LANG
	 * route info
	 * \else
	 * ·�ߵ�λ��Ϣ
	 * \endif
	 */
	public static final int     SDK_CTRL_ROUTE_CROSSING = 220;
	
	/**
	 * \if ENGLISH_LANG
	 * backup device format
	 * \else
	 * ��ʽ�������豸
	 * \endif
	 */
	public static final int     SDK_BACKUP_FORMAT = 221;
	
	/**
	 * \if ENGLISH_LANG
	 * local preview split(struct DEVICE_LOCALPREVIEW_SLIPT_PARAMETER)
	 * \else
	 * �����豸�˱���Ԥ���ָ�(��Ӧ�ṹ��DEVICE_LOCALPREVIEW_SLIPT_PARAMETER)  
	 * \endif
	 */
	public static final int     SDK_DEVICE_LOCALPREVIEW_SLIPT = 222;
	
	/**
	 * \if ENGLISH_LANG
	 * RAID init
	 * \else
	 * RAID��ʼ��
	 * \endif
	 */
	public static final int     SDK_CTRL_INIT_RAID = 223;
	
	/**
	 * \if ENGLISH_LANG
	 * RAID control
	 * \else
	 * RAID����
	 * \endif
	 */
	public static final int     SDK_CTRL_RAID = 224;
	
	/**
	 * \if ENGLISH_LANG
	 * sapredisk control
	 * \else
	 * �ȱ��̲���
	 * \endif
	 */
	public static final int     SDK_CTRL_SAPREDISK = 225;
	
	/**
	 * \if ENGLISH_LANG
	 * wifi connect(struct WIFI_CONNECT)
	 * \else
	 * �ֶ�����WIFI����(��Ӧ�ṹ��WIFI_CONNECT)
	 * \endif
	 */
	public static final int     SDK_WIFI_CONNECT = 226;
	
	/**
	 * \if ENGLISH_LANG
	 * wifi disconnect(struct WIFI_CONNECT)
	 * \else
	 * �ֶ��Ͽ�WIFI����(��Ӧ�ṹ��WIFI_CONNECT)
	 * \endif
	 */
	public static final int     SDK_WIFI_DISCONNECT = 227;
	
	/**
	 * \if ENGLISH_LANG
	 * Arm/disarm operation 
	 * \else
	 * ����������
	 * \endif
	 */
	public static final int     SDK_CTRL_ARMED = 228;
	
	/**
	 * \if ENGLISH_LANG
	 * IP modify(struct DHCTRL_IPMODIFY_PARAM)     
	 * \else
	 * �޸�ǰ��IP(��Ӧ�ṹ��SDKCTRL_IPMODIFY_PARAM)  
	 * \endif
	 */
	public static final int     SDK_CTRL_IP_MODIFY = 229;
	
	/**
	 * \if ENGLISH_LANG
	 * wps connect wifi(struct DHCTRL_CONNECT_WIFI_BYWPS)
	 * \else
	 * wps����wifi(��Ӧ�ṹ��SDKCTRL_CONNECT_WIFI_BYWPS)
	 * \endif
	 */
	public static final int     SDK_CTRL_WIFI_BY_WPS = 230;
	
	/**
	 * \if ENGLISH_LANG
	 * format pattion (struct DH_FORMAT_PATITION)
	 * \else
	 * ��ʽ������(��Ӧ�ṹ��SDK_FORMAT_PATITION)
	 * \endif
	 */
	public static final int     SDK_CTRL_FORMAT_PATITION = 231;
	
	/**
	 * \if ENGLISH_LANG
	 * eject storage device(struct DH_EJECT_STORAGE_DEVICE)
	 * \else
	 * �ֶ�ж���豸(��Ӧ�ṹ��SDK_EJECT_STORAGE_DEVICE)
	 * \endif
	 */
	public static final int     SDK_CTRL_EJECT_STORAGE = 232;
	
	/**
	 * \if ENGLISH_LANG
	 * load storage device(struct DH_LOAD_STORAGE_DEVICE)
	 * \else
	 * �ֶ�װ���豸(��Ӧ�ṹ��SDK_LOAD_STORAGE_DEVICE)
	 * \endif
	 */
	public static final int     SDK_CTRL_LOAD_STORAGE = 233;
	
	/**
	 * \if ENGLISH_LANG
	 * close burner(struct NET_CTRL_BURNERDOOR) need wait 6s
	 * \else
	 * �رտ�¼��������(��Ӧ�ṹ�� NET_CTRL_BURNERDOOR) һ����Ҫ��6��
	 * \endif
	 */
	public static final int     SDK_CTRL_CLOSE_BURNER = 234;
	
	/**
	 * \if ENGLISH_LANG
	 * eject burner(struct NET_CTRL_BURNERDOOR) need wait 4s
	 * \else
	 * ������¼��������(��Ӧ�ṹ�� NET_CTRL_BURNERDOOR) һ����Ҫ��4��
	 * \endif
	 */
	public static final int     SDK_CTRL_EJECT_BURNER = 235;
	
	/**
	 * \if ENGLISH_LANG
	 * confirm alarm NET_CTRL_CLEAR_ALARM
	 * \else
	 * ����(��Ӧ�ṹ�� NET_CTRL_CLEAR_ALARM)
	 * \endif
	 */
	public static final int     SDK_CTRL_CLEAR_ALARM = 236;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitorwall_TV info (struct  NET_CTRL_MONITORWALL_TVINFO)
	 * \else
	 * ����ǽ��Ϣ��ʾ(��Ӧ�ṹ�� NET_CTRL_MONITORWALL_TVINFO)
	 * \endif
	 */
	public static final int     SDK_CTRL_MONITORWALL_TVINFO = 237;
	
	/**
	 * \if ENGLISH_LANG
	 * start Intelligent VIDEO analysis (corresponding structure NET CTRL START VIDEO ANALYSE)
	 * \else
	 * ��ʼ��Ƶ���ܷ���(��Ӧ�ṹ�� NET_CTRL_START_VIDEO_ANALYSE)
	 * \endif
	 */
	public static final int     SDK_CTRL_START_VIDEO_ANALYSE =   238; 
	
	/**
	 * \if ENGLISH_LANG
	 * STOP intelligent VIDEO analysis corresponding structure NET (CTRL STOP VIDEO ANALYSE)
	 * \else
	 * ֹͣ��Ƶ���ܷ���(��Ӧ�ṹ�� NET_CTRL_STOP_VIDEO_ANALYSE)
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_VIDEO_ANALYSE =   239;
	
	/**
	 * \if ENGLISH_LANG
	 * Controlled start equipment upgrades, independently complete the upgrade process by the equipment do not need to upgrade file
	 * \else
	 * ���������豸����,���豸���������������,����Ҫ���������ļ�
	 * \endif
	 */
	public static final int     SDK_CTRL_UPGRADE_DEVICE =   240;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-channel preview playback channel switching corresponding structure NET (CTRL MULTIPLAYBACK CHANNALES)
	 * \else
	 * �л���ͨ��Ԥ���طŵ�ͨ��(��Ӧ�ṹ�� NET_CTRL_MULTIPLAYBACK_CHANNALES)
	 * \endif
	 */
	public static final int     SDK_CTRL_MULTIPLAYBACK_CHANNALES =   241;
	
	/**
	 * \if ENGLISH_LANG
	 * Turn on the switch power supply timing device output corresponding.net (CTRL SEQPOWER PARAM)
	 * \else
	 * ��Դʱ�����򿪿����������(��Ӧ NET_CTRL_SEQPOWER_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_OPEN =   242;
	
	/**
	 * \if ENGLISH_LANG
	 * Close the switch power supply timing device output corresponding.net (CTRL SEQPOWER PARAM)
	 * \else
	 * ��Դʱ�����رտ����������(��Ӧ NET_CTRL_SEQPOWER_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_CLOSE =   243;
	
	/**
	 * \if ENGLISH_LANG
	 * Power timing group open the switch quantity output corresponding.net (CTRL SEQPOWER PARAM)
	 * \else
	 * ��Դʱ�����򿪿������������(��Ӧ NET_CTRL_SEQPOWER_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_OPEN_ALL =   244;
	
	/**
	 * \if ENGLISH_LANG
	 * Power sequence set close the switch quantity output corresponding.net (CTRL SEQPOWER PARAM)
	 * \else
	 * ��Դʱ�����رտ������������(��Ӧ NET_CTRL_SEQPOWER_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_CLOSE_ALL =   245;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR up corresponding.net (CTRL PROJECTOR PARAM)
	 * \else
	 * ͶӰ������(��Ӧ NET_CTRL_PROJECTOR_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_RISE =   246;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR drop (corresponding to the.net CTRL PROJECTOR PARAM)
	 * \else
	 * ͶӰ���½�(��Ӧ NET_CTRL_PROJECTOR_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_FALL =   247;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR stop (corresponding to the.net CTRL PROJECTOR PARAM)
	 * \else
	 * ͶӰ��ֹͣ(��Ӧ NET_CTRL_PROJECTOR_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_STOP =   248;
	
	/**
	 * \if ENGLISH_LANG
	 * INFRARED buttons (corresponding to the.net CTRL INFRARED KEY PARAM)
	 * \else
	 * ���ⰴ��(��Ӧ NET_CTRL_INFRARED_KEY_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_INFRARED_KEY =   249;
	
	/**
	 * \if ENGLISH_LANG
	 * Device START playback of audio file corresponding structure NET (CTRL START PLAYAUDIO)
	 * \else
	 * �豸��ʼ������Ƶ�ļ�(��Ӧ�ṹ�� NET_CTRL_START_PLAYAUDIO)
	 * \endif
	 */
	public static final int     SDK_CTRL_START_PLAYAUDIO =   250;
	
	/**
	 * \if ENGLISH_LANG
	 * Equipment stop playback of audio file
	 * \else
	 * �豸ֹͣ������Ƶ�ļ�
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_PLAYAUDIO =   251;
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding structure NET open alarm (CTRL ALARMBELL)
	 * \else
	 * ��������(��Ӧ�ṹ�� NET_CTRL_ALARMBELL)
	 * \endif
	 */
	public static final int     SDK_CTRL_START_ALARMBELL =   252;
	
	/**
	 * \if ENGLISH_LANG
	 * Close the warning signal corresponding structure NET (CTRL ALARMBELL)
	 * \else
	 * �رվ���(��Ӧ�ṹ�� NET_CTRL_ALARMBELL)
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_ALARMBELL =   253;
	
	/**
	 * \if ENGLISH_LANG
	 * OPEN ACCESS control - corresponding structure NET (CTRL ACCESS OPEN)
	 * \else
	 * �Ž�����-����(��Ӧ�ṹ�� NET_CTRL_ACCESS_OPEN)
	 * \endif
	 */
	public static final int     SDK_CTRL_ACCESS_OPEN =   254;
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding structure NET BYPASS function (CTRL SET BYPASS)
	 * \else
	 * ������·����(��Ӧ�ṹ�� NET_CTRL_SET_BYPASS)
	 * \endif
	 */
	public static final int     SDK_CTRL_SET_BYPASS =   255;
	
	/**
	 * \if ENGLISH_LANG
	 * Add records to record set number (corresponding to the.net CTRL you INSERT PARAM)
	 * \else
	 * ��Ӽ�¼����ü�¼�����(��ӦNET_CTRL_RECORDSET_INSERT_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_INSERT =   256;
	
	/**
	 * \if ENGLISH_LANG
	 * Update a record of the number (corresponding to the.net CTRL you PARAM)
	 * \else
	 * ����ĳ��¼����ŵļ�¼(��ӦNET_CTRL_RECORDSET_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_UPDATE =   257;
	
	/**
	 * \if ENGLISH_LANG
	 * According to the record set number to delete a record (corresponding to the.net CTRL you PARAM)
	 * \else
	 * ���ݼ�¼�����ɾ��ĳ��¼(��ӦNET_CTRL_RECORDSET_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_REMOVE =   258;
	
	/**
	 * \if ENGLISH_LANG
	 * Remove all RECORDSET information corresponding.net (CTRL you PARAM)
	 * \else
	 * ������м�¼����Ϣ(��ӦNET_CTRL_RECORDSET_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_CLEAR =   259;
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance guard control - CLOSE corresponding structure NET (CTRL ACCESS CLOSE)
	 * \else
	 * �Ž�����-����(��Ӧ�ṹ�� NET_CTRL_ACCESS_CLOSE)
	 * \endif
	 */
	public static final int     SDK_CTRL_ACCESS_CLOSE =   260;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm sub system activation setup(corresponding structure NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE)
	 * \else
	 * ������ϵͳ��������(��Ӧ�ṹ��NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE)
	 * \endif
	 */
	public static final int     SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET =   261;
	
	/**
	 * \if ENGLISH_LANG
	 * Disable device open gateway(corresponding to structure  NET_CTRL_FORBID_OPEN_STROBE)
	 * \else
	 * ��ֹ�豸�˿�բ(��Ӧ�ṹ�� NET_CTRL_FORBID_OPEN_STROBE)
	 * \endif
	 */
	public static final int     SDK_CTRL_FORBID_OPEN_STROBE =   262;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable gateway(corresponding to structure  NET_CTRL_OPEN_STROBE)
	 * \else
	 * ������բ(��Ӧ�ṹ�� NET_CTRL_OPEN_STROBE)
	 * \endif
	 */
	public static final int     SDK_CTRL_OPEN_STROBE =   263;
	
	/**
	 * \if ENGLISH_LANG
	 * Talk no response(corresponding to structure  NET_CTRL_TALKING_REFUSE)
	 * \else
	 * �Խ��ܾ�����(��Ӧ�ṹ�� NET_CTRL_TALKING_REFUSE)
	 * \endif
	 */
	public static final int     SDK_CTRL_TALKING_REFUSE =   264;
	
	/**
	 * \if ENGLISH_LANG
	 * arm-disarm operation(corresponding to structure CTRL_ARM_DISARM_PARAM_EX), CTRL_ARM_DISARM_PARAM upgrade��recommended
	 * \else
	 * ����������(��Ӧ�ṹ�� CTRL_ARM_DISARM_PARAM_EX), ��CTRL_ARM_DISARM_PARAM ���������������
	 * \endif
	 */
	public static final int     SDK_CTRL_ARMED_EX = 265;
	
	/**
	 * \if ENGLISH_LANG
	 * Net keyboard control(corresponding to structure  DHCTRL_NET_KEYBOARD)
	 * \else
	 * ������̿���(��Ӧ�ṹ�� DHCTRL_NET_KEYBOARD)
	 * \endif
	 */
    public static final int     SDK_CTRL_NET_KEYBOARD = 400;
    
    /**
	 * \if ENGLISH_LANG
	 * Open air conditioner(corresponding to structure  NET_CTRL_OPEN_AIRCONDITION)
	 * \else
	 * �򿪿յ�(��Ӧ�ṹ�� NET_CTRL_OPEN_AIRCONDITION)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_OPEN = 401;
    
    /**
	 * \if ENGLISH_LANG
	 * Close air-conditioner(corresponding to structure  NET_CTRL_CLOSE_AIRCONDITION)
	 * \else
	 * �رտյ�(��Ӧ�ṹ�� NET_CTRL_CLOSE_AIRCONDITION)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_CLOSE = 402;
    
    /**
	 * \if ENGLISH_LANG
	 * Set temperature (corresponding to structure  NET_CTRL_SET_TEMPERATURE)
	 * \else
	 * �趨�յ��¶�(��Ӧ�ṹ�� NET_CTRL_SET_TEMPERATURE)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SET_TEMPERATURE = 403;
    
    /**
	 * \if ENGLISH_LANG
	 * Adjust temperature(corresponding to structure  NET_CTRL_ADJUST_TEMPERATURE)
	 * \else
	 * ���ڿյ��¶�(��Ӧ�ṹ�� NET_CTRL_ADJUST_TEMPERATURE)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_ADJUST_TEMPERATURE = 404;
    
    /**
	 * \if ENGLISH_LANG
	 * Set air work mode(corresponding to structure  NET_CTRL_ADJUST_TEMPERATURE)
	 * \else
	 * ���ÿյ�����ģʽ(��Ӧ�ṹ�� NET_CTRL_ADJUST_TEMPERATURE)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SETMODE = 405;
    
    /**
	 * \if ENGLISH_LANG
	 * Set fan mode(corresponding to structure  NET_CTRL_AIRCONDITION_SETMODE)
	 * \else
	 * ���ÿյ��ͷ�ģʽ(��Ӧ�ṹ�� NET_CTRL_AIRCONDITION_SETMODE)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SETWINDMODE = 406;
    
    /**
	 * \if ENGLISH_LANG
	 * Recover device default and set new protocol(corresponding to structure NET_CTRL_RESTORE_DEFAULT)
	 * Recover config and use this enumeration first, if port failed,
	 * and CLIENT_GetLastError return NET_UNSUPPORTED, try again DH_CTRL_RESTOREDEFAULT restore config
	 * \else
	 * �ָ��豸��Ĭ��������Э��(��Ӧ�ṹ��NET_CTRL_RESTORE_DEFAULT)
	 * �ָ���������ʹ�ø�ö�٣�����ӿ�ʧ�ܣ�
	 * ��CLIENT_GetLastError����NET_UNSUPPORTED,�ٳ���ʹ��SDK_CTRL_RESTOREDEFAULT�ָ�����
	 * \endif
	 */
    public static final int     SDK_CTRL_RESTOREDEFAULT_EX  = 407;
    
    /**
	 * \if ENGLISH_LANG
	 * send event to device (corresponding to  structure  NET_NOTIFY_EVENT_DATA)
	 * \else
	 * ���豸�����¼�(��Ӧ�ṹ�� NET_NOTIFY_EVENT_DATA)
	 * \endif
	 */
    public static final int     SDK_CTRL_NOTIFY_EVENT = 408;
    
    /**
	 * \if ENGLISH_LANG
	 * mute alarm setup
	 * \else
	 * ������������
	 * \endif
	 */
    public static final int     SDK_CTRL_SILENT_ALARM_SET = 409;
    
    /**
	 * \if ENGLISH_LANG
	 * device start sound report(corresponding to  structure  NET_CTRL_START_PLAYAUDIOEX)
	 * \else
	 * �豸��ʼ��������(��Ӧ�ṹ�� NET_CTRL_START_PLAYAUDIOEX)
	 * \endif
	 */
	public static final int     SDK_CTRL_START_PLAYAUDIOEX = 410;
	
	/**
	 * \if ENGLISH_LANG
	 * device stop sound report
	 * \else
	 * �豸ֹͣ��������
	 * \endif
	 */
    public static final int     SDK_CTRL_STOP_PLAYAUDIOEX = 411;
    
    /**
	 * \if ENGLISH_LANG
	 * close gateway(corresponding to  structure  NET_CTRL_CLOSE_STROBE)
	 * \else
	 * �رյ�բ(��Ӧ�ṹ�� NET_CTRL_CLOSE_STROBE)
	 * \endif
	 */
    public static final int     SDK_CTRL_CLOSE_STROBE = 412;
    
    /**
	 * \if ENGLISH_LANG
	 * set parking reservation status (corresponding to  structure  NET_CTRL_SET_ORDER_STATE)
	 * \else
	 * ���ó�λԤ��״̬(��Ӧ�ṹ�� NET_CTRL_SET_ORDER_STATE)
	 * \endif
	 */
	public static final int     SDK_CTRL_SET_ORDER_STATE = 413;
	
	/**
	 * \if ENGLISH_LANG
	 * add record��get record collection no.(corresponding to NET_CTRL_RECORDSET_INSERT_PARAM)
	 * \else
	 * ��Ӽ�¼����ü�¼�����(��ӦNET_CTRL_RECORDSET_INSERT_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_INSERTEX = 414;
	
	/**
	 * \if ENGLISH_LANG
	 * update record set no.��s record(corresponding to NET_CTRL_RECORDSET_PARAM)
	 * \else
	 * ����ĳ��¼����ŵļ�¼(��ӦNET_CTRL_RECORDSET_PARAM)
	 * \endif
	 */
    public static final int     SDK_CTRL_RECORDSET_UPDATEEX = 415;
    
    /**
	 * \if ENGLISH_LANG
	 * fingerprint collection (corresponding to structure NET_CTRL_CAPTURE_FINGER_PRINT)
	 * \else
	 * ָ�Ʋɼ�(��Ӧ�ṹ�� NET_CTRL_CAPTURE_FINGER_PRINT)
	 * \endif
	 */
    public static final int     SDK_CTRL_CAPTURE_FINGER_PRINT = 416;
    
    /**
	 * \if ENGLISH_LANG
	 * Parking lot entrance/exit controller LED setup(corresponding structure  NET_CTRL_ECK_LED_SET_PARAM)
	 * \else
	 * ͣ��������ڿ�����LED����(��Ӧ�ṹ�� NET_CTRL_ECK_LED_SET_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_ECK_LED_SET = 417;
	
	/**
	 * \if ENGLISH_LANG
	 * Intelligent parking system in/out device IC card info import (corresponding structure  NET_CTRL_ECK_IC_CARD_IMPORT_PARAM)
	 * \else
	 * ����ͣ��ϵͳ����ڻ�IC����Ϣ����(��Ӧ�ṹ�� NET_CTRL_ECK_IC_CARD_IMPORT_PARAM)
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_IC_CARD_IMPORT = 418;
    
    /**
	 * \if ENGLISH_LANG
	 * Intelligent parking system in/out device IC card info sync command, receive this command, device will delete original IC card info(corresponding structure  NET_CTRL_ECK_SYNC_IC_CARD_PARAM)
	 * \else
	 * ����ͣ��ϵͳ����ڻ�IC����Ϣͬ��ָ��յ���ָ����豸ɾ��ԭ��IC����Ϣ(��Ӧ�ṹ�� NET_CTRL_ECK_SYNC_IC_CARD_PARAM)
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_SYNC_IC_CARD = 419;
    
    /**
	 * \if ENGLISH_LANG
	 * Delete specific wireless device(corresponding structure  NET_CTRL_LOWRATEWPAN_REMOVE)
	 * \else
	 * ɾ��ָ�������豸(��Ӧ�ṹ�� NET_CTRL_LOWRATEWPAN_REMOVE)
	 * \endif
	 */
    public static final int     SDK_CTRL_LOWRATEWPAN_REMOVE = 420;
    
    /**
	 * \if ENGLISH_LANG
	 * Modify wireless device info(corresponding structure  NET_CTRL_LOWRATEWPAN_MODIFY)
	 * \else
	 * �޸������豸��Ϣ(��Ӧ�ṹ�� NET_CTRL_LOWRATEWPAN_MODIFY)
	 * \endif
	 */
    public static final int     SDK_CTRL_LOWRATEWPAN_MODIFY = 421;
    
    /**
	 * \if ENGLISH_LANG
	 * Set up the vehicle spot information of the machine at the passageway of the intelligent parking system (corresponding to  NET_CTRL_ECK_SET_PARK_INFO_PARAM)
	 * \else
	 * ����ͣ��ϵͳ����ڻ����ó�λ��Ϣ(��Ӧ�ṹ�� NET_CTRL_ECK_SET_PARK_INFO_PARAM)
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_SET_PARK_INFO = 422;
    
    /**
	 * \if ENGLISH_LANG
	 * hang up the video phone (corresponding to NET_CTRL_VTP_DISCONNECT)
	 * \else
	 * �Ҷ���Ƶ�绰(��Ӧ�ṹ�� NET_CTRL_VTP_DISCONNECT)
	 * \endif
	 */
	public static final int     SDK_CTRL_VTP_DISCONNECT = 423;
	
	public static final int     SDK_CTRL_UPDATE_FILES = 424;
	
	public static final int     SDK_CTRL_MATRIX_SAVE_SWITCH = 425;
	
	public static final int     SDK_CTR_MATRIX_RESTORE_SWITCH = 426;
	
    public static final int     SDK_CTRL_THERMO_GRAPHY_ENSHUTTER = 0x10000;     // �����ȳ����������/����, pInBuf= NET_IN_THERMO_EN_SHUTTER*, pOutBuf= NET_OUT_THERMO_EN_SHUTTER * 
    public static final int     SDK_CTRL_RADIOMETRY_SETOSDMARK = 0x10001;       // ���ò������osdΪ����, pInBuf= NET_IN_RADIOMETRY_SETOSDMARK*, pOutBuf= NET_OUT_RADIOMETRY_SETOSDMARK *    
    public static final int     SDK_CTRL_AUDIO_REC_START_NAME = 0x10002;        // ������Ƶ¼�����õ�¼����, pInBuf = NET_IN_AUDIO_REC_MNG_NAME *, pOutBuf = NET_OUT_AUDIO_REC_MNG_NAME *
    public static final int     SDK_CTRL_AUDIO_REC_STOP_NAME = 0x10003;         // �ر���Ƶ¼���������ļ�����, pInBuf = NET_IN_AUDIO_REC_MNG_NAME *, pOutBuf = NET_OUT_AUDIO_REC_MNG_NAME *
    public static final int     SDK_CTRL_SNAP_MNG_SNAP_SHOT = 0x10004;          // ��ʱץͼ(�����ֶ�ץͼ), pInBuf = NET_IN_SNAP_MNG_SHOT *, pOutBuf = NET_OUT_SNAP_MNG_SHOT *
    public static final int     SDK_CTRL_LOG_STOP = 0x10005;                    // ǿ��ͬ���������ݵ����ݿⲢ�ر����ݿ�, pInBuf = NET_IN_LOG_MNG_CTRL *, pOutBuf = NET_OUT_LOG_MNG_CTRL *
    public static final int     SDK_CTRL_LOG_RESUME = 0x10006;                  // �ָ����ݿ�, pInBuf = NET_IN_LOG_MNG_CTRL *, pOutBuf = NET_OUT_LOG_MNG_CTRL *
    public static final int     SDK_CTRL_POS_ADD = 0x10007;                     // ����һ��Pos�豸, pInBuf = NET_IN_POS_ADD *, pOutBuf = NET_OUT_POS_ADD *
    public static final int     SDK_CTRL_POS_REMOVE = 0x10008;                  // ɾ��һ��Pos�豸, pInBuf = NET_IN_POS_REMOVE *, pOutBuf = NET_OUT_POS_REMOVE *
    public static final int     SDK_CTRL_POS_REMOVE_MULTI = 0x10009;            // ����ɾ��Pos�豸, pInBuf = NET_IN_POS_REMOVE_MULTI *, pOutBuf = NET_OUT_POS_REMOVE_MULTI *
    public static final int     SDK_CTRL_POS_MODIFY = 0x1000A;                  // �޸�һ��Pos�豸, pInBuf = NET_IN_POS_ADD *, pOutBuf = NET_OUT_POS_ADD *
    public static final int     SDK_CTRL_SET_SOUND_ALARM = 0x1000B;             // ������������, pInBuf = NET_IN_SOUND_ALARM *, pOutBuf = NET_OUT_SOUND_ALARM *
    public static final int 	SDK_CTRL_AUDIO_MATRIX_SILENCE = 0x1000C;	    // ��Ƶ����һ����������(��ӦpInBuf = NET_IN_AUDIO_MATRIX_SILENCE, pOutBuf =  NET_OUT_AUDIO_MATRIX_SILENCE)
    public static final int     SDK_CTRL_LOWRATEWPAN_ADD = 0x10011;				// ���������豸��Ϣ(��Ӧ  pInBuf = NET_CTRL_LOWRATEWPAN_ADD *, pOutBUf = NULL)
    public static final int 	SDK_CTRL_LOWRATEWPAN_REMOVEALL = 0x10012;		// ɾ�����е������豸��Ϣ(��Ӧ pInBuf = NET_CTRL_LOWRATEWPAN_REMOVEALL *, pOutBUf = NULL)
    public static final int     SDK_CTRL_TEST_MAIL = 0x10014;                   // �����ʼ�(��Ӧ pInBuf = NET_IN_TEST_MAIL, pOutBuf = NET_OUT_TEST_MAIL)
}
