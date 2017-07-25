package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_CROSSREGIONDETECTION's data
 * \else
 * �¼�����EVENT_IVS_CROSSREGIONDETECTION(�������¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_CROSSREGION_INFO implements Serializable {
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
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * �¼�����
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * ʱ���(��λ�Ǻ���)
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * �¼�������ʱ��
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * event ID
	 * \else
	 * �¼�ID
	 * \endif
	 */
    public int                 nEventID;
    
    /**
     * \if ENGLISH_LANG
     * have being detected object
     * \else
     * ��⵽������
     * \endif
     */
    public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();
    
    /**
     * \if ENGLISH_LANG
     * event file info
     * \else
     * �¼���Ӧ�ļ���Ϣ
     * \endif
     */
    public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();
    
    /**
     * \if ENGLISH_LANG
     * rule detect region
     * \else
     * ����������
     * \endif
     */
    public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];
    
    /**
     * \if ENGLISH_LANG
     * rule detect region's point number
     * \else
     * ���������򶥵���
     * \endif
     */
    public int                 nDetectRegionNum;
    
    /**
     * \if ENGLISH_LANG
     * object moving track
     * \else
     * �����˶��켣
     * \endif
     */
    public SDK_POINT            TrackLine[] = new SDK_POINT[FinalVar.SDK_MAX_TRACK_LINE_NUM];
    
    /**
     * \if ENGLISH_LANG
     * object moving track's point number
     * \else
     * �����˶��켣������
     * \endif
     */
    public int                 nTrackLineNum;
    
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
     * direction, 0-in, 1-out,2-apaer,3-leave
     * \else
     * ��ʾ���ַ���, 0-����, 1-�뿪��2-���֣�3-��ʧ
     * \endif
     */
    public byte                bDirection;
    
    /**
     * \if ENGLISH_LANG
     * action type,0-appear 1-disappear 2-in area 3-cross area
     * \else
     * ��ʾ��⶯������,0-���� 1-��ʧ 2-�������� 3-��Խ����
     * \endif
     */
    public byte                bActionType;
    
    /**
     * \if ENGLISH_LANG
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * ͼƬ�����, ͬһʱ����(��ȷ����)�����ж���ͼƬ, ��0��ʼ
     * \endif
     */
    public byte                byImageIndex;
    
    /**
     * \if ENGLISH_LANG
     * flag(by bit),see NET_RESERVED_COMMON
     * \else
     * ץͼ��־(��λ)�������NET_RESERVED_COMMON
     * \endif
     */
    public int               dwSnapFlagMask;
    
    /**
     * \if ENGLISH_LANG
     * the source device's index,-1 means data in invalid
     * \else
     * �¼�Դ�豸�ϵ�index,-1��ʾ������Ч
     * \endif
     */
    public int                 nSourceIndex;
    
    /**
     * \if ENGLISH_LANG
     * the source device's sign(exclusive),field said local device does not exist or is empty
     * \else
     * �¼�Դ�豸Ψһ��ʶ,�ֶβ����ڻ���Ϊ�ձ�ʾ�����豸
     * \endif
     */
    public byte                szSourceDevice[] = new byte[FinalVar.MAX_PATH];
    
    /**
     * \if ENGLISH_LANG
     * event trigger times
     * \else
     * �¼������ۼƴ���
     * \endif
     */
    public int        nOccurrenceCount;
    
    /**
     * \if ENGLISH_LANG
     * Detect object amount
     * \else
     * ��⵽���������
     * \endif
     */
    public int                 nObjectNum;
    
    /**
     * \if ENGLISH_LANG
     * Detected object
     * \else
     * ��⵽������
     * \endif
     */
    public SDK_MSG_OBJECT       stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];
    
    /**
     * \if ENGLISH_LANG
     * Locus amount(Corresponding to the detected object amount.)
     * \else
     * �켣��(���⵽�����������Ӧ)
     * \endif
     */
    public int                 nTrackNum;
    
    /**
     * \if ENGLISH_LANG
     * Locus info(Corresponding to the detected object)
     * \else
     * �켣��Ϣ(���⵽�������Ӧ)
     * \endif
     */
    public SDK_POLY_POINTS      stuTrackInfo[] = new SDK_POLY_POINTS[FinalVar.SDK_MAX_OBJECT_LIST];
    
    public DEV_EVENT_CROSSREGION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
    		DetectRegion[i] = new SDK_POINT();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_TRACK_LINE_NUM; i++) {
    		TrackLine[i] = new SDK_POINT();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
    		stuObjectIDs[i] = new SDK_MSG_OBJECT();
    		stuTrackInfo[i] = new SDK_POLY_POINTS();
    	}
    }
}
