package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_TRAFFICJAM's data
 * \else
 * �¼�����EVENT_IVS_TRAFFICJAM(��ͨӵ���¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_TRAFFICJAM_INFO implements Serializable {
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
	 * Mean congestion length (percentage of total lane length) 0-100
	 * \else
	 * ��ʾӵ�³���(�ܳ������Ȱٷֱȣ�0-100
	 * \endif
	 */
	public byte                bJamLenght;

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
	 * the time of starting jam
	 * \else
	 * ��ʼͣ��ʱ��
	 * \endif
	 */
	public NET_TIME_EX         stuStartJamTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * snap index: such as 3,2,1,1 means the last one,0 means there has some exception and snap stop(this param work when bEventAction=2)
	 * \else
	 * ��ʾץ����ţ���3,2,1,1��ʾץ�Ľ���,0��ʾ�쳣����(bEventAction=2ʱ�˲�����Ч)
	 * \endif
	 */
	public int                 nSequence;

	/**
	 * \if ENGLISH_LANG
	 * interval time of alarm(s).(this is a continuous event,if the interval time of recieving next event go beyond this parm, we can judge that this event is over with exception)
	 * \else
	 * ����ʱ��������λ:�롣(���¼�Ϊ�������¼������յ���һ�����¼�֮�����ڳ������ʱ���δ�յ����¼��ĺ����¼�������Ϊ���¼��쳣������)
	 * \endif
	 */
	public int                 nAlarmIntervalTime;

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
	 * means actual jam length, unit is meter
	 * \else
	 * ��ʵ�ʵ�ӵ�³���,��λ��
	 * \endif
	 */
	public int                 nJamRealLength;

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
	 * public info
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public EVENT_COMM_INFO     stCommInfo = new EVENT_COMM_INFO();
}
