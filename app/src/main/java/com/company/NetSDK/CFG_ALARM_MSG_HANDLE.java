package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Linkage Structure
 * \else
 * ����������Ϣ
 * \endif
 */
public class CFG_ALARM_MSG_HANDLE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * handling ability 
	 * \else
	 * ����
	 * \endif
	 */
	
	public boolean				abRecordMask;
	public boolean				abRecordEnable;
	public boolean				abRecordLatch;
	public boolean				abAlarmOutMask;
	public boolean				abAlarmOutEn;
	public boolean				abAlarmOutLatch;	
	public boolean				abExAlarmOutMask;
	public boolean				abExAlarmOutEn;
	public boolean				abPtzLinkEn;
	public boolean				abTourMask;
	public boolean				abTourEnable;
	public boolean				abSnapshot;
	public boolean				abSnapshotEn;
	public boolean				abSnapshotPeriod;
	public boolean				abSnapshotTimes;
	public boolean				abTipEnable;
	public boolean				abMailEnable;
	public boolean				abMessageEnable;
	public boolean				abBeepEnable;
	public boolean				abVoiceEnable;
	public boolean				abMatrixMask;
	public boolean				abMatrixEnable;
	public boolean				abEventLatch;
	public boolean				abLogEnable;
	public boolean				abDelay;
	public boolean				abVideoMessageEn;
	public boolean				abMMSEnable;
	public boolean				abMessageToNetEn;
	public boolean				abTourSplit;
	public boolean				abSnapshotTitleEn;

	public boolean                abChannelCount;
	public boolean                abAlarmOutCount;
	public boolean                abPtzLinkEx;
	public boolean                abSnapshotTitle;
	public boolean                abMailDetail;
	public boolean                abVideoTitleEn;
	public boolean                abVideoTitle;
	public boolean                abTour;
	public boolean                abDBKeys;
	public boolean                abJpegSummary;
	public boolean                abFlashEn;
	public boolean                abFlashLatch;
	

	/**
	 * \if ENGLISH_LANG
	 * Device Video Channel Count
	 * \else
	 * �豸����Ƶͨ����
	 * \endif
	 */
	public int					nChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Device Alarm Output Count 
	 * \else
	 * �豸�ı����������
	 * \endif
	 */
	public int					nAlarmOutCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Channl Mask(By Bits)
	 * \else
	 * ¼��ͨ������(��λ)
	 * \endif
	 */
	public int					dwRecordMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Record Enable
	 * \else
	 * ¼��ʹ��
	 * \endif
	 */
	public boolean				bRecordEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Delay Time(Second) 
	 * \else
	 * ¼����ʱʱ��(��)
	 * \endif
	 */
	public int					nRecordLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Output Channel Mask 
	 * \else
	 * �������ͨ������
	 * \endif
	 */
	public int					dwAlarmOutMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Record Output Enable 
	 * \else
	 * �������ʹ��
	 * \endif
	 */
	public boolean				bAlarmOutEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Output Delay Time(Time)
	 * \else
	 * ���������ʱʱ��(��)
	 * \endif
	 */
	public int					nAlarmOutLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * External Alarm Output Channel Mask 
	 * \else
	 * ��չ�������ͨ������
	 * \endif
	 */
	public int					dwExAlarmOutMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * External Alarm Output Enable 
	 * \else
	 * ��չ�������ʹ��
	 * \endif
	 */
	public boolean				bExAlarmOutEn;
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ Linkage 
	 * \else
	 * ��̨������
	 * \endif
	 */
	CFG_PTZ_LINK				stuPtzLink[] = new CFG_PTZ_LINK[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ Linkage Enable 
	 * \else
	 * ��̨����ʹ��
	 * \endif
	 */
	public boolean				bPtzLinkEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Tour Channel Mask 
	 * \else
	 * ��ѯͨ������
	 * \endif
	 */
	public int					dwTourMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Tour Enable 
	 * \else
	 * ��ѯʹ��
	 * \endif
	 */
	public boolean				bTourEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Channel No. Mask 
	 * \else
	 * ����ͨ��������
	 * \endif
	 */
	public int					dwSnapshot[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Enable 
	 * \else
	 * ����ʹ��
	 * \endif
	 */
	public boolean				bSnapshotEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Period(Second) 
	 * \else
	 * ��������(��)
	 * \endif
	 */
	public int					nSnapshotPeriod;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Times 	
	 * \else
	 * ���Ĵ���
	 * \endif
	 */
	public int					nSnapshotTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * Local News Prompt 
	 * \else
	 * ������Ϣ����ʾ
	 * \endif
	 */
	public boolean				bTipEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Send Email��Picture As Attach 
	 * \else
	 * �����ʼ��������ͼƬ����Ϊ����
	 * \endif
	 */
	public boolean				bMailEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload to Alarm Server 
	 * \else
	 * �ϴ�������������
	 * \endif
	 */
	public boolean				bMessageEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Beep 
	 * \else
	 * ����
	 * \endif
	 */
	public boolean				bBeepEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Prompt 
	 * \else
	 * ������ʾ
	 * \endif
	 */
	public boolean				bVoiceEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Video Matrix Channel Mask 
	 * \else
	 * ������Ƶ����ͨ������
	 * \endif
	 */
	public int					dwMatrixMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Video Matrix 
	 * \else
	 * ������Ƶ����
	 * \endif
	 */
	public boolean				bMatrixEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Start Delay Time��s is the Unit 0-15 
	 * \else
	 * ������ʼ��ʱʱ��(��)��0��15
	 * \endif
	 */
	public int					nEventLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * If Record Log 
	 * \else
	 * �Ƿ��¼��־
	 * \endif
	 */
	public boolean				bLogEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Delay Then Take Effect When Setting��Unit is Second 
	 * \else
	 * ����ʱ����ʱ����Ч����λΪ��
	 * \endif
	 */
	public int					nDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay Tip Tile To Video��Overlay Tile Includes Event Type��Channel No.��Count By Second
	 * \else
	 * ������ʾ��Ļ����Ƶ�����ӵ���Ļ�����¼����ͣ�ͨ���ţ����ʱ��
	 * \endif
	 */
	public boolean				bVideoMessageEn;
	
	/**
	 * \if ENGLISH_LANG
	 * MMS Enable 
	 * \else
	 * ���Ͳ���ʹ��
	 * \endif
	 */
	public boolean				bMMSEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Message Send To Network Enable
	 * \else
	 * ��Ϣ�ϴ�������ʹ��
	 * \endif
	 */
	public boolean				bMessageToNetEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Touring Split Mode 0: 1 Picture; 1: 8Picture 
	 * \else
	 * ��Ѳʱ�ķָ�ģʽ 0: 1����; 1: 8����
	 * \endif
	 */
	public int					nTourSplit;
	
	/**
	 * \if ENGLISH_LANG
	 * If Overlay Snapshot Title 
	 * \else
	 * �Ƿ����ͼƬ����
	 * \endif
	 */
	public boolean				bSnapshotTitleEn;
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ config 
	 * \else
	 * ��̨������
	 * \endif
	 */
	public int                  nPtzLinkExNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Extension PTZ 
	 * \else
	 * ��չ��̨��Ϣ
	 * \endif
	 */
	CFG_PTZ_LINK_EX     		stuPtzLinkEx[] = new CFG_PTZ_LINK_EX[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture title content no.
	 * \else
	 * ͼƬ����������
	 * \endif
	 */
	public int                  nSnapTitleNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture title content 
	 * \else
	 * ͼƬ��������
	 * \endif
	 */
	CFG_EVENT_TITLE     		stuSnapshotTitle[] = new CFG_EVENT_TITLE[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * email detail 
	 * \else
	 * �ʼ���ϸ����
	 * \endif
	 */
	CFG_MAIL_DETAIL     		stuMailDetail = new CFG_MAIL_DETAIL();
	
	/**
	 * \if ENGLISH_LANG
	 * overlay video title or not, for main stream 
	 * \else
	 * �Ƿ������Ƶ���⣬��Ҫָ������
	 * \endif
	 */
	public boolean              bVideoTitleEn;
	
	/**
	 * \if ENGLISH_LANG
	 * video title content no. 
	 * \else
	 * ��Ƶ����������Ŀ
	 * \endif
	 */
	public int                  nVideoTitleNum;
	
	/**
	 * \if ENGLISH_LANG
	 * video title content 
	 * \else
	 * ��Ƶ��������
	 * \endif
	 */
	CFG_EVENT_TITLE     		stuVideoTitle[] = new CFG_EVENT_TITLE[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * tour activation number 
	 * \else
	 * ��ѯ������Ŀ
	 * \endif
	 */
	public int                  nTourNum;
	
	/**
	 * \if ENGLISH_LANG
	 * tour avtivation config 
	 * \else
	 * ��ѯ��������
	 * \endif
	 */
	CFG_TOURLINK        		stuTour[] = new CFG_TOURLINK[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * specify data library releted no. 
	 * \else
	 * ָ�����ݿ�ؼ��ֵ���Ч��
	 * \endif
	 */
	public int                  nDBKeysNum;
	
	/**
	 * \if ENGLISH_LANG
	 * specify event detail needed data library key 
	 * \else
	 * ָ���¼���ϸ��Ϣ����Ҫд�����ݿ�Ĺؼ���
	 * \endif
	 */
	public char                 szDBKeys[][] = new char[FinalVar.MAX_DBKEY_NUM][FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * overlay to JPEG summary 
	 * \else
	 * ���ӵ�JPEGͼƬ��ժҪ��Ϣ
	 * \endif
	 */
	public byte                 byJpegSummary[] = new byte[FinalVar.MAX_SUMMARY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * compensate light or not 
	 * \else
	 * �Ƿ�ʹ�ܲ����
	 * \endif
	 */
	public boolean              bFlashEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * light compensation delay(s), delay range��[10,300] 
	 * \else
	 * �������ʱʱ��(��),��ʱʱ�䷶Χ��[10,300]
	 * \endif
	 */
	public int                  nFlashLatch;
	
	public boolean				abAudioFileName;
	public boolean				abAlarmBellEn;
	public boolean				abAccessControlEn;
	public boolean				abAccessControl;
	
	/**
	 * \if ENGLISH_LANG
	 * The Absolute Path to the Linkage Audio Files 
	 * \else
	 * ���������ļ�����·��
	 * \endif
	 */
	public byte[]				szAudioFileName = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Warning Signal Enable 
	 * \else
	 * ����ʹ��
	 * \endif
	 */
	public boolean				bAlarmBellEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Enable 
	 * \else
	 * �Ž�ʹ��
	 * \endif
	 */
	public boolean				bAccessControlEn; 
	
	/**
	 * \if ENGLISH_LANG
	 * Class Number of Entrance Guard 
	 * \else
	 * �Ž�����
	 * \endif
	 */
	public int					dwAccessControl; 
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Linkage Operation Information 
	 * \else
	 * �Ž�����������Ϣ
	 * \endif
	 * @see EM_CFG_ACCESSCONTROLTYPE
	 */
	public int[] 				emAccessControlType = new int[FinalVar.MAX_ACCESSCONTROL_NUM];
	
	public boolean				abTalkBack;	
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Linkage Information
	 * \else
	 * ��������������Ϣ
	 * \endif
	 */
	public CFG_TALKBACK_INFO	stuTalkback = new CFG_TALKBACK_INFO();

	public boolean				abPSTNAlarmServer;

	/**
	 * \if ENGLISH_LANG
	 * Telephone Alarm Center Linkage Information
	 * \else
	 *  �绰��������������Ϣ
	 * \endif
	 */
	public CFG_PSTN_ALARM_SERVER	stuPSTNAlarmServer = new CFG_PSTN_ALARM_SERVER();
	
	/**
	 * \if ENGLISH_LANG
	 * Telephone Alarm Center Linkage Information
	 * \else
	 * Event Response Timetable
	 * \endif
	 */
    public CFG_TIME_SCHEDULE       stuTimeSection = new CFG_TIME_SCHEDULE(); 
    
    public boolean				abAlarmBellLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * Police no. output delay time(10-300 s) 
	 * \else
	 * ���������ʱʱ��(10-300��)
	 * \endif
	 */
	public int					nAlarmBellLatch; 
	
	public CFG_ALARM_MSG_HANDLE() {
		for (int i = 0; i < FinalVar.MAX_VIDEO_CHANNEL_NUM; i++) {
			stuPtzLink[i] = new CFG_PTZ_LINK();
			stuPtzLinkEx[i] = new CFG_PTZ_LINK_EX();
			stuSnapshotTitle[i] = new CFG_EVENT_TITLE();
			stuVideoTitle[i] = new CFG_EVENT_TITLE();
			stuTour[i] = new CFG_TOURLINK();
		}
	}
}
