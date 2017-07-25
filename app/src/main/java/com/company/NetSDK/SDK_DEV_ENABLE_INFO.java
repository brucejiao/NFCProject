package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Supported Function List
 * \else
 * �豸֧�ֹ����б�
 * \endif
 */
public class SDK_DEV_ENABLE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Capability set, subscript: Enumeration values, Bit: Subfunction.
	 * <pre>
	 * Enumeration		values											Enumeration Definition Significance 
	 * 0				EN_FTP 											FTP,1:Transmit Records 2:Transmit Snapshot 
	 * 1 				EN_SMTP 										SMTP,1:Transmit Alarm Text Email 2:Transmit Alarm Image 3: Support Health mail 
	 * 2 				EN_NTP 											NTP:1:Adjust system time 
	 * 3 				EN_AUTO_MAINTAIN 								Automatic Maintenance :1:Reboot 2:Shutdown 3:Delete Files 
	 * 4	 			EN_VIDEO_COVER 									Cover-area :1:Multi area 
	 * 5 				EN_AUTO_REGISTER 								Auto Register :1:SDK auto login after registration 
	 * 6 				EN_DHCP 										DHCP :1:DHCP 
	 * 7 				EN_UPNP 										UPNP:1:UPNP 
	 * 8 				EN_COMM_SNIFFER 								COMM Sniffer :1: CommATM 
	 * 9 				EN_NET_SNIFFER 									Net Sniffer: 1: NetSniffer 
	 * 10 				EN_BURN 										Burn:1: Inquire burning status 
	 * 11 				EN_VIDEO_MATRIX 								Video Matrix:1: Support or not 2: Support SPOT Video Matrix or not 
	 * 12 				EN_AUDIO_DETECT 								Audio Detect:1: Support or not 
	 * 13 				EN_STORAGE_STATION 								Storage Station:1: Ftp Server(Ips) 2: SMB 3: NFS 4: ISCSI 16: DISK 17: U disk 
	 * 14 				EN_IPSSEARCH 									IPS storage search ��λ:1: IPS storage search 
	 * 15 				EN_SNAP 										Snapshot:1: Resolution2: FPS3: Snap type 4: Format5: Quality 
	 * 16 				EN_DEFAULTNIC	 								Default NIC inquires: 1: Support 
	 * 17 				EN_SHOWQUALITY 									Show Quality Under CBR Mode: 1: Support 
	 * 18 				EN_CONFIG_IMEXPORT 								Config import and export: 1: Support 
	 * 19 				EN_LOG 											Log Query: 1: Support. 
	 * 20 				EN_SCHEDULE 									Record Settings: 1: Redundancy 2: Pre-record 3: Record Period. 
	 * 21 				EN_NETWORK_TYPE 								Network type: 1: Ethernet 2: Wlan3: CDMA/GPRS 4: CDMA/GPRS Multi NIC. 
	 * 22 				EN_MARK_IMPORTANTRECORD 						Mark Important Record: 1: Set Important Record Mark. 
	 * 23 				EN_ACFCONTROL 									ACF Control:1: Support ACF Control, 2: Support timing alarm ACF control(Does not support Motion Detect). 
	 * 24 				EN_MULTIASSIOPTION 								Multi Extra streams :1: Support three extra streams. 
	 * 25 				EN_DAVINCIMODULE 								Davinci Modle:1: Schedule handled separately 2: Standard I frame interval setting. 
	 * 26 				EN_GPS 											GPS:1: Gps. 
	 * 27 				EN_MULTIETHERNET 								Multi NIC Query:1: Support. 
	 * 28 				EN_LOGIN_ATTRIBUTE 								Login attribute: 1: Support Login attribute query. 
	 * 29 				EN_RECORD_GENERAL 								Record general:1: Normal Record��2: Alarm Record��3: Motion Detect Record��4: Local Storage��5: Remote Storage��6: Redundancy Storage��7: Local Emergency Storage. 
	 * 30 				EN_JSON_CONFIG 									Json Format Config:1: Support Json Format. 
	 * 31 				EN_HIDE_FUNCTION	 							Hide Function:1: Hide PTZ Function. 
	 * 32 				EN_DISK_DAMAGE 									Disk Damage Information:1: Query Disk Damage Information. 
	 * 33 				EN_PLAYBACK_SPEED_CTRL 							Playback Speed Control 1: Support fast playback. 
	 * 34 				EN_HOLIDAYSCHEDULE 								Holiday Schedule: 1,Support Holiday Schedule. 
	 * 35 				EN_FETCH_MONEY_TIMEOUT 							ATM Timeout. 
	 * 36 				EN_BACKUP_VIDEO_FORMAT 							Backup Format1:DAV, 2:ASF. 
	 * 37 				EN_QUERY_DISK_TYPE 								Query Disk Type. 
	 * 38 				EN_CONFIG_DISPLAY_OUTPUT 						Config disply output: 1:Image Split and Tour settings. 
	 * 39 				EN_SUBBITRATE_RECORD_CTRL 						Subbitrate Record Control1-Extra stream Recoding control. 
	 * 40 				EN_IPV6 										IPV6 Settings:1-IPV6 Settings. 
	 * 41 				EN_SNMP 										SNMP. 
	 * 42 				EN_QUERY_URL 									Query URL: 1-Query URL. 
	 * 43 				EN_ISCSI 										ISCSI. 
	 * 44 				EN_RAID 										Support Raid. 
	 * 45 				EN_HARDDISK_INFO 								Hard disk information F5 inquiry. 
	 * 46 				EN_PICINPIC 									Pic in Pic :1,Settings; 2,Preview, Record, Query, Download. 
	 * 47 				EN_PLAYBACK_SPEED_CTRL_SUPPORT 					EN_PLAYBACK_SPEED_CTRL . 
	 * 48 				EN_LF_XDEV 										Support 24, 32, 64 way LF-X serial 
	 * </pre>
	 * \else
	 * �����б�������,�±��Ӧ������ö��ֵ,��λ��ʾ�ӹ���
	 * <pre>
	 * ö��ֵ 		ö�ٶ���							�������� 
	 * 0 		EN_FTP FTP						��λ,1:����¼���ļ� 2:����ץͼ�ļ� 
	 * 1 		EN_SMTP SMTP					��λ,1:���������ı��ʼ� 2:��������ͼƬ 3:֧�ֽ����ʼ����� 
	 * 2 		EN_NTP NTP						��λ:1:����ϵͳʱ�� 
	 * 3 		EN_AUTO_MAINTAIN				�Զ�ά�� ��λ:1:���� 2:�ر� 3:ɾ���ļ� 
	 * 4 		EN_VIDEO_COVER					�����ڵ� ��λ:1:�������ڵ� 
	 * 5 		EN_AUTO_REGISTER				����ע�� ��λ:1:ע���sdk������½ 
	 * 6 		EN_DHCP DHCP					��λ:1:DHCP 
	 * 7 		EN_UPNP UPNP					��λ:1:UPNP 
	 * 8 		EN_COMM_SNIFFER					����ץ�� ��λ:1: CommATM 
	 * 9 		EN_NET_SNIFFER					����ץ�� ��λ: 1: NetSniffer 
	 * 10 		EN_BURN							��¼���� ��λ:1: ��ѯ��¼״̬ 
	 * 11 		EN_VIDEO_MATRIX					��Ƶ���� ��λ:1: �Ƿ�֧����Ƶ���� 2: �Ƿ�֧��SPOT��Ƶ���� 
	 * 12 		EN_AUDIO_DETECT					��Ƶ��� ��λ:1: �Ƿ�֧����Ƶ��� 
	 * 13 		EN_STORAGE_STATION				�洢λ�� ��λ:1: Ftp������(Ips) 2: SMB 3: NFS 4: ISCSI 16: DISK 17: U�� 
	 * 14 		EN_IPSSEARCH					IPS�洢��ѯ ��λ:1: IPS�洢��ѯ 
	 * 15 		EN_SNAP							ץͼ ��λ:1: �ֱ���2: ֡��3: ץͼ��ʽ4: ץͼ�ļ���ʽ5: ͼ������ 
	 * 16 		EN_DEFAULTNIC					֧��Ĭ��������ѯ ��λ: 1: ֧�� 
	 * 17 		EN_SHOWQUALITY					CBRģʽ����ʾ���������� ��λ: 1: ֧�� 
	 * 18 		EN_CONFIG_IMEXPORT				���õ��뵼���������� ��λ: 1: ֧��. 
	 * 19 		EN_LOG							�Ƿ�֧�ַ�ҳ��ʽ����־��ѯ ��λ: 1: ֧��. 
	 * 20 		EN_SCHEDULE						¼�����õ�һЩ���� ��λ: 1: ���� 2: Ԥ¼ 3: ¼��ʱ���. 
	 * 21 		EN_NETWORK_TYPE					�������� ��λ: 1: ��̬�� 2: ���߾��� 3: CDMA/GPRS 4: CDMA/GPRS����������. 
	 * 22 		EN_MARK_IMPORTANTRECORD			��ʶ��Ҫ¼�� ��λ: 1: ������Ҫ¼���ʶ. 
	 * 23 		EN_ACFCONTROL					�֡�ʿ��� ��λ:1: ֧�ֻ֡�ʿ���, 2: ֧�ֶ�ʱ�������ͻ֡�ʿ���(��֧�ֶ���),��������ACF��������. 
	 * 24 		EN_MULTIASSIOPTION				��·������ ��λ:1: ֧����·������. 
	 * 25 		EN_DAVINCIMODULE				�����ģ�� ��λ:1: ʱ���ֿ����� 2: ��׼I֡�������. 
	 * 26 		EN_GPS							GPS���� ��λ:1: Gps��λ����. 
	 * 27 		EN_MULTIETHERNET				֧�ֶ�������ѯ ��λ:1: ֧��. 
	 * 28 		EN_LOGIN_ATTRIBUTE				Login���� ��λ:1: ֧��Login���Բ�ѯ. 
	 * 29 		EN_RECORD_GENERAL				¼����� ��λ:1: ��ͨ¼��2: ����¼��3: ��̬���¼��4: ���ش洢��5: Զ�̴洢��6: ����洢��7: ���ؽ����洢. 
	 * 30 		EN_JSON_CONFIG					Json��ʽ���� ��λ:1: ֧��Json��ʽ. 
	 * 31 		EN_HIDE_FUNCTION				���ι��� ��λ:1: ����PTZ��̨����. 
	 * 32 		EN_DISK_DAMAGE					Ӳ�̻�����Ϣ֧������ ��λ:1: Ӳ�̻�����Ϣ��ѯ֧������. 
	 * 33 		EN_PLAYBACK_SPEED_CTRL			֧�ֻط������ٶȿ��� ��λ:1: ֧�ֻطż���. 
	 * 34 		EN_HOLIDAYSCHEDULE				֧�ּ���ʱ�������:��λ:1,֧�ּ���ʱ�������. 
	 * 35 		EN_FETCH_MONEY_TIMEOUT			ATMȡǮ��ʱ. 
	 * 36 		EN_BACKUP_VIDEO_FORMAT			����֧�ֵĸ�ʽ ��λ:1:DAV, 2:ASF. 
	 * 37 		EN_QUERY_DISK_TYPE 				֧��Ӳ�����Ͳ�ѯ. 
	 * 38 		EN_CONFIG_DISPLAY_OUTPUT		֧���豸��ʾ���(VGA��)���� ��λ: 1:����ָ���Ѳ����. 
	 * 39 		EN_SUBBITRATE_RECORD_CTRL		֧����չ����¼��������� ��λ:1-������¼���������. 
	 * 40 		EN_IPV6 						֧��IPV6����, ��λ:1-IPV6����. 
	 * 41 		EN_SNMP							SNMP(���������Э��). 
	 * 42 		EN_QUERY_URL					֧�ֻ�ȡ�豸URL��ַ, ��λ: 1-��ѯ����URL��ַ. 
	 * 43 		EN_ISCSI						ISCSI(InternetС�ͼ����ϵͳ�ӿ�����). 
	 * 44 		EN_RAID							֧��Raid����. 
	 * 45 		EN_HARDDISK_INFO				֧�ִ�����ϢF5��ѯ��. 
	 * 46 		EN_PICINPIC						֧�ֻ��л����� ��λ:1,���л�����; 2,���л�Ԥ����¼��洢����ѯ������. 
	 * 47 		EN_PLAYBACK_SPEED_CTRL_SUPPORT	ͬ EN_PLAYBACK_SPEED_CTRL,ֻΪ�˼���Э��. 
	 * 48 		EN_LF_XDEV						֧��24��32��64·LF-Xϵ��,��ע�����豸����ı����������㷽ʽ. 
	 * </pre>
	 * \endif
	 */
	public int IsFucEnable[] = new int[512];				
}
