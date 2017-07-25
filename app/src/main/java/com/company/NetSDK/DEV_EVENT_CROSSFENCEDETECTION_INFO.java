package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_CROSSFENCEDETECTION's data
 * \else
 * �¼�����EVENT_IVS_CROSSFENCEDETECTION(��ԽΧ���¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_CROSSFENCEDETECTION_INFO implements Serializable {
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
     * Upstairs Line Point Number
     * \else
     * Χ���ϱ��߶�����
     * \endif
     */
    public int                 nUpstairsLinePointNumber;
    
    /**
     * \if ENGLISH_LANG
     * Upstairs Line info
     * \else
     * Χ���ϱ�����Ϣ
     * \endif
     */
    public SDK_POINT            stuUpstairsLine[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_LINE_NUM];
    
    /**
     * \if ENGLISH_LANG
     * Downstairs Line Point Number
     * \else
     * Χ���±��߶�����
     * \endif
     */
    public int                 nDownstairsLinePointNumber;
    
    /**
     * \if ENGLISH_LANG
     * Downstairs Line info
     * \else
     * Χ���±�����Ϣ
     * \endif
     */
    public SDK_POINT            stuDownstairsLine[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_LINE_NUM];
    
    /**
     * \if ENGLISH_LANG
     * track line point number     
     * \else
     * �����˶��켣������
     * \endif
     */
    public int                 nTrackLineNum;
    
    /**
     * \if ENGLISH_LANG
     * track line info
     * \else
     * �����˶��켣
     * \endif
     */
    public SDK_POINT            TrackLine[] = new SDK_POINT[FinalVar.SDK_MAX_TRACK_LINE_NUM];
    
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
     * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
     * \else
     * �¼�������0��ʾ�����¼�,1��ʾ�������¼���ʼ,2��ʾ�������¼�����;
     * \endif
     */
    public byte                bEventAction;
    
    /**
     * \if ENGLISH_LANG
     * direction, 0-left to right, 1-right to left
     * \else
     * ��ʾ���ַ���, 0-��������, 1-��������
     * \endif
     */
    public byte                bDirection;
    
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
     * event trigger accumilated times 
     * \else
     * �¼������ۼƴ���
     * \endif
     */
    public int                 nOccurrenceCount;
    
    public DEV_EVENT_CROSSFENCEDETECTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_LINE_NUM; i++) {
    		stuUpstairsLine[i] = new SDK_POINT();
    		stuDownstairsLine[i] = new SDK_POINT();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_TRACK_LINE_NUM; i++) {
    		TrackLine[i] = new SDK_POINT();
    	}
    }
}
