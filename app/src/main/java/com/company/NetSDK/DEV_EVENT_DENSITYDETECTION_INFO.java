package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type EVENT_IVS_DENSITYDETECTION(Population amount detect) corresponding data block description info
 * \else
 * �¼�����EVENT_IVS_DENSITYDETECTION(��Ա�ܶȼ��)��Ӧ���ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_DENSITYDETECTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * �¼�����
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Time stamp(ms)
	 * \else
	 * ʱ���(��λ�Ǻ���)
	 * \endif
	 */
    public double              PTS;
    
    /**
	 * \if ENGLISH_LANG
	 * Event occurred time
	 * \else
	 * �¼�������ʱ��
	 * \endif
	 */
    public NET_TIME_EX         UTC = new NET_TIME_EX();
    
    /**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * �¼�ID
	 * \endif
	 */
    public int                 nEventID;
    
    /**
	 * \if ENGLISH_LANG
	 * Detected object amount
	 * \else
	 * ��⵽���������
	 * \endif
	 */
    public int                 nObjectNum;
    
    /**
	 * \if ENGLISH_LANG
	 * Detected object list
	 * \else
	 * ��⵽�������б�
	 * \endif
	 */
    public SDK_MSG_OBJECT       stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];
    
    /**
	 * \if ENGLISH_LANG
	 * The corresponding file info of the event
	 * \else
	 * �¼���Ӧ�ļ���Ϣ
	 * \endif
	 */
    public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();
    
    /**
	 * \if ENGLISH_LANG
	 * Event operation.0=pulse event,1=begin of the durative event,2=end of the durative event;
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
	 * Acme amount of the rule detect zone
	 * \else
	 * ���������򶥵���
	 * \endif
	 */
    public int                 nDetectRegionNum;
    
    /**
	 * \if ENGLISH_LANG
	 * Rule detect zone
	 * \else
	 * ����������
	 * \endif
	 */
    public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Snap flag(by bit).please refer to NET_RESERVED_COMMON
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
    public int        nOccurrenceCount;
    
    public DEV_EVENT_DENSITYDETECTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
    		stuObjectIDs[i] = new SDK_MSG_OBJECT();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
    		DetectRegion[i] = new SDK_POINT();
    	}
    }
}
