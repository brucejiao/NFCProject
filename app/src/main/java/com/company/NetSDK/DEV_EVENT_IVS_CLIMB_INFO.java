package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type  EVENT_IVS_CLIMBDETECTION(climb check)corresponding data block description info
 * \else
 * �¼����� EVENT_IVS_CLIMBDETECTION(�ʸ߼���¼�)��Ӧ���ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_IVS_CLIMB_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel ID
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
	 * event ID
	 * \else
	 * �¼�ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * Detected object
	 * \else
	 * ��⵽������
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();

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
	 * picture resolution
	 * \else
	 * ��ӦͼƬ�ķֱ���
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Acme amount of the rule detect zone
	 * \else
	 * �������߶�����
	 * \endif
	 */
	public int                 nDetectLineNum;

	/**
	 * \if ENGLISH_LANG
	 * Rule detect zone
	 * \else
	 * ��������
	 * \endif
	 */
	public SDK_POINT            DetectLine[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_LINE_NUM];

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
	 * event trigger accumilated times
	 * \else
	 * �¼������ۼƴ���
	 * \endif
	 */
	public int        nOccurrenceCount;
	
	public DEV_EVENT_IVS_CLIMB_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_DETECT_LINE_NUM; i++) {
			DetectLine[i] = new SDK_POINT();
    	}
	}
}
