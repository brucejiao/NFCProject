package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_FACERECOGNITION's data
 * \else
 * �¼�����EVENT_IVS_FACERECOGNITION(����ʶ��)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_FACERECOGNITION_INFO implements Serializable {
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
	 * event ID
	 * \else
	 * �¼�ID
	 * \endif
	 */
    public int                 nEventID;
    
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
     * have being detected object
     * \else
     * ��⵽������
     * \endif
     */
    public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();
    
    /**
     * \if ENGLISH_LANG
     * candidate number
     * \else
     * ��ǰ����ƥ�䵽�ĺ�ѡ��������
     * \endif
     */
    public int                 nCandidateNum;
    
    /**
     * \if ENGLISH_LANG
     * candidate info
     * \else
     * ��ǰ����ƥ�䵽�ĺ�ѡ������Ϣ
     * \endif
     */
    public CANDIDATE_INFO      stuCandidates[] = new CANDIDATE_INFO[FinalVar.SDK_MAX_CANDIDATE_NUM];
    
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
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * ͼƬ�����, ͬһʱ����(��ȷ����)�����ж���ͼƬ, ��0��ʼ
     * \endif
     */
    public byte                byImageIndex;
    
    /**
     * \if ENGLISH_LANG
     * The existence panorama
     * \else
     * ȫ��ͼ�Ƿ����
     * \endif
     */
    public boolean                bGlobalScenePic;
    
    /**
     * \if ENGLISH_LANG
     * Panoramic Photos
     * \else
     * ȫ��ͼƬ��Ϣ
     * \endif
     */
    public SDK_PIC_INFO         stuGlobalScenePicInfo = new SDK_PIC_INFO();
    
    /**
     * \if ENGLISH_LANG
     * Snapshot current face aadevice address  
     * \else
     * ץ�ĵ�ǰ�������豸��ַ���磺����·37��
     * \endif
     */
    public byte                szSnapDevAddress[] = new byte[FinalVar.MAX_PATH];
    
    /**
     * \if ENGLISH_LANG
     * event trigger accumilated times 
     * \else
     * �¼������ۼƴ���
     * \endif
     */
    public int        nOccurrenceCount;
    
    public DEV_EVENT_FACERECOGNITION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_CANDIDATE_NUM; i++) {
    		stuCandidates[i] = new CANDIDATE_INFO();
    	}
    }
}
