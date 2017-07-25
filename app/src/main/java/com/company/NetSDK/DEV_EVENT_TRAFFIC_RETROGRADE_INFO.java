package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_TRAFFIC_RETROGRADE's data
 * \else
 * �¼�����EVENT_IVS_TRAFFIC_RETROGRADE(��ͨ-�����¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_TRAFFIC_RETROGRADE_INFO implements Serializable {
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
	 * Corresponding Lane number
	 * \else
	 * ��Ӧ������
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * have being detected object
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * vehicle info
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();

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
	 * snap index: such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * ��ʾץ����ţ���3,2,1,1��ʾץ�Ľ���,0��ʾ�쳣����
	 * \endif
	 */
	public int                 nSequence;

	/**
	 * \if ENGLISH_LANG
	 * speed, km/h
	 * \else
	 * ����ʵ���ٶ�,Km/h
	 * \endif
	 */
	public int                 nSpeed;

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
	 * flag(by bit),see NET_RESERVED_COMMON
	 * \else
	 * ץͼ��־(��λ)�������NET_RESERVED_COMMON
	 * \endif
	 */
	public int               dwSnapFlagMask;

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
	 * a corresponding alarm recording; false: no corresponding alarm recording
	 * \else
	 * rue:�ж�Ӧ�ı���¼��; false:�޶�Ӧ�ı���¼��
	 * \endif
	 */
	public boolean                bIsExistAlarmRecord;

	/**
	 * \if ENGLISH_LANG
	 * Video size
	 * \else
	 * ¼���С
	 * \endif
	 */
	public int               dwAlarmRecordSize;

	/**
	 * \if ENGLISH_LANG
	 * Video Path
	 * \else
	 * ¼��·��
	 * \endif
	 */
	public byte                szAlarmRecordPath[] = new byte[FinalVar.SDK_COMMON_STRING_256];

	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle info
	 * \else
	 * ��ͨ������Ϣ
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Acme amount of the rule detect zone
	 * \else
	 * ���������򶥵���
	 * \endif
	 */
	public int                 nDetectNum;

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
	 * public info
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public EVENT_COMM_INFO     stCommInfo = new EVENT_COMM_INFO();
	
	public DEV_EVENT_TRAFFIC_RETROGRADE_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
			DetectRegion[i] = new SDK_POINT();
		}
	}
}
